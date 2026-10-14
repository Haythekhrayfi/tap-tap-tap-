package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x0 implements u9.a, u9.b<w0> {
    public static final h9.g<y9.q> A0;
    public static final h9.g<y9.s> B0;
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
    public static final v9.b<y0> R;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> R0;
    public static final v9.b<z0> S;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> S0;
    public static final l6.e T;
    public static final uc.q<String, JSONObject, u9.c, y9.c0> T0;
    public static final v9.b<w0.i> U;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> U0;
    public static final x1 V;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> V0;
    public static final v9.b<w0.j> W;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> W0;
    public static final x1 X;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y0>> X0;
    public static final z7 Y;
    public static final uc.q<String, JSONObject, u9.c, v9.b<z0>> Y0;
    public static final v9.b<n8> Z;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final l6.d f43875a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f43876a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.k<y9.t> f43877b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<z1>> f43878b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<y9.u> f43879c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, n2> f43880c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<y0> f43881d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f43882d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<z0> f43883e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f43884e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<w0.i> f43885f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.k>> f43886f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<w0.j> f43887g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w0.i>> f43888g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.k<n8> f43889h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, w0.k> f43890h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<y9.q> f43891i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f43892i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<y9.s> f43893j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f43894j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Double> f43895k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w0.j>> f43896k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<Double> f43897l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x1> f43898l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<y9.e0> f43899m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f43900m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<y9.f0> f43901n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f43902n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f43903o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, w0.k> f43904o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<Long> f43905p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<x7>> f43906p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<q1> f43907q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, z7> f43908q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<s1> f43909r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.r0> f43910r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<y9.q> f43911s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f43912s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<y9.s> f43913t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.a0> f43914t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<z1> f43915u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<c8>> f43916u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<a2> f43917v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> f43918v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<String> f43919w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f43920w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<String> f43921x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f43922x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<y9.k> f43923y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f43924y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.g<i7> f43925z0;
    public final j9.a<v9.b<Long>> A;
    public final j9.a<List<y9.s>> B;
    public final j9.a<v0> C;
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
    public final j9.a<y9.p> f43926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<y9.s> f43927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<y9.x> f43928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f43930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f43931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<y9.d0> f43933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f43934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<y9.l0> f43935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<v9.b<y0>> f43937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<v9.b<z0>> f43938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<List<s1>> f43939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43940o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<List<a2>> f43941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<o2> f43942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<m6> f43943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<String> f43944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<List<i7>> f43945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<w0.i>> f43946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<v0> f43947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<y1> f43949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<v9.b<w0.j>> f43950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<y1> f43951z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43952c = new a();

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
            return oVar == null ? x0.N : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f43953c = new a0();

        public a0() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, x0.D0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43954c = new b();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, x0.f43891i0, cVar2.a(), cVar2);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f43955c = new b0();

        public b0() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, x0.E0, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43956c = new c();

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
            return vVar == null ? x0.O : vVar;
        }
    }

    public static final class c0 extends vc.l implements uc.q<String, JSONObject, u9.c, w0.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f43957c = new c0();

        public c0() {
            super(3);
        }

        @Override // uc.q
        public w0.k b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w0.k.f43654e);
            return (w0.k) h9.c.n(jSONObject2, str2, w0.k.f43659j, cVar2.a(), cVar2);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43958c = new d();

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
        public static final d0 f43959c = new d0();

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
            return h9.c.w(jSONObject2, str2, x7.f44173m, x0.G0, cVar2.a(), cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f43960c = new e();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, x0.f43877b0);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f43961c = new e0();

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
            return z7Var == null ? x0.Y : z7Var;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43962c = new f();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, x0.f43879c0);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f43963c = new f0();

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
        public static final g f43964c = new g();

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
            h9.m<Double> mVar = x0.f43897l0;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = x0.P;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f43965c = new g0();

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
        public static final h f43966c = new h();

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
        public static final h0 f43967c = new h0();

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
        public static final i f43968c = new i();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, x0.f43899m0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f43969c = new i0();

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
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, x0.I0, cVar2.a(), cVar2);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f43970c = new j();

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
            return k0Var == null ? x0.Q : k0Var;
        }
    }

    public static final class j0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f43971c = new j0();

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
        public static final k f43972c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, x0.f43905p0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class k0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f43973c = new k0();

        public k0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f43974c = new l();

        public l() {
            super(3);
        }

        @Override // uc.q
        public v9.b<y0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y0.Converter);
            uc.l lVar = y0.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<y0> bVar = x0.R;
            v9.b<y0> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x0.f43881d0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class l0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f43975c = new l0();

        public l0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y0);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<z0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f43976c = new m();

        public m() {
            super(3);
        }

        @Override // uc.q
        public v9.b<z0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z0.Converter);
            uc.l lVar = z0.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<z0> bVar = x0.S;
            v9.b<z0> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x0.f43883e0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class m0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f43977c = new m0();

        public m0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof z0);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f43978c = new n();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, x0.f43907q0, cVar2.a(), cVar2);
        }
    }

    public static final class n0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f43979c = new n0();

        public n0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w0.i);
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f43980c = new o();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, x0.f43911s0, cVar2.a(), cVar2);
        }
    }

    public static final class o0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f43981c = new o0();

        public o0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w0.j);
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f43982c = new p();

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
            return h9.c.w(jSONObject2, str2, z1.f44584e, x0.f43915u0, cVar2.a(), cVar2);
        }
    }

    public static final class p0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f43983c = new p0();

        public p0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f43984c = new q();

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

    public static final class q0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f43985c = new q0();

        public q0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, x0.K0, cVar2.a(), cVar2);
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f43986c = new r();

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
            return l6Var == null ? x0.T : l6Var;
        }
    }

    public static final class r0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f43987c = new r0();

        public r0() {
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

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f43988c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, x0.f43921x0, cVar2.a());
        }
    }

    public static final class s0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s0 f43989c = new s0();

        public s0() {
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
            v9.b<n8> bVar = x0.Z;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x0.f43889h0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.k>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f43990c = new t();

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
            List<y9.k> listL = h9.c.l(jSONObject2, str2, y9.k.f40974b, x0.f43923y0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, Div.…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class t0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t0 f43991c = new t0();

        public t0() {
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
            return l6Var == null ? x0.f43875a0 : l6Var;
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w0.i>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f43992c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public v9.b<w0.i> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w0.i.Converter);
            uc.l lVar = w0.i.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<w0.i> bVar = x0.U;
            v9.b<w0.i> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x0.f43885f0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class u0 {
        public u0() {
        }

        public u0(vc.g gVar) {
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, w0.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f43993c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public w0.k b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w0.k.f43654e);
            return (w0.k) h9.c.n(jSONObject2, str2, w0.k.f43659j, cVar2.a(), cVar2);
        }
    }

    public static class v0 implements u9.a, u9.b<w0.k> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f43994f = new g(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final x1 f43995g = new x1(null, null, null, null, null, 31, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final v9.b<Boolean> f43996h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v9.b<Boolean> f43997i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final v9.b<Boolean> f43998j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, x1> f43999k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f44000l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f44001m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f44002n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v1> f44003o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, v0> f44004p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<y1> f44005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<Boolean>> f44006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<Boolean>> f44007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<v9.b<Boolean>> f44008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<w1> f44009e;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, v0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f44010c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public v0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new v0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f44011c = new b();

            public b() {
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
                return x1Var == null ? v0.f43995g : x1Var;
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f44012c = new c();

            public c() {
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
                v9.b<Boolean> bVar = v0.f43996h;
                v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f44013c = new d();

            public d() {
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
                v9.b<Boolean> bVar = v0.f43997i;
                v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f44014c = new e();

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
                v9.b<Boolean> bVar = v0.f43998j;
                v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f44015c = new f();

            public f() {
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

        public static final class g {
            public g() {
            }

            public g(vc.g gVar) {
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            Boolean bool = Boolean.FALSE;
            f43996h = aVar.a(bool);
            f43997i = aVar.a(bool);
            f43998j = aVar.a(Boolean.TRUE);
            f43999k = b.f44011c;
            f44000l = c.f44012c;
            f44001m = d.f44013c;
            f44002n = e.f44014c;
            f44003o = f.f44015c;
            f44004p = a.f44010c;
        }

        public v0(u9.c cVar, v0 v0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<y1> aVar = v0Var == null ? null : v0Var.f44005a;
            Objects.requireNonNull(y1.f44196f);
            j9.a<y1> aVarO = h9.e.o(jSONObject, "margins", z10, aVar, y1.f44216z, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f44005a = aVarO;
            j9.a<v9.b<Boolean>> aVar2 = v0Var == null ? null : v0Var.f44006b;
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            h9.k<Boolean> kVar = h9.l.f30997a;
            j9.a<v9.b<Boolean>> aVarS = h9.e.s(jSONObject, "show_at_end", z10, aVar2, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
            this.f44006b = aVarS;
            j9.a<v9.b<Boolean>> aVarS2 = h9.e.s(jSONObject, "show_at_start", z10, v0Var == null ? null : v0Var.f44007c, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS2, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
            this.f44007c = aVarS2;
            j9.a<v9.b<Boolean>> aVarS3 = h9.e.s(jSONObject, "show_between", z10, v0Var == null ? null : v0Var.f44008d, lVar, eVarA, cVar, kVar);
            fd.j0.h(aVarS3, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
            this.f44008d = aVarS3;
            j9.a<w1> aVar3 = v0Var == null ? null : v0Var.f44009e;
            Objects.requireNonNull(w1.f43665a);
            this.f44009e = h9.e.f(jSONObject, "style", z10, aVar3, w1.f43666b, eVarA, cVar);
        }

        public /* synthetic */ v0(u9.c cVar, v0 v0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : v0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            x1 x1Var = (x1) y8.c0.K(this.f44005a, cVar, "margins", jSONObject, f43999k);
            if (x1Var == null) {
                x1Var = f43995g;
            }
            x1 x1Var2 = x1Var;
            v9.b<Boolean> bVar = (v9.b) y8.c0.H(this.f44006b, cVar, "show_at_end", jSONObject, f44000l);
            if (bVar == null) {
                bVar = f43996h;
            }
            v9.b<Boolean> bVar2 = bVar;
            v9.b<Boolean> bVar3 = (v9.b) y8.c0.H(this.f44007c, cVar, "show_at_start", jSONObject, f44001m);
            if (bVar3 == null) {
                bVar3 = f43997i;
            }
            v9.b<Boolean> bVar4 = bVar3;
            v9.b<Boolean> bVar5 = (v9.b) y8.c0.H(this.f44008d, cVar, "show_between", jSONObject, f44002n);
            if (bVar5 == null) {
                bVar5 = f43998j;
            }
            return new w0.k(x1Var2, bVar2, bVar4, bVar5, (v1) y8.c0.M(this.f44009e, cVar, "style", jSONObject, f44003o));
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f44016c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, x0.A0, cVar2.a(), cVar2);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f44017c = new x();

        public x() {
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
            return x1Var == null ? x0.V : x1Var;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w0.j>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f44018c = new y();

        public y() {
            super(3);
        }

        @Override // uc.q
        public v9.b<w0.j> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w0.j.Converter);
            uc.l lVar = w0.j.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<w0.j> bVar = x0.W;
            v9.b<w0.j> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x0.f43887g0);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f44019c = new z();

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
            return x1Var == null ? x0.X : x1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new u0(null);
        vc.g gVar = null;
        N = new y9.o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(y9.v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        O = new y9.v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        P = aVar.a(dValueOf);
        v9.b bVar2 = null;
        Q = new y9.k0(null, null, null, null, null, 31, null);
        R = aVar.a(y0.LEFT);
        S = aVar.a(z0.TOP);
        T = new l6.e(new q8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        U = aVar.a(w0.i.NO_WRAP);
        v9.b bVar3 = null;
        int i10 = 31;
        V = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, bVar3, null == true ? 1 : 0, i10, gVar);
        W = aVar.a(w0.j.VERTICAL);
        X = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, bVar3, null == true ? 1 : 0, i10, gVar);
        Y = new z7(null, null, bVar, 7, null);
        Z = aVar.a(n8.VISIBLE);
        f43875a0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i11 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        j0 j0Var = j0.f43971c;
        fd.j0.i(objQ, "default");
        fd.j0.i(j0Var, "validator");
        f43877b0 = new h9.k.a.C0302a(objQ, j0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        k0 k0Var = k0.f43973c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(k0Var, "validator");
        f43879c0 = new h9.k.a.C0302a(objQ2, k0Var);
        Object objQ3 = kc.j.q(y0.values());
        l0 l0Var = l0.f43975c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(l0Var, "validator");
        f43881d0 = new h9.k.a.C0302a(objQ3, l0Var);
        Object objQ4 = kc.j.q(z0.values());
        m0 m0Var = m0.f43977c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(m0Var, "validator");
        f43883e0 = new h9.k.a.C0302a(objQ4, m0Var);
        Object objQ5 = kc.j.q(w0.i.values());
        n0 n0Var = n0.f43979c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(n0Var, "validator");
        f43885f0 = new h9.k.a.C0302a(objQ5, n0Var);
        Object objQ6 = kc.j.q(w0.j.values());
        o0 o0Var = o0.f43981c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(o0Var, "validator");
        f43887g0 = new h9.k.a.C0302a(objQ6, o0Var);
        Object objQ7 = kc.j.q(n8.values());
        p0 p0Var = p0.f43983c;
        fd.j0.i(objQ7, "default");
        fd.j0.i(p0Var, "validator");
        f43889h0 = new h9.k.a.C0302a(objQ7, p0Var);
        f43891i0 = y9.n0.f41615o;
        f43893j0 = y9.v0.f43407l;
        f43895k0 = y9.n0.f41626z;
        f43897l0 = y9.v0.f43413r;
        f43899m0 = y9.n0.A;
        f43901n0 = y9.v0.f43414s;
        f43903o0 = y9.n0.B;
        f43905p0 = y9.v0.f43415t;
        f43907q0 = y9.n0.C;
        f43909r0 = y9.v0.f43416u;
        f43911s0 = y9.v0.f43402g;
        f43913t0 = y9.n0.f41616p;
        f43915u0 = y9.v0.f43403h;
        f43917v0 = y9.n0.f41617q;
        f43919w0 = y9.v0.f43404i;
        f43921x0 = y9.n0.f41618r;
        f43923y0 = y9.v0.f43405j;
        f43925z0 = y9.n0.f41619s;
        A0 = y9.v0.f43406k;
        B0 = y9.n0.f41620t;
        C0 = y9.n0.f41621u;
        D0 = y9.v0.f43408m;
        E0 = y9.n0.f41622v;
        F0 = y9.v0.f43409n;
        G0 = y9.n0.f41623w;
        H0 = y9.v0.f43410o;
        I0 = y9.n0.f41624x;
        J0 = y9.v0.f43411p;
        K0 = y9.n0.f41625y;
        L0 = y9.v0.f43412q;
        M0 = a.f43952c;
        N0 = d.f43958c;
        O0 = c.f43956c;
        P0 = b.f43954c;
        Q0 = e.f43960c;
        R0 = f.f43962c;
        S0 = g.f43964c;
        T0 = h.f43966c;
        U0 = i.f43968c;
        V0 = j.f43970c;
        W0 = k.f43972c;
        X0 = l.f43974c;
        Y0 = m.f43976c;
        Z0 = n.f43978c;
        f43876a1 = o.f43980c;
        f43878b1 = p.f43982c;
        f43880c1 = q.f43984c;
        f43882d1 = r.f43986c;
        f43884e1 = s.f43988c;
        f43886f1 = t.f43990c;
        f43888g1 = u.f43992c;
        f43890h1 = v.f43993c;
        f43892i1 = w.f44016c;
        f43894j1 = x.f44017c;
        f43896k1 = y.f44018c;
        f43898l1 = z.f44019c;
        f43900m1 = a0.f43953c;
        f43902n1 = b0.f43955c;
        f43904o1 = c0.f43957c;
        f43906p1 = d0.f43959c;
        f43908q1 = e0.f43961c;
        f43910r1 = f0.f43963c;
        f43912s1 = g0.f43965c;
        f43914t1 = h0.f43967c;
        f43916u1 = i0.f43969c;
        f43918v1 = s0.f43989c;
        f43920w1 = r0.f43987c;
        f43922x1 = q0.f43985c;
        f43924y1 = t0.f43991c;
    }

    public x0(u9.c cVar, x0 x0Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = x0Var == null ? null : x0Var.f43926a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43926a = aVarO;
        j9.a<y9.s> aVar2 = x0Var == null ? null : x0Var.f43927b;
        y9.s.k kVar = y9.s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<y9.s> aVarO2 = h9.e.o(jSONObject, "action", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43927b = aVarO2;
        j9.a<y9.x> aVar3 = x0Var == null ? null : x0Var.f43928c;
        Objects.requireNonNull(y9.x.f43838i);
        j9.a<y9.x> aVarO3 = h9.e.o(jSONObject, "action_animation", z10, aVar3, y9.x.D, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43928c = aVarO3;
        j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, x0Var == null ? null : x0Var.f43929d, pVar, f43893j0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43929d = aVarU;
        j9.a<v9.b<y9.t>> aVar4 = x0Var == null ? null : x0Var.f43930e;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar4, y9.t.FROM_STRING, eVarA, cVar, f43877b0);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f43930e = aVarS;
        j9.a<v9.b<y9.u>> aVar5 = x0Var == null ? null : x0Var.f43931f;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar5, y9.u.FROM_STRING, eVarA, cVar, f43879c0);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f43931f = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, x0Var == null ? null : x0Var.f43932g, h9.h.f30981d, f43895k0, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43932g = aVarR;
        j9.a<y9.d0> aVar6 = x0Var == null ? null : x0Var.f43933h;
        Objects.requireNonNull(y9.d0.f39549b);
        j9.a<y9.d0> aVarO4 = h9.e.o(jSONObject, "aspect", z10, aVar6, y9.d0.f39553f, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43933h = aVarO4;
        j9.a<List<y9.f0>> aVar7 = x0Var == null ? null : x0Var.f43934i;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU2 = h9.e.u(jSONObject, "background", z10, aVar7, y9.f0.f39919b, f43901n0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43934i = aVarU2;
        j9.a<y9.l0> aVar8 = x0Var == null ? null : x0Var.f43935j;
        Objects.requireNonNull(y9.l0.f41168f);
        j9.a<y9.l0> aVarO5 = h9.e.o(jSONObject, "border", z10, aVar8, y9.l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43935j = aVarO5;
        j9.a<v9.b<Long>> aVar9 = x0Var == null ? null : x0Var.f43936k;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f43903o0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar9, lVar, mVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43936k = aVarR2;
        j9.a<v9.b<y0>> aVar10 = x0Var == null ? null : x0Var.f43937l;
        Objects.requireNonNull(y0.Converter);
        j9.a<v9.b<y0>> aVarS3 = h9.e.s(jSONObject, "content_alignment_horizontal", z10, aVar10, y0.FROM_STRING, eVarA, cVar, f43881d0);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…ENT_ALIGNMENT_HORIZONTAL)");
        this.f43937l = aVarS3;
        j9.a<v9.b<z0>> aVar11 = x0Var == null ? null : x0Var.f43938m;
        Objects.requireNonNull(z0.Converter);
        j9.a<v9.b<z0>> aVarS4 = h9.e.s(jSONObject, "content_alignment_vertical", z10, aVar11, z0.FROM_STRING, eVarA, cVar, f43883e0);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…NTENT_ALIGNMENT_VERTICAL)");
        this.f43938m = aVarS4;
        j9.a<List<s1>> aVar12 = x0Var == null ? null : x0Var.f43939n;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar12, s1.C, f43909r0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43939n = aVarU3;
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "doubletap_actions", z10, x0Var == null ? null : x0Var.f43940o, pVar, f43913t0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43940o = aVarU4;
        j9.a<List<a2>> aVar13 = x0Var == null ? null : x0Var.f43941p;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar13, a2.f39002h, f43917v0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43941p = aVarU5;
        j9.a<o2> aVar14 = x0Var == null ? null : x0Var.f43942q;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO6 = h9.e.o(jSONObject, "focus", z10, aVar14, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43942q = aVarO6;
        j9.a<m6> aVar15 = x0Var == null ? null : x0Var.f43943r;
        Objects.requireNonNull(m6.f41448a);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO7 = h9.e.o(jSONObject, "height", z10, aVar15, pVar2, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43943r = aVarO7;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, x0Var == null ? null : x0Var.f43944s, f43919w0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f43944s = aVarL;
        j9.a<List<i7>> aVar16 = x0Var == null ? null : x0Var.f43945t;
        Objects.requireNonNull(i7.f40616a);
        this.f43945t = h9.e.k(jSONObject, "items", z10, aVar16, i7.f40617b, f43925z0, eVarA, cVar);
        j9.a<v9.b<w0.i>> aVar17 = x0Var == null ? null : x0Var.f43946u;
        Objects.requireNonNull(w0.i.Converter);
        j9.a<v9.b<w0.i>> aVarS5 = h9.e.s(jSONObject, "layout_mode", z10, aVar17, w0.i.FROM_STRING, eVarA, cVar, f43885f0);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp… TYPE_HELPER_LAYOUT_MODE)");
        this.f43946u = aVarS5;
        j9.a<v0> aVar18 = x0Var == null ? null : x0Var.f43947v;
        Objects.requireNonNull(v0.f43994f);
        uc.p<u9.c, JSONObject, v0> pVar3 = v0.f44004p;
        j9.a<v0> aVarO8 = h9.e.o(jSONObject, "line_separator", z10, aVar18, pVar3, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43947v = aVarO8;
        j9.a<List<y9.s>> aVarU6 = h9.e.u(jSONObject, "longtap_actions", z10, x0Var == null ? null : x0Var.f43948w, pVar, B0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43948w = aVarU6;
        j9.a<y1> aVar19 = x0Var == null ? null : x0Var.f43949x;
        Objects.requireNonNull(y1.f44196f);
        uc.p<u9.c, JSONObject, y1> pVar4 = y1.f44216z;
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "margins", z10, aVar19, pVar4, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43949x = aVarO9;
        j9.a<v9.b<w0.j>> aVar20 = x0Var == null ? null : x0Var.f43950y;
        Objects.requireNonNull(w0.j.Converter);
        j9.a<v9.b<w0.j>> aVarS6 = h9.e.s(jSONObject, "orientation", z10, aVar20, w0.j.FROM_STRING, eVarA, cVar, f43887g0);
        fd.j0.h(aVarS6, "readOptionalFieldWithExp… TYPE_HELPER_ORIENTATION)");
        this.f43950y = aVarS6;
        j9.a<y1> aVarO10 = h9.e.o(jSONObject, "paddings", z10, x0Var == null ? null : x0Var.f43951z, pVar4, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43951z = aVarO10;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, x0Var == null ? null : x0Var.A, lVar, C0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.A = aVarR3;
        j9.a<List<y9.s>> aVar21 = x0Var == null ? null : x0Var.B;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "selected_actions", z10, aVar21, pVar, F0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.B = aVarU7;
        j9.a<v0> aVarO11 = h9.e.o(jSONObject, "separator", z10, x0Var == null ? null : x0Var.C, pVar3, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.C = aVarO11;
        j9.a<List<y7>> aVar22 = x0Var == null ? null : x0Var.D;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU8 = h9.e.u(jSONObject, "tooltips", z10, aVar22, y7.f44555v, H0, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.D = aVarU8;
        j9.a<a8> aVar23 = x0Var == null ? null : x0Var.E;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO12 = h9.e.o(jSONObject, "transform", z10, aVar23, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.E = aVarO12;
        j9.a<y9.s0> aVar24 = x0Var == null ? null : x0Var.F;
        Objects.requireNonNull(y9.s0.f42435a);
        j9.a<y9.s0> aVarO13 = h9.e.o(jSONObject, "transition_change", z10, aVar24, y9.s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO13;
        j9.a<y9.b0> aVar25 = x0Var == null ? null : x0Var.G;
        Objects.requireNonNull(y9.b0.f39111a);
        uc.p<u9.c, JSONObject, y9.b0> pVar5 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO14 = h9.e.o(jSONObject, "transition_in", z10, aVar25, pVar5, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.G = aVarO14;
        j9.a<y9.b0> aVarO15 = h9.e.o(jSONObject, "transition_out", z10, x0Var == null ? null : x0Var.H, pVar5, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.H = aVarO15;
        j9.a<List<c8>> aVar26 = x0Var == null ? null : x0Var.I;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar26, c8.FROM_STRING, J0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.I = aVarT;
        j9.a<v9.b<n8>> aVar27 = x0Var == null ? null : x0Var.J;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS7 = h9.e.s(jSONObject, "visibility", z10, aVar27, n8.FROM_STRING, eVarA, cVar, f43889h0);
        fd.j0.h(aVarS7, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.J = aVarS7;
        j9.a<p8> aVar28 = x0Var == null ? null : x0Var.K;
        Objects.requireNonNull(p8.f42056i);
        uc.p<u9.c, JSONObject, p8> pVar6 = p8.C;
        j9.a<p8> aVarO16 = h9.e.o(jSONObject, "visibility_action", z10, aVar28, pVar6, eVarA, cVar);
        fd.j0.h(aVarO16, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.K = aVarO16;
        j9.a<List<p8>> aVarU9 = h9.e.u(jSONObject, "visibility_actions", z10, x0Var == null ? null : x0Var.L, pVar6, L0, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.L = aVarU9;
        j9.a<m6> aVarO17 = h9.e.o(jSONObject, "width", z10, x0Var == null ? null : x0Var.M, pVar2, eVarA, cVar);
        fd.j0.h(aVarO17, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.M = aVarO17;
    }

    public /* synthetic */ x0(u9.c cVar, x0 x0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : x0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f43926a, cVar, "accessibility", jSONObject, M0);
        if (oVar == null) {
            oVar = N;
        }
        y9.o oVar2 = oVar;
        y9.q qVar = (y9.q) y8.c0.K(this.f43927b, cVar, "action", jSONObject, N0);
        y9.v vVar = (y9.v) y8.c0.K(this.f43928c, cVar, "action_animation", jSONObject, O0);
        if (vVar == null) {
            vVar = O;
        }
        y9.v vVar2 = vVar;
        List listL = y8.c0.L(this.f43929d, cVar, "actions", jSONObject, f43891i0, P0);
        v9.b bVar = (v9.b) y8.c0.H(this.f43930e, cVar, "alignment_horizontal", jSONObject, Q0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f43931f, cVar, "alignment_vertical", jSONObject, R0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f43932g, cVar, "alpha", jSONObject, S0);
        if (bVar3 == null) {
            bVar3 = P;
        }
        v9.b<Double> bVar4 = bVar3;
        y9.c0 c0Var = (y9.c0) y8.c0.K(this.f43933h, cVar, "aspect", jSONObject, T0);
        List listL2 = y8.c0.L(this.f43934i, cVar, "background", jSONObject, f43899m0, U0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f43935j, cVar, "border", jSONObject, V0);
        if (k0Var == null) {
            k0Var = Q;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f43936k, cVar, "column_span", jSONObject, W0);
        v9.b<y0> bVar6 = (v9.b) y8.c0.H(this.f43937l, cVar, "content_alignment_horizontal", jSONObject, X0);
        if (bVar6 == null) {
            bVar6 = R;
        }
        v9.b<y0> bVar7 = bVar6;
        v9.b<z0> bVar8 = (v9.b) y8.c0.H(this.f43938m, cVar, "content_alignment_vertical", jSONObject, Y0);
        if (bVar8 == null) {
            bVar8 = S;
        }
        v9.b<z0> bVar9 = bVar8;
        List listL3 = y8.c0.L(this.f43939n, cVar, "disappear_actions", jSONObject, f43907q0, Z0);
        List listL4 = y8.c0.L(this.f43940o, cVar, "doubletap_actions", jSONObject, f43911s0, f43876a1);
        List listL5 = y8.c0.L(this.f43941p, cVar, "extensions", jSONObject, f43915u0, f43878b1);
        n2 n2Var = (n2) y8.c0.K(this.f43942q, cVar, "focus", jSONObject, f43880c1);
        l6 l6Var = (l6) y8.c0.K(this.f43943r, cVar, "height", jSONObject, f43882d1);
        if (l6Var == null) {
            l6Var = T;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f43944s, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, f43884e1);
        List listN = y8.c0.N(this.f43945t, cVar, "items", jSONObject, f43923y0, f43886f1);
        v9.b<w0.i> bVar10 = (v9.b) y8.c0.H(this.f43946u, cVar, "layout_mode", jSONObject, f43888g1);
        if (bVar10 == null) {
            bVar10 = U;
        }
        v9.b<w0.i> bVar11 = bVar10;
        w0.k kVar = (w0.k) y8.c0.K(this.f43947v, cVar, "line_separator", jSONObject, f43890h1);
        List listL6 = y8.c0.L(this.f43948w, cVar, "longtap_actions", jSONObject, A0, f43892i1);
        x1 x1Var = (x1) y8.c0.K(this.f43949x, cVar, "margins", jSONObject, f43894j1);
        if (x1Var == null) {
            x1Var = V;
        }
        x1 x1Var2 = x1Var;
        v9.b<w0.j> bVar12 = (v9.b) y8.c0.H(this.f43950y, cVar, "orientation", jSONObject, f43896k1);
        if (bVar12 == null) {
            bVar12 = W;
        }
        v9.b<w0.j> bVar13 = bVar12;
        x1 x1Var3 = (x1) y8.c0.K(this.f43951z, cVar, "paddings", jSONObject, f43898l1);
        if (x1Var3 == null) {
            x1Var3 = X;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar14 = (v9.b) y8.c0.H(this.A, cVar, "row_span", jSONObject, f43900m1);
        List listL7 = y8.c0.L(this.B, cVar, "selected_actions", jSONObject, E0, f43902n1);
        w0.k kVar2 = (w0.k) y8.c0.K(this.C, cVar, "separator", jSONObject, f43904o1);
        List listL8 = y8.c0.L(this.D, cVar, "tooltips", jSONObject, G0, f43906p1);
        z7 z7Var = (z7) y8.c0.K(this.E, cVar, "transform", jSONObject, f43908q1);
        if (z7Var == null) {
            z7Var = Y;
        }
        z7 z7Var2 = z7Var;
        y9.r0 r0Var = (y9.r0) y8.c0.K(this.F, cVar, "transition_change", jSONObject, f43910r1);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.G, cVar, "transition_in", jSONObject, f43912s1);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.H, cVar, "transition_out", jSONObject, f43914t1);
        List listJ = y8.c0.J(this.I, cVar, "transition_triggers", jSONObject, I0, f43916u1);
        v9.b<n8> bVar15 = (v9.b) y8.c0.H(this.J, cVar, "visibility", jSONObject, f43918v1);
        if (bVar15 == null) {
            bVar15 = Z;
        }
        v9.b<n8> bVar16 = bVar15;
        o8 o8Var = (o8) y8.c0.K(this.K, cVar, "visibility_action", jSONObject, f43920w1);
        List listL9 = y8.c0.L(this.L, cVar, "visibility_actions", jSONObject, K0, f43922x1);
        l6 l6Var3 = (l6) y8.c0.K(this.M, cVar, "width", jSONObject, f43924y1);
        if (l6Var3 == null) {
            l6Var3 = f43875a0;
        }
        return new w0(oVar2, qVar, vVar2, listL, bVar, bVar2, bVar4, c0Var, listL2, k0Var2, bVar5, bVar7, bVar9, listL3, listL4, listL5, n2Var, l6Var2, str, listN, bVar11, kVar, listL6, x1Var2, bVar13, x1Var4, bVar14, listL7, kVar2, listL8, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar16, o8Var, listL9, l6Var3);
    }
}
