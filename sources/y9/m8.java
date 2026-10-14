package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m8 implements u9.a, u9.b<h8> {
    public static final h9.g<y9.s> A0;
    public static final h9.m<Long> B0;
    public static final h9.m<Long> C0;
    public static final h9.g<y9.q> D0;
    public static final h9.g<y9.s> E0;
    public static final h9.g<x7> F0;
    public static final h9.g<y7> G0;
    public static final h9.g<c8> H0;
    public static final h9.g<c8> I0;
    public static final h9.g<i8> J0;
    public static final h9.g<j8> K0;
    public static final h9.g<o8> L0;
    public static final y9.o M;
    public static final h9.g<p8> M0;
    public static final v9.b<Double> N;
    public static final uc.q<String, JSONObject, u9.c, y9.o> N0;
    public static final v9.b<Boolean> O;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> O0;
    public static final y9.k0 P;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> P0;
    public static final l6.e Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> Q0;
    public static final x1 R;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> R0;
    public static final v9.b<Boolean> S;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> S0;
    public static final x1 T;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> T0;
    public static final v9.b<Boolean> U;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> U0;
    public static final z7 V;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> V0;
    public static final v9.b<n8> W;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> W0;
    public static final l6.d X;
    public static final uc.q<String, JSONObject, u9.c, String> X0;
    public static final h9.k<y9.t> Y;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> Y0;
    public static final h9.k<y9.u> Z;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<n8> f41459a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f41460a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.m<Double> f41461b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, n2> f41462b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<Double> f41463c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f41464c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<y9.e0> f41465d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f41466d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.g<y9.f0> f41467e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f41468e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<y9.q> f41469f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f41470f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<y9.s> f41471g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f41472g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Long> f41473h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f41474h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Long> f41475i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, JSONObject> f41476i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<q1> f41477j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41478j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<s1> f41479k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f41480k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<String> f41481l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f41482l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<String> f41483m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41484m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<y9.q> f41485n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f41486n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<y9.s> f41487o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f41488o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<z1> f41489p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f41490p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<a2> f41491q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, r0> f41492q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<y9.q> f41493r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f41494r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<y9.s> f41495s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f41496s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<String> f41497t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f41498t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<String> f41499u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<i8>> f41500u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<y9.q> f41501v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f41502v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<y9.s> f41503w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f41504w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<String> f41505x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f41506x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.m<String> f41507y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f41508y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<y9.q> f41509z0;
    public final j9.a<List<y9.s>> A;
    public final j9.a<List<y7>> B;
    public final j9.a<a8> C;
    public final j9.a<s0> D;
    public final j9.a<y9.b0> E;
    public final j9.a<y9.b0> F;
    public final j9.a<List<c8>> G;
    public final j9.a<List<j8>> H;
    public final j9.a<v9.b<n8>> I;
    public final j9.a<p8> J;
    public final j9.a<List<p8>> K;
    public final j9.a<m6> L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f41510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f41511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f41512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f41513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f41514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f41515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<y9.l0> f41516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<y9.s>> f41517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<List<s1>> f41519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<String> f41520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<List<y9.s>> f41521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<List<a2>> f41522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<List<y9.s>> f41523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<o2> f41524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<m6> f41525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<String> f41526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<y1> f41527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f41528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<y1> f41529t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<List<y9.s>> f41530u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<JSONObject> f41531v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<v9.b<String>> f41532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f41533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<List<y9.s>> f41534y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41535z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41536c = new a();

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
            return oVar == null ? m8.M : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f41537c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, m8.D0, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41538c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, m8.Y);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f41539c = new b0();

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
            return h9.c.w(jSONObject2, str2, x7.f44173m, m8.F0, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41540c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, m8.Z);
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f41541c = new c0();

        public c0() {
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
            return z7Var == null ? m8.V : z7Var;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41542c = new d();

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
            h9.m<Double> mVar = m8.f41463c0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = m8.N;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f41543c = new d0();

        public d0() {
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

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41544c = new e();

        public e() {
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
            v9.b<Boolean> bVar = m8.O;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f41545c = new e0();

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

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f41546c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public List<y9.e0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.e0.f39726a);
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, m8.f41465d0, cVar2.a(), cVar2);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f41547c = new f0();

        public f0() {
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

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f41548c = new g();

        public g() {
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
            return k0Var == null ? m8.P : k0Var;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f41549c = new g0();

        public g0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, m8.H0, cVar2.a(), cVar2);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f41550c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, m8.f41469f0, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f41551c = new h0();

        public h0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f41552c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, m8.f41475i0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class i0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f41553c = new i0();

        public i0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f41554c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public List<q1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q1.f42118a);
            return h9.c.w(jSONObject2, str2, q1.f42126i, m8.f41477j0, cVar2.a(), cVar2);
        }
    }

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f41555c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f41556c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, m8.f41483m0, cVar2.a());
        }
    }

    public static final class k0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<i8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f41557c = new k0();

        public k0() {
            super(3);
        }

        @Override // uc.q
        public List<i8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(i8.f40635e);
            List<i8> listL = h9.c.l(jSONObject2, str2, i8.f40636f, m8.J0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivV…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f41558c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, m8.f41485n0, cVar2.a(), cVar2);
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f41559c = new l0();

        public l0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, m8.L0, cVar2.a(), cVar2);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f41560c = new m();

        public m() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, m8.f41489p0, cVar2.a(), cVar2);
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f41561c = new m0();

        public m0() {
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

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f41562c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, m8.f41493r0, cVar2.a(), cVar2);
        }
    }

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f41563c = new n0();

        public n0() {
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
            v9.b<n8> bVar = m8.W;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, m8.f41459a0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f41564c = new o();

        public o() {
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

    public static final class o0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f41565c = new o0();

        public o0() {
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
            return l6Var == null ? m8.X : l6Var;
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f41566c = new p();

        public p() {
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
            return l6Var == null ? m8.Q : l6Var;
        }
    }

    public static final class p0 {
        public p0() {
        }

        public p0(vc.g gVar) {
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f41567c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, m8.f41499u0, cVar2.a());
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f41568c = new r();

        public r() {
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
            return x1Var == null ? m8.R : x1Var;
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f41569c = new s();

        public s() {
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
            v9.b<Boolean> bVar = m8.S;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f41570c = new t();

        public t() {
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
            return x1Var == null ? m8.T : x1Var;
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f41571c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, m8.f41501v0, cVar2.a(), cVar2);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, JSONObject> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f41572c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public JSONObject b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            return (JSONObject) h9.c.m(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env"));
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f41573c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, m8.f41507y0, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f41574c = new x();

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
            v9.b<Boolean> bVar = m8.U;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f41575c = new y();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, m8.f41509z0, cVar2.a(), cVar2);
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f41576c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, m8.C0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new p0(null);
        M = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        N = aVar.a(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        O = aVar.a(bool);
        P = new y9.k0(null, null, null, null, null, 31, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Q = new l6.e(new q8(objArr, objArr2, objArr3, 7, null));
        R = new x1(null, null, null, null, null, 31, null);
        S = aVar.a(bool);
        T = new x1(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        U = aVar.a(bool);
        V = new z7(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        W = aVar.a(n8.VISIBLE);
        X = new l6.d(new i4(null, 1, 0 == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        h0 h0Var = h0.f41551c;
        fd.j0.i(objQ, "default");
        fd.j0.i(h0Var, "validator");
        Y = new h9.k.a.C0302a(objQ, h0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        i0 i0Var = i0.f41553c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(i0Var, "validator");
        Z = new h9.k.a.C0302a(objQ2, i0Var);
        Object objQ3 = kc.j.q(n8.values());
        j0 j0Var = j0.f41555c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(j0Var, "validator");
        f41459a0 = new h9.k.a.C0302a(objQ3, j0Var);
        f41461b0 = w7.f43824r;
        f41463c0 = g8.f40236t;
        f41465d0 = k8.f41133e;
        f41467e0 = g8.D;
        f41469f0 = k8.f41138j;
        f41471g0 = g8.E;
        f41473h0 = k8.f41139k;
        f41475i0 = g8.F;
        f41477j0 = k8.f41140l;
        f41479k0 = l8.f41363d;
        f41481l0 = g8.f40231o;
        f41483m0 = w7.f43825s;
        f41485n0 = g8.f40232p;
        f41487o0 = w7.f43826t;
        f41489p0 = g8.f40233q;
        f41491q0 = w7.f43827u;
        f41493r0 = g8.f40234r;
        f41495s0 = w7.f43828v;
        f41497t0 = g8.f40235s;
        f41499u0 = w7.f43829w;
        f41501v0 = w7.f43830x;
        f41503w0 = g8.f40237u;
        f41505x0 = w7.f43831y;
        f41507y0 = g8.f40238v;
        f41509z0 = w7.f43832z;
        A0 = g8.f40239w;
        B0 = w7.A;
        C0 = g8.f40240x;
        D0 = k8.f41132d;
        E0 = g8.f40241y;
        F0 = g8.f40242z;
        G0 = k8.f41134f;
        H0 = g8.A;
        I0 = k8.f41135g;
        J0 = g8.B;
        K0 = k8.f41136h;
        L0 = g8.C;
        M0 = k8.f41137i;
        N0 = a.f41536c;
        O0 = b.f41538c;
        P0 = c.f41540c;
        Q0 = d.f41542c;
        R0 = e.f41544c;
        S0 = f.f41546c;
        T0 = g.f41548c;
        U0 = h.f41550c;
        V0 = i.f41552c;
        W0 = j.f41554c;
        X0 = k.f41556c;
        Y0 = l.f41558c;
        Z0 = m.f41560c;
        f41460a1 = n.f41562c;
        f41462b1 = o.f41564c;
        f41464c1 = p.f41566c;
        f41466d1 = q.f41567c;
        f41468e1 = r.f41568c;
        f41470f1 = s.f41569c;
        f41472g1 = t.f41570c;
        f41474h1 = u.f41571c;
        f41476i1 = v.f41572c;
        f41478j1 = w.f41573c;
        f41480k1 = x.f41574c;
        f41482l1 = y.f41575c;
        f41484m1 = z.f41576c;
        f41486n1 = a0.f41537c;
        f41488o1 = b0.f41539c;
        f41490p1 = c0.f41541c;
        f41492q1 = d0.f41543c;
        f41494r1 = e0.f41545c;
        f41496s1 = f0.f41547c;
        f41498t1 = g0.f41549c;
        f41500u1 = k0.f41557c;
        f41502v1 = n0.f41563c;
        f41504w1 = m0.f41561c;
        f41506x1 = l0.f41559c;
        f41508y1 = o0.f41565c;
    }

    public m8(u9.c cVar, m8 m8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = m8Var == null ? null : m8Var.f41510a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41510a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = m8Var == null ? null : m8Var.f41511b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, Y);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f41511b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = m8Var == null ? null : m8Var.f41512c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, Z);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f41512c = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, m8Var == null ? null : m8Var.f41513d, h9.h.f30981d, f41461b0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f41513d = aVarR;
        j9.a<v9.b<Boolean>> aVar4 = m8Var == null ? null : m8Var.f41514e;
        uc.l<Object, Boolean> lVar = h9.h.f30980c;
        h9.k<Boolean> kVar = h9.l.f30997a;
        j9.a<v9.b<Boolean>> aVarS3 = h9.e.s(jSONObject, "autostart", z10, aVar4, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f41514e = aVarS3;
        j9.a<List<y9.f0>> aVar5 = m8Var == null ? null : m8Var.f41515f;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar5, y9.f0.f39919b, f41467e0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41515f = aVarU;
        j9.a<y9.l0> aVar6 = m8Var == null ? null : m8Var.f41516g;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar6, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41516g = aVarO2;
        j9.a<List<y9.s>> aVar7 = m8Var == null ? null : m8Var.f41517h;
        y9.s.k kVar2 = y9.s.f42386i;
        Objects.requireNonNull(kVar2);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<List<y9.s>> aVarU2 = h9.e.u(jSONObject, "buffering_actions", z10, aVar7, pVar, f41471g0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41517h = aVarU2;
        j9.a<v9.b<Long>> aVar8 = m8Var == null ? null : m8Var.f41518i;
        uc.l<Number, Long> lVar2 = h9.h.f30982e;
        h9.m<Long> mVar = f41473h0;
        h9.k<Long> kVar3 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar8, lVar2, mVar, eVarA, cVar, kVar3);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41518i = aVarR2;
        j9.a<List<s1>> aVar9 = m8Var == null ? null : m8Var.f41519j;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar9, s1.C, f41479k0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41519j = aVarU3;
        j9.a<String> aVarL = h9.e.l(jSONObject, "elapsed_time_variable", z10, m8Var == null ? null : m8Var.f41520k, f41481l0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f41520k = aVarL;
        j9.a<List<y9.s>> aVar10 = m8Var == null ? null : m8Var.f41521l;
        Objects.requireNonNull(kVar2);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "end_actions", z10, aVar10, pVar, f41487o0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41521l = aVarU4;
        j9.a<List<a2>> aVar11 = m8Var == null ? null : m8Var.f41522m;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar11, a2.f39002h, f41491q0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41522m = aVarU5;
        j9.a<List<y9.s>> aVar12 = m8Var == null ? null : m8Var.f41523n;
        Objects.requireNonNull(kVar2);
        j9.a<List<y9.s>> aVarU6 = h9.e.u(jSONObject, "fatal_actions", z10, aVar12, pVar, f41495s0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41523n = aVarU6;
        j9.a<o2> aVar13 = m8Var == null ? null : m8Var.f41524o;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar13, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41524o = aVarO3;
        j9.a<m6> aVar14 = m8Var == null ? null : m8Var.f41525p;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar14, pVar2, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41525p = aVarO4;
        j9.a<String> aVarL2 = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, m8Var == null ? null : m8Var.f41526q, f41497t0, eVarA, cVar);
        fd.j0.h(aVarL2, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f41526q = aVarL2;
        j9.a<y1> aVar15 = m8Var == null ? null : m8Var.f41527r;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar15, pVar3, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41527r = aVarO5;
        j9.a<v9.b<Boolean>> aVarS4 = h9.e.s(jSONObject, "muted", z10, m8Var == null ? null : m8Var.f41528s, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f41528s = aVarS4;
        j9.a<y1> aVar16 = m8Var == null ? null : m8Var.f41529t;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "paddings", z10, aVar16, pVar3, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41529t = aVarO6;
        j9.a<List<y9.s>> aVar17 = m8Var == null ? null : m8Var.f41530u;
        Objects.requireNonNull(kVar2);
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "pause_actions", z10, aVar17, pVar, f41503w0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41530u = aVarU7;
        j9.a<JSONObject> aVarM = h9.e.m(jSONObject, "player_settings_payload", z10, m8Var == null ? null : m8Var.f41531v, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …ingsPayload, logger, env)");
        this.f41531v = aVarM;
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "preview", z10, m8Var == null ? null : m8Var.f41532w, f41505x0, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f41532w = aVarP;
        j9.a<v9.b<Boolean>> aVarS5 = h9.e.s(jSONObject, "repeatable", z10, m8Var == null ? null : m8Var.f41533x, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f41533x = aVarS5;
        j9.a<List<y9.s>> aVar18 = m8Var == null ? null : m8Var.f41534y;
        Objects.requireNonNull(kVar2);
        j9.a<List<y9.s>> aVarU8 = h9.e.u(jSONObject, "resume_actions", z10, aVar18, pVar, A0, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41534y = aVarU8;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, m8Var == null ? null : m8Var.f41535z, lVar2, B0, eVarA, cVar, kVar3);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41535z = aVarR3;
        j9.a<List<y9.s>> aVar19 = m8Var == null ? null : m8Var.A;
        Objects.requireNonNull(kVar2);
        j9.a<List<y9.s>> aVarU9 = h9.e.u(jSONObject, "selected_actions", z10, aVar19, pVar, E0, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.A = aVarU9;
        j9.a<List<y7>> aVar20 = m8Var == null ? null : m8Var.B;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU10 = h9.e.u(jSONObject, "tooltips", z10, aVar20, y7.f44555v, G0, eVarA, cVar);
        fd.j0.h(aVarU10, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.B = aVarU10;
        j9.a<a8> aVar21 = m8Var == null ? null : m8Var.C;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO7 = h9.e.o(jSONObject, "transform", z10, aVar21, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.C = aVarO7;
        j9.a<s0> aVar22 = m8Var == null ? null : m8Var.D;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO8 = h9.e.o(jSONObject, "transition_change", z10, aVar22, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO8;
        j9.a<y9.b0> aVar23 = m8Var == null ? null : m8Var.E;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO9 = h9.e.o(jSONObject, "transition_in", z10, aVar23, pVar4, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO9;
        j9.a<y9.b0> aVar24 = m8Var == null ? null : m8Var.F;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO10 = h9.e.o(jSONObject, "transition_out", z10, aVar24, pVar4, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO10;
        j9.a<List<c8>> aVar25 = m8Var == null ? null : m8Var.G;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar25, c8.FROM_STRING, I0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.G = aVarT;
        j9.a<List<j8>> aVar26 = m8Var == null ? null : m8Var.H;
        Objects.requireNonNull(j8.f40945e);
        this.H = h9.e.k(jSONObject, "video_sources", z10, aVar26, j8.f40950j, K0, eVarA, cVar);
        j9.a<v9.b<n8>> aVar27 = m8Var == null ? null : m8Var.I;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS6 = h9.e.s(jSONObject, "visibility", z10, aVar27, n8.FROM_STRING, eVarA, cVar, f41459a0);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.I = aVarS6;
        j9.a<p8> aVar28 = m8Var == null ? null : m8Var.J;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO11 = h9.e.o(jSONObject, "visibility_action", z10, aVar28, pVar5, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.J = aVarO11;
        j9.a<List<p8>> aVar29 = m8Var == null ? null : m8Var.K;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU11 = h9.e.u(jSONObject, "visibility_actions", z10, aVar29, pVar5, M0, eVarA, cVar);
        fd.j0.h(aVarU11, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.K = aVarU11;
        j9.a<m6> aVar30 = m8Var == null ? null : m8Var.L;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO12 = h9.e.o(jSONObject, "width", z10, aVar30, pVar2, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.L = aVarO12;
    }

    public /* synthetic */ m8(u9.c cVar, m8 m8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : m8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f41510a, cVar, "accessibility", jSONObject, N0);
        if (oVar == null) {
            oVar = M;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f41511b, cVar, "alignment_horizontal", jSONObject, O0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f41512c, cVar, "alignment_vertical", jSONObject, P0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f41513d, cVar, "alpha", jSONObject, Q0);
        if (bVar3 == null) {
            bVar3 = N;
        }
        v9.b<Double> bVar4 = bVar3;
        v9.b<Boolean> bVar5 = (v9.b) y8.c0.H(this.f41514e, cVar, "autostart", jSONObject, R0);
        if (bVar5 == null) {
            bVar5 = O;
        }
        v9.b<Boolean> bVar6 = bVar5;
        List listL = y8.c0.L(this.f41515f, cVar, "background", jSONObject, f41465d0, S0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f41516g, cVar, "border", jSONObject, T0);
        if (k0Var == null) {
            k0Var = P;
        }
        y9.k0 k0Var2 = k0Var;
        List listL2 = y8.c0.L(this.f41517h, cVar, "buffering_actions", jSONObject, f41469f0, U0);
        v9.b bVar7 = (v9.b) y8.c0.H(this.f41518i, cVar, "column_span", jSONObject, V0);
        List listL3 = y8.c0.L(this.f41519j, cVar, "disappear_actions", jSONObject, f41477j0, W0);
        String str = (String) y8.c0.H(this.f41520k, cVar, "elapsed_time_variable", jSONObject, X0);
        List listL4 = y8.c0.L(this.f41521l, cVar, "end_actions", jSONObject, f41485n0, Y0);
        List listL5 = y8.c0.L(this.f41522m, cVar, "extensions", jSONObject, f41489p0, Z0);
        List listL6 = y8.c0.L(this.f41523n, cVar, "fatal_actions", jSONObject, f41493r0, f41460a1);
        n2 n2Var = (n2) y8.c0.K(this.f41524o, cVar, "focus", jSONObject, f41462b1);
        l6 l6Var = (l6) y8.c0.K(this.f41525p, cVar, "height", jSONObject, f41464c1);
        if (l6Var == null) {
            l6Var = Q;
        }
        l6 l6Var2 = l6Var;
        String str2 = (String) y8.c0.H(this.f41526q, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f41466d1);
        x1 x1Var = (x1) y8.c0.K(this.f41527r, cVar, "margins", jSONObject, f41468e1);
        if (x1Var == null) {
            x1Var = R;
        }
        x1 x1Var2 = x1Var;
        v9.b<Boolean> bVar8 = (v9.b) y8.c0.H(this.f41528s, cVar, "muted", jSONObject, f41470f1);
        if (bVar8 == null) {
            bVar8 = S;
        }
        v9.b<Boolean> bVar9 = bVar8;
        x1 x1Var3 = (x1) y8.c0.K(this.f41529t, cVar, "paddings", jSONObject, f41472g1);
        if (x1Var3 == null) {
            x1Var3 = T;
        }
        x1 x1Var4 = x1Var3;
        List listL7 = y8.c0.L(this.f41530u, cVar, "pause_actions", jSONObject, f41501v0, f41474h1);
        JSONObject jSONObject2 = (JSONObject) y8.c0.H(this.f41531v, cVar, "player_settings_payload", jSONObject, f41476i1);
        v9.b bVar10 = (v9.b) y8.c0.H(this.f41532w, cVar, "preview", jSONObject, f41478j1);
        v9.b<Boolean> bVar11 = (v9.b) y8.c0.H(this.f41533x, cVar, "repeatable", jSONObject, f41480k1);
        if (bVar11 == null) {
            bVar11 = U;
        }
        v9.b<Boolean> bVar12 = bVar11;
        List listL8 = y8.c0.L(this.f41534y, cVar, "resume_actions", jSONObject, f41509z0, f41482l1);
        v9.b bVar13 = (v9.b) y8.c0.H(this.f41535z, cVar, "row_span", jSONObject, f41484m1);
        List listL9 = y8.c0.L(this.A, cVar, "selected_actions", jSONObject, D0, f41486n1);
        List listL10 = y8.c0.L(this.B, cVar, "tooltips", jSONObject, F0, f41488o1);
        z7 z7Var = (z7) y8.c0.K(this.C, cVar, "transform", jSONObject, f41490p1);
        if (z7Var == null) {
            z7Var = V;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.D, cVar, "transition_change", jSONObject, f41492q1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.E, cVar, "transition_in", jSONObject, f41494r1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.F, cVar, "transition_out", jSONObject, f41496s1);
        List listJ = y8.c0.J(this.G, cVar, "transition_triggers", jSONObject, H0, f41498t1);
        List listN = y8.c0.N(this.H, cVar, "video_sources", jSONObject, J0, f41500u1);
        v9.b<n8> bVar14 = (v9.b) y8.c0.H(this.I, cVar, "visibility", jSONObject, f41502v1);
        if (bVar14 == null) {
            bVar14 = W;
        }
        v9.b<n8> bVar15 = bVar14;
        o8 o8Var = (o8) y8.c0.K(this.J, cVar, "visibility_action", jSONObject, f41504w1);
        List listL11 = y8.c0.L(this.K, cVar, "visibility_actions", jSONObject, L0, f41506x1);
        l6 l6Var3 = (l6) y8.c0.K(this.L, cVar, "width", jSONObject, f41508y1);
        if (l6Var3 == null) {
            l6Var3 = X;
        }
        return new h8(oVar2, bVar, bVar2, bVar4, bVar6, listL, k0Var2, listL2, bVar7, listL3, str, listL4, listL5, listL6, n2Var, l6Var2, str2, x1Var2, bVar9, x1Var4, listL7, jSONObject2, bVar10, bVar12, listL8, bVar13, listL9, listL10, z7Var2, r0Var, a0Var, a0Var2, listJ, listN, bVar15, o8Var, listL11, l6Var3);
    }
}
