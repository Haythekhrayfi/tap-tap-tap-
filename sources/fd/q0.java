package fd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class q0<T> extends kd.x<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29615f = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public q0(mc.f fVar, mc.d<? super T> dVar) {
        super(fVar, dVar);
        this._decision = 0;
    }

    @Override // kd.x, fd.o1
    public void E(Object obj) {
        w0(obj);
    }

    @Override // kd.x, fd.a
    public void w0(Object obj) {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    break;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f29615f.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        kd.g.a(nc.b.c(this.f32071e), z.A(obj, this.f32071e), null);
    }

    public final Object z0() {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 == 2) {
                    break;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
            if (f29615f.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return nc.a.COROUTINE_SUSPENDED;
        }
        Object objA = p1.a(e0());
        if (objA instanceof v) {
            throw ((v) objA).f29629a;
        }
        return objA;
    }
}
