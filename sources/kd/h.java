package kd;

import fd.l0;
import fd.o0;
import fd.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends fd.c0 implements Runnable, o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fd.c0 f32040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f32042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m<Runnable> f32043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f32044i;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public h(fd.c0 c0Var, int i10) {
        this.f32040e = c0Var;
        this.f32041f = i10;
        o0 o0Var = c0Var instanceof o0 ? (o0) c0Var : null;
        this.f32042g = o0Var == null ? l0.f29592b : o0Var;
        this.f32043h = new m<>(false);
        this.f32044i = new Object();
    }

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        this.f32043h.a(runnable);
        boolean z10 = true;
        if (this.runningWorkers >= this.f32041f) {
            return;
        }
        synchronized (this.f32044i) {
            if (this.runningWorkers >= this.f32041f) {
                z10 = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z10) {
            this.f32040e.c0(this, this);
        }
    }

    @Override // fd.o0
    public t0 k(long j10, Runnable runnable, mc.f fVar) {
        return this.f32042g.k(j10, runnable, fVar);
    }

    @Override // fd.o0
    public void l(long j10, fd.i<? super jc.w> iVar) {
        this.f32042g.l(j10, iVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            int i10 = 0;
            while (true) {
                Runnable runnableD = this.f32043h.d();
                if (runnableD != null) {
                    try {
                        runnableD.run();
                    } catch (Throwable th) {
                        fd.f.f(mc.h.f33539c, th);
                    }
                    i10++;
                    if (i10 >= 16 && this.f32040e.d0(this)) {
                        this.f32040e.c0(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f32044i) {
                this.runningWorkers--;
                if (this.f32043h.c() == 0) {
                    return;
                } else {
                    this.runningWorkers++;
                }
            }
        }
    }
}
