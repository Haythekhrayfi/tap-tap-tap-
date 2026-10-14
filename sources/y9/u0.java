package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u0 implements u9.a, u9.b<t0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2 f42932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f42933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f42934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, c7> f42935g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f42936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<m2> f42937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<d7> f42938c;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42939c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30978a, cVar2.a(), cVar2, h9.l.f31002f);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42940c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public l2 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject2, str2, l2.f41214g, cVar2.a(), cVar2);
            return l2Var == null ? u0.f42932d : l2Var;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, c7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42941c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public c7 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c7.f39537d);
            return (c7) h9.c.n(jSONObject2, str2, c7.f39542i, cVar2.a(), cVar2);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    static {
        new d(null);
        f42932d = new l2(null, v9.b.f36747a.a(10L), 1, null);
        f42933e = a.f42939c;
        f42934f = b.f42940c;
        f42935g = c.f42941c;
    }

    public u0(u9.c cVar, u0 u0Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "background_color", z10, u0Var == null ? null : u0Var.f42936a, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f42936a = aVarS;
        j9.a<m2> aVar = u0Var == null ? null : u0Var.f42937b;
        Objects.requireNonNull(m2.f41420c);
        j9.a<m2> aVarO = h9.e.o(jSONObject, "radius", z10, aVar, m2.f41427j, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42937b = aVarO;
        j9.a<d7> aVar2 = u0Var == null ? null : u0Var.f42938c;
        Objects.requireNonNull(d7.f39693d);
        j9.a<d7> aVarO2 = h9.e.o(jSONObject, "stroke", z10, aVar2, d7.f39702m, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42938c = aVarO2;
    }

    public /* synthetic */ u0(u9.c cVar, u0 u0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : u0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b bVar = (v9.b) y8.c0.H(this.f42936a, cVar, "background_color", jSONObject, f42933e);
        l2 l2Var = (l2) y8.c0.K(this.f42937b, cVar, "radius", jSONObject, f42934f);
        if (l2Var == null) {
            l2Var = f42932d;
        }
        return new t0(bVar, l2Var, (c7) y8.c0.K(this.f42938c, cVar, "stroke", jSONObject, f42935g));
    }
}
