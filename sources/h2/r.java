package h2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30547e = x1.m.e("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f30548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, c> f30549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, b> f30550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30551d;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30552c = 0;

        public a(r rVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sbA = defpackage.a.a("WorkManager-WorkTimer-thread-");
            sbA.append(this.f30552c);
            threadNewThread.setName(sbA.toString());
            this.f30552c++;
            return threadNewThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f30553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f30554d;

        public c(r rVar, String str) {
            this.f30553c = rVar;
            this.f30554d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f30553c.f30551d) {
                if (this.f30553c.f30549b.remove(this.f30554d) != null) {
                    b bVarRemove = this.f30553c.f30550c.remove(this.f30554d);
                    if (bVarRemove != null) {
                        bVarRemove.a(this.f30554d);
                    }
                } else {
                    x1.m.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f30554d), new Throwable[0]);
                }
            }
        }
    }

    public r() {
        a aVar = new a(this);
        this.f30549b = new HashMap();
        this.f30550c = new HashMap();
        this.f30551d = new Object();
        this.f30548a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a(String str, long j10, b bVar) {
        synchronized (this.f30551d) {
            x1.m.c().a(f30547e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f30549b.put(str, cVar);
            this.f30550c.put(str, bVar);
            this.f30548a.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void b(String str) {
        synchronized (this.f30551d) {
            if (this.f30549b.remove(str) != null) {
                x1.m.c().a(f30547e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f30550c.remove(str);
            }
        }
    }
}
