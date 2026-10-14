package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i5 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40607a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, i5> f40608b = a.f40609c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, i5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40609c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public i5 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(i5.f40607a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "fixed")) {
                return new c(k5.f41097c.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "relative")) {
                return new d(o5.f41822b.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            j5 j5Var = bVarA instanceof j5 ? (j5) bVarA : null;
            if (j5Var != null) {
                return j5Var.a(cVar2, jSONObject2);
            }
            throw y8.c0.U(jSONObject2, "type", str);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends i5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k5 f40610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k5 k5Var) {
            super(null);
            fd.j0.i(k5Var, "value");
            this.f40610c = k5Var;
        }
    }

    public static class d extends i5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o5 f40611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o5 o5Var) {
            super(null);
            fd.j0.i(o5Var, "value");
            this.f40611c = o5Var;
        }
    }

    public i5() {
    }

    public i5(vc.g gVar) {
    }

    public Object a() {
        if (this instanceof c) {
            return ((c) this).f40610c;
        }
        if (this instanceof d) {
            return ((d) this).f40611c;
        }
        throw new jc.g();
    }
}
