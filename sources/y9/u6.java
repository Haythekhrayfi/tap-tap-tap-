package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u6 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43112b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Integer> f43113a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final u6 a(u9.c cVar, JSONObject jSONObject) {
            return new u6(h9.c.h(jSONObject, "color", h9.h.f30978a, cVar.a(), cVar, h9.l.f31002f));
        }
    }

    public u6(v9.b<Integer> bVar) {
        fd.j0.i(bVar, "color");
        this.f43113a = bVar;
    }
}
