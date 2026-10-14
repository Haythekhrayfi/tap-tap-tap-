package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b2 implements u9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f39129e = new c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Double> f39130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f39131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<w> f39132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f39133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<w> f39134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Double> f39135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f39136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f39137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, b2> f39138n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f39139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f39140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<w> f39141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Long> f39142d;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, b2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39143c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public b2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return b2.f39129e.a(cVar2, jSONObject2);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39144c = new b();

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

        public final b2 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = b2.f39135k;
            v9.b<Double> bVar = b2.f39130f;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = b2.f39136l;
            v9.b<Long> bVar2 = b2.f39131g;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "duration", lVar2, mVar2, eVarA, bVar2, kVar);
            if (bVarR2 != null) {
                bVar2 = bVarR2;
            }
            Objects.requireNonNull(w.Converter);
            uc.l lVar3 = w.FROM_STRING;
            v9.b<w> bVar3 = b2.f39132h;
            v9.b<w> bVarT = h9.c.t(jSONObject, "interpolator", lVar3, eVarA, cVar, bVar3, b2.f39134j);
            if (bVarT != null) {
                bVar3 = bVarT;
            }
            h9.m<Long> mVar3 = b2.f39137m;
            v9.b<Long> bVar4 = b2.f39133i;
            v9.b<Long> bVarR3 = h9.c.r(jSONObject, "start_delay", lVar2, mVar3, eVarA, bVar4, kVar);
            if (bVarR3 != null) {
                bVar4 = bVarR3;
            }
            return new b2(bVar, bVar2, bVar3, bVar4);
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f39130f = aVar.a(Double.valueOf(0.0d));
        f39131g = aVar.a(200L);
        f39132h = aVar.a(w.EASE_IN_OUT);
        f39133i = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        b bVar = b.f39144c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f39134j = new h9.k.a.C0302a(objQ, bVar);
        f39135k = r1.f42248s;
        f39136l = r1.f42249t;
        f39137m = r1.f42250u;
        f39138n = a.f39143c;
    }

    public b2() {
        this(null, null, null, null, 15, null);
    }

    public b2(v9.b<Double> bVar, v9.b<Long> bVar2, v9.b<w> bVar3, v9.b<Long> bVar4) {
        fd.j0.i(bVar, "alpha");
        fd.j0.i(bVar2, "duration");
        fd.j0.i(bVar3, "interpolator");
        fd.j0.i(bVar4, "startDelay");
        this.f39139a = bVar;
        this.f39140b = bVar2;
        this.f39141c = bVar3;
        this.f39142d = bVar4;
    }

    public /* synthetic */ b2(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39130f : bVar, (i10 & 2) != 0 ? f39131g : bVar2, (i10 & 4) != 0 ? f39132h : bVar3, (i10 & 8) != 0 ? f39133i : bVar4);
    }
}
