package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k6 implements u9.a, u9.b<h6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f41103a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, k6> f41104b = b.f41106c;

    public static class a extends k6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0 f41105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var) {
            super(null);
            fd.j0.i(u0Var, "value");
            this.f41105c = u0Var;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, k6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41106c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public k6 invoke(u9.c cVar, JSONObject jSONObject) {
            k6 aVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(k6.f41103a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            k6 k6Var = bVar instanceof k6 ? (k6) bVar : null;
            if (k6Var != null) {
                if (k6Var instanceof d) {
                    str = "rounded_rectangle";
                } else {
                    if (!(k6Var instanceof a)) {
                        throw new jc.g();
                    }
                    str = "circle";
                }
            }
            if (fd.j0.d(str, "rounded_rectangle")) {
                aVar = new d(new u5(cVar2, (u5) (k6Var != null ? k6Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "circle")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                aVar = new a(new u0(cVar2, (u0) (k6Var != null ? k6Var.c() : null), false, jSONObject2));
            }
            return aVar;
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public static class d extends k6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u5 f41107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u5 u5Var) {
            super(null);
            fd.j0.i(u5Var, "value");
            this.f41107c = u5Var;
        }
    }

    public k6() {
    }

    public k6(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            return new h6.d(((d) this).f41107c.a(cVar, jSONObject));
        }
        if (this instanceof a) {
            return new h6.a(((a) this).f41105c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f41107c;
        }
        if (this instanceof a) {
            return ((a) this).f41105c;
        }
        throw new jc.g();
    }
}
