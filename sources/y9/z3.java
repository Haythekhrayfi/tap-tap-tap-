package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z3 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44612a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, z3> f44613b = a.f44614c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, z3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44614c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public z3 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(z3.f44612a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "regex")) {
                return new d(c4.f39506a.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "expression")) {
                return new c(a4.f39056a.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            e4 e4Var = bVarA instanceof e4 ? (e4) bVarA : null;
            if (e4Var != null) {
                return e4Var.a(cVar2, jSONObject2);
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

    public static class c extends z3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a4 a4Var) {
            super(null);
            fd.j0.i(a4Var, "value");
        }
    }

    public static class d extends z3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c4 c4Var) {
            super(null);
            fd.j0.i(c4Var, "value");
        }
    }

    public z3() {
    }

    public z3(vc.g gVar) {
    }
}
