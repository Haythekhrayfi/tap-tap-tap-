package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import w2.c;
import w2.f;
import w2.h;

/* JADX INFO: loaded from: classes.dex */
public class TimeBasedArchiveRemover extends ContextAwareBase implements ArchiveRemover {
    private final w2.a dateParser;
    public final FileNamePattern fileNamePattern;
    private final FileProvider fileProvider;
    private final c fileSorter;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private final RollingCalendar f3726rc;
    private int maxHistory = 0;
    private long totalSizeCap = 0;

    public class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Date f3727a;

        public a(Date date) {
            this.f3727a = date;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return TimeBasedArchiveRemover.this.f3726rc.normalizeDate(TimeBasedArchiveRemover.this.dateParser.a(str)).compareTo(TimeBasedArchiveRemover.this.f3726rc.normalizeDate(TimeBasedArchiveRemover.this.f3726rc.getEndOfNextNthPeriod(this.f3727a, -TimeBasedArchiveRemover.this.maxHistory))) < 0;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Date f3729c;

        public b(Date date) {
            this.f3729c = date;
        }

        @Override // java.lang.Runnable
        public void run() {
            TimeBasedArchiveRemover.this.clean(this.f3729c);
        }
    }

    public TimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar, FileProvider fileProvider) {
        this.fileNamePattern = fileNamePattern;
        this.f3726rc = rollingCalendar;
        this.fileProvider = fileProvider;
        w2.a aVar = new w2.a(fileNamePattern);
        this.dateParser = aVar;
        this.fileSorter = new c(aVar, new f(fileNamePattern));
    }

    private void capTotalSize(List<String> list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        c cVar = this.fileSorter;
        Objects.requireNonNull(cVar);
        Arrays.sort(strArr, new w2.b(cVar));
        long j10 = 0;
        long j11 = 0;
        for (String str : strArr) {
            File file = new File(str);
            long length = this.fileProvider.length(file);
            if (j11 + length > this.totalSizeCap) {
                addInfo("Deleting [" + file + "] of size " + new FileSize(length));
                if (!delete(file)) {
                    length = 0;
                }
                j10 += length;
            }
            j11 += length;
        }
        StringBuilder sbA = defpackage.a.a("Removed  ");
        sbA.append(new FileSize(j10));
        sbA.append(" of files");
        addInfo(sbA.toString());
    }

    private FilenameFilter createExpiredFileFilter(Date date) {
        return new a(date);
    }

    private boolean delete(File file) {
        addInfo("deleting " + file);
        boolean zDeleteFile = this.fileProvider.deleteFile(file);
        if (!zDeleteFile) {
            addWarn("cannot delete " + file);
        }
        return zDeleteFile;
    }

    private List<String> filterFiles(List<String> list, FilenameFilter filenameFilter) {
        ArrayList arrayList = new ArrayList();
        for (String str : (String[]) list.toArray(new String[0])) {
            if (filenameFilter.accept(null, str)) {
                arrayList.add(str);
                list.remove(str);
            }
        }
        return arrayList;
    }

    private List<String> findEmptyDirs() {
        g6.c cVar = new g6.c(this.fileProvider);
        List<h> listG = cVar.g(this.fileNamePattern.toRegex());
        h hVar = (h) ((ArrayList) listG).get(0);
        ArrayList arrayList = new ArrayList();
        cVar.a(hVar.a((FileProvider) cVar.f30015b), listG, 1, arrayList);
        List<String> listH = cVar.h(arrayList);
        Collections.reverse(listH);
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : (ArrayList) listH) {
            int length = this.fileProvider.list(new File(str), null).length;
            if (length == 0 || (length == 1 && arrayDeque.size() > 0 && str.equals(arrayDeque.peekLast()))) {
                arrayDeque.add(str);
            }
        }
        return Arrays.asList(arrayDeque.toArray(new String[0]));
    }

    private List<String> findFiles() {
        g6.c cVar = new g6.c(this.fileProvider);
        List<h> listG = cVar.g(this.fileNamePattern.toRegex());
        return cVar.h(cVar.b(((h) ((ArrayList) listG).get(0)).a((FileProvider) cVar.f30015b), listG, 1));
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void clean(Date date) {
        List<String> listFindFiles = findFiles();
        Iterator<String> it = filterFiles(listFindFiles, createExpiredFileFilter(date)).iterator();
        while (it.hasNext()) {
            delete(new File(it.next()));
        }
        long j10 = this.totalSizeCap;
        if (j10 != 0 && j10 > 0) {
            capTotalSize(listFindFiles);
        }
        Iterator<String> it2 = findEmptyDirs().iterator();
        while (it2.hasNext()) {
            delete(new File(it2.next()));
        }
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public Future<?> cleanAsynchronously(Date date) {
        return this.context.getScheduledExecutorService().submit(new b(date));
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setMaxHistory(int i10) {
        this.maxHistory = i10;
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setTotalSizeCap(long j10) {
        this.totalSizeCap = j10;
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }
}
