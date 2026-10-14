package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e6 implements u9.a, u9.b<d6> {
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> A0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> B0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> C0;
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> D0;
    public static final uc.q<String, JSONObject, u9.c, y9.k0> E0;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> F0;
    public static final y9.o G;
    public static final uc.q<String, JSONObject, u9.c, d6.e> G0;
    public static final y9.v H;
    public static final uc.q<String, JSONObject, u9.c, List<q1>> H0;
    public static final v9.b<Double> I;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> I0;
    public static final y9.k0 J;
    public static final uc.q<String, JSONObject, u9.c, List<z1>> J0;
    public static final d6.e K;
    public static final uc.q<String, JSONObject, u9.c, n2> K0;
    public static final l6.e L;
    public static final uc.q<String, JSONObject, u9.c, l6> L0;
    public static final x1 M;
    public static final uc.q<String, JSONObject, u9.c, String> M0;
    public static final x1 N;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> N0;
    public static final z7 O;
    public static final uc.q<String, JSONObject, u9.c, x1> O0;
    public static final v9.b<n8> P;
    public static final uc.q<String, JSONObject, u9.c, x1> P0;
    public static final l6.d Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> Q0;
    public static final h9.k<y9.t> R;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> R0;
    public static final h9.k<y9.u> S;
    public static final uc.q<String, JSONObject, u9.c, List<x7>> S0;
    public static final h9.k<n8> T;
    public static final uc.q<String, JSONObject, u9.c, z7> T0;
    public static final h9.g<y9.q> U;
    public static final uc.q<String, JSONObject, u9.c, r0> U0;
    public static final h9.g<y9.s> V;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> V0;
    public static final h9.m<Double> W;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> W0;
    public static final h9.m<Double> X;
    public static final uc.q<String, JSONObject, u9.c, List<c8>> X0;
    public static final h9.g<y9.e0> Y;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> Y0;
    public static final h9.g<y9.f0> Z;
    public static final uc.q<String, JSONObject, u9.c, o8> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.m<Long> f39774a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<o8>> f39775a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.m<Long> f39776b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l6> f39777b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.g<q1> f39778c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<s1> f39779d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.g<y9.q> f39780e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<y9.s> f39781f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<z1> f39782g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<a2> f39783h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<String> f39784i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<String> f39785j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<y9.q> f39786k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<y9.s> f39787l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f39788m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<Long> f39789n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<y9.q> f39790o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<y9.s> f39791p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<x7> f39792q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<y7> f39793r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<c8> f39794s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<c8> f39795t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<o8> f39796u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<p8> f39797v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.o> f39798w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.q> f39799x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.v> f39800y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f39801z0;
    public final j9.a<y9.b0> A;
    public final j9.a<List<c8>> B;
    public final j9.a<v9.b<n8>> C;
    public final j9.a<p8> D;
    public final j9.a<List<p8>> E;
    public final j9.a<m6> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f39802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<y9.s> f39803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<y9.x> f39804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f39806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f39807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f39808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f39809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<l0> f39810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<k0> f39812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<List<s1>> f39813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<List<a2>> f39815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<o2> f39816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<m6> f39817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<String> f39818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<y1> f39820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<y1> f39821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<List<y9.s>> f39823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<List<y7>> f39824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<a8> f39825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<s0> f39826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<y9.b0> f39827z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39828c = new a();

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
            return oVar == null ? e6.G : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f39829c = new a0();

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

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39830c = new b();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, e6.U, cVar2.a(), cVar2);
        }
    }

    public static final class b0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f39831c = new b0();

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
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, e6.f39794s0, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39832c = new c();

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
            return vVar == null ? e6.H : vVar;
        }
    }

    public static final class c0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f39833c = new c0();

        public c0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39834c = new d();

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

    public static final class d0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f39835c = new d0();

        public d0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39836c = new e();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, e6.R);
        }
    }

    public static final class e0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f39837c = new e0();

        public e0() {
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
        public static final f f39838c = new f();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, e6.S);
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f39839c = new f0();

        public f0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, e6.f39796u0, cVar2.a(), cVar2);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f39840c = new g();

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
            h9.m<Double> mVar = e6.X;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = e6.I;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f39841c = new g0();

        public g0() {
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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f39842c = new h();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, e6.Y, cVar2.a(), cVar2);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f39843c = new h0();

        public h0() {
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
            v9.b<n8> bVar = e6.P;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, e6.T);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f39844c = new i();

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
            return k0Var == null ? e6.J : k0Var;
        }
    }

    public static final class i0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f39845c = new i0();

        public i0() {
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
            return l6Var == null ? e6.Q : l6Var;
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f39846c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, e6.f39776b0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class j0 {
        public j0() {
        }

        public j0(vc.g gVar) {
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, d6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f39847c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public d6.e b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(d6.e.f39683c);
            d6.e eVar = (d6.e) h9.c.n(jSONObject2, str2, d6.e.f39687g, cVar2.a(), cVar2);
            return eVar == null ? e6.K : eVar;
        }
    }

    public static class k0 implements u9.a, u9.b<d6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39848c = new e(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v9.b<Integer> f39849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final v9.b<d6.e.d> f39850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.k<d6.e.d> f39851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f39852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<d6.e.d>> f39853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, k0> f39854i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<Integer>> f39855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<d6.e.d>> f39856b;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f39857c = new a();

            public a() {
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
                v9.b<Integer> bVar = k0.f39849d;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f31002f);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class b extends vc.l implements uc.p<u9.c, JSONObject, k0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f39858c = new b();

            public b() {
                super(2);
            }

            @Override // uc.p
            public k0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new k0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<d6.e.d>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f39859c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<d6.e.d> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(d6.e.d.Converter);
                uc.l lVar = d6.e.d.FROM_STRING;
                u9.e eVarA = cVar2.a();
                v9.b<d6.e.d> bVar = k0.f39850e;
                v9.b<d6.e.d> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, k0.f39851f);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class d extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f39860c = new d();

            public d() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof d6.e.d);
            }
        }

        public static final class e {
            public e() {
            }

            public e(vc.g gVar) {
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            f39849d = aVar.a(335544320);
            f39850e = aVar.a(d6.e.d.HORIZONTAL);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(d6.e.d.values());
            d dVar = d.f39860c;
            fd.j0.i(objQ, "default");
            fd.j0.i(dVar, "validator");
            f39851f = new h9.k.a.C0302a(objQ, dVar);
            f39852g = a.f39857c;
            f39853h = c.f39859c;
            f39854i = b.f39858c;
        }

        public k0(u9.c cVar, k0 k0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<Integer>> aVarS = h9.e.s(jSONObject, "color", z10, k0Var == null ? null : k0Var.f39855a, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            fd.j0.h(aVarS, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
            this.f39855a = aVarS;
            j9.a<v9.b<d6.e.d>> aVar = k0Var == null ? null : k0Var.f39856b;
            Objects.requireNonNull(d6.e.d.Converter);
            j9.a<v9.b<d6.e.d>> aVarS2 = h9.e.s(jSONObject, "orientation", z10, aVar, d6.e.d.FROM_STRING, eVarA, cVar, f39851f);
            fd.j0.h(aVarS2, "readOptionalFieldWithExp… TYPE_HELPER_ORIENTATION)");
            this.f39856b = aVarS2;
        }

        public /* synthetic */ k0(u9.c cVar, k0 k0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : k0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            v9.b<Integer> bVar = (v9.b) y8.c0.H(this.f39855a, cVar, "color", jSONObject, f39852g);
            if (bVar == null) {
                bVar = f39849d;
            }
            v9.b<d6.e.d> bVar2 = (v9.b) y8.c0.H(this.f39856b, cVar, "orientation", jSONObject, f39853h);
            if (bVar2 == null) {
                bVar2 = f39850e;
            }
            return new d6.e(bVar, bVar2);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f39861c = new l();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, e6.f39778c0, cVar2.a(), cVar2);
        }
    }

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f39862c = new m();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, e6.f39780e0, cVar2.a(), cVar2);
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f39863c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, e6.f39782g0, cVar2.a(), cVar2);
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f39864c = new o();

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

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f39865c = new p();

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
            return l6Var == null ? e6.L : l6Var;
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f39866c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, e6.f39785j0, cVar2.a());
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f39867c = new r();

        public r() {
            super(3);
        }

        @Override // uc.q
        public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(y9.q.f42091g);
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, e6.f39786k0, cVar2.a(), cVar2);
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f39868c = new s();

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
            return x1Var == null ? e6.M : x1Var;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f39869c = new t();

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
            return x1Var == null ? e6.N : x1Var;
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f39870c = new u();

        public u() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, e6.f39789n0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f39871c = new v();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, e6.f39790o0, cVar2.a(), cVar2);
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f39872c = new w();

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
            return h9.c.w(jSONObject2, str2, x7.f44173m, e6.f39792q0, cVar2.a(), cVar2);
        }
    }

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f39873c = new x();

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
            return z7Var == null ? e6.O : z7Var;
        }
    }

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f39874c = new y();

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
        public static final z f39875c = new z();

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
        new j0(null);
        G = new y9.o(null, null, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(y9.v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        H = new y9.v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        I = aVar.a(dValueOf);
        v9.b bVar2 = null;
        J = new y9.k0(null, null, null, null, null, 31, null);
        K = new d6.e(null, null, 3, null);
        L = new l6.e(new q8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        M = new x1(null, null, null, bVar, null == true ? 1 : 0, 31, null == true ? 1 : 0);
        N = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null);
        O = new z7(null == true ? 1 : 0, null == true ? 1 : 0, bVar, 7, null);
        P = aVar.a(n8.VISIBLE);
        Q = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        c0 c0Var = c0.f39833c;
        fd.j0.i(objQ, "default");
        fd.j0.i(c0Var, "validator");
        R = new h9.k.a.C0302a(objQ, c0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        d0 d0Var = d0.f39835c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(d0Var, "validator");
        S = new h9.k.a.C0302a(objQ2, d0Var);
        Object objQ3 = kc.j.q(n8.values());
        e0 e0Var = e0.f39837c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(e0Var, "validator");
        T = new h9.k.a.C0302a(objQ3, e0Var);
        U = a6.f39076m;
        V = c6.f39519j;
        W = a6.f39086w;
        X = c6.f39524o;
        Y = a6.f39087x;
        Z = c6.f39525p;
        f39774a0 = a6.f39088y;
        f39776b0 = c6.f39526q;
        f39778c0 = a6.f39089z;
        f39779d0 = c6.f39527r;
        f39780e0 = c6.f39514e;
        f39781f0 = a6.f39077n;
        f39782g0 = c6.f39515f;
        f39783h0 = a6.f39078o;
        f39784i0 = c6.f39516g;
        f39785j0 = a6.f39079p;
        f39786k0 = c6.f39517h;
        f39787l0 = a6.f39080q;
        f39788m0 = c6.f39518i;
        f39789n0 = a6.f39081r;
        f39790o0 = a6.f39082s;
        f39791p0 = c6.f39520k;
        f39792q0 = a6.f39083t;
        f39793r0 = c6.f39521l;
        f39794s0 = a6.f39084u;
        f39795t0 = c6.f39522m;
        f39796u0 = a6.f39085v;
        f39797v0 = c6.f39523n;
        f39798w0 = a.f39828c;
        f39799x0 = d.f39834c;
        f39800y0 = c.f39832c;
        f39801z0 = b.f39830c;
        A0 = e.f39836c;
        B0 = f.f39838c;
        C0 = g.f39840c;
        D0 = h.f39842c;
        E0 = i.f39844c;
        F0 = j.f39846c;
        G0 = k.f39847c;
        H0 = l.f39861c;
        I0 = m.f39862c;
        J0 = n.f39863c;
        K0 = o.f39864c;
        L0 = p.f39865c;
        M0 = q.f39866c;
        N0 = r.f39867c;
        O0 = s.f39868c;
        P0 = t.f39869c;
        Q0 = u.f39870c;
        R0 = v.f39871c;
        S0 = w.f39872c;
        T0 = x.f39873c;
        U0 = y.f39874c;
        V0 = z.f39875c;
        W0 = a0.f39829c;
        X0 = b0.f39831c;
        Y0 = h0.f39843c;
        Z0 = g0.f39841c;
        f39775a1 = f0.f39839c;
        f39777b1 = i0.f39845c;
    }

    public e6(u9.c cVar, e6 e6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = e6Var == null ? null : e6Var.f39802a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39802a = aVarO;
        j9.a<y9.s> aVar2 = e6Var == null ? null : e6Var.f39803b;
        y9.s.k kVar = y9.s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, y9.s> pVar = y9.s.f42400w;
        j9.a<y9.s> aVarO2 = h9.e.o(jSONObject, "action", z10, aVar2, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39803b = aVarO2;
        j9.a<y9.x> aVar3 = e6Var == null ? null : e6Var.f39804c;
        Objects.requireNonNull(y9.x.f43838i);
        j9.a<y9.x> aVarO3 = h9.e.o(jSONObject, "action_animation", z10, aVar3, y9.x.D, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39804c = aVarO3;
        j9.a<List<y9.s>> aVar4 = e6Var == null ? null : e6Var.f39805d;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "actions", z10, aVar4, pVar, V, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39805d = aVarU;
        j9.a<v9.b<y9.t>> aVar5 = e6Var == null ? null : e6Var.f39806e;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar5, y9.t.FROM_STRING, eVarA, cVar, R);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f39806e = aVarS;
        j9.a<v9.b<y9.u>> aVar6 = e6Var == null ? null : e6Var.f39807f;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar6, y9.u.FROM_STRING, eVarA, cVar, S);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f39807f = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, e6Var == null ? null : e6Var.f39808g, h9.h.f30981d, W, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f39808g = aVarR;
        j9.a<List<y9.f0>> aVar7 = e6Var == null ? null : e6Var.f39809h;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU2 = h9.e.u(jSONObject, "background", z10, aVar7, y9.f0.f39919b, Z, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39809h = aVarU2;
        j9.a<l0> aVar8 = e6Var == null ? null : e6Var.f39810i;
        Objects.requireNonNull(l0.f41168f);
        j9.a<l0> aVarO4 = h9.e.o(jSONObject, "border", z10, aVar8, l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39810i = aVarO4;
        j9.a<v9.b<Long>> aVar9 = e6Var == null ? null : e6Var.f39811j;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f39774a0;
        h9.k<Long> kVar2 = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar9, lVar, mVar, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39811j = aVarR2;
        j9.a<k0> aVar10 = e6Var == null ? null : e6Var.f39812k;
        Objects.requireNonNull(k0.f39848c);
        j9.a<k0> aVarO5 = h9.e.o(jSONObject, "delimiter_style", z10, aVar10, k0.f39854i, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39812k = aVarO5;
        j9.a<List<s1>> aVar11 = e6Var == null ? null : e6Var.f39813l;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU3 = h9.e.u(jSONObject, "disappear_actions", z10, aVar11, s1.C, f39779d0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39813l = aVarU3;
        j9.a<List<y9.s>> aVar12 = e6Var == null ? null : e6Var.f39814m;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "doubletap_actions", z10, aVar12, pVar, f39781f0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39814m = aVarU4;
        j9.a<List<a2>> aVar13 = e6Var == null ? null : e6Var.f39815n;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU5 = h9.e.u(jSONObject, "extensions", z10, aVar13, a2.f39002h, f39783h0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39815n = aVarU5;
        j9.a<o2> aVar14 = e6Var == null ? null : e6Var.f39816o;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO6 = h9.e.o(jSONObject, "focus", z10, aVar14, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39816o = aVarO6;
        j9.a<m6> aVar15 = e6Var == null ? null : e6Var.f39817p;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar2 = m6.f41449b;
        j9.a<m6> aVarO7 = h9.e.o(jSONObject, "height", z10, aVar15, pVar2, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39817p = aVarO7;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, e6Var == null ? null : e6Var.f39818q, f39784i0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f39818q = aVarL;
        j9.a<List<y9.s>> aVar16 = e6Var == null ? null : e6Var.f39819r;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU6 = h9.e.u(jSONObject, "longtap_actions", z10, aVar16, pVar, f39787l0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39819r = aVarU6;
        j9.a<y1> aVar17 = e6Var == null ? null : e6Var.f39820s;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar3 = y1.f44216z;
        j9.a<y1> aVarO8 = h9.e.o(jSONObject, "margins", z10, aVar17, pVar3, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39820s = aVarO8;
        j9.a<y1> aVar18 = e6Var == null ? null : e6Var.f39821t;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO9 = h9.e.o(jSONObject, "paddings", z10, aVar18, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39821t = aVarO9;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, e6Var == null ? null : e6Var.f39822u, lVar, f39788m0, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39822u = aVarR3;
        j9.a<List<y9.s>> aVar19 = e6Var == null ? null : e6Var.f39823v;
        Objects.requireNonNull(kVar);
        j9.a<List<y9.s>> aVarU7 = h9.e.u(jSONObject, "selected_actions", z10, aVar19, pVar, f39791p0, eVarA, cVar);
        fd.j0.h(aVarU7, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39823v = aVarU7;
        j9.a<List<y7>> aVar20 = e6Var == null ? null : e6Var.f39824w;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU8 = h9.e.u(jSONObject, "tooltips", z10, aVar20, y7.f44555v, f39793r0, eVarA, cVar);
        fd.j0.h(aVarU8, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f39824w = aVarU8;
        j9.a<a8> aVar21 = e6Var == null ? null : e6Var.f39825x;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO10 = h9.e.o(jSONObject, "transform", z10, aVar21, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39825x = aVarO10;
        j9.a<s0> aVar22 = e6Var == null ? null : e6Var.f39826y;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO11 = h9.e.o(jSONObject, "transition_change", z10, aVar22, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39826y = aVarO11;
        j9.a<y9.b0> aVar23 = e6Var == null ? null : e6Var.f39827z;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar4 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO12 = h9.e.o(jSONObject, "transition_in", z10, aVar23, pVar4, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39827z = aVarO12;
        j9.a<y9.b0> aVar24 = e6Var == null ? null : e6Var.A;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO13 = h9.e.o(jSONObject, "transition_out", z10, aVar24, pVar4, eVarA, cVar);
        fd.j0.h(aVarO13, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.A = aVarO13;
        j9.a<List<c8>> aVar25 = e6Var == null ? null : e6Var.B;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar25, c8.FROM_STRING, f39795t0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.B = aVarT;
        j9.a<v9.b<n8>> aVar26 = e6Var == null ? null : e6Var.C;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS3 = h9.e.s(jSONObject, "visibility", z10, aVar26, n8.FROM_STRING, eVarA, cVar, T);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.C = aVarS3;
        j9.a<p8> aVar27 = e6Var == null ? null : e6Var.D;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar5 = p8.C;
        j9.a<p8> aVarO14 = h9.e.o(jSONObject, "visibility_action", z10, aVar27, pVar5, eVarA, cVar);
        fd.j0.h(aVarO14, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO14;
        j9.a<List<p8>> aVar28 = e6Var == null ? null : e6Var.E;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU9 = h9.e.u(jSONObject, "visibility_actions", z10, aVar28, pVar5, f39797v0, eVarA, cVar);
        fd.j0.h(aVarU9, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.E = aVarU9;
        j9.a<m6> aVar29 = e6Var == null ? null : e6Var.F;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO15 = h9.e.o(jSONObject, "width", z10, aVar29, pVar2, eVarA, cVar);
        fd.j0.h(aVarO15, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.F = aVarO15;
    }

    public /* synthetic */ e6(u9.c cVar, e6 e6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : e6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f39802a, cVar, "accessibility", jSONObject, f39798w0);
        if (oVar == null) {
            oVar = G;
        }
        y9.o oVar2 = oVar;
        y9.q qVar = (y9.q) y8.c0.K(this.f39803b, cVar, "action", jSONObject, f39799x0);
        y9.v vVar = (y9.v) y8.c0.K(this.f39804c, cVar, "action_animation", jSONObject, f39800y0);
        if (vVar == null) {
            vVar = H;
        }
        y9.v vVar2 = vVar;
        List listL = y8.c0.L(this.f39805d, cVar, "actions", jSONObject, U, f39801z0);
        v9.b bVar = (v9.b) y8.c0.H(this.f39806e, cVar, "alignment_horizontal", jSONObject, A0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f39807f, cVar, "alignment_vertical", jSONObject, B0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f39808g, cVar, "alpha", jSONObject, C0);
        if (bVar3 == null) {
            bVar3 = I;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL2 = y8.c0.L(this.f39809h, cVar, "background", jSONObject, Y, D0);
        y9.k0 k0Var = (y9.k0) y8.c0.K(this.f39810i, cVar, "border", jSONObject, E0);
        if (k0Var == null) {
            k0Var = J;
        }
        y9.k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f39811j, cVar, "column_span", jSONObject, F0);
        d6.e eVar = (d6.e) y8.c0.K(this.f39812k, cVar, "delimiter_style", jSONObject, G0);
        if (eVar == null) {
            eVar = K;
        }
        d6.e eVar2 = eVar;
        List listL3 = y8.c0.L(this.f39813l, cVar, "disappear_actions", jSONObject, f39778c0, H0);
        List listL4 = y8.c0.L(this.f39814m, cVar, "doubletap_actions", jSONObject, f39780e0, I0);
        List listL5 = y8.c0.L(this.f39815n, cVar, "extensions", jSONObject, f39782g0, J0);
        n2 n2Var = (n2) y8.c0.K(this.f39816o, cVar, "focus", jSONObject, K0);
        l6 l6Var = (l6) y8.c0.K(this.f39817p, cVar, "height", jSONObject, L0);
        if (l6Var == null) {
            l6Var = L;
        }
        l6 l6Var2 = l6Var;
        String str = (String) y8.c0.H(this.f39818q, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, M0);
        List listL6 = y8.c0.L(this.f39819r, cVar, "longtap_actions", jSONObject, f39786k0, N0);
        x1 x1Var = (x1) y8.c0.K(this.f39820s, cVar, "margins", jSONObject, O0);
        if (x1Var == null) {
            x1Var = M;
        }
        x1 x1Var2 = x1Var;
        x1 x1Var3 = (x1) y8.c0.K(this.f39821t, cVar, "paddings", jSONObject, P0);
        if (x1Var3 == null) {
            x1Var3 = N;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar6 = (v9.b) y8.c0.H(this.f39822u, cVar, "row_span", jSONObject, Q0);
        List listL7 = y8.c0.L(this.f39823v, cVar, "selected_actions", jSONObject, f39790o0, R0);
        List listL8 = y8.c0.L(this.f39824w, cVar, "tooltips", jSONObject, f39792q0, S0);
        z7 z7Var = (z7) y8.c0.K(this.f39825x, cVar, "transform", jSONObject, T0);
        if (z7Var == null) {
            z7Var = O;
        }
        z7 z7Var2 = z7Var;
        r0 r0Var = (r0) y8.c0.K(this.f39826y, cVar, "transition_change", jSONObject, U0);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.f39827z, cVar, "transition_in", jSONObject, V0);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.A, cVar, "transition_out", jSONObject, W0);
        List listJ = y8.c0.J(this.B, cVar, "transition_triggers", jSONObject, f39794s0, X0);
        v9.b<n8> bVar7 = (v9.b) y8.c0.H(this.C, cVar, "visibility", jSONObject, Y0);
        if (bVar7 == null) {
            bVar7 = P;
        }
        v9.b<n8> bVar8 = bVar7;
        o8 o8Var = (o8) y8.c0.K(this.D, cVar, "visibility_action", jSONObject, Z0);
        List listL9 = y8.c0.L(this.E, cVar, "visibility_actions", jSONObject, f39796u0, f39775a1);
        l6 l6Var3 = (l6) y8.c0.K(this.F, cVar, "width", jSONObject, f39777b1);
        if (l6Var3 == null) {
            l6Var3 = Q;
        }
        return new d6(oVar2, qVar, vVar2, listL, bVar, bVar2, bVar4, listL2, k0Var2, bVar5, eVar2, listL3, listL4, listL5, n2Var, l6Var2, str, listL6, x1Var2, x1Var4, bVar6, listL7, listL8, z7Var2, r0Var, a0Var, a0Var2, listJ, bVar8, o8Var, listL9, l6Var3);
    }
}
