package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r3 implements u9.a, u9.b<q3> {

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public r3(u9.c cVar, r3 r3Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        cVar.a();
    }

    public /* synthetic */ r3(u9.c cVar, r3 r3Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : r3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new q3();
    }
}
