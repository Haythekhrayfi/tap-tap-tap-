package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d5 implements u9.a, u9.b<c5> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f39642b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39643a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39644c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30981d, cVar2.a(), cVar2, h9.l.f31000d);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        new b(null);
        f39642b = a.f39644c;
    }

    public d5(u9.c cVar, d5 d5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        this.f39643a = h9.e.j(jSONObject, "value", z10, d5Var == null ? null : d5Var.f39643a, h9.h.f30981d, cVar.a(), cVar, h9.l.f31000d);
    }

    public /* synthetic */ d5(u9.c cVar, d5 d5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : d5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new c5((v9.b) y8.c0.E(this.f39643a, cVar, "value", jSONObject, f39642b));
    }
}
