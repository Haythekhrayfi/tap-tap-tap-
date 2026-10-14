package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y3 implements u9.a, u9.b<s3> {
    public static final h9.m<Long> A0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> A1;
    public static final h9.m<Long> B0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> B1;
    public static final h9.m<String> C0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> C1;
    public static final h9.m<String> D0;
    public static final uc.q<String, JSONObject, u9.c, String> D1;
    public static final h9.m<String> E0;
    public static final uc.q<String, JSONObject, u9.c, List<x7>> E1;
    public static final h9.m<String> F0;
    public static final uc.q<String, JSONObject, u9.c, z7> F1;
    public static final h9.m<Long> G0;
    public static final uc.q<String, JSONObject, u9.c, y9.r0> G1;
    public static final h9.m<Long> H0;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> H1;
    public static final h9.m<Long> I0;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> I1;
    public static final h9.m<Long> J0;
    public static final uc.q<String, JSONObject, u9.c, List<c8>> J1;
    public static final h9.m<Long> K0;
    public static final uc.q<String, JSONObject, u9.c, List<z3>> K1;
    public static final h9.m<Long> L0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> L1;
    public static final h9.g<y9.q> M0;
    public static final uc.q<String, JSONObject, u9.c, o8> M1;
    public static final h9.g<y9.s> N0;
    public static final uc.q<String, JSONObject, u9.c, List<o8>> N1;
    public static final h9.m<String> O0;
    public static final uc.q<String, JSONObject, u9.c, l6> O1;
    public static final h9.m<String> P0;
    public static final h9.g<x7> Q0;
    public static final y9.o R;
    public static final h9.g<y7> R0;
    public static final v9.b<Double> S;
    public static final h9.g<c8> S0;
    public static final y9.k0 T;
    public static final h9.g<c8> T0;
    public static final v9.b<p2> U;
    public static final h9.g<z3> U0;
    public static final v9.b<Long> V;
    public static final h9.g<e4> V0;
    public static final v9.b<n6> W;
    public static final h9.g<o8> W0;
    public static final v9.b<q2> X;
    public static final h9.g<p8> X0;
    public static final l6.e Y;
    public static final uc.q<String, JSONObject, u9.c, y9.o> Y0;
    public static final v9.b<Integer> Z;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<s3.i> f44351a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> f44352a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final v9.b<Double> f44353b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f44354b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final x1 f44355c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> f44356c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final x1 f44357d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.k0> f44358d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final v9.b<Boolean> f44359e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44360e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final v9.b<Integer> f44361f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q1>> f44362f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final z7 f44363g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<z1>> f44364g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final v9.b<n8> f44365h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, n2> f44366h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final l6.d f44367i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<p2>> f44368i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.k<y9.t> f44369j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44370j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.k<y9.u> f44371k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f44372k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.k<p2> f44373l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> f44374l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.k<n6> f44375m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f44376m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.k<q2> f44377n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f44378n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.k<s3.i> f44379o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f44380o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.k<n8> f44381p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f44382p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<Double> f44383q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44384q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.m<Double> f44385r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<s3.i>> f44386r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<y9.e0> f44387s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f44388s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<y9.f0> f44389t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44390t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<Long> f44391u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f44392u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.m<Long> f44393v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, t3> f44394v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<q1> f44395w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44396w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.g<s1> f44397x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, s3.j> f44398x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<z1> f44399y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f44400y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<a2> f44401z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44402z1;
    public final j9.a<y1> A;
    public final j9.a<v9.b<Long>> B;
    public final j9.a<v9.b<Boolean>> C;
    public final j9.a<List<y9.s>> D;
    public final j9.a<v9.b<Integer>> E;
    public final j9.a<String> F;
    public final j9.a<List<y7>> G;
    public final j9.a<a8> H;
    public final j9.a<y9.s0> I;
    public final j9.a<y9.b0> J;
    public final j9.a<y9.b0> K;
    public final j9.a<List<c8>> L;
    public final j9.a<List<e4>> M;
    public final j9.a<v9.b<n8>> N;
    public final j9.a<p8> O;
    public final j9.a<List<p8>> P;
    public final j9.a<m6> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f44403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f44404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f44405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f44407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<y9.l0> f44408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<s1>> f44410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<a2>> f44411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<o2> f44412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<p2>> f44413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f44415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<v9.b<q2>> f44416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<m6> f44417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f44418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f44419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<v9.b<String>> f44420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<String> f44421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<v9.b<s3.i>> f44422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<y1> f44425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v3> f44426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<z0> f44428z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44429c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public y9.o b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.o.f41700f);
            y9.o oVar = (y9.o) h9.c.n(jSONObject2, str2, y9.o.f41707m, cVar2.a(), cVar2);
            return oVar == null ? y3.R : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f44430c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public x1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x1.f44020f);
            x1 x1Var = (x1) h9.c.n(jSONObject2, str2, x1.f44031q, cVar2.a(), cVar2);
            return x1Var == null ? y3.f44357d0 : x1Var;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44431c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y9.t> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.t.Converter);
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, y3.f44369j0);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f44432c = new b0();

        public b0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, y3.L0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44433c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y9.u> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.u.Converter);
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, y3.f44371k0);
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f44434c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, y3.M0, cVar2.a(), cVar2);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44435c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = y3.f44385r0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = y3.S;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f44436c = new d0();

        public d0() {
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
            v9.b<Boolean> bVar = y3.f44359e0;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44437c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public List<y9.e0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.e0.f39726a);
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, y3.f44387s0, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f44438c = new e0();

        public e0() {
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
            v9.b<Integer> bVar = y3.f44361f0;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44439c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public y9.k0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.k0.f40992f);
            y9.k0 k0Var = (y9.k0) h9.c.n(jSONObject2, str2, y9.k0.f40995i, cVar2.a(), cVar2);
            return k0Var == null ? y3.T : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f44440c = new f0();

        public f0() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = y3.P0;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f44441c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, y3.f44393v0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f44442c = new g0();

        public g0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, y3.Q0, cVar2.a(), cVar2);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f44443c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public List<q1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q1.f42118a);
            return h9.c.w(jSONObject2, str2, q1.f42126i, y3.f44395w0, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f44444c = new h0();

        public h0() {
            super(3);
        }

        @Override // uc.q
        public z7 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject2, str2, z7.f44790g, cVar2.a(), cVar2);
            return z7Var == null ? y3.f44363g0 : z7Var;
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f44445c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, y3.f44399y0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f44446c = new i0();

        public i0() {
            super(3);
        }

        @Override // uc.q
        public y9.r0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.r0.f42228a);
            return (y9.r0) h9.c.n(jSONObject2, str2, y9.r0.f42229b, cVar2.a(), cVar2);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f44447c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public n2 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(n2.f41632f);
            return (n2) h9.c.n(jSONObject2, str2, n2.f41637k, cVar2.a(), cVar2);
        }
    }

    public static final class j0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f44448c = new j0();

        public j0() {
            super(3);
        }

        @Override // uc.q
        public y9.a0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.a0.f38966a);
            return (y9.a0) h9.c.n(jSONObject2, str2, y9.a0.f38967b, cVar2.a(), cVar2);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<p2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f44449c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<p2> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(p2.Converter);
            uc.l lVar = p2.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<p2> bVar = y3.U;
            v9.b<p2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y3.f44373l0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class k0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f44450c = new k0();

        public k0() {
            super(3);
        }

        @Override // uc.q
        public y9.a0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.a0.f38966a);
            return (y9.a0) h9.c.n(jSONObject2, str2, y9.a0.f38967b, cVar2.a(), cVar2);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f44451c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = y3.B0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = y3.V;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f44452c = new l0();

        public l0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, y3.S0, cVar2.a(), cVar2);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f44453c = new m();

        public m() {
            super(3);
        }

        @Override // uc.q
        public v9.b<n6> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<n6> bVar = y3.W;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y3.f44375m0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f44454c = new m0();

        public m0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f44455c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public v9.b<q2> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q2.Converter);
            uc.l lVar = q2.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<q2> bVar = y3.X;
            v9.b<q2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y3.f44377n0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class n0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f44456c = new n0();

        public n0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f44457c = new o();

        public o() {
            super(3);
        }

        @Override // uc.q
        public l6 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l6.f41236a);
            l6 l6Var = (l6) h9.c.n(jSONObject2, str2, l6.f41237b, cVar2.a(), cVar2);
            return l6Var == null ? y3.Y : l6Var;
        }
    }

    public static final class o0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f44458c = new o0();

        public o0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof p2);
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f44459c = new p();

        public p() {
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

    public static final class p0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f44460c = new p0();

        public p0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f44461c = new q();

        public q() {
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
            v9.b<Integer> bVar = y3.Z;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class q0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f44462c = new q0();

        public q0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof q2);
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f44463c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, y3.D0, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class r0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f44464c = new r0();

        public r0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof s3.i);
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f44465c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, y3.F0, cVar2.a());
        }
    }

    public static final class s0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s0 f44466c = new s0();

        public s0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<s3.i>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f44467c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public v9.b<s3.i> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(s3.i.Converter);
            uc.l lVar = s3.i.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<s3.i> bVar = y3.f44351a0;
            v9.b<s3.i> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y3.f44379o0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class t0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<z3>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t0 f44468c = new t0();

        public t0() {
            super(3);
        }

        @Override // uc.q
        public List<z3> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z3.f44612a);
            return h9.c.w(jSONObject2, str2, z3.f44613b, y3.U0, cVar2.a(), cVar2);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f44469c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = y3.f44353b0;
            v9.b<Double> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31000d);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class u0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u0 f44470c = new u0();

        public u0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, y3.W0, cVar2.a(), cVar2);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f44471c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, y3.H0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class v0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v0 f44472c = new v0();

        public v0() {
            super(3);
        }

        @Override // uc.q
        public o8 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return (o8) h9.c.n(jSONObject2, str2, o8.f41853q, cVar2.a(), cVar2);
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f44473c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public x1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x1.f44020f);
            x1 x1Var = (x1) h9.c.n(jSONObject2, str2, x1.f44031q, cVar2.a(), cVar2);
            return x1Var == null ? y3.f44355c0 : x1Var;
        }
    }

    public static final class w0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w0 f44474c = new w0();

        public w0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<n8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(n8.Converter);
            uc.l lVar = n8.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<n8> bVar = y3.f44365h0;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y3.f44381p0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, t3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f44475c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public t3 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t3.f42742a);
            return (t3) h9.c.n(jSONObject2, str2, t3.f42743b, cVar2.a(), cVar2);
        }
    }

    public static final class x0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x0 f44476c = new x0();

        public x0() {
            super(3);
        }

        @Override // uc.q
        public l6 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l6.f41236a);
            l6 l6Var = (l6) h9.c.n(jSONObject2, str2, l6.f41237b, cVar2.a(), cVar2);
            return l6Var == null ? y3.f44367i0 : l6Var;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f44477c = new y();

        public y() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, y3.J0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class y0 {
        public y0() {
        }

        public y0(vc.g gVar) {
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, s3.j> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f44478c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public s3.j b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(s3.j.f42559b);
            return (s3.j) h9.c.n(jSONObject2, str2, s3.j.f42560c, cVar2.a(), cVar2);
        }
    }

    public static class z0 implements u9.a, u9.b<s3.j> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f44479b = new c(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f44480c = a.f44483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, z0> f44481d = b.f44484c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f44482a;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f44483c = new a();

            public a() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.h(jSONObject2, str2, h9.h.f30978a, cVar2.a(), cVar2, h9.l.f31002f);
            }
        }

        public static final class b extends vc.l implements uc.p<u9.c, JSONObject, z0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f44484c = new b();

            public b() {
                super(2);
            }

            @Override // uc.p
            public z0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new z0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class c {
            public c() {
            }

            public c(vc.g gVar) {
            }
        }

        public z0(u9.c cVar, z0 z0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            this.f44482a = h9.e.j(jSONObject, "color", z10, z0Var == null ? null : z0Var.f44482a, h9.h.f30978a, cVar.a(), cVar, h9.l.f31002f);
        }

        public /* synthetic */ z0(u9.c cVar, z0 z0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : z0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new s3.j((v9.b) y8.c0.E(this.f44482a, cVar, "color", jSONObject, f44480c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new y0(null);
        vc.g gVar = null;
        R = new y9.o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        S = aVar.a(Double.valueOf(1.0d));
        T = new y9.k0(null, null, null, null, null, 31, null);
        U = aVar.a(p2.TEXT);
        V = aVar.a(12L);
        W = aVar.a(n6.SP);
        X = aVar.a(q2.REGULAR);
        Y = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        Z = aVar.a(1929379840);
        f44351a0 = aVar.a(s3.i.MULTI_LINE_TEXT);
        f44353b0 = aVar.a(Double.valueOf(0.0d));
        f44355c0 = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, gVar);
        f44357d0 = new x1(null, null, null, null, null, 31, null);
        f44359e0 = aVar.a(Boolean.FALSE);
        f44361f0 = aVar.a(-16777216);
        f44363g0 = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        f44365h0 = aVar.a(n8.VISIBLE);
        f44367i0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        m0 m0Var = m0.f44454c;
        fd.j0.i(objQ, "default");
        fd.j0.i(m0Var, "validator");
        f44369j0 = new h9.k.a.C0302a(objQ, m0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        n0 n0Var = n0.f44456c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(n0Var, "validator");
        f44371k0 = new h9.k.a.C0302a(objQ2, n0Var);
        Object objQ3 = kc.j.q(p2.values());
        o0 o0Var = o0.f44458c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(o0Var, "validator");
        f44373l0 = new h9.k.a.C0302a(objQ3, o0Var);
        Object objQ4 = kc.j.q(n6.values());
        p0 p0Var = p0.f44460c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(p0Var, "validator");
        f44375m0 = new h9.k.a.C0302a(objQ4, p0Var);
        Object objQ5 = kc.j.q(q2.values());
        q0 q0Var = q0.f44462c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(q0Var, "validator");
        f44377n0 = new h9.k.a.C0302a(objQ5, q0Var);
        Object objQ6 = kc.j.q(s3.i.values());
        r0 r0Var = r0.f44464c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(r0Var, "validator");
        f44379o0 = new h9.k.a.C0302a(objQ6, r0Var);
        Object objQ7 = kc.j.q(n8.values());
        s0 s0Var = s0.f44466c;
        fd.j0.i(objQ7, "default");
        fd.j0.i(s0Var, "validator");
        f44381p0 = new h9.k.a.C0302a(objQ7, s0Var);
        f44383q0 = o3.f41812t;
        f44385r0 = n3.f41673t;
        f44387s0 = x3.f44066g;
        f44389t0 = n3.B;
        f44391u0 = x3.f44069j;
        f44393v0 = n3.C;
        f44395w0 = x3.f44070k;
        f44397x0 = n3.D;
        f44399y0 = x3.f44071l;
        f44401z0 = w3.f43725d;
        A0 = n3.f41668o;
        B0 = o3.f41813u;
        C0 = n3.f41669p;
        D0 = o3.f41814v;
        E0 = n3.f41670q;
        F0 = o3.f41815w;
        G0 = n3.f41671r;
        H0 = o3.f41816x;
        I0 = n3.f41672s;
        J0 = o3.f41817y;
        K0 = o3.f41818z;
        L0 = n3.f41674u;
        M0 = o3.A;
        N0 = n3.f41675v;
        O0 = x3.f44063d;
        P0 = n3.f41676w;
        Q0 = x3.f44064e;
        R0 = n3.f41677x;
        S0 = x3.f44065f;
        T0 = n3.f41678y;
        U0 = n3.f41679z;
        V0 = x3.f44067h;
        W0 = n3.A;
        X0 = x3.f44068i;
        Y0 = a.f44429c;
        Z0 = b.f44431c;
        f44352a1 = c.f44433c;
        f44354b1 = d.f44435c;
        f44356c1 = e.f44437c;
        f44358d1 = f.f44439c;
        f44360e1 = g.f44441c;
        f44362f1 = h.f44443c;
        f44364g1 = i.f44445c;
        f44366h1 = j.f44447c;
        f44368i1 = k.f44449c;
        f44370j1 = l.f44451c;
        f44372k1 = m.f44453c;
        f44374l1 = n.f44455c;
        f44376m1 = o.f44457c;
        f44378n1 = p.f44459c;
        f44380o1 = q.f44461c;
        f44382p1 = r.f44463c;
        f44384q1 = s.f44465c;
        f44386r1 = t.f44467c;
        f44388s1 = u.f44469c;
        f44390t1 = v.f44471c;
        f44392u1 = w.f44473c;
        f44394v1 = x.f44475c;
        f44396w1 = y.f44477c;
        f44398x1 = z.f44478c;
        f44400y1 = a0.f44430c;
        f44402z1 = b0.f44432c;
        A1 = d0.f44436c;
        B1 = c0.f44434c;
        C1 = e0.f44438c;
        D1 = f0.f44440c;
        E1 = g0.f44442c;
        F1 = h0.f44444c;
        G1 = i0.f44446c;
        H1 = j0.f44448c;
        I1 = k0.f44450c;
        J1 = l0.f44452c;
        K1 = t0.f44468c;
        L1 = w0.f44474c;
        M1 = v0.f44472c;
        N1 = u0.f44470c;
        O1 = x0.f44476c;
    }

    public y3(u9.c cVar, y3 y3Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = y3Var == null ? null : y3Var.f44403a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44403a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = y3Var == null ? null : y3Var.f44404b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, f44369j0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f44404b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = y3Var == null ? null : y3Var.f44405c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, f44371k0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f44405c = aVarS2;
        j9.a<v9.b<Double>> aVar4 = y3Var == null ? null : y3Var.f44406d;
        uc.l<Number, Double> lVar = h9.h.f30981d;
        h9.m<Double> mVar = f44383q0;
        h9.k<Double> kVar = h9.l.f31000d;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, aVar4, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44406d = aVarR;
        j9.a<List<y9.f0>> aVar5 = y3Var == null ? null : y3Var.f44407e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar5, y9.f0.f39919b, f44389t0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44407e = aVarU;
        j9.a<y9.l0> aVar6 = y3Var == null ? null : y3Var.f44408f;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar6, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44408f = aVarO2;
        j9.a<v9.b<Long>> aVar7 = y3Var == null ? null : y3Var.f44409g;
        uc.l<Number, Long> lVar2 = h9.h.f30982e;
        h9.m<Long> mVar2 = f44391u0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar7, lVar2, mVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44409g = aVarR2;
        j9.a<List<s1>> aVar8 = y3Var == null ? null : y3Var.f44410h;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar8, s1.C, f44397x0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44410h = aVarU2;
        j9.a<List<a2>> aVar9 = y3Var == null ? null : y3Var.f44411i;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar9, a2.f39002h, f44401z0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44411i = aVarU3;
        j9.a<o2> aVar10 = y3Var == null ? null : y3Var.f44412j;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar10, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44412j = aVarO3;
        j9.a<v9.b<p2>> aVar11 = y3Var == null ? null : y3Var.f44413k;
        Objects.requireNonNull(p2.Converter);
        j9.a<v9.b<p2>> aVarS3 = h9.e.s(jSONObject, "font_family", z10, aVar11, p2.FROM_STRING, eVarA, cVar, f44373l0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp… TYPE_HELPER_FONT_FAMILY)");
        this.f44413k = aVarS3;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "font_size", z10, y3Var == null ? null : y3Var.f44414l, lVar2, A0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44414l = aVarR3;
        j9.a<v9.b<n6>> aVar12 = y3Var == null ? null : y3Var.f44415m;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS4 = h9.e.s(jSONObject, "font_size_unit", z10, aVar12, n6.FROM_STRING, eVarA, cVar, f44375m0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…PE_HELPER_FONT_SIZE_UNIT)");
        this.f44415m = aVarS4;
        j9.a<v9.b<q2>> aVar13 = y3Var == null ? null : y3Var.f44416n;
        Objects.requireNonNull(q2.Converter);
        j9.a<v9.b<q2>> aVarS5 = h9.e.s(jSONObject, "font_weight", z10, aVar13, q2.FROM_STRING, eVarA, cVar, f44377n0);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp… TYPE_HELPER_FONT_WEIGHT)");
        this.f44416n = aVarS5;
        j9.a<m6> aVar14 = y3Var == null ? null : y3Var.f44417o;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar14, pVar, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44417o = aVarO4;
        j9.a<v9.b<Integer>> aVar15 = y3Var == null ? null : y3Var.f44418p;
        uc.l<Object, Integer> lVar3 = h9.h.f30978a;
        h9.k<Integer> kVar3 = h9.l.f31002f;
        j9.a<v9.b<Integer>> aVarS6 = h9.e.s(jSONObject, "highlight_color", z10, aVar15, lVar3, eVarA, cVar, kVar3);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f44418p = aVarS6;
        j9.a<v9.b<Integer>> aVarS7 = h9.e.s(jSONObject, "hint_color", z10, y3Var == null ? null : y3Var.f44419q, lVar3, eVarA, cVar, kVar3);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f44419q = aVarS7;
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "hint_text", z10, y3Var == null ? null : y3Var.f44420r, C0, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f44420r = aVarP;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, y3Var == null ? null : y3Var.f44421s, E0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f44421s = aVarL;
        j9.a<v9.b<s3.i>> aVar16 = y3Var == null ? null : y3Var.f44422t;
        Objects.requireNonNull(s3.i.Converter);
        j9.a<v9.b<s3.i>> aVarS8 = h9.e.s(jSONObject, "keyboard_type", z10, aVar16, s3.i.FROM_STRING, eVarA, cVar, f44379o0);
        fd.j0.h(aVarS8, "readOptionalFieldWithExp…YPE_HELPER_KEYBOARD_TYPE)");
        this.f44422t = aVarS8;
        j9.a<v9.b<Double>> aVarS9 = h9.e.s(jSONObject, "letter_spacing", z10, y3Var == null ? null : y3Var.f44423u, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS9, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44423u = aVarS9;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "line_height", z10, y3Var == null ? null : y3Var.f44424v, lVar2, G0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44424v = aVarR4;
        j9.a<y1> aVar17 = y3Var == null ? null : y3Var.f44425w;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar2 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar17, pVar2, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44425w = aVarO5;
        j9.a<v3> aVar18 = y3Var == null ? null : y3Var.f44426x;
        Objects.requireNonNull(v3.f43451a);
        j9.a<v3> aVarO6 = h9.e.o(jSONObject, "mask", z10, aVar18, v3.f43452b, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44426x = aVarO6;
        j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "max_visible_lines", z10, y3Var == null ? null : y3Var.f44427y, lVar2, I0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44427y = aVarR5;
        j9.a<z0> aVar19 = y3Var == null ? null : y3Var.f44428z;
        Objects.requireNonNull(z0.f44479b);
        j9.a<z0> aVarO7 = h9.e.o(jSONObject, "native_interface", z10, aVar19, z0.f44481d, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44428z = aVarO7;
        j9.a<y1> aVar20 = y3Var == null ? null : y3Var.A;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO8 = h9.e.o(jSONObject, "paddings", z10, aVar20, pVar2, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO8;
        j9.a<v9.b<Long>> aVarR6 = h9.e.r(jSONObject, "row_span", z10, y3Var == null ? null : y3Var.B, lVar2, K0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR6, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.B = aVarR6;
        j9.a<v9.b<Boolean>> aVarS10 = h9.e.s(jSONObject, "select_all_on_focus", z10, y3Var == null ? null : y3Var.C, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS10, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.C = aVarS10;
        j9.a<List<y9.s>> aVar21 = y3Var == null ? null : y3Var.D;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar21, y9.s.f42400w, N0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.D = aVarU4;
        j9.a<v9.b<Integer>> aVarS11 = h9.e.s(jSONObject, "text_color", z10, y3Var == null ? null : y3Var.E, lVar3, eVarA, cVar, kVar3);
        fd.j0.h(aVarS11, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.E = aVarS11;
        this.F = h9.e.b(jSONObject, "text_variable", z10, y3Var == null ? null : y3Var.F, O0, eVarA, cVar);
        j9.a<List<y7>> aVar22 = y3Var == null ? null : y3Var.G;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar22, y7.f44555v, R0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.G = aVarU5;
        j9.a<a8> aVar23 = y3Var == null ? null : y3Var.H;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO9 = h9.e.o(jSONObject, "transform", z10, aVar23, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.H = aVarO9;
        j9.a<y9.s0> aVar24 = y3Var == null ? null : y3Var.I;
        Objects.requireNonNull(y9.s0.f42435a);
        j9.a<y9.s0> aVarO10 = h9.e.o(jSONObject, "transition_change", z10, aVar24, y9.s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.I = aVarO10;
        j9.a<y9.b0> aVar25 = y3Var == null ? null : y3Var.J;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar3 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO11 = h9.e.o(jSONObject, "transition_in", z10, aVar25, pVar3, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.J = aVarO11;
        j9.a<y9.b0> aVar26 = y3Var == null ? null : y3Var.K;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO12 = h9.e.o(jSONObject, "transition_out", z10, aVar26, pVar3, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.K = aVarO12;
        j9.a<List<c8>> aVar27 = y3Var == null ? null : y3Var.L;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar27, c8.FROM_STRING, T0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.L = aVarT;
        j9.a<List<e4>> aVar28 = y3Var == null ? null : y3Var.M;
        Objects.requireNonNull(e4.f39764a);
        j9.a<List<e4>> aVarU6 = h9.e.u(jSONObject, "validators", z10, aVar28, e4.f39765b, V0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.M = aVarU6;
        j9.a<v9.b<n8>> aVar29 = y3Var == null ? null : y3Var.N;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS12 = h9.e.s(jSONObject, "visibility", z10, aVar29, n8.FROM_STRING, eVarA, cVar, f44381p0);
        fd.j0.h(aVarS12, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.N = aVarS12;
        j9.a<p8> aVar30 = y3Var == null ? null : y3Var.O;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar4 = p8.C;
        j9.a<p8> aVarO13 = h9.e.o(jSONObject, "visibility_action", z10, aVar30, pVar4, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.O = aVarO13;
        j9.a<List<p8>> aVar31 = y3Var == null ? null : y3Var.P;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU7 = h9.e.u(jSONObject, "visibility_actions", z10, aVar31, pVar4, X0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.P = aVarU7;
        j9.a<m6> aVar32 = y3Var == null ? null : y3Var.Q;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO14 = h9.e.o(jSONObject, "width", z10, aVar32, pVar, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.Q = aVarO14;
    }

    public /* synthetic */ y3(u9.c cVar, y3 y3Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : y3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f44403a, cVar, "accessibility", jSONObject, Y0);
        if (oVar == null) {
            oVar = R;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f44404b, cVar, "alignment_horizontal", jSONObject, Z0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f44405c, cVar, "alignment_vertical", jSONObject, f44352a1);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f44406d, cVar, "alpha", jSONObject, f44354b1);
        if (bVar3 == null) {
            bVar3 = S;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f44407e, cVar, "background", jSONObject, f44387s0, f44356c1);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f44408f, cVar, "border", jSONObject, f44358d1);
        if (k0Var == null) {
            k0Var = T;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f44409g, cVar, "column_span", jSONObject, f44360e1);
        List listL2 = y8.c0.L(this.f44410h, cVar, "disappear_actions", jSONObject, f44395w0, f44362f1);
        List listL3 = y8.c0.L(this.f44411i, cVar, "extensions", jSONObject, f44399y0, f44364g1);
        n2 n2Var = (n2) y8.c0.K(this.f44412j, cVar, "focus", jSONObject, f44366h1);
        v9.b<p2> bVar6 = (v9.b) y8.c0.H(this.f44413k, cVar, "font_family", jSONObject, f44368i1);
        if (bVar6 == null) {
            bVar6 = U;
        }
        v9.b<p2> bVar7 = bVar6;
        v9.b<Long> bVar8 = (v9.b) y8.c0.H(this.f44414l, cVar, "font_size", jSONObject, f44370j1);
        if (bVar8 == null) {
            bVar8 = V;
        }
        v9.b<Long> bVar9 = bVar8;
        v9.b<n6> bVar10 = (v9.b) y8.c0.H(this.f44415m, cVar, "font_size_unit", jSONObject, f44372k1);
        if (bVar10 == null) {
            bVar10 = W;
        }
        v9.b<n6> bVar11 = bVar10;
        v9.b<q2> bVar12 = (v9.b) y8.c0.H(this.f44416n, cVar, "font_weight", jSONObject, f44374l1);
        if (bVar12 == null) {
            bVar12 = X;
        }
        v9.b<q2> bVar13 = bVar12;
        l6 l6Var = (l6) y8.c0.K(this.f44417o, cVar, "height", jSONObject, f44376m1);
        if (l6Var == null) {
            l6Var = Y;
        }
        l6 l6Var2 = l6Var;
        v9.b bVar14 = (v9.b) y8.c0.H(this.f44418p, cVar, "highlight_color", jSONObject, f44378n1);
        v9.b<Integer> bVar15 = (v9.b) y8.c0.H(this.f44419q, cVar, "hint_color", jSONObject, f44380o1);
        if (bVar15 == null) {
            bVar15 = Z;
        }
        v9.b<Integer> bVar16 = bVar15;
        v9.b bVar17 = (v9.b) y8.c0.H(this.f44420r, cVar, "hint_text", jSONObject, f44382p1);
        String str = (String) y8.c0.H(this.f44421s, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f44384q1);
        v9.b<s3.i> bVar18 = (v9.b) y8.c0.H(this.f44422t, cVar, "keyboard_type", jSONObject, f44386r1);
        if (bVar18 == null) {
            bVar18 = f44351a0;
        }
        v9.b<s3.i> bVar19 = bVar18;
        v9.b<Double> bVar20 = (v9.b) y8.c0.H(this.f44423u, cVar, "letter_spacing", jSONObject, f44388s1);
        if (bVar20 == null) {
            bVar20 = f44353b0;
        }
        v9.b<Double> bVar21 = bVar20;
        v9.b bVar22 = (v9.b) y8.c0.H(this.f44424v, cVar, "line_height", jSONObject, f44390t1);
        x1 x1Var = (x1) y8.c0.K(this.f44425w, cVar, "margins", jSONObject, f44392u1);
        if (x1Var == null) {
            x1Var = f44355c0;
        }
        x1 x1Var2 = x1Var;
        t3 t3Var = (t3) y8.c0.K(this.f44426x, cVar, "mask", jSONObject, f44394v1);
        v9.b bVar23 = (v9.b) y8.c0.H(this.f44427y, cVar, "max_visible_lines", jSONObject, f44396w1);
        s3.j jVar = (s3.j) y8.c0.K(this.f44428z, cVar, "native_interface", jSONObject, f44398x1);
        x1 x1Var3 = (x1) y8.c0.K(this.A, cVar, "paddings", jSONObject, f44400y1);
        if (x1Var3 == null) {
            x1Var3 = f44357d0;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar24 = (v9.b) y8.c0.H(this.B, cVar, "row_span", jSONObject, f44402z1);
        v9.b<Boolean> bVar25 = (v9.b) y8.c0.H(this.C, cVar, "select_all_on_focus", jSONObject, A1);
        if (bVar25 == null) {
            bVar25 = f44359e0;
        }
        v9.b<Boolean> bVar26 = bVar25;
        List listL4 = y8.c0.L(this.D, cVar, "selected_actions", jSONObject, M0, B1);
        v9.b<Integer> bVar27 = (v9.b) y8.c0.H(this.E, cVar, "text_color", jSONObject, C1);
        if (bVar27 == null) {
            bVar27 = f44361f0;
        }
        v9.b<Integer> bVar28 = bVar27;
        String str2 = (String) y8.c0.E(this.F, cVar, "text_variable", jSONObject, D1);
        List listL5 = y8.c0.L(this.G, cVar, "tooltips", jSONObject, Q0, E1);
        z7 z7Var = (z7) y8.c0.K(this.H, cVar, "transform", jSONObject, F1);
        if (z7Var == null) {
            z7Var = f44363g0;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.I, cVar, "transition_change", jSONObject, G1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.J, cVar, "transition_in", jSONObject, H1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.K, cVar, "transition_out", jSONObject, I1);
        List listJ = y8.c0.J(this.L, cVar, "transition_triggers", jSONObject, S0, J1);
        List listL6 = y8.c0.L(this.M, cVar, "validators", jSONObject, U0, K1);
        v9.b<n8> bVar29 = (v9.b) y8.c0.H(this.N, cVar, "visibility", jSONObject, L1);
        if (bVar29 == null) {
            bVar29 = f44365h0;
        }
        v9.b<n8> bVar30 = bVar29;
        o8 o8Var = (o8) y8.c0.K(this.O, cVar, "visibility_action", jSONObject, M1);
        List listL7 = y8.c0.L(this.P, cVar, "visibility_actions", jSONObject, W0, N1);
        l6 l6Var3 = (l6) y8.c0.K(this.Q, cVar, "width", jSONObject, O1);
        if (l6Var3 == null) {
            l6Var3 = f44367i0;
        }
        return new s3(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, listL2, listL3, n2Var, bVar7, bVar9, bVar11, bVar13, l6Var2, bVar14, bVar16, bVar17, str, bVar19, bVar21, bVar22, x1Var2, t3Var, bVar23, jVar, x1Var4, bVar24, bVar26, listL4, bVar28, str2, listL5, z7Var2, r0Var, a0Var, a0Var2, listJ, listL6, bVar30, o8Var, listL7, l6Var3);
    }
}
