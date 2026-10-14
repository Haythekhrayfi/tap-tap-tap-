package f5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f29352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f29353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f29355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f29356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f29357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f29358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k5.c f29359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e5.b f29360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d5.a f29361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f29362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f29363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c5.a f29364n;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m5.j f29365c;

        public a(m5.j jVar) {
            this.f29365c = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.a(x.this, this.f29365c);
        }
    }

    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            try {
                boolean zDelete = x.this.f29355e.b().delete();
                if (!zDelete) {
                    c5.d.f3604c.f("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zDelete);
            } catch (Exception e10) {
                c5.d dVar = c5.d.f3604c;
                if (dVar.a(6)) {
                    Log.e(dVar.f3605a, "Problem encountered deleting Crashlytics initialization marker.", e10);
                }
                return Boolean.FALSE;
            }
        }
    }

    public x(u4.d dVar, i0 i0Var, c5.a aVar, d0 d0Var, e5.b bVar, d5.a aVar2, k5.c cVar, ExecutorService executorService) {
        this.f29352b = d0Var;
        dVar.a();
        this.f29351a = dVar.f36011a;
        this.f29358h = i0Var;
        this.f29364n = aVar;
        this.f29360j = bVar;
        this.f29361k = aVar2;
        this.f29362l = executorService;
        this.f29359i = cVar;
        this.f29363m = new f(executorService);
        this.f29354d = System.currentTimeMillis();
        this.f29353c = new k0();
    }

    public static Task a(final x xVar, m5.j jVar) {
        Task<Void> taskForException;
        xVar.f29363m.a();
        xVar.f29355e.a();
        c5.d dVar = c5.d.f3604c;
        dVar.e("Initialization marker file was created.");
        try {
            try {
                xVar.f29360j.c(new e5.a() { // from class: f5.v
                    @Override // e5.a
                    public final void a(String str) {
                        x xVar2 = this.f29348a;
                        Objects.requireNonNull(xVar2);
                        long jCurrentTimeMillis = System.currentTimeMillis() - xVar2.f29354d;
                        q qVar = xVar2.f29357g;
                        qVar.f29322d.b(new r(qVar, jCurrentTimeMillis, str));
                    }
                });
                m5.g gVar = (m5.g) jVar;
                if (gVar.b().f33196b.f33201a) {
                    if (!xVar.f29357g.e(gVar)) {
                        dVar.f("Previous sessions could not be finalized.");
                    }
                    taskForException = xVar.f29357g.h(gVar.f33214i.get().getTask());
                } else {
                    dVar.b("Collection of crash reports disabled in Crashlytics settings.");
                    taskForException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                }
            } catch (Exception e10) {
                c5.d dVar2 = c5.d.f3604c;
                if (dVar2.a(6)) {
                    Log.e(dVar2.f3605a, "Crashlytics encountered a problem during asynchronous initialization.", e10);
                }
                taskForException = Tasks.forException(e10);
            }
            return taskForException;
        } finally {
            xVar.c();
        }
    }

    public final void b(m5.j jVar) {
        String str;
        String str2;
        Future<?> futureSubmit = this.f29362l.submit(new a(jVar));
        c5.d.f3604c.b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            c5.d dVar = c5.d.f3604c;
            if (dVar.a(6)) {
                str = dVar.f3605a;
                str2 = "Crashlytics was interrupted during initialization.";
                Log.e(str, str2, e);
            }
        } catch (ExecutionException e11) {
            e = e11;
            c5.d dVar2 = c5.d.f3604c;
            if (dVar2.a(6)) {
                str = dVar2.f3605a;
                str2 = "Crashlytics encountered a problem during initialization.";
                Log.e(str, str2, e);
            }
        } catch (TimeoutException e12) {
            e = e12;
            c5.d dVar3 = c5.d.f3604c;
            if (dVar3.a(6)) {
                str = dVar3.f3605a;
                str2 = "Crashlytics timed out during initialization.";
                Log.e(str, str2, e);
            }
        }
    }

    public void c() {
        this.f29363m.b(new b());
    }
}
