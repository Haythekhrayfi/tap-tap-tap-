package h2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;

/* JADX INFO: loaded from: classes.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f30521i = x1.m.e("WorkForegroundRunnable");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.d<Void> f30522c = new i2.d<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f30523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2.p f30524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListenableWorker f30525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x1.e f30526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2.a f30527h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2.d f30528c;

        public a(i2.d dVar) {
            this.f30528c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30528c.l(n.this.f30525f.getForegroundInfoAsync());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2.d f30530c;

        public b(i2.d dVar) {
            this.f30530c = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                x1.d dVar = (x1.d) this.f30530c.get();
                if (dVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", n.this.f30524e.f29742c));
                }
                x1.m.c().a(n.f30521i, String.format("Updating notification for %s", n.this.f30524e.f29742c), new Throwable[0]);
                n.this.f30525f.setRunInForeground(true);
                n nVar = n.this;
                nVar.f30522c.l(((o) nVar.f30526g).a(nVar.f30523d, nVar.f30525f.getId(), dVar));
            } catch (Throwable th) {
                n.this.f30522c.k(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public n(Context context, g2.p pVar, ListenableWorker listenableWorker, x1.e eVar, j2.a aVar) {
        this.f30523d = context;
        this.f30524e = pVar;
        this.f30525f = listenableWorker;
        this.f30526g = eVar;
        this.f30527h = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f30524e.f29756q || l0.a.b()) {
            this.f30522c.j(null);
            return;
        }
        i2.d dVar = new i2.d();
        ((j2.b) this.f30527h).f31697c.execute(new a(dVar));
        dVar.a(new b(dVar), ((j2.b) this.f30527h).f31697c);
    }
}
