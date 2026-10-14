package fd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class o1 implements j1, q, w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29597c = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static final class a<T> extends k<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final o1 f29598k;

        public a(mc.d<? super T> dVar, o1 o1Var) {
            super(dVar, 1);
            this.f29598k = o1Var;
        }

        @Override // fd.k
        public String C() {
            return "AwaitContinuation";
        }

        @Override // fd.k
        public Throwable q(j1 j1Var) {
            Throwable thD;
            Object objE0 = this.f29598k.e0();
            if (!(objE0 instanceof c) || (thD = ((c) objE0).d()) == null) {
                return objE0 instanceof v ? ((v) objE0).f29629a : ((o1) j1Var).q();
            }
            return thD;
        }
    }

    public static final class b extends n1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o1 f29599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c f29600h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final p f29601i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f29602j;

        public b(o1 o1Var, c cVar, p pVar, Object obj) {
            this.f29599g = o1Var;
            this.f29600h = cVar;
            this.f29601i = pVar;
            this.f29602j = obj;
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ jc.w invoke(Throwable th) {
            w(th);
            return jc.w.f31842a;
        }

        @Override // fd.x
        public void w(Throwable th) {
            o1 o1Var = this.f29599g;
            c cVar = this.f29600h;
            p pVar = this.f29601i;
            Object obj = this.f29602j;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.f29597c;
            p pVarL0 = o1Var.l0(pVar);
            if (pVarL0 == null || !o1Var.v0(cVar, pVarL0, obj)) {
                o1Var.E(o1Var.U(cVar, obj));
            }
        }
    }

    public static final class c implements e1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1 f29603c;

        public c(t1 t1Var, boolean z10, Throwable th) {
            this.f29603c = t1Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        @Override // fd.e1
        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
                return;
            }
            if (th == th2) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(j.a("State is ", obj));
                }
                ((ArrayList) obj).add(th);
            } else {
                if (th == obj) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(obj);
                arrayListC.add(th);
                this._exceptionsHolder = arrayListC;
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        @Override // fd.e1
        public t1 f() {
            return this.f29603c;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return this._exceptionsHolder == p1.f29612e;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList arrayListC;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayListC = c();
            } else if (obj instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(obj);
                arrayListC = arrayListC2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(j.a("State is ", obj));
                }
                arrayListC = (ArrayList) obj;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayListC.add(0, th2);
            }
            if (th != null && !j0.d(th, th2)) {
                arrayListC.add(th);
            }
            this._exceptionsHolder = p1.f29612e;
            return arrayListC;
        }

        public final void j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public String toString() {
            StringBuilder sbA = defpackage.a.a("Finishing[cancelling=");
            sbA.append(e());
            sbA.append(", completing=");
            sbA.append((boolean) this._isCompleting);
            sbA.append(", rootCause=");
            sbA.append((Throwable) this._rootCause);
            sbA.append(", exceptions=");
            sbA.append(this._exceptionsHolder);
            sbA.append(", list=");
            sbA.append(this.f29603c);
            sbA.append(']');
            return sbA.toString();
        }
    }

    public static final class d extends kd.k.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o1 f29604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f29605e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kd.k kVar, o1 o1Var, Object obj) {
            super(kVar);
            this.f29604d = o1Var;
            this.f29605e = obj;
        }

        @Override // kd.d
        public Object e(kd.k kVar) {
            if (this.f29604d.e0() == this.f29605e) {
                return null;
            }
            return kd.j.f32045a;
        }
    }

    public o1(boolean z10) {
        this._state = z10 ? p1.f29614g : p1.f29613f;
        this._parentHandle = null;
    }

    public static /* synthetic */ CancellationException t0(o1 o1Var, Throwable th, String str, int i10, Object obj) {
        return o1Var.s0(th, null);
    }

    public final boolean D(Object obj, t1 t1Var, n1 n1Var) {
        int iV;
        d dVar = new d(n1Var, this, obj);
        do {
            iV = t1Var.p().v(n1Var, t1Var, dVar);
            if (iV == 1) {
                return true;
            }
        } while (iV != 2);
        return false;
    }

    public void E(Object obj) {
    }

    public final Object F(mc.d<Object> dVar) throws Throwable {
        Object objE0;
        do {
            objE0 = e0();
            if (!(objE0 instanceof e1)) {
                if (objE0 instanceof v) {
                    throw ((v) objE0).f29629a;
                }
                return p1.a(objE0);
            }
        } while (q0(objE0) < 0);
        a aVar = new a(nc.b.c(dVar), this);
        aVar.u();
        y8.c0.i(aVar, m(false, true, new y1(aVar)));
        Object objR = aVar.r();
        if (objR == nc.a.COROUTINE_SUSPENDED) {
            j0.i(dVar, "frame");
        }
        return objR;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    public final boolean G(Object obj) throws Throwable {
        kd.z zVar;
        boolean z10;
        Object objU0 = p1.f29608a;
        if (a0()) {
            do {
                Object objE0 = e0();
                if (!(objE0 instanceof e1) || ((objE0 instanceof c) && ((c) objE0).g())) {
                    objU0 = p1.f29608a;
                    break;
                }
                objU0 = u0(objE0, new v(Q(obj), false, 2, null));
            } while (objU0 == p1.f29610c);
            if (objU0 == p1.f29609b) {
                return true;
            }
        }
        if (objU0 == p1.f29608a) {
            Throwable thQ = null;
            while (true) {
                Object objE1 = e0();
                if (objE1 instanceof c) {
                    synchronized (objE1) {
                        if (((c) objE1).h()) {
                            zVar = p1.f29611d;
                        } else {
                            boolean zE = ((c) objE1).e();
                            if (obj != null || !zE) {
                                if (thQ == null) {
                                    thQ = Q(obj);
                                }
                                ((c) objE1).b(thQ);
                            }
                            Throwable thD = zE ^ true ? ((c) objE1).d() : null;
                            if (thD != null) {
                                m0(((c) objE1).f29603c, thD);
                            }
                            zVar = p1.f29608a;
                        }
                    }
                    objU0 = zVar;
                } else if (objE1 instanceof e1) {
                    if (thQ == null) {
                        thQ = Q(obj);
                    }
                    e1 e1Var = (e1) objE1;
                    if (e1Var.a()) {
                        t1 t1VarC0 = c0(e1Var);
                        if (t1VarC0 == null) {
                            z10 = false;
                        } else {
                            if (f29597c.compareAndSet(this, e1Var, new c(t1VarC0, false, thQ))) {
                                m0(t1VarC0, thQ);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            zVar = p1.f29608a;
                            objU0 = zVar;
                        }
                    } else {
                        Object objU1 = u0(objE1, new v(thQ, false, 2, null));
                        if (objU1 == p1.f29608a) {
                            throw new IllegalStateException(j.a("Cannot happen in ", objE1));
                        }
                        if (objU1 != p1.f29610c) {
                            objU0 = objU1;
                        }
                    }
                } else {
                    zVar = p1.f29611d;
                    objU0 = zVar;
                }
            }
        }
        if (objU0 != p1.f29608a && objU0 != p1.f29609b) {
            if (objU0 == p1.f29611d) {
                return false;
            }
            E(objU0);
        }
        return true;
    }

    public void H(Throwable th) throws Throwable {
        G(th);
    }

    public final boolean I(Throwable th) {
        if (i0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        o oVar = (o) this._parentHandle;
        if (oVar == null || oVar == u1.f29627c) {
            return z10;
        }
        return oVar.e(th) || z10;
    }

    public String L() {
        return "Job was cancelled";
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return G(th) && Z();
    }

    public final void N(e1 e1Var, Object obj) throws Throwable {
        o oVar = (o) this._parentHandle;
        if (oVar != null) {
            oVar.dispose();
            this._parentHandle = u1.f29627c;
        }
        y yVar = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th = vVar != null ? vVar.f29629a : null;
        if (e1Var instanceof n1) {
            try {
                ((n1) e1Var).w(th);
                return;
            } catch (Throwable th2) {
                g0(new y("Exception in completion handler " + e1Var + " for " + this, th2));
                return;
            }
        }
        t1 t1VarF = e1Var.f();
        if (t1VarF != null) {
            for (kd.k kVarO = (kd.k) t1VarF.n(); !j0.d(kVarO, t1VarF); kVarO = kVarO.o()) {
                if (kVarO instanceof n1) {
                    n1 n1Var = (n1) kVarO;
                    try {
                        n1Var.w(th);
                    } catch (Throwable th3) {
                        if (yVar != null) {
                            jc.a.a(yVar, th3);
                        } else {
                            yVar = new y("Exception in completion handler " + n1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (yVar != null) {
                g0(yVar);
            }
        }
    }

    public final Throwable Q(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new k1(L(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((w1) obj).R();
    }

    @Override // fd.w1
    public CancellationException R() {
        Throwable thD;
        Object objE0 = e0();
        if (objE0 instanceof c) {
            thD = ((c) objE0).d();
        } else if (objE0 instanceof v) {
            thD = ((v) objE0).f29629a;
        } else {
            if (objE0 instanceof e1) {
                throw new IllegalStateException(j.a("Cannot be cancelling child in this state: ", objE0));
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        StringBuilder sbA = defpackage.a.a("Parent job is ");
        sbA.append(r0(objE0));
        return new k1(sbA.toString(), thD, this);
    }

    public final Object U(c cVar, Object obj) throws Throwable {
        Throwable thX;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th = vVar != null ? vVar.f29629a : null;
        synchronized (cVar) {
            cVar.e();
            List<Throwable> listI = cVar.i(th);
            thX = X(cVar, listI);
            if (thX != null && listI.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(listI.size()));
                for (Throwable th2 : listI) {
                    if (th2 != thX && th2 != thX && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        jc.a.a(thX, th2);
                    }
                }
            }
        }
        if (thX != null && thX != th) {
            obj = new v(thX, false, 2, null);
        }
        if (thX != null) {
            if (I(thX) || f0(thX)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                v.f29628b.compareAndSet((v) obj, 0, 1);
            }
        }
        n0(obj);
        f29597c.compareAndSet(this, cVar, obj instanceof e1 ? new f1((e1) obj) : obj);
        N(cVar, obj);
        return obj;
    }

    public final Object W() throws Throwable {
        Object objE0 = e0();
        if (!(!(objE0 instanceof e1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objE0 instanceof v) {
            throw ((v) objE0).f29629a;
        }
        return p1.a(objE0);
    }

    public final Throwable X(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.e()) {
                return new k1(L(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof d2) {
            for (Object obj2 : list) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof d2)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // mc.f
    public <R> R Y(R r10, uc.p<? super R, ? super mc.f.a, ? extends R> pVar) {
        return (R) mc.f.a.C0363a.a(this, r10, pVar);
    }

    public boolean Z() {
        return true;
    }

    @Override // fd.j1
    public boolean a() {
        Object objE0 = e0();
        return (objE0 instanceof e1) && ((e1) objE0).a();
    }

    public boolean a0() {
        return this instanceof s;
    }

    @Override // mc.f.a, mc.f
    public <E extends mc.f.a> E b(mc.f.b<E> bVar) {
        return (E) mc.f.a.C0363a.b(this, bVar);
    }

    @Override // fd.j1
    public void c(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new k1(L(), null, this);
        }
        H(cancellationException);
    }

    public final t1 c0(e1 e1Var) {
        t1 t1VarF = e1Var.f();
        if (t1VarF != null) {
            return t1VarF;
        }
        if (e1Var instanceof w0) {
            return new t1();
        }
        if (e1Var instanceof n1) {
            p0((n1) e1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + e1Var).toString());
    }

    public final o d0() {
        return (o) this._parentHandle;
    }

    public final Object e0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kd.u)) {
                return obj;
            }
            ((kd.u) obj).b(this);
        }
    }

    public boolean f0(Throwable th) {
        return false;
    }

    @Override // fd.j1
    public final t0 g(uc.l<? super Throwable, jc.w> lVar) {
        return m(false, true, lVar);
    }

    public void g0(Throwable th) throws Throwable {
        throw th;
    }

    @Override // mc.f.a
    public final mc.f.b<?> getKey() {
        return j1.b.f29580c;
    }

    public final void h0(j1 j1Var) {
        if (j1Var == null) {
            this._parentHandle = u1.f29627c;
            return;
        }
        j1Var.start();
        o oVarJ = j1Var.j(this);
        this._parentHandle = oVarJ;
        if (!(e0() instanceof e1)) {
            oVarJ.dispose();
            this._parentHandle = u1.f29627c;
        }
    }

    @Override // mc.f
    public mc.f i(mc.f fVar) {
        return mc.f.a.C0363a.d(this, fVar);
    }

    public boolean i0() {
        return false;
    }

    @Override // fd.j1
    public final o j(q qVar) {
        return (o) j1.a.b(this, true, false, new p(qVar), 2, null);
    }

    public final Object j0(Object obj) throws Throwable {
        Object objU0;
        do {
            objU0 = u0(e0(), obj);
            if (objU0 == p1.f29608a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.f29629a : null);
            }
        } while (objU0 == p1.f29610c);
        return objU0;
    }

    public String k0() {
        return getClass().getSimpleName();
    }

    public final p l0(kd.k kVar) {
        while (kVar.s()) {
            kVar = kVar.p();
        }
        while (true) {
            kVar = kVar.o();
            if (!kVar.s()) {
                if (kVar instanceof p) {
                    return (p) kVar;
                }
                if (kVar instanceof t1) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0027 A[SYNTHETIC] */
    @Override // fd.j1
    public final t0 m(boolean z10, boolean z11, uc.l<? super Throwable, jc.w> lVar) {
        n1 i1Var;
        Throwable thD;
        if (z10) {
            i1Var = lVar instanceof l1 ? (l1) lVar : null;
            if (i1Var == null) {
                i1Var = new h1(lVar);
            }
        } else {
            i1Var = lVar instanceof n1 ? (n1) lVar : null;
            if (i1Var == null) {
                i1Var = new i1(lVar);
            }
        }
        i1Var.f29596f = this;
        while (true) {
            Object objE0 = e0();
            if (objE0 instanceof w0) {
                w0 w0Var = (w0) objE0;
                if (!w0Var.f29633c) {
                    t1 t1Var = new t1();
                    Object d1Var = t1Var;
                    if (!w0Var.f29633c) {
                        d1Var = new d1(t1Var);
                    }
                    f29597c.compareAndSet(this, w0Var, d1Var);
                } else if (f29597c.compareAndSet(this, objE0, i1Var)) {
                    return i1Var;
                }
            } else {
                if (!(objE0 instanceof e1)) {
                    if (z11) {
                        v vVar = objE0 instanceof v ? (v) objE0 : null;
                        lVar.invoke(vVar != null ? vVar.f29629a : null);
                    }
                    return u1.f29627c;
                }
                t1 t1VarF = ((e1) objE0).f();
                if (t1VarF == null) {
                    Objects.requireNonNull(objE0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    p0((n1) objE0);
                } else {
                    t0 t0Var = u1.f29627c;
                    if (z10 && (objE0 instanceof c)) {
                        synchronized (objE0) {
                            thD = ((c) objE0).d();
                            if (thD == null || ((lVar instanceof p) && !((c) objE0).g())) {
                                if (D(objE0, t1VarF, i1Var)) {
                                    if (thD == null) {
                                        return i1Var;
                                    }
                                    t0Var = i1Var;
                                }
                            }
                        }
                        if (thD != null) {
                            if (z11) {
                                lVar.invoke(thD);
                            }
                            return t0Var;
                        }
                        if (D(objE0, t1VarF, i1Var)) {
                            return i1Var;
                        }
                    } else {
                        thD = null;
                        if (thD != null) {
                            if (z11) {
                                lVar.invoke(thD);
                            }
                            return t0Var;
                        }
                        if (D(objE0, t1VarF, i1Var)) {
                            return i1Var;
                        }
                    }
                }
            }
        }
    }

    public final void m0(t1 t1Var, Throwable th) throws Throwable {
        y yVar = null;
        for (kd.k kVarO = (kd.k) t1Var.n(); !j0.d(kVarO, t1Var); kVarO = kVarO.o()) {
            if (kVarO instanceof l1) {
                n1 n1Var = (n1) kVarO;
                try {
                    n1Var.w(th);
                } catch (Throwable th2) {
                    if (yVar != null) {
                        jc.a.a(yVar, th2);
                    } else {
                        yVar = new y("Exception in completion handler " + n1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (yVar != null) {
            g0(yVar);
        }
        I(th);
    }

    @Override // fd.q
    public final void n(w1 w1Var) throws Throwable {
        G(w1Var);
    }

    public void n0(Object obj) {
    }

    public void o0() {
    }

    @Override // mc.f
    public mc.f p(mc.f.b<?> bVar) {
        return mc.f.a.C0363a.c(this, bVar);
    }

    public final void p0(n1 n1Var) {
        t1 t1Var = new t1();
        kd.k.f32047d.lazySet(t1Var, n1Var);
        kd.k.f32046c.lazySet(t1Var, n1Var);
        while (n1Var.n() == n1Var) {
            if (kd.k.f32046c.compareAndSet(n1Var, n1Var, t1Var)) {
                t1Var.m(n1Var);
                break;
            }
        }
        f29597c.compareAndSet(this, n1Var, n1Var.o());
    }

    @Override // fd.j1
    public final CancellationException q() {
        Object objE0 = e0();
        if (objE0 instanceof c) {
            Throwable thD = ((c) objE0).d();
            if (thD != null) {
                return s0(thD, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objE0 instanceof e1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objE0 instanceof v) {
            return t0(this, ((v) objE0).f29629a, null, 1, null);
        }
        return new k1(getClass().getSimpleName() + " has completed normally", null, this);
    }

    public final int q0(Object obj) {
        if (obj instanceof w0) {
            if (((w0) obj).f29633c) {
                return 0;
            }
            if (!f29597c.compareAndSet(this, obj, p1.f29614g)) {
                return -1;
            }
            o0();
            return 1;
        }
        if (!(obj instanceof d1)) {
            return 0;
        }
        if (!f29597c.compareAndSet(this, obj, ((d1) obj).f29561c)) {
            return -1;
        }
        o0();
        return 1;
    }

    public final String r0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof e1) {
                return ((e1) obj).a() ? "Active" : "New";
            }
            return obj instanceof v ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.e()) {
            return "Cancelling";
        }
        return cVar.g() ? "Completing" : "Active";
    }

    public final CancellationException s0(Throwable th, String str) {
        CancellationException k1Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (k1Var == null) {
            if (str == null) {
                str = L();
            }
            k1Var = new k1(str, th, this);
        }
        return k1Var;
    }

    @Override // fd.j1
    public final boolean start() {
        int iQ0;
        do {
            iQ0 = q0(e0());
            if (iQ0 == 0) {
                return false;
            }
        } while (iQ0 != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k0() + '{' + r0(e0()) + '}');
        sb2.append('@');
        sb2.append(j0.n(this));
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object u0(Object obj, Object obj2) throws Throwable {
        kd.z zVar;
        if (!(obj instanceof e1)) {
            return p1.f29608a;
        }
        boolean z10 = true;
        if (((obj instanceof w0) || (obj instanceof n1)) && !(obj instanceof p) && !(obj2 instanceof v)) {
            e1 e1Var = (e1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29597c;
            kd.z zVar2 = p1.f29608a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e1Var, obj2 instanceof e1 ? new f1((e1) obj2) : obj2)) {
                n0(obj2);
                N(e1Var, obj2);
            } else {
                z10 = false;
            }
            return z10 ? obj2 : p1.f29610c;
        }
        e1 e1Var2 = (e1) obj;
        t1 t1VarC0 = c0(e1Var2);
        if (t1VarC0 == null) {
            return p1.f29610c;
        }
        p pVarL0 = null;
        c cVar = e1Var2 instanceof c ? (c) e1Var2 : null;
        if (cVar == null) {
            cVar = new c(t1VarC0, false, null);
        }
        vc.a0 a0Var = new vc.a0();
        synchronized (cVar) {
            if (cVar.g()) {
                zVar = p1.f29608a;
            } else {
                cVar.j(true);
                if (cVar == e1Var2 || f29597c.compareAndSet(this, e1Var2, cVar)) {
                    boolean zE = cVar.e();
                    v vVar = obj2 instanceof v ? (v) obj2 : null;
                    if (vVar != null) {
                        cVar.b(vVar.f29629a);
                    }
                    ?? D = Boolean.valueOf(true ^ zE).booleanValue() ? cVar.d() : 0;
                    a0Var.f36988c = D;
                    if (D != 0) {
                        m0(t1VarC0, D);
                    }
                    p pVar = e1Var2 instanceof p ? (p) e1Var2 : null;
                    if (pVar == null) {
                        t1 t1VarF = e1Var2.f();
                        if (t1VarF != null) {
                            pVarL0 = l0(t1VarF);
                        }
                    } else {
                        pVarL0 = pVar;
                    }
                    return (pVarL0 == null || !v0(cVar, pVarL0, obj2)) ? U(cVar, obj2) : p1.f29609b;
                }
                zVar = p1.f29610c;
            }
            return zVar;
        }
    }

    public final boolean v0(c cVar, p pVar, Object obj) {
        while (j1.a.b(pVar.f29606g, false, false, new b(this, cVar, pVar, obj), 1, null) == u1.f29627c) {
            pVar = l0(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }
}
