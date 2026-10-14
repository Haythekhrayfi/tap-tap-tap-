package f8;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.w;
import kc.i0;
import kc.m;
import uc.l;
import y9.f7;
import y9.k;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements dd.g<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f29403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<k, Boolean> f29404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<k, w> f29405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29406d;

    /* JADX INFO: renamed from: f8.a$a, reason: collision with other inner class name */
    public static final class C0256a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f29407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<k, Boolean> f29408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l<k, w> f29409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<? extends k> f29411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29412f;

        /* JADX WARN: Multi-variable type inference failed */
        public C0256a(k kVar, l<? super k, Boolean> lVar, l<? super k, w> lVar2) {
            j0.i(kVar, "div");
            this.f29407a = kVar;
            this.f29408b = lVar;
            this.f29409c = lVar2;
        }

        @Override // f8.a.d
        public k a() {
            return this.f29407a;
        }

        @Override // f8.a.d
        public k b() {
            ArrayList arrayList;
            if (!this.f29410d) {
                l<k, Boolean> lVar = this.f29408b;
                boolean z10 = false;
                if (lVar != null && !lVar.invoke(this.f29407a).booleanValue()) {
                    z10 = true;
                }
                if (z10) {
                    return null;
                }
                this.f29410d = true;
                return this.f29407a;
            }
            List<? extends k> list = this.f29411e;
            if (list == null) {
                k kVar = this.f29407a;
                if ((kVar instanceof k.q) || (kVar instanceof k.h) || (kVar instanceof k.f) || (kVar instanceof k.m) || (kVar instanceof k.i) || (kVar instanceof k.n) || (kVar instanceof k.j) || (kVar instanceof k.d) || (kVar instanceof k.l) || (kVar instanceof k.r)) {
                    list = kc.w.f32009c;
                } else if (kVar instanceof k.c) {
                    list = ((k.c) kVar).f40976c.f43638t;
                } else if (kVar instanceof k.g) {
                    list = ((k.g) kVar).f40980c.f39044t;
                } else if (kVar instanceof k.e) {
                    list = ((k.e) kVar).f40978c.f42724r;
                } else if (kVar instanceof k.C0475k) {
                    list = ((k.C0475k) kVar).f40984c.f42306o;
                } else {
                    if (kVar instanceof k.p) {
                        List<f7.e> list2 = ((k.p) kVar).f40989c.f40008o;
                        arrayList = new ArrayList(m.j(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((f7.e) it.next()).f40026a);
                        }
                    } else {
                        if (!(kVar instanceof k.o)) {
                            throw new jc.g();
                        }
                        List<x6.f> list3 = ((k.o) kVar).f40988c.f44147s;
                        arrayList = new ArrayList();
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            k kVar2 = ((x6.f) it2.next()).f44164c;
                            if (kVar2 != null) {
                                arrayList.add(kVar2);
                            }
                        }
                    }
                    list = arrayList;
                }
                this.f29411e = list;
            }
            if (this.f29412f < list.size()) {
                int i10 = this.f29412f;
                this.f29412f = i10 + 1;
                return (k) list.get(i10);
            }
            l<k, w> lVar2 = this.f29409c;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(this.f29407a);
            return null;
        }
    }

    public final class b extends kc.b<k> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final kc.f<d> f29413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f29414f;

        public b(a aVar, k kVar) {
            j0.i(aVar, "this$0");
            j0.i(kVar, "root");
            this.f29414f = aVar;
            kc.f<d> fVar = new kc.f<>();
            fVar.a(c(kVar));
            this.f29413e = fVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, y9.k] */
        @Override // kc.b
        public void a() {
            ?? B = b();
            if (B == 0) {
                this.f31987c = i0.Done;
            } else {
                this.f31988d = B;
                this.f31987c = i0.Ready;
            }
        }

        public final k b() {
            d dVarF = this.f29413e.f();
            if (dVarF == null) {
                return null;
            }
            k kVarB = dVarF.b();
            if (kVarB == null) {
                this.f29413e.j();
            } else {
                if (j0.d(kVarB, dVarF.a())) {
                    return kVarB;
                }
                j0.i(kVarB, "<this>");
                if ((!f8.b.e(kVarB)) || this.f29413e.size() >= this.f29414f.f29406d) {
                    return kVarB;
                }
                this.f29413e.a(c(kVarB));
            }
            return b();
        }

        public final d c(k kVar) {
            if (!f8.b.e(kVar)) {
                return new c(kVar);
            }
            a aVar = this.f29414f;
            return new C0256a(kVar, aVar.f29404b, aVar.f29405c);
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f29415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29416b;

        public c(k kVar) {
            j0.i(kVar, "div");
            this.f29415a = kVar;
        }

        @Override // f8.a.d
        public k a() {
            return this.f29415a;
        }

        @Override // f8.a.d
        public k b() {
            if (this.f29416b) {
                return null;
            }
            this.f29416b = true;
            return this.f29415a;
        }
    }

    public interface d {
        k a();

        k b();
    }

    public a(k kVar) {
        j0.i(kVar, "root");
        this.f29403a = kVar;
        this.f29404b = null;
        this.f29405c = null;
        this.f29406d = Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(k kVar, l<? super k, Boolean> lVar, l<? super k, w> lVar2, int i10) {
        this.f29403a = kVar;
        this.f29404b = lVar;
        this.f29405c = lVar2;
        this.f29406d = i10;
    }

    public final a b(l<? super k, Boolean> lVar) {
        j0.i(lVar, "predicate");
        return new a(this.f29403a, lVar, this.f29405c, this.f29406d);
    }

    @Override // dd.g
    public Iterator<k> iterator() {
        return new b(this, this.f29403a);
    }
}
