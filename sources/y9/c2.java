package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c2 implements u9.a, u9.b<b2> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f39372e = new g(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Double> f39373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f39374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<w> f39375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f39376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<w> f39377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Double> f39378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Double> f39379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f39380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f39381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f39382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f39383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f39384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w>> f39386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, c2> f39388u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<w>> f39391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39392d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39393c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = c2.f39379l;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = c2.f39373f;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, c2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39394c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public c2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new c2(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39395c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = c2.f39381n;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = c2.f39374g;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39396c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<w> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w.Converter);
            uc.l lVar = w.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<w> bVar = c2.f39375h;
            v9.b<w> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, c2.f39377j);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39397c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = c2.f39383p;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = c2.f39376i;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f39398c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class g {
        public g() {
        }

        public g(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f39373f = aVar.a(Double.valueOf(0.0d));
        f39374g = aVar.a(200L);
        f39375h = aVar.a(w.EASE_IN_OUT);
        f39376i = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        f fVar = f.f39398c;
        fd.j0.i(objQ, "default");
        fd.j0.i(fVar, "validator");
        f39377j = new h9.k.a.C0302a(objQ, fVar);
        f39378k = k1.f41016r;
        f39379l = r1.f42251v;
        f39380m = k1.f41017s;
        f39381n = r1.f42252w;
        f39382o = k1.f41018t;
        f39383p = r1.f42253x;
        f39384q = a.f39393c;
        f39385r = c.f39395c;
        f39386s = d.f39396c;
        f39387t = e.f39397c;
        f39388u = b.f39394c;
    }

    public c2(u9.c cVar, c2 c2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, c2Var == null ? null : c2Var.f39389a, h9.h.f30981d, f39378k, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f39389a = aVarR;
        j9.a<v9.b<Long>> aVar = c2Var == null ? null : c2Var.f39390b;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f39380m;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "duration", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39390b = aVarR2;
        j9.a<v9.b<w>> aVar2 = c2Var == null ? null : c2Var.f39391c;
        Objects.requireNonNull(w.Converter);
        j9.a<v9.b<w>> aVarS = h9.e.s(jSONObject, "interpolator", z10, aVar2, w.FROM_STRING, eVarA, cVar, f39377j);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f39391c = aVarS;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "start_delay", z10, c2Var == null ? null : c2Var.f39392d, lVar, f39382o, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39392d = aVarR3;
    }

    public /* synthetic */ c2(u9.c cVar, c2 c2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : c2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Double> bVar = (v9.b) y8.c0.H(this.f39389a, cVar, "alpha", jSONObject, f39384q);
        if (bVar == null) {
            bVar = f39373f;
        }
        v9.b<Long> bVar2 = (v9.b) y8.c0.H(this.f39390b, cVar, "duration", jSONObject, f39385r);
        if (bVar2 == null) {
            bVar2 = f39374g;
        }
        v9.b<w> bVar3 = (v9.b) y8.c0.H(this.f39391c, cVar, "interpolator", jSONObject, f39386s);
        if (bVar3 == null) {
            bVar3 = f39375h;
        }
        v9.b<Long> bVar4 = (v9.b) y8.c0.H(this.f39392d, cVar, "start_delay", jSONObject, f39387t);
        if (bVar4 == null) {
            bVar4 = f39376i;
        }
        return new b2(bVar, bVar2, bVar3, bVar4);
    }
}
