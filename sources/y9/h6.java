package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h6 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f40289a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, h6> f40290b = b.f40292c;

    public static class a extends h6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t0 f40291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var) {
            super(null);
            fd.j0.i(t0Var, "value");
            this.f40291c = t0Var;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, h6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40292c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public h6 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(h6.f40289a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "rounded_rectangle")) {
                return new d(t5.f42752f.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "circle")) {
                return new a(t0.f42674d.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            k6 k6Var = bVarA instanceof k6 ? (k6) bVarA : null;
            if (k6Var != null) {
                return k6Var.a(cVar2, jSONObject2);
            }
            throw y8.c0.U(jSONObject2, "type", str);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public static class d extends h6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t5 f40293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t5 t5Var) {
            super(null);
            fd.j0.i(t5Var, "value");
            this.f40293c = t5Var;
        }
    }

    public h6() {
    }

    public h6(vc.g gVar) {
    }
}
