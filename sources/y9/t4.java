package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t4 implements u9.a, u9.b<s4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42747a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, t4> f42748b = a.f42749c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, t4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42749c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public t4 invoke(u9.c cVar, JSONObject jSONObject) {
            t4 cVar2;
            u9.c cVar3 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(t4.f42747a);
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar3.a(), cVar3);
            u9.b bVar = cVar3.b().get(str);
            t4 t4Var = bVar instanceof t4 ? (t4) bVar : null;
            if (t4Var != null) {
                if (t4Var instanceof d) {
                    str = "percentage";
                } else {
                    if (!(t4Var instanceof c)) {
                        throw new jc.g();
                    }
                    str = "fixed";
                }
            }
            if (fd.j0.d(str, "percentage")) {
                cVar2 = new d(new p4(cVar3, (p4) (t4Var != null ? t4Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "fixed")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                cVar2 = new c(new l4(cVar3, (l4) (t4Var != null ? t4Var.c() : null), false, jSONObject2));
            }
            return cVar2;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends t4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l4 f42750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l4 l4Var) {
            super(null);
            fd.j0.i(l4Var, "value");
            this.f42750c = l4Var;
        }
    }

    public static class d extends t4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p4 f42751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p4 p4Var) {
            super(null);
            fd.j0.i(p4Var, "value");
            this.f42751c = p4Var;
        }
    }

    public t4() {
    }

    public t4(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            return new s4.d(((d) this).f42751c.a(cVar, jSONObject));
        }
        if (this instanceof c) {
            return new s4.c(((c) this).f42750c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f42751c;
        }
        if (this instanceof c) {
            return ((c) this).f42750c;
        }
        throw new jc.g();
    }
}
