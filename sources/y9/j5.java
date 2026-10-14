package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j5 implements u9.a, u9.b<i5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40908a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, j5> f40909b = a.f40910c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, j5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40910c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public j5 invoke(u9.c cVar, JSONObject jSONObject) {
            j5 dVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(j5.f40908a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            j5 j5Var = bVar instanceof j5 ? (j5) bVar : null;
            if (j5Var != null) {
                if (j5Var instanceof c) {
                    str = "fixed";
                } else {
                    if (!(j5Var instanceof d)) {
                        throw new jc.g();
                    }
                    str = "relative";
                }
            }
            if (fd.j0.d(str, "fixed")) {
                dVar = new c(new l5(cVar2, (l5) (j5Var != null ? j5Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "relative")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                dVar = new d(new p5(cVar2, (p5) (j5Var != null ? j5Var.c() : null), false, jSONObject2));
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

    public static class c extends j5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l5 f40911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l5 l5Var) {
            super(null);
            fd.j0.i(l5Var, "value");
            this.f40911c = l5Var;
        }
    }

    public static class d extends j5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p5 f40912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p5 p5Var) {
            super(null);
            fd.j0.i(p5Var, "value");
            this.f40912c = p5Var;
        }
    }

    public j5() {
    }

    public j5(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new i5.c(((c) this).f40911c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new i5.d(((d) this).f40912c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof c) {
            return ((c) this).f40911c;
        }
        if (this instanceof d) {
            return ((d) this).f40912c;
        }
        throw new jc.g();
    }
}
