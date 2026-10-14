package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y7 implements u9.a, u9.b<x7> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f44541h = new j(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f44542i = v9.b.f36747a.a(5000L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<x7.d> f44543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f44544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f44545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<String> f44546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<String> f44547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v> f44548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v> f44549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, k> f44550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, f5> f44553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<x7.d>> f44554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, y7> f44555v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<x> f44556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<x> f44557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<i7> f44558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<String> f44560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<g5> f44561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<x7.d>> f44562g;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44563c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v.f43377h);
            return (v) h9.c.n(jSONObject2, str2, v.f43387r, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44564c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v.f43377h);
            return (v) h9.c.n(jSONObject2, str2, v.f43387r, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.p<u9.c, JSONObject, y7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44565c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public y7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new y7(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44566c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public k b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(k.f40973a);
            uc.p<u9.c, JSONObject, k> pVar = k.f40974b;
            cVar2.a();
            return (k) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44567c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = y7.f44545l;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = y7.f44542i;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44568c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = y7.f44547n;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, f5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f44569c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public f5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f5.f39958c);
            return (f5) h9.c.n(jSONObject2, str2, f5.f39959d, cVar2.a(), cVar2);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<x7.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f44570c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<x7.d> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.d.Converter);
            return h9.c.h(jSONObject2, str2, x7.d.FROM_STRING, cVar2.a(), cVar2, y7.f44543j);
        }
    }

    public static final class i extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f44571c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof x7.d);
        }
    }

    public static final class j {
        public j() {
        }

        public j(vc.g gVar) {
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(x7.d.values());
        i iVar = i.f44571c;
        fd.j0.i(objQ, "default");
        fd.j0.i(iVar, "validator");
        f44543j = new h9.k.a.C0302a(objQ, iVar);
        f44544k = w7.f43810d;
        f44545l = t7.f42921z;
        f44546m = w7.f43811e;
        f44547n = t7.A;
        f44548o = a.f44563c;
        f44549p = b.f44564c;
        f44550q = d.f44566c;
        f44551r = e.f44567c;
        f44552s = f.f44568c;
        f44553t = g.f44569c;
        f44554u = h.f44570c;
        f44555v = c.f44565c;
    }

    public y7(u9.c cVar, y7 y7Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<x> aVar = y7Var == null ? null : y7Var.f44556a;
        x.l lVar = x.f43838i;
        Objects.requireNonNull(lVar);
        uc.p<u9.c, JSONObject, x> pVar = x.D;
        j9.a<x> aVarO = h9.e.o(jSONObject, "animation_in", z10, aVar, pVar, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44556a = aVarO;
        j9.a<x> aVar2 = y7Var == null ? null : y7Var.f44557b;
        Objects.requireNonNull(lVar);
        j9.a<x> aVarO2 = h9.e.o(jSONObject, "animation_out", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44557b = aVarO2;
        j9.a<i7> aVar3 = y7Var == null ? null : y7Var.f44558c;
        Objects.requireNonNull(i7.f40616a);
        this.f44558c = h9.e.f(jSONObject, "div", z10, aVar3, i7.f40617b, eVarA, cVar);
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "duration", z10, y7Var == null ? null : y7Var.f44559d, h9.h.f30982e, f44544k, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44559d = aVarR;
        this.f44560e = h9.e.b(jSONObject, FacebookMediationAdapter.KEY_ID, z10, y7Var == null ? null : y7Var.f44560e, f44546m, eVarA, cVar);
        j9.a<g5> aVar4 = y7Var == null ? null : y7Var.f44561f;
        Objects.requireNonNull(g5.f40165c);
        j9.a<g5> aVarO3 = h9.e.o(jSONObject, "offset", z10, aVar4, g5.f40168f, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44561f = aVarO3;
        j9.a<v9.b<x7.d>> aVar5 = y7Var == null ? null : y7Var.f44562g;
        Objects.requireNonNull(x7.d.Converter);
        this.f44562g = h9.e.j(jSONObject, "position", z10, aVar5, x7.d.FROM_STRING, eVarA, cVar, f44543j);
    }

    public /* synthetic */ y7(u9.c cVar, y7 y7Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : y7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v vVar = (v) y8.c0.K(this.f44556a, cVar, "animation_in", jSONObject, f44548o);
        v vVar2 = (v) y8.c0.K(this.f44557b, cVar, "animation_out", jSONObject, f44549p);
        k kVar = (k) y8.c0.M(this.f44558c, cVar, "div", jSONObject, f44550q);
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f44559d, cVar, "duration", jSONObject, f44551r);
        if (bVar == null) {
            bVar = f44542i;
        }
        return new x7(vVar, vVar2, kVar, bVar, (String) y8.c0.E(this.f44560e, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f44552s), (f5) y8.c0.K(this.f44561f, cVar, "offset", jSONObject, f44553t), (v9.b) y8.c0.E(this.f44562g, cVar, "position", jSONObject, f44554u));
    }
}
