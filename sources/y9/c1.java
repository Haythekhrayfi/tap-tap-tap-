package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c1 implements u9.a, u9.b<b1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f39349e = new f(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<Long> f39350f = a1.f38973d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<Long> f39351g = v0.f43421z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f39352h = a1.f38974e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f39353i = v0.A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Long> f39354j = a1.f38975f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f39355k = v0.B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f39356l = a1.f38976g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f39357m = v0.C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39358n = a.f39367c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39359o = b.f39368c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39360p = d.f39370c;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39361q = e.f39371c;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, c1> f39362r = c.f39369c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39366d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39367c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, c1.f39351g, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39368c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, c1.f39353i, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class c extends vc.l implements uc.p<u9.c, JSONObject, c1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39369c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public c1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new c1(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39370c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, c1.f39355k, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39371c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, c1.f39357m, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class f {
        public f() {
        }

        public f(vc.g gVar) {
        }
    }

    public c1(u9.c cVar, c1 c1Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = c1Var == null ? null : c1Var.f39363a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f39350f;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "bottom-left", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39363a = aVarR;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "bottom-right", z10, c1Var == null ? null : c1Var.f39364b, lVar, f39352h, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39364b = aVarR2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "top-left", z10, c1Var == null ? null : c1Var.f39365c, lVar, f39354j, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39365c = aVarR3;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "top-right", z10, c1Var == null ? null : c1Var.f39366d, lVar, f39356l, eVarA, cVar, kVar);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39366d = aVarR4;
    }

    public /* synthetic */ c1(u9.c cVar, c1 c1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : c1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new b1((v9.b) y8.c0.H(this.f39363a, cVar, "bottom-left", jSONObject, f39358n), (v9.b) y8.c0.H(this.f39364b, cVar, "bottom-right", jSONObject, f39359o), (v9.b) y8.c0.H(this.f39365c, cVar, "top-left", jSONObject, f39360p), (v9.b) y8.c0.H(this.f39366d, cVar, "top-right", jSONObject, f39361q));
    }
}
