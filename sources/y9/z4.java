package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z4 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44615a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, z4> f44616b = a.f44617c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, z4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44617c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public z4 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(z4.f44615a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "pivot-fixed")) {
                return new c(a5.f39061c.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "pivot-percentage")) {
                return new d(c5.f39511b.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            e5 e5Var = bVarA instanceof e5 ? (e5) bVarA : null;
            if (e5Var != null) {
                return e5Var.a(cVar2, jSONObject2);
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

    public static class c extends z4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a5 f44618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a5 a5Var) {
            super(null);
            fd.j0.i(a5Var, "value");
            this.f44618c = a5Var;
        }
    }

    public static class d extends z4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c5 f44619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c5 c5Var) {
            super(null);
            fd.j0.i(c5Var, "value");
            this.f44619c = c5Var;
        }
    }

    public z4() {
    }

    public z4(vc.g gVar) {
    }
}
