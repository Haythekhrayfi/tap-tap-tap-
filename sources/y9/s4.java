package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s4 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42563a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, s4> f42564b = a.f42565c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, s4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42565c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public s4 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(s4.f42563a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "percentage")) {
                return new d(o4.f41820b.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "fixed")) {
                return new c(k4.f41095b.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            t4 t4Var = bVarA instanceof t4 ? (t4) bVarA : null;
            if (t4Var != null) {
                return t4Var.a(cVar2, jSONObject2);
            }
            throw y8.c0.U(jSONObject2, "type", str);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends s4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k4 f42566c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k4 k4Var) {
            super(null);
            fd.j0.i(k4Var, "value");
            this.f42566c = k4Var;
        }
    }

    public static class d extends s4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o4 f42567c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o4 o4Var) {
            super(null);
            fd.j0.i(o4Var, "value");
            this.f42567c = o4Var;
        }
    }

    public s4() {
    }

    public s4(vc.g gVar) {
    }
}
