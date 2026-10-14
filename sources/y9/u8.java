package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u8 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43373c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f43374d = l8.f41376q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f43376b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final u8 a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            return new u8((String) h9.c.c(jSONObject, "name", h9.c.f30973c, u8.f43374d), ((Number) h9.c.c(jSONObject, "value", h9.h.f30981d, h9.c.f30971a)).doubleValue());
        }
    }

    public u8(String str, double d10) {
        fd.j0.i(str, "name");
        this.f43375a = str;
        this.f43376b = d10;
    }
}
