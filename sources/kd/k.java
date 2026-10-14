package kd;

import fd.j0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32046c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32047d = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32048e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends kd.b {
        public abstract void a(c cVar);
    }

    public static abstract class b extends kd.d<k> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f32049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f32050c;

        public b(k kVar) {
            this.f32049b = kVar;
        }

        @Override // kd.d
        public void c(k kVar, Object obj) {
            k kVar2 = kVar;
            boolean z10 = obj == null;
            k kVar3 = z10 ? this.f32049b : this.f32050c;
            if (kVar3 != null && k.f32046c.compareAndSet(kVar2, this, kVar3) && z10) {
                k kVar4 = this.f32049b;
                k kVar5 = this.f32050c;
                j0.f(kVar5);
                kVar4.m(kVar5);
            }
        }
    }

    public static final class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f32051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f32052b;

        public c(k kVar, k kVar2, a aVar) {
            this.f32051a = kVar2;
            this.f32052b = aVar;
        }

        @Override // kd.u
        public kd.d<?> a() {
            Objects.requireNonNull(this.f32052b);
            j0.r("atomicOp");
            throw null;
        }

        @Override // kd.u
        public Object b(Object obj) {
            k kVar = (k) obj;
            this.f32052b.a(this);
            Object obj2 = l.f32053a;
            if (obj2 != null) {
                a();
                throw null;
            }
            k kVar2 = this.f32051a;
            if (k.f32046c.compareAndSet(kVar, this, k.j(kVar2))) {
                Objects.requireNonNull(this.f32052b);
                kVar2.l(null);
            }
            return obj2;
        }

        @Override // kd.u
        public String toString() {
            new StringBuilder().append("PrepareOp(op=");
            a();
            throw null;
        }
    }

    public static final v j(k kVar) {
        v vVar = (v) kVar._removedRef;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(kVar);
        f32048e.lazySet(kVar, vVar2);
        return vVar2;
    }

    public final boolean k(k kVar, k kVar2) {
        f32047d.lazySet(kVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32046c;
        atomicReferenceFieldUpdater.lazySet(kVar, kVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, kVar)) {
            return false;
        }
        kVar.m(kVar2);
        return true;
    }

    public final k l(u uVar) {
        Object obj;
        while (true) {
            k kVar = (k) this._prev;
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    obj = kVar2._next;
                    if (obj == this) {
                        if (kVar != kVar2 && !f32047d.compareAndSet(this, kVar, kVar2)) {
                            break;
                        }
                        return kVar2;
                    }
                    if (s()) {
                        return null;
                    }
                    if (obj == uVar) {
                        return kVar2;
                    }
                    if (obj instanceof u) {
                        if (uVar != null) {
                            u uVar2 = (u) obj;
                            if (uVar.a() != null) {
                                uVar2.a();
                            }
                        }
                        ((u) obj).b(kVar2);
                        break;
                    }
                    if (!(obj instanceof v)) {
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) kVar2._prev;
                    }
                }
                if (!f32046c.compareAndSet(kVar3, kVar2, ((v) obj).f32070a)) {
                    break;
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void m(k kVar) {
        k kVar2;
        do {
            kVar2 = (k) kVar._prev;
            if (n() != kVar) {
                return;
            }
        } while (!f32047d.compareAndSet(kVar, kVar2, this));
        if (s()) {
            kVar.l(null);
        }
    }

    public final Object n() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof u)) {
                return obj;
            }
            ((u) obj).b(this);
        }
    }

    public final k o() {
        k kVar;
        Object objN = n();
        Object obj = j.f32045a;
        v vVar = objN instanceof v ? (v) objN : null;
        return (vVar == null || (kVar = vVar.f32070a) == null) ? (k) objN : kVar;
    }

    public final k p() {
        k kVarL = l(null);
        if (kVarL == null) {
            Object obj = this._prev;
            while (true) {
                kVarL = (k) obj;
                if (!kVarL.s()) {
                    break;
                }
                obj = kVarL._prev;
            }
        }
        return kVarL;
    }

    public final void q() {
        ((v) n()).f32070a.r();
    }

    public final void r() {
        k kVar = this;
        while (true) {
            Object objN = kVar.n();
            if (!(objN instanceof v)) {
                kVar.l(null);
                return;
            }
            kVar = ((v) objN).f32070a;
        }
    }

    public boolean s() {
        return n() instanceof v;
    }

    public boolean t() {
        return u() == null;
    }

    public String toString() {
        return new vc.r(this) { // from class: kd.k.d
            @Override // vc.r, cd.g
            public Object get() {
                return j0.m(this.receiver);
            }
        } + '@' + j0.n(this);
    }

    public final k u() {
        Object objN;
        k kVar;
        v vVar;
        do {
            objN = n();
            if (objN instanceof v) {
                return ((v) objN).f32070a;
            }
            if (objN == this) {
                return (k) objN;
            }
            kVar = (k) objN;
            vVar = (v) kVar._removedRef;
            if (vVar == null) {
                vVar = new v(kVar);
                f32048e.lazySet(kVar, vVar);
            }
        } while (!f32046c.compareAndSet(this, objN, vVar));
        kVar.l(null);
        return null;
    }

    public final int v(k kVar, k kVar2, b bVar) {
        f32047d.lazySet(kVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32046c;
        atomicReferenceFieldUpdater.lazySet(kVar, kVar2);
        bVar.f32050c = kVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, kVar2, bVar)) {
            return bVar.b(this) == null ? 1 : 2;
        }
        return 0;
    }
}
