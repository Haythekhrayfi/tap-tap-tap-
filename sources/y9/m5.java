package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m5 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41443a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, m5> f41444b = a.f41445c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41445c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public m5 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(m5.f41443a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "fixed")) {
                return new c(l2.f41210c.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, "relative")) {
                return new d(q5.f42153b.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            n5 n5Var = bVarA instanceof n5 ? (n5) bVarA : null;
            if (n5Var != null) {
                return n5Var.a(cVar2, jSONObject2);
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

    public static class c extends m5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l2 f41446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l2 l2Var) {
            super(null);
            fd.j0.i(l2Var, "value");
            this.f41446c = l2Var;
        }
    }

    public static class d extends m5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q5 f41447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q5 q5Var) {
            super(null);
            fd.j0.i(q5Var, "value");
            this.f41447c = q5Var;
        }
    }

    public m5() {
    }

    public m5(vc.g gVar) {
    }

    public Object a() {
        if (this instanceof c) {
            return ((c) this).f41446c;
        }
        if (this instanceof d) {
            return ((d) this).f41447c;
        }
        throw new jc.g();
    }
}
