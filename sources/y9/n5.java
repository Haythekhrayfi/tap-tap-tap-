package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n5 implements u9.a, u9.b<m5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41688a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, n5> f41689b = a.f41690c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, n5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41690c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public n5 invoke(u9.c cVar, JSONObject jSONObject) {
            n5 dVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(n5.f41688a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            n5 n5Var = bVar instanceof n5 ? (n5) bVar : null;
            if (n5Var != null) {
                if (n5Var instanceof c) {
                    str = "fixed";
                } else {
                    if (!(n5Var instanceof d)) {
                        throw new jc.g();
                    }
                    str = "relative";
                }
            }
            if (fd.j0.d(str, "fixed")) {
                dVar = new c(new m2(cVar2, (m2) (n5Var != null ? n5Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "relative")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                dVar = new d(new r5(cVar2, (r5) (n5Var != null ? n5Var.c() : null), false, jSONObject2));
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

    public static class c extends n5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m2 f41691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m2 m2Var) {
            super(null);
            fd.j0.i(m2Var, "value");
            this.f41691c = m2Var;
        }
    }

    public static class d extends n5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r5 f41692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r5 r5Var) {
            super(null);
            fd.j0.i(r5Var, "value");
            this.f41692c = r5Var;
        }
    }

    public n5() {
    }

    public n5(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new m5.c(((c) this).f41691c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new m5.d(((d) this).f41692c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof c) {
            return ((c) this).f41691c;
        }
        if (this instanceof d) {
            return ((d) this).f41692c;
        }
        throw new jc.g();
    }
}
