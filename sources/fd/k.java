package fd;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class k<T> extends r0<T> implements i<T>, oc.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29582i = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decision");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29583j = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mc.d<T> f29584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mc.f f29585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f29586h;

    /* JADX WARN: Multi-variable type inference failed */
    public k(mc.d<? super T> dVar, int i10) {
        super(i10);
        this.f29584f = dVar;
        this.f29585g = dVar.getContext();
        this._decision = 0;
        this._state = b.f29542c;
    }

    @Override // fd.i
    public void A(c0 c0Var, T t10) {
        mc.d<T> dVar = this.f29584f;
        kd.f fVar = dVar instanceof kd.f ? (kd.f) dVar : null;
        G(t10, (fVar != null ? fVar.f32034f : null) == c0Var ? 4 : this.f29617e, null);
    }

    @Override // fd.i
    public void B(Object obj) {
        p(this.f29617e);
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        Throwable thN;
        mc.d<T> dVar = this.f29584f;
        kd.f fVar = dVar instanceof kd.f ? (kd.f) dVar : null;
        if (fVar == null || (thN = fVar.n(this)) == null) {
            return;
        }
        m();
        x(thN);
    }

    public final boolean E() {
        Object obj = this._state;
        if ((obj instanceof u) && ((u) obj).f29624d != null) {
            m();
            return false;
        }
        this._decision = 0;
        this._state = b.f29542c;
        return true;
    }

    public void F(T t10, uc.l<? super Throwable, jc.w> lVar) {
        G(t10, this.f29617e, lVar);
    }

    public final void G(Object obj, int i10, uc.l<? super Throwable, jc.w> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof v1)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    Objects.requireNonNull(mVar);
                    if (m.f29593c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            k(lVar, mVar.f29629a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(j.a("Already resumed, but proposed with update ", obj));
            }
        } while (!f29583j.compareAndSet(this, obj2, H((v1) obj2, obj, i10, lVar, null)));
        n();
        p(i10);
    }

    public final Object H(v1 v1Var, Object obj, int i10, uc.l<? super Throwable, jc.w> lVar, Object obj2) {
        if (obj instanceof v) {
            return obj;
        }
        if (!f.g(i10) && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((v1Var instanceof g) && !(v1Var instanceof d)) || obj2 != null)) {
            return new u(obj, v1Var instanceof g ? (g) v1Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final kd.z I(Object obj, Object obj2, uc.l<? super Throwable, jc.w> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof v1)) {
                if ((obj3 instanceof u) && obj2 != null && ((u) obj3).f29624d == obj2) {
                    return l.f29590a;
                }
                return null;
            }
        } while (!f29583j.compareAndSet(this, obj3, H((v1) obj3, obj, this.f29617e, lVar, obj2)));
        n();
        return l.f29590a;
    }

    @Override // fd.i
    public boolean a() {
        return this._state instanceof v1;
    }

    @Override // fd.r0
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof v1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof v) {
                return;
            }
            if (obj2 instanceof u) {
                u uVar = (u) obj2;
                if (!(!(uVar.f29625e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (f29583j.compareAndSet(this, obj2, u.a(uVar, null, null, null, null, th, 15))) {
                    g gVar = uVar.f29622b;
                    if (gVar != null) {
                        i(gVar, th);
                    }
                    uc.l<Throwable, jc.w> lVar = uVar.f29623c;
                    if (lVar != null) {
                        k(lVar, th);
                        return;
                    }
                    return;
                }
            } else if (f29583j.compareAndSet(this, obj2, new u(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // fd.r0
    public final mc.d<T> c() {
        return this.f29584f;
    }

    @Override // fd.i
    public Object d(T t10, Object obj) {
        return I(t10, obj, null);
    }

    @Override // fd.r0
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.r0
    public <T> T f(Object obj) {
        return obj instanceof u ? (T) ((u) obj).f29621a : obj;
    }

    @Override // oc.d
    public oc.d getCallerFrame() {
        mc.d<T> dVar = this.f29584f;
        if (dVar instanceof oc.d) {
            return (oc.d) dVar;
        }
        return null;
    }

    @Override // mc.d
    public mc.f getContext() {
        return this.f29585g;
    }

    @Override // fd.r0
    public Object h() {
        return this._state;
    }

    public final void i(g gVar, Throwable th) {
        try {
            gVar.a(th);
        } catch (Throwable th2) {
            f.f(this.f29585g, new y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(uc.l<? super Throwable, jc.w> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f.f(this.f29585g, new y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(uc.l<? super Throwable, jc.w> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f.f(this.f29585g, new y("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // fd.i
    public Object l(T t10, Object obj, uc.l<? super Throwable, jc.w> lVar) {
        return I(t10, obj, lVar);
    }

    public final void m() {
        t0 t0Var = this.f29586h;
        if (t0Var == null) {
            return;
        }
        t0Var.dispose();
        this.f29586h = u1.f29627c;
    }

    public final void n() {
        if (w()) {
            return;
        }
        m();
    }

    public final void p(int i10) {
        boolean z10;
        while (true) {
            int i11 = this._decision;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z10 = false;
                break;
            } else if (f29582i.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        mc.d<T> dVarC = c();
        boolean z11 = i10 == 4;
        if (z11 || !(dVarC instanceof kd.f) || f.g(i10) != f.g(this.f29617e)) {
            f.h(this, dVarC, z11);
            return;
        }
        c0 c0Var = ((kd.f) dVarC).f32034f;
        mc.f context = dVarC.getContext();
        if (c0Var.d0(context)) {
            c0Var.c0(context, this);
            return;
        }
        c2 c2Var = c2.f29557a;
        x0 x0VarA = c2.a();
        if (x0VarA.i0()) {
            x0VarA.g0(this);
            return;
        }
        x0VarA.h0(true);
        try {
            f.h(this, c(), true);
            do {
            } while (x0VarA.j0());
        } catch (Throwable th) {
            try {
                g(th, null);
            } finally {
                x0VarA.e0(true);
            }
        }
    }

    public Throwable q(j1 j1Var) {
        return ((o1) j1Var).q();
    }

    public final Object r() {
        boolean z10;
        boolean zW = w();
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 == 2) {
                    break;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
            if (f29582i.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            if (this.f29586h == null) {
                v();
            }
            if (zW) {
                D();
            }
            return nc.a.COROUTINE_SUSPENDED;
        }
        if (zW) {
            D();
        }
        Object obj = this._state;
        if (obj instanceof v) {
            throw ((v) obj).f29629a;
        }
        if (f.g(this.f29617e)) {
            mc.f fVar = this.f29585g;
            int i11 = j1.f29579x1;
            j1 j1Var = (j1) fVar.b(j1.b.f29580c);
            if (j1Var != null && !j1Var.a()) {
                CancellationException cancellationExceptionQ = j1Var.q();
                b(obj, cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        }
        return f(obj);
    }

    @Override // mc.d
    public void resumeWith(Object obj) {
        Throwable thA = jc.i.a(obj);
        if (thA != null) {
            obj = new v(thA, false, 2, null);
        }
        G(obj, this.f29617e, null);
    }

    @Override // fd.i
    public void s(uc.l<? super Throwable, jc.w> lVar) {
        g g1Var = lVar instanceof g ? (g) lVar : new g1(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof b)) {
                if (obj instanceof g) {
                    z(lVar, obj);
                    throw null;
                }
                boolean z10 = obj instanceof v;
                if (z10) {
                    v vVar = (v) obj;
                    Objects.requireNonNull(vVar);
                    if (!v.f29628b.compareAndSet(vVar, 0, 1)) {
                        z(lVar, obj);
                        throw null;
                    }
                    if (obj instanceof m) {
                        if (!z10) {
                            vVar = null;
                        }
                        j(lVar, vVar != null ? vVar.f29629a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof u) {
                    u uVar = (u) obj;
                    if (uVar.f29622b != null) {
                        z(lVar, obj);
                        throw null;
                    }
                    if (g1Var instanceof d) {
                        return;
                    }
                    Throwable th = uVar.f29625e;
                    if (th != null) {
                        j(lVar, th);
                        return;
                    } else {
                        if (f29583j.compareAndSet(this, obj, u.a(uVar, null, g1Var, null, null, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (g1Var instanceof d) {
                        return;
                    }
                    if (f29583j.compareAndSet(this, obj, new u(obj, g1Var, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else if (f29583j.compareAndSet(this, obj, g1Var)) {
                return;
            }
        }
    }

    @Override // fd.i
    public Object t(Throwable th) {
        return I(new v(th, false, 2, null), null, null);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C());
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(j0.s(this.f29584f));
        sb2.append("){");
        Object obj = this._state;
        if (obj instanceof v1) {
            str = "Active";
        } else {
            str = obj instanceof m ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(j0.n(this));
        return sb2.toString();
    }

    public void u() {
        t0 t0VarV = v();
        if (t0VarV != null && (!(this._state instanceof v1))) {
            t0VarV.dispose();
            this.f29586h = u1.f29627c;
        }
    }

    public final t0 v() {
        mc.f fVar = this.f29585g;
        int i10 = j1.f29579x1;
        j1 j1Var = (j1) fVar.b(j1.b.f29580c);
        if (j1Var == null) {
            return null;
        }
        t0 t0VarB = j1.a.b(j1Var, true, false, new n(this), 2, null);
        this.f29586h = t0VarB;
        return t0VarB;
    }

    public final boolean w() {
        return (this.f29617e == 2) && ((kd.f) this.f29584f).j();
    }

    @Override // fd.i
    public boolean x(Throwable th) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof v1)) {
                return false;
            }
            z10 = obj instanceof g;
        } while (!f29583j.compareAndSet(this, obj, new m(this, th, z10)));
        g gVar = z10 ? (g) obj : null;
        if (gVar != null) {
            i(gVar, th);
        }
        n();
        p(this.f29617e);
        return true;
    }

    @Override // fd.i
    public boolean y() {
        return !(this._state instanceof v1);
    }

    public final void z(uc.l<? super Throwable, jc.w> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }
}
