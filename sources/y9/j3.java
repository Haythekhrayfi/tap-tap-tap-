package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j3 implements u9.a, u9.b<d3> {
    public static final h9.g<y9.q> A0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<h3>> A1;
    public static final h9.g<y9.s> B0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> B1;
    public static final h9.g<z1> C0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> C1;
    public static final h9.g<a2> D0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.h0>> D1;
    public static final h9.g<d2> E0;
    public static final uc.q<String, JSONObject, u9.c, List<x7>> E1;
    public static final h9.g<e2> F0;
    public static final uc.q<String, JSONObject, u9.c, z7> F1;
    public static final h9.m<String> G0;
    public static final uc.q<String, JSONObject, u9.c, y9.r0> G1;
    public static final h9.m<String> H0;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> H1;
    public static final h9.g<y9.q> I0;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> I1;
    public static final h9.g<y9.s> J0;
    public static final uc.q<String, JSONObject, u9.c, List<c8>> J1;
    public static final h9.m<String> K0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> K1;
    public static final h9.m<String> L0;
    public static final uc.q<String, JSONObject, u9.c, o8> L1;
    public static final h9.m<Long> M0;
    public static final uc.q<String, JSONObject, u9.c, List<o8>> M1;
    public static final h9.m<Long> N0;
    public static final uc.q<String, JSONObject, u9.c, l6> N1;
    public static final h9.g<y9.q> O0;
    public static final h9.g<y9.s> P0;
    public static final h9.g<x7> Q0;
    public static final h9.g<y7> R0;
    public static final y9.o S;
    public static final h9.g<c8> S0;
    public static final y9.v T;
    public static final h9.g<c8> T0;
    public static final v9.b<Double> U;
    public static final h9.g<o8> U0;
    public static final y9.k0 V;
    public static final h9.g<p8> V0;
    public static final v9.b<y9.t> W;
    public static final uc.q<String, JSONObject, u9.c, y9.o> W0;
    public static final v9.b<y9.u> X;
    public static final uc.q<String, JSONObject, u9.c, y9.q> X0;
    public static final l6.e Y;
    public static final uc.q<String, JSONObject, u9.c, y9.v> Y0;
    public static final v9.b<Boolean> Z;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final x1 f40774a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> f40775a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final x1 f40776b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> f40777b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final v9.b<Integer> f40778c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f40779c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final v9.b<Boolean> f40780d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, b2> f40781d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final v9.b<h3> f40782e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.c0> f40783e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final v9.b<y9.h0> f40784f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> f40785f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final z7 f40786g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.k0> f40787g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final v9.b<n8> f40788h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40789h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final l6.d f40790i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> f40791i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.k<y9.t> f40792j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> f40793j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.k<y9.u> f40794k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q1>> f40795k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.k<y9.t> f40796l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f40797l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.k<y9.u> f40798m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<z1>> f40799m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.k<h3> f40800n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<d2>> f40801n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.k<y9.h0> f40802o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, n2> f40803o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.k<n8> f40804p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f40805p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<y9.q> f40806q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f40807q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<y9.s> f40808r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f40809r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<Double> f40810s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f40811s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<Double> f40812t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f40813t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<y9.e0> f40814u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f40815u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<y9.f0> f40816v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f40817v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<Long> f40818w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f40819w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<Long> f40820x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f40821x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<q1> f40822y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40823y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<s1> f40824z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40825z1;
    public final j9.a<v9.b<Integer>> A;
    public final j9.a<v9.b<Boolean>> B;
    public final j9.a<v9.b<String>> C;
    public final j9.a<v9.b<Long>> D;
    public final j9.a<v9.b<h3>> E;
    public final j9.a<List<y9.s>> F;
    public final j9.a<v9.b<Integer>> G;
    public final j9.a<v9.b<y9.h0>> H;
    public final j9.a<List<y7>> I;
    public final j9.a<a8> J;
    public final j9.a<y9.s0> K;
    public final j9.a<y9.b0> L;
    public final j9.a<y9.b0> M;
    public final j9.a<List<c8>> N;
    public final j9.a<v9.b<n8>> O;
    public final j9.a<p8> P;
    public final j9.a<List<p8>> Q;
    public final j9.a<m6> R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f40826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<y9.s> f40827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<y9.x> f40828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<y9.s>> f40829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f40830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f40831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f40832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<c2> f40833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<y9.d0> f40834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f40835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<y9.l0> f40836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f40838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f40839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<s1>> f40840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<List<y9.s>> f40841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<List<a2>> f40842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<List<e2>> f40843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<o2> f40844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<m6> f40845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<String> f40847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f40848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<List<y9.s>> f40849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<y1> f40850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<y1> f40851z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40852c = new a();

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
            return oVar == null ? j3.S : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f40853c = new a0();

        public a0() {
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
            v9.b<Integer> bVar = j3.f40778c0;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40854c = new b();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, j3.f40806q0, cVar2.a(), cVar2);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f40855c = new b0();

        public b0() {
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
            v9.b<Boolean> bVar = j3.f40780d0;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40856c = new c();

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
            return vVar == null ? j3.T : vVar;
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f40857c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, j3.L0, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40858c = new d();

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
        public static final d0 f40859c = new d0();

        public d0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, j3.N0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f40860c = new e();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, j3.f40792j0);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<h3>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f40861c = new e0();

        public e0() {
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
            v9.b<h3> bVar = j3.f40782e0;
            v9.b<h3> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, j3.f40800n0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f40862c = new f();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, j3.f40794k0);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f40863c = new f0();

        public f0() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, j3.O0, cVar2.a(), cVar2);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f40864c = new g();

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
            h9.m<Double> mVar = j3.f40812t0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = j3.U;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f40865c = new g0();

        public g0() {
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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, b2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f40866c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public b2 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(b2.f39129e);
            return (b2) h9.c.n(jSONObject2, str2, b2.f39138n, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.h0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f40867c = new h0();

        public h0() {
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
            v9.b<y9.h0> bVar = j3.f40784f0;
            v9.b<y9.h0> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, j3.f40802o0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, y9.c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f40868c = new i();

        public i() {
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

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f40869c = new i0();

        public i0() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, j3.Q0, cVar2.a(), cVar2);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f40870c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public List<y9.e0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.e0.f39726a);
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, j3.f40814u0, cVar2.a(), cVar2);
        }
    }

    public static final class j0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f40871c = new j0();

        public j0() {
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
            return z7Var == null ? j3.f40786g0 : z7Var;
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f40872c = new k();

        public k() {
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
            return k0Var == null ? j3.V : k0Var;
        }
    }

    public static final class k0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f40873c = new k0();

        public k0() {
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

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f40874c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, j3.f40820x0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class l0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f40875c = new l0();

        public l0() {
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

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f40876c = new m();

        public m() {
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
            v9.b<y9.t> bVar = j3.W;
            v9.b<y9.t> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, j3.f40796l0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f40877c = new m0();

        public m0() {
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

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f40878c = new n();

        public n() {
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
            v9.b<y9.u> bVar = j3.X;
            v9.b<y9.u> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, j3.f40798m0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class n0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f40879c = new n0();

        public n0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, j3.S0, cVar2.a(), cVar2);
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f40880c = new o();

        public o() {
            super(3);
        }

        @Override // uc.q
        public List<q1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q1.f42118a);
            return h9.c.w(jSONObject2, str2, q1.f42126i, j3.f40822y0, cVar2.a(), cVar2);
        }
    }

    public static final class o0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f40881c = new o0();

        public o0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f40882c = new p();

        public p() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, j3.A0, cVar2.a(), cVar2);
        }
    }

    public static final class p0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f40883c = new p0();

        public p0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f40884c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, j3.C0, cVar2.a(), cVar2);
        }
    }

    public static final class q0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f40885c = new q0();

        public q0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, List<d2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f40886c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public List<d2> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(d2.f39560a);
            return h9.c.w(jSONObject2, str2, d2.f39561b, j3.E0, cVar2.a(), cVar2);
        }
    }

    public static final class r0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f40887c = new r0();

        public r0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f40888c = new s();

        public s() {
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

    public static final class s0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s0 f40889c = new s0();

        public s0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h3);
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f40890c = new t();

        public t() {
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
            return l6Var == null ? j3.Y : l6Var;
        }
    }

    public static final class t0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t0 f40891c = new t0();

        public t0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.h0);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f40892c = new u();

        public u() {
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
            v9.b<Boolean> bVar = j3.Z;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class u0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u0 f40893c = new u0();

        public u0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f40894c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, j3.H0, cVar2.a());
        }
    }

    public static final class v0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v0 f40895c = new v0();

        public v0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, j3.U0, cVar2.a(), cVar2);
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f40896c = new w();

        public w() {
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

    public static final class w0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w0 f40897c = new w0();

        public w0() {
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

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f40898c = new x();

        public x() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, j3.I0, cVar2.a(), cVar2);
        }
    }

    public static final class x0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x0 f40899c = new x0();

        public x0() {
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
            v9.b<n8> bVar = j3.f40788h0;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, j3.f40804p0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f40900c = new y();

        public y() {
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
            return x1Var == null ? j3.f40774a0 : x1Var;
        }
    }

    public static final class y0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y0 f40901c = new y0();

        public y0() {
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
            return l6Var == null ? j3.f40790i0 : l6Var;
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f40902c = new z();

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
            return x1Var == null ? j3.f40776b0 : x1Var;
        }
    }

    public static final class z0 {
        public z0() {
        }

        public z0(vc.g gVar) {
        }
    }

    static {
        new z0(null);
        S = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(y9.v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        T = new y9.v(bVarA, bVarA2, null, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        U = aVar.a(dValueOf);
        V = new y9.k0(null, null, null, null, null, 31, null);
        W = aVar.a(y9.t.CENTER);
        X = aVar.a(y9.u.CENTER);
        Y = new l6.e(new q8(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        Z = aVar.a(bool);
        f40774a0 = new x1(null, null, null, null, null, 31, null);
        f40776b0 = new x1(null, null, null, null, null, 31, null);
        f40778c0 = aVar.a(335544320);
        f40780d0 = aVar.a(bool);
        f40782e0 = aVar.a(h3.FILL);
        f40784f0 = aVar.a(y9.h0.SOURCE_IN);
        f40786g0 = new z7(null, null, null, 7, null);
        f40788h0 = aVar.a(n8.VISIBLE);
        f40790i0 = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        o0 o0Var = o0.f40881c;
        fd.j0.i(objQ, "default");
        fd.j0.i(o0Var, "validator");
        f40792j0 = new h9.k.a.C0302a(objQ, o0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        p0 p0Var = p0.f40883c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(p0Var, "validator");
        f40794k0 = new h9.k.a.C0302a(objQ2, p0Var);
        Object objQ3 = kc.j.q(y9.t.values());
        q0 q0Var = q0.f40885c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(q0Var, "validator");
        f40796l0 = new h9.k.a.C0302a(objQ3, q0Var);
        Object objQ4 = kc.j.q(y9.u.values());
        r0 r0Var = r0.f40887c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(r0Var, "validator");
        f40798m0 = new h9.k.a.C0302a(objQ4, r0Var);
        Object objQ5 = kc.j.q(h3.values());
        s0 s0Var = s0.f40889c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(s0Var, "validator");
        f40800n0 = new h9.k.a.C0302a(objQ5, s0Var);
        Object objQ6 = kc.j.q(y9.h0.values());
        t0 t0Var = t0.f40891c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(t0Var, "validator");
        f40802o0 = new h9.k.a.C0302a(objQ6, t0Var);
        Object objQ7 = kc.j.q(n8.values());
        u0 u0Var = u0.f40893c;
        fd.j0.i(objQ7, "default");
        fd.j0.i(u0Var, "validator");
        f40804p0 = new h9.k.a.C0302a(objQ7, u0Var);
        f40806q0 = b3.f39165x;
        f40808r0 = f3.f39939j;
        f40810s0 = i3.f40583g;
        f40812t0 = f3.f39946q;
        f40814u0 = i3.f40585i;
        f40816v0 = f3.f39947r;
        f40818w0 = i3.f40586j;
        f40820x0 = f3.f39948s;
        f40822y0 = i3.f40587k;
        f40824z0 = f3.f39949t;
        A0 = f3.f39934e;
        B0 = b3.f39166y;
        C0 = f3.f39935f;
        D0 = b3.f39167z;
        E0 = f3.f39936g;
        F0 = b3.A;
        G0 = f3.f39937h;
        H0 = b3.B;
        I0 = f3.f39938i;
        J0 = b3.C;
        K0 = b3.D;
        L0 = f3.f39940k;
        M0 = b3.E;
        N0 = f3.f39941l;
        O0 = i3.f40580d;
        P0 = f3.f39942m;
        Q0 = i3.f40581e;
        R0 = f3.f39943n;
        S0 = i3.f40582f;
        T0 = f3.f39944o;
        U0 = f3.f39945p;
        V0 = i3.f40584h;
        W0 = a.f40852c;
        X0 = d.f40858c;
        Y0 = c.f40856c;
        Z0 = b.f40854c;
        f40775a1 = e.f40860c;
        f40777b1 = f.f40862c;
        f40779c1 = g.f40864c;
        f40781d1 = h.f40866c;
        f40783e1 = i.f40868c;
        f40785f1 = j.f40870c;
        f40787g1 = k.f40872c;
        f40789h1 = l.f40874c;
        f40791i1 = m.f40876c;
        f40793j1 = n.f40878c;
        f40795k1 = o.f40880c;
        f40797l1 = p.f40882c;
        f40799m1 = q.f40884c;
        f40801n1 = r.f40886c;
        f40803o1 = s.f40888c;
        f40805p1 = t.f40890c;
        f40807q1 = u.f40892c;
        f40809r1 = v.f40894c;
        f40811s1 = w.f40896c;
        f40813t1 = x.f40898c;
        f40815u1 = y.f40900c;
        f40817v1 = z.f40902c;
        f40819w1 = a0.f40853c;
        f40821x1 = b0.f40855c;
        f40823y1 = c0.f40857c;
        f40825z1 = d0.f40859c;
        A1 = e0.f40861c;
        B1 = f0.f40863c;
        C1 = g0.f40865c;
        D1 = h0.f40867c;
        E1 = i0.f40869c;
        F1 = j0.f40871c;
        G1 = k0.f40873c;
        H1 = l0.f40875c;
        I1 = m0.f40877c;
        J1 = n0.f40879c;
        K1 = x0.f40899c;
        L1 = w0.f40897c;
        M1 = v0.f40895c;
        N1 = y0.f40901c;
    }

    public j3(u9.c cVar, j3 j3Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = j3Var == null ? null : j3Var.f40826a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40826a = aVarO;
        j9.a<y9.s> aVar2 = j3Var == null ? null : j3Var.f40827b;
        y9.s.k kVar = y9.s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<y9.s> aVarO2 = h9.e.o(jSONObject, "action", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40827b = aVarO2;
        j9.a<y9.x> aVar3 = j3Var == null ? null : j3Var.f40828c;
        Objects.requireNonNull(y9.x.f43838i);
        j9.a<y9.x> aVarO3 = h9.e.o(jSONObject, "action_animation", z10, aVar3, y9.x.D, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40828c = aVarO3;
        j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, j3Var == null ? null : j3Var.f40829d, pVar, f40808r0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40829d = aVarU;
        j9.a<v9.b<y9.t>> aVar4 = j3Var == null ? null : j3Var.f40830e;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar4, y9.t.FROM_STRING, eVarA, cVar, f40792j0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f40830e = aVarS;
        j9.a<v9.b<y9.u>> aVar5 = j3Var == null ? null : j3Var.f40831f;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar5, y9.u.FROM_STRING, eVarA, cVar, f40794k0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f40831f = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, j3Var == null ? null : j3Var.f40832g, h9.h.f30981d, f40810s0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f40832g = aVarR;
        j9.a<c2> aVar6 = j3Var == null ? null : j3Var.f40833h;
        Objects.requireNonNull(c2.f39372e);
        j9.a<c2> aVarO4 = h9.e.o(jSONObject, "appearance_animation", z10, aVar6, c2.f39388u, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40833h = aVarO4;
        j9.a<y9.d0> aVar7 = j3Var == null ? null : j3Var.f40834i;
        Objects.requireNonNull(y9.d0.f39549b);
        j9.a<y9.d0> aVarO5 = h9.e.o(jSONObject, "aspect", z10, aVar7, y9.d0.f39553f, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40834i = aVarO5;
        j9.a<List<y9.f0>> aVar8 = j3Var == null ? null : j3Var.f40835j;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU2 = h9.e.u(jSONObject, "background", z10, aVar8, y9.f0.f39919b, f40816v0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40835j = aVarU2;
        j9.a<y9.l0> aVar9 = j3Var == null ? null : j3Var.f40836k;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO6 = h9.e.o(jSONObject, "border", z10, aVar9, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40836k = aVarO6;
        j9.a<v9.b<Long>> aVar10 = j3Var == null ? null : j3Var.f40837l;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f40818w0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar10, lVar, mVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40837l = aVarR2;
        j9.a<v9.b<y9.t>> aVarS3 = h9.e.s(jSONObject, "content_alignment_horizontal", z10, j3Var == null ? null : j3Var.f40838m, y9.t.FROM_STRING, eVarA, cVar, f40796l0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…ENT_ALIGNMENT_HORIZONTAL)");
        this.f40838m = aVarS3;
        j9.a<v9.b<y9.u>> aVarS4 = h9.e.s(jSONObject, "content_alignment_vertical", z10, j3Var == null ? null : j3Var.f40839n, y9.u.FROM_STRING, eVarA, cVar, f40798m0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…NTENT_ALIGNMENT_VERTICAL)");
        this.f40839n = aVarS4;
        j9.a<List<s1>> aVar11 = j3Var == null ? null : j3Var.f40840o;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar11, s1.C, f40824z0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40840o = aVarU3;
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "doubletap_actions", z10, j3Var == null ? null : j3Var.f40841p, pVar, B0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40841p = aVarU4;
        j9.a<List<a2>> aVar12 = j3Var == null ? null : j3Var.f40842q;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar12, a2.f39002h, D0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40842q = aVarU5;
        j9.a<List<e2>> aVar13 = j3Var == null ? null : j3Var.f40843r;
        Objects.requireNonNull(e2.f39739a);
        j9.a<List<e2>> aVarU6 = h9.e.u(jSONObject, "filters", z10, aVar13, e2.f39740b, F0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40843r = aVarU6;
        j9.a<o2> aVar14 = j3Var == null ? null : j3Var.f40844s;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO7 = h9.e.o(jSONObject, "focus", z10, aVar14, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40844s = aVarO7;
        j9.a<m6> aVar15 = j3Var == null ? null : j3Var.f40845t;
        Objects.requireNonNull(m6.f41448a);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO8 = h9.e.o(jSONObject, "height", z10, aVar15, pVar2, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40845t = aVarO8;
        j9.a<v9.b<Boolean>> aVar16 = j3Var == null ? null : j3Var.f40846u;
        uc.l<Object, Boolean> lVar2 = h9.h.f30980c;
        h9.k<Boolean> kVar3 = h9.l.f30997a;
        j9.a<v9.b<Boolean>> aVarS5 = h9.e.s(jSONObject, "high_priority_preview_show", z10, aVar16, lVar2, eVarA, cVar, kVar3);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40846u = aVarS5;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, j3Var == null ? null : j3Var.f40847v, G0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f40847v = aVarL;
        this.f40848w = h9.e.j(jSONObject, "image_url", z10, j3Var == null ? null : j3Var.f40848w, h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "longtap_actions", z10, j3Var == null ? null : j3Var.f40849x, pVar, J0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40849x = aVarU7;
        j9.a<y1> aVar17 = j3Var == null ? null : j3Var.f40850y;
        Objects.requireNonNull(y1.f44196f);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "margins", z10, aVar17, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40850y = aVarO9;
        j9.a<y1> aVarO10 = h9.e.o(jSONObject, "paddings", z10, j3Var == null ? null : j3Var.f40851z, pVar3, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40851z = aVarO10;
        j9.a<v9.b<Integer>> aVar18 = j3Var == null ? null : j3Var.A;
        uc.l<Object, Integer> lVar3 = h9.h.f30978a;
        h9.k<Integer> kVar4 = h9.l.f31002f;
        j9.a<v9.b<Integer>> aVarS6 = h9.e.s(jSONObject, "placeholder_color", z10, aVar18, lVar3, eVarA, cVar, kVar4);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.A = aVarS6;
        j9.a<v9.b<Boolean>> aVarS7 = h9.e.s(jSONObject, "preload_required", z10, j3Var == null ? null : j3Var.B, lVar2, eVarA, cVar, kVar3);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.B = aVarS7;
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "preview", z10, j3Var == null ? null : j3Var.C, K0, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.C = aVarP;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, j3Var == null ? null : j3Var.D, lVar, M0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.D = aVarR3;
        j9.a<v9.b<h3>> aVar19 = j3Var == null ? null : j3Var.E;
        Objects.requireNonNull(h3.Converter);
        j9.a<v9.b<h3>> aVarS8 = h9.e.s(jSONObject, "scale", z10, aVar19, h3.FROM_STRING, eVarA, cVar, f40800n0);
        fd.j0.h(aVarS8, "readOptionalFieldWithExp…, env, TYPE_HELPER_SCALE)");
        this.E = aVarS8;
        j9.a<List<y9.s>> aVar20 = j3Var == null ? null : j3Var.F;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU8 = h9.e.u(jSONObject, "selected_actions", z10, aVar20, pVar, P0, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.F = aVarU8;
        j9.a<v9.b<Integer>> aVarS9 = h9.e.s(jSONObject, "tint_color", z10, j3Var == null ? null : j3Var.G, lVar3, eVarA, cVar, kVar4);
        fd.j0.h(aVarS9, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.G = aVarS9;
        j9.a<v9.b<y9.h0>> aVar21 = j3Var == null ? null : j3Var.H;
        Objects.requireNonNull(y9.h0.Converter);
        j9.a<v9.b<y9.h0>> aVarS10 = h9.e.s(jSONObject, "tint_mode", z10, aVar21, y9.h0.FROM_STRING, eVarA, cVar, f40802o0);
        fd.j0.h(aVarS10, "readOptionalFieldWithExp…v, TYPE_HELPER_TINT_MODE)");
        this.H = aVarS10;
        j9.a<List<y7>> aVar22 = j3Var == null ? null : j3Var.I;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU9 = h9.e.u(jSONObject, "tooltips", z10, aVar22, y7.f44555v, R0, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.I = aVarU9;
        j9.a<a8> aVar23 = j3Var == null ? null : j3Var.J;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO11 = h9.e.o(jSONObject, "transform", z10, aVar23, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.J = aVarO11;
        j9.a<y9.s0> aVar24 = j3Var == null ? null : j3Var.K;
        Objects.requireNonNull(y9.s0.f42435a);
        j9.a<y9.s0> aVarO12 = h9.e.o(jSONObject, "transition_change", z10, aVar24, y9.s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.K = aVarO12;
        j9.a<y9.b0> aVar25 = j3Var == null ? null : j3Var.L;
        Objects.requireNonNull(y9.b0.f39111a);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO13 = h9.e.o(jSONObject, "transition_in", z10, aVar25, pVar4, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.L = aVarO13;
        j9.a<y9.b0> aVarO14 = h9.e.o(jSONObject, "transition_out", z10, j3Var == null ? null : j3Var.M, pVar4, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.M = aVarO14;
        j9.a<List<c8>> aVar26 = j3Var == null ? null : j3Var.N;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar26, c8.FROM_STRING, T0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.N = aVarT;
        j9.a<v9.b<n8>> aVar27 = j3Var == null ? null : j3Var.O;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS11 = h9.e.s(jSONObject, "visibility", z10, aVar27, n8.FROM_STRING, eVarA, cVar, f40804p0);
        fd.j0.h(aVarS11, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.O = aVarS11;
        j9.a<p8> aVar28 = j3Var == null ? null : j3Var.P;
        Objects.requireNonNull(p8.f42056i);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO15 = h9.e.o(jSONObject, "visibility_action", z10, aVar28, pVar5, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.P = aVarO15;
        j9.a<List<p8>> aVarU10 = h9.e.u(jSONObject, "visibility_actions", z10, j3Var == null ? null : j3Var.Q, pVar5, V0, eVarA, cVar);
        fd.j0.h(aVarU10, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.Q = aVarU10;
        j9.a<m6> aVarO16 = h9.e.o(jSONObject, "width", z10, j3Var == null ? null : j3Var.R, pVar2, eVarA, cVar);
        fd.j0.h(aVarO16, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.R = aVarO16;
    }

    public /* synthetic */ j3(u9.c cVar, j3 j3Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : j3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f40826a, cVar, "accessibility", jSONObject, W0);
        if (oVar == null) {
            oVar = S;
        }
        y9.o oVar2 = oVar;
        y9.q qVar = (y9.q) y8.c0.K(this.f40827b, cVar, "action", jSONObject, X0);
        y9.v vVar = (y9.v) y8.c0.K(this.f40828c, cVar, "action_animation", jSONObject, Y0);
        if (vVar == null) {
            vVar = T;
        }
        y9.v vVar2 = vVar;
        List listL = y8.c0.L(this.f40829d, cVar, "actions", jSONObject, f40806q0, Z0);
        v9.b bVar = (v9.b) y8.c0.H(this.f40830e, cVar, "alignment_horizontal", jSONObject, f40775a1);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f40831f, cVar, "alignment_vertical", jSONObject, f40777b1);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f40832g, cVar, "alpha", jSONObject, f40779c1);
        if (bVar3 == null) {
            bVar3 = U;
        }
        v9.b<Double> bVar4 = bVar3;
        b2 b2Var = (b2) y8.c0.K(this.f40833h, cVar, "appearance_animation", jSONObject, f40781d1);
        y9.c0 c0Var = (y9.c0) y8.c0.K(this.f40834i, cVar, "aspect", jSONObject, f40783e1);
        List listL2 = y8.c0.L(this.f40835j, cVar, "background", jSONObject, f40814u0, f40785f1);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f40836k, cVar, "border", jSONObject, f40787g1);
        if (k0Var == null) {
            k0Var = V;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f40837l, cVar, "column_span", jSONObject, f40789h1);
        v9.b<y9.t> bVar6 = (v9.b) y8.c0.H(this.f40838m, cVar, "content_alignment_horizontal", jSONObject, f40791i1);
        if (bVar6 == null) {
            bVar6 = W;
        }
        v9.b<y9.t> bVar7 = bVar6;
        v9.b<y9.u> bVar8 = (v9.b) y8.c0.H(this.f40839n, cVar, "content_alignment_vertical", jSONObject, f40793j1);
        if (bVar8 == null) {
            bVar8 = X;
        }
        v9.b<y9.u> bVar9 = bVar8;
        List listL3 = y8.c0.L(this.f40840o, cVar, "disappear_actions", jSONObject, f40822y0, f40795k1);
        List listL4 = y8.c0.L(this.f40841p, cVar, "doubletap_actions", jSONObject, A0, f40797l1);
        List listL5 = y8.c0.L(this.f40842q, cVar, "extensions", jSONObject, C0, f40799m1);
        List listL6 = y8.c0.L(this.f40843r, cVar, "filters", jSONObject, E0, f40801n1);
        n2 n2Var = (n2) y8.c0.K(this.f40844s, cVar, "focus", jSONObject, f40803o1);
        l6 l6Var = (l6) y8.c0.K(this.f40845t, cVar, "height", jSONObject, f40805p1);
        if (l6Var == null) {
            l6Var = Y;
        }
        l6 l6Var2 = l6Var;
        v9.b<Boolean> bVar10 = (v9.b) y8.c0.H(this.f40846u, cVar, "high_priority_preview_show", jSONObject, f40807q1);
        if (bVar10 == null) {
            bVar10 = Z;
        }
        v9.b<Boolean> bVar11 = bVar10;
        String str = (String) y8.c0.H(this.f40847v, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f40809r1);
        v9.b bVar12 = (v9.b) y8.c0.E(this.f40848w, cVar, "image_url", jSONObject, f40811s1);
        List listL7 = y8.c0.L(this.f40849x, cVar, "longtap_actions", jSONObject, I0, f40813t1);
        x1 x1Var = (x1) y8.c0.K(this.f40850y, cVar, "margins", jSONObject, f40815u1);
        if (x1Var == null) {
            x1Var = f40774a0;
        }
        x1 x1Var2 = x1Var;
        x1 x1Var3 = (x1) y8.c0.K(this.f40851z, cVar, "paddings", jSONObject, f40817v1);
        if (x1Var3 == null) {
            x1Var3 = f40776b0;
        }
        x1 x1Var4 = x1Var3;
        v9.b<Integer> bVar13 = (v9.b) y8.c0.H(this.A, cVar, "placeholder_color", jSONObject, f40819w1);
        if (bVar13 == null) {
            bVar13 = f40778c0;
        }
        v9.b<Integer> bVar14 = bVar13;
        v9.b<Boolean> bVar15 = (v9.b) y8.c0.H(this.B, cVar, "preload_required", jSONObject, f40821x1);
        if (bVar15 == null) {
            bVar15 = f40780d0;
        }
        v9.b<Boolean> bVar16 = bVar15;
        v9.b bVar17 = (v9.b) y8.c0.H(this.C, cVar, "preview", jSONObject, f40823y1);
        v9.b bVar18 = (v9.b) y8.c0.H(this.D, cVar, "row_span", jSONObject, f40825z1);
        v9.b<h3> bVar19 = (v9.b) y8.c0.H(this.E, cVar, "scale", jSONObject, A1);
        if (bVar19 == null) {
            bVar19 = f40782e0;
        }
        v9.b<h3> bVar20 = bVar19;
        List listL8 = y8.c0.L(this.F, cVar, "selected_actions", jSONObject, O0, B1);
        v9.b bVar21 = (v9.b) y8.c0.H(this.G, cVar, "tint_color", jSONObject, C1);
        v9.b<y9.h0> bVar22 = (v9.b) y8.c0.H(this.H, cVar, "tint_mode", jSONObject, D1);
        if (bVar22 == null) {
            bVar22 = f40784f0;
        }
        v9.b<y9.h0> bVar23 = bVar22;
        List listL9 = y8.c0.L(this.I, cVar, "tooltips", jSONObject, Q0, E1);
        z7 z7Var = (z7) y8.c0.K(this.J, cVar, "transform", jSONObject, F1);
        if (z7Var == null) {
            z7Var = f40786g0;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.K, cVar, "transition_change", jSONObject, G1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.L, cVar, "transition_in", jSONObject, H1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.M, cVar, "transition_out", jSONObject, I1);
        List listJ = y8.c0.J(this.N, cVar, "transition_triggers", jSONObject, S0, J1);
        v9.b<n8> bVar24 = (v9.b) y8.c0.H(this.O, cVar, "visibility", jSONObject, K1);
        if (bVar24 == null) {
            bVar24 = f40788h0;
        }
        v9.b<n8> bVar25 = bVar24;
        o8 o8Var = (o8) y8.c0.K(this.P, cVar, "visibility_action", jSONObject, L1);
        List listL10 = y8.c0.L(this.Q, cVar, "visibility_actions", jSONObject, U0, M1);
        l6 l6Var3 = (l6) y8.c0.K(this.R, cVar, "width", jSONObject, N1);
        if (l6Var3 == null) {
            l6Var3 = f40790i0;
        }
        return new d3(oVar2, qVar, vVar2, listL, bVar, bVar2, bVar4, b2Var, c0Var, listL2, k0Var2, bVar5, bVar7, bVar9, listL3, listL4, listL5, listL6, n2Var, l6Var2, bVar11, str, bVar12, listL7, x1Var2, x1Var4, bVar14, bVar16, bVar17, bVar18, bVar20, listL8, bVar21, bVar23, listL9, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar25, o8Var, listL10, l6Var3);
    }
}
