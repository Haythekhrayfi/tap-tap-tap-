package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d1 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39557a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, d1> f39558b = a.f39559c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, d1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39559c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public d1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(d1.f39557a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "infinity")) {
                Objects.requireNonNull(q3.f42129a);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                cVar2.a();
                return new d(new q3());
            }
            if (fd.j0.d(str, "fixed")) {
                return new c(f2.f39931a.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            e1 e1Var = bVarA instanceof e1 ? (e1) bVarA : null;
            if (e1Var != null) {
                return e1Var.a(cVar2, jSONObject2);
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

    public static class c extends d1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f2 f2Var) {
            super(null);
            fd.j0.i(f2Var, "value");
        }
    }

    public static class d extends d1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q3 q3Var) {
            super(null);
            fd.j0.i(q3Var, "value");
        }
    }

    public d1() {
    }

    public d1(vc.g gVar) {
    }
}
