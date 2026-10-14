package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o6 implements u9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f41824f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f41825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<d> f41826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<w> f41827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f41828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.k<d> f41829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.k<w> f41830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f41831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f41832n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f41833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f41834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<d> f41835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<w> f41836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Long> f41837e;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41838c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof d);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41839c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }

        public final o6 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o1.f41735c);
            o1 o1Var = (o1) h9.c.n(jSONObject, "distance", o1.f41738f, eVarA, cVar);
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = o6.f41831m;
            v9.b<Long> bVar = o6.f41825g;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject, "duration", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(d.Converter);
            uc.l lVar2 = d.FROM_STRING;
            v9.b<d> bVar2 = o6.f41826h;
            v9.b<d> bVarT = h9.c.t(jSONObject, "edge", lVar2, eVarA, cVar, bVar2, o6.f41829k);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            Objects.requireNonNull(w.Converter);
            uc.l lVar3 = w.FROM_STRING;
            v9.b<w> bVar3 = o6.f41827i;
            v9.b<w> bVarT2 = h9.c.t(jSONObject, "interpolator", lVar3, eVarA, cVar, bVar3, o6.f41830l);
            if (bVarT2 != null) {
                bVar3 = bVarT2;
            }
            h9.m<Long> mVar2 = o6.f41832n;
            v9.b<Long> bVar4 = o6.f41828j;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "start_delay", lVar, mVar2, eVarA, bVar4, kVar);
            return new o6(o1Var, bVar, bVar2, bVar3, bVarR2 == null ? bVar4 : bVarR2);
        }
    }

    public enum d {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");

        public static final b Converter = new b(null);
        private static final uc.l<String, d> FROM_STRING = a.f41840c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41840c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public d invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                d dVar = d.LEFT;
                if (fd.j0.d(str2, dVar.value)) {
                    return dVar;
                }
                d dVar2 = d.TOP;
                if (fd.j0.d(str2, dVar2.value)) {
                    return dVar2;
                }
                d dVar3 = d.RIGHT;
                if (fd.j0.d(str2, dVar3.value)) {
                    return dVar3;
                }
                d dVar4 = d.BOTTOM;
                if (fd.j0.d(str2, dVar4.value)) {
                    return dVar4;
                }
                return null;
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        d(String str) {
            this.value = str;
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f41825g = aVar.a(200L);
        f41826h = aVar.a(d.BOTTOM);
        f41827i = aVar.a(w.EASE_IN_OUT);
        f41828j = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(d.values());
        a aVar2 = a.f41838c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f41829k = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(w.values());
        b bVar = b.f41839c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar, "validator");
        f41830l = new h9.k.a.C0302a(objQ2, bVar);
        f41831m = c6.f39532w;
        f41832n = c6.f39533x;
    }

    public o6() {
        this(null, null, null, null, null, 31, null);
    }

    public o6(o1 o1Var, v9.b<Long> bVar, v9.b<d> bVar2, v9.b<w> bVar3, v9.b<Long> bVar4) {
        fd.j0.i(bVar, "duration");
        fd.j0.i(bVar2, "edge");
        fd.j0.i(bVar3, "interpolator");
        fd.j0.i(bVar4, "startDelay");
        this.f41833a = o1Var;
        this.f41834b = bVar;
        this.f41835c = bVar2;
        this.f41836d = bVar3;
        this.f41837e = bVar4;
    }

    public /* synthetic */ o6(o1 o1Var, v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : o1Var, (i10 & 2) != 0 ? f41825g : bVar, (i10 & 4) != 0 ? f41826h : bVar2, (i10 & 8) != 0 ? f41827i : bVar3, (i10 & 16) != 0 ? f41828j : bVar4);
    }
}
