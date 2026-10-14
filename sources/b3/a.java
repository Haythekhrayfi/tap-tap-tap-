package b3;

import ch.qos.logback.core.CoreConstants;
import i.f;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f3248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f3249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f3250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f3251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3254i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Writer f3256k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3258m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3255j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap<String, d> f3257l = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3259n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ThreadPoolExecutor f3260o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable<Void> f3261p = new CallableC0053a();

    /* JADX INFO: renamed from: b3.a$a, reason: collision with other inner class name */
    public class CallableC0053a implements Callable<Void> {
        public CallableC0053a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f3256k != null) {
                    aVar.p();
                    if (a.this.h()) {
                        a.this.m();
                        a.this.f3258m = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public b(CallableC0053a callableC0053a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f3263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f3264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3265c;

        public c(d dVar, CallableC0053a callableC0053a) {
            this.f3263a = dVar;
            this.f3264b = dVar.f3271e ? null : new boolean[a.this.f3254i];
        }

        public void a() throws IOException {
            a.a(a.this, this, false);
        }

        public File b(int i10) throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.f3263a;
                if (dVar.f3272f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f3271e) {
                    this.f3264b[i10] = true;
                }
                file = dVar.f3270d[i10];
                if (!a.this.f3248c.exists()) {
                    a.this.f3248c.mkdirs();
                }
            }
            return file;
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f3268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File[] f3269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File[] f3270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f3272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f3273g;

        public d(String str, CallableC0053a callableC0053a) {
            this.f3267a = str;
            int i10 = a.this.f3254i;
            this.f3268b = new long[i10];
            this.f3269c = new File[i10];
            this.f3270d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(CoreConstants.DOT);
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f3254i; i11++) {
                sb2.append(i11);
                this.f3269c[i11] = new File(a.this.f3248c, sb2.toString());
                sb2.append(".tmp");
                this.f3270d[i11] = new File(a.this.f3248c, sb2.toString());
                sb2.setLength(length);
            }
        }

        public String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f3268b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException b(String[] strArr) throws IOException {
            StringBuilder sbA = defpackage.a.a("unexpected journal line: ");
            sbA.append(Arrays.toString(strArr));
            throw new IOException(sbA.toString());
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File[] f3275a;

        public e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0053a callableC0053a) {
            this.f3275a = fileArr;
        }
    }

    public a(File file, int i10, int i11, long j10) {
        this.f3248c = file;
        this.f3252g = i10;
        this.f3249d = new File(file, "journal");
        this.f3250e = new File(file, "journal.tmp");
        this.f3251f = new File(file, "journal.bkp");
        this.f3254i = i11;
        this.f3253h = j10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004f A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0072 A[SYNTHETIC] */
    public static void a(a aVar, c cVar, boolean z10) throws IOException {
        File file;
        synchronized (aVar) {
            d dVar = cVar.f3263a;
            if (dVar.f3272f != cVar) {
                throw new IllegalStateException();
            }
            if (!z10 || dVar.f3271e) {
                for (int i10 = 0; i10 < aVar.f3254i; i10++) {
                    file = dVar.f3270d[i10];
                    if (z10) {
                        c(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f3269c[i10];
                        file.renameTo(file2);
                        long j10 = dVar.f3268b[i10];
                        long length = file2.length();
                        dVar.f3268b[i10] = length;
                        aVar.f3255j = (aVar.f3255j - j10) + length;
                    }
                }
                aVar.f3258m++;
                dVar.f3272f = null;
                if (dVar.f3271e || z10) {
                    dVar.f3271e = true;
                    aVar.f3256k.append((CharSequence) "CLEAN");
                    aVar.f3256k.append(' ');
                    aVar.f3256k.append((CharSequence) dVar.f3267a);
                    aVar.f3256k.append((CharSequence) dVar.a());
                    aVar.f3256k.append('\n');
                    if (z10) {
                        long j11 = aVar.f3259n;
                        aVar.f3259n = 1 + j11;
                        dVar.f3273g = j11;
                    }
                } else {
                    aVar.f3257l.remove(dVar.f3267a);
                    aVar.f3256k.append((CharSequence) "REMOVE");
                    aVar.f3256k.append(' ');
                    aVar.f3256k.append((CharSequence) dVar.f3267a);
                    aVar.f3256k.append('\n');
                }
                aVar.f3256k.flush();
                if (aVar.f3255j <= aVar.f3253h || aVar.h()) {
                    aVar.f3260o.submit(aVar.f3261p);
                }
            } else {
                for (int i11 = 0; i11 < aVar.f3254i; i11++) {
                    if (!cVar.f3264b[i11]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!dVar.f3270d[i11].exists()) {
                        cVar.a();
                    }
                }
                while (i10 < aVar.f3254i) {
                    file = dVar.f3270d[i10];
                    if (z10) {
                        c(file);
                    } else if (file.exists()) {
                        File file3 = dVar.f3269c[i10];
                        file.renameTo(file3);
                        long j12 = dVar.f3268b[i10];
                        long length2 = file3.length();
                        dVar.f3268b[i10] = length2;
                        aVar.f3255j = (aVar.f3255j - j12) + length2;
                    }
                }
                aVar.f3258m++;
                dVar.f3272f = null;
                if (dVar.f3271e || z10) {
                    dVar.f3271e = true;
                    aVar.f3256k.append((CharSequence) "CLEAN");
                    aVar.f3256k.append(' ');
                    aVar.f3256k.append((CharSequence) dVar.f3267a);
                    aVar.f3256k.append((CharSequence) dVar.a());
                    aVar.f3256k.append('\n');
                    if (z10) {
                        long j13 = aVar.f3259n;
                        aVar.f3259n = 1 + j13;
                        dVar.f3273g = j13;
                    }
                } else {
                    aVar.f3257l.remove(dVar.f3267a);
                    aVar.f3256k.append((CharSequence) "REMOVE");
                    aVar.f3256k.append(' ');
                    aVar.f3256k.append((CharSequence) dVar.f3267a);
                    aVar.f3256k.append('\n');
                }
                aVar.f3256k.flush();
                if (aVar.f3255j <= aVar.f3253h) {
                    aVar.f3260o.submit(aVar.f3261p);
                } else {
                    aVar.f3260o.submit(aVar.f3261p);
                }
            }
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static a i(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                n(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f3249d.exists()) {
            try {
                aVar.k();
                aVar.j();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.close();
                b3.c.a(aVar.f3248c);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.m();
        return aVar2;
    }

    public static void n(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void b() {
        if (this.f3256k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f3256k == null) {
            return;
        }
        Iterator it = new ArrayList(this.f3257l.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f3272f;
            if (cVar != null) {
                cVar.a();
            }
        }
        p();
        this.f3256k.close();
        this.f3256k = null;
    }

    public c e(String str) throws IOException {
        synchronized (this) {
            b();
            d dVar = this.f3257l.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.f3257l.put(str, dVar);
            } else if (dVar.f3272f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f3272f = cVar;
            this.f3256k.append((CharSequence) "DIRTY");
            this.f3256k.append(' ');
            this.f3256k.append((CharSequence) str);
            this.f3256k.append('\n');
            this.f3256k.flush();
            return cVar;
        }
    }

    public synchronized e g(String str) throws IOException {
        b();
        d dVar = this.f3257l.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f3271e) {
            return null;
        }
        for (File file : dVar.f3269c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f3258m++;
        this.f3256k.append((CharSequence) "READ");
        this.f3256k.append(' ');
        this.f3256k.append((CharSequence) str);
        this.f3256k.append('\n');
        if (h()) {
            this.f3260o.submit(this.f3261p);
        }
        return new e(this, str, dVar.f3273g, dVar.f3269c, dVar.f3268b, null);
    }

    public final boolean h() {
        int i10 = this.f3258m;
        return i10 >= 2000 && i10 >= this.f3257l.size();
    }

    public final void j() throws IOException {
        c(this.f3250e);
        Iterator<d> it = this.f3257l.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f3272f == null) {
                while (i10 < this.f3254i) {
                    this.f3255j += next.f3268b[i10];
                    i10++;
                }
            } else {
                next.f3272f = null;
                while (i10 < this.f3254i) {
                    c(next.f3269c[i10]);
                    c(next.f3270d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void k() throws IOException {
        b3.b bVar = new b3.b(new FileInputStream(this.f3249d), b3.c.f3282a);
        try {
            String strB = bVar.b();
            String strB2 = bVar.b();
            String strB3 = bVar.b();
            String strB4 = bVar.b();
            String strB5 = bVar.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.f3252g).equals(strB3) || !Integer.toString(this.f3254i).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    l(bVar.b());
                    i10++;
                } catch (EOFException unused) {
                    this.f3258m = i10 - this.f3257l.size();
                    if (bVar.f3280g == -1) {
                        m();
                    } else {
                        this.f3256k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3249d, true), b3.c.f3282a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void l(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException(f.a("unexpected journal line: ", str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f3257l.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f3257l.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring, null);
            this.f3257l.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f3272f = new c(dVar, null);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(f.a("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f3271e = true;
        dVar.f3272f = null;
        if (strArrSplit.length != a.this.f3254i) {
            dVar.b(strArrSplit);
            throw null;
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                dVar.f3268b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                dVar.b(strArrSplit);
                throw null;
            }
        }
    }

    public final synchronized void m() throws IOException {
        Writer writer = this.f3256k;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3250e), b3.c.f3282a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3252g));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3254i));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f3257l.values()) {
                bufferedWriter.write(dVar.f3272f != null ? "DIRTY " + dVar.f3267a + '\n' : "CLEAN " + dVar.f3267a + dVar.a() + '\n');
            }
            bufferedWriter.close();
            if (this.f3249d.exists()) {
                n(this.f3249d, this.f3251f, true);
            }
            n(this.f3250e, this.f3249d, false);
            this.f3251f.delete();
            this.f3256k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3249d, true), b3.c.f3282a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final void p() throws IOException {
        while (this.f3255j > this.f3253h) {
            String key = this.f3257l.entrySet().iterator().next().getKey();
            synchronized (this) {
                b();
                d dVar = this.f3257l.get(key);
                if (dVar != null && dVar.f3272f == null) {
                    for (int i10 = 0; i10 < this.f3254i; i10++) {
                        File file = dVar.f3269c[i10];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j10 = this.f3255j;
                        long[] jArr = dVar.f3268b;
                        this.f3255j = j10 - jArr[i10];
                        jArr[i10] = 0;
                    }
                    this.f3258m++;
                    this.f3256k.append((CharSequence) "REMOVE");
                    this.f3256k.append(' ');
                    this.f3256k.append((CharSequence) key);
                    this.f3256k.append('\n');
                    this.f3257l.remove(key);
                    if (h()) {
                        this.f3260o.submit(this.f3261p);
                    }
                }
            }
        }
    }
}
