package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g6 implements u9.a, u9.b<f6> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f40174e = new f(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Double> f40175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f40176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Integer> f40177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Double> f40178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Double> f40179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f40180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f40181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f40182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f40184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, f5> f40185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, g6> f40186q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f40187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f40189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<g5> f40190d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40191c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = g6.f40179j;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = g6.f40175f;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40192c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = g6.f40181l;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = g6.f40176g;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40193c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Integer> lVar = h9.h.f30978a;
            u9.e eVarA = cVar2.a();
            v9.b<Integer> bVar = g6.f40177h;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class d extends vc.l implements uc.p<u9.c, JSONObject, g6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40194c = new d();

        public d() {
            super(2);
        }

        @Override // uc.p
        public g6 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new g6(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, f5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f40195c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public f5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f5.f39958c);
            uc.p<u9.c, JSONObject, f5> pVar = f5.f39959d;
            cVar2.a();
            return (f5) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class f {
        public f() {
        }

        public f(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f40175f = aVar.a(Double.valueOf(0.19d));
        f40176g = aVar.a(2L);
        f40177h = aVar.a(0);
        f40178i = a6.A;
        f40179j = c6.f39530u;
        f40180k = a6.B;
        f40181l = c6.f39531v;
        f40182m = a.f40191c;
        f40183n = b.f40192c;
        f40184o = c.f40193c;
        f40185p = e.f40195c;
        f40186q = d.f40194c;
    }

    public g6(u9.c cVar, g6 g6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, g6Var == null ? null : g6Var.f40187a, h9.h.f30981d, f40178i, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f40187a = aVarR;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "blur", z10, g6Var == null ? null : g6Var.f40188b, h9.h.f30982e, f40180k, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40188b = aVarR2;
        j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "color", z10, g6Var == null ? null : g6Var.f40189c, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f40189c = aVarS;
        j9.a<g5> aVar = g6Var == null ? null : g6Var.f40190d;
        Objects.requireNonNull(g5.f40165c);
        this.f40190d = h9.e.f(jSONObject, "offset", z10, aVar, g5.f40168f, eVarA, cVar);
    }

    public /* synthetic */ g6(u9.c cVar, g6 g6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : g6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Double> bVar = (v9.b) y8.c0.H(this.f40187a, cVar, "alpha", jSONObject, f40182m);
        if (bVar == null) {
            bVar = f40175f;
        }
        v9.b<Long> bVar2 = (v9.b) y8.c0.H(this.f40188b, cVar, "blur", jSONObject, f40183n);
        if (bVar2 == null) {
            bVar2 = f40176g;
        }
        v9.b<Integer> bVar3 = (v9.b) y8.c0.H(this.f40189c, cVar, "color", jSONObject, f40184o);
        if (bVar3 == null) {
            bVar3 = f40177h;
        }
        return new f6(bVar, bVar2, bVar3, (f5) y8.c0.M(this.f40190d, cVar, "offset", jSONObject, f40185p));
    }
}
