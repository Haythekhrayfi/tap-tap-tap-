package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h7 implements u9.a, u9.b<f7> {
    public static final h9.g<y7> A0;
    public static final h9.g<c8> B0;
    public static final h9.g<c8> C0;
    public static final h9.g<o8> D0;
    public static final h9.g<p8> E0;
    public static final uc.q<String, JSONObject, u9.c, y9.o> F0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> G0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> H0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> I0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> J0;
    public static final y9.o K;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> K0;
    public static final v9.b<Double> L;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> L0;
    public static final y9.k0 M;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> M0;
    public static final v9.b<Boolean> N;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> N0;
    public static final v9.b<Boolean> O;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> O0;
    public static final l6.e P;
    public static final uc.q<String, JSONObject, u9.c, n2> P0;
    public static final x1 Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> Q0;
    public static final x1 R;
    public static final uc.q<String, JSONObject, u9.c, l6> R0;
    public static final v9.b<Boolean> S;
    public static final uc.q<String, JSONObject, u9.c, String> S0;
    public static final v9.b<Long> T;
    public static final uc.q<String, JSONObject, u9.c, List<f7.e>> T0;
    public static final v9.b<Integer> U;
    public static final uc.q<String, JSONObject, u9.c, x1> U0;
    public static final x1 V;
    public static final uc.q<String, JSONObject, u9.c, x1> V0;
    public static final v9.b<Boolean> W;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> W0;
    public static final f7.f X;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> X0;
    public static final x1 Y;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> Y0;
    public static final z7 Z;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<n8> f40294a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f40295a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final l6.d f40296b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f40297b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<y9.t> f40298c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f40299c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<y9.u> f40300d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, f7.f> f40301d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<n8> f40302e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f40303e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.m<Double> f40304f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f40305f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.m<Double> f40306g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f40307g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<y9.e0> f40308h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, r0> f40309h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<y9.f0> f40310i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f40311i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<Long> f40312j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f40313j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Long> f40314k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f40315k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<q1> f40316l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f40317l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<s1> f40318m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f40319m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<z1> f40320n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f40321n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<a2> f40322o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f40323o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<String> f40324p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<String> f40325q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<f7.e> f40326r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<o0> f40327s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<Long> f40328t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<Long> f40329u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<y9.q> f40330v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<y9.s> f40331w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<Long> f40332x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.m<Long> f40333y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<x7> f40334z0;
    public final j9.a<List<y7>> A;
    public final j9.a<a8> B;
    public final j9.a<s0> C;
    public final j9.a<y9.b0> D;
    public final j9.a<y9.b0> E;
    public final j9.a<List<c8>> F;
    public final j9.a<v9.b<n8>> G;
    public final j9.a<p8> H;
    public final j9.a<List<p8>> I;
    public final j9.a<m6> J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f40335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f40336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f40337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f40338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f40339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<y9.l0> f40340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<s1>> f40342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<List<a2>> f40344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<o2> f40345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<m6> f40347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<String> f40348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<o0>> f40349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<y1> f40350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<y1> f40351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<List<y9.s>> f40354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40355u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f40356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<y1> f40357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<p0> f40359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<y1> f40360z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40361c = new a();

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
            return oVar == null ? h7.K : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f40362c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, h7.f40334z0, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40363c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, h7.f40298c0);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f40364c = new b0();

        public b0() {
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
            return z7Var == null ? h7.Z : z7Var;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40365c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, h7.f40300d0);
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f40366c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public r0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(r0.f42228a);
            return (r0) h9.c.n(jSONObject2, str2, r0.f42229b, cVar2.a(), cVar2);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40367c = new d();

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
            h9.m<Double> mVar = h7.f40306g0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = h7.L;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f40368c = new d0();

        public d0() {
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

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f40369c = new e();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, h7.f40308h0, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f40370c = new e0();

        public e0() {
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

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f40371c = new f();

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
            return k0Var == null ? h7.M : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f40372c = new f0();

        public f0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, h7.B0, cVar2.a(), cVar2);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f40373c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, h7.f40314k0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f40374c = new g0();

        public g0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f40375c = new h();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, h7.f40316l0, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f40376c = new h0();

        public h0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f40377c = new i();

        public i() {
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
            v9.b<Boolean> bVar = h7.N;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class i0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f40378c = new i0();

        public i0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f40379c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, h7.f40320n0, cVar2.a(), cVar2);
        }
    }

    public static final class j0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f40380c = new j0();

        public j0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, h7.D0, cVar2.a(), cVar2);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f40381c = new k();

        public k() {
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

    public static final class k0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f40382c = new k0();

        public k0() {
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

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f40383c = new l();

        public l() {
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
            v9.b<Boolean> bVar = h7.O;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f40384c = new l0();

        public l0() {
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
            v9.b<n8> bVar = h7.f40294a0;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h7.f40302e0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f40385c = new m();

        public m() {
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
            return l6Var == null ? h7.P : l6Var;
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f40386c = new m0();

        public m0() {
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
            return l6Var == null ? h7.f40296b0 : l6Var;
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f40387c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, h7.f40325q0, cVar2.a());
        }
    }

    public static final class n0 {
        public n0() {
        }

        public n0(vc.g gVar) {
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, List<f7.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f40388c = new o();

        public o() {
            super(3);
        }

        @Override // uc.q
        public List<f7.e> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f7.e.f40023d);
            List<f7.e> listL = h9.c.l(jSONObject2, str2, f7.e.f40025f, h7.f40326r0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivT…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static class o0 implements u9.a, u9.b<f7.e> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f40389d = new e(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.m<String> f40390e = e7.f39890r;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<String> f40391f = g7.f40208p;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, y9.k> f40392g = b.f40400c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40393h = d.f40402c;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, y9.q> f40394i = c.f40401c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, o0> f40395j = a.f40399c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<i7> f40396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<String>> f40397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<y9.s> f40398c;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, o0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40399c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public o0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new o0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f40400c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public y9.k b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.k.f40973a);
                uc.p<u9.c, JSONObject, y9.k> pVar = y9.k.f40974b;
                cVar2.a();
                return (y9.k) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f40401c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public y9.q b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.q.f42091g);
                return (y9.q) h9.c.n(jSONObject2, str2, y9.q.f42095k, cVar2.a(), cVar2);
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f40402c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.e(jSONObject2, str2, o0.f40391f, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class e {
            public e() {
            }

            public e(vc.g gVar) {
            }
        }

        public o0(u9.c cVar, o0 o0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<i7> aVar = o0Var == null ? null : o0Var.f40396a;
            Objects.requireNonNull(i7.f40616a);
            this.f40396a = h9.e.f(jSONObject, "div", z10, aVar, i7.f40617b, eVarA, cVar);
            this.f40397b = h9.e.g(jSONObject, "title", z10, o0Var == null ? null : o0Var.f40397b, f40390e, eVarA, cVar, h9.l.f30999c);
            j9.a<y9.s> aVar2 = o0Var == null ? null : o0Var.f40398c;
            Objects.requireNonNull(y9.s.f42386i);
            j9.a<y9.s> aVarO = h9.e.o(jSONObject, "title_click_action", z10, aVar2, y9.s.f42400w, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f40398c = aVarO;
        }

        public /* synthetic */ o0(u9.c cVar, o0 o0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : o0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new f7.e((y9.k) y8.c0.M(this.f40396a, cVar, "div", jSONObject, f40392g), (v9.b) y8.c0.E(this.f40397b, cVar, "title", jSONObject, f40393h), (y9.q) y8.c0.K(this.f40398c, cVar, "title_click_action", jSONObject, f40394i));
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f40403c = new p();

        public p() {
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
            return x1Var == null ? h7.Q : x1Var;
        }
    }

    public static class p0 implements u9.a, u9.b<f7.f> {
        public static final v9.b<q2> A;
        public static final v9.b<Integer> B;
        public static final v9.b<Long> C;
        public static final v9.b<Double> D;
        public static final x1 E;
        public static final h9.k<q2> F;
        public static final h9.k<f7.f.a> G;
        public static final h9.k<p2> H;
        public static final h9.k<n6> I;
        public static final h9.k<q2> J;
        public static final h9.k<q2> K;
        public static final h9.m<Long> L;
        public static final h9.m<Long> M;
        public static final h9.m<Long> N;
        public static final h9.m<Long> O;
        public static final h9.m<Long> P;
        public static final h9.m<Long> Q;
        public static final h9.m<Long> R;
        public static final h9.m<Long> S;
        public static final h9.m<Long> T;
        public static final h9.m<Long> U;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> V;
        public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> W;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> X;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Y;
        public static final uc.q<String, JSONObject, u9.c, v9.b<f7.f.a>> Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40404a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, b1> f40405b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<p2>> f40406c0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40407d0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f40408e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> f40409f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f40410g0;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> f40411h0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f40412i0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40413j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f40414k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40415l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, x1> f40416m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, p0> f40417n0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final z f40418s = new z(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final v9.b<Integer> f40419t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final v9.b<Integer> f40420u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final v9.b<Long> f40421v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final v9.b<f7.f.a> f40422w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final v9.b<p2> f40423x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final v9.b<Long> f40424y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final v9.b<n6> f40425z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f40426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<q2>> f40427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f40428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<v9.b<f7.f.a>> f40430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j9.a<c1> f40432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j9.a<v9.b<p2>> f40433h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40434i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final j9.a<v9.b<n6>> f40435j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final j9.a<v9.b<q2>> f40436k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f40437l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final j9.a<v9.b<q2>> f40438m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f40439n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40440o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final j9.a<v9.b<Double>> f40441p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40442q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final j9.a<y1> f40443r;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40444c = new a();

            public a() {
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
                v9.b<Integer> bVar = p0.f40419t;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f40445c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public v9.b<q2> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(q2.Converter);
                return h9.c.s(jSONObject2, str2, q2.FROM_STRING, cVar2.a(), cVar2, p0.F);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f40446c = new c();

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
                v9.b<Integer> bVar = p0.f40420u;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f40447c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                uc.l<Number, Long> lVar = h9.h.f30982e;
                h9.m<Long> mVar = p0.M;
                u9.e eVarA = cVar2.a();
                v9.b<Long> bVar = p0.f40421v;
                v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
                return bVarR == null ? bVar : bVarR;
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<f7.f.a>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f40448c = new e();

            public e() {
                super(3);
            }

            @Override // uc.q
            public v9.b<f7.f.a> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(f7.f.a.Converter);
                uc.l lVar = f7.f.a.FROM_STRING;
                u9.e eVarA = cVar2.a();
                v9.b<f7.f.a> bVar = p0.f40422w;
                v9.b<f7.f.a> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p0.G);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, b1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f40449c = new f();

            public f() {
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

        public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f40450c = new g();

            public g() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.q(jSONObject2, str2, h9.h.f30982e, p0.O, cVar2.a(), cVar2, h9.l.f30998b);
            }
        }

        public static final class h extends vc.l implements uc.p<u9.c, JSONObject, p0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f40451c = new h();

            public h() {
                super(2);
            }

            @Override // uc.p
            public p0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new p0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<p2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final i f40452c = new i();

            public i() {
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
                v9.b<p2> bVar = p0.f40423x;
                v9.b<p2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p0.H);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final j f40453c = new j();

            public j() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                uc.l<Number, Long> lVar = h9.h.f30982e;
                h9.m<Long> mVar = p0.Q;
                u9.e eVarA = cVar2.a();
                v9.b<Long> bVar = p0.f40424y;
                v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
                return bVarR == null ? bVar : bVarR;
            }
        }

        public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final k f40454c = new k();

            public k() {
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
                v9.b<n6> bVar = p0.f40425z;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p0.I);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final l f40455c = new l();

            public l() {
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
                v9.b<q2> bVar = p0.A;
                v9.b<q2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p0.J);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final m f40456c = new m();

            public m() {
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

        public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final n f40457c = new n();

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
                return h9.c.s(jSONObject2, str2, q2.FROM_STRING, cVar2.a(), cVar2, p0.K);
            }
        }

        public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final o f40458c = new o();

            public o() {
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
                v9.b<Integer> bVar = p0.B;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final p f40459c = new p();

            public p() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                uc.l<Number, Long> lVar = h9.h.f30982e;
                h9.m<Long> mVar = p0.S;
                u9.e eVarA = cVar2.a();
                v9.b<Long> bVar = p0.C;
                v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
                return bVarR == null ? bVar : bVarR;
            }
        }

        public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final q f40460c = new q();

            public q() {
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
                v9.b<Double> bVar = p0.D;
                v9.b<Double> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31000d);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final r f40461c = new r();

            public r() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.q(jSONObject2, str2, h9.h.f30982e, p0.U, cVar2.a(), cVar2, h9.l.f30998b);
            }
        }

        public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final s f40462c = new s();

            public s() {
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
                return x1Var == null ? p0.E : x1Var;
            }
        }

        public static final class t extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final t f40463c = new t();

            public t() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class u extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final u f40464c = new u();

            public u() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof f7.f.a);
            }
        }

        public static final class v extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final v f40465c = new v();

            public v() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof p2);
            }
        }

        public static final class w extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final w f40466c = new w();

            public w() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class x extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final x f40467c = new x();

            public x() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class y extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final y f40468c = new y();

            public y() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class z {
            public z() {
            }

            public z(vc.g gVar) {
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            f40419t = aVar.a(-9120);
            f40420u = aVar.a(-872415232);
            f40421v = aVar.a(300L);
            f40422w = aVar.a(f7.f.a.SLIDE);
            f40423x = aVar.a(p2.TEXT);
            f40424y = aVar.a(12L);
            f40425z = aVar.a(n6.SP);
            A = aVar.a(q2.REGULAR);
            B = aVar.a(Integer.MIN_VALUE);
            C = aVar.a(0L);
            D = aVar.a(Double.valueOf(0.0d));
            E = new x1(aVar.a(6L), aVar.a(8L), aVar.a(8L), aVar.a(6L), null, 16, null);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(q2.values());
            t tVar = t.f40463c;
            fd.j0.i(objQ, "default");
            fd.j0.i(tVar, "validator");
            F = new h9.k.a.C0302a(objQ, tVar);
            Object objQ2 = kc.j.q(f7.f.a.values());
            u uVar = u.f40464c;
            fd.j0.i(objQ2, "default");
            fd.j0.i(uVar, "validator");
            G = new h9.k.a.C0302a(objQ2, uVar);
            Object objQ3 = kc.j.q(p2.values());
            v vVar = v.f40465c;
            fd.j0.i(objQ3, "default");
            fd.j0.i(vVar, "validator");
            H = new h9.k.a.C0302a(objQ3, vVar);
            Object objQ4 = kc.j.q(n6.values());
            w wVar = w.f40466c;
            fd.j0.i(objQ4, "default");
            fd.j0.i(wVar, "validator");
            I = new h9.k.a.C0302a(objQ4, wVar);
            Object objQ5 = kc.j.q(q2.values());
            x xVar = x.f40467c;
            fd.j0.i(objQ5, "default");
            fd.j0.i(xVar, "validator");
            J = new h9.k.a.C0302a(objQ5, xVar);
            Object objQ6 = kc.j.q(q2.values());
            y yVar = y.f40468c;
            fd.j0.i(objQ6, "default");
            fd.j0.i(yVar, "validator");
            K = new h9.k.a.C0302a(objQ6, yVar);
            L = e7.f39891s;
            M = g7.f40209q;
            N = e7.f39892t;
            O = g7.f40210r;
            P = e7.f39893u;
            Q = g7.f40211s;
            R = e7.f39894v;
            S = g7.f40212t;
            T = e7.f39895w;
            U = g7.f40213u;
            V = a.f40444c;
            W = b.f40445c;
            X = c.f40446c;
            Y = d.f40447c;
            Z = e.f40448c;
            f40404a0 = g.f40450c;
            f40405b0 = f.f40449c;
            f40406c0 = i.f40452c;
            f40407d0 = j.f40453c;
            f40408e0 = k.f40454c;
            f40409f0 = l.f40455c;
            f40410g0 = m.f40456c;
            f40411h0 = n.f40457c;
            f40412i0 = o.f40458c;
            f40413j0 = p.f40459c;
            f40414k0 = q.f40460c;
            f40415l0 = r.f40461c;
            f40416m0 = s.f40462c;
            f40417n0 = h.f40451c;
        }

        public p0(u9.c cVar, p0 p0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<Integer>> aVar = p0Var == null ? null : p0Var.f40426a;
            uc.l<Object, Integer> lVar = h9.h.f30978a;
            h9.k<Integer> kVar = h9.l.f31002f;
            j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "active_background_color", z10, aVar, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f40426a = aVarS;
            j9.a<v9.b<q2>> aVar2 = p0Var == null ? null : p0Var.f40427b;
            Objects.requireNonNull(q2.Converter);
            j9.a<v9.b<q2>> aVarS2 = h9.e.s(jSONObject, "active_font_weight", z10, aVar2, q2.FROM_STRING, eVarA, cVar, F);
            fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ACTIVE_FONT_WEIGHT)");
            this.f40427b = aVarS2;
            j9.a<v9.b<Integer>> aVarS3 = h9.e.s(jSONObject, "active_text_color", z10, p0Var == null ? null : p0Var.f40428c, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS3, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f40428c = aVarS3;
            j9.a<v9.b<Long>> aVar3 = p0Var == null ? null : p0Var.f40429d;
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar = L;
            h9.k<Long> kVar2 = h9.l.f30998b;
            j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "animation_duration", z10, aVar3, lVar2, mVar, eVarA, cVar, kVar2);
            fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f40429d = aVarR;
            j9.a<v9.b<f7.f.a>> aVar4 = p0Var == null ? null : p0Var.f40430e;
            Objects.requireNonNull(f7.f.a.Converter);
            j9.a<v9.b<f7.f.a>> aVarS4 = h9.e.s(jSONObject, "animation_type", z10, aVar4, f7.f.a.FROM_STRING, eVarA, cVar, G);
            fd.j0.h(aVarS4, "readOptionalFieldWithExp…PE_HELPER_ANIMATION_TYPE)");
            this.f40430e = aVarS4;
            j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "corner_radius", z10, p0Var == null ? null : p0Var.f40431f, lVar2, N, eVarA, cVar, kVar2);
            fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f40431f = aVarR2;
            j9.a<c1> aVar5 = p0Var == null ? null : p0Var.f40432g;
            Objects.requireNonNull(c1.f39349e);
            j9.a<c1> aVarO = h9.e.o(jSONObject, "corners_radius", z10, aVar5, c1.f39362r, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f40432g = aVarO;
            j9.a<v9.b<p2>> aVar6 = p0Var == null ? null : p0Var.f40433h;
            Objects.requireNonNull(p2.Converter);
            j9.a<v9.b<p2>> aVarS5 = h9.e.s(jSONObject, "font_family", z10, aVar6, p2.FROM_STRING, eVarA, cVar, H);
            fd.j0.h(aVarS5, "readOptionalFieldWithExp… TYPE_HELPER_FONT_FAMILY)");
            this.f40433h = aVarS5;
            j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "font_size", z10, p0Var == null ? null : p0Var.f40434i, lVar2, P, eVarA, cVar, kVar2);
            fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f40434i = aVarR3;
            j9.a<v9.b<n6>> aVar7 = p0Var == null ? null : p0Var.f40435j;
            Objects.requireNonNull(n6.Converter);
            j9.a<v9.b<n6>> aVarS6 = h9.e.s(jSONObject, "font_size_unit", z10, aVar7, n6.FROM_STRING, eVarA, cVar, I);
            fd.j0.h(aVarS6, "readOptionalFieldWithExp…PE_HELPER_FONT_SIZE_UNIT)");
            this.f40435j = aVarS6;
            j9.a<v9.b<q2>> aVarS7 = h9.e.s(jSONObject, "font_weight", z10, p0Var == null ? null : p0Var.f40436k, q2.FROM_STRING, eVarA, cVar, J);
            fd.j0.h(aVarS7, "readOptionalFieldWithExp… TYPE_HELPER_FONT_WEIGHT)");
            this.f40436k = aVarS7;
            j9.a<v9.b<Integer>> aVarS8 = h9.e.s(jSONObject, "inactive_background_color", z10, p0Var == null ? null : p0Var.f40437l, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS8, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f40437l = aVarS8;
            j9.a<v9.b<q2>> aVarS9 = h9.e.s(jSONObject, "inactive_font_weight", z10, p0Var == null ? null : p0Var.f40438m, q2.FROM_STRING, eVarA, cVar, K);
            fd.j0.h(aVarS9, "readOptionalFieldWithExp…PER_INACTIVE_FONT_WEIGHT)");
            this.f40438m = aVarS9;
            j9.a<v9.b<Integer>> aVarS10 = h9.e.s(jSONObject, "inactive_text_color", z10, p0Var == null ? null : p0Var.f40439n, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS10, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f40439n = aVarS10;
            j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "item_spacing", z10, p0Var == null ? null : p0Var.f40440o, lVar2, R, eVarA, cVar, kVar2);
            fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f40440o = aVarR4;
            j9.a<v9.b<Double>> aVarS11 = h9.e.s(jSONObject, "letter_spacing", z10, p0Var == null ? null : p0Var.f40441p, h9.h.f30981d, eVarA, cVar, h9.l.f31000d);
            fd.j0.h(aVarS11, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
            this.f40441p = aVarS11;
            j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "line_height", z10, p0Var == null ? null : p0Var.f40442q, lVar2, T, eVarA, cVar, kVar2);
            fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f40442q = aVarR5;
            j9.a<y1> aVar8 = p0Var == null ? null : p0Var.f40443r;
            Objects.requireNonNull(y1.f44196f);
            j9.a<y1> aVarO2 = h9.e.o(jSONObject, "paddings", z10, aVar8, y1.f44216z, eVarA, cVar);
            fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f40443r = aVarO2;
        }

        public /* synthetic */ p0(u9.c cVar, p0 p0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : p0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            v9.b<Integer> bVar = (v9.b) y8.c0.H(this.f40426a, cVar, "active_background_color", jSONObject, V);
            if (bVar == null) {
                bVar = f40419t;
            }
            v9.b<Integer> bVar2 = bVar;
            v9.b bVar3 = (v9.b) y8.c0.H(this.f40427b, cVar, "active_font_weight", jSONObject, W);
            v9.b<Integer> bVar4 = (v9.b) y8.c0.H(this.f40428c, cVar, "active_text_color", jSONObject, X);
            if (bVar4 == null) {
                bVar4 = f40420u;
            }
            v9.b<Integer> bVar5 = bVar4;
            v9.b<Long> bVar6 = (v9.b) y8.c0.H(this.f40429d, cVar, "animation_duration", jSONObject, Y);
            if (bVar6 == null) {
                bVar6 = f40421v;
            }
            v9.b<Long> bVar7 = bVar6;
            v9.b<f7.f.a> bVar8 = (v9.b) y8.c0.H(this.f40430e, cVar, "animation_type", jSONObject, Z);
            if (bVar8 == null) {
                bVar8 = f40422w;
            }
            v9.b<f7.f.a> bVar9 = bVar8;
            v9.b bVar10 = (v9.b) y8.c0.H(this.f40431f, cVar, "corner_radius", jSONObject, f40404a0);
            b1 b1Var = (b1) y8.c0.K(this.f40432g, cVar, "corners_radius", jSONObject, f40405b0);
            v9.b<p2> bVar11 = (v9.b) y8.c0.H(this.f40433h, cVar, "font_family", jSONObject, f40406c0);
            if (bVar11 == null) {
                bVar11 = f40423x;
            }
            v9.b<p2> bVar12 = bVar11;
            v9.b<Long> bVar13 = (v9.b) y8.c0.H(this.f40434i, cVar, "font_size", jSONObject, f40407d0);
            if (bVar13 == null) {
                bVar13 = f40424y;
            }
            v9.b<Long> bVar14 = bVar13;
            v9.b<n6> bVar15 = (v9.b) y8.c0.H(this.f40435j, cVar, "font_size_unit", jSONObject, f40408e0);
            if (bVar15 == null) {
                bVar15 = f40425z;
            }
            v9.b<n6> bVar16 = bVar15;
            v9.b<q2> bVar17 = (v9.b) y8.c0.H(this.f40436k, cVar, "font_weight", jSONObject, f40409f0);
            if (bVar17 == null) {
                bVar17 = A;
            }
            v9.b<q2> bVar18 = bVar17;
            v9.b bVar19 = (v9.b) y8.c0.H(this.f40437l, cVar, "inactive_background_color", jSONObject, f40410g0);
            v9.b bVar20 = (v9.b) y8.c0.H(this.f40438m, cVar, "inactive_font_weight", jSONObject, f40411h0);
            v9.b<Integer> bVar21 = (v9.b) y8.c0.H(this.f40439n, cVar, "inactive_text_color", jSONObject, f40412i0);
            if (bVar21 == null) {
                bVar21 = B;
            }
            v9.b<Integer> bVar22 = bVar21;
            v9.b<Long> bVar23 = (v9.b) y8.c0.H(this.f40440o, cVar, "item_spacing", jSONObject, f40413j0);
            if (bVar23 == null) {
                bVar23 = C;
            }
            v9.b<Long> bVar24 = bVar23;
            v9.b<Double> bVar25 = (v9.b) y8.c0.H(this.f40441p, cVar, "letter_spacing", jSONObject, f40414k0);
            if (bVar25 == null) {
                bVar25 = D;
            }
            v9.b<Double> bVar26 = bVar25;
            v9.b bVar27 = (v9.b) y8.c0.H(this.f40442q, cVar, "line_height", jSONObject, f40415l0);
            x1 x1Var = (x1) y8.c0.K(this.f40443r, cVar, "paddings", jSONObject, f40416m0);
            if (x1Var == null) {
                x1Var = E;
            }
            return new f7.f(bVar2, bVar3, bVar5, bVar7, bVar9, bVar10, b1Var, bVar12, bVar14, bVar16, bVar18, bVar19, bVar20, bVar22, bVar24, bVar26, bVar27, x1Var);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f40469c = new q();

        public q() {
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
            return x1Var == null ? h7.R : x1Var;
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f40470c = new r();

        public r() {
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
            v9.b<Boolean> bVar = h7.S;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f40471c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, h7.f40329u0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f40472c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, h7.f40330v0, cVar2.a(), cVar2);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f40473c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = h7.f40333y0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = h7.T;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f40474c = new v();

        public v() {
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
            v9.b<Integer> bVar = h7.U;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f40475c = new w();

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
            return x1Var == null ? h7.V : x1Var;
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f40476c = new x();

        public x() {
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
            v9.b<Boolean> bVar = h7.W;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, f7.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f40477c = new y();

        public y() {
            super(3);
        }

        @Override // uc.q
        public f7.f b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f7.f.f40030r);
            f7.f fVar = (f7.f) h9.c.n(jSONObject2, str2, f7.f.P, cVar2.a(), cVar2);
            return fVar == null ? h7.X : fVar;
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f40478c = new z();

        public z() {
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
            return x1Var == null ? h7.Y : x1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new n0(null);
        v9.b bVar = null;
        K = new y9.o(null, null, bVar, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        L = aVar.a(Double.valueOf(1.0d));
        M = new y9.k0(null, null, null, null, null, 31, null);
        Boolean bool = Boolean.FALSE;
        N = aVar.a(bool);
        O = aVar.a(bool);
        P = new l6.e(new q8(bVar, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        v9.b bVar2 = null;
        v9.b bVar3 = null;
        Q = new x1(null, null, null, bVar2, bVar3, 31, null);
        vc.g gVar = null;
        R = new x1(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, gVar);
        S = aVar.a(bool);
        T = aVar.a(0L);
        U = aVar.a(335544320);
        int i10 = 16;
        V = new x1(aVar.a(0L), aVar.a(12L), aVar.a(12L), aVar.a(0L), null == true ? 1 : 0, i10, gVar);
        W = aVar.a(Boolean.TRUE);
        X = new f7.f(null == true ? 1 : 0, bVar2, bVar3, null, null == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        Y = new x1(aVar.a(8L), aVar.a(12L), aVar.a(12L), aVar.a(0L), null == true ? 1 : 0, i10, gVar);
        Z = new z7(null, null == true ? 1 : 0, bVar2, 7, null == true ? 1 : 0);
        f40294a0 = aVar.a(n8.VISIBLE);
        f40296b0 = new l6.d(new i4(null, 1, null));
        int i11 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        g0 g0Var = g0.f40374c;
        fd.j0.i(objQ, "default");
        fd.j0.i(g0Var, "validator");
        f40298c0 = new h9.k.a.C0302a(objQ, g0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        h0 h0Var = h0.f40376c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(h0Var, "validator");
        f40300d0 = new h9.k.a.C0302a(objQ2, h0Var);
        Object objQ3 = kc.j.q(n8.values());
        i0 i0Var = i0.f40378c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(i0Var, "validator");
        f40302e0 = new h9.k.a.C0302a(objQ3, i0Var);
        f40304f0 = e7.f39877e;
        f40306g0 = g7.f40200h;
        f40308h0 = e7.f39886n;
        f40310i0 = g7.f40204l;
        f40312j0 = e7.f39887o;
        f40314k0 = g7.f40205m;
        f40316l0 = e7.f39888p;
        f40318m0 = g7.f40206n;
        f40320n0 = e7.f39889q;
        f40322o0 = g7.f40207o;
        f40324p0 = y6.D;
        f40325q0 = e7.f39878f;
        f40326r0 = g7.f40196d;
        f40327s0 = e7.f39879g;
        f40328t0 = g7.f40197e;
        f40329u0 = e7.f39880h;
        f40330v0 = g7.f40198f;
        f40331w0 = e7.f39881i;
        f40332x0 = g7.f40199g;
        f40333y0 = e7.f39882j;
        f40334z0 = e7.f39883k;
        A0 = g7.f40201i;
        B0 = e7.f39884l;
        C0 = g7.f40202j;
        D0 = e7.f39885m;
        E0 = g7.f40203k;
        F0 = a.f40361c;
        G0 = b.f40363c;
        H0 = c.f40365c;
        I0 = d.f40367c;
        J0 = e.f40369c;
        K0 = f.f40371c;
        L0 = g.f40373c;
        M0 = h.f40375c;
        N0 = i.f40377c;
        O0 = j.f40379c;
        P0 = k.f40381c;
        Q0 = l.f40383c;
        R0 = m.f40385c;
        S0 = n.f40387c;
        T0 = o.f40388c;
        U0 = p.f40403c;
        V0 = q.f40469c;
        W0 = r.f40470c;
        X0 = s.f40471c;
        Y0 = t.f40472c;
        Z0 = u.f40473c;
        f40295a1 = v.f40474c;
        f40297b1 = w.f40475c;
        f40299c1 = x.f40476c;
        f40301d1 = y.f40477c;
        f40303e1 = z.f40478c;
        f40305f1 = a0.f40362c;
        f40307g1 = b0.f40364c;
        f40309h1 = c0.f40366c;
        f40311i1 = d0.f40368c;
        f40313j1 = e0.f40370c;
        f40315k1 = f0.f40372c;
        f40317l1 = l0.f40384c;
        f40319m1 = k0.f40382c;
        f40321n1 = j0.f40380c;
        f40323o1 = m0.f40386c;
    }

    public h7(u9.c cVar, h7 h7Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = h7Var == null ? null : h7Var.f40335a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40335a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = h7Var == null ? null : h7Var.f40336b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, f40298c0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f40336b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = h7Var == null ? null : h7Var.f40337c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, f40300d0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f40337c = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, h7Var == null ? null : h7Var.f40338d, h9.h.f30981d, f40304f0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f40338d = aVarR;
        j9.a<List<y9.f0>> aVar4 = h7Var == null ? null : h7Var.f40339e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar4, y9.f0.f39919b, f40310i0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40339e = aVarU;
        j9.a<y9.l0> aVar5 = h7Var == null ? null : h7Var.f40340f;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar5, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40340f = aVarO2;
        j9.a<v9.b<Long>> aVar6 = h7Var == null ? null : h7Var.f40341g;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f40312j0;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar6, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40341g = aVarR2;
        j9.a<List<s1>> aVar7 = h7Var == null ? null : h7Var.f40342h;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar7, s1.C, f40318m0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40342h = aVarU2;
        j9.a<v9.b<Boolean>> aVar8 = h7Var == null ? null : h7Var.f40343i;
        uc.l<Object, Boolean> lVar2 = h9.h.f30980c;
        h9.k<Boolean> kVar2 = h9.l.f30997a;
        j9.a<v9.b<Boolean>> aVarS3 = h9.e.s(jSONObject, "dynamic_height", z10, aVar8, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40343i = aVarS3;
        j9.a<List<a2>> aVar9 = h7Var == null ? null : h7Var.f40344j;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar9, a2.f39002h, f40322o0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40344j = aVarU3;
        j9.a<o2> aVar10 = h7Var == null ? null : h7Var.f40345k;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar10, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40345k = aVarO3;
        j9.a<v9.b<Boolean>> aVarS4 = h9.e.s(jSONObject, "has_separator", z10, h7Var == null ? null : h7Var.f40346l, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40346l = aVarS4;
        j9.a<m6> aVar11 = h7Var == null ? null : h7Var.f40347m;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar11, pVar, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40347m = aVarO4;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, h7Var == null ? null : h7Var.f40348n, f40324p0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f40348n = aVarL;
        j9.a<List<o0>> aVar12 = h7Var == null ? null : h7Var.f40349o;
        Objects.requireNonNull(o0.f40389d);
        this.f40349o = h9.e.k(jSONObject, "items", z10, aVar12, o0.f40395j, f40327s0, eVarA, cVar);
        j9.a<y1> aVar13 = h7Var == null ? null : h7Var.f40350p;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar2 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar13, pVar2, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40350p = aVarO5;
        j9.a<y1> aVar14 = h7Var == null ? null : h7Var.f40351q;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "paddings", z10, aVar14, pVar2, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40351q = aVarO6;
        j9.a<v9.b<Boolean>> aVarS5 = h9.e.s(jSONObject, "restrict_parent_scroll", z10, h7Var == null ? null : h7Var.f40352r, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40352r = aVarS5;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, h7Var == null ? null : h7Var.f40353s, lVar, f40328t0, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40353s = aVarR3;
        j9.a<List<y9.s>> aVar15 = h7Var == null ? null : h7Var.f40354t;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar15, y9.s.f42400w, f40331w0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40354t = aVarU4;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "selected_tab", z10, h7Var == null ? null : h7Var.f40355u, lVar, f40332x0, eVarA, cVar, kVar);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40355u = aVarR4;
        j9.a<v9.b<Integer>> aVarS6 = h9.e.s(jSONObject, "separator_color", z10, h7Var == null ? null : h7Var.f40356v, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f40356v = aVarS6;
        j9.a<y1> aVar16 = h7Var == null ? null : h7Var.f40357w;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO7 = h9.e.o(jSONObject, "separator_paddings", z10, aVar16, pVar2, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40357w = aVarO7;
        j9.a<v9.b<Boolean>> aVarS7 = h9.e.s(jSONObject, "switch_tabs_by_content_swipe_enabled", z10, h7Var == null ? null : h7Var.f40358x, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40358x = aVarS7;
        j9.a<p0> aVar17 = h7Var == null ? null : h7Var.f40359y;
        Objects.requireNonNull(p0.f40418s);
        j9.a<p0> aVarO8 = h9.e.o(jSONObject, "tab_title_style", z10, aVar17, p0.f40417n0, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40359y = aVarO8;
        j9.a<y1> aVar18 = h7Var == null ? null : h7Var.f40360z;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "title_paddings", z10, aVar18, pVar2, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40360z = aVarO9;
        j9.a<List<y7>> aVar19 = h7Var == null ? null : h7Var.A;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar19, y7.f44555v, A0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.A = aVarU5;
        j9.a<a8> aVar20 = h7Var == null ? null : h7Var.B;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO10 = h9.e.o(jSONObject, "transform", z10, aVar20, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO10;
        j9.a<s0> aVar21 = h7Var == null ? null : h7Var.C;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO11 = h9.e.o(jSONObject, "transition_change", z10, aVar21, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.C = aVarO11;
        j9.a<y9.b0> aVar22 = h7Var == null ? null : h7Var.D;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar3 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO12 = h9.e.o(jSONObject, "transition_in", z10, aVar22, pVar3, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO12;
        j9.a<y9.b0> aVar23 = h7Var == null ? null : h7Var.E;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO13 = h9.e.o(jSONObject, "transition_out", z10, aVar23, pVar3, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO13;
        j9.a<List<c8>> aVar24 = h7Var == null ? null : h7Var.F;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar24, c8.FROM_STRING, C0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.F = aVarT;
        j9.a<v9.b<n8>> aVar25 = h7Var == null ? null : h7Var.G;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS8 = h9.e.s(jSONObject, "visibility", z10, aVar25, n8.FROM_STRING, eVarA, cVar, f40302e0);
        fd.j0.h(aVarS8, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.G = aVarS8;
        j9.a<p8> aVar26 = h7Var == null ? null : h7Var.H;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar4 = p8.C;
        j9.a<p8> aVarO14 = h9.e.o(jSONObject, "visibility_action", z10, aVar26, pVar4, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.H = aVarO14;
        j9.a<List<p8>> aVar27 = h7Var == null ? null : h7Var.I;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, aVar27, pVar4, E0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.I = aVarU6;
        j9.a<m6> aVar28 = h7Var == null ? null : h7Var.J;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO15 = h9.e.o(jSONObject, "width", z10, aVar28, pVar, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.J = aVarO15;
    }

    public /* synthetic */ h7(u9.c cVar, h7 h7Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : h7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f7 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f40335a, cVar, "accessibility", jSONObject, F0);
        if (oVar == null) {
            oVar = K;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f40336b, cVar, "alignment_horizontal", jSONObject, G0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f40337c, cVar, "alignment_vertical", jSONObject, H0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f40338d, cVar, "alpha", jSONObject, I0);
        if (bVar3 == null) {
            bVar3 = L;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f40339e, cVar, "background", jSONObject, f40308h0, J0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f40340f, cVar, "border", jSONObject, K0);
        if (k0Var == null) {
            k0Var = M;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f40341g, cVar, "column_span", jSONObject, L0);
        List listL2 = y8.c0.L(this.f40342h, cVar, "disappear_actions", jSONObject, f40316l0, M0);
        v9.b<Boolean> bVar6 = (v9.b) y8.c0.H(this.f40343i, cVar, "dynamic_height", jSONObject, N0);
        if (bVar6 == null) {
            bVar6 = N;
        }
        v9.b<Boolean> bVar7 = bVar6;
        List listL3 = y8.c0.L(this.f40344j, cVar, "extensions", jSONObject, f40320n0, O0);
        n2 n2Var = (n2) y8.c0.K(this.f40345k, cVar, "focus", jSONObject, P0);
        v9.b<Boolean> bVar8 = (v9.b) y8.c0.H(this.f40346l, cVar, "has_separator", jSONObject, Q0);
        if (bVar8 == null) {
            bVar8 = O;
        }
        v9.b<Boolean> bVar9 = bVar8;
        l6 l6Var = (l6) y8.c0.K(this.f40347m, cVar, "height", jSONObject, R0);
        if (l6Var == null) {
            l6Var = P;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f40348n, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, S0);
        List listN = y8.c0.N(this.f40349o, cVar, "items", jSONObject, f40326r0, T0);
        x1 x1Var = (x1) y8.c0.K(this.f40350p, cVar, "margins", jSONObject, U0);
        if (x1Var == null) {
            x1Var = Q;
        }
        x1 x1Var2 = x1Var;
        x1 x1Var3 = (x1) y8.c0.K(this.f40351q, cVar, "paddings", jSONObject, V0);
        if (x1Var3 == null) {
            x1Var3 = R;
        }
        x1 x1Var4 = x1Var3;
        v9.b<Boolean> bVar10 = (v9.b) y8.c0.H(this.f40352r, cVar, "restrict_parent_scroll", jSONObject, W0);
        if (bVar10 == null) {
            bVar10 = S;
        }
        v9.b<Boolean> bVar11 = bVar10;
        v9.b bVar12 = (v9.b) y8.c0.H(this.f40353s, cVar, "row_span", jSONObject, X0);
        List listL4 = y8.c0.L(this.f40354t, cVar, "selected_actions", jSONObject, f40330v0, Y0);
        v9.b<Long> bVar13 = (v9.b) y8.c0.H(this.f40355u, cVar, "selected_tab", jSONObject, Z0);
        if (bVar13 == null) {
            bVar13 = T;
        }
        v9.b<Long> bVar14 = bVar13;
        v9.b<Integer> bVar15 = (v9.b) y8.c0.H(this.f40356v, cVar, "separator_color", jSONObject, f40295a1);
        if (bVar15 == null) {
            bVar15 = U;
        }
        v9.b<Integer> bVar16 = bVar15;
        x1 x1Var5 = (x1) y8.c0.K(this.f40357w, cVar, "separator_paddings", jSONObject, f40297b1);
        if (x1Var5 == null) {
            x1Var5 = V;
        }
        x1 x1Var6 = x1Var5;
        v9.b<Boolean> bVar17 = (v9.b) y8.c0.H(this.f40358x, cVar, "switch_tabs_by_content_swipe_enabled", jSONObject, f40299c1);
        if (bVar17 == null) {
            bVar17 = W;
        }
        v9.b<Boolean> bVar18 = bVar17;
        f7.f fVar = (f7.f) y8.c0.K(this.f40359y, cVar, "tab_title_style", jSONObject, f40301d1);
        if (fVar == null) {
            fVar = X;
        }
        f7.f fVar2 = fVar;
        x1 x1Var7 = (x1) y8.c0.K(this.f40360z, cVar, "title_paddings", jSONObject, f40303e1);
        if (x1Var7 == null) {
            x1Var7 = Y;
        }
        x1 x1Var8 = x1Var7;
        List listL5 = y8.c0.L(this.A, cVar, "tooltips", jSONObject, f40334z0, f40305f1);
        z7 z7Var = (z7) y8.c0.K(this.B, cVar, "transform", jSONObject, f40307g1);
        if (z7Var == null) {
            z7Var = Z;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.C, cVar, "transition_change", jSONObject, f40309h1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.D, cVar, "transition_in", jSONObject, f40311i1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.E, cVar, "transition_out", jSONObject, f40313j1);
        List listJ = y8.c0.J(this.F, cVar, "transition_triggers", jSONObject, B0, f40315k1);
        v9.b<n8> bVar19 = (v9.b) y8.c0.H(this.G, cVar, "visibility", jSONObject, f40317l1);
        if (bVar19 == null) {
            bVar19 = f40294a0;
        }
        v9.b<n8> bVar20 = bVar19;
        o8 o8Var = (o8) y8.c0.K(this.H, cVar, "visibility_action", jSONObject, f40319m1);
        List listL6 = y8.c0.L(this.I, cVar, "visibility_actions", jSONObject, D0, f40321n1);
        l6 l6Var3 = (l6) y8.c0.K(this.J, cVar, "width", jSONObject, f40323o1);
        if (l6Var3 == null) {
            l6Var3 = f40296b0;
        }
        return new f7(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, listL2, bVar7, listL3, n2Var, bVar9, l6Var2, str, listN, x1Var2, x1Var4, bVar11, bVar12, listL4, bVar14, bVar16, x1Var6, bVar18, fVar2, x1Var8, listL5, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar20, o8Var, listL6, l6Var3);
    }
}
