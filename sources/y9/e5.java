package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e5 implements u9.a, u9.b<z4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39769a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, e5> f39770b = a.f39771c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39771c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public e5 invoke(u9.c cVar, JSONObject jSONObject) {
            e5 dVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(e5.f39769a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            e5 e5Var = bVar instanceof e5 ? (e5) bVar : null;
            if (e5Var != null) {
                if (e5Var instanceof c) {
                    str = "pivot-fixed";
                } else {
                    if (!(e5Var instanceof d)) {
                        throw new jc.g();
                    }
                    str = "pivot-percentage";
                }
            }
            if (fd.j0.d(str, "pivot-fixed")) {
                dVar = new c(new b5(cVar2, (b5) (e5Var != null ? e5Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, "pivot-percentage")) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                dVar = new d(new d5(cVar2, (d5) (e5Var != null ? e5Var.c() : null), false, jSONObject2));
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

    public static class c extends e5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b5 f39772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b5 b5Var) {
            super(null);
            fd.j0.i(b5Var, "value");
            this.f39772c = b5Var;
        }
    }

    public static class d extends e5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d5 f39773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d5 d5Var) {
            super(null);
            fd.j0.i(d5Var, "value");
            this.f39773c = d5Var;
        }
    }

    public e5() {
    }

    public e5(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new z4.c(((c) this).f39772c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new z4.d(((d) this).f39773c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof c) {
            return ((c) this).f39772c;
        }
        if (this instanceof d) {
            return ((d) this).f39773c;
        }
        throw new jc.g();
    }
}
