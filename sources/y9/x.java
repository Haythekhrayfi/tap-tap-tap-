package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x implements u9.a, u9.b<v> {
    public static final uc.q<String, JSONObject, u9.c, d1> A;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> B;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> C;
    public static final uc.p<u9.c, JSONObject, x> D;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f43838i = new l(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f43839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<w> f43840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d1.d f43841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v9.b<Long> f43842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.k<w> f43843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.k<v.e> f43844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f43845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Long> f43846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.g<v> f43847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.g<x> f43848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h9.m<Long> f43849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h9.m<Long> f43850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f43851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f43852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w>> f43853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<v>> f43854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<v.e>> f43855z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<w>> f43858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<x>> f43859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<v.e>> f43860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<e1> f43861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43863h;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, x> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43864c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public x invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new x(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43865c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = x.f43846q;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = x.f43839j;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43866c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30981d, cVar2.a(), cVar2, h9.l.f31000d);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43867c = new d();

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
            v9.b<w> bVar = x.f43840k;
            v9.b<w> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x.f43843n);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<v>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f43868c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public List<v> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v.f43377h);
            return h9.c.w(jSONObject2, str2, v.f43387r, x.f43847r, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<v.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43869c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public v9.b<v.e> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v.e.Converter);
            return h9.c.h(jSONObject2, str2, v.e.FROM_STRING, cVar2.a(), cVar2, x.f43844o);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, d1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f43870c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public d1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(d1.f39557a);
            d1 d1Var = (d1) h9.c.n(jSONObject2, str2, d1.f39558b, cVar2.a(), cVar2);
            return d1Var == null ? x.f43841l : d1Var;
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f43871c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = x.f43850u;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = x.f43842m;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f43872c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30981d, cVar2.a(), cVar2, h9.l.f31000d);
        }
    }

    public static final class j extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f43873c = new j();

        public j() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class k extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f43874c = new k();

        public k() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof v.e);
        }
    }

    public static final class l {
        public l() {
        }

        public l(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f43839j = aVar.a(300L);
        f43840k = aVar.a(w.SPRING);
        f43841l = new d1.d(new q3());
        f43842m = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        j jVar = j.f43873c;
        fd.j0.i(objQ, "default");
        fd.j0.i(jVar, "validator");
        f43843n = new h9.k.a.C0302a(objQ, jVar);
        Object objQ2 = kc.j.q(v.e.values());
        k kVar = k.f43874c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(kVar, "validator");
        f43844o = new h9.k.a.C0302a(objQ2, kVar);
        f43845p = r.f42211k;
        f43846q = m.f41397o;
        f43847r = r.f42212l;
        f43848s = m.f41398p;
        f43849t = r.f42213m;
        f43850u = m.f41399q;
        f43851v = b.f43865c;
        f43852w = c.f43866c;
        f43853x = d.f43867c;
        f43854y = e.f43868c;
        f43855z = f.f43869c;
        A = g.f43870c;
        B = h.f43871c;
        C = i.f43872c;
        D = a.f43864c;
    }

    public x(u9.c cVar, x xVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = xVar == null ? null : xVar.f43856a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f43845p;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "duration", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43856a = aVarR;
        j9.a<v9.b<Double>> aVar2 = xVar == null ? null : xVar.f43857b;
        uc.l<Number, Double> lVar2 = h9.h.f30981d;
        h9.k<Double> kVar2 = h9.l.f31000d;
        j9.a<v9.b<Double>> aVarS = h9.e.s(jSONObject, "end_value", z10, aVar2, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43857b = aVarS;
        j9.a<v9.b<w>> aVar3 = xVar == null ? null : xVar.f43858c;
        Objects.requireNonNull(w.Converter);
        j9.a<v9.b<w>> aVarS2 = h9.e.s(jSONObject, "interpolator", z10, aVar3, w.FROM_STRING, eVarA, cVar, f43843n);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f43858c = aVarS2;
        j9.a<List<x>> aVarU = h9.e.u(jSONObject, "items", z10, xVar == null ? null : xVar.f43859d, D, f43848s, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43859d = aVarU;
        j9.a<v9.b<v.e>> aVar4 = xVar == null ? null : xVar.f43860e;
        Objects.requireNonNull(v.e.Converter);
        this.f43860e = h9.e.j(jSONObject, "name", z10, aVar4, v.e.FROM_STRING, eVarA, cVar, f43844o);
        j9.a<e1> aVar5 = xVar == null ? null : xVar.f43861f;
        Objects.requireNonNull(e1.f39734a);
        j9.a<e1> aVarO = h9.e.o(jSONObject, "repeat", z10, aVar5, e1.f39735b, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43861f = aVarO;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "start_delay", z10, xVar == null ? null : xVar.f43862g, lVar, f43849t, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43862g = aVarR2;
        j9.a<v9.b<Double>> aVarS3 = h9.e.s(jSONObject, "start_value", z10, xVar == null ? null : xVar.f43863h, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43863h = aVarS3;
    }

    public /* synthetic */ x(u9.c cVar, x xVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : xVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f43856a, cVar, "duration", jSONObject, f43851v);
        if (bVar == null) {
            bVar = f43839j;
        }
        v9.b<Long> bVar2 = bVar;
        v9.b bVar3 = (v9.b) y8.c0.H(this.f43857b, cVar, "end_value", jSONObject, f43852w);
        v9.b<w> bVar4 = (v9.b) y8.c0.H(this.f43858c, cVar, "interpolator", jSONObject, f43853x);
        if (bVar4 == null) {
            bVar4 = f43840k;
        }
        v9.b<w> bVar5 = bVar4;
        List listL = y8.c0.L(this.f43859d, cVar, "items", jSONObject, f43847r, f43854y);
        v9.b bVar6 = (v9.b) y8.c0.E(this.f43860e, cVar, "name", jSONObject, f43855z);
        d1 d1Var = (d1) y8.c0.K(this.f43861f, cVar, "repeat", jSONObject, A);
        if (d1Var == null) {
            d1Var = f43841l;
        }
        d1 d1Var2 = d1Var;
        v9.b<Long> bVar7 = (v9.b) y8.c0.H(this.f43862g, cVar, "start_delay", jSONObject, B);
        if (bVar7 == null) {
            bVar7 = f43842m;
        }
        return new v(bVar2, bVar3, bVar5, listL, bVar6, d1Var2, bVar7, (v9.b) y8.c0.H(this.f43863h, cVar, "start_value", jSONObject, C));
    }
}
