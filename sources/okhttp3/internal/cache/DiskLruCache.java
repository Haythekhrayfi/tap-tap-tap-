package okhttp3.internal.cache;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import defpackage.a;
import ed.f;
import ed.q;
import ed.u;
import fd.j0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import jc.c;
import l8.a1;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import qd.a0;
import qd.b;
import qd.e;
import qd.j;
import qd.o;
import qd.y;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private e journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final f LEGAL_KEY_PATTERN = new f("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        public final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            j0.i(diskLruCache, "this$0");
            j0.i(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (j0.d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                    diskLruCache.completeEdit$okhttp(this, false);
                }
                this.done = true;
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (j0.d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.done = true;
            }
        }

        public final void detach$okhttp() throws IOException {
            if (j0.d(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final y newSink(int i10) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!j0.d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                    return new b();
                }
                if (!getEntry$okhttp().getReadable$okhttp()) {
                    boolean[] written$okhttp = getWritten$okhttp();
                    j0.f(written$okhttp);
                    written$okhttp[i10] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(getEntry$okhttp().getDirtyFiles$okhttp().get(i10)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return new b();
                }
            }
        }

        public final a0 newSource(int i10) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                a0 a0VarSource = null;
                if (!getEntry$okhttp().getReadable$okhttp() || !j0.d(getEntry$okhttp().getCurrentEditor$okhttp(), this) || getEntry$okhttp().getZombie$okhttp()) {
                    return null;
                }
                try {
                    a0VarSource = diskLruCache.getFileSystem$okhttp().source(getEntry$okhttp().getCleanFiles$okhttp().get(i10));
                } catch (FileNotFoundException unused) {
                }
                return a0VarSource;
            }
        }
    }

    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        public final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            j0.i(diskLruCache, "this$0");
            j0.i(str, Action.KEY_ATTRIBUTE);
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(CoreConstants.DOT);
            int length = sb2.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                sb2.append(i10);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException(j0.p("unexpected journal line: ", list));
        }

        private final a0 newSource(int i10) throws FileNotFoundException {
            final a0 a0VarSource = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i10));
            if (this.this$0.civilizedFileSystem) {
                return a0VarSource;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new j(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;
                public final /* synthetic */ DiskLruCache this$0;
                public final /* synthetic */ DiskLruCache.Entry this$1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.$fileSource);
                    this.this$0 = diskLruCache;
                    this.this$1 = this;
                }

                @Override // qd.j, qd.a0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = this.this$0;
                    DiskLruCache.Entry entry = this.this$1;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            j0.i(list, "strings");
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                throw new c();
            }
            int i10 = 0;
            try {
                int size = list.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    this.lengths[i10] = Long.parseLong(list.get(i10));
                    i10 = i11;
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                throw new c();
            }
        }

        public final void setLockingSourceCount$okhttp(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void setReadable$okhttp(boolean z10) {
            this.readable = z10;
        }

        public final void setSequenceNumber$okhttp(long j10) {
            this.sequenceNumber = j10;
        }

        public final void setZombie$okhttp(boolean z10) {
            this.zombie = z10;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sbA = a.a("Thread ");
                sbA.append((Object) Thread.currentThread().getName());
                sbA.append(" MUST hold lock on ");
                sbA.append(diskLruCache);
                throw new AssertionError(sbA.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                    arrayList.add(newSource(i10));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((a0) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(e eVar) throws IOException {
            j0.i(eVar, "writer");
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i10 = 0;
            while (i10 < length) {
                long j10 = jArr[i10];
                i10++;
                eVar.z(32).X(j10);
            }
        }
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<a0> sources;
        public final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j10, List<? extends a0> list, long[] jArr) {
            j0.i(diskLruCache, "this$0");
            j0.i(str, Action.KEY_ATTRIBUTE);
            j0.i(list, "sources");
            j0.i(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j10;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<a0> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i10) {
            return this.lengths[i10];
        }

        public final a0 getSource(int i10) {
            return this.sources.get(i10);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<Snapshot>, wc.a {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        public AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            j0.h(it, "ArrayList(lruEntries.values).iterator()");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextSnapshot != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    Snapshot snapshotSnapshot$okhttp = next == null ? null : next.snapshot$okhttp();
                    if (snapshotSnapshot$okhttp != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            j0.f(snapshot);
            return snapshot;
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.key());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i10, int i11, long j10, TaskRunner taskRunner) {
        j0.i(fileSystem, "fileSystem");
        j0.i(file, "directory");
        j0.i(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i10;
        this.valueCount = i11;
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String strP = j0.p(Util.okHttpName, " Cache");
        this.cleanupTask = new Task(strP) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!diskLruCache.initialized || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (diskLruCache.journalRebuildRequired()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = o.b(new b());
                    }
                    return -1L;
                }
            }
        };
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    private final e newJournalWriter() throws FileNotFoundException {
        return o.b(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            j0.h(next, "i.next()");
            Entry entry = next;
            int i10 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += entry.getLengths$okhttp()[i10];
                    i10++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i10));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        qd.f fVarC = o.c(this.fileSystem.source(this.journalFile));
        try {
            String strM = fVarC.M();
            String strM2 = fVarC.M();
            String strM3 = fVarC.M();
            String strM4 = fVarC.M();
            String strM5 = fVarC.M();
            if (j0.d(MAGIC, strM) && j0.d(VERSION_1, strM2) && j0.d(String.valueOf(this.appVersion), strM3) && j0.d(String.valueOf(getValueCount$okhttp()), strM4)) {
                int i10 = 0;
                if (!(strM5.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(fVarC.M());
                            i10++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i10 - getLruEntries$okhttp().size();
                            if (fVarC.y()) {
                                this.journalWriter = newJournalWriter();
                            } else {
                                rebuildJournal$okhttp();
                            }
                            c0.g(fVarC, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM4 + ", " + strM5 + ']');
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarC, th);
                throw th2;
            }
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iD = u.D(str, ' ', 0, false, 6);
        if (iD == -1) {
            throw new IOException(j0.p("unexpected journal line: ", str));
        }
        int i10 = iD + 1;
        int iD2 = u.D(str, ' ', i10, false, 4);
        if (iD2 == -1) {
            strSubstring = str.substring(i10);
            j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = REMOVE;
            if (iD == str2.length() && q.u(str, str2, false, 2)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iD2);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iD2 != -1) {
            String str3 = CLEAN;
            if (iD == str3.length() && q.u(str, str3, false, 2)) {
                String strSubstring2 = str.substring(iD2 + 1);
                j0.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listQ = u.Q(strSubstring2, new char[]{' '}, false, 0, 6);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listQ);
                return;
            }
        }
        if (iD2 == -1) {
            String str4 = DIRTY;
            if (iD == str4.length() && q.u(str, str4, false, 2)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iD2 == -1) {
            String str5 = READ;
            if (iD == str5.length() && q.u(str, str5, false, 2)) {
                return;
            }
        }
        throw new IOException(j0.p("unexpected journal line: ", str));
    }

    private final boolean removeOldestEntry() throws IOException {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.a(str)) {
            throw new IllegalArgumentException(a1.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, CoreConstants.DOUBLE_QUOTE_CHAR).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor$okhttp;
        if (this.initialized && !this.closed) {
            Collection<Entry> collectionValues = this.lruEntries.values();
            j0.h(collectionValues, "lruEntries.values");
            int i10 = 0;
            Object[] array = collectionValues.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            while (i10 < length) {
                Entry entry = entryArr[i10];
                i10++;
                if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                    currentEditor$okhttp.detach$okhttp();
                }
            }
            trimToSize();
            e eVar = this.journalWriter;
            j0.f(eVar);
            eVar.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z10) throws IOException {
        j0.i(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!j0.d(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i10 = 0;
        if (z10 && !entry$okhttp.getReadable$okhttp()) {
            int i11 = this.valueCount;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                boolean[] written$okhttp = editor.getWritten$okhttp();
                j0.f(written$okhttp);
                if (!written$okhttp[i12]) {
                    editor.abort();
                    throw new IllegalStateException(j0.p("Newly created entry didn't create value for index ", Integer.valueOf(i12)));
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i12))) {
                    editor.abort();
                    return;
                }
                i12 = i13;
            }
        }
        int i14 = this.valueCount;
        while (i10 < i14) {
            int i15 = i10 + 1;
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i10);
            if (!z10 || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i10);
                this.fileSystem.rename(file, file2);
                long j10 = entry$okhttp.getLengths$okhttp()[i10];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i10] = size;
                this.size = (this.size - j10) + size;
            }
            i10 = i15;
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        e eVar = this.journalWriter;
        j0.f(eVar);
        if (entry$okhttp.getReadable$okhttp() || z10) {
            entry$okhttp.setReadable$okhttp(true);
            eVar.E(CLEAN).z(32);
            eVar.E(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(eVar);
            eVar.z(10);
            if (z10) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry$okhttp.setSequenceNumber$okhttp(j11);
            }
        } else {
            getLruEntries$okhttp().remove(entry$okhttp.getKey$okhttp());
            eVar.E(REMOVE).z(32);
            eVar.E(entry$okhttp.getKey$okhttp());
            eVar.z(10);
        }
        eVar.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized Editor edit(String str, long j10) throws IOException {
        j0.i(str, Action.KEY_ATTRIBUTE);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j10 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j10)) {
            return null;
        }
        if ((entry == null ? null : entry.getCurrentEditor$okhttp()) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            e eVar = this.journalWriter;
            j0.f(eVar);
            eVar.E(DIRTY).z(32).E(str).z(10);
            eVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> collectionValues = this.lruEntries.values();
        j0.h(collectionValues, "lruEntries.values");
        Object[] array = collectionValues.toArray(new Entry[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Entry[] entryArr = (Entry[]) array;
        int length = entryArr.length;
        int i10 = 0;
        while (i10 < length) {
            Entry entry = entryArr[i10];
            i10++;
            j0.h(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            e eVar = this.journalWriter;
            j0.f(eVar);
            eVar.flush();
        }
    }

    public final synchronized Snapshot get(String str) throws IOException {
        j0.i(str, Action.KEY_ATTRIBUTE);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        e eVar = this.journalWriter;
        j0.f(eVar);
        eVar.E(READ).z(32).E(str).z(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e10) {
                Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", 5, e10);
                try {
                    delete();
                    this.closed = false;
                    rebuildJournal$okhttp();
                    this.initialized = true;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        e eVar = this.journalWriter;
        if (eVar != null) {
            eVar.close();
        }
        e eVarB = o.b(this.fileSystem.sink(this.journalFileTmp));
        try {
            eVarB.E(MAGIC);
            eVarB.z(10);
            eVarB.E(VERSION_1);
            eVarB.z(10);
            eVarB.X(this.appVersion);
            eVarB.z(10);
            eVarB.X(getValueCount$okhttp());
            eVarB.z(10);
            eVarB.z(10);
            for (Entry entry : getLruEntries$okhttp().values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    eVarB.E(DIRTY);
                    eVarB.z(32);
                    eVarB.E(entry.getKey$okhttp());
                } else {
                    eVarB.E(CLEAN);
                    eVarB.z(32);
                    eVarB.E(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(eVarB);
                }
                eVarB.z(10);
            }
            c0.g(eVarB, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(eVarB, th);
                throw th2;
            }
        }
    }

    public final synchronized boolean remove(String str) throws IOException {
        j0.i(str, Action.KEY_ATTRIBUTE);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        e eVar;
        j0.i(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (eVar = this.journalWriter) != null) {
                eVar.E(DIRTY);
                eVar.z(32);
                eVar.E(entry.getKey$okhttp());
                eVar.z(10);
                eVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i11));
            this.size -= entry.getLengths$okhttp()[i11];
            entry.getLengths$okhttp()[i11] = 0;
        }
        this.redundantOpCount++;
        e eVar2 = this.journalWriter;
        if (eVar2 != null) {
            eVar2.E(REMOVE);
            eVar2.z(32);
            eVar2.E(entry.getKey$okhttp());
            eVar2.z(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z10) {
        this.closed = z10;
    }

    public final synchronized void setMaxSize(long j10) {
        this.maxSize = j10;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
