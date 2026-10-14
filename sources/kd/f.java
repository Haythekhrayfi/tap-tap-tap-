package kd;

import fd.c2;
import fd.j0;
import fd.r0;
import fd.x0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends r0<T> implements oc.d, mc.d<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32033j = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fd.c0 f32034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mc.d<T> f32035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f32036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f32037i;

    /* JADX WARN: Multi-variable type inference failed */
    public f(fd.c0 c0Var, mc.d<? super T> dVar) {
        super(-1);
        this.f32034f = c0Var;
        this.f32035g = dVar;
        this.f32036h = g.f32038a;
        this.f32037i = b0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // fd.r0
    public void b(Object obj, Throwable th) {
        if (obj instanceof fd.w) {
            ((fd.w) obj).f29632b.invoke(th);
        }
    }

    @Override // fd.r0
    public mc.d<T> c() {
        return this;
    }

    @Override // oc.d
    public oc.d getCallerFrame() {
        mc.d<T> dVar = this.f32035g;
        if (dVar instanceof oc.d) {
            return (oc.d) dVar;
        }
        return null;
    }

    @Override // mc.d
    public mc.f getContext() {
        return this.f32035g.getContext();
    }

    @Override // fd.r0
    public Object h() {
        Object obj = this.f32036h;
        this.f32036h = g.f32038a;
        return obj;
    }

    public final fd.k<T> i() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f32039b;
                return null;
            }
            if (obj instanceof fd.k) {
                if (f32033j.compareAndSet(this, obj, g.f32039b)) {
                    return (fd.k) obj;
                }
            } else if (obj != g.f32039b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(fd.j.a("Inconsistent state ", obj));
            }
        }
    }

    public final boolean j() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean k(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            z zVar = g.f32039b;
            if (j0.d(obj, zVar)) {
                if (f32033j.compareAndSet(this, zVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (f32033j.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void m() {
        while (this._reusableCancellableContinuation == g.f32039b) {
        }
        Object obj = this._reusableCancellableContinuation;
        fd.k kVar = obj instanceof fd.k ? (fd.k) obj : null;
        if (kVar != null) {
            kVar.m();
        }
    }

    public final Throwable n(fd.i<?> iVar) {
        z zVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            zVar = g.f32039b;
            if (obj != zVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(fd.j.a("Inconsistent state ", obj));
                }
                if (f32033j.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!f32033j.compareAndSet(this, zVar, iVar));
        return null;
    }

    @Override // mc.d
    public void resumeWith(Object obj) {
        mc.f context = this.f32035g.getContext();
        Object objR = fd.z.R(obj, null);
        if (this.f32034f.d0(context)) {
            this.f32036h = objR;
            this.f29617e = 0;
            this.f32034f.c0(context, this);
            return;
        }
        c2 c2Var = c2.f29557a;
        x0 x0VarA = c2.a();
        if (x0VarA.i0()) {
            this.f32036h = objR;
            this.f29617e = 0;
            x0VarA.g0(this);
            return;
        }
        x0VarA.h0(true);
        try {
            mc.f context2 = getContext();
            Object objC = b0.c(context2, this.f32037i);
            try {
                this.f32035g.resumeWith(obj);
                b0.a(context2, objC);
                while (x0VarA.j0()) {
                }
            } catch (Throwable th) {
                b0.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2, null);
            } finally {
                x0VarA.e0(true);
            }
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DispatchedContinuation[");
        sbA.append(this.f32034f);
        sbA.append(", ");
        sbA.append(j0.s(this.f32035g));
        sbA.append(']');
        return sbA.toString();
    }
}
