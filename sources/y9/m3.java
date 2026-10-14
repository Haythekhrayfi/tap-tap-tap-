package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m3 implements u9.a, u9.b<l3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41434a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, m3> f41435b = a.f41436c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41436c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public m3 invoke(u9.c cVar, JSONObject jSONObject) {
            m3 dVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(m3.f41434a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            m3 m3Var = bVar instanceof m3 ? (m3) bVar : null;
            if (m3Var != null) {
                if (m3Var instanceof c) {
                    str = "default";
                } else {
                    if (!(m3Var instanceof d)) {
                        throw new jc.g();
                    }
                    str = "stretch";
                }
            }
            if (fd.j0.d(str, "default")) {
                dVar = new c(new n1(cVar2, (n1) (m3Var != null ? m3Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "stretch")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                dVar = new d(new b7(cVar2, (b7) (m3Var != null ? m3Var.c() : null), false, jSONObject2));
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

    public static class c extends m3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n1 f41437c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n1 n1Var) {
            super(null);
            fd.j0.i(n1Var, "value");
            this.f41437c = n1Var;
        }
    }

    public static class d extends m3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b7 f41438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b7 b7Var) {
            super(null);
            fd.j0.i(b7Var, "value");
            this.f41438c = b7Var;
        }
    }

    public m3() {
    }

    public m3(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new l3.c(((c) this).f41437c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new l3.d(((d) this).f41438c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof c) {
            return ((c) this).f41437c;
        }
        if (this instanceof d) {
            return ((d) this).f41438c;
        }
        throw new jc.g();
    }
}
