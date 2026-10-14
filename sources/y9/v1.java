package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v1 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f43423a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, v1> f43424b = a.f43425c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43425c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public v1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(v1.f43423a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "shape_drawable")) {
                return new c(i6.f40612d.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            w1 w1Var = bVarA instanceof w1 ? (w1) bVarA : null;
            if (w1Var != null) {
                return w1Var.a(cVar2, jSONObject2);
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

    public static class c extends v1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i6 f43426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i6 i6Var) {
            super(null);
            fd.j0.i(i6Var, "value");
            this.f43426c = i6Var;
        }
    }

    public v1() {
    }

    public v1(vc.g gVar) {
    }
}
