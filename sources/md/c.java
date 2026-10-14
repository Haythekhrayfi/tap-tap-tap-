package md;

import fd.i;
import fd.j;
import fd.t0;
import fd.x1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jc.w;
import kd.k;
import kd.u;
import vc.l;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements md.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33543a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    public final class a extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i<w> f33544h;

        /* JADX INFO: renamed from: md.c$a$a, reason: collision with other inner class name */
        public static final class C0364a extends l implements uc.l<Throwable, w> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f33546c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f33547d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0364a(c cVar, a aVar) {
                super(1);
                this.f33546c = cVar;
                this.f33547d = aVar;
            }

            @Override // uc.l
            public w invoke(Throwable th) {
                this.f33546c.a(this.f33547d.f33549f);
                return w.f31842a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, i<? super w> iVar) {
            super(c.this, obj);
            this.f33544h = iVar;
        }

        @Override // kd.k
        public String toString() {
            StringBuilder sbA = defpackage.a.a("LockCont[");
            sbA.append(this.f33549f);
            sbA.append(", ");
            sbA.append(this.f33544h);
            sbA.append("] for ");
            sbA.append(c.this);
            return sbA.toString();
        }

        @Override // md.c.b
        public void w() {
            this.f33544h.B(fd.l.f29590a);
        }

        @Override // md.c.b
        public boolean x() {
            return b.f33548g.compareAndSet(this, 0, 1) && this.f33544h.l(w.f31842a, null, new C0364a(c.this, this)) != null;
        }
    }

    public abstract class b extends k implements t0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f33548g = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f33549f;
        private volatile /* synthetic */ int isTaken = 0;

        public b(c cVar, Object obj) {
            this.f33549f = obj;
        }

        @Override // fd.t0
        public final void dispose() {
            t();
        }

        public abstract void w();

        public abstract boolean x();
    }

    /* JADX INFO: renamed from: md.c$c, reason: collision with other inner class name */
    public static final class C0365c extends kd.i {
        public volatile Object owner;

        public C0365c(Object obj) {
            this.owner = obj;
        }

        @Override // kd.k
        public String toString() {
            StringBuilder sbA = defpackage.a.a("LockedQueue[");
            sbA.append(this.owner);
            sbA.append(']');
            return sbA.toString();
        }
    }

    public static final class d extends kd.d<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0365c f33550b;

        public d(C0365c c0365c) {
            this.f33550b = c0365c;
        }

        @Override // kd.d
        public void c(c cVar, Object obj) {
            c.f33543a.compareAndSet(cVar, this, obj == null ? e.f33557e : this.f33550b);
        }

        @Override // kd.d
        public Object e(c cVar) {
            C0365c c0365c = this.f33550b;
            if (c0365c.n() == c0365c) {
                return null;
            }
            return e.f33553a;
        }
    }

    public c(boolean z10) {
        this._state = z10 ? e.f33556d : e.f33557e;
    }

    @Override // md.b
    public void a(Object obj) {
        k kVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof md.a) {
                md.a aVar = (md.a) obj2;
                if (obj == null) {
                    if (!(aVar.f33542a != e.f33555c)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (!(aVar.f33542a == obj)) {
                        StringBuilder sbA = defpackage.a.a("Mutex is locked by ");
                        sbA.append(aVar.f33542a);
                        sbA.append(" but expected ");
                        sbA.append(obj);
                        throw new IllegalStateException(sbA.toString().toString());
                    }
                }
                if (f33543a.compareAndSet(this, obj2, e.f33557e)) {
                    return;
                }
            } else if (obj2 instanceof u) {
                ((u) obj2).b(this);
            } else {
                if (!(obj2 instanceof C0365c)) {
                    throw new IllegalStateException(j.a("Illegal state ", obj2));
                }
                if (obj != null) {
                    C0365c c0365c = (C0365c) obj2;
                    if (!(c0365c.owner == obj)) {
                        StringBuilder sbA2 = defpackage.a.a("Mutex is locked by ");
                        sbA2.append(c0365c.owner);
                        sbA2.append(" but expected ");
                        sbA2.append(obj);
                        throw new IllegalStateException(sbA2.toString().toString());
                    }
                }
                C0365c c0365c2 = (C0365c) obj2;
                while (true) {
                    kVar = (k) c0365c2.n();
                    if (kVar == c0365c2) {
                        kVar = null;
                        break;
                    } else if (kVar.t()) {
                        break;
                    } else {
                        kVar.q();
                    }
                }
                if (kVar == null) {
                    d dVar = new d(c0365c2);
                    if (f33543a.compareAndSet(this, obj2, dVar) && dVar.b(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) kVar;
                    if (bVar.x()) {
                        Object obj3 = bVar.f33549f;
                        if (obj3 == null) {
                            obj3 = e.f33554b;
                        }
                        c0365c2.owner = obj3;
                        bVar.w();
                        return;
                    }
                }
            }
        }
    }

    @Override // md.b
    public Object b(Object obj, mc.d<? super w> dVar) {
        boolean z10;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof md.a) {
                if (((md.a) obj2).f33542a != e.f33555c) {
                    z10 = false;
                    break;
                }
                if (f33543a.compareAndSet(this, obj2, e.f33556d)) {
                    z10 = true;
                    break;
                }
            } else {
                if (obj2 instanceof C0365c) {
                    if (!(((C0365c) obj2).owner != null)) {
                        throw new IllegalStateException("Already locked by null".toString());
                    }
                    z10 = false;
                    break;
                }
                if (!(obj2 instanceof u)) {
                    throw new IllegalStateException(j.a("Illegal state ", obj2));
                }
                ((u) obj2).b(this);
            }
        }
        if (z10) {
            return w.f31842a;
        }
        fd.k kVarK = c0.k(nc.b.c(dVar));
        a aVar = new a(null, kVarK);
        while (true) {
            Object obj3 = this._state;
            if (obj3 instanceof md.a) {
                md.a aVar2 = (md.a) obj3;
                if (aVar2.f33542a != e.f33555c) {
                    f33543a.compareAndSet(this, obj3, new C0365c(aVar2.f33542a));
                } else {
                    if (f33543a.compareAndSet(this, obj3, e.f33556d)) {
                        kVarK.G(w.f31842a, kVarK.f29617e, new md.d(this, null));
                        break;
                    }
                }
            } else if (obj3 instanceof C0365c) {
                C0365c c0365c = (C0365c) obj3;
                if (!(c0365c.owner != null)) {
                    throw new IllegalStateException("Already locked by null".toString());
                }
                while (!c0365c.p().k(aVar, c0365c)) {
                }
                if (this._state == obj3 || !b.f33548g.compareAndSet(aVar, 0, 1)) {
                    kVarK.s(new x1(aVar));
                    break;
                }
                aVar = new a(null, kVarK);
            } else {
                if (!(obj3 instanceof u)) {
                    throw new IllegalStateException(j.a("Illegal state ", obj3));
                }
                ((u) obj3).b(this);
            }
        }
        Object objR = kVarK.r();
        nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
        if (objR != aVar3) {
            objR = w.f31842a;
        }
        return objR == aVar3 ? objR : w.f31842a;
    }

    public String toString() {
        StringBuilder sbA;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof md.a) {
                sbA = defpackage.a.a("Mutex[");
                obj = ((md.a) obj2).f33542a;
                break;
            }
            if (!(obj2 instanceof u)) {
                if (!(obj2 instanceof C0365c)) {
                    throw new IllegalStateException(j.a("Illegal state ", obj2));
                }
                sbA = defpackage.a.a("Mutex[");
                obj = ((C0365c) obj2).owner;
                break;
            }
            ((u) obj2).b(this);
        }
        sbA.append(obj);
        sbA.append(']');
        return sbA.toString();
    }
}
