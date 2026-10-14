package x1;

import fd.j0;
import fd.j1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j<R> implements t4.a<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f37403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2.d<R> f37404d;

    public static final class a extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<R> f37405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j<R> jVar) {
            super(1);
            this.f37405c = jVar;
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 == null) {
                if (!this.f37405c.f37404d.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th2 instanceof CancellationException) {
                this.f37405c.f37404d.cancel(true);
            } else {
                i2.d<R> dVar = this.f37405c.f37404d;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                dVar.k(th2);
            }
            return jc.w.f31842a;
        }
    }

    public j(j1 j1Var, i2.d<R> dVar) {
        j0.i(j1Var, "job");
        j0.i(dVar, "underlying");
        this.f37403c = j1Var;
        this.f37404d = dVar;
        j1Var.g(new a(this));
    }

    public j(j1 j1Var, i2.d dVar, int i10, vc.g gVar) {
        this(j1Var, (i10 & 2) != 0 ? new i2.d() : dVar);
    }

    @Override // t4.a
    public void a(Runnable runnable, Executor executor) {
        this.f37404d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f37404d.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f37404d.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return this.f37404d.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f37404d.f31189c instanceof i2.b.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f37404d.isDone();
    }
}
