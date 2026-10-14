package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l0 implements u9.a, u9.b<k0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f41168f = new g(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Boolean> f41169g = v9.b.f36747a.a(Boolean.FALSE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f41170h = m.f41403u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f41171i = r.f42221u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41172j = b.f41184c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, b1> f41173k = a.f41183c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f41174l = d.f41186c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, f6> f41175m = e.f41187c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, c7> f41176n = f.f41188c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, l0> f41177o = c.f41185c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<c1> f41179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f41180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<g6> f41181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<d7> f41182e;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, b1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41183c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public b1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(b1.f39118e);
            return (b1) h9.c.n(jSONObject2, str2, b1.f39123j, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41184c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, l0.f41171i, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class c extends vc.l implements uc.p<u9.c, JSONObject, l0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41185c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public l0 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new l0(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41186c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            u9.e eVarA = cVar2.a();
            v9.b<Boolean> bVar = l0.f41169g;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, f6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41187c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public f6 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f6.f39963e);
            return (f6) h9.c.n(jSONObject2, str2, f6.f39969k, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, c7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f41188c = new f();

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

    public l0(u9.c cVar, l0 l0Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "corner_radius", z10, l0Var == null ? null : l0Var.f41178a, h9.h.f30982e, f41170h, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41178a = aVarR;
        j9.a<c1> aVar = l0Var == null ? null : l0Var.f41179b;
        Objects.requireNonNull(c1.f39349e);
        j9.a<c1> aVarO = h9.e.o(jSONObject, "corners_radius", z10, aVar, c1.f39362r, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41179b = aVarO;
        j9.a<v9.b<Boolean>> aVarS = h9.e.s(jSONObject, "has_shadow", z10, l0Var == null ? null : l0Var.f41180c, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f41180c = aVarS;
        j9.a<g6> aVar2 = l0Var == null ? null : l0Var.f41181d;
        Objects.requireNonNull(g6.f40174e);
        j9.a<g6> aVarO2 = h9.e.o(jSONObject, "shadow", z10, aVar2, g6.f40186q, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41181d = aVarO2;
        j9.a<d7> aVar3 = l0Var == null ? null : l0Var.f41182e;
        Objects.requireNonNull(d7.f39693d);
        j9.a<d7> aVarO3 = h9.e.o(jSONObject, "stroke", z10, aVar3, d7.f39702m, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41182e = aVarO3;
    }

    public /* synthetic */ l0(u9.c cVar, l0 l0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : l0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b bVar = (v9.b) y8.c0.H(this.f41178a, cVar, "corner_radius", jSONObject, f41172j);
        b1 b1Var = (b1) y8.c0.K(this.f41179b, cVar, "corners_radius", jSONObject, f41173k);
        v9.b<Boolean> bVar2 = (v9.b) y8.c0.H(this.f41180c, cVar, "has_shadow", jSONObject, f41174l);
        if (bVar2 == null) {
            bVar2 = f41169g;
        }
        return new k0(bVar, b1Var, bVar2, (f6) y8.c0.K(this.f41181d, cVar, "shadow", jSONObject, f41175m), (c7) y8.c0.K(this.f41182e, cVar, "stroke", jSONObject, f41176n));
    }
}
