package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a8 implements u9.a, u9.b<z7> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f39097d = new e(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z4.d f39098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z4.d f39099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z4> f39100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z4> f39101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f39102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, a8> f39103j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<e5> f39104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<e5> f39105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39106c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, a8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39107c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public a8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new a8(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, z4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39108c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public z4 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z4.f44615a);
            z4 z4Var = (z4) h9.c.n(jSONObject2, str2, z4.f44616b, cVar2.a(), cVar2);
            return z4Var == null ? a8.f39098e : z4Var;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, z4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39109c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public z4 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z4.f44615a);
            z4 z4Var = (z4) h9.c.n(jSONObject2, str2, z4.f44616b, cVar2.a(), cVar2);
            return z4Var == null ? a8.f39099f : z4Var;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39110c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30981d, cVar2.a(), cVar2, h9.l.f31000d);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        Double dValueOf = Double.valueOf(50.0d);
        f39098e = new z4.d(new c5(aVar.a(dValueOf)));
        f39099f = new z4.d(new c5(aVar.a(dValueOf)));
        f39100g = b.f39108c;
        f39101h = c.f39109c;
        f39102i = d.f39110c;
        f39103j = a.f39107c;
    }

    public a8(u9.c cVar, a8 a8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<e5> aVar = a8Var == null ? null : a8Var.f39104a;
        Objects.requireNonNull(e5.f39769a);
        uc.p<u9.c, JSONObject, e5> pVar = e5.f39770b;
        j9.a<e5> aVarO = h9.e.o(jSONObject, "pivot_x", z10, aVar, pVar, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39104a = aVarO;
        j9.a<e5> aVarO2 = h9.e.o(jSONObject, "pivot_y", z10, a8Var == null ? null : a8Var.f39105b, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39105b = aVarO2;
        j9.a<v9.b<Double>> aVarS = h9.e.s(jSONObject, "rotation", z10, a8Var == null ? null : a8Var.f39106c, h9.h.f30981d, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarS, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f39106c = aVarS;
    }

    public /* synthetic */ a8(u9.c cVar, a8 a8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : a8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        z4 z4Var = (z4) y8.c0.K(this.f39104a, cVar, "pivot_x", jSONObject, f39100g);
        if (z4Var == null) {
            z4Var = f39098e;
        }
        z4 z4Var2 = (z4) y8.c0.K(this.f39105b, cVar, "pivot_y", jSONObject, f39101h);
        if (z4Var2 == null) {
            z4Var2 = f39099f;
        }
        return new z7(z4Var, z4Var2, (v9.b) y8.c0.H(this.f39106c, cVar, "rotation", jSONObject, f39102i));
    }
}
