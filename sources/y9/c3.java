package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c3 implements u9.a, u9.b<a3> {
    public static final h9.g<x7> A0;
    public static final h9.g<y7> B0;
    public static final h9.g<c8> C0;
    public static final h9.g<c8> D0;
    public static final h9.g<o8> E0;
    public static final h9.g<p8> F0;
    public static final uc.q<String, JSONObject, u9.c, y9.o> G0;
    public static final uc.q<String, JSONObject, u9.c, y9.q> H0;
    public static final uc.q<String, JSONObject, u9.c, y9.v> I0;
    public static final y9.o J;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> J0;
    public static final y9.v K;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> K0;
    public static final v9.b<Double> L;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> L0;
    public static final y9.k0 M;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> M0;
    public static final v9.b<y9.t> N;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> N0;
    public static final v9.b<y9.u> O;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> O0;
    public static final l6.e P;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> P0;
    public static final x1 Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Q0;
    public static final x1 R;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> R0;
    public static final z7 S;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> S0;
    public static final v9.b<n8> T;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> T0;
    public static final l6.d U;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> U0;
    public static final h9.k<y9.t> V;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> V0;
    public static final h9.k<y9.u> W;
    public static final uc.q<String, JSONObject, u9.c, n2> W0;
    public static final h9.k<y9.t> X;
    public static final uc.q<String, JSONObject, u9.c, l6> X0;
    public static final h9.k<y9.u> Y;
    public static final uc.q<String, JSONObject, u9.c, String> Y0;
    public static final h9.k<n8> Z;
    public static final uc.q<String, JSONObject, u9.c, List<y9.k>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.g<y9.q> f39399a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f39400a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.g<y9.s> f39401b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f39402b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<Double> f39403c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f39404c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.m<Double> f39405d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39406d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.g<y9.e0> f39407e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f39408e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<y9.f0> f39409f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f39410f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.m<Long> f39411g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f39412g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Long> f39413h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, r0> f39414h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Long> f39415i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f39416i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<Long> f39417j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f39418j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<q1> f39419k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f39420k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<s1> f39421l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f39422l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<y9.q> f39423m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f39424m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<y9.s> f39425n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f39426n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<z1> f39427o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f39428o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<a2> f39429p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<String> f39430q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.m<String> f39431r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<y9.k> f39432s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<i7> f39433t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<y9.q> f39434u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<y9.s> f39435v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<Long> f39436w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<Long> f39437x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<y9.q> f39438y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<y9.s> f39439z0;
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
    public final j9.a<y9.p> f39440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<y9.s> f39441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<y9.x> f39442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f39444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f39445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f39447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<y9.l0> f39448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f39451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f39452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<List<s1>> f39453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<List<a2>> f39455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<o2> f39456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<m6> f39457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<String> f39458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<List<i7>> f39459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<y1> f39461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<y1> f39462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<List<y7>> f39465z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39466c = new a();

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
            return oVar == null ? c3.J : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f39467c = new a0();

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
            return z7Var == null ? c3.S : z7Var;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39468c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, c3.f39399a0, cVar2.a(), cVar2);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f39469c = new b0();

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

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39470c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public y9.v b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.v.f43377h);
            y9.v vVar = (y9.v) h9.c.n(jSONObject2, str2, y9.v.f43387r, cVar2.a(), cVar2);
            return vVar == null ? c3.K : vVar;
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f39471c = new c0();

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

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39472c = new d();

        public d() {
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

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f39473c = new d0();

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

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39474c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y9.t> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.t.Converter);
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, c3.V);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f39475c = new e0();

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
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, c3.C0, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f39476c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y9.u> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.u.Converter);
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, c3.W);
        }
    }

    public static final class f0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f39477c = new f0();

        public f0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f39478c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = c3.f39405d0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = c3.L;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f39479c = new g0();

        public g0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f39480c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public List<y9.e0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.e0.f39726a);
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, c3.f39407e0, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f39481c = new h0();

        public h0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f39482c = new i();

        public i() {
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
            return k0Var == null ? c3.M : k0Var;
        }
    }

    public static final class i0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f39483c = new i0();

        public i0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f39484c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.g(jSONObject2, str2, h9.h.f30982e, c3.f39413h0, cVar2.a(), h9.l.f30998b);
        }
    }

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f39485c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f39486c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, c3.f39417j0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class k0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f39487c = new k0();

        public k0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, c3.E0, cVar2.a(), cVar2);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f39488c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y9.t> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.t.Converter);
            uc.l lVar = y9.t.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<y9.t> bVar = c3.N;
            v9.b<y9.t> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, c3.X);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f39489c = new l0();

        public l0() {
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

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f39490c = new m();

        public m() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y9.u> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.u.Converter);
            uc.l lVar = y9.u.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<y9.u> bVar = c3.O;
            v9.b<y9.u> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, c3.Y);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f39491c = new m0();

        public m0() {
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
            v9.b<n8> bVar = c3.T;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, c3.Z);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f39492c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public List<q1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q1.f42118a);
            return h9.c.w(jSONObject2, str2, q1.f42126i, c3.f39419k0, cVar2.a(), cVar2);
        }
    }

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f39493c = new n0();

        public n0() {
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
            return l6Var == null ? c3.U : l6Var;
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f39494c = new o();

        public o() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, c3.f39423m0, cVar2.a(), cVar2);
        }
    }

    public static final class o0 {
        public o0() {
        }

        public o0(vc.g gVar) {
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f39495c = new p();

        public p() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, c3.f39427o0, cVar2.a(), cVar2);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f39496c = new q();

        public q() {
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

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f39497c = new r();

        public r() {
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
            return l6Var == null ? c3.P : l6Var;
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f39498c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, c3.f39431r0, cVar2.a());
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.k>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f39499c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public List<y9.k> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.k.f40973a);
            List<y9.k> listY = h9.c.y(jSONObject2, str2, y9.k.f40974b, c3.f39432s0, cVar2.a(), cVar2);
            fd.j0.h(listY, "readStrictList(json, key…LIDATOR, env.logger, env)");
            return listY;
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f39500c = new u();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, c3.f39434u0, cVar2.a(), cVar2);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f39501c = new v();

        public v() {
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
            return x1Var == null ? c3.Q : x1Var;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f39502c = new w();

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
            return x1Var == null ? c3.R : x1Var;
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f39503c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, c3.f39437x0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f39504c = new y();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, c3.f39438y0, cVar2.a(), cVar2);
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f39505c = new z();

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
            return h9.c.w(jSONObject2, str2, x7.f44173m, c3.A0, cVar2.a(), cVar2);
        }
    }

    static {
        new o0(null);
        J = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(y9.v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        K = new y9.v(bVarA, bVarA2, null, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        L = aVar.a(dValueOf);
        M = new y9.k0(null, null, null, null, null, 31, null);
        N = aVar.a(y9.t.LEFT);
        O = aVar.a(y9.u.TOP);
        P = new l6.e(new q8(null, null, null, 7, null));
        Q = new x1(null, null, null, null, null, 31, null);
        R = new x1(null, null, null, null, null, 31, null);
        S = new z7(null, null, null, 7, null);
        T = aVar.a(n8.VISIBLE);
        U = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        f0 f0Var = f0.f39477c;
        fd.j0.i(objQ, "default");
        fd.j0.i(f0Var, "validator");
        V = new h9.k.a.C0302a(objQ, f0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        g0 g0Var = g0.f39479c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(g0Var, "validator");
        W = new h9.k.a.C0302a(objQ2, g0Var);
        Object objQ3 = kc.j.q(y9.t.values());
        h0 h0Var = h0.f39481c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(h0Var, "validator");
        X = new h9.k.a.C0302a(objQ3, h0Var);
        Object objQ4 = kc.j.q(y9.u.values());
        i0 i0Var = i0.f39483c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(i0Var, "validator");
        Y = new h9.k.a.C0302a(objQ4, i0Var);
        Object objQ5 = kc.j.q(n8.values());
        j0 j0Var = j0.f39485c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(j0Var, "validator");
        Z = new h9.k.a.C0302a(objQ5, j0Var);
        f39399a0 = x2.f44058w;
        f39401b0 = z2.f44594j;
        f39403c0 = b3.f39148g;
        f39405d0 = z2.f44601q;
        f39407e0 = b3.f39150i;
        f39409f0 = z2.f44602r;
        f39411g0 = b3.f39151j;
        f39413h0 = z2.f44603s;
        f39415i0 = b3.f39152k;
        f39417j0 = z2.f44604t;
        f39419k0 = z2.f44589e;
        f39421l0 = x2.f44059x;
        f39423m0 = z2.f44590f;
        f39425n0 = x2.f44060y;
        f39427o0 = z2.f44591g;
        f39429p0 = x2.f44061z;
        f39430q0 = z2.f44592h;
        f39431r0 = x2.A;
        f39432s0 = z2.f44593i;
        f39433t0 = x2.B;
        f39434u0 = x2.C;
        f39435v0 = z2.f44595k;
        f39436w0 = x2.D;
        f39437x0 = z2.f44596l;
        f39438y0 = b3.f39145d;
        f39439z0 = z2.f44597m;
        A0 = b3.f39146e;
        B0 = z2.f44598n;
        C0 = b3.f39147f;
        D0 = z2.f44599o;
        E0 = z2.f44600p;
        F0 = b3.f39149h;
        G0 = a.f39466c;
        H0 = d.f39472c;
        I0 = c.f39470c;
        J0 = b.f39468c;
        K0 = e.f39474c;
        L0 = f.f39476c;
        M0 = g.f39478c;
        N0 = h.f39480c;
        O0 = i.f39482c;
        P0 = j.f39484c;
        Q0 = k.f39486c;
        R0 = l.f39488c;
        S0 = m.f39490c;
        T0 = n.f39492c;
        U0 = o.f39494c;
        V0 = p.f39495c;
        W0 = q.f39496c;
        X0 = r.f39497c;
        Y0 = s.f39498c;
        Z0 = t.f39499c;
        f39400a1 = u.f39500c;
        f39402b1 = v.f39501c;
        f39404c1 = w.f39502c;
        f39406d1 = x.f39503c;
        f39408e1 = y.f39504c;
        f39410f1 = z.f39505c;
        f39412g1 = a0.f39467c;
        f39414h1 = b0.f39469c;
        f39416i1 = c0.f39471c;
        f39418j1 = d0.f39473c;
        f39420k1 = e0.f39475c;
        f39422l1 = m0.f39491c;
        f39424m1 = l0.f39489c;
        f39426n1 = k0.f39487c;
        f39428o1 = n0.f39493c;
    }

    public c3(u9.c cVar, c3 c3Var, boolean z10, JSONObject jSONObject) {
        j9.a<List<i7>> aVarW;
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = c3Var == null ? null : c3Var.f39440a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39440a = aVarO;
        j9.a<y9.s> aVar2 = c3Var == null ? null : c3Var.f39441b;
        y9.s.k kVar = y9.s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<y9.s> aVarO2 = h9.e.o(jSONObject, "action", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39441b = aVarO2;
        j9.a<y9.x> aVar3 = c3Var == null ? null : c3Var.f39442c;
        Objects.requireNonNull(y9.x.f43838i);
        j9.a<y9.x> aVarO3 = h9.e.o(jSONObject, "action_animation", z10, aVar3, y9.x.D, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39442c = aVarO3;
        j9.a<List<y9.s>> aVar4 = c3Var == null ? null : c3Var.f39443d;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, aVar4, pVar, f39401b0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39443d = aVarU;
        j9.a<v9.b<y9.t>> aVar5 = c3Var == null ? null : c3Var.f39444e;
        y9.t.b bVar = y9.t.Converter;
        Objects.requireNonNull(bVar);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar5, y9.t.FROM_STRING, eVarA, cVar, V);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f39444e = aVarS;
        j9.a<v9.b<y9.u>> aVar6 = c3Var == null ? null : c3Var.f39445f;
        y9.u.b bVar2 = y9.u.Converter;
        Objects.requireNonNull(bVar2);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar6, y9.u.FROM_STRING, eVarA, cVar, W);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f39445f = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, c3Var == null ? null : c3Var.f39446g, h9.h.f30981d, f39403c0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f39446g = aVarR;
        j9.a<List<y9.f0>> aVar7 = c3Var == null ? null : c3Var.f39447h;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU2 = h9.e.u(jSONObject, "background", z10, aVar7, y9.f0.f39919b, f39409f0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39447h = aVarU2;
        j9.a<y9.l0> aVar8 = c3Var == null ? null : c3Var.f39448i;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO4 = h9.e.o(jSONObject, "border", z10, aVar8, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39448i = aVarO4;
        j9.a<v9.b<Long>> aVar9 = c3Var == null ? null : c3Var.f39449j;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f39411g0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        this.f39449j = h9.e.i(jSONObject, "column_count", z10, aVar9, lVar, mVar, eVarA, cVar, kVar2);
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, c3Var == null ? null : c3Var.f39450k, lVar, f39415i0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39450k = aVarR2;
        j9.a<v9.b<y9.t>> aVar10 = c3Var == null ? null : c3Var.f39451l;
        Objects.requireNonNull(bVar);
        j9.a<v9.b<y9.t>> aVarS3 = h9.e.s(jSONObject, "content_alignment_horizontal", z10, aVar10, y9.t.FROM_STRING, eVarA, cVar, X);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…ENT_ALIGNMENT_HORIZONTAL)");
        this.f39451l = aVarS3;
        j9.a<v9.b<y9.u>> aVar11 = c3Var == null ? null : c3Var.f39452m;
        Objects.requireNonNull(bVar2);
        j9.a<v9.b<y9.u>> aVarS4 = h9.e.s(jSONObject, "content_alignment_vertical", z10, aVar11, y9.u.FROM_STRING, eVarA, cVar, Y);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…NTENT_ALIGNMENT_VERTICAL)");
        this.f39452m = aVarS4;
        j9.a<List<s1>> aVar12 = c3Var == null ? null : c3Var.f39453n;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar12, s1.C, f39421l0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39453n = aVarU3;
        j9.a<List<y9.s>> aVar13 = c3Var == null ? null : c3Var.f39454o;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "doubletap_actions", z10, aVar13, pVar, f39425n0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39454o = aVarU4;
        j9.a<List<a2>> aVar14 = c3Var == null ? null : c3Var.f39455p;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar14, a2.f39002h, f39429p0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39455p = aVarU5;
        j9.a<o2> aVar15 = c3Var == null ? null : c3Var.f39456q;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO5 = h9.e.o(jSONObject, "focus", z10, aVar15, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39456q = aVarO5;
        j9.a<m6> aVar16 = c3Var == null ? null : c3Var.f39457r;
        Objects.requireNonNull(m6.f41448a);
        j9.a<m6> aVarO6 = h9.e.o(jSONObject, "height", z10, aVar16, m6.f41449b, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39457r = aVarO6;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, c3Var == null ? null : c3Var.f39458s, f39430q0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f39458s = aVarL;
        j9.a<List<i7>> aVar17 = c3Var == null ? null : c3Var.f39459t;
        Objects.requireNonNull(i7.f40616a);
        j9.a<List<i7>> aVar18 = aVar17;
        try {
            aVarW = new j9.a.e<>(z10, h9.c.x(jSONObject, "items", i7.f40617b, f39433t0, h9.c.f30971a, eVarA, cVar));
        } catch (u9.f e10) {
            h9.d.s(e10);
            aVarW = h9.e.w(z10, h9.e.v(jSONObject, "items", eVarA, cVar), aVar18);
            if (aVarW == null) {
                throw e10;
            }
        }
        this.f39459t = aVarW;
        j9.a<List<y9.s>> aVar19 = c3Var == null ? null : c3Var.f39460u;
        y9.s.k kVar3 = y9.s.f42386i;
        Objects.requireNonNull(kVar3);
        uc.p<u9.c, JSONObject, y9.s> pVar2 = y9.s.f42400w;
        j9.a<List<y9.s>> aVarU6 = h9.e.u(jSONObject, "longtap_actions", z10, aVar19, pVar2, f39435v0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39460u = aVarU6;
        j9.a<y1> aVar20 = c3Var == null ? null : c3Var.f39461v;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO7 = h9.e.o(jSONObject, "margins", z10, aVar20, pVar3, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39461v = aVarO7;
        j9.a<y1> aVar21 = c3Var == null ? null : c3Var.f39462w;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO8 = h9.e.o(jSONObject, "paddings", z10, aVar21, pVar3, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39462w = aVarO8;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, c3Var == null ? null : c3Var.f39463x, h9.h.f30982e, f39436w0, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39463x = aVarR3;
        j9.a<List<y9.s>> aVar22 = c3Var == null ? null : c3Var.f39464y;
        Objects.requireNonNull(kVar3);
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "selected_actions", z10, aVar22, pVar2, f39439z0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39464y = aVarU7;
        j9.a<List<y7>> aVar23 = c3Var == null ? null : c3Var.f39465z;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU8 = h9.e.u(jSONObject, "tooltips", z10, aVar23, y7.f44555v, B0, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39465z = aVarU8;
        j9.a<a8> aVar24 = c3Var == null ? null : c3Var.A;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO9 = h9.e.o(jSONObject, "transform", z10, aVar24, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO9;
        j9.a<s0> aVar25 = c3Var == null ? null : c3Var.B;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO10 = h9.e.o(jSONObject, "transition_change", z10, aVar25, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO10;
        j9.a<y9.b0> aVar26 = c3Var == null ? null : c3Var.C;
        y9.b0.b bVar3 = y9.b0.f39111a;
        Objects.requireNonNull(bVar3);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO11 = h9.e.o(jSONObject, "transition_in", z10, aVar26, pVar4, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.C = aVarO11;
        j9.a<y9.b0> aVar27 = c3Var == null ? null : c3Var.D;
        Objects.requireNonNull(bVar3);
        j9.a<y9.b0> aVarO12 = h9.e.o(jSONObject, "transition_out", z10, aVar27, pVar4, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO12;
        j9.a<List<c8>> aVar28 = c3Var == null ? null : c3Var.E;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar28, c8.FROM_STRING, D0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.E = aVarT;
        j9.a<v9.b<n8>> aVar29 = c3Var == null ? null : c3Var.F;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS5 = h9.e.s(jSONObject, "visibility", z10, aVar29, n8.FROM_STRING, eVarA, cVar, Z);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.F = aVarS5;
        j9.a<p8> aVar30 = c3Var == null ? null : c3Var.G;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO13 = h9.e.o(jSONObject, "visibility_action", z10, aVar30, pVar5, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.G = aVarO13;
        j9.a<List<p8>> aVar31 = c3Var == null ? null : c3Var.H;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU9 = h9.e.u(jSONObject, "visibility_actions", z10, aVar31, pVar5, F0, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.H = aVarU9;
        j9.a<m6> aVar32 = c3Var == null ? null : c3Var.I;
        Objects.requireNonNull(m6.f41448a);
        j9.a<m6> aVarO14 = h9.e.o(jSONObject, "width", z10, aVar32, m6.f41449b, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.I = aVarO14;
    }

    public /* synthetic */ c3(u9.c cVar, c3 c3Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : c3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f39440a, cVar, "accessibility", jSONObject, G0);
        if (oVar == null) {
            oVar = J;
        }
        y9.o oVar2 = oVar;
        y9.q qVar = (y9.q) y8.c0.K(this.f39441b, cVar, "action", jSONObject, H0);
        y9.v vVar = (y9.v) y8.c0.K(this.f39442c, cVar, "action_animation", jSONObject, I0);
        if (vVar == null) {
            vVar = K;
        }
        y9.v vVar2 = vVar;
        List listL = y8.c0.L(this.f39443d, cVar, "actions", jSONObject, f39399a0, J0);
        v9.b bVar = (v9.b) y8.c0.H(this.f39444e, cVar, "alignment_horizontal", jSONObject, K0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f39445f, cVar, "alignment_vertical", jSONObject, L0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f39446g, cVar, "alpha", jSONObject, M0);
        if (bVar3 == null) {
            bVar3 = L;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL2 = y8.c0.L(this.f39447h, cVar, "background", jSONObject, f39407e0, N0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f39448i, cVar, "border", jSONObject, O0);
        if (k0Var == null) {
            k0Var = M;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.E(this.f39449j, cVar, "column_count", jSONObject, P0);
        v9.b bVar6 = (v9.b) y8.c0.H(this.f39450k, cVar, "column_span", jSONObject, Q0);
        v9.b<y9.t> bVar7 = (v9.b) y8.c0.H(this.f39451l, cVar, "content_alignment_horizontal", jSONObject, R0);
        if (bVar7 == null) {
            bVar7 = N;
        }
        v9.b<y9.t> bVar8 = bVar7;
        v9.b<y9.u> bVar9 = (v9.b) y8.c0.H(this.f39452m, cVar, "content_alignment_vertical", jSONObject, S0);
        if (bVar9 == null) {
            bVar9 = O;
        }
        v9.b<y9.u> bVar10 = bVar9;
        List listL3 = y8.c0.L(this.f39453n, cVar, "disappear_actions", jSONObject, f39419k0, T0);
        List listL4 = y8.c0.L(this.f39454o, cVar, "doubletap_actions", jSONObject, f39423m0, U0);
        List listL5 = y8.c0.L(this.f39455p, cVar, "extensions", jSONObject, f39427o0, V0);
        n2 n2Var = (n2) y8.c0.K(this.f39456q, cVar, "focus", jSONObject, W0);
        l6 l6Var = (l6) y8.c0.K(this.f39457r, cVar, "height", jSONObject, X0);
        if (l6Var == null) {
            l6Var = P;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f39458s, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, Y0);
        List listN = y8.c0.N(this.f39459t, cVar, "items", jSONObject, f39432s0, Z0);
        List listL6 = y8.c0.L(this.f39460u, cVar, "longtap_actions", jSONObject, f39434u0, f39400a1);
        x1 x1Var = (x1) y8.c0.K(this.f39461v, cVar, "margins", jSONObject, f39402b1);
        if (x1Var == null) {
            x1Var = Q;
        }
        x1 x1Var2 = x1Var;
        x1 x1Var3 = (x1) y8.c0.K(this.f39462w, cVar, "paddings", jSONObject, f39404c1);
        if (x1Var3 == null) {
            x1Var3 = R;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar11 = (v9.b) y8.c0.H(this.f39463x, cVar, "row_span", jSONObject, f39406d1);
        List listL7 = y8.c0.L(this.f39464y, cVar, "selected_actions", jSONObject, f39438y0, f39408e1);
        List listL8 = y8.c0.L(this.f39465z, cVar, "tooltips", jSONObject, A0, f39410f1);
        z7 z7Var = (z7) y8.c0.K(this.A, cVar, "transform", jSONObject, f39412g1);
        if (z7Var == null) {
            z7Var = S;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.B, cVar, "transition_change", jSONObject, f39414h1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.C, cVar, "transition_in", jSONObject, f39416i1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.D, cVar, "transition_out", jSONObject, f39418j1);
        List listJ = y8.c0.J(this.E, cVar, "transition_triggers", jSONObject, C0, f39420k1);
        v9.b<n8> bVar12 = (v9.b) y8.c0.H(this.F, cVar, "visibility", jSONObject, f39422l1);
        if (bVar12 == null) {
            bVar12 = T;
        }
        v9.b<n8> bVar13 = bVar12;
        o8 o8Var = (o8) y8.c0.K(this.G, cVar, "visibility_action", jSONObject, f39424m1);
        List listL9 = y8.c0.L(this.H, cVar, "visibility_actions", jSONObject, E0, f39426n1);
        l6 l6Var3 = (l6) y8.c0.K(this.I, cVar, "width", jSONObject, f39428o1);
        if (l6Var3 == null) {
            l6Var3 = U;
        }
        return new a3(oVar2, qVar, vVar2, listL, bVar, bVar2, bVar4, listL2, k0Var2, bVar5, bVar6, bVar8, bVar10, listL3, listL4, listL5, n2Var, l6Var2, str, listN, listL6, x1Var2, x1Var4, bVar11, listL7, listL8, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar13, o8Var, listL9, l6Var3);
    }
}
