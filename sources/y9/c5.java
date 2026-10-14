package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c5 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39511b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f39512a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final c5 a(u9.c cVar, JSONObject jSONObject) {
            return new c5(h9.c.h(jSONObject, "value", h9.h.f30981d, cVar.a(), cVar, h9.l.f31000d));
        }
    }

    public c5(v9.b<Double> bVar) {
        fd.j0.i(bVar, "value");
        this.f39512a = bVar;
    }
}
