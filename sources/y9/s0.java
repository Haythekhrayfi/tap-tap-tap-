package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s0 implements u9.a, u9.b<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f42435a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, s0> f42436b = b.f42438c;

    public static class a extends s0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o0 f42437c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var) {
            super(null);
            fd.j0.i(o0Var, "value");
            this.f42437c = o0Var;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, s0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42438c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public s0 invoke(u9.c cVar, JSONObject jSONObject) {
            s0 aVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(s0.f42435a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            s0 s0Var = bVar instanceof s0 ? (s0) bVar : null;
            if (s0Var != null) {
                if (s0Var instanceof d) {
                    str = "set";
                } else {
                    if (!(s0Var instanceof a)) {
                        throw new jc.g();
                    }
                    str = "change_bounds";
                }
            }
            if (fd.j0.d(str, "set")) {
                aVar = new d(new q0(cVar2, (q0) (s0Var != null ? s0Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "change_bounds")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                aVar = new a(new o0(cVar2, (o0) (s0Var != null ? s0Var.c() : null), false, jSONObject2));
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

    public static class d extends s0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q0 f42439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q0 q0Var) {
            super(null);
            fd.j0.i(q0Var, "value");
            this.f42439c = q0Var;
        }
    }

    public s0() {
    }

    public s0(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            return new r0.d(((d) this).f42439c.a(cVar, jSONObject));
        }
        if (this instanceof a) {
            return new r0.a(((a) this).f42437c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f42439c;
        }
        if (this instanceof a) {
            return ((a) this).f42437c;
        }
        throw new jc.g();
    }
}
