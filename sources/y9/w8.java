package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w8 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43834c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f43835d = l8.f41378s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43837b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final w8 a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            h9.m<String> mVar = w8.f43835d;
            uc.l<?, ?> lVar = h9.c.f30973c;
            return new w8((String) h9.c.c(jSONObject, "name", lVar, mVar), (String) h9.c.c(jSONObject, "value", lVar, h9.c.f30971a));
        }
    }

    public w8(String str, String str2) {
        fd.j0.i(str, "name");
        fd.j0.i(str2, "value");
        this.f43836a = str;
        this.f43837b = str2;
    }
}
