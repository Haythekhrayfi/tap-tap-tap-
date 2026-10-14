package hd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import fd.x1;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.f0;
import kd.y;
import kd.z;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<E> implements v<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31086e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.l<E, jc.w> f31087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kd.i f31088d = new kd.i();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends u {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final E f31089f;

        public a(E e10) {
            this.f31089f = e10;
        }

        @Override // kd.k
        public String toString() {
            StringBuilder sbA = defpackage.a.a("SendBuffered@");
            sbA.append(j0.n(this));
            sbA.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sbA.append(this.f31089f);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }

        @Override // hd.u
        public void w() {
        }

        @Override // hd.u
        public Object x() {
            return this.f31089f;
        }

        @Override // hd.u
        public void y(i<?> iVar) {
        }

        @Override // hd.u
        public z z(kd.k.c cVar) {
            return fd.l.f29590a;
        }
    }

    public static final class b extends kd.k.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f31090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kd.k kVar, c cVar) {
            super(kVar);
            this.f31090d = cVar;
        }

        @Override // kd.d
        public Object e(kd.k kVar) {
            if (this.f31090d.i()) {
                return null;
            }
            return kd.j.f32045a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(uc.l<? super E, jc.w> lVar) {
        this.f31087c = lVar;
    }

    public static final void a(c cVar, mc.d dVar, Object obj, i iVar) {
        Object objF;
        f0 f0VarA;
        cVar.g(iVar);
        Throwable thB = iVar.B();
        uc.l<E, jc.w> lVar = cVar.f31087c;
        if (lVar == null || (f0VarA = kd.t.a(lVar, obj, null)) == null) {
            jc.i.a aVar = jc.i.f31813c;
            objF = h9.d.f(thB);
        } else {
            jc.a.a(f0VarA, thB);
            jc.i.a aVar2 = jc.i.f31813c;
            objF = h9.d.f(f0VarA);
        }
        ((fd.k) dVar).resumeWith(objF);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x0039 A[ORIG_RETURN, RETURN] */
    public Object b(u uVar) {
        int iV;
        boolean z10;
        kd.k kVarP;
        if (h()) {
            kd.k kVar = this.f31088d;
            do {
                kVarP = kVar.p();
                if (kVarP instanceof s) {
                    return kVarP;
                }
            } while (!kVarP.k(uVar, kVar));
            return null;
        }
        kd.k kVar2 = this.f31088d;
        b bVar = new b(uVar, this);
        do {
            kd.k kVarP2 = kVar2.p();
            if (kVarP2 instanceof s) {
                return kVarP2;
            }
            iV = kVarP2.v(uVar, kVar2, bVar);
            z10 = true;
            if (iV != 1) {
            }
            if (z10) {
                return null;
            }
            return hd.b.f31084e;
        } while (iV != 2);
        z10 = false;
        if (z10) {
            return hd.b.f31084e;
        }
        return null;
    }

    public String d() {
        return "";
    }

    public final i<?> e() {
        kd.k kVarP = this.f31088d.p();
        i<?> iVar = kVarP instanceof i ? (i) kVarP : null;
        if (iVar == null) {
            return null;
        }
        g(iVar);
        return iVar;
    }

    public final void g(i<?> iVar) {
        Object objZ = null;
        while (true) {
            kd.k kVarP = iVar.p();
            q qVar = kVarP instanceof q ? (q) kVarP : null;
            if (qVar == null) {
                break;
            } else if (qVar.t()) {
                objZ = fd.z.z(objZ, qVar);
            } else {
                qVar.q();
            }
        }
        if (objZ != null) {
            if (!(objZ instanceof ArrayList)) {
                ((q) objZ).x(iVar);
                return;
            }
            ArrayList arrayList = (ArrayList) objZ;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((q) arrayList.get(size)).x(iVar);
            }
        }
    }

    public abstract boolean h();

    public abstract boolean i();

    public Object j(E e10) {
        s<E> sVarL;
        do {
            sVarL = l();
            if (sVarL == null) {
                return hd.b.f31082c;
            }
        } while (sVarL.h(e10, null) == null);
        sVarL.i(e10);
        return sVarL.d();
    }

    @Override // hd.v
    public void k(uc.l<? super Throwable, jc.w> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31086e;
        if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
            i<?> iVarE = e();
            if (iVarE == null || !atomicReferenceFieldUpdater.compareAndSet(this, lVar, hd.b.f31085f)) {
                return;
            }
            lVar.invoke(iVarE.f31104f);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == hd.b.f31085f) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kd.k] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public s<E> l() {
        ?? r10;
        kd.k kVarU;
        kd.i iVar = this.f31088d;
        while (true) {
            r10 = (kd.k) iVar.n();
            if (r10 == iVar || !(r10 instanceof s)) {
                break;
            }
            if ((!(((s) r10) instanceof i) || r10.s()) && (kVarU = r10.u()) != null) {
                kVarU.r();
            }
            return (s) r10;
        }
        r10 = 0;
        return (s) r10;
    }

    public final u m() {
        kd.k kVar;
        kd.k kVarU;
        kd.i iVar = this.f31088d;
        while (true) {
            kVar = (kd.k) iVar.n();
            if (kVar == iVar || !(kVar instanceof u)) {
                break;
            }
            if ((!(((u) kVar) instanceof i) || kVar.s()) && (kVarU = kVar.u()) != null) {
                kVarU.r();
            }
            return (u) kVar;
        }
        kVar = null;
        return (u) kVar;
    }

    public final Object n(E e10) {
        h.b bVar;
        i<?> iVarE;
        Object objJ = j(e10);
        if (objJ == hd.b.f31081b) {
            h.b bVar2 = h.f31100b;
            jc.w wVar = jc.w.f31842a;
            Objects.requireNonNull(bVar2);
            h.b bVar3 = h.f31100b;
            return wVar;
        }
        if (objJ == hd.b.f31082c) {
            iVarE = e();
            if (iVarE == null) {
                Objects.requireNonNull(h.f31100b);
                return h.f31101c;
            }
            bVar = h.f31100b;
        } else {
            if (!(objJ instanceof i)) {
                throw new IllegalStateException(fd.j.a("trySend returned ", objJ));
            }
            bVar = h.f31100b;
            iVarE = (i) objJ;
        }
        g(iVarE);
        return bVar.a(iVarE.B());
    }

    @Override // hd.v
    public boolean offer(E e10) {
        f0 f0VarA;
        try {
            Object objN = n(e10);
            h.b bVar = h.f31100b;
            if (!(objN instanceof h.c)) {
                return true;
            }
            h.a aVar = objN instanceof h.a ? (h.a) objN : null;
            Throwable th = aVar != null ? aVar.f31103a : null;
            if (th == null) {
                return false;
            }
            String str = y.f32072a;
            throw th;
        } catch (Throwable th2) {
            uc.l<E, jc.w> lVar = this.f31087c;
            if (lVar == null || (f0VarA = kd.t.a(lVar, e10, null)) == null) {
                throw th2;
            }
            jc.a.a(f0VarA, th2);
            throw f0VarA;
        }
    }

    public String toString() {
        String string;
        String string2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(j0.n(this));
        sb2.append('{');
        kd.k kVarO = this.f31088d.o();
        if (kVarO == this.f31088d) {
            string2 = "EmptyQueue";
        } else {
            if (kVarO instanceof i) {
                string = kVarO.toString();
            } else if (kVarO instanceof q) {
                string = "ReceiveQueued";
            } else if (kVarO instanceof u) {
                string = "SendQueued";
            } else {
                string = "UNEXPECTED:" + kVarO;
            }
            kd.k kVarP = this.f31088d.p();
            if (kVarP != kVarO) {
                StringBuilder sbA = android.support.v4.media.c.a(string, ",queueSize=");
                kd.i iVar = this.f31088d;
                int i10 = 0;
                for (kd.k kVarO2 = (kd.k) iVar.n(); !j0.d(kVarO2, iVar); kVarO2 = kVarO2.o()) {
                    if (kVarO2 instanceof kd.k) {
                        i10++;
                    }
                }
                sbA.append(i10);
                string2 = sbA.toString();
                if (kVarP instanceof i) {
                    string2 = string2 + ",closedForSend=" + kVarP;
                }
            } else {
                string2 = string;
            }
        }
        sb2.append(string2);
        sb2.append('}');
        sb2.append(d());
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[EDGE_INSN: B:38:0x007f->B:39:0x0084 BREAK  A[LOOP:0: B:7:0x0013->B:56:?]] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[LOOP:0: B:7:0x0013->B:56:?, LOOP_END, SYNTHETIC] */
    @Override // hd.v
    public final Object u(E e10, mc.d<? super jc.w> dVar) {
        Object objJ;
        if (j(e10) == hd.b.f31081b) {
            return jc.w.f31842a;
        }
        fd.k kVarK = c0.k(nc.b.c(dVar));
        while (true) {
            if (!(this.f31088d.o() instanceof s) && i()) {
                u wVar = this.f31087c == null ? new w(e10, kVarK) : new x(e10, kVarK, this.f31087c);
                Object objB = b(wVar);
                if (objB == null) {
                    kVarK.s(new x1(wVar));
                    break;
                }
                if (objB instanceof i) {
                    a(this, kVarK, e10, (i) objB);
                    break;
                }
                if (objB != hd.b.f31084e && !(objB instanceof q)) {
                    throw new IllegalStateException(fd.j.a("enqueueSend returned ", objB));
                }
                objJ = j(e10);
                if (objJ == hd.b.f31081b) {
                    jc.i.a aVar = jc.i.f31813c;
                    kVarK.resumeWith(jc.w.f31842a);
                    break;
                }
                if (objJ != hd.b.f31082c) {
                    if (objJ instanceof i) {
                        throw new IllegalStateException(fd.j.a("offerInternal returned ", objJ));
                    }
                    a(this, kVarK, e10, (i) objJ);
                    break;
                }
            } else {
                objJ = j(e10);
                if (objJ == hd.b.f31081b) {
                    jc.i.a aVar2 = jc.i.f31813c;
                    kVarK.resumeWith(jc.w.f31842a);
                    break;
                }
                if (objJ != hd.b.f31082c) {
                    if (objJ instanceof i) {
                        throw new IllegalStateException(fd.j.a("offerInternal returned ", objJ));
                    }
                    a(this, kVarK, e10, (i) objJ);
                    break;
                }
            }
        }
        Object objR = kVarK.r();
        nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
        if (objR == aVar3) {
            j0.i(dVar, "frame");
        }
        if (objR != aVar3) {
            objR = jc.w.f31842a;
        }
        return objR == aVar3 ? objR : jc.w.f31842a;
    }

    @Override // hd.v
    public boolean v(Throwable th) {
        boolean z10;
        Object obj;
        z zVar;
        i<?> iVar = new i<>(th);
        kd.k kVar = this.f31088d;
        while (true) {
            kd.k kVarP = kVar.p();
            if (!(!(kVarP instanceof i))) {
                z10 = false;
                break;
            }
            if (kVarP.k(iVar, kVar)) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            iVar = (i) this.f31088d.p();
        }
        g(iVar);
        if (z10 && (obj = this.onCloseHandler) != null && obj != (zVar = hd.b.f31085f) && f31086e.compareAndSet(this, obj, zVar)) {
            vc.f0.c(obj, 1);
            ((uc.l) obj).invoke(th);
        }
        return z10;
    }

    @Override // hd.v
    public final boolean z() {
        return e() != null;
    }
}
