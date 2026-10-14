package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b6 implements u9.a, u9.b<z5> {
    public static final h9.g<s0> A0;
    public static final h9.m<Long> B0;
    public static final h9.m<Long> C0;
    public static final h9.g<y9.q> D0;
    public static final h9.g<y9.s> E0;
    public static final h9.g<x7> F0;
    public static final h9.g<y7> G0;
    public static final h9.g<c8> H0;
    public static final h9.g<c8> I0;
    public static final h9.m<String> J0;
    public static final h9.m<String> K0;
    public static final y9.o L;
    public static final h9.g<o8> L0;
    public static final v9.b<Double> M;
    public static final h9.g<p8> M0;
    public static final y9.k0 N;
    public static final uc.q<String, JSONObject, u9.c, y9.o> N0;
    public static final v9.b<p2> O;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> O0;
    public static final v9.b<Long> P;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> P0;
    public static final v9.b<n6> Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> Q0;
    public static final v9.b<q2> R;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> R0;
    public static final l6.e S;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> S0;
    public static final v9.b<Integer> T;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> T0;
    public static final v9.b<Double> U;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> U0;
    public static final x1 V;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> V0;
    public static final x1 W;
    public static final uc.q<String, JSONObject, u9.c, n2> W0;
    public static final v9.b<Integer> X;
    public static final uc.q<String, JSONObject, u9.c, v9.b<p2>> X0;
    public static final z7 Y;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Y0;
    public static final v9.b<n8> Z;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final l6.d f39197a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> f39198a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.k<y9.t> f39199b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f39200b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<y9.u> f39201c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f39202c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<p2> f39203d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39204d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<n6> f39205e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39206e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<q2> f39207f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f39208f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<n8> f39209g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39210g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Double> f39211h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f39212h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Double> f39213i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<z5.h>> f39214i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<y9.e0> f39215j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f39216j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<y9.f0> f39217k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39218k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<Long> f39219l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f39220l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f39221m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f39222m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<q1> f39223n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f39224n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<s1> f39225o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f39226o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<z1> f39227p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.r0> f39228p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<a2> f39229q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f39230q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.m<Long> f39231r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f39232r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<Long> f39233s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f39234s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<String> f39235t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39236t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<String> f39237u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f39238u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.m<String> f39239v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f39240v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<String> f39241w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f39242w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<Long> f39243x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f39244x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.m<Long> f39245y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<z5.h> f39246z0;
    public final j9.a<List<y7>> A;
    public final j9.a<a8> B;
    public final j9.a<y9.s0> C;
    public final j9.a<y9.b0> D;
    public final j9.a<y9.b0> E;
    public final j9.a<List<c8>> F;
    public final j9.a<String> G;
    public final j9.a<v9.b<n8>> H;
    public final j9.a<p8> I;
    public final j9.a<List<p8>> J;
    public final j9.a<m6> K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f39247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f39248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f39249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f39251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<y9.l0> f39252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<s1>> f39254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<a2>> f39255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<o2> f39256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<p2>> f39257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f39259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<v9.b<q2>> f39260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<m6> f39261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f39262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<String>> f39263q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<String> f39264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39266t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<y1> f39267u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<List<s0>> f39268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<y1> f39269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39270x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39271y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f39272z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39273c = new a();

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
            return oVar == null ? b6.L : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f39274c = new a0();

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
            return h9.c.w(jSONObject2, str2, x7.f44173m, b6.F0, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39275c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, b6.f39199b0);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f39276c = new b0();

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
            return z7Var == null ? b6.Y : z7Var;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39277c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, b6.f39201c0);
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f39278c = new c0();

        public c0() {
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

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39279c = new d();

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
            h9.m<Double> mVar = b6.f39213i0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = b6.M;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f39280c = new d0();

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
        public static final e f39281c = new e();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, b6.f39215j0, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f39282c = new e0();

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
        public static final f f39283c = new f();

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
            return k0Var == null ? b6.N : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f39284c = new f0();

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
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, b6.H0, cVar2.a(), cVar2);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f39285c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, b6.f39221m0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f39286c = new g0();

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
        public static final h f39287c = new h();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, b6.f39223n0, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f39288c = new h0();

        public h0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f39289c = new i();

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
            return h9.c.w(jSONObject2, str2, z1.f44584e, b6.f39227p0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f39290c = new i0();

        public i0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof p2);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f39291c = new j();

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

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f39292c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<p2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f39293c = new k();

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
            v9.b<p2> bVar = b6.O;
            v9.b<p2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, b6.f39203d0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class k0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f39294c = new k0();

        public k0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof q2);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f39295c = new l();

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
            h9.m<Long> mVar = b6.f39233s0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = b6.P;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class l0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f39296c = new l0();

        public l0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f39297c = new m();

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
            v9.b<n6> bVar = b6.Q;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, b6.f39205e0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f39298c = new m0();

        public m0() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = b6.K0;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f39299c = new n();

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
            v9.b<q2> bVar = b6.R;
            v9.b<q2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, b6.f39207f0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f39300c = new n0();

        public n0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, b6.L0, cVar2.a(), cVar2);
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f39301c = new o();

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
            return l6Var == null ? b6.S : l6Var;
        }
    }

    public static final class o0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f39302c = new o0();

        public o0() {
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

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f39303c = new p();

        public p() {
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
            v9.b<Integer> bVar = b6.T;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class p0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f39304c = new p0();

        public p0() {
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
            v9.b<n8> bVar = b6.Z;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, b6.f39209g0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f39305c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, b6.f39237u0, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class q0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f39306c = new q0();

        public q0() {
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
            return l6Var == null ? b6.f39197a0 : l6Var;
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f39307c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, b6.f39241w0, cVar2.a());
        }
    }

    public static final class r0 {
        public r0() {
        }

        public r0(vc.g gVar) {
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f39308c = new s();

        public s() {
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
            v9.b<Double> bVar = b6.U;
            v9.b<Double> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31000d);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static class s0 implements u9.a, u9.b<z5.h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39309c = new d(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39310d = b.f39316c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39311e = c.f39317c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, s0> f39312f = a.f39315c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<String>> f39313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<String>> f39314b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, s0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f39315c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public s0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new s0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f39316c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                return h9.c.p(jSONObject2, str2, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env"), cVar2, h9.l.f30999c);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f39317c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                return h9.c.f(jSONObject2, str2, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env"), cVar2, h9.l.f30999c);
            }
        }

        public static final class d {
            public d() {
            }

            public d(vc.g gVar) {
            }
        }

        public s0(u9.c cVar, s0 s0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<String>> aVar = s0Var == null ? null : s0Var.f39313a;
            h9.k<String> kVar = h9.l.f30999c;
            j9.a<v9.b<String>> aVarQ = h9.e.q(jSONObject, "text", z10, aVar, eVarA, cVar, kVar);
            fd.j0.h(aVarQ, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f39313a = aVarQ;
            this.f39314b = h9.e.h(jSONObject, "value", z10, s0Var == null ? null : s0Var.f39314b, eVarA, cVar, kVar);
        }

        public /* synthetic */ s0(u9.c cVar, s0 s0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : s0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new z5.h((v9.b) y8.c0.H(this.f39313a, cVar, "text", jSONObject, f39310d), (v9.b) y8.c0.E(this.f39314b, cVar, "value", jSONObject, f39311e));
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f39318c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, b6.f39245y0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f39319c = new u();

        public u() {
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
            return x1Var == null ? b6.V : x1Var;
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, List<z5.h>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f39320c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public List<z5.h> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z5.h.f44676c);
            List<z5.h> listL = h9.c.l(jSONObject2, str2, z5.h.f44677d, b6.f39246z0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivS…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f39321c = new w();

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
            return x1Var == null ? b6.W : x1Var;
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f39322c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, b6.C0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f39323c = new y();

        public y() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, b6.D0, cVar2.a(), cVar2);
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f39324c = new z();

        public z() {
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
            v9.b<Integer> bVar = b6.X;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    static {
        new r0(null);
        L = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        M = aVar.a(Double.valueOf(1.0d));
        N = new y9.k0(null, null, null, null, null, 31, null);
        O = aVar.a(p2.TEXT);
        P = aVar.a(12L);
        Q = aVar.a(n6.SP);
        R = aVar.a(q2.REGULAR);
        S = new l6.e(new q8(null, null, null, 7, null));
        T = aVar.a(1929379840);
        U = aVar.a(Double.valueOf(0.0d));
        V = new x1(null, null, null, null, null, 31, null);
        W = new x1(null, null, null, null, null, 31, null);
        X = aVar.a(-16777216);
        Y = new z7(null, null, null, 7, null);
        Z = aVar.a(n8.VISIBLE);
        f39197a0 = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        g0 g0Var = g0.f39286c;
        fd.j0.i(objQ, "default");
        fd.j0.i(g0Var, "validator");
        f39199b0 = new h9.k.a.C0302a(objQ, g0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        h0 h0Var = h0.f39288c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(h0Var, "validator");
        f39201c0 = new h9.k.a.C0302a(objQ2, h0Var);
        Object objQ3 = kc.j.q(p2.values());
        i0 i0Var = i0.f39290c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(i0Var, "validator");
        f39203d0 = new h9.k.a.C0302a(objQ3, i0Var);
        Object objQ4 = kc.j.q(n6.values());
        j0 j0Var = j0.f39292c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(j0Var, "validator");
        f39205e0 = new h9.k.a.C0302a(objQ4, j0Var);
        Object objQ5 = kc.j.q(q2.values());
        k0 k0Var = k0.f39294c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(k0Var, "validator");
        f39207f0 = new h9.k.a.C0302a(objQ5, k0Var);
        Object objQ6 = kc.j.q(n8.values());
        l0 l0Var = l0.f39296c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(l0Var, "validator");
        f39209g0 = new h9.k.a.C0302a(objQ6, l0Var);
        f39211h0 = w5.f43774p;
        f39213i0 = y5.f44501l;
        f39215j0 = w5.A;
        f39217k0 = y5.f44508s;
        f39219l0 = w5.C;
        f39221m0 = y5.f44509t;
        f39223n0 = w5.D;
        f39225o0 = y5.f44510u;
        f39227p0 = a6.f39067d;
        f39229q0 = y5.f44511v;
        f39231r0 = y5.f44496g;
        f39233s0 = w5.f43775q;
        f39235t0 = y5.f44497h;
        f39237u0 = w5.f43776r;
        f39239v0 = y5.f44498i;
        f39241w0 = w5.f43777s;
        f39243x0 = y5.f44499j;
        f39245y0 = w5.f43778t;
        f39246z0 = y5.f44500k;
        A0 = w5.f43779u;
        B0 = w5.f43780v;
        C0 = y5.f44502m;
        D0 = w5.f43781w;
        E0 = y5.f44503n;
        F0 = w5.f43782x;
        G0 = y5.f44504o;
        H0 = w5.f43783y;
        I0 = y5.f44505p;
        J0 = w5.f43784z;
        K0 = y5.f44506q;
        L0 = y5.f44507r;
        M0 = w5.B;
        N0 = a.f39273c;
        O0 = b.f39275c;
        P0 = c.f39277c;
        Q0 = d.f39279c;
        R0 = e.f39281c;
        S0 = f.f39283c;
        T0 = g.f39285c;
        U0 = h.f39287c;
        V0 = i.f39289c;
        W0 = j.f39291c;
        X0 = k.f39293c;
        Y0 = l.f39295c;
        Z0 = m.f39297c;
        f39198a1 = n.f39299c;
        f39200b1 = o.f39301c;
        f39202c1 = p.f39303c;
        f39204d1 = q.f39305c;
        f39206e1 = r.f39307c;
        f39208f1 = s.f39308c;
        f39210g1 = t.f39318c;
        f39212h1 = u.f39319c;
        f39214i1 = v.f39320c;
        f39216j1 = w.f39321c;
        f39218k1 = x.f39322c;
        f39220l1 = y.f39323c;
        f39222m1 = z.f39324c;
        f39224n1 = a0.f39274c;
        f39226o1 = b0.f39276c;
        f39228p1 = c0.f39278c;
        f39230q1 = d0.f39280c;
        f39232r1 = e0.f39282c;
        f39234s1 = f0.f39284c;
        f39236t1 = m0.f39298c;
        f39238u1 = p0.f39304c;
        f39240v1 = o0.f39302c;
        f39242w1 = n0.f39300c;
        f39244x1 = q0.f39306c;
    }

    public b6(u9.c cVar, b6 b6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = b6Var == null ? null : b6Var.f39247a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39247a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = b6Var == null ? null : b6Var.f39248b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, f39199b0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f39248b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = b6Var == null ? null : b6Var.f39249c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, f39201c0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f39249c = aVarS2;
        j9.a<v9.b<Double>> aVar4 = b6Var == null ? null : b6Var.f39250d;
        uc.l<Number, Double> lVar = h9.h.f30981d;
        h9.m<Double> mVar = f39211h0;
        h9.k<Double> kVar = h9.l.f31000d;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, aVar4, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f39250d = aVarR;
        j9.a<List<y9.f0>> aVar5 = b6Var == null ? null : b6Var.f39251e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar5, y9.f0.f39919b, f39217k0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39251e = aVarU;
        j9.a<y9.l0> aVar6 = b6Var == null ? null : b6Var.f39252f;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar6, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39252f = aVarO2;
        j9.a<v9.b<Long>> aVar7 = b6Var == null ? null : b6Var.f39253g;
        uc.l<Number, Long> lVar2 = h9.h.f30982e;
        h9.m<Long> mVar2 = f39219l0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar7, lVar2, mVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39253g = aVarR2;
        j9.a<List<s1>> aVar8 = b6Var == null ? null : b6Var.f39254h;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar8, s1.C, f39225o0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39254h = aVarU2;
        j9.a<List<a2>> aVar9 = b6Var == null ? null : b6Var.f39255i;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar9, a2.f39002h, f39229q0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39255i = aVarU3;
        j9.a<o2> aVar10 = b6Var == null ? null : b6Var.f39256j;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar10, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39256j = aVarO3;
        j9.a<v9.b<p2>> aVar11 = b6Var == null ? null : b6Var.f39257k;
        Objects.requireNonNull(p2.Converter);
        j9.a<v9.b<p2>> aVarS3 = h9.e.s(jSONObject, "font_family", z10, aVar11, p2.FROM_STRING, eVarA, cVar, f39203d0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp… TYPE_HELPER_FONT_FAMILY)");
        this.f39257k = aVarS3;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "font_size", z10, b6Var == null ? null : b6Var.f39258l, lVar2, f39231r0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39258l = aVarR3;
        j9.a<v9.b<n6>> aVar12 = b6Var == null ? null : b6Var.f39259m;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS4 = h9.e.s(jSONObject, "font_size_unit", z10, aVar12, n6.FROM_STRING, eVarA, cVar, f39205e0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…PE_HELPER_FONT_SIZE_UNIT)");
        this.f39259m = aVarS4;
        j9.a<v9.b<q2>> aVar13 = b6Var == null ? null : b6Var.f39260n;
        Objects.requireNonNull(q2.Converter);
        j9.a<v9.b<q2>> aVarS5 = h9.e.s(jSONObject, "font_weight", z10, aVar13, q2.FROM_STRING, eVarA, cVar, f39207f0);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp… TYPE_HELPER_FONT_WEIGHT)");
        this.f39260n = aVarS5;
        j9.a<m6> aVar14 = b6Var == null ? null : b6Var.f39261o;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar14, pVar, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39261o = aVarO4;
        j9.a<v9.b<Integer>> aVar15 = b6Var == null ? null : b6Var.f39262p;
        uc.l<Object, Integer> lVar3 = h9.h.f30978a;
        h9.k<Integer> kVar3 = h9.l.f31002f;
        j9.a<v9.b<Integer>> aVarS6 = h9.e.s(jSONObject, "hint_color", z10, aVar15, lVar3, eVarA, cVar, kVar3);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f39262p = aVarS6;
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "hint_text", z10, b6Var == null ? null : b6Var.f39263q, f39235t0, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f39263q = aVarP;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, b6Var == null ? null : b6Var.f39264r, f39239v0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f39264r = aVarL;
        j9.a<v9.b<Double>> aVarS7 = h9.e.s(jSONObject, "letter_spacing", z10, b6Var == null ? null : b6Var.f39265s, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f39265s = aVarS7;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "line_height", z10, b6Var == null ? null : b6Var.f39266t, lVar2, f39243x0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39266t = aVarR4;
        j9.a<y1> aVar16 = b6Var == null ? null : b6Var.f39267u;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar2 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar16, pVar2, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39267u = aVarO5;
        j9.a<List<s0>> aVar17 = b6Var == null ? null : b6Var.f39268v;
        Objects.requireNonNull(s0.f39309c);
        this.f39268v = h9.e.k(jSONObject, "options", z10, aVar17, s0.f39312f, A0, eVarA, cVar);
        j9.a<y1> aVar18 = b6Var == null ? null : b6Var.f39269w;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "paddings", z10, aVar18, pVar2, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39269w = aVarO6;
        j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "row_span", z10, b6Var == null ? null : b6Var.f39270x, lVar2, B0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39270x = aVarR5;
        j9.a<List<y9.s>> aVar19 = b6Var == null ? null : b6Var.f39271y;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar19, y9.s.f42400w, E0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39271y = aVarU4;
        j9.a<v9.b<Integer>> aVarS8 = h9.e.s(jSONObject, "text_color", z10, b6Var == null ? null : b6Var.f39272z, lVar3, eVarA, cVar, kVar3);
        fd.j0.h(aVarS8, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f39272z = aVarS8;
        j9.a<List<y7>> aVar20 = b6Var == null ? null : b6Var.A;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar20, y7.f44555v, G0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.A = aVarU5;
        j9.a<a8> aVar21 = b6Var == null ? null : b6Var.B;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO7 = h9.e.o(jSONObject, "transform", z10, aVar21, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO7;
        j9.a<y9.s0> aVar22 = b6Var == null ? null : b6Var.C;
        Objects.requireNonNull(y9.s0.f42435a);
        j9.a<y9.s0> aVarO8 = h9.e.o(jSONObject, "transition_change", z10, aVar22, y9.s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.C = aVarO8;
        j9.a<y9.b0> aVar23 = b6Var == null ? null : b6Var.D;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar3 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO9 = h9.e.o(jSONObject, "transition_in", z10, aVar23, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO9;
        j9.a<y9.b0> aVar24 = b6Var == null ? null : b6Var.E;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO10 = h9.e.o(jSONObject, "transition_out", z10, aVar24, pVar3, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO10;
        j9.a<List<c8>> aVar25 = b6Var == null ? null : b6Var.F;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar25, c8.FROM_STRING, I0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.F = aVarT;
        this.G = h9.e.b(jSONObject, "value_variable", z10, b6Var == null ? null : b6Var.G, J0, eVarA, cVar);
        j9.a<v9.b<n8>> aVar26 = b6Var == null ? null : b6Var.H;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS9 = h9.e.s(jSONObject, "visibility", z10, aVar26, n8.FROM_STRING, eVarA, cVar, f39209g0);
        fd.j0.h(aVarS9, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.H = aVarS9;
        j9.a<p8> aVar27 = b6Var == null ? null : b6Var.I;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar4 = p8.C;
        j9.a<p8> aVarO11 = h9.e.o(jSONObject, "visibility_action", z10, aVar27, pVar4, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.I = aVarO11;
        j9.a<List<p8>> aVar28 = b6Var == null ? null : b6Var.J;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, aVar28, pVar4, M0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.J = aVarU6;
        j9.a<m6> aVar29 = b6Var == null ? null : b6Var.K;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO12 = h9.e.o(jSONObject, "width", z10, aVar29, pVar, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.K = aVarO12;
    }

    public /* synthetic */ b6(u9.c cVar, b6 b6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : b6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f39247a, cVar, "accessibility", jSONObject, N0);
        if (oVar == null) {
            oVar = L;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f39248b, cVar, "alignment_horizontal", jSONObject, O0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f39249c, cVar, "alignment_vertical", jSONObject, P0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f39250d, cVar, "alpha", jSONObject, Q0);
        if (bVar3 == null) {
            bVar3 = M;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f39251e, cVar, "background", jSONObject, f39215j0, R0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f39252f, cVar, "border", jSONObject, S0);
        if (k0Var == null) {
            k0Var = N;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f39253g, cVar, "column_span", jSONObject, T0);
        List listL2 = y8.c0.L(this.f39254h, cVar, "disappear_actions", jSONObject, f39223n0, U0);
        List listL3 = y8.c0.L(this.f39255i, cVar, "extensions", jSONObject, f39227p0, V0);
        n2 n2Var = (n2) y8.c0.K(this.f39256j, cVar, "focus", jSONObject, W0);
        v9.b<p2> bVar6 = (v9.b) y8.c0.H(this.f39257k, cVar, "font_family", jSONObject, X0);
        if (bVar6 == null) {
            bVar6 = O;
        }
        v9.b<p2> bVar7 = bVar6;
        v9.b<Long> bVar8 = (v9.b) y8.c0.H(this.f39258l, cVar, "font_size", jSONObject, Y0);
        if (bVar8 == null) {
            bVar8 = P;
        }
        v9.b<Long> bVar9 = bVar8;
        v9.b<n6> bVar10 = (v9.b) y8.c0.H(this.f39259m, cVar, "font_size_unit", jSONObject, Z0);
        if (bVar10 == null) {
            bVar10 = Q;
        }
        v9.b<n6> bVar11 = bVar10;
        v9.b<q2> bVar12 = (v9.b) y8.c0.H(this.f39260n, cVar, "font_weight", jSONObject, f39198a1);
        if (bVar12 == null) {
            bVar12 = R;
        }
        v9.b<q2> bVar13 = bVar12;
        l6 l6Var = (l6) y8.c0.K(this.f39261o, cVar, "height", jSONObject, f39200b1);
        if (l6Var == null) {
            l6Var = S;
        }
        l6 l6Var2 = l6Var;
        v9.b<Integer> bVar14 = (v9.b) y8.c0.H(this.f39262p, cVar, "hint_color", jSONObject, f39202c1);
        if (bVar14 == null) {
            bVar14 = T;
        }
        v9.b<Integer> bVar15 = bVar14;
        v9.b bVar16 = (v9.b) y8.c0.H(this.f39263q, cVar, "hint_text", jSONObject, f39204d1);
        String str = (String) y8.c0.H(this.f39264r, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f39206e1);
        v9.b<Double> bVar17 = (v9.b) y8.c0.H(this.f39265s, cVar, "letter_spacing", jSONObject, f39208f1);
        if (bVar17 == null) {
            bVar17 = U;
        }
        v9.b<Double> bVar18 = bVar17;
        v9.b bVar19 = (v9.b) y8.c0.H(this.f39266t, cVar, "line_height", jSONObject, f39210g1);
        x1 x1Var = (x1) y8.c0.K(this.f39267u, cVar, "margins", jSONObject, f39212h1);
        if (x1Var == null) {
            x1Var = V;
        }
        x1 x1Var2 = x1Var;
        List listN = y8.c0.N(this.f39268v, cVar, "options", jSONObject, f39246z0, f39214i1);
        x1 x1Var3 = (x1) y8.c0.K(this.f39269w, cVar, "paddings", jSONObject, f39216j1);
        if (x1Var3 == null) {
            x1Var3 = W;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar20 = (v9.b) y8.c0.H(this.f39270x, cVar, "row_span", jSONObject, f39218k1);
        List listL4 = y8.c0.L(this.f39271y, cVar, "selected_actions", jSONObject, D0, f39220l1);
        v9.b<Integer> bVar21 = (v9.b) y8.c0.H(this.f39272z, cVar, "text_color", jSONObject, f39222m1);
        if (bVar21 == null) {
            bVar21 = X;
        }
        v9.b<Integer> bVar22 = bVar21;
        List listL5 = y8.c0.L(this.A, cVar, "tooltips", jSONObject, F0, f39224n1);
        z7 z7Var = (z7) y8.c0.K(this.B, cVar, "transform", jSONObject, f39226o1);
        if (z7Var == null) {
            z7Var = Y;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.C, cVar, "transition_change", jSONObject, f39228p1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.D, cVar, "transition_in", jSONObject, f39230q1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.E, cVar, "transition_out", jSONObject, f39232r1);
        List listJ = y8.c0.J(this.F, cVar, "transition_triggers", jSONObject, H0, f39234s1);
        String str2 = (String) y8.c0.E(this.G, cVar, "value_variable", jSONObject, f39236t1);
        v9.b<n8> bVar23 = (v9.b) y8.c0.H(this.H, cVar, "visibility", jSONObject, f39238u1);
        if (bVar23 == null) {
            bVar23 = Z;
        }
        v9.b<n8> bVar24 = bVar23;
        o8 o8Var = (o8) y8.c0.K(this.I, cVar, "visibility_action", jSONObject, f39240v1);
        List listL6 = y8.c0.L(this.J, cVar, "visibility_actions", jSONObject, L0, f39242w1);
        l6 l6Var3 = (l6) y8.c0.K(this.K, cVar, "width", jSONObject, f39244x1);
        if (l6Var3 == null) {
            l6Var3 = f39197a0;
        }
        return new z5(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, listL2, listL3, n2Var, bVar7, bVar9, bVar11, bVar13, l6Var2, bVar15, bVar16, str, bVar18, bVar19, x1Var2, listN, x1Var4, bVar20, listL4, bVar22, listL5, z7Var2, r0Var, a0Var, a0Var2, listJ, str2, bVar24, o8Var, listL6, l6Var3);
    }
}
