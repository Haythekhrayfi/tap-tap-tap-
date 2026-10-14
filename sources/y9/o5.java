package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o5 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41822b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f41823a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final o5 a(u9.c cVar, JSONObject jSONObject) {
            return new o5(h9.c.h(jSONObject, "value", h9.h.f30981d, cVar.a(), cVar, h9.l.f31000d));
        }
    }

    public o5(v9.b<Double> bVar) {
        fd.j0.i(bVar, "value");
        this.f41823a = bVar;
    }
}
