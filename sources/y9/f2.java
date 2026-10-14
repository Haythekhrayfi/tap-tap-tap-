package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f2 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39931a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.m<Long> f39932b = r1.f42254y;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final f2 a(u9.c cVar, JSONObject jSONObject) {
            return new f2(h9.c.g(jSONObject, "value", h9.h.f30982e, f2.f39932b, cVar.a(), h9.l.f30998b));
        }
    }

    public f2(v9.b<Long> bVar) {
        fd.j0.i(bVar, "value");
    }
}
