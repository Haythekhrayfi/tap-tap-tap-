package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v4 implements u9.a, u9.b<r4> {
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> A0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> B0;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> C0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> D0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> E0;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> F0;
    public static final y9.o G;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> G0;
    public static final v9.b<Double> H;
    public static final uc.q<String, JSONObject, u9.c, n2> H0;
    public static final y9.k0 I;
    public static final uc.q<String, JSONObject, u9.c, l6> I0;
    public static final v9.b<Long> J;
    public static final uc.q<String, JSONObject, u9.c, String> J0;
    public static final l6.e K;
    public static final uc.q<String, JSONObject, u9.c, l2> K0;
    public static final l2 L;
    public static final uc.q<String, JSONObject, u9.c, List<y9.k>> L0;
    public static final x1 M;
    public static final uc.q<String, JSONObject, u9.c, s4> M0;
    public static final v9.b<r4.f> N;
    public static final uc.q<String, JSONObject, u9.c, x1> N0;
    public static final x1 O;
    public static final uc.q<String, JSONObject, u9.c, v9.b<r4.f>> O0;
    public static final v9.b<Boolean> P;
    public static final uc.q<String, JSONObject, u9.c, x1> P0;
    public static final z7 Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> Q0;
    public static final v9.b<n8> R;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> R0;
    public static final l6.d S;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> S0;
    public static final h9.k<y9.t> T;
    public static final uc.q<String, JSONObject, u9.c, List<x7>> T0;
    public static final h9.k<y9.u> U;
    public static final uc.q<String, JSONObject, u9.c, z7> U0;
    public static final h9.k<r4.f> V;
    public static final uc.q<String, JSONObject, u9.c, r0> V0;
    public static final h9.k<n8> W;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> W0;
    public static final h9.m<Double> X;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> X0;
    public static final h9.m<Double> Y;
    public static final uc.q<String, JSONObject, u9.c, List<c8>> Y0;
    public static final h9.g<y9.e0> Z;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.g<y9.f0> f43456a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o8> f43457a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.m<Long> f43458b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f43459b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<Long> f43460c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f43461c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.m<Long> f43462d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Long> f43463e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<q1> f43464f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<s1> f43465g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<z1> f43466h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<a2> f43467i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<String> f43468j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<String> f43469k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<y9.k> f43470l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<i7> f43471m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<Long> f43472n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f43473o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<y9.q> f43474p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<y9.s> f43475q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<x7> f43476r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<y7> f43477s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<c8> f43478t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<c8> f43479u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<o8> f43480v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<p8> f43481w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.o> f43482x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> f43483y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> f43484z0;
    public final j9.a<y9.b0> A;
    public final j9.a<List<c8>> B;
    public final j9.a<v9.b<n8>> C;
    public final j9.a<p8> D;
    public final j9.a<List<p8>> E;
    public final j9.a<m6> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f43485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f43486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f43487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f43488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f43489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<l0> f43490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<s1>> f43493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<List<a2>> f43494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<o2> f43495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<m6> f43496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<String> f43497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<m2> f43498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<List<i7>> f43499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<t4> f43500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<y1> f43501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<v9.b<r4.f>> f43502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<y1> f43503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f43504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f43505u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<List<y9.s>> f43506v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<List<y7>> f43507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<a8> f43508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<s0> f43509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<y9.b0> f43510z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43511c = new a();

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
            return oVar == null ? v4.G : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f43512c = new a0();

        public a0() {
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

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43513c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, v4.T);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f43514c = new b0();

        public b0() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, v4.f43478t0, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43515c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, v4.U);
        }
    }

    public static final class c0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f43516c = new c0();

        public c0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43517c = new d();

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
            h9.m<Double> mVar = v4.Y;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = v4.H;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f43518c = new d0();

        public d0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f43519c = new e();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, v4.Z, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f43520c = new e0();

        public e0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof r4.f);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43521c = new f();

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
            return k0Var == null ? v4.I : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f43522c = new f0();

        public f0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f43523c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, v4.f43460c0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f43524c = new g0();

        public g0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, v4.f43480v0, cVar2.a(), cVar2);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f43525c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = v4.f43463e0;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = v4.J;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f43526c = new h0();

        public h0() {
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

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f43527c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public List<q1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q1.f42118a);
            return h9.c.w(jSONObject2, str2, q1.f42126i, v4.f43464f0, cVar2.a(), cVar2);
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f43528c = new i0();

        public i0() {
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
            v9.b<n8> bVar = v4.R;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, v4.W);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f43529c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, v4.f43466h0, cVar2.a(), cVar2);
        }
    }

    public static final class j0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f43530c = new j0();

        public j0() {
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
            return l6Var == null ? v4.S : l6Var;
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f43531c = new k();

        public k() {
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

    public static final class k0 {
        public k0() {
        }

        public k0(vc.g gVar) {
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f43532c = new l();

        public l() {
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
            return l6Var == null ? v4.K : l6Var;
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f43533c = new m();

        public m() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, v4.f43469k0, cVar2.a());
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.k>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f43534c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public List<y9.k> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.k.f40973a);
            List<y9.k> listL = h9.c.l(jSONObject2, str2, y9.k.f40974b, v4.f43470l0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, Div.…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f43535c = new o();

        public o() {
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
            return l2Var == null ? v4.L : l2Var;
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, s4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f43536c = new p();

        public p() {
            super(3);
        }

        @Override // uc.q
        public s4 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(s4.f42563a);
            uc.p<u9.c, JSONObject, s4> pVar = s4.f42564b;
            cVar2.a();
            return (s4) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f43537c = new q();

        public q() {
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
            return x1Var == null ? v4.M : x1Var;
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<r4.f>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f43538c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public v9.b<r4.f> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(r4.f.Converter);
            uc.l lVar = r4.f.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<r4.f> bVar = v4.N;
            v9.b<r4.f> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, v4.V);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f43539c = new s();

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
            return x1Var == null ? v4.O : x1Var;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f43540c = new t();

        public t() {
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
            v9.b<Boolean> bVar = v4.P;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f43541c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, v4.f43473o0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f43542c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, v4.f43474p0, cVar2.a(), cVar2);
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f43543c = new w();

        public w() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, v4.f43476r0, cVar2.a(), cVar2);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f43544c = new x();

        public x() {
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
            return z7Var == null ? v4.Q : z7Var;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f43545c = new y();

        public y() {
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

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f43546c = new z();

        public z() {
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new k0(null);
        v9.b bVar = null;
        G = new y9.o(null, null, bVar, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        H = aVar.a(Double.valueOf(1.0d));
        I = new y9.k0(null, null, null, null, null, 31, null);
        J = aVar.a(0L);
        K = new l6.e(new q8(bVar, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        L = new l2(null, aVar.a(0L), 1, null);
        v9.b bVar2 = null;
        int i10 = 31;
        vc.g gVar = null;
        M = new x1(null == true ? 1 : 0, null == true ? 1 : 0, bVar2, null == true ? 1 : 0, null, i10, gVar);
        N = aVar.a(r4.f.HORIZONTAL);
        O = new x1(null == true ? 1 : 0, null == true ? 1 : 0, bVar2, null == true ? 1 : 0, null == true ? 1 : 0, i10, gVar);
        P = aVar.a(Boolean.FALSE);
        Q = new z7(null == true ? 1 : 0, null == true ? 1 : 0, bVar2, 7, null == true ? 1 : 0);
        R = aVar.a(n8.VISIBLE);
        S = new l6.d(new i4(null, 1, null));
        int i11 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        c0 c0Var = c0.f43516c;
        fd.j0.i(objQ, "default");
        fd.j0.i(c0Var, "validator");
        T = new h9.k.a.C0302a(objQ, c0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        d0 d0Var = d0.f43518c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(d0Var, "validator");
        U = new h9.k.a.C0302a(objQ2, d0Var);
        Object objQ3 = kc.j.q(r4.f.values());
        e0 e0Var = e0.f43520c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(e0Var, "validator");
        V = new h9.k.a.C0302a(objQ3, e0Var);
        Object objQ4 = kc.j.q(n8.values());
        f0 f0Var = f0.f43522c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(f0Var, "validator");
        W = new h9.k.a.C0302a(objQ4, f0Var);
        X = w3.C;
        Y = q4.f42138l;
        Z = u4.f43073j;
        f43456a0 = q4.f42142p;
        f43458b0 = u4.f43074k;
        f43460c0 = q4.f42143q;
        f43462d0 = u4.f43075l;
        f43463e0 = q4.f42144r;
        f43464f0 = u4.f43076m;
        f43465g0 = q4.f42145s;
        f43466h0 = q4.f42133g;
        f43467i0 = w3.D;
        f43468j0 = q4.f42134h;
        f43469k0 = w3.E;
        f43470l0 = q4.f42135i;
        f43471m0 = u4.f43067d;
        f43472n0 = q4.f42136j;
        f43473o0 = u4.f43068e;
        f43474p0 = q4.f42137k;
        f43475q0 = u4.f43069f;
        f43476r0 = u4.f43070g;
        f43477s0 = q4.f42139m;
        f43478t0 = u4.f43071h;
        f43479u0 = q4.f42140n;
        f43480v0 = u4.f43072i;
        f43481w0 = q4.f42141o;
        f43482x0 = a.f43511c;
        f43483y0 = b.f43513c;
        f43484z0 = c.f43515c;
        A0 = d.f43517c;
        B0 = e.f43519c;
        C0 = f.f43521c;
        D0 = g.f43523c;
        E0 = h.f43525c;
        F0 = i.f43527c;
        G0 = j.f43529c;
        H0 = k.f43531c;
        I0 = l.f43532c;
        J0 = m.f43533c;
        K0 = o.f43535c;
        L0 = n.f43534c;
        M0 = p.f43536c;
        N0 = q.f43537c;
        O0 = r.f43538c;
        P0 = s.f43539c;
        Q0 = t.f43540c;
        R0 = u.f43541c;
        S0 = v.f43542c;
        T0 = w.f43543c;
        U0 = x.f43544c;
        V0 = y.f43545c;
        W0 = z.f43546c;
        X0 = a0.f43512c;
        Y0 = b0.f43514c;
        Z0 = i0.f43528c;
        f43457a1 = h0.f43526c;
        f43459b1 = g0.f43524c;
        f43461c1 = j0.f43530c;
    }

    public v4(u9.c cVar, v4 v4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = v4Var == null ? null : v4Var.f43485a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43485a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = v4Var == null ? null : v4Var.f43486b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, T);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f43486b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = v4Var == null ? null : v4Var.f43487c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, U);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f43487c = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, v4Var == null ? null : v4Var.f43488d, h9.h.f30981d, X, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f43488d = aVarR;
        j9.a<List<y9.f0>> aVar4 = v4Var == null ? null : v4Var.f43489e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar4, y9.f0.f39919b, f43456a0, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43489e = aVarU;
        j9.a<l0> aVar5 = v4Var == null ? null : v4Var.f43490f;
        Objects.requireNonNull(l0.f41168f);
        j9.a<l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar5, l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43490f = aVarO2;
        j9.a<v9.b<Long>> aVar6 = v4Var == null ? null : v4Var.f43491g;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f43458b0;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar6, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43491g = aVarR2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "default_item", z10, v4Var == null ? null : v4Var.f43492h, lVar, f43462d0, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43492h = aVarR3;
        j9.a<List<s1>> aVar7 = v4Var == null ? null : v4Var.f43493i;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar7, s1.C, f43465g0, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43493i = aVarU2;
        j9.a<List<a2>> aVar8 = v4Var == null ? null : v4Var.f43494j;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar8, a2.f39002h, f43467i0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43494j = aVarU3;
        j9.a<o2> aVar9 = v4Var == null ? null : v4Var.f43495k;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar9, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43495k = aVarO3;
        j9.a<m6> aVar10 = v4Var == null ? null : v4Var.f43496l;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar10, pVar, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43496l = aVarO4;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, v4Var == null ? null : v4Var.f43497m, f43468j0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f43497m = aVarL;
        j9.a<m2> aVar11 = v4Var == null ? null : v4Var.f43498n;
        Objects.requireNonNull(m2.f41420c);
        j9.a<m2> aVarO5 = h9.e.o(jSONObject, "item_spacing", z10, aVar11, m2.f41427j, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43498n = aVarO5;
        j9.a<List<i7>> aVar12 = v4Var == null ? null : v4Var.f43499o;
        Objects.requireNonNull(i7.f40616a);
        this.f43499o = h9.e.k(jSONObject, "items", z10, aVar12, i7.f40617b, f43471m0, eVarA, cVar);
        j9.a<t4> aVar13 = v4Var == null ? null : v4Var.f43500p;
        Objects.requireNonNull(t4.f42747a);
        this.f43500p = h9.e.f(jSONObject, "layout_mode", z10, aVar13, t4.f42748b, eVarA, cVar);
        j9.a<y1> aVar14 = v4Var == null ? null : v4Var.f43501q;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar2 = y1.f44216z;
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "margins", z10, aVar14, pVar2, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43501q = aVarO6;
        j9.a<v9.b<r4.f>> aVar15 = v4Var == null ? null : v4Var.f43502r;
        Objects.requireNonNull(r4.f.Converter);
        j9.a<v9.b<r4.f>> aVarS3 = h9.e.s(jSONObject, "orientation", z10, aVar15, r4.f.FROM_STRING, eVarA, cVar, V);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp… TYPE_HELPER_ORIENTATION)");
        this.f43502r = aVarS3;
        j9.a<y1> aVar16 = v4Var == null ? null : v4Var.f43503s;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO7 = h9.e.o(jSONObject, "paddings", z10, aVar16, pVar2, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43503s = aVarO7;
        j9.a<v9.b<Boolean>> aVarS4 = h9.e.s(jSONObject, "restrict_parent_scroll", z10, v4Var == null ? null : v4Var.f43504t, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f43504t = aVarS4;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "row_span", z10, v4Var == null ? null : v4Var.f43505u, lVar, f43472n0, eVarA, cVar, kVar);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f43505u = aVarR4;
        j9.a<List<y9.s>> aVar17 = v4Var == null ? null : v4Var.f43506v;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar17, y9.s.f42400w, f43475q0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43506v = aVarU4;
        j9.a<List<y7>> aVar18 = v4Var == null ? null : v4Var.f43507w;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar18, y7.f44555v, f43477s0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f43507w = aVarU5;
        j9.a<a8> aVar19 = v4Var == null ? null : v4Var.f43508x;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO8 = h9.e.o(jSONObject, "transform", z10, aVar19, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43508x = aVarO8;
        j9.a<s0> aVar20 = v4Var == null ? null : v4Var.f43509y;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO9 = h9.e.o(jSONObject, "transition_change", z10, aVar20, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43509y = aVarO9;
        j9.a<y9.b0> aVar21 = v4Var == null ? null : v4Var.f43510z;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar3 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO10 = h9.e.o(jSONObject, "transition_in", z10, aVar21, pVar3, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f43510z = aVarO10;
        j9.a<y9.b0> aVar22 = v4Var == null ? null : v4Var.A;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO11 = h9.e.o(jSONObject, "transition_out", z10, aVar22, pVar3, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO11;
        j9.a<List<c8>> aVar23 = v4Var == null ? null : v4Var.B;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar23, c8.FROM_STRING, f43479u0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.B = aVarT;
        j9.a<v9.b<n8>> aVar24 = v4Var == null ? null : v4Var.C;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS5 = h9.e.s(jSONObject, "visibility", z10, aVar24, n8.FROM_STRING, eVarA, cVar, W);
        fd.j0.h(aVarS5, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.C = aVarS5;
        j9.a<p8> aVar25 = v4Var == null ? null : v4Var.D;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar4 = p8.C;
        j9.a<p8> aVarO12 = h9.e.o(jSONObject, "visibility_action", z10, aVar25, pVar4, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO12;
        j9.a<List<p8>> aVar26 = v4Var == null ? null : v4Var.E;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, aVar26, pVar4, f43481w0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.E = aVarU6;
        j9.a<m6> aVar27 = v4Var == null ? null : v4Var.F;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO13 = h9.e.o(jSONObject, "width", z10, aVar27, pVar, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO13;
    }

    public /* synthetic */ v4(u9.c cVar, v4 v4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : v4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f43485a, cVar, "accessibility", jSONObject, f43482x0);
        if (oVar == null) {
            oVar = G;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f43486b, cVar, "alignment_horizontal", jSONObject, f43483y0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f43487c, cVar, "alignment_vertical", jSONObject, f43484z0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f43488d, cVar, "alpha", jSONObject, A0);
        if (bVar3 == null) {
            bVar3 = H;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f43489e, cVar, "background", jSONObject, Z, B0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f43490f, cVar, "border", jSONObject, C0);
        if (k0Var == null) {
            k0Var = I;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f43491g, cVar, "column_span", jSONObject, D0);
        v9.b<Long> bVar6 = (v9.b) y8.c0.H(this.f43492h, cVar, "default_item", jSONObject, E0);
        if (bVar6 == null) {
            bVar6 = J;
        }
        v9.b<Long> bVar7 = bVar6;
        List listL2 = y8.c0.L(this.f43493i, cVar, "disappear_actions", jSONObject, f43464f0, F0);
        List listL3 = y8.c0.L(this.f43494j, cVar, "extensions", jSONObject, f43466h0, G0);
        n2 n2Var = (n2) y8.c0.K(this.f43495k, cVar, "focus", jSONObject, H0);
        l6 l6Var = (l6) y8.c0.K(this.f43496l, cVar, "height", jSONObject, I0);
        if (l6Var == null) {
            l6Var = K;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f43497m, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, J0);
        l2 l2Var = (l2) y8.c0.K(this.f43498n, cVar, "item_spacing", jSONObject, K0);
        if (l2Var == null) {
            l2Var = L;
        }
        l2 l2Var2 = l2Var;
        List listN = y8.c0.N(this.f43499o, cVar, "items", jSONObject, f43470l0, L0);
        s4 s4Var = (s4) y8.c0.M(this.f43500p, cVar, "layout_mode", jSONObject, M0);
        x1 x1Var = (x1) y8.c0.K(this.f43501q, cVar, "margins", jSONObject, N0);
        if (x1Var == null) {
            x1Var = M;
        }
        x1 x1Var2 = x1Var;
        v9.b<r4.f> bVar8 = (v9.b) y8.c0.H(this.f43502r, cVar, "orientation", jSONObject, O0);
        if (bVar8 == null) {
            bVar8 = N;
        }
        v9.b<r4.f> bVar9 = bVar8;
        x1 x1Var3 = (x1) y8.c0.K(this.f43503s, cVar, "paddings", jSONObject, P0);
        if (x1Var3 == null) {
            x1Var3 = O;
        }
        x1 x1Var4 = x1Var3;
        v9.b<Boolean> bVar10 = (v9.b) y8.c0.H(this.f43504t, cVar, "restrict_parent_scroll", jSONObject, Q0);
        if (bVar10 == null) {
            bVar10 = P;
        }
        v9.b<Boolean> bVar11 = bVar10;
        v9.b bVar12 = (v9.b) y8.c0.H(this.f43505u, cVar, "row_span", jSONObject, R0);
        List listL4 = y8.c0.L(this.f43506v, cVar, "selected_actions", jSONObject, f43474p0, S0);
        List listL5 = y8.c0.L(this.f43507w, cVar, "tooltips", jSONObject, f43476r0, T0);
        z7 z7Var = (z7) y8.c0.K(this.f43508x, cVar, "transform", jSONObject, U0);
        if (z7Var == null) {
            z7Var = Q;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.f43509y, cVar, "transition_change", jSONObject, V0);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.f43510z, cVar, "transition_in", jSONObject, W0);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.A, cVar, "transition_out", jSONObject, X0);
        List listJ = y8.c0.J(this.B, cVar, "transition_triggers", jSONObject, f43478t0, Y0);
        v9.b<n8> bVar13 = (v9.b) y8.c0.H(this.C, cVar, "visibility", jSONObject, Z0);
        if (bVar13 == null) {
            bVar13 = R;
        }
        v9.b<n8> bVar14 = bVar13;
        o8 o8Var = (o8) y8.c0.K(this.D, cVar, "visibility_action", jSONObject, f43457a1);
        List listL6 = y8.c0.L(this.E, cVar, "visibility_actions", jSONObject, f43480v0, f43459b1);
        l6 l6Var3 = (l6) y8.c0.K(this.F, cVar, "width", jSONObject, f43461c1);
        if (l6Var3 == null) {
            l6Var3 = S;
        }
        return new r4(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, bVar7, listL2, listL3, n2Var, l6Var2, str, l2Var2, listN, s4Var, x1Var2, bVar9, x1Var4, bVar11, bVar12, listL4, listL5, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar14, o8Var, listL6, l6Var3);
    }
}
