package y9;

import com.applovin.sdk.AppLovinEventParameters;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v3 implements u9.a, u9.b<t3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f43451a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, v3> f43452b = a.f43453c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, v3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43453c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public v3 invoke(u9.c cVar, JSONObject jSONObject) {
            v3 cVar2;
            u9.c cVar3 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(v3.f43451a);
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar3.a(), cVar3);
            u9.b bVar = cVar3.b().get(str);
            v3 v3Var = bVar instanceof v3 ? (v3) bVar : null;
            if (v3Var != null) {
                if (v3Var instanceof d) {
                    str = "fixed_length";
                } else {
                    if (!(v3Var instanceof c)) {
                        throw new jc.g();
                    }
                    str = AppLovinEventParameters.REVENUE_CURRENCY;
                }
            }
            if (fd.j0.d(str, "fixed_length")) {
                cVar2 = new d(new j2(cVar3, (j2) (v3Var != null ? v3Var.c() : null), false, jSONObject2));
            } else {
                if (!fd.j0.d(str, AppLovinEventParameters.REVENUE_CURRENCY)) {
                    throw y8.c0.U(jSONObject2, "type", str);
                }
                cVar2 = new c(new h1(cVar3, (h1) (v3Var != null ? v3Var.c() : null), false, jSONObject2));
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

    public static class c extends v3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h1 f43454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h1 h1Var) {
            super(null);
            fd.j0.i(h1Var, "value");
            this.f43454c = h1Var;
        }
    }

    public static class d extends v3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j2 f43455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j2 j2Var) {
            super(null);
            fd.j0.i(j2Var, "value");
            this.f43455c = j2Var;
        }
    }

    public v3() {
    }

    public v3(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            return new t3.d(((d) this).f43455c.a(cVar, jSONObject));
        }
        if (this instanceof c) {
            return new t3.c(((c) this).f43454c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f43455c;
        }
        if (this instanceof c) {
            return ((c) this).f43454c;
        }
        throw new jc.g();
    }
}
