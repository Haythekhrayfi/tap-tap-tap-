package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a2 implements u9.a, u9.b<z1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f38997c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f38998d = k1.f41015q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<String> f38999e = r1.f42247r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39000f = b.f39006c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, JSONObject> f39001g = c.f39007c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, a2> f39002h = a.f39005c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f39003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<JSONObject> f39004b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, a2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39005c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public a2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new a2(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39006c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = a2.f38999e;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, JSONObject> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39007c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public JSONObject b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            return (JSONObject) h9.c.m(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env"));
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    public a2(u9.c cVar, a2 a2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f39003a = h9.e.b(jSONObject, FacebookMediationAdapter.KEY_ID, z10, a2Var == null ? null : a2Var.f39003a, f38998d, eVarA, cVar);
        j9.a<JSONObject> aVarM = h9.e.m(jSONObject, "params", z10, a2Var == null ? null : a2Var.f39004b, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …ent?.params, logger, env)");
        this.f39004b = aVarM;
    }

    public /* synthetic */ a2(u9.c cVar, a2 a2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : a2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new z1((String) y8.c0.E(this.f39003a, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f39000f), (JSONObject) y8.c0.H(this.f39004b, cVar, "params", jSONObject, f39001g));
    }
}
