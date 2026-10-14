package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p7 implements u9.a, u9.b<o7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42052a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, p7> f42053b = a.f42054c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, p7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42054c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public p7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(p7.f42052a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            v6 v6Var = null;
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            p7 p7Var = bVar instanceof p7 ? (p7) bVar : null;
            if (p7Var != null) {
                if (!(p7Var instanceof c)) {
                    throw new jc.g();
                }
                str = "solid";
            }
            if (!fd.j0.d(str, "solid")) {
                throw y8.c0.U(jSONObject2, "type", str);
            }
            if (p7Var != null) {
                if (!(p7Var instanceof c)) {
                    throw new jc.g();
                }
                v6Var = ((c) p7Var).f42055c;
            }
            return new c(new v6(cVar2, v6Var, false, jSONObject2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends p7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v6 f42055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v6 v6Var) {
            super(null);
            fd.j0.i(v6Var, "value");
            this.f42055c = v6Var;
        }
    }

    public p7() {
    }

    public p7(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o7 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new o7.c(((c) this).f42055c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }
}
