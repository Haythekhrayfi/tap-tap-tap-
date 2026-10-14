package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h implements u9.a, u9.b<g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f40244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f40245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f40246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, JSONObject> f40247f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f40248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<JSONObject> f40249b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40250c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = h.f40245d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, JSONObject> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40251c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public JSONObject b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            i.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env");
            return (JSONObject) h9.c.c(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a);
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
        f40244c = i5.a.f31267w;
        f40245d = p7.d1.f34494r;
        f40246e = a.f40250c;
        f40247f = b.f40251c;
    }

    public h(u9.c cVar, h hVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f40248a = h9.e.b(jSONObject, "name", z10, hVar == null ? null : hVar.f40248a, f40244c, eVarA, cVar);
        this.f40249b = h9.e.c(jSONObject, "value", z10, hVar == null ? null : hVar.f40249b, eVarA, cVar);
    }

    public /* synthetic */ h(u9.c cVar, h hVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new g((String) y8.c0.E(this.f40248a, cVar, "name", jSONObject, f40246e), (JSONObject) y8.c0.E(this.f40249b, cVar, "value", jSONObject, f40247f));
    }
}
