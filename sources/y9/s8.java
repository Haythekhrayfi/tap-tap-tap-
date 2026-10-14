package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s8 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f42669c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f42670d = l8.f41374o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42672b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final s8 a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            return new s8((String) h9.c.c(jSONObject, "name", h9.c.f30973c, s8.f42670d), ((Number) h9.c.c(jSONObject, "value", h9.h.f30982e, h9.c.f30971a)).longValue());
        }
    }

    public s8(String str, long j10) {
        fd.j0.i(str, "name");
        this.f42671a = str;
        this.f42672b = j10;
    }
}
