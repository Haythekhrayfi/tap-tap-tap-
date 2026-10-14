package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39722c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f39723d = p7.d1.f34491o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39725b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final e a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            return new e((String) h9.c.c(jSONObject, "name", h9.c.f30973c, e.f39723d), ((Number) h9.c.c(jSONObject, "value", h9.h.f30978a, h9.c.f30971a)).intValue());
        }
    }

    public e(String str, int i10) {
        fd.j0.i(str, "name");
        this.f39724a = str;
        this.f39725b = i10;
    }
}
