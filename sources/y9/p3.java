package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p3 implements u9.a, u9.b<k3> {
    public static final h9.g<x7> A0;
    public static final h9.g<y7> B0;
    public static final h9.g<c8> C0;
    public static final h9.g<c8> D0;
    public static final h9.g<o8> E0;
    public static final h9.g<p8> F0;
    public static final uc.q<String, JSONObject, u9.c, y9.o> G0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> H0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> I0;
    public static final uc.q<String, JSONObject, u9.c, t5> J0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> K0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> L0;
    public static final y9.o M;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> M0;
    public static final v9.b<Integer> N;
    public static final uc.q<String, JSONObject, u9.c, v9.b<k3.a>> N0;
    public static final v9.b<Double> O;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> O0;
    public static final v9.b<Double> P;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> P0;
    public static final v9.b<k3.a> Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Q0;
    public static final y9.k0 R;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> R0;
    public static final l6.e S;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> S0;
    public static final v9.b<Integer> T;
    public static final uc.q<String, JSONObject, u9.c, n2> T0;
    public static final x1 U;
    public static final uc.q<String, JSONObject, u9.c, l6> U0;
    public static final v9.b<Double> V;
    public static final uc.q<String, JSONObject, u9.c, String> V0;
    public static final x1 W;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> W0;
    public static final h6.d X;
    public static final uc.q<String, JSONObject, u9.c, t5> X0;
    public static final l2 Y;
    public static final uc.q<String, JSONObject, u9.c, t5> Y0;
    public static final z7 Z;
    public static final uc.q<String, JSONObject, u9.c, l3> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<n8> f41910a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f41911a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final l6.d f41912b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f41913b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<y9.t> f41914c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f41915c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<y9.u> f41916d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f41917d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<k3.a> f41918e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41919e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<n8> f41920f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f41921f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.m<Double> f41922g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, h6> f41923g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Double> f41924h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f41925h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Double> f41926i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f41927i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<Double> f41928j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f41929j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<y9.e0> f41930k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, r0> f41931k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<y9.f0> f41932l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f41933l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f41934m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f41935m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<Long> f41936n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f41937n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<q1> f41938o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f41939o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<s1> f41940p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f41941p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<z1> f41942q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f41943q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<a2> f41944r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f41945r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<String> f41946s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<String> f41947t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<Double> f41948u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.m<Double> f41949v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<Long> f41950w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<Long> f41951x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<y9.q> f41952y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<y9.s> f41953z0;
    public final j9.a<k6> A;
    public final j9.a<m2> B;
    public final j9.a<List<y7>> C;
    public final j9.a<a8> D;
    public final j9.a<s0> E;
    public final j9.a<y9.b0> F;
    public final j9.a<y9.b0> G;
    public final j9.a<List<c8>> H;
    public final j9.a<v9.b<n8>> I;
    public final j9.a<p8> J;
    public final j9.a<List<p8>> K;
    public final j9.a<m6> L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f41954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f41955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f41956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<u5> f41957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f41958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f41959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f41960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<k3.a>> f41961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f41962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<y9.l0> f41963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<List<s1>> f41965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<List<a2>> f41966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<o2> f41967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<m6> f41968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<String> f41969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f41970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<u5> f41971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<u5> f41972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<m3> f41973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<y1> f41974u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f41975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<y1> f41976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<String> f41977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<List<y9.s>> f41979z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41980c = new a();

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
            return oVar == null ? p3.M : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, h6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f41981c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public h6 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(h6.f40289a);
            h6 h6Var = (h6) h9.c.n(jSONObject2, str2, h6.f40290b, cVar2.a(), cVar2);
            return h6Var == null ? p3.X : h6Var;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41982c = new b();

        public b() {
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
            v9.b<Integer> bVar = p3.N;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f41983c = new b0();

        public b0() {
            super(3);
        }

        @Override // uc.q
        public l2 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject2, str2, l2.f41214g, cVar2.a(), cVar2);
            return l2Var == null ? p3.Y : l2Var;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41984c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = p3.f41924h0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = p3.O;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f41985c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, p3.A0, cVar2.a(), cVar2);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, t5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41986c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public t5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t5.f42752f);
            return (t5) h9.c.n(jSONObject2, str2, t5.f42756j, cVar2.a(), cVar2);
        }
    }

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f41987c = new d0();

        public d0() {
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
            return z7Var == null ? p3.Z : z7Var;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41988c = new e();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, p3.f41914c0);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f41989c = new e0();

        public e0() {
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

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f41990c = new f();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, p3.f41916d0);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f41991c = new f0();

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

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f41992c = new g();

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
            h9.m<Double> mVar = p3.f41928j0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = p3.P;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f41993c = new g0();

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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<k3.a>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f41994c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<k3.a> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(k3.a.Converter);
            uc.l lVar = k3.a.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<k3.a> bVar = p3.Q;
            v9.b<k3.a> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p3.f41918e0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f41995c = new h0();

        public h0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, p3.C0, cVar2.a(), cVar2);
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f41996c = new i();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, p3.f41930k0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f41997c = new i0();

        public i0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f41998c = new j();

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
            return k0Var == null ? p3.R : k0Var;
        }
    }

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f41999c = new j0();

        public j0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f42000c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, p3.f41936n0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class k0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f42001c = new k0();

        public k0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof k3.a);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f42002c = new l();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, p3.f41938o0, cVar2.a(), cVar2);
        }
    }

    public static final class l0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f42003c = new l0();

        public l0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f42004c = new m();

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
            return h9.c.w(jSONObject2, str2, z1.f44584e, p3.f41942q0, cVar2.a(), cVar2);
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f42005c = new m0();

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
            return h9.c.w(jSONObject2, str2, o8.f41853q, p3.E0, cVar2.a(), cVar2);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f42006c = new n();

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

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f42007c = new n0();

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

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f42008c = new o();

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
            return l6Var == null ? p3.S : l6Var;
        }
    }

    public static final class o0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f42009c = new o0();

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
            v9.b<n8> bVar = p3.f41910a0;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p3.f41920f0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f42010c = new p();

        public p() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, p3.f41947t0, cVar2.a());
        }
    }

    public static final class p0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f42011c = new p0();

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
            return l6Var == null ? p3.f41912b0 : l6Var;
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f42012c = new q();

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
            v9.b<Integer> bVar = p3.T;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class q0 {
        public q0() {
        }

        public q0(vc.g gVar) {
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, t5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f42013c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public t5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t5.f42752f);
            return (t5) h9.c.n(jSONObject2, str2, t5.f42756j, cVar2.a(), cVar2);
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, t5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f42014c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public t5 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t5.f42752f);
            return (t5) h9.c.n(jSONObject2, str2, t5.f42756j, cVar2.a(), cVar2);
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, l3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f42015c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public l3 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l3.f41219a);
            return (l3) h9.c.n(jSONObject2, str2, l3.f41220b, cVar2.a(), cVar2);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f42016c = new u();

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
            return x1Var == null ? p3.U : x1Var;
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f42017c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = p3.f41949v0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = p3.V;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f42018c = new w();

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
            return x1Var == null ? p3.W : x1Var;
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f42019c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env"));
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f42020c = new y();

        public y() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, p3.f41951x0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f42021c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, p3.f41952y0, cVar2.a(), cVar2);
        }
    }

    static {
        new q0(null);
        M = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        N = aVar.a(16768096);
        O = aVar.a(Double.valueOf(1.3d));
        P = aVar.a(Double.valueOf(1.0d));
        Q = aVar.a(k3.a.SCALE);
        R = new y9.k0(null, null, null, null, null, 31, null);
        S = new l6.e(new q8(null, null, null, 7, null));
        T = aVar.a(865180853);
        U = new x1(null, null, null, null, null, 31, null);
        V = aVar.a(Double.valueOf(0.5d));
        W = new x1(null, null, null, null, null, 31, null);
        X = new h6.d(new t5(null, null, null, null, null, 31, null));
        Y = new l2(null, aVar.a(15L), 1, null);
        Z = new z7(null, null, null, 7, null);
        f41910a0 = aVar.a(n8.VISIBLE);
        f41912b0 = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        i0 i0Var = i0.f41997c;
        fd.j0.i(objQ, "default");
        fd.j0.i(i0Var, "validator");
        f41914c0 = new h9.k.a.C0302a(objQ, i0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        j0 j0Var = j0.f41999c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(j0Var, "validator");
        f41916d0 = new h9.k.a.C0302a(objQ2, j0Var);
        Object objQ3 = kc.j.q(k3.a.values());
        k0 k0Var = k0.f42001c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(k0Var, "validator");
        f41918e0 = new h9.k.a.C0302a(objQ3, k0Var);
        Object objQ4 = kc.j.q(n8.values());
        l0 l0Var = l0.f42003c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(l0Var, "validator");
        f41920f0 = new h9.k.a.C0302a(objQ4, l0Var);
        f41922g0 = f3.C;
        f41924h0 = i3.f40598v;
        f41926i0 = o3.f41801i;
        f41928j0 = i3.f40602z;
        f41930k0 = o3.f41802j;
        f41932l0 = i3.A;
        f41934m0 = o3.f41803k;
        f41936n0 = i3.B;
        f41938o0 = o3.f41804l;
        f41940p0 = n3.f41657d;
        f41942q0 = i3.f40593q;
        f41944r0 = f3.D;
        f41946s0 = i3.f40594r;
        f41947t0 = f3.E;
        f41948u0 = i3.f40595s;
        f41949v0 = f3.F;
        f41950w0 = i3.f40596t;
        f41951x0 = o3.f41796d;
        f41952y0 = i3.f40597u;
        f41953z0 = o3.f41797e;
        A0 = o3.f41798f;
        B0 = i3.f40599w;
        C0 = o3.f41799g;
        D0 = i3.f40600x;
        E0 = o3.f41800h;
        F0 = i3.f40601y;
        G0 = a.f41980c;
        H0 = b.f41982c;
        I0 = c.f41984c;
        J0 = d.f41986c;
        K0 = e.f41988c;
        L0 = f.f41990c;
        M0 = g.f41992c;
        N0 = h.f41994c;
        O0 = i.f41996c;
        P0 = j.f41998c;
        Q0 = k.f42000c;
        R0 = l.f42002c;
        S0 = m.f42004c;
        T0 = n.f42006c;
        U0 = o.f42008c;
        V0 = p.f42010c;
        W0 = q.f42012c;
        X0 = r.f42013c;
        Y0 = s.f42014c;
        Z0 = t.f42015c;
        f41911a1 = u.f42016c;
        f41913b1 = v.f42017c;
        f41915c1 = w.f42018c;
        f41917d1 = x.f42019c;
        f41919e1 = y.f42020c;
        f41921f1 = z.f42021c;
        f41923g1 = a0.f41981c;
        f41925h1 = b0.f41983c;
        f41927i1 = c0.f41985c;
        f41929j1 = d0.f41987c;
        f41931k1 = e0.f41989c;
        f41933l1 = f0.f41991c;
        f41935m1 = g0.f41993c;
        f41937n1 = h0.f41995c;
        f41939o1 = o0.f42009c;
        f41941p1 = n0.f42007c;
        f41943q1 = m0.f42005c;
        f41945r1 = p0.f42011c;
    }

    public p3(u9.c cVar, p3 p3Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = p3Var == null ? null : p3Var.f41954a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41954a = aVarO;
        j9.a<v9.b<Integer>> aVar2 = p3Var == null ? null : p3Var.f41955b;
        uc.l<Object, Integer> lVar = h9.h.f30978a;
        h9.k<Integer> kVar = h9.l.f31002f;
        j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "active_item_color", z10, aVar2, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f41955b = aVarS;
        j9.a<v9.b<Double>> aVar3 = p3Var == null ? null : p3Var.f41956c;
        uc.l<Number, Double> lVar2 = h9.h.f30981d;
        h9.m<Double> mVar = f41922g0;
        h9.k<Double> kVar2 = h9.l.f31000d;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "active_item_size", z10, aVar3, lVar2, mVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f41956c = aVarR;
        j9.a<u5> aVar4 = p3Var == null ? null : p3Var.f41957d;
        Objects.requireNonNull(u5.f43091f);
        uc.p<u9.c, JSONObject, u5> pVar = u5.f43100o;
        j9.a<u5> aVarO2 = h9.e.o(jSONObject, "active_shape", z10, aVar4, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41957d = aVarO2;
        j9.a<v9.b<y9.t>> aVar5 = p3Var == null ? null : p3Var.f41958e;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS2 = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar5, y9.t.FROM_STRING, eVarA, cVar, f41914c0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f41958e = aVarS2;
        j9.a<v9.b<y9.u>> aVar6 = p3Var == null ? null : p3Var.f41959f;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS3 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar6, y9.u.FROM_STRING, eVarA, cVar, f41916d0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f41959f = aVarS3;
        j9.a<v9.b<Double>> aVarR2 = h9.e.r(jSONObject, "alpha", z10, p3Var == null ? null : p3Var.f41960g, lVar2, f41926i0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f41960g = aVarR2;
        j9.a<v9.b<k3.a>> aVar7 = p3Var == null ? null : p3Var.f41961h;
        Objects.requireNonNull(k3.a.Converter);
        j9.a<v9.b<k3.a>> aVarS4 = h9.e.s(jSONObject, "animation", z10, aVar7, k3.a.FROM_STRING, eVarA, cVar, f41918e0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…v, TYPE_HELPER_ANIMATION)");
        this.f41961h = aVarS4;
        j9.a<List<y9.f0>> aVar8 = p3Var == null ? null : p3Var.f41962i;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar8, y9.f0.f39919b, f41932l0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41962i = aVarU;
        j9.a<y9.l0> aVar9 = p3Var == null ? null : p3Var.f41963j;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO3 = h9.e.o(jSONObject, "border", z10, aVar9, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41963j = aVarO3;
        j9.a<v9.b<Long>> aVar10 = p3Var == null ? null : p3Var.f41964k;
        uc.l<Number, Long> lVar3 = h9.h.f30982e;
        h9.m<Long> mVar2 = f41934m0;
        h9.k<Long> kVar3 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "column_span", z10, aVar10, lVar3, mVar2, eVarA, cVar, kVar3);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41964k = aVarR3;
        j9.a<List<s1>> aVar11 = p3Var == null ? null : p3Var.f41965l;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar11, s1.C, f41940p0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41965l = aVarU2;
        j9.a<List<a2>> aVar12 = p3Var == null ? null : p3Var.f41966m;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar12, a2.f39002h, f41944r0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41966m = aVarU3;
        j9.a<o2> aVar13 = p3Var == null ? null : p3Var.f41967n;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO4 = h9.e.o(jSONObject, "focus", z10, aVar13, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41967n = aVarO4;
        j9.a<m6> aVar14 = p3Var == null ? null : p3Var.f41968o;
        Objects.requireNonNull(m6.f41448a);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO5 = h9.e.o(jSONObject, "height", z10, aVar14, pVar2, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41968o = aVarO5;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, p3Var == null ? null : p3Var.f41969p, f41946s0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f41969p = aVarL;
        j9.a<v9.b<Integer>> aVarS5 = h9.e.s(jSONObject, "inactive_item_color", z10, p3Var == null ? null : p3Var.f41970q, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f41970q = aVarS5;
        j9.a<u5> aVarO6 = h9.e.o(jSONObject, "inactive_minimum_shape", z10, p3Var == null ? null : p3Var.f41971r, pVar, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41971r = aVarO6;
        j9.a<u5> aVarO7 = h9.e.o(jSONObject, "inactive_shape", z10, p3Var == null ? null : p3Var.f41972s, pVar, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41972s = aVarO7;
        j9.a<m3> aVar15 = p3Var == null ? null : p3Var.f41973t;
        Objects.requireNonNull(m3.f41434a);
        j9.a<m3> aVarO8 = h9.e.o(jSONObject, "items_placement", z10, aVar15, m3.f41435b, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41973t = aVarO8;
        j9.a<y1> aVar16 = p3Var == null ? null : p3Var.f41974u;
        Objects.requireNonNull(y1.f44196f);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "margins", z10, aVar16, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41974u = aVarO9;
        j9.a<v9.b<Double>> aVarR4 = h9.e.r(jSONObject, "minimum_item_size", z10, p3Var == null ? null : p3Var.f41975v, lVar2, f41948u0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f41975v = aVarR4;
        j9.a<y1> aVarO10 = h9.e.o(jSONObject, "paddings", z10, p3Var == null ? null : p3Var.f41976w, pVar3, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41976w = aVarO10;
        j9.a<String> aVarM = h9.e.m(jSONObject, "pager_id", z10, p3Var == null ? null : p3Var.f41977x, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …nt?.pagerId, logger, env)");
        this.f41977x = aVarM;
        j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "row_span", z10, p3Var == null ? null : p3Var.f41978y, lVar3, f41950w0, eVarA, cVar, kVar3);
        fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41978y = aVarR5;
        j9.a<List<y9.s>> aVar17 = p3Var == null ? null : p3Var.f41979z;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar17, y9.s.f42400w, f41953z0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f41979z = aVarU4;
        j9.a<k6> aVar18 = p3Var == null ? null : p3Var.A;
        Objects.requireNonNull(k6.f41103a);
        j9.a<k6> aVarO11 = h9.e.o(jSONObject, "shape", z10, aVar18, k6.f41104b, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO11;
        j9.a<m2> aVar19 = p3Var == null ? null : p3Var.B;
        Objects.requireNonNull(m2.f41420c);
        j9.a<m2> aVarO12 = h9.e.o(jSONObject, "space_between_centers", z10, aVar19, m2.f41427j, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO12;
        j9.a<List<y7>> aVar20 = p3Var == null ? null : p3Var.C;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar20, y7.f44555v, B0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.C = aVarU5;
        j9.a<a8> aVar21 = p3Var == null ? null : p3Var.D;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO13 = h9.e.o(jSONObject, "transform", z10, aVar21, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO13;
        j9.a<s0> aVar22 = p3Var == null ? null : p3Var.E;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO14 = h9.e.o(jSONObject, "transition_change", z10, aVar22, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO14;
        j9.a<y9.b0> aVar23 = p3Var == null ? null : p3Var.F;
        Objects.requireNonNull(y9.b0.f39111a);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO15 = h9.e.o(jSONObject, "transition_in", z10, aVar23, pVar4, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO15;
        j9.a<y9.b0> aVarO16 = h9.e.o(jSONObject, "transition_out", z10, p3Var == null ? null : p3Var.G, pVar4, eVarA, cVar);
        fd.j0.h(aVarO16, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.G = aVarO16;
        j9.a<List<c8>> aVar24 = p3Var == null ? null : p3Var.H;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar24, c8.FROM_STRING, D0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.H = aVarT;
        j9.a<v9.b<n8>> aVar25 = p3Var == null ? null : p3Var.I;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS6 = h9.e.s(jSONObject, "visibility", z10, aVar25, n8.FROM_STRING, eVarA, cVar, f41920f0);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.I = aVarS6;
        j9.a<p8> aVar26 = p3Var == null ? null : p3Var.J;
        Objects.requireNonNull(p8.f42056i);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO17 = h9.e.o(jSONObject, "visibility_action", z10, aVar26, pVar5, eVarA, cVar);
        fd.j0.h(aVarO17, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.J = aVarO17;
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, p3Var == null ? null : p3Var.K, pVar5, F0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.K = aVarU6;
        j9.a<m6> aVarO18 = h9.e.o(jSONObject, "width", z10, p3Var == null ? null : p3Var.L, pVar2, eVarA, cVar);
        fd.j0.h(aVarO18, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.L = aVarO18;
    }

    public /* synthetic */ p3(u9.c cVar, p3 p3Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : p3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f41954a, cVar, "accessibility", jSONObject, G0);
        if (oVar == null) {
            oVar = M;
        }
        y9.o oVar2 = oVar;
        v9.b<Integer> bVar = (v9.b) y8.c0.H(this.f41955b, cVar, "active_item_color", jSONObject, H0);
        if (bVar == null) {
            bVar = N;
        }
        v9.b<Integer> bVar2 = bVar;
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f41956c, cVar, "active_item_size", jSONObject, I0);
        if (bVar3 == null) {
            bVar3 = O;
        }
        v9.b<Double> bVar4 = bVar3;
        t5 t5Var = (t5) y8.c0.K(this.f41957d, cVar, "active_shape", jSONObject, J0);
        v9.b bVar5 = (v9.b) y8.c0.H(this.f41958e, cVar, "alignment_horizontal", jSONObject, K0);
        v9.b bVar6 = (v9.b) y8.c0.H(this.f41959f, cVar, "alignment_vertical", jSONObject, L0);
        v9.b<Double> bVar7 = (v9.b) y8.c0.H(this.f41960g, cVar, "alpha", jSONObject, M0);
        if (bVar7 == null) {
            bVar7 = P;
        }
        v9.b<Double> bVar8 = bVar7;
        v9.b<k3.a> bVar9 = (v9.b) y8.c0.H(this.f41961h, cVar, "animation", jSONObject, N0);
        if (bVar9 == null) {
            bVar9 = Q;
        }
        v9.b<k3.a> bVar10 = bVar9;
        List listL = y8.c0.L(this.f41962i, cVar, "background", jSONObject, f41930k0, O0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f41963j, cVar, "border", jSONObject, P0);
        if (k0Var == null) {
            k0Var = R;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar11 = (v9.b) y8.c0.H(this.f41964k, cVar, "column_span", jSONObject, Q0);
        List listL2 = y8.c0.L(this.f41965l, cVar, "disappear_actions", jSONObject, f41938o0, R0);
        List listL3 = y8.c0.L(this.f41966m, cVar, "extensions", jSONObject, f41942q0, S0);
        n2 n2Var = (n2) y8.c0.K(this.f41967n, cVar, "focus", jSONObject, T0);
        l6 l6Var = (l6) y8.c0.K(this.f41968o, cVar, "height", jSONObject, U0);
        if (l6Var == null) {
            l6Var = S;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f41969p, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, V0);
        v9.b<Integer> bVar12 = (v9.b) y8.c0.H(this.f41970q, cVar, "inactive_item_color", jSONObject, W0);
        if (bVar12 == null) {
            bVar12 = T;
        }
        v9.b<Integer> bVar13 = bVar12;
        t5 t5Var2 = (t5) y8.c0.K(this.f41971r, cVar, "inactive_minimum_shape", jSONObject, X0);
        t5 t5Var3 = (t5) y8.c0.K(this.f41972s, cVar, "inactive_shape", jSONObject, Y0);
        l3 l3Var = (l3) y8.c0.K(this.f41973t, cVar, "items_placement", jSONObject, Z0);
        x1 x1Var = (x1) y8.c0.K(this.f41974u, cVar, "margins", jSONObject, f41911a1);
        if (x1Var == null) {
            x1Var = U;
        }
        x1 x1Var2 = x1Var;
        v9.b<Double> bVar14 = (v9.b) y8.c0.H(this.f41975v, cVar, "minimum_item_size", jSONObject, f41913b1);
        if (bVar14 == null) {
            bVar14 = V;
        }
        v9.b<Double> bVar15 = bVar14;
        x1 x1Var3 = (x1) y8.c0.K(this.f41976w, cVar, "paddings", jSONObject, f41915c1);
        if (x1Var3 == null) {
            x1Var3 = W;
        }
        x1 x1Var4 = x1Var3;
        String str2 = (String) y8.c0.H(this.f41977x, cVar, "pager_id", jSONObject, f41917d1);
        v9.b bVar16 = (v9.b) y8.c0.H(this.f41978y, cVar, "row_span", jSONObject, f41919e1);
        List listL4 = y8.c0.L(this.f41979z, cVar, "selected_actions", jSONObject, f41952y0, f41921f1);
        h6 h6Var = (h6) y8.c0.K(this.A, cVar, "shape", jSONObject, f41923g1);
        if (h6Var == null) {
            h6Var = X;
        }
        h6 h6Var2 = h6Var;
        l2 l2Var = (l2) y8.c0.K(this.B, cVar, "space_between_centers", jSONObject, f41925h1);
        if (l2Var == null) {
            l2Var = Y;
        }
        l2 l2Var2 = l2Var;
        List listL5 = y8.c0.L(this.C, cVar, "tooltips", jSONObject, A0, f41927i1);
        z7 z7Var = (z7) y8.c0.K(this.D, cVar, "transform", jSONObject, f41929j1);
        if (z7Var == null) {
            z7Var = Z;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.E, cVar, "transition_change", jSONObject, f41931k1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.F, cVar, "transition_in", jSONObject, f41933l1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.G, cVar, "transition_out", jSONObject, f41935m1);
        List listJ = y8.c0.J(this.H, cVar, "transition_triggers", jSONObject, C0, f41937n1);
        v9.b<n8> bVar17 = (v9.b) y8.c0.H(this.I, cVar, "visibility", jSONObject, f41939o1);
        if (bVar17 == null) {
            bVar17 = f41910a0;
        }
        v9.b<n8> bVar18 = bVar17;
        o8 o8Var = (o8) y8.c0.K(this.J, cVar, "visibility_action", jSONObject, f41941p1);
        List listL6 = y8.c0.L(this.K, cVar, "visibility_actions", jSONObject, E0, f41943q1);
        l6 l6Var3 = (l6) y8.c0.K(this.L, cVar, "width", jSONObject, f41945r1);
        if (l6Var3 == null) {
            l6Var3 = f41912b0;
        }
        return new k3(oVar2, bVar2, bVar4, t5Var, bVar5, bVar6, bVar8, bVar10, listL, k0Var2, bVar11, listL2, listL3, n2Var, l6Var2, str, bVar13, t5Var2, t5Var3, l3Var, x1Var2, bVar15, x1Var4, str2, bVar16, listL4, h6Var2, l2Var2, listL5, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar18, o8Var, listL6, l6Var3);
    }
}
