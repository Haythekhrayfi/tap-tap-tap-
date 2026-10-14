package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u2 implements u9.a, u9.b<t2> {
    public static final h9.m<Long> A0;
    public static final h9.m<Long> B0;
    public static final h9.g<y9.q> C0;
    public static final h9.g<y9.s> D0;
    public static final h9.g<x7> E0;
    public static final h9.g<y7> F0;
    public static final h9.g<c8> G0;
    public static final h9.g<c8> H0;
    public static final h9.g<o8> I0;
    public static final y9.o J;
    public static final h9.g<p8> J0;
    public static final v9.b<Double> K;
    public static final uc.q<String, JSONObject, u9.c, y9.o> K0;
    public static final y9.k0 L;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> L0;
    public static final v9.b<t2.h> M;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> M0;
    public static final v9.b<Long> N;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> N0;
    public static final l6.e O;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> O0;
    public static final v9.b<Long> P;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> P0;
    public static final x1 Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Q0;
    public static final v9.b<t2.i> R;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> R0;
    public static final x1 S;
    public static final uc.q<String, JSONObject, u9.c, v9.b<t2.h>> S0;
    public static final v9.b<Boolean> T;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> T0;
    public static final v9.b<t2.j> U;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> U0;
    public static final z7 V;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> V0;
    public static final v9.b<n8> W;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> W0;
    public static final l6.d X;
    public static final uc.q<String, JSONObject, u9.c, n2> X0;
    public static final h9.k<y9.t> Y;
    public static final uc.q<String, JSONObject, u9.c, l6> Y0;
    public static final h9.k<y9.u> Z;
    public static final uc.q<String, JSONObject, u9.c, String> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<t2.h> f42955a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42956a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.k<t2.i> f42957b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.k>> f42958b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<t2.j> f42959c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f42960c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<n8> f42961d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<t2.i>> f42962d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Double> f42963e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f42964e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.m<Double> f42965f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f42966f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<y9.e0> f42967g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42968g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<y9.f0> f42969h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<t2.j>> f42970h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Long> f42971i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f42972i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<Long> f42973j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f42974j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Long> f42975k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f42976k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<Long> f42977l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, r0> f42978l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f42979m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f42980m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<Long> f42981n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f42982n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f42983o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f42984o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<Long> f42985p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f42986p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<q1> f42987q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f42988q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<s1> f42989r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f42990r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<z1> f42991s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f42992s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<a2> f42993t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<String> f42994u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.m<String> f42995v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<Long> f42996w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<Long> f42997x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<y9.k> f42998y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<i7> f42999z0;
    public final j9.a<a8> A;
    public final j9.a<s0> B;
    public final j9.a<y9.b0> C;
    public final j9.a<y9.b0> D;
    public final j9.a<List<c8>> E;
    public final j9.a<v9.b<n8>> F;
    public final j9.a<p8> G;
    public final j9.a<List<p8>> H;
    public final j9.a<m6> I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f43000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f43001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f43002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f43004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<y9.l0> f43005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<v9.b<t2.h>> f43008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<List<s1>> f43011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<List<a2>> f43012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<o2> f43013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<m6> f43014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<String> f43015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<List<i7>> f43017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<y1> f43018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<v9.b<t2.i>> f43019t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<y1> f43020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f43021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v9.b<t2.j>> f43023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43024y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<List<y7>> f43025z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43026c = new a();

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
            return oVar == null ? u2.J : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f43027c = new a0();

        public a0() {
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
            return z7Var == null ? u2.V : z7Var;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43028c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, u2.Y);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f43029c = new b0();

        public b0() {
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

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43030c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, u2.Z);
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f43031c = new c0();

        public c0() {
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

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43032c = new d();

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
            h9.m<Double> mVar = u2.f42965f0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = u2.K;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f43033c = new d0();

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
        public static final e f43034c = new e();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, u2.f42967g0, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f43035c = new e0();

        public e0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, u2.G0, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43036c = new f();

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
            return k0Var == null ? u2.L : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f43037c = new f0();

        public f0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f43038c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u2.f42973j0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f43039c = new g0();

        public g0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f43040c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u2.f42977l0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class h0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f43041c = new h0();

        public h0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t2.h);
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<t2.h>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f43042c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public v9.b<t2.h> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t2.h.Converter);
            uc.l lVar = t2.h.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<t2.h> bVar = u2.M;
            v9.b<t2.h> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u2.f42955a0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class i0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f43043c = new i0();

        public i0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t2.i);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f43044c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u2.f42981n0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f43045c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t2.j);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f43046c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = u2.f42985p0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = u2.N;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class k0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f43047c = new k0();

        public k0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f43048c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public List<q1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q1.f42118a);
            return h9.c.w(jSONObject2, str2, q1.f42126i, u2.f42987q0, cVar2.a(), cVar2);
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f43049c = new l0();

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
            return h9.c.w(jSONObject2, str2, o8.f41853q, u2.I0, cVar2.a(), cVar2);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f43050c = new m();

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
            return h9.c.w(jSONObject2, str2, z1.f44584e, u2.f42991s0, cVar2.a(), cVar2);
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f43051c = new m0();

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

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f43052c = new n();

        public n() {
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

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f43053c = new n0();

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
            v9.b<n8> bVar = u2.W;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u2.f42961d0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f43054c = new o();

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
            return l6Var == null ? u2.O : l6Var;
        }
    }

    public static final class o0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f43055c = new o0();

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
            return l6Var == null ? u2.X : l6Var;
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f43056c = new p();

        public p() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, u2.f42995v0, cVar2.a());
        }
    }

    public static final class p0 {
        public p0() {
        }

        public p0(vc.g gVar) {
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.k>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f43057c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public List<y9.k> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.k.f40973a);
            List<y9.k> listL = h9.c.l(jSONObject2, str2, y9.k.f40974b, u2.f42998y0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, Div.…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f43058c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = u2.f42997x0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = u2.P;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f43059c = new s();

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
            return x1Var == null ? u2.Q : x1Var;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<t2.i>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f43060c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public v9.b<t2.i> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t2.i.Converter);
            uc.l lVar = t2.i.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<t2.i> bVar = u2.R;
            v9.b<t2.i> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u2.f42957b0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f43061c = new u();

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
            return x1Var == null ? u2.S : x1Var;
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f43062c = new v();

        public v() {
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
            v9.b<Boolean> bVar = u2.T;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f43063c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u2.B0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<t2.j>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f43064c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public v9.b<t2.j> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t2.j.Converter);
            uc.l lVar = t2.j.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<t2.j> bVar = u2.U;
            v9.b<t2.j> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u2.f42959c0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f43065c = new y();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, u2.C0, cVar2.a(), cVar2);
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f43066c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, u2.E0, cVar2.a(), cVar2);
        }
    }

    static {
        new p0(null);
        J = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        K = aVar.a(Double.valueOf(1.0d));
        L = new y9.k0(null, null, null, null, null, 31, null);
        M = aVar.a(t2.h.START);
        N = aVar.a(0L);
        O = new l6.e(new q8(null, null, null, 7, null));
        P = aVar.a(8L);
        Q = new x1(null, null, null, null, null, 31, null);
        R = aVar.a(t2.i.HORIZONTAL);
        S = new x1(null, null, null, null, null, 31, null);
        T = aVar.a(Boolean.FALSE);
        U = aVar.a(t2.j.DEFAULT);
        V = new z7(null, null, null, 7, null);
        W = aVar.a(n8.VISIBLE);
        X = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        f0 f0Var = f0.f43037c;
        fd.j0.i(objQ, "default");
        fd.j0.i(f0Var, "validator");
        Y = new h9.k.a.C0302a(objQ, f0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        g0 g0Var = g0.f43039c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(g0Var, "validator");
        Z = new h9.k.a.C0302a(objQ2, g0Var);
        Object objQ3 = kc.j.q(t2.h.values());
        h0 h0Var = h0.f43041c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(h0Var, "validator");
        f42955a0 = new h9.k.a.C0302a(objQ3, h0Var);
        Object objQ4 = kc.j.q(t2.i.values());
        i0 i0Var = i0.f43043c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(i0Var, "validator");
        f42957b0 = new h9.k.a.C0302a(objQ4, i0Var);
        Object objQ5 = kc.j.q(t2.j.values());
        j0 j0Var = j0.f43045c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(j0Var, "validator");
        f42959c0 = new h9.k.a.C0302a(objQ5, j0Var);
        Object objQ6 = kc.j.q(n8.values());
        k0 k0Var = k0.f43047c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(k0Var, "validator");
        f42961d0 = new h9.k.a.C0302a(objQ6, k0Var);
        f42963e0 = r2.f42265l;
        f42965f0 = s2.f42480i;
        f42967g0 = r2.f42276w;
        f42969h0 = s2.f42487p;
        f42971i0 = r2.f42278y;
        f42973j0 = s2.f42488q;
        f42975k0 = r2.f42279z;
        f42977l0 = s2.f42489r;
        f42979m0 = r2.A;
        f42981n0 = s2.f42490s;
        f42983o0 = s2.f42475d;
        f42985p0 = r2.f42266m;
        f42987q0 = s2.f42476e;
        f42989r0 = r2.f42267n;
        f42991s0 = s2.f42477f;
        f42993t0 = r2.f42268o;
        f42994u0 = s2.f42478g;
        f42995v0 = r2.f42269p;
        f42996w0 = s2.f42479h;
        f42997x0 = r2.f42270q;
        f42998y0 = r2.f42271r;
        f42999z0 = s2.f42481j;
        A0 = r2.f42272s;
        B0 = s2.f42482k;
        C0 = r2.f42273t;
        D0 = s2.f42483l;
        E0 = r2.f42274u;
        F0 = s2.f42484m;
        G0 = r2.f42275v;
        H0 = s2.f42485n;
        I0 = s2.f42486o;
        J0 = r2.f42277x;
        K0 = a.f43026c;
        L0 = b.f43028c;
        M0 = c.f43030c;
        N0 = d.f43032c;
        O0 = e.f43034c;
        P0 = f.f43036c;
        Q0 = g.f43038c;
        R0 = h.f43040c;
        S0 = i.f43042c;
        T0 = j.f43044c;
        U0 = k.f43046c;
        V0 = l.f43048c;
        W0 = m.f43050c;
        X0 = n.f43052c;
        Y0 = o.f43054c;
        Z0 = p.f43056c;
        f42956a1 = r.f43058c;
        f42958b1 = q.f43057c;
        f42960c1 = s.f43059c;
        f42962d1 = t.f43060c;
        f42964e1 = u.f43061c;
        f42966f1 = v.f43062c;
        f42968g1 = w.f43063c;
        f42970h1 = x.f43064c;
        f42972i1 = y.f43065c;
        f42974j1 = z.f43066c;
        f42976k1 = a0.f43027c;
        f42978l1 = b0.f43029c;
        f42980m1 = c0.f43031c;
        f42982n1 = d0.f43033c;
        f42984o1 = e0.f43035c;
        f42986p1 = n0.f43053c;
        f42988q1 = m0.f43051c;
        f42990r1 = l0.f43049c;
        f42992s1 = o0.f43055c;
    }

    public u2(u9.c cVar, u2 u2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = u2Var == null ? null : u2Var.f43000a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43000a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = u2Var == null ? null : u2Var.f43001b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, Y);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f43001b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = u2Var == null ? null : u2Var.f43002c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, Z);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f43002c = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, u2Var == null ? null : u2Var.f43003d, h9.h.f30981d, f42963e0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43003d = aVarR;
        j9.a<List<y9.f0>> aVar4 = u2Var == null ? null : u2Var.f43004e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar4, y9.f0.f39919b, f42969h0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43004e = aVarU;
        j9.a<y9.l0> aVar5 = u2Var == null ? null : u2Var.f43005f;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar5, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43005f = aVarO2;
        j9.a<v9.b<Long>> aVar6 = u2Var == null ? null : u2Var.f43006g;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f42971i0;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_count", z10, aVar6, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43006g = aVarR2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "column_span", z10, u2Var == null ? null : u2Var.f43007h, lVar, f42975k0, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43007h = aVarR3;
        j9.a<v9.b<t2.h>> aVar7 = u2Var == null ? null : u2Var.f43008i;
        Objects.requireNonNull(t2.h.Converter);
        j9.a<v9.b<t2.h>> aVarS3 = h9.e.s(jSONObject, "cross_content_alignment", z10, aVar7, t2.h.FROM_STRING, eVarA, cVar, f42955a0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…_CROSS_CONTENT_ALIGNMENT)");
        this.f43008i = aVarS3;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "cross_spacing", z10, u2Var == null ? null : u2Var.f43009j, lVar, f42979m0, eVarA, cVar, kVar);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43009j = aVarR4;
        j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "default_item", z10, u2Var == null ? null : u2Var.f43010k, lVar, f42983o0, eVarA, cVar, kVar);
        fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43010k = aVarR5;
        j9.a<List<s1>> aVar8 = u2Var == null ? null : u2Var.f43011l;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar8, s1.C, f42989r0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43011l = aVarU2;
        j9.a<List<a2>> aVar9 = u2Var == null ? null : u2Var.f43012m;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar9, a2.f39002h, f42993t0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43012m = aVarU3;
        j9.a<o2> aVar10 = u2Var == null ? null : u2Var.f43013n;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar10, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43013n = aVarO3;
        j9.a<m6> aVar11 = u2Var == null ? null : u2Var.f43014o;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar11, pVar, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43014o = aVarO4;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, u2Var == null ? null : u2Var.f43015p, f42994u0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f43015p = aVarL;
        j9.a<v9.b<Long>> aVarR6 = h9.e.r(jSONObject, "item_spacing", z10, u2Var == null ? null : u2Var.f43016q, lVar, f42996w0, eVarA, cVar, kVar);
        fd.j0.h(aVarR6, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43016q = aVarR6;
        j9.a<List<i7>> aVar12 = u2Var == null ? null : u2Var.f43017r;
        Objects.requireNonNull(i7.f40616a);
        this.f43017r = h9.e.k(jSONObject, "items", z10, aVar12, i7.f40617b, f42999z0, eVarA, cVar);
        j9.a<y1> aVar13 = u2Var == null ? null : u2Var.f43018s;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar2 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar13, pVar2, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43018s = aVarO5;
        j9.a<v9.b<t2.i>> aVar14 = u2Var == null ? null : u2Var.f43019t;
        Objects.requireNonNull(t2.i.Converter);
        j9.a<v9.b<t2.i>> aVarS4 = h9.e.s(jSONObject, "orientation", z10, aVar14, t2.i.FROM_STRING, eVarA, cVar, f42957b0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp… TYPE_HELPER_ORIENTATION)");
        this.f43019t = aVarS4;
        j9.a<y1> aVar15 = u2Var == null ? null : u2Var.f43020u;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "paddings", z10, aVar15, pVar2, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43020u = aVarO6;
        j9.a<v9.b<Boolean>> aVarS5 = h9.e.s(jSONObject, "restrict_parent_scroll", z10, u2Var == null ? null : u2Var.f43021v, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f43021v = aVarS5;
        j9.a<v9.b<Long>> aVarR7 = h9.e.r(jSONObject, "row_span", z10, u2Var == null ? null : u2Var.f43022w, lVar, A0, eVarA, cVar, kVar);
        fd.j0.h(aVarR7, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43022w = aVarR7;
        j9.a<v9.b<t2.j>> aVar16 = u2Var == null ? null : u2Var.f43023x;
        Objects.requireNonNull(t2.j.Converter);
        j9.a<v9.b<t2.j>> aVarS6 = h9.e.s(jSONObject, "scroll_mode", z10, aVar16, t2.j.FROM_STRING, eVarA, cVar, f42959c0);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp… TYPE_HELPER_SCROLL_MODE)");
        this.f43023x = aVarS6;
        j9.a<List<y9.s>> aVar17 = u2Var == null ? null : u2Var.f43024y;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar17, y9.s.f42400w, D0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43024y = aVarU4;
        j9.a<List<y7>> aVar18 = u2Var == null ? null : u2Var.f43025z;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar18, y7.f44555v, F0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43025z = aVarU5;
        j9.a<a8> aVar19 = u2Var == null ? null : u2Var.A;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO7 = h9.e.o(jSONObject, "transform", z10, aVar19, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO7;
        j9.a<s0> aVar20 = u2Var == null ? null : u2Var.B;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO8 = h9.e.o(jSONObject, "transition_change", z10, aVar20, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO8;
        j9.a<y9.b0> aVar21 = u2Var == null ? null : u2Var.C;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar3 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO9 = h9.e.o(jSONObject, "transition_in", z10, aVar21, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.C = aVarO9;
        j9.a<y9.b0> aVar22 = u2Var == null ? null : u2Var.D;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO10 = h9.e.o(jSONObject, "transition_out", z10, aVar22, pVar3, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO10;
        j9.a<List<c8>> aVar23 = u2Var == null ? null : u2Var.E;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar23, c8.FROM_STRING, H0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.E = aVarT;
        j9.a<v9.b<n8>> aVar24 = u2Var == null ? null : u2Var.F;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS7 = h9.e.s(jSONObject, "visibility", z10, aVar24, n8.FROM_STRING, eVarA, cVar, f42961d0);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.F = aVarS7;
        j9.a<p8> aVar25 = u2Var == null ? null : u2Var.G;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar4 = p8.C;
        j9.a<p8> aVarO11 = h9.e.o(jSONObject, "visibility_action", z10, aVar25, pVar4, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.G = aVarO11;
        j9.a<List<p8>> aVar26 = u2Var == null ? null : u2Var.H;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, aVar26, pVar4, J0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.H = aVarU6;
        j9.a<m6> aVar27 = u2Var == null ? null : u2Var.I;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO12 = h9.e.o(jSONObject, "width", z10, aVar27, pVar, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.I = aVarO12;
    }

    public /* synthetic */ u2(u9.c cVar, u2 u2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : u2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f43000a, cVar, "accessibility", jSONObject, K0);
        if (oVar == null) {
            oVar = J;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f43001b, cVar, "alignment_horizontal", jSONObject, L0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f43002c, cVar, "alignment_vertical", jSONObject, M0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f43003d, cVar, "alpha", jSONObject, N0);
        if (bVar3 == null) {
            bVar3 = K;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f43004e, cVar, "background", jSONObject, f42967g0, O0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f43005f, cVar, "border", jSONObject, P0);
        if (k0Var == null) {
            k0Var = L;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f43006g, cVar, "column_count", jSONObject, Q0);
        v9.b bVar6 = (v9.b) y8.c0.H(this.f43007h, cVar, "column_span", jSONObject, R0);
        v9.b<t2.h> bVar7 = (v9.b) y8.c0.H(this.f43008i, cVar, "cross_content_alignment", jSONObject, S0);
        if (bVar7 == null) {
            bVar7 = M;
        }
        v9.b<t2.h> bVar8 = bVar7;
        v9.b bVar9 = (v9.b) y8.c0.H(this.f43009j, cVar, "cross_spacing", jSONObject, T0);
        v9.b<Long> bVar10 = (v9.b) y8.c0.H(this.f43010k, cVar, "default_item", jSONObject, U0);
        if (bVar10 == null) {
            bVar10 = N;
        }
        v9.b<Long> bVar11 = bVar10;
        List listL2 = y8.c0.L(this.f43011l, cVar, "disappear_actions", jSONObject, f42987q0, V0);
        List listL3 = y8.c0.L(this.f43012m, cVar, "extensions", jSONObject, f42991s0, W0);
        n2 n2Var = (n2) y8.c0.K(this.f43013n, cVar, "focus", jSONObject, X0);
        l6 l6Var = (l6) y8.c0.K(this.f43014o, cVar, "height", jSONObject, Y0);
        if (l6Var == null) {
            l6Var = O;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f43015p, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, Z0);
        v9.b<Long> bVar12 = (v9.b) y8.c0.H(this.f43016q, cVar, "item_spacing", jSONObject, f42956a1);
        if (bVar12 == null) {
            bVar12 = P;
        }
        v9.b<Long> bVar13 = bVar12;
        List listN = y8.c0.N(this.f43017r, cVar, "items", jSONObject, f42998y0, f42958b1);
        x1 x1Var = (x1) y8.c0.K(this.f43018s, cVar, "margins", jSONObject, f42960c1);
        if (x1Var == null) {
            x1Var = Q;
        }
        x1 x1Var2 = x1Var;
        v9.b<t2.i> bVar14 = (v9.b) y8.c0.H(this.f43019t, cVar, "orientation", jSONObject, f42962d1);
        if (bVar14 == null) {
            bVar14 = R;
        }
        v9.b<t2.i> bVar15 = bVar14;
        x1 x1Var3 = (x1) y8.c0.K(this.f43020u, cVar, "paddings", jSONObject, f42964e1);
        if (x1Var3 == null) {
            x1Var3 = S;
        }
        x1 x1Var4 = x1Var3;
        v9.b<Boolean> bVar16 = (v9.b) y8.c0.H(this.f43021v, cVar, "restrict_parent_scroll", jSONObject, f42966f1);
        if (bVar16 == null) {
            bVar16 = T;
        }
        v9.b<Boolean> bVar17 = bVar16;
        v9.b bVar18 = (v9.b) y8.c0.H(this.f43022w, cVar, "row_span", jSONObject, f42968g1);
        v9.b<t2.j> bVar19 = (v9.b) y8.c0.H(this.f43023x, cVar, "scroll_mode", jSONObject, f42970h1);
        if (bVar19 == null) {
            bVar19 = U;
        }
        v9.b<t2.j> bVar20 = bVar19;
        List listL4 = y8.c0.L(this.f43024y, cVar, "selected_actions", jSONObject, C0, f42972i1);
        List listL5 = y8.c0.L(this.f43025z, cVar, "tooltips", jSONObject, E0, f42974j1);
        z7 z7Var = (z7) y8.c0.K(this.A, cVar, "transform", jSONObject, f42976k1);
        if (z7Var == null) {
            z7Var = V;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.B, cVar, "transition_change", jSONObject, f42978l1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.C, cVar, "transition_in", jSONObject, f42980m1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.D, cVar, "transition_out", jSONObject, f42982n1);
        List listJ = y8.c0.J(this.E, cVar, "transition_triggers", jSONObject, G0, f42984o1);
        v9.b<n8> bVar21 = (v9.b) y8.c0.H(this.F, cVar, "visibility", jSONObject, f42986p1);
        if (bVar21 == null) {
            bVar21 = W;
        }
        v9.b<n8> bVar22 = bVar21;
        o8 o8Var = (o8) y8.c0.K(this.G, cVar, "visibility_action", jSONObject, f42988q1);
        List listL6 = y8.c0.L(this.H, cVar, "visibility_actions", jSONObject, I0, f42990r1);
        l6 l6Var3 = (l6) y8.c0.K(this.I, cVar, "width", jSONObject, f42992s1);
        if (l6Var3 == null) {
            l6Var3 = X;
        }
        return new t2(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, bVar6, bVar8, bVar9, bVar11, listL2, listL3, n2Var, l6Var2, str, bVar13, listN, x1Var2, bVar15, x1Var4, bVar17, bVar18, bVar20, listL4, listL5, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar22, o8Var, listL6, l6Var3);
    }
}
