package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0470a f38962c = new C0470a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f38963d = p7.d1.f34489m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38965b;

    /* JADX INFO: renamed from: y9.a$a, reason: collision with other inner class name */
    public static final class C0470a {
        public C0470a() {
        }

        public C0470a(vc.g gVar) {
        }

        public final a a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            return new a((String) h9.c.c(jSONObject, "name", h9.c.f30973c, a.f38963d), ((Boolean) h9.c.c(jSONObject, "value", h9.h.f30980c, h9.c.f30971a)).booleanValue());
        }
    }

    public a(String str, boolean z10) {
        fd.j0.i(str, "name");
        this.f38964a = str;
        this.f38965b = z10;
    }
}
