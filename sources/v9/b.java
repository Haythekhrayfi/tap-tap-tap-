package v9;

import ed.u;
import fd.j0;
import h9.k;
import h9.m;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import jc.w;
import u9.f;
import uc.l;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36747a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<Object, b<?>> f36748b = new ConcurrentHashMap<>(1000);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final <T> b<T> a(T t10) {
            j0.i(t10, "value");
            ConcurrentHashMap<Object, b<?>> concurrentHashMap = b.f36748b;
            Object c0438b = concurrentHashMap.get(t10);
            if (c0438b == null) {
                c0438b = new C0438b(t10);
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(t10, (b<?>) c0438b);
                if (objPutIfAbsent != null) {
                    c0438b = objPutIfAbsent;
                }
            }
            return (b) c0438b;
        }
    }

    /* JADX INFO: renamed from: v9.b$b, reason: collision with other inner class name */
    public static final class C0438b<T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f36749c;

        public C0438b(T t10) {
            j0.i(t10, "value");
            this.f36749c = t10;
        }

        @Override // v9.b
        public T b(d dVar) {
            j0.i(dVar, "resolver");
            return this.f36749c;
        }

        @Override // v9.b
        public Object c() {
            return this.f36749c;
        }

        @Override // v9.b
        public p7.d e(d dVar, l<? super T, w> lVar) {
            j0.i(dVar, "resolver");
            j0.i(lVar, "callback");
            int i10 = p7.d.C1;
            return p7.c.f34476c;
        }

        @Override // v9.b
        public p7.d f(d dVar, l<? super T, w> lVar) {
            j0.i(dVar, "resolver");
            j0.i(lVar, "callback");
            lVar.invoke(this.f36749c);
            int i10 = p7.d.C1;
            return p7.c.f34476c;
        }
    }

    public static final class c<R, T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f36751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l<R, T> f36752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final m<T> f36753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u9.e f36754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final k<T> f36755h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b<T> f36756i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f36757j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public x8.a f36758k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public T f36759l;

        public static final class a extends vc.l implements uc.a<w> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l<T, w> f36760c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c<R, T> f36761d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f36762e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l<? super T, w> lVar, c<R, T> cVar, d dVar) {
                super(0);
                this.f36760c = lVar;
                this.f36761d = cVar;
                this.f36762e = dVar;
            }

            @Override // uc.a
            public w invoke() {
                this.f36760c.invoke(this.f36761d.b(this.f36762e));
                return w.f31842a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, l<? super R, ? extends T> lVar, m<T> mVar, u9.e eVar, k<T> kVar, b<T> bVar) {
            j0.i(str, "expressionKey");
            j0.i(str2, "rawExpression");
            j0.i(mVar, "validator");
            j0.i(eVar, "logger");
            j0.i(kVar, "typeHelper");
            this.f36750c = str;
            this.f36751d = str2;
            this.f36752e = lVar;
            this.f36753f = mVar;
            this.f36754g = eVar;
            this.f36755h = kVar;
            this.f36756i = bVar;
            this.f36757j = str2;
        }

        public /* synthetic */ c(String str, String str2, l lVar, m mVar, u9.e eVar, k kVar, b bVar, int i10, g gVar) {
            this(str, str2, lVar, mVar, eVar, kVar, (i10 & 64) != 0 ? null : bVar);
        }

        @Override // v9.b
        public T b(d dVar) {
            T tB;
            j0.i(dVar, "resolver");
            try {
                T tH = h(dVar);
                this.f36759l = tH;
                return tH;
            } catch (f e10) {
                this.f36754g.b(e10);
                dVar.a(e10);
                T t10 = this.f36759l;
                if (t10 != null) {
                    return t10;
                }
                try {
                    b<T> bVar = this.f36756i;
                    if (bVar != null && (tB = bVar.b(dVar)) != null) {
                        this.f36759l = tB;
                        return tB;
                    }
                    return this.f36755h.a();
                } catch (f e11) {
                    this.f36754g.b(e11);
                    dVar.a(e11);
                    throw e11;
                }
            }
        }

        @Override // v9.b
        public Object c() {
            return this.f36757j;
        }

        @Override // v9.b
        public p7.d e(d dVar, l<? super T, w> lVar) {
            j0.i(dVar, "resolver");
            j0.i(lVar, "callback");
            try {
                List<String> listC = g().c();
                if (!listC.isEmpty()) {
                    return dVar.c(this.f36751d, listC, new a(lVar, this, dVar));
                }
                int i10 = p7.d.C1;
                return p7.c.f34476c;
            } catch (Exception e10) {
                f fVarG = c0.G(this.f36750c, this.f36751d, e10);
                this.f36754g.b(fVarG);
                dVar.a(fVarG);
                int i11 = p7.d.C1;
                return p7.c.f34476c;
            }
        }

        public final x8.a g() {
            x8.a aVar = this.f36758k;
            if (aVar != null) {
                return aVar;
            }
            try {
                x8.a.b bVar = x8.a.f37519c;
                String str = this.f36751d;
                Objects.requireNonNull(bVar);
                j0.i(str, "expr");
                x8.a.d dVar = new x8.a.d(str);
                this.f36758k = dVar;
                return dVar;
            } catch (x8.b e10) {
                throw c0.G(this.f36750c, this.f36751d, e10);
            }
        }

        public final T h(d dVar) {
            T t10 = (T) dVar.b(this.f36750c, this.f36751d, g(), this.f36752e, this.f36753f, this.f36755h, this.f36754g);
            if (t10 == null) {
                throw c0.G(this.f36750c, this.f36751d, null);
            }
            if (this.f36755h.b(t10)) {
                return t10;
            }
            throw c0.S(this.f36750c, this.f36751d, t10, null);
        }
    }

    public static final <T> b<T> a(T t10) {
        return f36747a.a(t10);
    }

    public static final boolean d(Object obj) {
        Objects.requireNonNull(f36747a);
        return (obj instanceof String) && u.x((CharSequence) obj, "@{", false, 2);
    }

    public abstract T b(d dVar);

    public abstract Object c();

    public abstract p7.d e(d dVar, l<? super T, w> lVar);

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return j0.d(c(), ((b) obj).c());
        }
        return false;
    }

    public p7.d f(d dVar, l<? super T, w> lVar) {
        T tB;
        j0.i(dVar, "resolver");
        j0.i(lVar, "callback");
        try {
            tB = b(dVar);
        } catch (f unused) {
            tB = null;
        }
        if (tB != null) {
            lVar.invoke(tB);
        }
        return e(dVar, lVar);
    }

    public int hashCode() {
        return c().hashCode() * 16;
    }
}
