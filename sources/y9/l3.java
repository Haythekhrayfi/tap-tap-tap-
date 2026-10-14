package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l3 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41219a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, l3> f41220b = a.f41221c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, l3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41221c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public l3 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(l3.f41219a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "default")) {
                return new c(m1.f41417b.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "stretch")) {
                return new d(a7.f39091c.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            m3 m3Var = bVarA instanceof m3 ? (m3) bVarA : null;
            if (m3Var != null) {
                return m3Var.a(cVar2, jSONObject2);
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

    public static class c extends l3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m1 f41222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m1 m1Var) {
            super(null);
            fd.j0.i(m1Var, "value");
            this.f41222c = m1Var;
        }
    }

    public static class d extends l3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a7 f41223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a7 a7Var) {
            super(null);
            fd.j0.i(a7Var, "value");
            this.f41223c = a7Var;
        }
    }

    public l3() {
    }

    public l3(vc.g gVar) {
    }
}
