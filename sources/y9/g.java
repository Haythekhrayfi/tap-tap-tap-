package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40072c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f40073d = p7.d1.f34493q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f40075b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final g a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            h9.m<String> mVar = g.f40073d;
            uc.l<?, ?> lVar = h9.c.f30973c;
            return new g((String) h9.c.c(jSONObject, "name", lVar, mVar), (JSONObject) h9.c.c(jSONObject, "value", lVar, h9.c.f30971a));
        }
    }

    public g(String str, JSONObject jSONObject) {
        fd.j0.i(str, "name");
        fd.j0.i(jSONObject, "value");
        this.f40074a = str;
        this.f40075b = jSONObject;
    }
}
