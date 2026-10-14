package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f10598a = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f10599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f10600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f10601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f10602e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10605h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<d> f10603f = new ArrayList(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f10604g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f10606i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<String> f10607j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10608k = -1;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f10614c = new AtomicInteger(1);

        public a(String str) {
            this.f10613b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sbA = defpackage.a.a("AppLovinSdk:");
            sbA.append(this.f10613b);
            sbA.append("-");
            sbA.append(this.f10614c.getAndIncrement());
            Thread thread = new Thread(runnable, sbA.toString());
            thread.setDaemon(true);
            thread.setPriority(((Integer) r.this.f10599b.a(com.applovin.impl.sdk.c.b.gE)).intValue());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.r.a.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    r.this.f10599b.F();
                    if (com.applovin.impl.sdk.y.a()) {
                        r.this.f10599b.F().b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    public enum b {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_NATIVE,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_APP_OPEN,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    public class c implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10638b;

        public c(String str) {
            this.f10638b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sbA = defpackage.a.a("AppLovinSdk:");
            sbA.append(this.f10638b);
            Thread thread = new Thread(runnable, sbA.toString());
            thread.setDaemon(true);
            thread.setPriority(((Integer) r.this.f10599b.a(com.applovin.impl.sdk.c.b.gE)).intValue());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.r.c.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    com.applovin.impl.sdk.y unused = r.this.f10600c;
                    if (com.applovin.impl.sdk.y.a()) {
                        r.this.f10600c.b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f10640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.y f10642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.applovin.impl.sdk.e.d f10643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f10644e;

        public d(com.applovin.impl.sdk.o oVar, com.applovin.impl.sdk.e.d dVar, b bVar) {
            this.f10640a = oVar;
            this.f10642c = oVar.F();
            this.f10641b = dVar.e();
            this.f10643d = dVar;
            this.f10644e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.y yVar;
            String str;
            StringBuilder sb2;
            try {
                com.applovin.impl.sdk.utils.h.a();
                if (!this.f10640a.c() || this.f10643d.g()) {
                    this.f10643d.run();
                } else {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10642c.c(this.f10641b, "Task re-scheduled...");
                    }
                    this.f10640a.G().a(this.f10643d, this.f10644e, 2000L);
                }
                if (com.applovin.impl.sdk.y.a()) {
                    yVar = this.f10642c;
                    str = this.f10641b;
                    sb2 = new StringBuilder();
                    sb2.append(this.f10644e);
                    sb2.append(" queue finished task ");
                    sb2.append(this.f10643d.e());
                    yVar.c(str, sb2.toString());
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10642c.b(this.f10641b, "Task failed execution", th);
                    }
                    this.f10643d.a(th);
                    if (!com.applovin.impl.sdk.y.a()) {
                        return;
                    }
                    yVar = this.f10642c;
                    str = this.f10641b;
                    sb2 = new StringBuilder();
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10642c.c(this.f10641b, this.f10644e + " queue finished task " + this.f10643d.e());
                    }
                    throw th2;
                }
            }
        }
    }

    public r(com.applovin.impl.sdk.o oVar) {
        this.f10599b = oVar;
        this.f10600c = oVar.F();
        this.f10601d = b("auxiliary_operations", ((Integer) oVar.a(com.applovin.impl.sdk.c.b.cv)).intValue());
        this.f10602e = b("shared_thread_pool", ((Integer) oVar.a(com.applovin.impl.sdk.c.b.at)).intValue());
    }

    private void a(final Runnable runnable, long j10, boolean z10) {
        if (j10 <= 0) {
            this.f10602e.submit(runnable);
        } else if (z10) {
            com.applovin.impl.sdk.utils.f.a(j10, this.f10599b, new Runnable() { // from class: com.applovin.impl.sdk.e.r.1
                @Override // java.lang.Runnable
                public void run() {
                    r.this.f10602e.execute(runnable);
                }
            });
        } else {
            this.f10602e.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        }
    }

    private boolean a(d dVar) {
        if (dVar.f10643d.g()) {
            return false;
        }
        synchronized (this.f10604g) {
            if (this.f10605h) {
                return false;
            }
            this.f10603f.add(dVar);
            return true;
        }
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.applovin.impl.sdk.utils.f.a(this.f10608k, this.f10599b, new Runnable() { // from class: com.applovin.impl.sdk.e.r.2
            @Override // java.lang.Runnable
            public void run() {
                for (Thread thread : Thread.getAllStackTraces().keySet()) {
                    if (thread.getPriority() > 1 && StringUtils.startsWithAtLeastOnePrefix(thread.getName(), r.this.f10607j)) {
                        thread.setPriority(1);
                    }
                }
                r.this.g();
            }
        });
    }

    private boolean h() {
        return ((Boolean) this.f10599b.a(com.applovin.impl.sdk.c.b.cw)).booleanValue();
    }

    public List<Future<Boolean>> a(List<com.applovin.impl.sdk.e.a> list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10600c.b("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.f10600c.b("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new a(str));
    }

    public void a(com.applovin.impl.sdk.e.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        try {
            if (com.applovin.impl.sdk.utils.w.b()) {
                this.f10602e.submit(h() ? new d(this.f10599b, dVar, b.MAIN) : dVar);
            } else {
                dVar.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10600c.b(dVar.e(), "Task failed execution", th);
            }
            dVar.a(th);
        }
    }

    public void a(com.applovin.impl.sdk.e.d dVar, b bVar) {
        a(dVar, bVar, 0L);
    }

    public void a(com.applovin.impl.sdk.e.d dVar, b bVar, long j10) {
        a(dVar, bVar, j10, false);
    }

    public void a(com.applovin.impl.sdk.e.d dVar, b bVar, long j10, boolean z10) {
        Runnable runnable;
        if (dVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("Invalid delay (millis) specified: ", j10));
        }
        d dVar2 = new d(this.f10599b, dVar, bVar);
        if (a(dVar2)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10600c.c(dVar.e(), "Task execution delayed until after init");
            }
        } else {
            if (h()) {
                runnable = dVar;
                runnable = dVar2;
            }
            runnable = dVar;
            a(runnable, j10, z10);
        }
    }

    public void a(Runnable runnable) {
        this.f10601d.submit(runnable);
    }

    public boolean a() {
        return this.f10605h;
    }

    public Executor b() {
        return this.f10602e;
    }

    public ExecutorService c() {
        return f10598a;
    }

    public void d() {
        synchronized (this.f10604g) {
            this.f10605h = false;
        }
    }

    public void e() {
        synchronized (this.f10604g) {
            this.f10605h = true;
            for (d dVar : this.f10603f) {
                a(dVar.f10643d, dVar.f10644e);
            }
            this.f10603f.clear();
        }
    }

    public void f() {
        long jLongValue = ((Long) this.f10599b.a(com.applovin.impl.sdk.c.b.gQ)).longValue();
        this.f10608k = jLongValue;
        if (jLongValue >= 0 && this.f10606i.compareAndSet(false, true)) {
            this.f10607j = this.f10599b.b(com.applovin.impl.sdk.c.b.gR);
            g();
        }
    }
}
