package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b4 implements u9.a, u9.b<a4> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<Boolean> f39169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<String> f39170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<String> f39171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<String> f39172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<String> f39173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<String> f39174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f39175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f39176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39179o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f39180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<String>> f39181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<String>> f39182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<String> f39183d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39184c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            u9.e eVarA = cVar2.a();
            v9.b<Boolean> bVar = b4.f39169e;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39185c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.e(jSONObject2, str2, b4.f39171g, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39186c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.e(jSONObject2, str2, b4.f39173i, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39187c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = b4.f39175k;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    static {
        new e(null);
        f39169e = v9.b.f36747a.a(Boolean.FALSE);
        f39170f = x3.f44072m;
        f39171g = w3.f43729h;
        f39172h = x3.f44073n;
        f39173i = w3.f43730i;
        f39174j = x3.f44074o;
        f39175k = w3.f43731j;
        f39176l = a.f39184c;
        f39177m = b.f39185c;
        f39178n = c.f39186c;
        f39179o = d.f39187c;
    }

    public b4(u9.c cVar, b4 b4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Boolean>> aVarS = h9.e.s(jSONObject, "allow_empty", z10, b4Var == null ? null : b4Var.f39180a, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f39180a = aVarS;
        j9.a<v9.b<String>> aVar = b4Var == null ? null : b4Var.f39181b;
        h9.m<String> mVar = f39170f;
        h9.k<String> kVar = h9.l.f30999c;
        this.f39181b = h9.e.g(jSONObject, "condition", z10, aVar, mVar, eVarA, cVar, kVar);
        this.f39182c = h9.e.g(jSONObject, "label_id", z10, b4Var == null ? null : b4Var.f39182c, f39172h, eVarA, cVar, kVar);
        this.f39183d = h9.e.b(jSONObject, "variable", z10, b4Var == null ? null : b4Var.f39183d, f39174j, eVarA, cVar);
    }

    public /* synthetic */ b4(u9.c cVar, b4 b4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : b4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Boolean> bVar = (v9.b) y8.c0.H(this.f39180a, cVar, "allow_empty", jSONObject, f39176l);
        if (bVar == null) {
            bVar = f39169e;
        }
        return new a4(bVar, (v9.b) y8.c0.E(this.f39181b, cVar, "condition", jSONObject, f39177m), (v9.b) y8.c0.E(this.f39182c, cVar, "label_id", jSONObject, f39178n), (String) y8.c0.E(this.f39183d, cVar, "variable", jSONObject, f39179o));
    }
}
