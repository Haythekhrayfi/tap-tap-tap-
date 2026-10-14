package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1 implements u9.a, u9.b<d1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39734a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, e1> f39735b = a.f39736c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39736c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public e1 invoke(u9.c cVar, JSONObject jSONObject) {
            e1 cVar2;
            u9.c cVar3 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(e1.f39734a);
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar3.a(), cVar3);
            u9.b bVar = cVar3.b().get(str);
            e1 e1Var = bVar instanceof e1 ? (e1) bVar : null;
            if (e1Var != null) {
                if (e1Var instanceof d) {
                    str = "infinity";
                } else {
                    if (!(e1Var instanceof c)) {
                        throw new jc.g();
                    }
                    str = "fixed";
                }
            }
            if (fd.j0.d(str, "infinity")) {
                cVar2 = new d(new r3(cVar3, (r3) (e1Var != null ? e1Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "fixed")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                cVar2 = new c(new h2(cVar3, (h2) (e1Var != null ? e1Var.c() : null), false, jSONObject2));
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

    public static class c extends e1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h2 f39737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var) {
            super(null);
            fd.j0.i(h2Var, "value");
            this.f39737c = h2Var;
        }
    }

    public static class d extends e1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r3 f39738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r3 r3Var) {
            super(null);
            fd.j0.i(r3Var, "value");
            this.f39738c = r3Var;
        }
    }

    public e1() {
    }

    public e1(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d1 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            Objects.requireNonNull(((d) this).f39738c);
            return new d1.d(new q3());
        }
        if (this instanceof c) {
            return new d1.c(((c) this).f39737c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f39738c;
        }
        if (this instanceof c) {
            return ((c) this).f39737c;
        }
        throw new jc.g();
    }
}
