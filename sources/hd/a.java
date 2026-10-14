package hd;

import fd.j0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kd.z;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<E> extends hd.c<E> implements f<E> {

    /* JADX INFO: renamed from: hd.a$a, reason: collision with other inner class name */
    public static class C0306a<E> extends q<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final fd.i<Object> f31071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f31072g;

        public C0306a(fd.i<Object> iVar, int i10) {
            this.f31071f = iVar;
            this.f31072g = i10;
        }

        @Override // hd.s
        public z h(E e10, kd.k.c cVar) {
            Object hVar;
            fd.i<Object> iVar = this.f31071f;
            if (this.f31072g == 1) {
                Objects.requireNonNull(h.f31100b);
                h.b bVar = h.f31100b;
                hVar = new h(e10);
            } else {
                hVar = e10;
            }
            if (iVar.l(hVar, null, w(e10)) == null) {
                return null;
            }
            return fd.l.f29590a;
        }

        @Override // hd.s
        public void i(E e10) {
            this.f31071f.B(fd.l.f29590a);
        }

        @Override // kd.k
        public String toString() {
            StringBuilder sbA = defpackage.a.a("ReceiveElement@");
            sbA.append(j0.n(this));
            sbA.append("[receiveMode=");
            return h0.f.a(sbA, this.f31072g, ']');
        }

        @Override // hd.q
        public void x(i<?> iVar) {
            if (this.f31072g == 1) {
                fd.i<Object> iVar2 = this.f31071f;
                h hVar = new h(h.f31100b.a(iVar.f31104f));
                jc.i.a aVar = jc.i.f31813c;
                iVar2.resumeWith(hVar);
                return;
            }
            fd.i<Object> iVar3 = this.f31071f;
            jc.i.a aVar2 = jc.i.f31813c;
            Throwable jVar = iVar.f31104f;
            if (jVar == null) {
                jVar = new j("Channel was closed");
            }
            iVar3.resumeWith(h9.d.f(jVar));
        }
    }

    public static final class b<E> extends C0306a<E> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final uc.l<E, jc.w> f31073h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(fd.i<Object> iVar, int i10, uc.l<? super E, jc.w> lVar) {
            super(iVar, i10);
            this.f31073h = lVar;
        }

        @Override // hd.q
        public uc.l<Throwable, jc.w> w(E e10) {
            return new kd.s(this.f31073h, e10, this.f31071f.getContext());
        }
    }

    public final class c extends fd.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<?> f31074c;

        public c(q<?> qVar) {
            this.f31074c = qVar;
        }

        @Override // fd.h
        public void a(Throwable th) {
            if (this.f31074c.t()) {
                Objects.requireNonNull(a.this);
            }
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            if (this.f31074c.t()) {
                Objects.requireNonNull(a.this);
            }
            return jc.w.f31842a;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("RemoveReceiveOnCancel[");
            sbA.append(this.f31074c);
            sbA.append(']');
            return sbA.toString();
        }
    }

    public static final class d extends kd.k.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f31076d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kd.k kVar, a aVar) {
            super(kVar);
            this.f31076d = aVar;
        }

        @Override // kd.d
        public Object e(kd.k kVar) {
            if (this.f31076d.q()) {
                return null;
            }
            return kd.j.f32045a;
        }
    }

    @oc.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    public static final class e extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f31077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<E> f31078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f31079e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a<E> aVar, mc.d<? super e> dVar) {
            super(dVar);
            this.f31078d = aVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31077c = obj;
            this.f31079e |= Integer.MIN_VALUE;
            Object objF = this.f31078d.f(this);
            return objF == nc.a.COROUTINE_SUSPENDED ? objF : new h(objF);
        }
    }

    public a(uc.l<? super E, jc.w> lVar) {
        super(lVar);
    }

    @Override // hd.r
    public final void c(CancellationException cancellationException) {
        if (s()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
        }
        t(v(cancellationException));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hd.r
    public final Object f(mc.d<? super h<? extends E>> dVar) {
        e eVar;
        Object hVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f31079e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f31079e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object objR = eVar.f31077c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = eVar.f31079e;
        if (i11 == 0) {
            h9.d.t(objR);
            Object objX = x();
            if (objX != hd.b.f31083d) {
                if (objX instanceof i) {
                    return h.f31100b.a(((i) objX).f31104f);
                }
                Objects.requireNonNull(h.f31100b);
                h.b bVar = h.f31100b;
                return objX;
            }
            eVar.f31079e = 1;
            fd.k kVarK = c0.k(nc.b.c(eVar));
            C0306a c0306a = this.f31087c == null ? new C0306a(kVarK, 1) : new b(kVarK, 1, this.f31087c);
            while (true) {
                if (o(c0306a)) {
                    kVarK.s(new c(c0306a));
                    break;
                }
                Object objX2 = x();
                if (objX2 instanceof i) {
                    c0306a.x((i) objX2);
                    break;
                }
                if (objX2 != hd.b.f31083d) {
                    if (c0306a.f31072g == 1) {
                        Objects.requireNonNull(h.f31100b);
                        h.b bVar2 = h.f31100b;
                        hVar = new h(objX2);
                    } else {
                        hVar = objX2;
                    }
                    kVarK.F(hVar, c0306a.w(objX2));
                    break;
                }
            }
            objR = kVarK.r();
            if (objR == nc.a.COROUTINE_SUSPENDED) {
                j0.i(eVar, "frame");
            }
            if (objR == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objR);
        }
        return ((h) objR).f31102a;
    }

    @Override // hd.c
    public s<E> l() {
        s<E> sVarL = super.l();
        if (sVarL != null) {
            boolean z10 = sVarL instanceof i;
        }
        return sVarL;
    }

    public boolean o(q<? super E> qVar) {
        int iV;
        kd.k kVarP;
        if (!p()) {
            kd.k kVar = this.f31088d;
            d dVar = new d(qVar, this);
            do {
                kd.k kVarP2 = kVar.p();
                if (!(!(kVarP2 instanceof u))) {
                    break;
                }
                iV = kVarP2.v(qVar, kVar, dVar);
                if (iV == 1) {
                    return true;
                }
            } while (iV != 2);
        } else {
            kd.k kVar2 = this.f31088d;
            do {
                kVarP = kVar2.p();
                if (!(!(kVarP instanceof u))) {
                }
            } while (!kVarP.k(qVar, kVar2));
            return true;
        }
        return false;
    }

    public abstract boolean p();

    public abstract boolean q();

    @Override // hd.r
    public final Object r() {
        Object objX = x();
        if (objX == hd.b.f31083d) {
            Objects.requireNonNull(h.f31100b);
            return h.f31101c;
        }
        if (objX instanceof i) {
            return h.f31100b.a(((i) objX).f31104f);
        }
        Objects.requireNonNull(h.f31100b);
        h.b bVar = h.f31100b;
        return objX;
    }

    public boolean s() {
        kd.k kVarO = this.f31088d.o();
        i<?> iVar = null;
        i<?> iVar2 = kVarO instanceof i ? (i) kVarO : null;
        if (iVar2 != null) {
            g(iVar2);
            iVar = iVar2;
        }
        return iVar != null && q();
    }

    public void t(boolean z10) {
        i<?> iVarE = e();
        if (iVarE == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objZ = null;
        while (true) {
            kd.k kVarP = iVarE.p();
            if (kVarP instanceof kd.i) {
                w(objZ, iVarE);
                return;
            } else if (kVarP.t()) {
                objZ = fd.z.z(objZ, (u) kVarP);
            } else {
                kVarP.q();
            }
        }
    }

    public void w(Object obj, i<?> iVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((u) obj).y(iVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((u) arrayList.get(size)).y(iVar);
            }
        }
    }

    public Object x() {
        while (true) {
            u uVarM = m();
            if (uVarM == null) {
                return hd.b.f31083d;
            }
            if (uVarM.z(null) != null) {
                uVarM.w();
                return uVarM.x();
            }
            uVarM.A();
        }
    }
}
