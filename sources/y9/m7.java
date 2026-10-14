package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m7 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41454a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, m7> f41455b = a.f41456c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41456c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public m7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(m7.f41454a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "gradient")) {
                return new c(g4.f40159c.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "radial_gradient")) {
                return new d(h5.f40280e.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            n7 n7Var = bVarA instanceof n7 ? (n7) bVarA : null;
            if (n7Var != null) {
                return n7Var.a(cVar2, jSONObject2);
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

    public static class c extends m7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g4 f41457c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g4 g4Var) {
            super(null);
            fd.j0.i(g4Var, "value");
            this.f41457c = g4Var;
        }
    }

    public static class d extends m7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h5 f41458c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h5 h5Var) {
            super(null);
            fd.j0.i(h5Var, "value");
            this.f41458c = h5Var;
        }
    }

    public m7() {
    }

    public m7(vc.g gVar) {
    }

    public Object a() {
        if (this instanceof c) {
            return ((c) this).f41457c;
        }
        if (this instanceof d) {
            return ((d) this).f41458c;
        }
        throw new jc.g();
    }
}
