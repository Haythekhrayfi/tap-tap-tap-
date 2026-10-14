package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j2 implements u9.a, u9.b<i2> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<Boolean> f40738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<String> f40739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<String> f40740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.g<i2.b> f40741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.g<f> f40742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<String> f40743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f40744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f40745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<i2.b>> f40747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f40748o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<String>> f40750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<List<f>> f40751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<String> f40752d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40753c = new a();

        public a() {
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
            v9.b<Boolean> bVar = j2.f40738e;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<i2.b>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40754c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public List<i2.b> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(i2.b.f40571d);
            List<i2.b> listL = h9.c.l(jSONObject2, str2, i2.b.f40575h, j2.f40741h, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivF…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40755c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.e(jSONObject2, str2, j2.f40740g, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40756c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = j2.f40744k;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    public static class f implements u9.a, u9.b<i2.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f40757d = new e(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final v9.b<String> f40758e = v9.b.f36747a.a("_");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<String> f40759f = k2.f41020d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<String> f40760g = g2.f40108l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.m<String> f40761h = k2.f41021e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final h9.m<String> f40762i = g2.f40109m;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40763j = b.f40771c;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40764k = c.f40772c;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40765l = d.f40773c;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, f> f40766m = a.f40770c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<String>> f40767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<String>> f40768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<String>> f40769c;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, f> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40770c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public f invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new f(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f40771c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.e(jSONObject2, str2, f.f40760g, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f40772c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.e eVarA = y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env");
                v9.b<String> bVar = f.f40758e;
                v9.b<String> bVarR = h9.c.r(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, eVarA, bVar, h9.l.f30999c);
                return bVarR == null ? bVar : bVarR;
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f40773c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.o(jSONObject2, str2, f.f40762i, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class e {
            public e() {
            }

            public e(vc.g gVar) {
            }
        }

        public f(u9.c cVar, f fVar, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<String>> aVar = fVar == null ? null : fVar.f40767a;
            h9.m<String> mVar = f40759f;
            h9.k<String> kVar = h9.l.f30999c;
            this.f40767a = h9.e.g(jSONObject, Action.KEY_ATTRIBUTE, z10, aVar, mVar, eVarA, cVar, kVar);
            j9.a<v9.b<String>> aVarQ = h9.e.q(jSONObject, "placeholder", z10, fVar == null ? null : fVar.f40768b, eVarA, cVar, kVar);
            fd.j0.h(aVarQ, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f40768b = aVarQ;
            j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "regex", z10, fVar == null ? null : fVar.f40769c, f40761h, eVarA, cVar, kVar);
            fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f40769c = aVarP;
        }

        public /* synthetic */ f(u9.c cVar, f fVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : fVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            v9.b bVar = (v9.b) y8.c0.E(this.f40767a, cVar, Action.KEY_ATTRIBUTE, jSONObject, f40763j);
            v9.b<String> bVar2 = (v9.b) y8.c0.H(this.f40768b, cVar, "placeholder", jSONObject, f40764k);
            if (bVar2 == null) {
                bVar2 = f40758e;
            }
            return new i2.b(bVar, bVar2, (v9.b) y8.c0.H(this.f40769c, cVar, "regex", jSONObject, f40765l));
        }
    }

    static {
        new e(null);
        f40738e = v9.b.f36747a.a(Boolean.FALSE);
        f40739f = r1.B;
        f40740g = g2.f40105i;
        f40741h = r1.C;
        f40742i = g2.f40106j;
        f40743j = r1.D;
        f40744k = g2.f40107k;
        f40745l = a.f40753c;
        f40746m = c.f40755c;
        f40747n = b.f40754c;
        f40748o = d.f40756c;
    }

    public j2(u9.c cVar, j2 j2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Boolean>> aVarS = h9.e.s(jSONObject, "always_visible", z10, j2Var == null ? null : j2Var.f40749a, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40749a = aVarS;
        this.f40750b = h9.e.g(jSONObject, "pattern", z10, j2Var == null ? null : j2Var.f40750b, f40739f, eVarA, cVar, h9.l.f30999c);
        j9.a<List<f>> aVar = j2Var == null ? null : j2Var.f40751c;
        Objects.requireNonNull(f.f40757d);
        this.f40751c = h9.e.k(jSONObject, "pattern_elements", z10, aVar, f.f40766m, f40742i, eVarA, cVar);
        this.f40752d = h9.e.b(jSONObject, "raw_text_variable", z10, j2Var == null ? null : j2Var.f40752d, f40743j, eVarA, cVar);
    }

    public /* synthetic */ j2(u9.c cVar, j2 j2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : j2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Boolean> bVar = (v9.b) y8.c0.H(this.f40749a, cVar, "always_visible", jSONObject, f40745l);
        if (bVar == null) {
            bVar = f40738e;
        }
        return new i2(bVar, (v9.b) y8.c0.E(this.f40750b, cVar, "pattern", jSONObject, f40746m), y8.c0.N(this.f40751c, cVar, "pattern_elements", jSONObject, f40741h, f40747n), (String) y8.c0.E(this.f40752d, cVar, "raw_text_variable", jSONObject, f40748o));
    }
}
