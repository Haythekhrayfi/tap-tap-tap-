package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j4 implements u9.a, u9.b<i4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.m<Double> f40903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Double> f40904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f40905d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f40906a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40907c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30981d, j4.f40904c, cVar2.a(), cVar2, h9.l.f31000d);
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
        f40903b = w3.f43741t;
        f40904c = x3.f44082w;
        f40905d = a.f40907c;
    }

    public j4(u9.c cVar, j4 j4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "weight", z10, j4Var == null ? null : j4Var.f40906a, h9.h.f30981d, f40903b, cVar.a(), cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f40906a = aVarR;
    }

    public /* synthetic */ j4(u9.c cVar, j4 j4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : j4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new i4((v9.b) y8.c0.H(this.f40906a, cVar, "weight", jSONObject, f40905d));
    }
}
