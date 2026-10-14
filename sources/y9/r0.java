package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f42228a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, r0> f42229b = b.f42231c;

    public static class a extends r0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m0 f42230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var) {
            super(null);
            fd.j0.i(m0Var, "value");
            this.f42230c = m0Var;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42231c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public r0 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(r0.f42228a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "set")) {
                return new d(p0.f41894b.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "change_bounds")) {
                return new a(m0.f41406d.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            s0 s0Var = bVarA instanceof s0 ? (s0) bVarA : null;
            if (s0Var != null) {
                return s0Var.a(cVar2, jSONObject2);
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

    public static class d extends r0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p0 f42232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p0 p0Var) {
            super(null);
            fd.j0.i(p0Var, "value");
            this.f42232c = p0Var;
        }
    }

    public r0() {
    }

    public r0(vc.g gVar) {
    }
}
