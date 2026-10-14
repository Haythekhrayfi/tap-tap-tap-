package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d2 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f39560a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, d2> f39561b = b.f39563c;

    public static class a extends d2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i0 f39562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var) {
            super(null);
            fd.j0.i(i0Var, "value");
            this.f39562c = i0Var;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, d2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39563c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public d2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(d2.f39560a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "blur")) {
                return new a(i0.f40528b.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            e2 e2Var = bVarA instanceof e2 ? (e2) bVarA : null;
            if (e2Var != null) {
                return e2Var.a(cVar2, jSONObject2);
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

    public d2() {
    }

    public d2(vc.g gVar) {
    }
}
