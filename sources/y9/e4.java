package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e4 implements u9.a, u9.b<z3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39764a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, e4> f39765b = a.f39766c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39766c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public e4 invoke(u9.c cVar, JSONObject jSONObject) {
            e4 cVar2;
            u9.c cVar3 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(e4.f39764a);
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar3.a(), cVar3);
            u9.b bVar = cVar3.b().get(str);
            e4 e4Var = bVar instanceof e4 ? (e4) bVar : null;
            if (e4Var != null) {
                if (e4Var instanceof d) {
                    str = "regex";
                } else {
                    if (!(e4Var instanceof c)) {
                        throw new jc.g();
                    }
                    str = "expression";
                }
            }
            if (fd.j0.d(str, "regex")) {
                cVar2 = new d(new d4(cVar3, (d4) (e4Var != null ? e4Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "expression")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                cVar2 = new c(new b4(cVar3, (b4) (e4Var != null ? e4Var.c() : null), false, jSONObject2));
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

    public static class c extends e4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b4 f39767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b4 b4Var) {
            super(null);
            fd.j0.i(b4Var, "value");
            this.f39767c = b4Var;
        }
    }

    public static class d extends e4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d4 f39768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d4 d4Var) {
            super(null);
            fd.j0.i(d4Var, "value");
            this.f39768c = d4Var;
        }
    }

    public e4() {
    }

    public e4(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            return new z3.d(((d) this).f39768c.a(cVar, jSONObject));
        }
        if (this instanceof c) {
            return new z3.c(((c) this).f39767c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f39768c;
        }
        if (this instanceof c) {
            return ((c) this).f39767c;
        }
        throw new jc.g();
    }
}
