package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n7 implements u9.a, u9.b<m7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41694a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, n7> f41695b = a.f41696c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, n7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41696c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public n7 invoke(u9.c cVar, JSONObject jSONObject) {
            n7 dVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(n7.f41694a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            n7 n7Var = bVar instanceof n7 ? (n7) bVar : null;
            if (n7Var != null) {
                if (n7Var instanceof c) {
                    str = "gradient";
                } else {
                    if (!(n7Var instanceof d)) {
                        throw new jc.g();
                    }
                    str = "radial_gradient";
                }
            }
            if (fd.j0.d(str, "gradient")) {
                dVar = new c(new h4(cVar2, (h4) (n7Var != null ? n7Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "radial_gradient")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                dVar = new d(new s5(cVar2, (s5) (n7Var != null ? n7Var.c() : null), false, jSONObject2));
            }
            return dVar;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends n7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h4 f41697c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h4 h4Var) {
            super(null);
            fd.j0.i(h4Var, "value");
            this.f41697c = h4Var;
        }
    }

    public static class d extends n7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s5 f41698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s5 s5Var) {
            super(null);
            fd.j0.i(s5Var, "value");
            this.f41698c = s5Var;
        }
    }

    public n7() {
    }

    public n7(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m7 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new m7.c(((c) this).f41697c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new m7.d(((d) this).f41698c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof c) {
            return ((c) this).f41697c;
        }
        if (this instanceof d) {
            return ((d) this).f41698c;
        }
        throw new jc.g();
    }
}
