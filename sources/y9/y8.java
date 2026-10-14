package y9;

import android.net.Uri;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y8 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44572c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f44573d = l8.f41380u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f44575b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final y8 a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            return new y8((String) h9.c.c(jSONObject, "name", h9.c.f30973c, y8.f44573d), (Uri) h9.c.c(jSONObject, "value", h9.h.f30979b, h9.c.f30971a));
        }
    }

    public y8(String str, Uri uri) {
        fd.j0.i(str, "name");
        fd.j0.i(uri, "value");
        this.f44574a = str;
        this.f44575b = uri;
    }
}
