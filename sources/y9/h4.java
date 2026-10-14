package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h4 implements u9.a, u9.b<g4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9.b<Long> f40269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<Long> f40270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<Long> f40271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.g<Integer> f40272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.g<Integer> f40273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.c<Integer>> f40275i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.c<Integer>> f40277b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40278c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = h4.f40271e;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = h4.f40269c;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.c<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40279c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.c<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.j(jSONObject2, str2, h9.h.f30978a, h4.f40272f, cVar2.a(), cVar2, h9.l.f31002f);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    static {
        new c(null);
        f40269c = v9.b.f36747a.a(0L);
        f40270d = w3.f43739r;
        f40271e = x3.f44079t;
        f40272f = w3.f43740s;
        f40273g = x3.f44080u;
        f40274h = a.f40278c;
        f40275i = b.f40279c;
    }

    public h4(u9.c cVar, h4 h4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "angle", z10, h4Var == null ? null : h4Var.f40276a, h9.h.f30982e, f40270d, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40276a = aVarR;
        j9.a<v9.c<Integer>> aVarA = h9.e.a(jSONObject, "colors", z10, h4Var == null ? null : h4Var.f40277b, h9.h.f30978a, f40273g, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarA, "readExpressionListField(…, env, TYPE_HELPER_COLOR)");
        this.f40277b = aVarA;
    }

    public /* synthetic */ h4(u9.c cVar, h4 h4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : h4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f40276a, cVar, "angle", jSONObject, f40274h);
        if (bVar == null) {
            bVar = f40269c;
        }
        return new g4(bVar, y8.c0.F(this.f40277b, cVar, "colors", jSONObject, f40275i));
    }
}
