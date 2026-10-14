package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u5 implements u9.a, u9.b<t5> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f43091f = new g(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l2 f43092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l2 f43093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l2 f43094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f43095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f43096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f43097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f43098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, c7> f43099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, u5> f43100o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f43101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<m2> f43102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<m2> f43103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<m2> f43104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<d7> f43105e;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43106c = new a();

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
        public static final b f43107c = new b();

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
            return l2Var == null ? u5.f43092g : l2Var;
        }
    }

    public static final class c extends vc.l implements uc.p<u9.c, JSONObject, u5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43108c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public u5 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new u5(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43109c = new d();

        public d() {
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
            return l2Var == null ? u5.f43093h : l2Var;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f43110c = new e();

        public e() {
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
            return l2Var == null ? u5.f43094i : l2Var;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, c7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43111c = new f();

        public f() {
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

    public static final class g {
        public g() {
        }

        public g(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f43092g = new l2(null, aVar.a(5L), 1, null);
        f43093h = new l2(null, aVar.a(10L), 1, null);
        f43094i = new l2(null, aVar.a(10L), 1, null);
        f43095j = a.f43106c;
        f43096k = b.f43107c;
        f43097l = d.f43109c;
        f43098m = e.f43110c;
        f43099n = f.f43111c;
        f43100o = c.f43108c;
    }

    public u5(u9.c cVar, u5 u5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "background_color", z10, u5Var == null ? null : u5Var.f43101a, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f43101a = aVarS;
        j9.a<m2> aVar = u5Var == null ? null : u5Var.f43102b;
        m2.e eVar = m2.f41420c;
        Objects.requireNonNull(eVar);
        uc.p<u9.c, JSONObject, m2> pVar = m2.f41427j;
        j9.a<m2> aVarO = h9.e.o(jSONObject, "corner_radius", z10, aVar, pVar, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43102b = aVarO;
        j9.a<m2> aVar2 = u5Var == null ? null : u5Var.f43103c;
        Objects.requireNonNull(eVar);
        j9.a<m2> aVarO2 = h9.e.o(jSONObject, "item_height", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43103c = aVarO2;
        j9.a<m2> aVar3 = u5Var == null ? null : u5Var.f43104d;
        Objects.requireNonNull(eVar);
        j9.a<m2> aVarO3 = h9.e.o(jSONObject, "item_width", z10, aVar3, pVar, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43104d = aVarO3;
        j9.a<d7> aVar4 = u5Var == null ? null : u5Var.f43105e;
        Objects.requireNonNull(d7.f39693d);
        j9.a<d7> aVarO4 = h9.e.o(jSONObject, "stroke", z10, aVar4, d7.f39702m, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43105e = aVarO4;
    }

    public /* synthetic */ u5(u9.c cVar, u5 u5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : u5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b bVar = (v9.b) y8.c0.H(this.f43101a, cVar, "background_color", jSONObject, f43095j);
        l2 l2Var = (l2) y8.c0.K(this.f43102b, cVar, "corner_radius", jSONObject, f43096k);
        if (l2Var == null) {
            l2Var = f43092g;
        }
        l2 l2Var2 = l2Var;
        l2 l2Var3 = (l2) y8.c0.K(this.f43103c, cVar, "item_height", jSONObject, f43097l);
        if (l2Var3 == null) {
            l2Var3 = f43093h;
        }
        l2 l2Var4 = l2Var3;
        l2 l2Var5 = (l2) y8.c0.K(this.f43104d, cVar, "item_width", jSONObject, f43098m);
        if (l2Var5 == null) {
            l2Var5 = f43094i;
        }
        return new t5(bVar, l2Var2, l2Var4, l2Var5, (c7) y8.c0.K(this.f43105e, cVar, "stroke", jSONObject, f43099n));
    }
}
