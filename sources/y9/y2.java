package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y2 implements u9.a, u9.b<w2> {
    public static final h9.m<String> A0;
    public static final h9.m<String> B0;
    public static final h9.m<Long> C0;
    public static final h9.m<Long> D0;
    public static final h9.g<y9.q> E0;
    public static final h9.g<y9.s> F0;
    public static final h9.g<x7> G0;
    public static final h9.g<y7> H0;
    public static final h9.g<c8> I0;
    public static final h9.g<c8> J0;
    public static final h9.g<o8> K0;
    public static final h9.g<p8> L0;
    public static final uc.q<String, JSONObject, u9.c, y9.o> M0;
    public static final y9.o N;
    public static final uc.q<String, JSONObject, u9.c, y9.q> N0;
    public static final y9.v O;
    public static final uc.q<String, JSONObject, u9.c, y9.v> O0;
    public static final v9.b<Double> P;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> P0;
    public static final y9.k0 Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> Q0;
    public static final v9.b<y9.t> R;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> R0;
    public static final v9.b<y9.u> S;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> S0;
    public static final l6.e T;
    public static final uc.q<String, JSONObject, u9.c, y9.c0> T0;
    public static final x1 U;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> U0;
    public static final x1 V;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> V0;
    public static final v9.b<Integer> W;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> W0;
    public static final v9.b<Boolean> X;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> X0;
    public static final v9.b<h3> Y;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> Y0;
    public static final z7 Z;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<n8> f44229a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f44230a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final l6.d f44231b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<z1>> f44232b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<y9.t> f44233c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, n2> f44234c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<y9.u> f44235d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f44236d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<y9.t> f44237e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f44238e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<y9.u> f44239f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44240f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<h3> f44241g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f44242g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.k<n8> f44243h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f44244h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<y9.q> f44245i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f44246i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<y9.s> f44247j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f44248j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Double> f44249k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f44250k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<Double> f44251l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f44252l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<y9.e0> f44253m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44254m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<y9.f0> f44255n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<h3>> f44256n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f44257o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f44258o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<Long> f44259p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f44260p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<q1> f44261q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f44262q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<s1> f44263r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.r0> f44264r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<y9.q> f44265s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f44266s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<y9.s> f44267t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f44268t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<z1> f44269u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f44270u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<a2> f44271v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f44272v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<String> f44273w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f44274w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<String> f44275x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f44276x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<y9.q> f44277y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f44278y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<y9.s> f44279z0;
    public final j9.a<v9.b<Long>> A;
    public final j9.a<v9.b<h3>> B;
    public final j9.a<List<y9.s>> C;
    public final j9.a<List<y7>> D;
    public final j9.a<a8> E;
    public final j9.a<y9.s0> F;
    public final j9.a<y9.b0> G;
    public final j9.a<y9.b0> H;
    public final j9.a<List<c8>> I;
    public final j9.a<v9.b<n8>> J;
    public final j9.a<p8> K;
    public final j9.a<List<p8>> L;
    public final j9.a<m6> M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f44280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<y9.s> f44281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<y9.x> f44282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<y9.s>> f44283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f44284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f44285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<y9.d0> f44287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f44288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<y9.l0> f44289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f44291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f44292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<List<s1>> f44293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<y9.s>> f44294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<List<a2>> f44295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<o2> f44296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f44297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<m6> f44298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<String> f44299t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<List<y9.s>> f44300u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<y1> f44301v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<y1> f44302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f44303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f44304y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<v9.b<String>> f44305z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44306c = new a();

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
            return oVar == null ? y2.N : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f44307c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, y2.D0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44308c = new b();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, y2.f44245i0, cVar2.a(), cVar2);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<h3>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f44309c = new b0();

        public b0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<h3> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(h3.Converter);
            uc.l lVar = h3.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<h3> bVar = y2.Y;
            v9.b<h3> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y2.f44241g0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44310c = new c();

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
            return vVar == null ? y2.O : vVar;
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f44311c = new c0();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, y2.E0, cVar2.a(), cVar2);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44312c = new d();

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

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f44313c = new d0();

        public d0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, y2.G0, cVar2.a(), cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44314c = new e();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, y2.f44233c0);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f44315c = new e0();

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
            return z7Var == null ? y2.Z : z7Var;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44316c = new f();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, y2.f44235d0);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f44317c = new f0();

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

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f44318c = new g();

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
            h9.m<Double> mVar = y2.f44251l0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = y2.P;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f44319c = new g0();

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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, y9.c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f44320c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public y9.c0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.c0.f39344b);
            return (y9.c0) h9.c.n(jSONObject2, str2, y9.c0.f39346d, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f44321c = new h0();

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

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f44322c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public List<y9.e0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.e0.f39726a);
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, y2.f44253m0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f44323c = new i0();

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
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, y2.I0, cVar2.a(), cVar2);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f44324c = new j();

        public j() {
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
            return k0Var == null ? y2.Q : k0Var;
        }
    }

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f44325c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f44326c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, y2.f44259p0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class k0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f44327c = new k0();

        public k0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f44328c = new l();

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
            v9.b<y9.t> bVar = y2.R;
            v9.b<y9.t> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y2.f44237e0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class l0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f44329c = new l0();

        public l0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f44330c = new m();

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
            v9.b<y9.u> bVar = y2.S;
            v9.b<y9.u> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y2.f44239f0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f44331c = new m0();

        public m0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f44332c = new n();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, y2.f44261q0, cVar2.a(), cVar2);
        }
    }

    public static final class n0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f44333c = new n0();

        public n0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h3);
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f44334c = new o();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, y2.f44265s0, cVar2.a(), cVar2);
        }
    }

    public static final class o0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f44335c = new o0();

        public o0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f44336c = new p();

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
            return h9.c.w(jSONObject2, str2, z1.f44584e, y2.f44269u0, cVar2.a(), cVar2);
        }
    }

    public static final class p0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f44337c = new p0();

        public p0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, y2.K0, cVar2.a(), cVar2);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f44338c = new q();

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

    public static final class q0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f44339c = new q0();

        public q0() {
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

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f44340c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Uri> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30979b, cVar2.a(), cVar2, h9.l.f31001e);
        }
    }

    public static final class r0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f44341c = new r0();

        public r0() {
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
            v9.b<n8> bVar = y2.f44229a0;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y2.f44243h0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f44342c = new s();

        public s() {
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
            return l6Var == null ? y2.T : l6Var;
        }
    }

    public static final class s0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s0 f44343c = new s0();

        public s0() {
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
            return l6Var == null ? y2.f44231b0 : l6Var;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f44344c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, y2.f44275x0, cVar2.a());
        }
    }

    public static final class t0 {
        public t0() {
        }

        public t0(vc.g gVar) {
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f44345c = new u();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, y2.f44277y0, cVar2.a(), cVar2);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f44346c = new v();

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
            return x1Var == null ? y2.U : x1Var;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f44347c = new w();

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
            return x1Var == null ? y2.V : x1Var;
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f44348c = new x();

        public x() {
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
            v9.b<Integer> bVar = y2.W;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f44349c = new y();

        public y() {
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
            v9.b<Boolean> bVar = y2.X;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f44350c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, y2.B0, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    static {
        new t0(null);
        N = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(y9.v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        O = new y9.v(bVarA, bVarA2, null, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        P = aVar.a(dValueOf);
        Q = new y9.k0(null, null, null, null, null, 31, null);
        R = aVar.a(y9.t.CENTER);
        S = aVar.a(y9.u.CENTER);
        T = new l6.e(new q8(null, null, null, 7, null));
        U = new x1(null, null, null, null, null, 31, null);
        V = new x1(null, null, null, null, null, 31, null);
        W = aVar.a(335544320);
        X = aVar.a(Boolean.FALSE);
        Y = aVar.a(h3.FILL);
        Z = new z7(null, null, null, 7, null);
        f44229a0 = aVar.a(n8.VISIBLE);
        f44231b0 = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        j0 j0Var = j0.f44325c;
        fd.j0.i(objQ, "default");
        fd.j0.i(j0Var, "validator");
        f44233c0 = new h9.k.a.C0302a(objQ, j0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        k0 k0Var = k0.f44327c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(k0Var, "validator");
        f44235d0 = new h9.k.a.C0302a(objQ2, k0Var);
        Object objQ3 = kc.j.q(y9.t.values());
        l0 l0Var = l0.f44329c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(l0Var, "validator");
        f44237e0 = new h9.k.a.C0302a(objQ3, l0Var);
        Object objQ4 = kc.j.q(y9.u.values());
        m0 m0Var = m0.f44331c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(m0Var, "validator");
        f44239f0 = new h9.k.a.C0302a(objQ4, m0Var);
        Object objQ5 = kc.j.q(h3.values());
        n0 n0Var = n0.f44333c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(n0Var, "validator");
        f44241g0 = new h9.k.a.C0302a(objQ5, n0Var);
        Object objQ6 = kc.j.q(n8.values());
        o0 o0Var = o0.f44335c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(o0Var, "validator");
        f44243h0 = new h9.k.a.C0302a(objQ6, o0Var);
        f44245i0 = v2.f43431h;
        f44247j0 = x2.f44041f;
        f44249k0 = v2.f43442s;
        f44251l0 = x2.f44047l;
        f44253m0 = v2.f43443t;
        f44255n0 = x2.f44048m;
        f44257o0 = v2.f43444u;
        f44259p0 = x2.f44049n;
        f44261q0 = v2.f43445v;
        f44263r0 = x2.f44050o;
        f44265s0 = s2.f42497z;
        f44267t0 = v2.f43432i;
        f44269u0 = s2.A;
        f44271v0 = v2.f43433j;
        f44273w0 = s2.B;
        f44275x0 = v2.f43434k;
        f44277y0 = x2.f44039d;
        f44279z0 = v2.f43435l;
        A0 = x2.f44040e;
        B0 = v2.f43436m;
        C0 = v2.f43437n;
        D0 = x2.f44042g;
        E0 = v2.f43438o;
        F0 = x2.f44043h;
        G0 = v2.f43439p;
        H0 = x2.f44044i;
        I0 = v2.f43440q;
        J0 = x2.f44045j;
        K0 = v2.f43441r;
        L0 = x2.f44046k;
        M0 = a.f44306c;
        N0 = d.f44312c;
        O0 = c.f44310c;
        P0 = b.f44308c;
        Q0 = e.f44314c;
        R0 = f.f44316c;
        S0 = g.f44318c;
        T0 = h.f44320c;
        U0 = i.f44322c;
        V0 = j.f44324c;
        W0 = k.f44326c;
        X0 = l.f44328c;
        Y0 = m.f44330c;
        Z0 = n.f44332c;
        f44230a1 = o.f44334c;
        f44232b1 = p.f44336c;
        f44234c1 = q.f44338c;
        f44236d1 = r.f44340c;
        f44238e1 = s.f44342c;
        f44240f1 = t.f44344c;
        f44242g1 = u.f44345c;
        f44244h1 = v.f44346c;
        f44246i1 = w.f44347c;
        f44248j1 = x.f44348c;
        f44250k1 = y.f44349c;
        f44252l1 = z.f44350c;
        f44254m1 = a0.f44307c;
        f44256n1 = b0.f44309c;
        f44258o1 = c0.f44311c;
        f44260p1 = d0.f44313c;
        f44262q1 = e0.f44315c;
        f44264r1 = f0.f44317c;
        f44266s1 = g0.f44319c;
        f44268t1 = h0.f44321c;
        f44270u1 = i0.f44323c;
        f44272v1 = r0.f44341c;
        f44274w1 = q0.f44339c;
        f44276x1 = p0.f44337c;
        f44278y1 = s0.f44343c;
    }

    public y2(u9.c cVar, y2 y2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = y2Var == null ? null : y2Var.f44280a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44280a = aVarO;
        j9.a<y9.s> aVar2 = y2Var == null ? null : y2Var.f44281b;
        y9.s.k kVar = y9.s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<y9.s> aVarO2 = h9.e.o(jSONObject, "action", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44281b = aVarO2;
        j9.a<y9.x> aVar3 = y2Var == null ? null : y2Var.f44282c;
        Objects.requireNonNull(y9.x.f43838i);
        j9.a<y9.x> aVarO3 = h9.e.o(jSONObject, "action_animation", z10, aVar3, y9.x.D, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44282c = aVarO3;
        j9.a<List<y9.s>> aVar4 = y2Var == null ? null : y2Var.f44283d;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, aVar4, pVar, f44247j0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44283d = aVarU;
        j9.a<v9.b<y9.t>> aVar5 = y2Var == null ? null : y2Var.f44284e;
        y9.t.b bVar = y9.t.Converter;
        Objects.requireNonNull(bVar);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar5, y9.t.FROM_STRING, eVarA, cVar, f44233c0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f44284e = aVarS;
        j9.a<v9.b<y9.u>> aVar6 = y2Var == null ? null : y2Var.f44285f;
        y9.u.b bVar2 = y9.u.Converter;
        Objects.requireNonNull(bVar2);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar6, y9.u.FROM_STRING, eVarA, cVar, f44235d0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f44285f = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, y2Var == null ? null : y2Var.f44286g, h9.h.f30981d, f44249k0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44286g = aVarR;
        j9.a<y9.d0> aVar7 = y2Var == null ? null : y2Var.f44287h;
        Objects.requireNonNull(y9.d0.f39549b);
        j9.a<y9.d0> aVarO4 = h9.e.o(jSONObject, "aspect", z10, aVar7, y9.d0.f39553f, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44287h = aVarO4;
        j9.a<List<y9.f0>> aVar8 = y2Var == null ? null : y2Var.f44288i;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU2 = h9.e.u(jSONObject, "background", z10, aVar8, y9.f0.f39919b, f44255n0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44288i = aVarU2;
        j9.a<y9.l0> aVar9 = y2Var == null ? null : y2Var.f44289j;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO5 = h9.e.o(jSONObject, "border", z10, aVar9, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44289j = aVarO5;
        j9.a<v9.b<Long>> aVar10 = y2Var == null ? null : y2Var.f44290k;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f44257o0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar10, lVar, mVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44290k = aVarR2;
        j9.a<v9.b<y9.t>> aVar11 = y2Var == null ? null : y2Var.f44291l;
        Objects.requireNonNull(bVar);
        j9.a<v9.b<y9.t>> aVarS3 = h9.e.s(jSONObject, "content_alignment_horizontal", z10, aVar11, y9.t.FROM_STRING, eVarA, cVar, f44237e0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…ENT_ALIGNMENT_HORIZONTAL)");
        this.f44291l = aVarS3;
        j9.a<v9.b<y9.u>> aVar12 = y2Var == null ? null : y2Var.f44292m;
        Objects.requireNonNull(bVar2);
        j9.a<v9.b<y9.u>> aVarS4 = h9.e.s(jSONObject, "content_alignment_vertical", z10, aVar12, y9.u.FROM_STRING, eVarA, cVar, f44239f0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…NTENT_ALIGNMENT_VERTICAL)");
        this.f44292m = aVarS4;
        j9.a<List<s1>> aVar13 = y2Var == null ? null : y2Var.f44293n;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar13, s1.C, f44263r0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44293n = aVarU3;
        j9.a<List<y9.s>> aVar14 = y2Var == null ? null : y2Var.f44294o;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "doubletap_actions", z10, aVar14, pVar, f44267t0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44294o = aVarU4;
        j9.a<List<a2>> aVar15 = y2Var == null ? null : y2Var.f44295p;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar15, a2.f39002h, f44271v0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44295p = aVarU5;
        j9.a<o2> aVar16 = y2Var == null ? null : y2Var.f44296q;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO6 = h9.e.o(jSONObject, "focus", z10, aVar16, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44296q = aVarO6;
        this.f44297r = h9.e.j(jSONObject, "gif_url", z10, y2Var == null ? null : y2Var.f44297r, h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
        j9.a<m6> aVar17 = y2Var == null ? null : y2Var.f44298s;
        m6.b bVar3 = m6.f41448a;
        Objects.requireNonNull(bVar3);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO7 = h9.e.o(jSONObject, "height", z10, aVar17, pVar2, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44298s = aVarO7;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, y2Var == null ? null : y2Var.f44299t, f44273w0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f44299t = aVarL;
        j9.a<List<y9.s>> aVar18 = y2Var == null ? null : y2Var.f44300u;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU6 = h9.e.u(jSONObject, "longtap_actions", z10, aVar18, pVar, f44279z0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44300u = aVarU6;
        j9.a<y1> aVar19 = y2Var == null ? null : y2Var.f44301v;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO8 = h9.e.o(jSONObject, "margins", z10, aVar19, pVar3, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44301v = aVarO8;
        j9.a<y1> aVar20 = y2Var == null ? null : y2Var.f44302w;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "paddings", z10, aVar20, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44302w = aVarO9;
        j9.a<v9.b<Integer>> aVarS5 = h9.e.s(jSONObject, "placeholder_color", z10, y2Var == null ? null : y2Var.f44303x, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f44303x = aVarS5;
        j9.a<v9.b<Boolean>> aVarS6 = h9.e.s(jSONObject, "preload_required", z10, y2Var == null ? null : y2Var.f44304y, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f44304y = aVarS6;
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "preview", z10, y2Var == null ? null : y2Var.f44305z, A0, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f44305z = aVarP;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, y2Var == null ? null : y2Var.A, lVar, C0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.A = aVarR3;
        j9.a<v9.b<h3>> aVar21 = y2Var == null ? null : y2Var.B;
        Objects.requireNonNull(h3.Converter);
        j9.a<v9.b<h3>> aVarS7 = h9.e.s(jSONObject, "scale", z10, aVar21, h3.FROM_STRING, eVarA, cVar, f44241g0);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp…, env, TYPE_HELPER_SCALE)");
        this.B = aVarS7;
        j9.a<List<y9.s>> aVar22 = y2Var == null ? null : y2Var.C;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "selected_actions", z10, aVar22, pVar, F0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.C = aVarU7;
        j9.a<List<y7>> aVar23 = y2Var == null ? null : y2Var.D;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU8 = h9.e.u(jSONObject, "tooltips", z10, aVar23, y7.f44555v, H0, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.D = aVarU8;
        j9.a<a8> aVar24 = y2Var == null ? null : y2Var.E;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO10 = h9.e.o(jSONObject, "transform", z10, aVar24, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO10;
        j9.a<y9.s0> aVar25 = y2Var == null ? null : y2Var.F;
        Objects.requireNonNull(y9.s0.f42435a);
        j9.a<y9.s0> aVarO11 = h9.e.o(jSONObject, "transition_change", z10, aVar25, y9.s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO11;
        j9.a<y9.b0> aVar26 = y2Var == null ? null : y2Var.G;
        y9.b0.b bVar4 = y9.b0.f39111a;
        Objects.requireNonNull(bVar4);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO12 = h9.e.o(jSONObject, "transition_in", z10, aVar26, pVar4, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.G = aVarO12;
        j9.a<y9.b0> aVar27 = y2Var == null ? null : y2Var.H;
        Objects.requireNonNull(bVar4);
        j9.a<y9.b0> aVarO13 = h9.e.o(jSONObject, "transition_out", z10, aVar27, pVar4, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.H = aVarO13;
        j9.a<List<c8>> aVar28 = y2Var == null ? null : y2Var.I;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar28, c8.FROM_STRING, J0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.I = aVarT;
        j9.a<v9.b<n8>> aVar29 = y2Var == null ? null : y2Var.J;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS8 = h9.e.s(jSONObject, "visibility", z10, aVar29, n8.FROM_STRING, eVarA, cVar, f44243h0);
        fd.j0.h(aVarS8, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.J = aVarS8;
        j9.a<p8> aVar30 = y2Var == null ? null : y2Var.K;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO14 = h9.e.o(jSONObject, "visibility_action", z10, aVar30, pVar5, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.K = aVarO14;
        j9.a<List<p8>> aVar31 = y2Var == null ? null : y2Var.L;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU9 = h9.e.u(jSONObject, "visibility_actions", z10, aVar31, pVar5, L0, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.L = aVarU9;
        j9.a<m6> aVar32 = y2Var == null ? null : y2Var.M;
        Objects.requireNonNull(bVar3);
        j9.a<m6> aVarO15 = h9.e.o(jSONObject, "width", z10, aVar32, pVar2, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.M = aVarO15;
    }

    public /* synthetic */ y2(u9.c cVar, y2 y2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : y2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f44280a, cVar, "accessibility", jSONObject, M0);
        if (oVar == null) {
            oVar = N;
        }
        y9.o oVar2 = oVar;
        y9.q qVar = (y9.q) y8.c0.K(this.f44281b, cVar, "action", jSONObject, N0);
        y9.v vVar = (y9.v) y8.c0.K(this.f44282c, cVar, "action_animation", jSONObject, O0);
        if (vVar == null) {
            vVar = O;
        }
        y9.v vVar2 = vVar;
        List listL = y8.c0.L(this.f44283d, cVar, "actions", jSONObject, f44245i0, P0);
        v9.b bVar = (v9.b) y8.c0.H(this.f44284e, cVar, "alignment_horizontal", jSONObject, Q0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f44285f, cVar, "alignment_vertical", jSONObject, R0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f44286g, cVar, "alpha", jSONObject, S0);
        if (bVar3 == null) {
            bVar3 = P;
        }
        v9.b<Double> bVar4 = bVar3;
        y9.c0 c0Var = (y9.c0) y8.c0.K(this.f44287h, cVar, "aspect", jSONObject, T0);
        List listL2 = y8.c0.L(this.f44288i, cVar, "background", jSONObject, f44253m0, U0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f44289j, cVar, "border", jSONObject, V0);
        if (k0Var == null) {
            k0Var = Q;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f44290k, cVar, "column_span", jSONObject, W0);
        v9.b<y9.t> bVar6 = (v9.b) y8.c0.H(this.f44291l, cVar, "content_alignment_horizontal", jSONObject, X0);
        if (bVar6 == null) {
            bVar6 = R;
        }
        v9.b<y9.t> bVar7 = bVar6;
        v9.b<y9.u> bVar8 = (v9.b) y8.c0.H(this.f44292m, cVar, "content_alignment_vertical", jSONObject, Y0);
        if (bVar8 == null) {
            bVar8 = S;
        }
        v9.b<y9.u> bVar9 = bVar8;
        List listL3 = y8.c0.L(this.f44293n, cVar, "disappear_actions", jSONObject, f44261q0, Z0);
        List listL4 = y8.c0.L(this.f44294o, cVar, "doubletap_actions", jSONObject, f44265s0, f44230a1);
        List listL5 = y8.c0.L(this.f44295p, cVar, "extensions", jSONObject, f44269u0, f44232b1);
        n2 n2Var = (n2) y8.c0.K(this.f44296q, cVar, "focus", jSONObject, f44234c1);
        v9.b bVar10 = (v9.b) y8.c0.E(this.f44297r, cVar, "gif_url", jSONObject, f44236d1);
        l6 l6Var = (l6) y8.c0.K(this.f44298s, cVar, "height", jSONObject, f44238e1);
        if (l6Var == null) {
            l6Var = T;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f44299t, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f44240f1);
        List listL6 = y8.c0.L(this.f44300u, cVar, "longtap_actions", jSONObject, f44277y0, f44242g1);
        x1 x1Var = (x1) y8.c0.K(this.f44301v, cVar, "margins", jSONObject, f44244h1);
        if (x1Var == null) {
            x1Var = U;
        }
        x1 x1Var2 = x1Var;
        x1 x1Var3 = (x1) y8.c0.K(this.f44302w, cVar, "paddings", jSONObject, f44246i1);
        if (x1Var3 == null) {
            x1Var3 = V;
        }
        x1 x1Var4 = x1Var3;
        v9.b<Integer> bVar11 = (v9.b) y8.c0.H(this.f44303x, cVar, "placeholder_color", jSONObject, f44248j1);
        if (bVar11 == null) {
            bVar11 = W;
        }
        v9.b<Integer> bVar12 = bVar11;
        v9.b<Boolean> bVar13 = (v9.b) y8.c0.H(this.f44304y, cVar, "preload_required", jSONObject, f44250k1);
        if (bVar13 == null) {
            bVar13 = X;
        }
        v9.b<Boolean> bVar14 = bVar13;
        v9.b bVar15 = (v9.b) y8.c0.H(this.f44305z, cVar, "preview", jSONObject, f44252l1);
        v9.b bVar16 = (v9.b) y8.c0.H(this.A, cVar, "row_span", jSONObject, f44254m1);
        v9.b<h3> bVar17 = (v9.b) y8.c0.H(this.B, cVar, "scale", jSONObject, f44256n1);
        if (bVar17 == null) {
            bVar17 = Y;
        }
        v9.b<h3> bVar18 = bVar17;
        List listL7 = y8.c0.L(this.C, cVar, "selected_actions", jSONObject, E0, f44258o1);
        List listL8 = y8.c0.L(this.D, cVar, "tooltips", jSONObject, G0, f44260p1);
        z7 z7Var = (z7) y8.c0.K(this.E, cVar, "transform", jSONObject, f44262q1);
        if (z7Var == null) {
            z7Var = Z;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.F, cVar, "transition_change", jSONObject, f44264r1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.G, cVar, "transition_in", jSONObject, f44266s1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.H, cVar, "transition_out", jSONObject, f44268t1);
        List listJ = y8.c0.J(this.I, cVar, "transition_triggers", jSONObject, I0, f44270u1);
        v9.b<n8> bVar19 = (v9.b) y8.c0.H(this.J, cVar, "visibility", jSONObject, f44272v1);
        if (bVar19 == null) {
            bVar19 = f44229a0;
        }
        v9.b<n8> bVar20 = bVar19;
        o8 o8Var = (o8) y8.c0.K(this.K, cVar, "visibility_action", jSONObject, f44274w1);
        List listL9 = y8.c0.L(this.L, cVar, "visibility_actions", jSONObject, K0, f44276x1);
        l6 l6Var3 = (l6) y8.c0.K(this.M, cVar, "width", jSONObject, f44278y1);
        if (l6Var3 == null) {
            l6Var3 = f44231b0;
        }
        return new w2(oVar2, qVar, vVar2, listL, bVar, bVar2, bVar4, c0Var, listL2, k0Var2, bVar5, bVar7, bVar9, listL3, listL4, listL5, n2Var, bVar10, l6Var2, str, listL6, x1Var2, x1Var4, bVar12, bVar14, bVar15, bVar16, bVar18, listL7, listL8, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar20, o8Var, listL9, l6Var3);
    }
}
