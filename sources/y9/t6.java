package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t6 implements u9.a, u9.b<s6> {
    public static final h9.g<o8> A0;
    public static final h9.g<p8> B0;
    public static final uc.q<String, JSONObject, u9.c, y9.o> C0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> D0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> E0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> F0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> G0;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> H0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> I0;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> J0;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> K0;
    public static final uc.q<String, JSONObject, u9.c, n2> L0;
    public static final uc.q<String, JSONObject, u9.c, l6> M0;
    public static final y9.o N;
    public static final uc.q<String, JSONObject, u9.c, String> N0;
    public static final v9.b<Double> O;
    public static final uc.q<String, JSONObject, u9.c, x1> O0;
    public static final y9.k0 P;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> P0;
    public static final l6.e Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Q0;
    public static final x1 R;
    public static final uc.q<String, JSONObject, u9.c, x1> R0;
    public static final v9.b<Long> S;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> S0;
    public static final v9.b<Long> T;
    public static final uc.q<String, JSONObject, u9.c, y9.o> T0;
    public static final x1 U;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> U0;
    public static final y9.o V;
    public static final uc.q<String, JSONObject, u9.c, v1> V0;
    public static final z7 W;
    public static final uc.q<String, JSONObject, u9.c, s6.e> W0;
    public static final v9.b<n8> X;
    public static final uc.q<String, JSONObject, u9.c, String> X0;
    public static final l6.d Y;
    public static final uc.q<String, JSONObject, u9.c, v1> Y0;
    public static final h9.k<y9.t> Z;
    public static final uc.q<String, JSONObject, u9.c, s6.e> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<y9.u> f42763a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f42764a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.k<n8> f42765b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v1> f42766b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<Double> f42767c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v1> f42768c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.m<Double> f42769d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f42770d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.g<y9.e0> f42771e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v1> f42772e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<y9.f0> f42773f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v1> f42774f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.m<Long> f42775g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f42776g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Long> f42777h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.r0> f42778h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<q1> f42779i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f42780i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<s1> f42781j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f42782j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<z1> f42783k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f42784k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<a2> f42785l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f42786l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<String> f42787m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f42788m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<String> f42789n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f42790n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f42791o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f42792o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<Long> f42793p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<y9.q> f42794q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<y9.s> f42795r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<String> f42796s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<String> f42797t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<String> f42798u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.m<String> f42799v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<x7> f42800w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.g<y7> f42801x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<c8> f42802y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<c8> f42803z0;
    public final j9.a<w1> A;
    public final j9.a<List<y7>> B;
    public final j9.a<w1> C;
    public final j9.a<w1> D;
    public final j9.a<a8> E;
    public final j9.a<s0> F;
    public final j9.a<y9.b0> G;
    public final j9.a<y9.b0> H;
    public final j9.a<List<c8>> I;
    public final j9.a<v9.b<n8>> J;
    public final j9.a<p8> K;
    public final j9.a<List<p8>> L;
    public final j9.a<m6> M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f42804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f42805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f42806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f42807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f42808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<y9.l0> f42809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<s1>> f42811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<a2>> f42812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<o2> f42813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<m6> f42814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<String> f42815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<y1> f42816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<y1> f42819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<y9.p> f42821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<List<y9.s>> f42822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<w1> f42823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<r0> f42824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<String> f42825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<w1> f42826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<r0> f42827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<String> f42828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<w1> f42829z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42830c = new a();

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
            return oVar == null ? t6.N : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f42831c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public v1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v1.f43423a);
            return (v1) h9.c.n(jSONObject2, str2, v1.f43424b, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42832c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, t6.Z);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f42833c = new b0();

        public b0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, t6.f42800w0, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42834c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, t6.f42763a0);
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f42835c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public v1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v1.f43423a);
            uc.p<u9.c, JSONObject, v1> pVar = v1.f43424b;
            cVar2.a();
            return (v1) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42836c = new d();

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
            h9.m<Double> mVar = t6.f42769d0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = t6.O;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f42837c = new d0();

        public d0() {
            super(3);
        }

        @Override // uc.q
        public v1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v1.f43423a);
            uc.p<u9.c, JSONObject, v1> pVar = v1.f43424b;
            cVar2.a();
            return (v1) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f42838c = new e();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, t6.f42771e0, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f42839c = new e0();

        public e0() {
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
            return z7Var == null ? t6.W : z7Var;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f42840c = new f();

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
            return k0Var == null ? t6.P : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f42841c = new f0();

        public f0() {
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

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f42842c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, t6.f42777h0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f42843c = new g0();

        public g0() {
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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f42844c = new h();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, t6.f42779i0, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f42845c = new h0();

        public h0() {
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

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f42846c = new i();

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
            return h9.c.w(jSONObject2, str2, z1.f44584e, t6.f42783k0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f42847c = new i0();

        public i0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, t6.f42802y0, cVar2.a(), cVar2);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f42848c = new j();

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
        public static final j0 f42849c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f42850c = new k();

        public k() {
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
            return l6Var == null ? t6.Q : l6Var;
        }
    }

    public static final class k0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f42851c = new k0();

        public k0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f42852c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, t6.f42789n0, cVar2.a());
        }
    }

    public static final class l0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f42853c = new l0();

        public l0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f42854c = new m();

        public m() {
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
            return x1Var == null ? t6.R : x1Var;
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f42855c = new m0();

        public m0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, t6.A0, cVar2.a(), cVar2);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f42856c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = t6.S;
            v9.b<Long> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30998b);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f42857c = new n0();

        public n0() {
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

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f42858c = new o();

        public o() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = t6.T;
            v9.b<Long> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30998b);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class o0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f42859c = new o0();

        public o0() {
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
            v9.b<n8> bVar = t6.X;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, t6.f42765b0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f42860c = new p();

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
            return x1Var == null ? t6.U : x1Var;
        }
    }

    public static final class p0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f42861c = new p0();

        public p0() {
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
            return l6Var == null ? t6.Y : l6Var;
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f42862c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, t6.f42793p0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class q0 {
        public q0() {
        }

        public q0(vc.g gVar) {
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f42863c = new r();

        public r() {
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
            return oVar == null ? t6.V : oVar;
        }
    }

    public static class r0 implements u9.a, u9.b<s6.e> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i f42864f = new i(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final v9.b<n6> f42865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final v9.b<q2> f42866h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v9.b<Integer> f42867i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h9.k<n6> f42868j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.k<q2> f42869k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h9.m<Long> f42870l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final h9.m<Long> f42871m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42872n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f42873o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> f42874p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, f5> f42875q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f42876r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, r0> f42877s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f42878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<n6>> f42879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<q2>> f42880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<g5> f42881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f42882e;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, r0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42883c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public r0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new r0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f42884c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, r0.f42871m, cVar2.a(), h9.l.f30998b);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f42885c = new c();

            public c() {
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
                v9.b<n6> bVar = r0.f42865g;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, r0.f42868j);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f42886c = new d();

            public d() {
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
                v9.b<q2> bVar = r0.f42866h;
                v9.b<q2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, r0.f42869k);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, f5> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f42887c = new e();

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
                return (f5) h9.c.n(jSONObject2, str2, f5.f39959d, cVar2.a(), cVar2);
            }
        }

        public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f42888c = new f();

            public f() {
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
                v9.b<Integer> bVar = r0.f42867i;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class g extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f42889c = new g();

            public g() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class h extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f42890c = new h();

            public h() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class i {
            public i() {
            }

            public i(vc.g gVar) {
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            f42865g = aVar.a(n6.SP);
            f42866h = aVar.a(q2.REGULAR);
            f42867i = aVar.a(-16777216);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(n6.values());
            g gVar = g.f42889c;
            fd.j0.i(objQ, "default");
            fd.j0.i(gVar, "validator");
            f42868j = new h9.k.a.C0302a(objQ, gVar);
            Object objQ2 = kc.j.q(q2.values());
            h hVar = h.f42890c;
            fd.j0.i(objQ2, "default");
            fd.j0.i(hVar, "validator");
            f42869k = new h9.k.a.C0302a(objQ2, hVar);
            f42870l = r6.f42344t;
            f42871m = p6.f42050z;
            f42872n = b.f42884c;
            f42873o = c.f42885c;
            f42874p = d.f42886c;
            f42875q = e.f42887c;
            f42876r = f.f42888c;
            f42877s = a.f42883c;
        }

        public r0(u9.c cVar, r0 r0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            this.f42878a = h9.e.i(jSONObject, "font_size", z10, r0Var == null ? null : r0Var.f42878a, h9.h.f30982e, f42870l, eVarA, cVar, h9.l.f30998b);
            j9.a<v9.b<n6>> aVar = r0Var == null ? null : r0Var.f42879b;
            Objects.requireNonNull(n6.Converter);
            j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "font_size_unit", z10, aVar, n6.FROM_STRING, eVarA, cVar, f42868j);
            fd.j0.h(aVarS, "readOptionalFieldWithExp…PE_HELPER_FONT_SIZE_UNIT)");
            this.f42879b = aVarS;
            j9.a<v9.b<q2>> aVar2 = r0Var == null ? null : r0Var.f42880c;
            Objects.requireNonNull(q2.Converter);
            j9.a<v9.b<q2>> aVarS2 = h9.e.s(jSONObject, "font_weight", z10, aVar2, q2.FROM_STRING, eVarA, cVar, f42869k);
            fd.j0.h(aVarS2, "readOptionalFieldWithExp… TYPE_HELPER_FONT_WEIGHT)");
            this.f42880c = aVarS2;
            j9.a<g5> aVar3 = r0Var == null ? null : r0Var.f42881d;
            Objects.requireNonNull(g5.f40165c);
            j9.a<g5> aVarO = h9.e.o(jSONObject, "offset", z10, aVar3, g5.f40168f, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f42881d = aVarO;
            j9.a<v9.b<Integer>> aVarS3 = h9.e.s(jSONObject, "text_color", z10, r0Var == null ? null : r0Var.f42882e, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            fd.j0.h(aVarS3, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f42882e = aVarS3;
        }

        public /* synthetic */ r0(u9.c cVar, r0 r0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : r0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            v9.b bVar = (v9.b) y8.c0.E(this.f42878a, cVar, "font_size", jSONObject, f42872n);
            v9.b<n6> bVar2 = (v9.b) y8.c0.H(this.f42879b, cVar, "font_size_unit", jSONObject, f42873o);
            if (bVar2 == null) {
                bVar2 = f42865g;
            }
            v9.b<n6> bVar3 = bVar2;
            v9.b<q2> bVar4 = (v9.b) y8.c0.H(this.f42880c, cVar, "font_weight", jSONObject, f42874p);
            if (bVar4 == null) {
                bVar4 = f42866h;
            }
            v9.b<q2> bVar5 = bVar4;
            f5 f5Var = (f5) y8.c0.K(this.f42881d, cVar, "offset", jSONObject, f42875q);
            v9.b<Integer> bVar6 = (v9.b) y8.c0.H(this.f42882e, cVar, "text_color", jSONObject, f42876r);
            if (bVar6 == null) {
                bVar6 = f42867i;
            }
            return new s6.e(bVar, bVar3, bVar5, f5Var, bVar6);
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f42891c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, t6.f42794q0, cVar2.a(), cVar2);
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f42892c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public v1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v1.f43423a);
            return (v1) h9.c.n(jSONObject2, str2, v1.f43424b, cVar2.a(), cVar2);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, s6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f42893c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public s6.e b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(s6.e.f42629f);
            return (s6.e) h9.c.n(jSONObject2, str2, s6.e.f42636m, cVar2.a(), cVar2);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f42894c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, t6.f42797t0, cVar2.a());
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f42895c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public v1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v1.f43423a);
            uc.p<u9.c, JSONObject, v1> pVar = v1.f43424b;
            cVar2.a();
            return (v1) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, s6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f42896c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public s6.e b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(s6.e.f42629f);
            return (s6.e) h9.c.n(jSONObject2, str2, s6.e.f42636m, cVar2.a(), cVar2);
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f42897c = new y();

        public y() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, t6.f42799v0, cVar2.a());
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f42898c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public v1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(v1.f43423a);
            return (v1) h9.c.n(jSONObject2, str2, v1.f43424b, cVar2.a(), cVar2);
        }
    }

    static {
        new q0(null);
        N = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        O = aVar.a(Double.valueOf(1.0d));
        P = new y9.k0(null, null, null, null, null, 31, null);
        Q = new l6.e(new q8(null, null, null, 7, null));
        R = new x1(null, null, null, null, null, 31, null);
        S = aVar.a(100L);
        T = aVar.a(0L);
        U = new x1(null, null, null, null, null, 31, null);
        V = new y9.o(null, null, null, null, null, null, 63, null);
        W = new z7(null, null, null, 7, null);
        X = aVar.a(n8.VISIBLE);
        Y = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        j0 j0Var = j0.f42849c;
        fd.j0.i(objQ, "default");
        fd.j0.i(j0Var, "validator");
        Z = new h9.k.a.C0302a(objQ, j0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        k0 k0Var = k0.f42851c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(k0Var, "validator");
        f42763a0 = new h9.k.a.C0302a(objQ2, k0Var);
        Object objQ3 = kc.j.q(n8.values());
        l0 l0Var = l0.f42853c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(l0Var, "validator");
        f42765b0 = new h9.k.a.C0302a(objQ3, l0Var);
        f42767c0 = r6.f42331g;
        f42769d0 = p6.f42042r;
        f42771e0 = r6.f42340p;
        f42773f0 = p6.f42046v;
        f42775g0 = r6.f42341q;
        f42777h0 = p6.f42047w;
        f42779i0 = r6.f42342r;
        f42781j0 = p6.f42048x;
        f42783k0 = r6.f42343s;
        f42785l0 = p6.f42049y;
        f42787m0 = p6.f42037m;
        f42789n0 = r6.f42332h;
        f42791o0 = p6.f42038n;
        f42793p0 = r6.f42333i;
        f42794q0 = p6.f42039o;
        f42795r0 = r6.f42334j;
        f42796s0 = p6.f42040p;
        f42797t0 = r6.f42335k;
        f42798u0 = p6.f42041q;
        f42799v0 = r6.f42336l;
        f42800w0 = r6.f42337m;
        f42801x0 = p6.f42043s;
        f42802y0 = r6.f42338n;
        f42803z0 = p6.f42044t;
        A0 = r6.f42339o;
        B0 = p6.f42045u;
        C0 = a.f42830c;
        D0 = b.f42832c;
        E0 = c.f42834c;
        F0 = d.f42836c;
        G0 = e.f42838c;
        H0 = f.f42840c;
        I0 = g.f42842c;
        J0 = h.f42844c;
        K0 = i.f42846c;
        L0 = j.f42848c;
        M0 = k.f42850c;
        N0 = l.f42852c;
        O0 = m.f42854c;
        P0 = n.f42856c;
        Q0 = o.f42858c;
        R0 = p.f42860c;
        S0 = q.f42862c;
        T0 = r.f42863c;
        U0 = s.f42891c;
        V0 = t.f42892c;
        W0 = u.f42893c;
        X0 = v.f42894c;
        Y0 = w.f42895c;
        Z0 = x.f42896c;
        f42764a1 = y.f42897c;
        f42766b1 = z.f42898c;
        f42768c1 = a0.f42831c;
        f42770d1 = b0.f42833c;
        f42772e1 = c0.f42835c;
        f42774f1 = d0.f42837c;
        f42776g1 = e0.f42839c;
        f42778h1 = f0.f42841c;
        f42780i1 = g0.f42843c;
        f42782j1 = h0.f42845c;
        f42784k1 = i0.f42847c;
        f42786l1 = o0.f42859c;
        f42788m1 = n0.f42857c;
        f42790n1 = m0.f42855c;
        f42792o1 = p0.f42861c;
    }

    public t6(u9.c cVar, t6 t6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = t6Var == null ? null : t6Var.f42804a;
        Objects.requireNonNull(y9.p.f41863g);
        uc.p<u9.c, JSONObject, y9.p> pVar = y9.p.f41879w;
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, pVar, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42804a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = t6Var == null ? null : t6Var.f42805b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, Z);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f42805b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = t6Var == null ? null : t6Var.f42806c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, f42763a0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f42806c = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, t6Var == null ? null : t6Var.f42807d, h9.h.f30981d, f42767c0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f42807d = aVarR;
        j9.a<List<y9.f0>> aVar4 = t6Var == null ? null : t6Var.f42808e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar4, y9.f0.f39919b, f42773f0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42808e = aVarU;
        j9.a<y9.l0> aVar5 = t6Var == null ? null : t6Var.f42809f;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar5, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42809f = aVarO2;
        j9.a<v9.b<Long>> aVar6 = t6Var == null ? null : t6Var.f42810g;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f42775g0;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar6, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42810g = aVarR2;
        j9.a<List<s1>> aVar7 = t6Var == null ? null : t6Var.f42811h;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar7, s1.C, f42781j0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42811h = aVarU2;
        j9.a<List<a2>> aVar8 = t6Var == null ? null : t6Var.f42812i;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar8, a2.f39002h, f42785l0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42812i = aVarU3;
        j9.a<o2> aVar9 = t6Var == null ? null : t6Var.f42813j;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar9, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42813j = aVarO3;
        j9.a<m6> aVar10 = t6Var == null ? null : t6Var.f42814k;
        Objects.requireNonNull(m6.f41448a);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar10, pVar2, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42814k = aVarO4;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, t6Var == null ? null : t6Var.f42815l, f42787m0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f42815l = aVarL;
        j9.a<y1> aVar11 = t6Var == null ? null : t6Var.f42816m;
        Objects.requireNonNull(y1.f44196f);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar11, pVar3, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42816m = aVarO5;
        j9.a<v9.b<Long>> aVarS3 = h9.e.s(jSONObject, "max_value", z10, t6Var == null ? null : t6Var.f42817n, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42817n = aVarS3;
        j9.a<v9.b<Long>> aVarS4 = h9.e.s(jSONObject, "min_value", z10, t6Var == null ? null : t6Var.f42818o, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42818o = aVarS4;
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "paddings", z10, t6Var == null ? null : t6Var.f42819p, pVar3, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42819p = aVarO6;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, t6Var == null ? null : t6Var.f42820q, lVar, f42791o0, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42820q = aVarR3;
        j9.a<y9.p> aVarO7 = h9.e.o(jSONObject, "secondary_value_accessibility", z10, t6Var == null ? null : t6Var.f42821r, pVar, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42821r = aVarO7;
        j9.a<List<y9.s>> aVar12 = t6Var == null ? null : t6Var.f42822s;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar12, y9.s.f42400w, f42795r0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42822s = aVarU4;
        j9.a<w1> aVar13 = t6Var == null ? null : t6Var.f42823t;
        Objects.requireNonNull(w1.f43665a);
        uc.p<u9.c, JSONObject, w1> pVar4 = w1.f43666b;
        j9.a<w1> aVarO8 = h9.e.o(jSONObject, "thumb_secondary_style", z10, aVar13, pVar4, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42823t = aVarO8;
        j9.a<r0> aVar14 = t6Var == null ? null : t6Var.f42824u;
        Objects.requireNonNull(r0.f42864f);
        uc.p<u9.c, JSONObject, r0> pVar5 = r0.f42877s;
        j9.a<r0> aVarO9 = h9.e.o(jSONObject, "thumb_secondary_text_style", z10, aVar14, pVar5, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42824u = aVarO9;
        j9.a<String> aVarL2 = h9.e.l(jSONObject, "thumb_secondary_value_variable", z10, t6Var == null ? null : t6Var.f42825v, f42796s0, eVarA, cVar);
        fd.j0.h(aVarL2, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f42825v = aVarL2;
        this.f42826w = h9.e.f(jSONObject, "thumb_style", z10, t6Var == null ? null : t6Var.f42826w, pVar4, eVarA, cVar);
        j9.a<r0> aVarO10 = h9.e.o(jSONObject, "thumb_text_style", z10, t6Var == null ? null : t6Var.f42827x, pVar5, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42827x = aVarO10;
        j9.a<String> aVarL3 = h9.e.l(jSONObject, "thumb_value_variable", z10, t6Var == null ? null : t6Var.f42828y, f42798u0, eVarA, cVar);
        fd.j0.h(aVarL3, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f42828y = aVarL3;
        j9.a<w1> aVarO11 = h9.e.o(jSONObject, "tick_mark_active_style", z10, t6Var == null ? null : t6Var.f42829z, pVar4, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42829z = aVarO11;
        j9.a<w1> aVarO12 = h9.e.o(jSONObject, "tick_mark_inactive_style", z10, t6Var == null ? null : t6Var.A, pVar4, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO12;
        j9.a<List<y7>> aVar15 = t6Var == null ? null : t6Var.B;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar15, y7.f44555v, f42801x0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.B = aVarU5;
        this.C = h9.e.f(jSONObject, "track_active_style", z10, t6Var == null ? null : t6Var.C, pVar4, eVarA, cVar);
        this.D = h9.e.f(jSONObject, "track_inactive_style", z10, t6Var == null ? null : t6Var.D, pVar4, eVarA, cVar);
        j9.a<a8> aVar16 = t6Var == null ? null : t6Var.E;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO13 = h9.e.o(jSONObject, "transform", z10, aVar16, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO13;
        j9.a<s0> aVar17 = t6Var == null ? null : t6Var.F;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO14 = h9.e.o(jSONObject, "transition_change", z10, aVar17, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO14;
        j9.a<y9.b0> aVar18 = t6Var == null ? null : t6Var.G;
        Objects.requireNonNull(y9.b0.f39111a);
        uc.p<u9.c, JSONObject, y9.b0> pVar6 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO15 = h9.e.o(jSONObject, "transition_in", z10, aVar18, pVar6, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.G = aVarO15;
        j9.a<y9.b0> aVarO16 = h9.e.o(jSONObject, "transition_out", z10, t6Var == null ? null : t6Var.H, pVar6, eVarA, cVar);
        fd.j0.h(aVarO16, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.H = aVarO16;
        j9.a<List<c8>> aVar19 = t6Var == null ? null : t6Var.I;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar19, c8.FROM_STRING, f42803z0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.I = aVarT;
        j9.a<v9.b<n8>> aVar20 = t6Var == null ? null : t6Var.J;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS5 = h9.e.s(jSONObject, "visibility", z10, aVar20, n8.FROM_STRING, eVarA, cVar, f42765b0);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.J = aVarS5;
        j9.a<p8> aVar21 = t6Var == null ? null : t6Var.K;
        Objects.requireNonNull(p8.f42056i);
        uc.p<u9.c, JSONObject, p8> pVar7 = p8.C;
        j9.a<p8> aVarO17 = h9.e.o(jSONObject, "visibility_action", z10, aVar21, pVar7, eVarA, cVar);
        fd.j0.h(aVarO17, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.K = aVarO17;
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, t6Var == null ? null : t6Var.L, pVar7, B0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.L = aVarU6;
        j9.a<m6> aVarO18 = h9.e.o(jSONObject, "width", z10, t6Var == null ? null : t6Var.M, pVar2, eVarA, cVar);
        fd.j0.h(aVarO18, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.M = aVarO18;
    }

    public /* synthetic */ t6(u9.c cVar, t6 t6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : t6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f42804a, cVar, "accessibility", jSONObject, C0);
        if (oVar == null) {
            oVar = N;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f42805b, cVar, "alignment_horizontal", jSONObject, D0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f42806c, cVar, "alignment_vertical", jSONObject, E0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f42807d, cVar, "alpha", jSONObject, F0);
        if (bVar3 == null) {
            bVar3 = O;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f42808e, cVar, "background", jSONObject, f42771e0, G0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f42809f, cVar, "border", jSONObject, H0);
        if (k0Var == null) {
            k0Var = P;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f42810g, cVar, "column_span", jSONObject, I0);
        List listL2 = y8.c0.L(this.f42811h, cVar, "disappear_actions", jSONObject, f42779i0, J0);
        List listL3 = y8.c0.L(this.f42812i, cVar, "extensions", jSONObject, f42783k0, K0);
        n2 n2Var = (n2) y8.c0.K(this.f42813j, cVar, "focus", jSONObject, L0);
        l6 l6Var = (l6) y8.c0.K(this.f42814k, cVar, "height", jSONObject, M0);
        if (l6Var == null) {
            l6Var = Q;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f42815l, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, N0);
        x1 x1Var = (x1) y8.c0.K(this.f42816m, cVar, "margins", jSONObject, O0);
        if (x1Var == null) {
            x1Var = R;
        }
        x1 x1Var2 = x1Var;
        v9.b<Long> bVar6 = (v9.b) y8.c0.H(this.f42817n, cVar, "max_value", jSONObject, P0);
        if (bVar6 == null) {
            bVar6 = S;
        }
        v9.b<Long> bVar7 = bVar6;
        v9.b<Long> bVar8 = (v9.b) y8.c0.H(this.f42818o, cVar, "min_value", jSONObject, Q0);
        if (bVar8 == null) {
            bVar8 = T;
        }
        v9.b<Long> bVar9 = bVar8;
        x1 x1Var3 = (x1) y8.c0.K(this.f42819p, cVar, "paddings", jSONObject, R0);
        if (x1Var3 == null) {
            x1Var3 = U;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar10 = (v9.b) y8.c0.H(this.f42820q, cVar, "row_span", jSONObject, S0);
        y9.o oVar3 = (y9.o) y8.c0.K(this.f42821r, cVar, "secondary_value_accessibility", jSONObject, T0);
        if (oVar3 == null) {
            oVar3 = V;
        }
        y9.o oVar4 = oVar3;
        List listL4 = y8.c0.L(this.f42822s, cVar, "selected_actions", jSONObject, f42794q0, U0);
        v1 v1Var = (v1) y8.c0.K(this.f42823t, cVar, "thumb_secondary_style", jSONObject, V0);
        s6.e eVar = (s6.e) y8.c0.K(this.f42824u, cVar, "thumb_secondary_text_style", jSONObject, W0);
        String str2 = (String) y8.c0.H(this.f42825v, cVar, "thumb_secondary_value_variable", jSONObject, X0);
        v1 v1Var2 = (v1) y8.c0.M(this.f42826w, cVar, "thumb_style", jSONObject, Y0);
        s6.e eVar2 = (s6.e) y8.c0.K(this.f42827x, cVar, "thumb_text_style", jSONObject, Z0);
        String str3 = (String) y8.c0.H(this.f42828y, cVar, "thumb_value_variable", jSONObject, f42764a1);
        v1 v1Var3 = (v1) y8.c0.K(this.f42829z, cVar, "tick_mark_active_style", jSONObject, f42766b1);
        v1 v1Var4 = (v1) y8.c0.K(this.A, cVar, "tick_mark_inactive_style", jSONObject, f42768c1);
        List listL5 = y8.c0.L(this.B, cVar, "tooltips", jSONObject, f42800w0, f42770d1);
        v1 v1Var5 = (v1) y8.c0.M(this.C, cVar, "track_active_style", jSONObject, f42772e1);
        v1 v1Var6 = (v1) y8.c0.M(this.D, cVar, "track_inactive_style", jSONObject, f42774f1);
        z7 z7Var = (z7) y8.c0.K(this.E, cVar, "transform", jSONObject, f42776g1);
        if (z7Var == null) {
            z7Var = W;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.F, cVar, "transition_change", jSONObject, f42778h1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.G, cVar, "transition_in", jSONObject, f42780i1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.H, cVar, "transition_out", jSONObject, f42782j1);
        List listJ = y8.c0.J(this.I, cVar, "transition_triggers", jSONObject, f42802y0, f42784k1);
        v9.b<n8> bVar11 = (v9.b) y8.c0.H(this.J, cVar, "visibility", jSONObject, f42786l1);
        if (bVar11 == null) {
            bVar11 = X;
        }
        v9.b<n8> bVar12 = bVar11;
        o8 o8Var = (o8) y8.c0.K(this.K, cVar, "visibility_action", jSONObject, f42788m1);
        List listL6 = y8.c0.L(this.L, cVar, "visibility_actions", jSONObject, A0, f42790n1);
        l6 l6Var3 = (l6) y8.c0.K(this.M, cVar, "width", jSONObject, f42792o1);
        if (l6Var3 == null) {
            l6Var3 = Y;
        }
        return new s6(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, listL2, listL3, n2Var, l6Var2, str, x1Var2, bVar7, bVar9, x1Var4, bVar10, oVar4, listL4, v1Var, eVar, str2, v1Var2, eVar2, str3, v1Var3, v1Var4, listL5, v1Var5, v1Var6, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar12, o8Var, listL6, l6Var3);
    }
}
