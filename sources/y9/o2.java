package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o2 implements u9.a, u9.b<n2> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f41743f = new g(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k0 f41744g = new k0(null, null, null, null, null, 31, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.g<e0> f41745h = g2.f40113q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.g<f0> f41746i = k2.f41030n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.g<q> f41747j = g2.f40114r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.g<s> f41748k = k2.f41031o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.g<q> f41749l = g2.f40115s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.g<s> f41750m = k2.f41032p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<e0>> f41751n = a.f41762c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, k0> f41752o = b.f41763c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, n2.c> f41753p = d.f41765c;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q>> f41754q = e.f41766c;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q>> f41755r = f.f41767c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, o2> f41756s = c.f41764c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<List<f0>> f41757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<l0> f41758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<h> f41759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<s>> f41760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<s>> f41761e;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, List<e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41762c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public List<e0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(e0.f39726a);
            return h9.c.w(jSONObject2, str2, e0.f39727b, o2.f41745h, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41763c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public k0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject2, str2, k0.f40995i, cVar2.a(), cVar2);
            return k0Var == null ? o2.f41744g : k0Var;
        }
    }

    public static final class c extends vc.l implements uc.p<u9.c, JSONObject, o2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41764c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public o2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new o2(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, n2.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41765c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public n2.c b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(n2.c.f41644f);
            return (n2.c) h9.c.n(jSONObject2, str2, n2.c.f41650l, cVar2.a(), cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41766c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public List<q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q.f42091g);
            return h9.c.w(jSONObject2, str2, q.f42095k, o2.f41747j, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, List<q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f41767c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public List<q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q.f42091g);
            return h9.c.w(jSONObject2, str2, q.f42095k, o2.f41749l, cVar2.a(), cVar2);
        }
    }

    public static final class g {
        public g() {
        }

        public g(vc.g gVar) {
        }
    }

    public static class h implements u9.a, u9.b<n2.c> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f41768f = new g(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<String> f41769g = g2.f40116t;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.m<String> f41770h = k2.f41033q;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final h9.m<String> f41771i = g2.f40117u;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h9.m<String> f41772j = k2.f41034r;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.m<String> f41773k = g2.f40118v;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h9.m<String> f41774l = k2.f41035s;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final h9.m<String> f41775m = g2.f40119w;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final h9.m<String> f41776n = k2.f41036t;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final h9.m<String> f41777o = g2.f40120x;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final h9.m<String> f41778p = k2.f41037u;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41779q = b.f41791c;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41780r = c.f41792c;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41781s = d.f41793c;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41782t = e.f41794c;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41783u = f.f41795c;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, h> f41784v = a.f41790c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<String>> f41785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<String>> f41786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<String>> f41787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<v9.b<String>> f41788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<v9.b<String>> f41789e;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, h> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41790c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public h invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new h(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f41791c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.o(jSONObject2, str2, h.f41770h, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f41792c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.o(jSONObject2, str2, h.f41772j, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f41793c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.o(jSONObject2, str2, h.f41774l, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f41794c = new e();

            public e() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.o(jSONObject2, str2, h.f41776n, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f41795c = new f();

            public f() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.o(jSONObject2, str2, h.f41778p, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class g {
            public g() {
            }

            public g(vc.g gVar) {
            }
        }

        public h(u9.c cVar, h hVar, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<String>> aVar = hVar == null ? null : hVar.f41785a;
            h9.m<String> mVar = f41769g;
            h9.k<String> kVar = h9.l.f30999c;
            j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "down", z10, aVar, mVar, eVarA, cVar, kVar);
            fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f41785a = aVarP;
            j9.a<v9.b<String>> aVarP2 = h9.e.p(jSONObject, "forward", z10, hVar == null ? null : hVar.f41786b, f41771i, eVarA, cVar, kVar);
            fd.j0.h(aVarP2, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f41786b = aVarP2;
            j9.a<v9.b<String>> aVarP3 = h9.e.p(jSONObject, "left", z10, hVar == null ? null : hVar.f41787c, f41773k, eVarA, cVar, kVar);
            fd.j0.h(aVarP3, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f41787c = aVarP3;
            j9.a<v9.b<String>> aVarP4 = h9.e.p(jSONObject, "right", z10, hVar == null ? null : hVar.f41788d, f41775m, eVarA, cVar, kVar);
            fd.j0.h(aVarP4, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f41788d = aVarP4;
            j9.a<v9.b<String>> aVarP5 = h9.e.p(jSONObject, "up", z10, hVar == null ? null : hVar.f41789e, f41777o, eVarA, cVar, kVar);
            fd.j0.h(aVarP5, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f41789e = aVarP5;
        }

        public /* synthetic */ h(u9.c cVar, h hVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new n2.c((v9.b) y8.c0.H(this.f41785a, cVar, "down", jSONObject, f41779q), (v9.b) y8.c0.H(this.f41786b, cVar, "forward", jSONObject, f41780r), (v9.b) y8.c0.H(this.f41787c, cVar, "left", jSONObject, f41781s), (v9.b) y8.c0.H(this.f41788d, cVar, "right", jSONObject, f41782t), (v9.b) y8.c0.H(this.f41789e, cVar, "up", jSONObject, f41783u));
        }
    }

    public o2(u9.c cVar, o2 o2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<List<f0>> aVar = o2Var == null ? null : o2Var.f41757a;
        Objects.requireNonNull(f0.f39918a);
        j9.a<List<f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar, f0.f39919b, f41746i, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41757a = aVarU;
        j9.a<l0> aVar2 = o2Var == null ? null : o2Var.f41758b;
        Objects.requireNonNull(l0.f41168f);
        j9.a<l0> aVarO = h9.e.o(jSONObject, "border", z10, aVar2, l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41758b = aVarO;
        j9.a<h> aVar3 = o2Var == null ? null : o2Var.f41759c;
        Objects.requireNonNull(h.f41768f);
        j9.a<h> aVarO2 = h9.e.o(jSONObject, "next_focus_ids", z10, aVar3, h.f41784v, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41759c = aVarO2;
        j9.a<List<s>> aVar4 = o2Var == null ? null : o2Var.f41760d;
        s.k kVar = s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, s> pVar = s.f42400w;
        j9.a<List<s>> aVarU2 = h9.e.u(jSONObject, "on_blur", z10, aVar4, pVar, f41748k, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41760d = aVarU2;
        j9.a<List<s>> aVar5 = o2Var == null ? null : o2Var.f41761e;
        Objects.requireNonNull(kVar);
        j9.a<List<s>> aVarU3 = h9.e.u(jSONObject, "on_focus", z10, aVar5, pVar, f41750m, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41761e = aVarU3;
    }

    public /* synthetic */ o2(u9.c cVar, o2 o2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : o2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        List listL = y8.c0.L(this.f41757a, cVar, "background", jSONObject, f41745h, f41751n);
        k0 k0Var = (k0) y8.c0.K(this.f41758b, cVar, "border", jSONObject, f41752o);
        if (k0Var == null) {
            k0Var = f41744g;
        }
        return new n2(listL, k0Var, (n2.c) y8.c0.K(this.f41759c, cVar, "next_focus_ids", jSONObject, f41753p), y8.c0.L(this.f41760d, cVar, "on_blur", jSONObject, f41747j, f41754q), y8.c0.L(this.f41761e, cVar, "on_focus", jSONObject, f41749l, f41755r));
    }
}
