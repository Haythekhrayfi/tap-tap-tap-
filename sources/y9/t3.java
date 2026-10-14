package y9;

import com.applovin.sdk.AppLovinEventParameters;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t3 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42742a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, t3> f42743b = a.f42744c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, t3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42744c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public t3 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(t3.f42742a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            if (fd.j0.d(str, "fixed_length")) {
                return new d(i2.f40562e.a(cVar2, jSONObject2));
            }
            if (fd.j0.d(str, AppLovinEventParameters.REVENUE_CURRENCY)) {
                return new c(f1.f39926c.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            v3 v3Var = bVarA instanceof v3 ? (v3) bVarA : null;
            if (v3Var != null) {
                return v3Var.a(cVar2, jSONObject2);
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

    public static class c extends t3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f1 f42745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f1 f1Var) {
            super(null);
            fd.j0.i(f1Var, "value");
            this.f42745c = f1Var;
        }
    }

    public static class d extends t3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i2 f42746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i2 i2Var) {
            super(null);
            fd.j0.i(i2Var, "value");
            this.f42746c = i2Var;
        }
    }

    public t3() {
    }

    public t3(vc.g gVar) {
    }

    public u3 a() {
        if (this instanceof d) {
            return ((d) this).f42746c;
        }
        if (this instanceof c) {
            return ((c) this).f42745c;
        }
        throw new jc.g();
    }
}
