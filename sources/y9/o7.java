package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o7 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41841a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, o7> f41842b = a.f41843c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, o7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41843c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public o7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(o7.f41841a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "solid")) {
                return new c(u6.f43112b.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            p7 p7Var = bVarA instanceof p7 ? (p7) bVarA : null;
            if (p7Var != null) {
                return p7Var.a(cVar2, jSONObject2);
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

    public static class c extends o7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u6 f41844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u6 u6Var) {
            super(null);
            fd.j0.i(u6Var, "value");
            this.f41844c = u6Var;
        }
    }

    public o7() {
    }

    public o7(vc.g gVar) {
    }
}
