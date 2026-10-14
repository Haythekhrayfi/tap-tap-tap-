package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s5 implements u9.a, u9.b<h5> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i5.d f42568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i5.d f42569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m5.d f42570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.g<Integer> f42571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.g<Integer> f42572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, i5> f42573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, i5> f42574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.c<Integer>> f42575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, m5> f42576m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<j5> f42577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<j5> f42578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.c<Integer>> f42579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<n5> f42580d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, i5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42581c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public i5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(i5.f40607a);
            i5 i5Var = (i5) h9.c.n(jSONObject2, str2, i5.f40608b, cVar2.a(), cVar2);
            return i5Var == null ? s5.f42568e : i5Var;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, i5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42582c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public i5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(i5.f40607a);
            i5 i5Var = (i5) h9.c.n(jSONObject2, str2, i5.f40608b, cVar2.a(), cVar2);
            return i5Var == null ? s5.f42569f : i5Var;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.c<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42583c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.c<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.j(jSONObject2, str2, h9.h.f30978a, s5.f42571h, cVar2.a(), cVar2, h9.l.f31002f);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, m5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42584c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public m5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(m5.f41443a);
            m5 m5Var = (m5) h9.c.n(jSONObject2, str2, m5.f41444b, cVar2.a(), cVar2);
            return m5Var == null ? s5.f42570g : m5Var;
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    static {
        new e(null);
        v9.b.a aVar = v9.b.f36747a;
        Double dValueOf = Double.valueOf(0.5d);
        f42568e = new i5.d(new o5(aVar.a(dValueOf)));
        f42569f = new i5.d(new o5(aVar.a(dValueOf)));
        f42570g = new m5.d(new q5(aVar.a(q5.c.FARTHEST_CORNER)));
        f42571h = q4.f42149w;
        f42572i = u4.f43080q;
        f42573j = a.f42581c;
        f42574k = b.f42582c;
        f42575l = c.f42583c;
        f42576m = d.f42584c;
    }

    public s5(u9.c cVar, s5 s5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<j5> aVar = s5Var == null ? null : s5Var.f42577a;
        Objects.requireNonNull(j5.f40908a);
        uc.p<u9.c, JSONObject, j5> pVar = j5.f40909b;
        j9.a<j5> aVarO = h9.e.o(jSONObject, "center_x", z10, aVar, pVar, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42577a = aVarO;
        j9.a<j5> aVarO2 = h9.e.o(jSONObject, "center_y", z10, s5Var == null ? null : s5Var.f42578b, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42578b = aVarO2;
        j9.a<v9.c<Integer>> aVarA = h9.e.a(jSONObject, "colors", z10, s5Var == null ? null : s5Var.f42579c, h9.h.f30978a, f42572i, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarA, "readExpressionListField(…, env, TYPE_HELPER_COLOR)");
        this.f42579c = aVarA;
        j9.a<n5> aVar2 = s5Var == null ? null : s5Var.f42580d;
        Objects.requireNonNull(n5.f41688a);
        j9.a<n5> aVarO3 = h9.e.o(jSONObject, "radius", z10, aVar2, n5.f41689b, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42580d = aVarO3;
    }

    public /* synthetic */ s5(u9.c cVar, s5 s5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : s5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        i5 i5Var = (i5) y8.c0.K(this.f42577a, cVar, "center_x", jSONObject, f42573j);
        if (i5Var == null) {
            i5Var = f42568e;
        }
        i5 i5Var2 = (i5) y8.c0.K(this.f42578b, cVar, "center_y", jSONObject, f42574k);
        if (i5Var2 == null) {
            i5Var2 = f42569f;
        }
        v9.c cVarF = y8.c0.F(this.f42579c, cVar, "colors", jSONObject, f42575l);
        m5 m5Var = (m5) y8.c0.K(this.f42580d, cVar, "radius", jSONObject, f42576m);
        if (m5Var == null) {
            m5Var = f42570g;
        }
        return new h5(i5Var, i5Var2, cVarF, m5Var);
    }
}
