package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u7 implements u9.a, u9.b<l7> {
    public static final h9.k<f4> A0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> A1;
    public static final h9.k<y9.t> B0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> B1;
    public static final h9.k<y9.u> C0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> C1;
    public static final h9.k<f4> D0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> D1;
    public static final h9.k<n8> E0;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> E1;
    public static final h9.g<y9.q> F0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> F1;
    public static final h9.g<y9.s> G0;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> G1;
    public static final h9.m<Double> H0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> H1;
    public static final h9.m<Double> I0;
    public static final uc.q<String, JSONObject, u9.c, l7.l> I1;
    public static final h9.g<y9.e0> J0;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> J1;
    public static final h9.g<y9.f0> K0;
    public static final uc.q<String, JSONObject, u9.c, n2> K1;
    public static final h9.m<Long> L0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> L1;
    public static final h9.m<Long> M0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<p2>> M1;
    public static final h9.g<q1> N0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> N1;
    public static final h9.g<s1> O0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> O1;
    public static final h9.g<y9.q> P0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> P1;
    public static final h9.g<y9.s> Q0;
    public static final uc.q<String, JSONObject, u9.c, l6> Q1;
    public static final h9.g<z1> R0;
    public static final uc.q<String, JSONObject, u9.c, String> R1;
    public static final h9.g<a2> S0;
    public static final uc.q<String, JSONObject, u9.c, List<l7.m>> S1;
    public static final h9.m<Long> T0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> T1;
    public static final h9.m<Long> U0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> U1;
    public static final h9.m<String> V0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> V1;
    public static final h9.m<String> W0;
    public static final uc.q<String, JSONObject, u9.c, x1> W1;
    public static final h9.g<l7.m> X0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> X1;
    public static final h9.g<m1> Y0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Y1;
    public static final h9.m<Long> Z0;
    public static final uc.q<String, JSONObject, u9.c, x1> Z1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final y9.o f43114a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final h9.m<Long> f43115a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<l7.n>> f43116a2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final y9.v f43117b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final h9.g<y9.q> f43118b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f43119b2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final v9.b<Double> f43120c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final h9.g<y9.s> f43121c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f43122c2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final y9.k0 f43123d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final h9.m<Long> f43124d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f43125d2;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final v9.b<p2> f43126e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final h9.m<Long> f43127e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<f4>> f43128e2;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final v9.b<Long> f43129f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final h9.m<Long> f43130f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f43131f2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final v9.b<n6> f43132g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final h9.m<Long> f43133g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> f43134g2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final v9.b<q2> f43135h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final h9.g<l7.n> f43136h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> f43137h2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final l6.e f43138i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final h9.g<n1> f43139i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f43140i2;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final v9.b<Double> f43141j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final h9.m<Long> f43142j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, m7> f43143j2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final x1 f43144k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final h9.m<Long> f43145k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f43146k2;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final x1 f43147l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final h9.g<y9.q> f43148l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f43149l2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final v9.b<Boolean> f43150m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final h9.g<y9.s> f43151m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.r0> f43152m2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final v9.b<f4> f43153n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final h9.m<String> f43154n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f43155n2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final v9.b<y9.t> f43156o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final h9.m<String> f43157o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f43158o2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v9.b<y9.u> f43159p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final h9.g<x7> f43160p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f43161p2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final v9.b<Integer> f43162q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final h9.g<y7> f43163q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<f4>> f43164q2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final z7 f43165r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final h9.g<c8> f43166r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f43167r2;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final v9.b<f4> f43168s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final h9.g<c8> f43169s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f43170s2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final v9.b<n8> f43171t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final h9.g<o8> f43172t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f43173t2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final l6.d f43174u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final h9.g<p8> f43175u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f43176u2;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.k<y9.t> f43177v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.o> f43178v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.k<y9.u> f43179w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.q> f43180w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.k<p2> f43181x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.v> f43182x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.k<n6> f43183y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f43184y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.k<q2> f43185z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> f43186z1;
    public final j9.a<List<y9.s>> A;
    public final j9.a<y1> B;
    public final j9.a<v9.b<Long>> C;
    public final j9.a<v9.b<Long>> D;
    public final j9.a<y1> E;
    public final j9.a<List<n1>> F;
    public final j9.a<v9.b<Long>> G;
    public final j9.a<v9.b<Boolean>> H;
    public final j9.a<List<y9.s>> I;
    public final j9.a<v9.b<f4>> J;
    public final j9.a<v9.b<String>> K;
    public final j9.a<v9.b<y9.t>> L;
    public final j9.a<v9.b<y9.u>> M;
    public final j9.a<v9.b<Integer>> N;
    public final j9.a<n7> O;
    public final j9.a<List<y7>> P;
    public final j9.a<a8> Q;
    public final j9.a<y9.s0> R;
    public final j9.a<y9.b0> S;
    public final j9.a<y9.b0> T;
    public final j9.a<List<c8>> U;
    public final j9.a<v9.b<f4>> V;
    public final j9.a<v9.b<n8>> W;
    public final j9.a<p8> X;
    public final j9.a<List<p8>> Y;
    public final j9.a<m6> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f43187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<y9.s> f43188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<y9.x> f43189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f43191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f43192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f43194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f43195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<y9.l0> f43196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<List<s1>> f43198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<l1> f43200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<a2>> f43201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<o2> f43202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f43203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<v9.b<p2>> f43204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f43206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<q2>> f43207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<m6> f43208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<String> f43209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<List<m1>> f43210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43212z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43213c = new a();

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
            return oVar == null ? u7.f43114a0 : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f43214c = new a0();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, u7.f43118b1, cVar2.a(), cVar2);
        }
    }

    public static final class a1 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a1 f43215c = new a1();

        public a1() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof f4);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43216c = new b();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, u7.F0, cVar2.a(), cVar2);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f43217c = new b0();

        public b0() {
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
            return x1Var == null ? u7.f43144k0 : x1Var;
        }
    }

    public static final class b1 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b1 f43218c = new b1();

        public b1() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43219c = new c();

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
            return vVar == null ? u7.f43117b0 : vVar;
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f43220c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u7.f43127e1, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class c1 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c1 f43221c = new c1();

        public c1() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43222c = new d();

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

    public static final class d0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f43223c = new d0();

        public d0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u7.f43133g1, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class d1 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d1 f43224c = new d1();

        public d1() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof f4);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f43225c = new e();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, u7.f43177v0);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f43226c = new e0();

        public e0() {
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
            return x1Var == null ? u7.f43147l0 : x1Var;
        }
    }

    public static final class e1 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e1 f43227c = new e1();

        public e1() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43228c = new f();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, u7.f43179w0);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<l7.n>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f43229c = new f0();

        public f0() {
            super(3);
        }

        @Override // uc.q
        public List<l7.n> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l7.n.f41331o);
            return h9.c.w(jSONObject2, str2, l7.n.B, u7.f43136h1, cVar2.a(), cVar2);
        }
    }

    public static final class f1 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<f4>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f1 f43230c = new f1();

        public f1() {
            super(3);
        }

        @Override // uc.q
        public v9.b<f4> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f4.Converter);
            uc.l lVar = f4.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<f4> bVar = u7.f43168s0;
            v9.b<f4> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.D0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f43231c = new g();

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
            h9.m<Double> mVar = u7.I0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = u7.f43120c0;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f43232c = new g0();

        public g0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u7.f43145k1, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g1 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g1 f43233c = new g1();

        public g1() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, u7.f43172t1, cVar2.a(), cVar2);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f43234c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30980c, cVar2.a(), cVar2, h9.l.f30997a);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f43235c = new h0();

        public h0() {
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
            v9.b<Boolean> bVar = u7.f43150m0;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class h1 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h1 f43236c = new h1();

        public h1() {
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

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f43237c = new i();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, u7.J0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f43238c = new i0();

        public i0() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, u7.f43148l1, cVar2.a(), cVar2);
        }
    }

    public static final class i1 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i1 f43239c = new i1();

        public i1() {
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
            v9.b<n8> bVar = u7.f43171t0;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.E0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f43240c = new j();

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
            return k0Var == null ? u7.f43123d0 : k0Var;
        }
    }

    public static final class j0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<f4>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f43241c = new j0();

        public j0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<f4> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(f4.Converter);
            uc.l lVar = f4.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<f4> bVar = u7.f43153n0;
            v9.b<f4> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.A0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class j1 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j1 f43242c = new j1();

        public j1() {
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
            return l6Var == null ? u7.f43174u0 : l6Var;
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f43243c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u7.M0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class k0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f43244c = new k0();

        public k0() {
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
            v9.b<y9.t> bVar = u7.f43156o0;
            v9.b<y9.t> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.B0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class k1 {
        public k1() {
        }

        public k1(vc.g gVar) {
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f43245c = new l();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, u7.N0, cVar2.a(), cVar2);
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f43246c = new l0();

        public l0() {
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
            v9.b<y9.u> bVar = u7.f43159p0;
            v9.b<y9.u> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.C0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static class l1 implements u9.a, u9.b<l7.l> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f43247e = new f(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.g<y9.q> f43248f = s7.f42658q;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.g<y9.s> f43249g = t7.f42904i;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.g<l7.m> f43250h = s7.f42659r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final h9.g<m1> f43251i = t7.f42905j;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h9.g<l7.n> f43252j = s7.f42660s;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.g<n1> f43253k = t7.f42906k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h9.m<String> f43254l = s7.f42661t;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final h9.m<String> f43255m = t7.f42907l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f43256n = a.f43265c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, List<l7.m>> f43257o = c.f43267c;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, List<l7.n>> f43258p = d.f43268c;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f43259q = e.f43269c;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, l1> f43260r = b.f43266c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<List<y9.s>> f43261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<List<m1>> f43262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<List<n1>> f43263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<v9.b<String>> f43264d;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43265c = new a();

            public a() {
                super(3);
            }

            @Override // uc.q
            public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.q.f42091g);
                return h9.c.w(jSONObject2, str2, y9.q.f42095k, l1.f43248f, cVar2.a(), cVar2);
            }
        }

        public static final class b extends vc.l implements uc.p<u9.c, JSONObject, l1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f43266c = new b();

            public b() {
                super(2);
            }

            @Override // uc.p
            public l1 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new l1(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, List<l7.m>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f43267c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public List<l7.m> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(l7.m.f41316g);
                return h9.c.w(jSONObject2, str2, l7.m.f41322m, l1.f43250h, cVar2.a(), cVar2);
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, List<l7.n>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f43268c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public List<l7.n> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(l7.n.f41331o);
                return h9.c.w(jSONObject2, str2, l7.n.B, l1.f43252j, cVar2.a(), cVar2);
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f43269c = new e();

            public e() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.e(jSONObject2, str2, l1.f43255m, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class f {
            public f() {
            }

            public f(vc.g gVar) {
            }
        }

        public l1(u9.c cVar, l1 l1Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<List<y9.s>> aVar = l1Var == null ? null : l1Var.f43261a;
            Objects.requireNonNull(y9.s.f42386i);
            j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, aVar, y9.s.f42400w, f43249g, eVarA, cVar);
            fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f43261a = aVarU;
            j9.a<List<m1>> aVar2 = l1Var == null ? null : l1Var.f43262b;
            Objects.requireNonNull(m1.f43272g);
            j9.a<List<m1>> aVarU2 = h9.e.u(jSONObject, "images", z10, aVar2, m1.f43285t, f43251i, eVarA, cVar);
            fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f43262b = aVarU2;
            j9.a<List<n1>> aVar3 = l1Var == null ? null : l1Var.f43263c;
            Objects.requireNonNull(n1.f43302p);
            j9.a<List<n1>> aVarU3 = h9.e.u(jSONObject, "ranges", z10, aVar3, n1.X, f43253k, eVarA, cVar);
            fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f43263c = aVarU3;
            this.f43264d = h9.e.g(jSONObject, "text", z10, l1Var == null ? null : l1Var.f43264d, f43254l, eVarA, cVar, h9.l.f30999c);
        }

        public /* synthetic */ l1(u9.c cVar, l1 l1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : l1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new l7.l(y8.c0.L(this.f43261a, cVar, "actions", jSONObject, f43248f, f43256n), y8.c0.L(this.f43262b, cVar, "images", jSONObject, f43250h, f43257o), y8.c0.L(this.f43263c, cVar, "ranges", jSONObject, f43252j, f43258p), (v9.b) y8.c0.E(this.f43264d, cVar, "text", jSONObject, f43259q));
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f43270c = new m();

        public m() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, u7.P0, cVar2.a(), cVar2);
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f43271c = new m0();

        public m0() {
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
            v9.b<Integer> bVar = u7.f43162q0;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static class m1 implements u9.a, u9.b<l7.m> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final i f43272g = new i(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final l2 f43273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v9.b<y9.h0> f43274i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final l2 f43275j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.k<y9.h0> f43276k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h9.m<Long> f43277l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final h9.m<Long> f43278m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, l2> f43279n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f43280o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f43281p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<y9.h0>> f43282q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f43283r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, l2> f43284s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, m1> f43285t;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<m2> f43286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f43287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f43288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<v9.b<y9.h0>> f43289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<v9.b<Uri>> f43290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j9.a<m2> f43291f;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43292c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public m1 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new m1(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f43293c = new b();

            public b() {
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
                return l2Var == null ? m1.f43273h : l2Var;
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f43294c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, m1.f43278m, cVar2.a(), h9.l.f30998b);
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f43295c = new d();

            public d() {
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

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.h0>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f43296c = new e();

            public e() {
                super(3);
            }

            @Override // uc.q
            public v9.b<y9.h0> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.h0.Converter);
                uc.l lVar = y9.h0.FROM_STRING;
                u9.e eVarA = cVar2.a();
                v9.b<y9.h0> bVar = m1.f43274i;
                v9.b<y9.h0> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, m1.f43276k);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class f extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f43297c = new f();

            public f() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof y9.h0);
            }
        }

        public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f43298c = new g();

            public g() {
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

        public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f43299c = new h();

            public h() {
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
                return l2Var == null ? m1.f43275j : l2Var;
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
            f43273h = new l2(null, aVar.a(20L), 1, null);
            f43274i = aVar.a(y9.h0.SOURCE_IN);
            f43275j = new l2(null, aVar.a(20L), 1, null);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(y9.h0.values());
            f fVar = f.f43297c;
            fd.j0.i(objQ, "default");
            fd.j0.i(fVar, "validator");
            f43276k = new h9.k.a.C0302a(objQ, fVar);
            f43277l = s7.f42662u;
            f43278m = t7.f42908m;
            f43279n = b.f43293c;
            f43280o = c.f43294c;
            f43281p = d.f43295c;
            f43282q = e.f43296c;
            f43283r = g.f43298c;
            f43284s = h.f43299c;
            f43285t = a.f43292c;
        }

        public m1(u9.c cVar, m1 m1Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<m2> aVar = m1Var == null ? null : m1Var.f43286a;
            m2.e eVar = m2.f41420c;
            Objects.requireNonNull(eVar);
            uc.p<u9.c, JSONObject, m2> pVar = m2.f41427j;
            j9.a<m2> aVarO = h9.e.o(jSONObject, "height", z10, aVar, pVar, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f43286a = aVarO;
            this.f43287b = h9.e.i(jSONObject, "start", z10, m1Var == null ? null : m1Var.f43287b, h9.h.f30982e, f43277l, eVarA, cVar, h9.l.f30998b);
            j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "tint_color", z10, m1Var == null ? null : m1Var.f43288c, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f43288c = aVarS;
            j9.a<v9.b<y9.h0>> aVar2 = m1Var == null ? null : m1Var.f43289d;
            Objects.requireNonNull(y9.h0.Converter);
            j9.a<v9.b<y9.h0>> aVarS2 = h9.e.s(jSONObject, "tint_mode", z10, aVar2, y9.h0.FROM_STRING, eVarA, cVar, f43276k);
            fd.j0.h(aVarS2, "readOptionalFieldWithExp…v, TYPE_HELPER_TINT_MODE)");
            this.f43289d = aVarS2;
            this.f43290e = h9.e.j(jSONObject, ImagesContract.URL, z10, m1Var == null ? null : m1Var.f43290e, h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
            j9.a<m2> aVar3 = m1Var == null ? null : m1Var.f43291f;
            Objects.requireNonNull(eVar);
            j9.a<m2> aVarO2 = h9.e.o(jSONObject, "width", z10, aVar3, pVar, eVarA, cVar);
            fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f43291f = aVarO2;
        }

        public /* synthetic */ m1(u9.c cVar, m1 m1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : m1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            l2 l2Var = (l2) y8.c0.K(this.f43286a, cVar, "height", jSONObject, f43279n);
            if (l2Var == null) {
                l2Var = f43273h;
            }
            l2 l2Var2 = l2Var;
            v9.b bVar = (v9.b) y8.c0.E(this.f43287b, cVar, "start", jSONObject, f43280o);
            v9.b bVar2 = (v9.b) y8.c0.H(this.f43288c, cVar, "tint_color", jSONObject, f43281p);
            v9.b<y9.h0> bVar3 = (v9.b) y8.c0.H(this.f43289d, cVar, "tint_mode", jSONObject, f43282q);
            if (bVar3 == null) {
                bVar3 = f43274i;
            }
            v9.b<y9.h0> bVar4 = bVar3;
            v9.b bVar5 = (v9.b) y8.c0.E(this.f43290e, cVar, ImagesContract.URL, jSONObject, f43283r);
            l2 l2Var3 = (l2) y8.c0.K(this.f43291f, cVar, "width", jSONObject, f43284s);
            if (l2Var3 == null) {
                l2Var3 = f43275j;
            }
            return new l7.m(l2Var2, bVar, bVar2, bVar4, bVar5, l2Var3);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, l7.l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f43300c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public l7.l b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l7.l.f41305e);
            return (l7.l) h9.c.n(jSONObject2, str2, l7.l.f41310j, cVar2.a(), cVar2);
        }
    }

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, m7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f43301c = new n0();

        public n0() {
            super(3);
        }

        @Override // uc.q
        public m7 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(m7.f41454a);
            return (m7) h9.c.n(jSONObject2, str2, m7.f41455b, cVar2.a(), cVar2);
        }
    }

    public static class n1 implements u9.a, u9.b<l7.n> {
        public static final h9.m<Long> A;
        public static final h9.m<Long> B;
        public static final h9.m<Long> C;
        public static final h9.m<Long> D;
        public static final h9.m<Long> E;
        public static final h9.m<Long> F;
        public static final h9.m<Long> G;
        public static final h9.m<Long> H;
        public static final uc.q<String, JSONObject, u9.c, List<y9.q>> I;
        public static final uc.q<String, JSONObject, u9.c, o7> J;
        public static final uc.q<String, JSONObject, u9.c, q7> K;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> L;
        public static final uc.q<String, JSONObject, u9.c, v9.b<p2>> M;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> N;
        public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> O;
        public static final uc.q<String, JSONObject, u9.c, v9.b<q2>> P;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> Q;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> R;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> S;
        public static final uc.q<String, JSONObject, u9.c, v9.b<f4>> T;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> U;
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> V;
        public static final uc.q<String, JSONObject, u9.c, v9.b<f4>> W;
        public static final uc.p<u9.c, JSONObject, n1> X;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final v f43302p = new v(null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final v9.b<n6> f43303q = v9.b.f36747a.a(n6.SP);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final h9.k<p2> f43304r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final h9.k<n6> f43305s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final h9.k<q2> f43306t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final h9.k<f4> f43307u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final h9.k<f4> f43308v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final h9.g<y9.q> f43309w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final h9.g<y9.s> f43310x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final h9.m<Long> f43311y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final h9.m<Long> f43312z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<List<y9.s>> f43313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<p7> f43314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<r7> f43315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f43316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<v9.b<p2>> f43317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f43318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j9.a<v9.b<n6>> f43319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j9.a<v9.b<q2>> f43320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final j9.a<v9.b<Double>> f43321i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f43322j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f43323k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final j9.a<v9.b<f4>> f43324l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f43325m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f43326n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final j9.a<v9.b<f4>> f43327o;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43328c = new a();

            public a() {
                super(3);
            }

            @Override // uc.q
            public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.q.f42091g);
                return h9.c.w(jSONObject2, str2, y9.q.f42095k, n1.f43309w, cVar2.a(), cVar2);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, o7> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f43329c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public o7 b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(o7.f41841a);
                return (o7) h9.c.n(jSONObject2, str2, o7.f41842b, cVar2.a(), cVar2);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, q7> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f43330c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public q7 b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(q7.f42185c);
                return (q7) h9.c.n(jSONObject2, str2, q7.f42187e, cVar2.a(), cVar2);
            }
        }

        public static final class d extends vc.l implements uc.p<u9.c, JSONObject, n1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f43331c = new d();

            public d() {
                super(2);
            }

            @Override // uc.p
            public n1 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new n1(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f43332c = new e();

            public e() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, n1.f43312z, cVar2.a(), h9.l.f30998b);
            }
        }

        public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<p2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f43333c = new f();

            public f() {
                super(3);
            }

            @Override // uc.q
            public v9.b<p2> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(p2.Converter);
                return h9.c.s(jSONObject2, str2, p2.FROM_STRING, cVar2.a(), cVar2, n1.f43304r);
            }
        }

        public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f43334c = new g();

            public g() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.q(jSONObject2, str2, h9.h.f30982e, n1.B, cVar2.a(), cVar2, h9.l.f30998b);
            }
        }

        public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f43335c = new h();

            public h() {
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
                v9.b<n6> bVar = n1.f43303q;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, n1.f43305s);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final i f43336c = new i();

            public i() {
                super(3);
            }

            @Override // uc.q
            public v9.b<q2> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(q2.Converter);
                return h9.c.s(jSONObject2, str2, q2.FROM_STRING, cVar2.a(), cVar2, n1.f43306t);
            }
        }

        public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final j f43337c = new j();

            public j() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.s(jSONObject2, str2, h9.h.f30981d, cVar2.a(), cVar2, h9.l.f31000d);
            }
        }

        public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final k f43338c = new k();

            public k() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.q(jSONObject2, str2, h9.h.f30982e, n1.D, cVar2.a(), cVar2, h9.l.f30998b);
            }
        }

        public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final l f43339c = new l();

            public l() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, n1.F, cVar2.a(), h9.l.f30998b);
            }
        }

        public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<f4>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final m f43340c = new m();

            public m() {
                super(3);
            }

            @Override // uc.q
            public v9.b<f4> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(f4.Converter);
                return h9.c.s(jSONObject2, str2, f4.FROM_STRING, cVar2.a(), cVar2, n1.f43307u);
            }
        }

        public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final n f43341c = new n();

            public n() {
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

        public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final o f43342c = new o();

            public o() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.q(jSONObject2, str2, h9.h.f30982e, n1.H, cVar2.a(), cVar2, h9.l.f30998b);
            }
        }

        public static final class p extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final p f43343c = new p();

            public p() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof p2);
            }
        }

        public static final class q extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final q f43344c = new q();

            public q() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class r extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final r f43345c = new r();

            public r() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class s extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final s f43346c = new s();

            public s() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof f4);
            }
        }

        public static final class t extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final t f43347c = new t();

            public t() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof f4);
            }
        }

        public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<f4>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final u f43348c = new u();

            public u() {
                super(3);
            }

            @Override // uc.q
            public v9.b<f4> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(f4.Converter);
                return h9.c.s(jSONObject2, str2, f4.FROM_STRING, cVar2.a(), cVar2, n1.f43308v);
            }
        }

        public static final class v {
            public v() {
            }

            public v(vc.g gVar) {
            }
        }

        static {
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(p2.values());
            p pVar = p.f43343c;
            fd.j0.i(objQ, "default");
            fd.j0.i(pVar, "validator");
            f43304r = new h9.k.a.C0302a(objQ, pVar);
            Object objQ2 = kc.j.q(n6.values());
            q qVar = q.f43344c;
            fd.j0.i(objQ2, "default");
            fd.j0.i(qVar, "validator");
            f43305s = new h9.k.a.C0302a(objQ2, qVar);
            Object objQ3 = kc.j.q(q2.values());
            r rVar = r.f43345c;
            fd.j0.i(objQ3, "default");
            fd.j0.i(rVar, "validator");
            f43306t = new h9.k.a.C0302a(objQ3, rVar);
            Object objQ4 = kc.j.q(f4.values());
            s sVar = s.f43346c;
            fd.j0.i(objQ4, "default");
            fd.j0.i(sVar, "validator");
            f43307u = new h9.k.a.C0302a(objQ4, sVar);
            Object objQ5 = kc.j.q(f4.values());
            t tVar = t.f43347c;
            fd.j0.i(objQ5, "default");
            fd.j0.i(tVar, "validator");
            f43308v = new h9.k.a.C0302a(objQ5, tVar);
            f43309w = s7.f42663v;
            f43310x = t7.f42910o;
            f43311y = s7.f42665x;
            f43312z = t7.f42911p;
            A = s7.f42666y;
            B = t7.f42912q;
            C = s7.f42667z;
            D = t7.f42913r;
            E = s7.A;
            F = t7.f42914s;
            G = t7.f42909n;
            H = s7.f42664w;
            I = a.f43328c;
            J = b.f43329c;
            K = c.f43330c;
            L = e.f43332c;
            M = f.f43333c;
            N = g.f43334c;
            O = h.f43335c;
            P = i.f43336c;
            Q = j.f43337c;
            R = k.f43338c;
            S = l.f43339c;
            T = m.f43340c;
            U = n.f43341c;
            V = o.f43342c;
            W = u.f43348c;
            X = d.f43331c;
        }

        public n1(u9.c cVar, n1 n1Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<List<y9.s>> aVar = n1Var == null ? null : n1Var.f43313a;
            Objects.requireNonNull(y9.s.f42386i);
            j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, aVar, y9.s.f42400w, f43310x, eVarA, cVar);
            fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f43313a = aVarU;
            j9.a<p7> aVar2 = n1Var == null ? null : n1Var.f43314b;
            Objects.requireNonNull(p7.f42052a);
            j9.a<p7> aVarO = h9.e.o(jSONObject, "background", z10, aVar2, p7.f42053b, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f43314b = aVarO;
            j9.a<r7> aVar3 = n1Var == null ? null : n1Var.f43315c;
            Objects.requireNonNull(r7.f42352c);
            j9.a<r7> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar3, r7.f42357h, eVarA, cVar);
            fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f43315c = aVarO2;
            j9.a<v9.b<Long>> aVar4 = n1Var == null ? null : n1Var.f43316d;
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = f43311y;
            h9.k<Long> kVar = h9.l.f30998b;
            this.f43316d = h9.e.i(jSONObject, "end", z10, aVar4, lVar, mVar, eVarA, cVar, kVar);
            j9.a<v9.b<p2>> aVar5 = n1Var == null ? null : n1Var.f43317e;
            Objects.requireNonNull(p2.Converter);
            j9.a<v9.b<p2>> aVarS = h9.e.s(jSONObject, "font_family", z10, aVar5, p2.FROM_STRING, eVarA, cVar, f43304r);
            fd.j0.h(aVarS, "readOptionalFieldWithExp… TYPE_HELPER_FONT_FAMILY)");
            this.f43317e = aVarS;
            j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "font_size", z10, n1Var == null ? null : n1Var.f43318f, lVar, A, eVarA, cVar, kVar);
            fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f43318f = aVarR;
            j9.a<v9.b<n6>> aVar6 = n1Var == null ? null : n1Var.f43319g;
            Objects.requireNonNull(n6.Converter);
            j9.a<v9.b<n6>> aVarS2 = h9.e.s(jSONObject, "font_size_unit", z10, aVar6, n6.FROM_STRING, eVarA, cVar, f43305s);
            fd.j0.h(aVarS2, "readOptionalFieldWithExp…PE_HELPER_FONT_SIZE_UNIT)");
            this.f43319g = aVarS2;
            j9.a<v9.b<q2>> aVar7 = n1Var == null ? null : n1Var.f43320h;
            Objects.requireNonNull(q2.Converter);
            j9.a<v9.b<q2>> aVarS3 = h9.e.s(jSONObject, "font_weight", z10, aVar7, q2.FROM_STRING, eVarA, cVar, f43306t);
            fd.j0.h(aVarS3, "readOptionalFieldWithExp… TYPE_HELPER_FONT_WEIGHT)");
            this.f43320h = aVarS3;
            j9.a<v9.b<Double>> aVarS4 = h9.e.s(jSONObject, "letter_spacing", z10, n1Var == null ? null : n1Var.f43321i, h9.h.f30981d, eVarA, cVar, h9.l.f31000d);
            fd.j0.h(aVarS4, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
            this.f43321i = aVarS4;
            j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "line_height", z10, n1Var == null ? null : n1Var.f43322j, lVar, C, eVarA, cVar, kVar);
            fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f43322j = aVarR2;
            this.f43323k = h9.e.i(jSONObject, "start", z10, n1Var == null ? null : n1Var.f43323k, lVar, E, eVarA, cVar, kVar);
            j9.a<v9.b<f4>> aVar8 = n1Var == null ? null : n1Var.f43324l;
            f4.b bVar = f4.Converter;
            Objects.requireNonNull(bVar);
            j9.a<v9.b<f4>> aVarS5 = h9.e.s(jSONObject, "strike", z10, aVar8, f4.FROM_STRING, eVarA, cVar, f43307u);
            fd.j0.h(aVarS5, "readOptionalFieldWithExp… env, TYPE_HELPER_STRIKE)");
            this.f43324l = aVarS5;
            j9.a<v9.b<Integer>> aVarS6 = h9.e.s(jSONObject, "text_color", z10, n1Var == null ? null : n1Var.f43325m, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            fd.j0.h(aVarS6, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f43325m = aVarS6;
            j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "top_offset", z10, n1Var == null ? null : n1Var.f43326n, lVar, G, eVarA, cVar, kVar);
            fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
            this.f43326n = aVarR3;
            j9.a<v9.b<f4>> aVar9 = n1Var == null ? null : n1Var.f43327o;
            Objects.requireNonNull(bVar);
            j9.a<v9.b<f4>> aVarS7 = h9.e.s(jSONObject, "underline", z10, aVar9, f4.FROM_STRING, eVarA, cVar, f43308v);
            fd.j0.h(aVarS7, "readOptionalFieldWithExp…v, TYPE_HELPER_UNDERLINE)");
            this.f43327o = aVarS7;
        }

        public /* synthetic */ n1(u9.c cVar, n1 n1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : n1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            List listL = y8.c0.L(this.f43313a, cVar, "actions", jSONObject, f43309w, I);
            o7 o7Var = (o7) y8.c0.K(this.f43314b, cVar, "background", jSONObject, J);
            q7 q7Var = (q7) y8.c0.K(this.f43315c, cVar, "border", jSONObject, K);
            v9.b bVar = (v9.b) y8.c0.E(this.f43316d, cVar, "end", jSONObject, L);
            v9.b bVar2 = (v9.b) y8.c0.H(this.f43317e, cVar, "font_family", jSONObject, M);
            v9.b bVar3 = (v9.b) y8.c0.H(this.f43318f, cVar, "font_size", jSONObject, N);
            v9.b<n6> bVar4 = (v9.b) y8.c0.H(this.f43319g, cVar, "font_size_unit", jSONObject, O);
            if (bVar4 == null) {
                bVar4 = f43303q;
            }
            return new l7.n(listL, o7Var, q7Var, bVar, bVar2, bVar3, bVar4, (v9.b) y8.c0.H(this.f43320h, cVar, "font_weight", jSONObject, P), (v9.b) y8.c0.H(this.f43321i, cVar, "letter_spacing", jSONObject, Q), (v9.b) y8.c0.H(this.f43322j, cVar, "line_height", jSONObject, R), (v9.b) y8.c0.E(this.f43323k, cVar, "start", jSONObject, S), (v9.b) y8.c0.H(this.f43324l, cVar, "strike", jSONObject, T), (v9.b) y8.c0.H(this.f43325m, cVar, "text_color", jSONObject, U), (v9.b) y8.c0.H(this.f43326n, cVar, "top_offset", jSONObject, V), (v9.b) y8.c0.H(this.f43327o, cVar, "underline", jSONObject, W));
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f43349c = new o();

        public o() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, u7.R0, cVar2.a(), cVar2);
        }
    }

    public static final class o0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f43350c = new o0();

        public o0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.e(jSONObject2, str2, u7.f43157o1, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f43351c = new p();

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

    public static final class p0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f43352c = new p0();

        public p0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, u7.f43160p1, cVar2.a(), cVar2);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f43353c = new q();

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

    public static final class q0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f43354c = new q0();

        public q0() {
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
            return z7Var == null ? u7.f43165r0 : z7Var;
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<p2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f43355c = new r();

        public r() {
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
            v9.b<p2> bVar = u7.f43126e0;
            v9.b<p2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.f43181x0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class r0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f43356c = new r0();

        public r0() {
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

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f43357c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = u7.U0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = u7.f43129f0;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class s0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s0 f43358c = new s0();

        public s0() {
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

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f43359c = new t();

        public t() {
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
            v9.b<n6> bVar = u7.f43132g0;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.f43183y0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class t0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t0 f43360c = new t0();

        public t0() {
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

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f43361c = new u();

        public u() {
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
            v9.b<q2> bVar = u7.f43135h0;
            v9.b<q2> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, u7.f43185z0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class u0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u0 f43362c = new u0();

        public u0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, u7.f43166r1, cVar2.a(), cVar2);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f43363c = new v();

        public v() {
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
            return l6Var == null ? u7.f43138i0 : l6Var;
        }
    }

    public static final class v0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v0 f43364c = new v0();

        public v0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f43365c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, u7.W0, cVar2.a());
        }
    }

    public static final class w0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w0 f43366c = new w0();

        public w0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, List<l7.m>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f43367c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public List<l7.m> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l7.m.f41316g);
            return h9.c.w(jSONObject2, str2, l7.m.f41322m, u7.X0, cVar2.a(), cVar2);
        }
    }

    public static final class x0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x0 f43368c = new x0();

        public x0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof p2);
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f43369c = new y();

        public y() {
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
            v9.b<Double> bVar = u7.f43141j0;
            v9.b<Double> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31000d);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class y0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y0 f43370c = new y0();

        public y0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f43371c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, u7.f43115a1, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class z0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z0 f43372c = new z0();

        public z0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof q2);
        }
    }

    static {
        new k1(null);
        f43114a0 = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(y9.v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        f43117b0 = new y9.v(bVarA, bVarA2, null, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        f43120c0 = aVar.a(dValueOf);
        f43123d0 = new y9.k0(null, null, null, null, null, 31, null);
        f43126e0 = aVar.a(p2.TEXT);
        f43129f0 = aVar.a(12L);
        f43132g0 = aVar.a(n6.SP);
        f43135h0 = aVar.a(q2.REGULAR);
        f43138i0 = new l6.e(new q8(null, null, null, 7, null));
        f43141j0 = aVar.a(Double.valueOf(0.0d));
        f43144k0 = new x1(null, null, null, null, null, 31, null);
        f43147l0 = new x1(null, null, null, null, null, 31, null);
        f43150m0 = aVar.a(Boolean.FALSE);
        f4 f4Var = f4.NONE;
        f43153n0 = aVar.a(f4Var);
        f43156o0 = aVar.a(y9.t.LEFT);
        f43159p0 = aVar.a(y9.u.TOP);
        f43162q0 = aVar.a(-16777216);
        f43165r0 = new z7(null, null, null, 7, null);
        f43168s0 = aVar.a(f4Var);
        f43171t0 = aVar.a(n8.VISIBLE);
        f43174u0 = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        h9.k.a aVar2 = h9.k.a.f30993a;
        f43177v0 = aVar2.a(kc.j.q(y9.t.values()), v0.f43364c);
        f43179w0 = aVar2.a(kc.j.q(y9.u.values()), w0.f43366c);
        f43181x0 = aVar2.a(kc.j.q(p2.values()), x0.f43368c);
        f43183y0 = aVar2.a(kc.j.q(n6.values()), y0.f43370c);
        f43185z0 = aVar2.a(kc.j.q(q2.values()), z0.f43372c);
        A0 = aVar2.a(kc.j.q(f4.values()), a1.f43215c);
        B0 = aVar2.a(kc.j.q(y9.t.values()), b1.f43218c);
        C0 = aVar2.a(kc.j.q(y9.u.values()), c1.f43221c);
        D0 = aVar2.a(kc.j.q(f4.values()), d1.f43224c);
        E0 = aVar2.a(kc.j.q(n8.values()), e1.f43227c);
        F0 = k7.f41125u;
        G0 = j7.f40933o;
        H0 = s7.f42648g;
        I0 = t7.f42899d;
        J0 = s7.f42655n;
        K0 = t7.f42901f;
        L0 = s7.f42656o;
        M0 = t7.f42902g;
        N0 = s7.f42657p;
        O0 = t7.f42903h;
        P0 = j7.f40928j;
        Q0 = k7.f41126v;
        R0 = j7.f40929k;
        S0 = k7.f41127w;
        T0 = j7.f40930l;
        U0 = k7.f41128x;
        V0 = j7.f40931m;
        W0 = k7.f41129y;
        X0 = j7.f40932n;
        Y0 = k7.f41130z;
        Z0 = k7.A;
        f43115a1 = j7.f40934p;
        f43118b1 = k7.B;
        f43121c1 = j7.f40935q;
        f43124d1 = s7.f42645d;
        f43127e1 = j7.f40936r;
        f43130f1 = s7.f42646e;
        f43133g1 = j7.f40937s;
        f43136h1 = s7.f42647f;
        f43139i1 = j7.f40938t;
        f43142j1 = j7.f40939u;
        f43145k1 = s7.f42649h;
        f43148l1 = j7.f40940v;
        f43151m1 = s7.f42650i;
        f43154n1 = j7.f40941w;
        f43157o1 = s7.f42651j;
        f43160p1 = j7.f40942x;
        f43163q1 = s7.f42652k;
        f43166r1 = j7.f40943y;
        f43169s1 = s7.f42653l;
        f43172t1 = s7.f42654m;
        f43175u1 = t7.f42900e;
        f43178v1 = a.f43213c;
        f43180w1 = d.f43222c;
        f43182x1 = c.f43219c;
        f43184y1 = b.f43216c;
        f43186z1 = e.f43225c;
        A1 = f.f43228c;
        B1 = g.f43231c;
        C1 = h.f43234c;
        D1 = i.f43237c;
        E1 = j.f43240c;
        F1 = k.f43243c;
        G1 = l.f43245c;
        H1 = m.f43270c;
        I1 = n.f43300c;
        J1 = o.f43349c;
        K1 = q.f43353c;
        L1 = p.f43351c;
        M1 = r.f43355c;
        N1 = s.f43357c;
        O1 = t.f43359c;
        P1 = u.f43361c;
        Q1 = v.f43363c;
        R1 = w.f43365c;
        S1 = x.f43367c;
        T1 = y.f43369c;
        U1 = z.f43371c;
        V1 = a0.f43214c;
        W1 = b0.f43217c;
        X1 = c0.f43220c;
        Y1 = d0.f43223c;
        Z1 = e0.f43226c;
        f43116a2 = f0.f43229c;
        f43119b2 = g0.f43232c;
        f43122c2 = h0.f43235c;
        f43125d2 = i0.f43238c;
        f43128e2 = j0.f43241c;
        f43131f2 = o0.f43350c;
        f43134g2 = k0.f43244c;
        f43137h2 = l0.f43246c;
        f43140i2 = m0.f43271c;
        f43143j2 = n0.f43301c;
        f43146k2 = p0.f43352c;
        f43149l2 = q0.f43354c;
        f43152m2 = r0.f43356c;
        f43155n2 = s0.f43358c;
        f43158o2 = t0.f43360c;
        f43161p2 = u0.f43362c;
        f43164q2 = f1.f43230c;
        f43167r2 = i1.f43239c;
        f43170s2 = h1.f43236c;
        f43173t2 = g1.f43233c;
        f43176u2 = j1.f43242c;
    }

    public u7(u9.c cVar, u7 u7Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = u7Var == null ? null : u7Var.f43187a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43187a = aVarO;
        j9.a<y9.s> aVar2 = u7Var == null ? null : u7Var.f43188b;
        y9.s.k kVar = y9.s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<y9.s> aVarO2 = h9.e.o(jSONObject, "action", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43188b = aVarO2;
        j9.a<y9.x> aVar3 = u7Var == null ? null : u7Var.f43189c;
        Objects.requireNonNull(y9.x.f43838i);
        j9.a<y9.x> aVarO3 = h9.e.o(jSONObject, "action_animation", z10, aVar3, y9.x.D, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43189c = aVarO3;
        j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, u7Var == null ? null : u7Var.f43190d, pVar, G0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43190d = aVarU;
        j9.a<v9.b<y9.t>> aVar4 = u7Var == null ? null : u7Var.f43191e;
        y9.t.b bVar = y9.t.Converter;
        Objects.requireNonNull(bVar);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar4, y9.t.FROM_STRING, eVarA, cVar, f43177v0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f43191e = aVarS;
        j9.a<v9.b<y9.u>> aVar5 = u7Var == null ? null : u7Var.f43192f;
        y9.u.b bVar2 = y9.u.Converter;
        Objects.requireNonNull(bVar2);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar5, y9.u.FROM_STRING, eVarA, cVar, f43179w0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f43192f = aVarS2;
        j9.a<v9.b<Double>> aVar6 = u7Var == null ? null : u7Var.f43193g;
        uc.l<Number, Double> lVar = h9.h.f30981d;
        h9.m<Double> mVar = H0;
        h9.k<Double> kVar2 = h9.l.f31000d;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, aVar6, lVar, mVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43193g = aVarR;
        j9.a<v9.b<Boolean>> aVar7 = u7Var == null ? null : u7Var.f43194h;
        uc.l<Object, Boolean> lVar2 = h9.h.f30980c;
        h9.k<Boolean> kVar3 = h9.l.f30997a;
        j9.a<v9.b<Boolean>> aVarS3 = h9.e.s(jSONObject, "auto_ellipsize", z10, aVar7, lVar2, eVarA, cVar, kVar3);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f43194h = aVarS3;
        j9.a<List<y9.f0>> aVar8 = u7Var == null ? null : u7Var.f43195i;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU2 = h9.e.u(jSONObject, "background", z10, aVar8, y9.f0.f39919b, K0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43195i = aVarU2;
        j9.a<y9.l0> aVar9 = u7Var == null ? null : u7Var.f43196j;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO4 = h9.e.o(jSONObject, "border", z10, aVar9, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43196j = aVarO4;
        j9.a<v9.b<Long>> aVar10 = u7Var == null ? null : u7Var.f43197k;
        uc.l<Number, Long> lVar3 = h9.h.f30982e;
        h9.m<Long> mVar2 = L0;
        h9.k<Long> kVar4 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar10, lVar3, mVar2, eVarA, cVar, kVar4);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43197k = aVarR2;
        j9.a<List<s1>> aVar11 = u7Var == null ? null : u7Var.f43198l;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar11, s1.C, O0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43198l = aVarU3;
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "doubletap_actions", z10, u7Var == null ? null : u7Var.f43199m, pVar, Q0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43199m = aVarU4;
        j9.a<l1> aVar12 = u7Var == null ? null : u7Var.f43200n;
        Objects.requireNonNull(l1.f43247e);
        j9.a<l1> aVarO5 = h9.e.o(jSONObject, "ellipsis", z10, aVar12, l1.f43260r, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43200n = aVarO5;
        j9.a<List<a2>> aVar13 = u7Var == null ? null : u7Var.f43201o;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar13, a2.f39002h, S0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43201o = aVarU5;
        j9.a<o2> aVar14 = u7Var == null ? null : u7Var.f43202p;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO6 = h9.e.o(jSONObject, "focus", z10, aVar14, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43202p = aVarO6;
        j9.a<v9.b<Integer>> aVar15 = u7Var == null ? null : u7Var.f43203q;
        uc.l<Object, Integer> lVar4 = h9.h.f30978a;
        h9.k<Integer> kVar5 = h9.l.f31002f;
        j9.a<v9.b<Integer>> aVarS4 = h9.e.s(jSONObject, "focused_text_color", z10, aVar15, lVar4, eVarA, cVar, kVar5);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f43203q = aVarS4;
        j9.a<v9.b<p2>> aVar16 = u7Var == null ? null : u7Var.f43204r;
        Objects.requireNonNull(p2.Converter);
        j9.a<v9.b<p2>> aVarS5 = h9.e.s(jSONObject, "font_family", z10, aVar16, p2.FROM_STRING, eVarA, cVar, f43181x0);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp… TYPE_HELPER_FONT_FAMILY)");
        this.f43204r = aVarS5;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "font_size", z10, u7Var == null ? null : u7Var.f43205s, lVar3, T0, eVarA, cVar, kVar4);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43205s = aVarR3;
        j9.a<v9.b<n6>> aVar17 = u7Var == null ? null : u7Var.f43206t;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS6 = h9.e.s(jSONObject, "font_size_unit", z10, aVar17, n6.FROM_STRING, eVarA, cVar, f43183y0);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…PE_HELPER_FONT_SIZE_UNIT)");
        this.f43206t = aVarS6;
        j9.a<v9.b<q2>> aVar18 = u7Var == null ? null : u7Var.f43207u;
        Objects.requireNonNull(q2.Converter);
        j9.a<v9.b<q2>> aVarS7 = h9.e.s(jSONObject, "font_weight", z10, aVar18, q2.FROM_STRING, eVarA, cVar, f43185z0);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp… TYPE_HELPER_FONT_WEIGHT)");
        this.f43207u = aVarS7;
        j9.a<m6> aVar19 = u7Var == null ? null : u7Var.f43208v;
        Objects.requireNonNull(m6.f41448a);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO7 = h9.e.o(jSONObject, "height", z10, aVar19, pVar2, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43208v = aVarO7;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, u7Var == null ? null : u7Var.f43209w, V0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f43209w = aVarL;
        j9.a<List<m1>> aVar20 = u7Var == null ? null : u7Var.f43210x;
        Objects.requireNonNull(m1.f43272g);
        j9.a<List<m1>> aVarU6 = h9.e.u(jSONObject, "images", z10, aVar20, m1.f43285t, Y0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43210x = aVarU6;
        j9.a<v9.b<Double>> aVarS8 = h9.e.s(jSONObject, "letter_spacing", z10, u7Var == null ? null : u7Var.f43211y, lVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarS8, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43211y = aVarS8;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "line_height", z10, u7Var == null ? null : u7Var.f43212z, lVar3, Z0, eVarA, cVar, kVar4);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43212z = aVarR4;
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "longtap_actions", z10, u7Var == null ? null : u7Var.A, pVar, f43121c1, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.A = aVarU7;
        j9.a<y1> aVar21 = u7Var == null ? null : u7Var.B;
        Objects.requireNonNull(y1.f44196f);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO8 = h9.e.o(jSONObject, "margins", z10, aVar21, pVar3, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO8;
        j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "max_lines", z10, u7Var == null ? null : u7Var.C, lVar3, f43124d1, eVarA, cVar, kVar4);
        fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.C = aVarR5;
        j9.a<v9.b<Long>> aVarR6 = h9.e.r(jSONObject, "min_hidden_lines", z10, u7Var == null ? null : u7Var.D, lVar3, f43130f1, eVarA, cVar, kVar4);
        fd.j0.h(aVarR6, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.D = aVarR6;
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "paddings", z10, u7Var == null ? null : u7Var.E, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO9;
        j9.a<List<n1>> aVar22 = u7Var == null ? null : u7Var.F;
        Objects.requireNonNull(n1.f43302p);
        j9.a<List<n1>> aVarU8 = h9.e.u(jSONObject, "ranges", z10, aVar22, n1.X, f43139i1, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.F = aVarU8;
        j9.a<v9.b<Long>> aVarR7 = h9.e.r(jSONObject, "row_span", z10, u7Var == null ? null : u7Var.G, lVar3, f43142j1, eVarA, cVar, kVar4);
        fd.j0.h(aVarR7, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.G = aVarR7;
        j9.a<v9.b<Boolean>> aVarS9 = h9.e.s(jSONObject, "selectable", z10, u7Var == null ? null : u7Var.H, lVar2, eVarA, cVar, kVar3);
        fd.j0.h(aVarS9, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.H = aVarS9;
        j9.a<List<y9.s>> aVar23 = u7Var == null ? null : u7Var.I;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU9 = h9.e.u(jSONObject, "selected_actions", z10, aVar23, pVar, f43151m1, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.I = aVarU9;
        j9.a<v9.b<f4>> aVar24 = u7Var == null ? null : u7Var.J;
        Objects.requireNonNull(f4.Converter);
        j9.a<v9.b<f4>> aVarS10 = h9.e.s(jSONObject, "strike", z10, aVar24, f4.FROM_STRING, eVarA, cVar, A0);
        fd.j0.h(aVarS10, "readOptionalFieldWithExp… env, TYPE_HELPER_STRIKE)");
        this.J = aVarS10;
        this.K = h9.e.g(jSONObject, "text", z10, u7Var == null ? null : u7Var.K, f43154n1, eVarA, cVar, h9.l.f30999c);
        j9.a<v9.b<y9.t>> aVar25 = u7Var == null ? null : u7Var.L;
        Objects.requireNonNull(bVar);
        j9.a<v9.b<y9.t>> aVarS11 = h9.e.s(jSONObject, "text_alignment_horizontal", z10, aVar25, y9.t.FROM_STRING, eVarA, cVar, B0);
        fd.j0.h(aVarS11, "readOptionalFieldWithExp…EXT_ALIGNMENT_HORIZONTAL)");
        this.L = aVarS11;
        j9.a<v9.b<y9.u>> aVar26 = u7Var == null ? null : u7Var.M;
        Objects.requireNonNull(bVar2);
        j9.a<v9.b<y9.u>> aVarS12 = h9.e.s(jSONObject, "text_alignment_vertical", z10, aVar26, y9.u.FROM_STRING, eVarA, cVar, C0);
        fd.j0.h(aVarS12, "readOptionalFieldWithExp…_TEXT_ALIGNMENT_VERTICAL)");
        this.M = aVarS12;
        j9.a<v9.b<Integer>> aVarS13 = h9.e.s(jSONObject, "text_color", z10, u7Var == null ? null : u7Var.N, lVar4, eVarA, cVar, kVar5);
        fd.j0.h(aVarS13, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.N = aVarS13;
        j9.a<n7> aVar27 = u7Var == null ? null : u7Var.O;
        Objects.requireNonNull(n7.f41694a);
        j9.a<n7> aVarO10 = h9.e.o(jSONObject, "text_gradient", z10, aVar27, n7.f41695b, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.O = aVarO10;
        j9.a<List<y7>> aVar28 = u7Var == null ? null : u7Var.P;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU10 = h9.e.u(jSONObject, "tooltips", z10, aVar28, y7.f44555v, f43163q1, eVarA, cVar);
        fd.j0.h(aVarU10, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.P = aVarU10;
        j9.a<a8> aVar29 = u7Var == null ? null : u7Var.Q;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO11 = h9.e.o(jSONObject, "transform", z10, aVar29, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.Q = aVarO11;
        j9.a<y9.s0> aVar30 = u7Var == null ? null : u7Var.R;
        Objects.requireNonNull(y9.s0.f42435a);
        j9.a<y9.s0> aVarO12 = h9.e.o(jSONObject, "transition_change", z10, aVar30, y9.s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.R = aVarO12;
        j9.a<y9.b0> aVar31 = u7Var == null ? null : u7Var.S;
        Objects.requireNonNull(y9.b0.f39111a);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO13 = h9.e.o(jSONObject, "transition_in", z10, aVar31, pVar4, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.S = aVarO13;
        j9.a<y9.b0> aVarO14 = h9.e.o(jSONObject, "transition_out", z10, u7Var == null ? null : u7Var.T, pVar4, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.T = aVarO14;
        j9.a<List<c8>> aVar32 = u7Var == null ? null : u7Var.U;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar32, c8.FROM_STRING, f43169s1, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.U = aVarT;
        j9.a<v9.b<f4>> aVarS14 = h9.e.s(jSONObject, "underline", z10, u7Var == null ? null : u7Var.V, f4.FROM_STRING, eVarA, cVar, D0);
        fd.j0.h(aVarS14, "readOptionalFieldWithExp…v, TYPE_HELPER_UNDERLINE)");
        this.V = aVarS14;
        j9.a<v9.b<n8>> aVar33 = u7Var == null ? null : u7Var.W;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS15 = h9.e.s(jSONObject, "visibility", z10, aVar33, n8.FROM_STRING, eVarA, cVar, E0);
        fd.j0.h(aVarS15, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.W = aVarS15;
        j9.a<p8> aVar34 = u7Var == null ? null : u7Var.X;
        Objects.requireNonNull(p8.f42056i);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO15 = h9.e.o(jSONObject, "visibility_action", z10, aVar34, pVar5, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.X = aVarO15;
        j9.a<List<p8>> aVarU11 = h9.e.u(jSONObject, "visibility_actions", z10, u7Var == null ? null : u7Var.Y, pVar5, f43175u1, eVarA, cVar);
        fd.j0.h(aVarU11, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.Y = aVarU11;
        j9.a<m6> aVarO16 = h9.e.o(jSONObject, "width", z10, u7Var == null ? null : u7Var.Z, pVar2, eVarA, cVar);
        fd.j0.h(aVarO16, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.Z = aVarO16;
    }

    public /* synthetic */ u7(u9.c cVar, u7 u7Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : u7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l7 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f43187a, cVar, "accessibility", jSONObject, f43178v1);
        if (oVar == null) {
            oVar = f43114a0;
        }
        y9.o oVar2 = oVar;
        y9.q qVar = (y9.q) y8.c0.K(this.f43188b, cVar, "action", jSONObject, f43180w1);
        y9.v vVar = (y9.v) y8.c0.K(this.f43189c, cVar, "action_animation", jSONObject, f43182x1);
        if (vVar == null) {
            vVar = f43117b0;
        }
        y9.v vVar2 = vVar;
        List listL = y8.c0.L(this.f43190d, cVar, "actions", jSONObject, F0, f43184y1);
        v9.b bVar = (v9.b) y8.c0.H(this.f43191e, cVar, "alignment_horizontal", jSONObject, f43186z1);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f43192f, cVar, "alignment_vertical", jSONObject, A1);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f43193g, cVar, "alpha", jSONObject, B1);
        if (bVar3 == null) {
            bVar3 = f43120c0;
        }
        v9.b<Double> bVar4 = bVar3;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f43194h, cVar, "auto_ellipsize", jSONObject, C1);
        List listL2 = y8.c0.L(this.f43195i, cVar, "background", jSONObject, J0, D1);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f43196j, cVar, "border", jSONObject, E1);
        if (k0Var == null) {
            k0Var = f43123d0;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar6 = (v9.b) y8.c0.H(this.f43197k, cVar, "column_span", jSONObject, F1);
        List listL3 = y8.c0.L(this.f43198l, cVar, "disappear_actions", jSONObject, N0, G1);
        List listL4 = y8.c0.L(this.f43199m, cVar, "doubletap_actions", jSONObject, P0, H1);
        l7.l lVar = (l7.l) y8.c0.K(this.f43200n, cVar, "ellipsis", jSONObject, I1);
        List listL5 = y8.c0.L(this.f43201o, cVar, "extensions", jSONObject, R0, J1);
        n2 n2Var = (n2) y8.c0.K(this.f43202p, cVar, "focus", jSONObject, K1);
        v9.b bVar7 = (v9.b) y8.c0.H(this.f43203q, cVar, "focused_text_color", jSONObject, L1);
        v9.b<p2> bVar8 = (v9.b) y8.c0.H(this.f43204r, cVar, "font_family", jSONObject, M1);
        if (bVar8 == null) {
            bVar8 = f43126e0;
        }
        v9.b<p2> bVar9 = bVar8;
        v9.b<Long> bVar10 = (v9.b) y8.c0.H(this.f43205s, cVar, "font_size", jSONObject, N1);
        if (bVar10 == null) {
            bVar10 = f43129f0;
        }
        v9.b<Long> bVar11 = bVar10;
        v9.b<n6> bVar12 = (v9.b) y8.c0.H(this.f43206t, cVar, "font_size_unit", jSONObject, O1);
        if (bVar12 == null) {
            bVar12 = f43132g0;
        }
        v9.b<n6> bVar13 = bVar12;
        v9.b<q2> bVar14 = (v9.b) y8.c0.H(this.f43207u, cVar, "font_weight", jSONObject, P1);
        if (bVar14 == null) {
            bVar14 = f43135h0;
        }
        v9.b<q2> bVar15 = bVar14;
        l6 l6Var = (l6) y8.c0.K(this.f43208v, cVar, "height", jSONObject, Q1);
        if (l6Var == null) {
            l6Var = f43138i0;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f43209w, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, R1);
        List listL6 = y8.c0.L(this.f43210x, cVar, "images", jSONObject, X0, S1);
        v9.b<Double> bVar16 = (v9.b) y8.c0.H(this.f43211y, cVar, "letter_spacing", jSONObject, T1);
        if (bVar16 == null) {
            bVar16 = f43141j0;
        }
        v9.b<Double> bVar17 = bVar16;
        v9.b bVar18 = (v9.b) y8.c0.H(this.f43212z, cVar, "line_height", jSONObject, U1);
        List listL7 = y8.c0.L(this.A, cVar, "longtap_actions", jSONObject, f43118b1, V1);
        x1 x1Var = (x1) y8.c0.K(this.B, cVar, "margins", jSONObject, W1);
        if (x1Var == null) {
            x1Var = f43144k0;
        }
        x1 x1Var2 = x1Var;
        v9.b bVar19 = (v9.b) y8.c0.H(this.C, cVar, "max_lines", jSONObject, X1);
        v9.b bVar20 = (v9.b) y8.c0.H(this.D, cVar, "min_hidden_lines", jSONObject, Y1);
        x1 x1Var3 = (x1) y8.c0.K(this.E, cVar, "paddings", jSONObject, Z1);
        if (x1Var3 == null) {
            x1Var3 = f43147l0;
        }
        x1 x1Var4 = x1Var3;
        List listL8 = y8.c0.L(this.F, cVar, "ranges", jSONObject, f43136h1, f43116a2);
        v9.b bVar21 = (v9.b) y8.c0.H(this.G, cVar, "row_span", jSONObject, f43119b2);
        v9.b<Boolean> bVar22 = (v9.b) y8.c0.H(this.H, cVar, "selectable", jSONObject, f43122c2);
        if (bVar22 == null) {
            bVar22 = f43150m0;
        }
        v9.b<Boolean> bVar23 = bVar22;
        List listL9 = y8.c0.L(this.I, cVar, "selected_actions", jSONObject, f43148l1, f43125d2);
        v9.b<f4> bVar24 = (v9.b) y8.c0.H(this.J, cVar, "strike", jSONObject, f43128e2);
        if (bVar24 == null) {
            bVar24 = f43153n0;
        }
        v9.b<f4> bVar25 = bVar24;
        v9.b bVar26 = (v9.b) y8.c0.E(this.K, cVar, "text", jSONObject, f43131f2);
        v9.b<y9.t> bVar27 = (v9.b) y8.c0.H(this.L, cVar, "text_alignment_horizontal", jSONObject, f43134g2);
        if (bVar27 == null) {
            bVar27 = f43156o0;
        }
        v9.b<y9.t> bVar28 = bVar27;
        v9.b<y9.u> bVar29 = (v9.b) y8.c0.H(this.M, cVar, "text_alignment_vertical", jSONObject, f43137h2);
        if (bVar29 == null) {
            bVar29 = f43159p0;
        }
        v9.b<y9.u> bVar30 = bVar29;
        v9.b<Integer> bVar31 = (v9.b) y8.c0.H(this.N, cVar, "text_color", jSONObject, f43140i2);
        if (bVar31 == null) {
            bVar31 = f43162q0;
        }
        v9.b<Integer> bVar32 = bVar31;
        m7 m7Var = (m7) y8.c0.K(this.O, cVar, "text_gradient", jSONObject, f43143j2);
        List listL10 = y8.c0.L(this.P, cVar, "tooltips", jSONObject, f43160p1, f43146k2);
        z7 z7Var = (z7) y8.c0.K(this.Q, cVar, "transform", jSONObject, f43149l2);
        if (z7Var == null) {
            z7Var = f43165r0;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.R, cVar, "transition_change", jSONObject, f43152m2);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.S, cVar, "transition_in", jSONObject, f43155n2);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.T, cVar, "transition_out", jSONObject, f43158o2);
        List listJ = y8.c0.J(this.U, cVar, "transition_triggers", jSONObject, f43166r1, f43161p2);
        v9.b<f4> bVar33 = (v9.b) y8.c0.H(this.V, cVar, "underline", jSONObject, f43164q2);
        if (bVar33 == null) {
            bVar33 = f43168s0;
        }
        v9.b<f4> bVar34 = bVar33;
        v9.b<n8> bVar35 = (v9.b) y8.c0.H(this.W, cVar, "visibility", jSONObject, f43167r2);
        if (bVar35 == null) {
            bVar35 = f43171t0;
        }
        v9.b<n8> bVar36 = bVar35;
        o8 o8Var = (o8) y8.c0.K(this.X, cVar, "visibility_action", jSONObject, f43170s2);
        List listL11 = y8.c0.L(this.Y, cVar, "visibility_actions", jSONObject, f43172t1, f43173t2);
        l6 l6Var3 = (l6) y8.c0.K(this.Z, cVar, "width", jSONObject, f43176u2);
        if (l6Var3 == null) {
            l6Var3 = f43174u0;
        }
        return new l7(oVar2, qVar, vVar2, listL, bVar, bVar2, bVar4, bVar5, listL2, k0Var2, bVar6, listL3, listL4, lVar, listL5, n2Var, bVar7, bVar9, bVar11, bVar13, bVar15, l6Var2, str, listL6, bVar17, bVar18, listL7, x1Var2, bVar19, bVar20, x1Var4, listL8, bVar21, bVar23, listL9, bVar25, bVar26, bVar28, bVar30, bVar32, m7Var, listL10, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar34, bVar36, o8Var, listL11, l6Var3);
    }
}
