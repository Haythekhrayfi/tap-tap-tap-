package y9;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z6 implements u9.a, u9.b<x6> {
    public static final uc.q<String, JSONObject, u9.c, List<z1>> A0;
    public static final uc.q<String, JSONObject, u9.c, n2> B0;
    public static final uc.q<String, JSONObject, u9.c, l6> C0;
    public static final uc.q<String, JSONObject, u9.c, String> D0;
    public static final y9.o E;
    public static final uc.q<String, JSONObject, u9.c, x1> E0;
    public static final v9.b<Double> F;
    public static final uc.q<String, JSONObject, u9.c, x1> F0;
    public static final k0 G;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> G0;
    public static final l6.e H;
    public static final uc.q<String, JSONObject, u9.c, List<y9.q>> H0;
    public static final x1 I;
    public static final uc.q<String, JSONObject, u9.c, List<x6.f>> I0;
    public static final x1 J;
    public static final uc.q<String, JSONObject, u9.c, List<x7>> J0;
    public static final z7 K;
    public static final uc.q<String, JSONObject, u9.c, z7> K0;
    public static final v9.b<b8> L;
    public static final uc.q<String, JSONObject, u9.c, v9.b<b8>> L0;
    public static final v9.b<n8> M;
    public static final uc.q<String, JSONObject, u9.c, r0> M0;
    public static final l6.d N;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> N0;
    public static final h9.k<y9.t> O;
    public static final uc.q<String, JSONObject, u9.c, y9.a0> O0;
    public static final h9.k<y9.u> P;
    public static final uc.q<String, JSONObject, u9.c, List<c8>> P0;
    public static final h9.k<b8> Q;
    public static final uc.q<String, JSONObject, u9.c, v9.b<n8>> Q0;
    public static final h9.k<n8> R;
    public static final uc.q<String, JSONObject, u9.c, o8> R0;
    public static final h9.m<Double> S;
    public static final uc.q<String, JSONObject, u9.c, List<o8>> S0;
    public static final h9.m<Double> T;
    public static final uc.q<String, JSONObject, u9.c, l6> T0;
    public static final h9.g<y9.e0> U;
    public static final h9.g<y9.f0> V;
    public static final h9.m<Long> W;
    public static final h9.m<Long> X;
    public static final h9.g<q1> Y;
    public static final h9.g<s1> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.g<z1> f44681a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.g<a2> f44682b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<String> f44683c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.m<String> f44684d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Long> f44685e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.m<Long> f44686f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<y9.q> f44687g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<y9.s> f44688h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<x6.f> f44689i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<j0> f44690j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<x7> f44691k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<y7> f44692l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<c8> f44693m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<c8> f44694n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<o8> f44695o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<p8> f44696p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, y9.o> f44697q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.t>> f44698r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<y9.u>> f44699s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f44700t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<y9.e0>> f44701u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, k0> f44702v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44703w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f44704x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q1>> f44705y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44706z0;
    public final j9.a<v9.b<n8>> A;
    public final j9.a<p8> B;
    public final j9.a<List<p8>> C;
    public final j9.a<m6> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y9.p> f44707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<y9.t>> f44708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<y9.u>> f44709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<List<y9.f0>> f44711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<l0> f44712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<String>> f44714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j9.a<List<s1>> f44715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j9.a<String> f44716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j9.a<List<a2>> f44717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.a<o2> f44718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j9.a<m6> f44719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j9.a<String> f44720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j9.a<y1> f44721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j9.a<y1> f44722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j9.a<List<y9.s>> f44724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j9.a<List<j0>> f44725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j9.a<List<y7>> f44726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j9.a<a8> f44727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j9.a<v9.b<b8>> f44728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j9.a<s0> f44729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.a<y9.b0> f44730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j9.a<y9.b0> f44731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j9.a<List<c8>> f44732z;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44733c = new a();

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
            return oVar == null ? z6.E : oVar;
        }
    }

    public static final class a0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f44734c = new a0();

        public a0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.t);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44735c = new b();

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
            return h9.c.s(jSONObject2, str2, y9.t.FROM_STRING, cVar2.a(), cVar2, z6.O);
        }
    }

    public static final class b0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f44736c = new b0();

        public b0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y9.u);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<y9.u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44737c = new c();

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
            return h9.c.s(jSONObject2, str2, y9.u.FROM_STRING, cVar2.a(), cVar2, z6.P);
        }
    }

    public static final class c0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f44738c = new c0();

        public c0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof b8);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44739c = new d();

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
            h9.m<Double> mVar = z6.T;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = z6.F;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d0 extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f44740c = new d0();

        public d0() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.e0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44741c = new e();

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
            return h9.c.w(jSONObject2, str2, y9.e0.f39727b, z6.U, cVar2.a(), cVar2);
        }
    }

    public static final class e0 extends vc.l implements uc.q<String, JSONObject, u9.c, List<o8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f44742c = new e0();

        public e0() {
            super(3);
        }

        @Override // uc.q
        public List<o8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o8.f41845i);
            return h9.c.w(jSONObject2, str2, o8.f41853q, z6.f44695o0, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44743c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public k0 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject2, str2, k0.f40995i, cVar2.a(), cVar2);
            return k0Var == null ? z6.G : k0Var;
        }
    }

    public static final class f0 extends vc.l implements uc.q<String, JSONObject, u9.c, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f44744c = new f0();

        public f0() {
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

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f44745c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, z6.X, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class g0 extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f44746c = new g0();

        public g0() {
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
            v9.b<n8> bVar = z6.M;
            v9.b<n8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, z6.R);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f44747c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            return h9.c.p(jSONObject2, str2, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env"), cVar2, h9.l.f30999c);
        }
    }

    public static final class h0 extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f44748c = new h0();

        public h0() {
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
            return l6Var == null ? z6.N : l6Var;
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, List<q1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f44749c = new i();

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
            return h9.c.w(jSONObject2, str2, q1.f42126i, z6.Y, cVar2.a(), cVar2);
        }
    }

    public static final class i0 {
        public i0() {
        }

        public i0(vc.g gVar) {
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f44750c = new j();

        public j() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env"));
        }
    }

    public static class j0 implements u9.a, u9.b<x6.f> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f44751f = new g(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.g<y9.q> f44752g = w6.f43800r;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.g<y9.s> f44753h = y6.f44526m;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, y9.v> f44754i = a.f44765c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, y9.v> f44755j = b.f44766c;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, y9.k> f44756k = d.f44768c;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, String> f44757l = e.f44769c;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, List<y9.q>> f44758m = f.f44770c;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, j0> f44759n = c.f44767c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<y9.x> f44760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<y9.x> f44761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<i7> f44762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j9.a<String> f44763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j9.a<List<y9.s>> f44764e;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f44765c = new a();

            public a() {
                super(3);
            }

            @Override // uc.q
            public y9.v b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.v.f43377h);
                return (y9.v) h9.c.n(jSONObject2, str2, y9.v.f43387r, cVar2.a(), cVar2);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, y9.v> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f44766c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public y9.v b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.v.f43377h);
                return (y9.v) h9.c.n(jSONObject2, str2, y9.v.f43387r, cVar2.a(), cVar2);
            }
        }

        public static final class c extends vc.l implements uc.p<u9.c, JSONObject, j0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f44767c = new c();

            public c() {
                super(2);
            }

            @Override // uc.p
            public j0 invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new j0(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, y9.k> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f44768c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public y9.k b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.k.f40973a);
                return (y9.k) h9.c.n(jSONObject2, str2, y9.k.f40974b, cVar2.a(), cVar2);
            }
        }

        public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f44769c = new e();

            public e() {
                super(3);
            }

            @Override // uc.q
            public String b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                y9.i.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env");
                return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a);
            }
        }

        public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f44770c = new f();

            public f() {
                super(3);
            }

            @Override // uc.q
            public List<y9.q> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(y9.q.f42091g);
                return h9.c.w(jSONObject2, str2, y9.q.f42095k, j0.f44752g, cVar2.a(), cVar2);
            }
        }

        public static final class g {
            public g() {
            }

            public g(vc.g gVar) {
            }
        }

        public j0(u9.c cVar, j0 j0Var, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<y9.x> aVar = j0Var == null ? null : j0Var.f44760a;
            y9.x.l lVar = y9.x.f43838i;
            Objects.requireNonNull(lVar);
            uc.p<u9.c, JSONObject, y9.x> pVar = y9.x.D;
            j9.a<y9.x> aVarO = h9.e.o(jSONObject, "animation_in", z10, aVar, pVar, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f44760a = aVarO;
            j9.a<y9.x> aVar2 = j0Var == null ? null : j0Var.f44761b;
            Objects.requireNonNull(lVar);
            j9.a<y9.x> aVarO2 = h9.e.o(jSONObject, "animation_out", z10, aVar2, pVar, eVarA, cVar);
            fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f44761b = aVarO2;
            j9.a<i7> aVar3 = j0Var == null ? null : j0Var.f44762c;
            Objects.requireNonNull(i7.f40616a);
            j9.a<i7> aVarO3 = h9.e.o(jSONObject, "div", z10, aVar3, i7.f40617b, eVarA, cVar);
            fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f44762c = aVarO3;
            this.f44763d = h9.e.c(jSONObject, "state_id", z10, j0Var == null ? null : j0Var.f44763d, eVarA, cVar);
            j9.a<List<y9.s>> aVar4 = j0Var == null ? null : j0Var.f44764e;
            Objects.requireNonNull(y9.s.f42386i);
            j9.a<List<y9.s>> aVarU = h9.e.u(jSONObject, "swipe_out_actions", z10, aVar4, y9.s.f42400w, f44753h, eVarA, cVar);
            fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f44764e = aVarU;
        }

        public /* synthetic */ j0(u9.c cVar, j0 j0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : j0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new x6.f((y9.v) y8.c0.K(this.f44760a, cVar, "animation_in", jSONObject, f44754i), (y9.v) y8.c0.K(this.f44761b, cVar, "animation_out", jSONObject, f44755j), (y9.k) y8.c0.K(this.f44762c, cVar, "div", jSONObject, f44756k), (String) y8.c0.E(this.f44763d, cVar, "state_id", jSONObject, f44757l), y8.c0.L(this.f44764e, cVar, "swipe_out_actions", jSONObject, f44752g, f44758m));
        }
    }

    public static final class k extends vc.l implements uc.q<String, JSONObject, u9.c, List<z1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f44771c = new k();

        public k() {
            super(3);
        }

        @Override // uc.q
        public List<z1> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(z1.f44582c);
            return h9.c.w(jSONObject2, str2, z1.f44584e, z6.f44681a0, cVar2.a(), cVar2);
        }
    }

    public static final class l extends vc.l implements uc.q<String, JSONObject, u9.c, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f44772c = new l();

        public l() {
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

    public static final class m extends vc.l implements uc.q<String, JSONObject, u9.c, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f44773c = new m();

        public m() {
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
            return l6Var == null ? z6.H : l6Var;
        }
    }

    public static final class n extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f44774c = new n();

        public n() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return (String) h9.c.m(jSONObject2, str2, h9.c.f30973c, z6.f44684d0, cVar2.a());
        }
    }

    public static final class o extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f44775c = new o();

        public o() {
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
            return x1Var == null ? z6.I : x1Var;
        }
    }

    public static final class p extends vc.l implements uc.q<String, JSONObject, u9.c, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f44776c = new p();

        public p() {
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
            return x1Var == null ? z6.J : x1Var;
        }
    }

    public static final class q extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f44777c = new q();

        public q() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, z6.f44686f0, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class r extends vc.l implements uc.q<String, JSONObject, u9.c, List<y9.q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f44778c = new r();

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
            return h9.c.w(jSONObject2, str2, y9.q.f42095k, z6.f44687g0, cVar2.a(), cVar2);
        }
    }

    public static final class s extends vc.l implements uc.q<String, JSONObject, u9.c, List<x6.f>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f44779c = new s();

        public s() {
            super(3);
        }

        @Override // uc.q
        public List<x6.f> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x6.f.f44159f);
            List<x6.f> listL = h9.c.l(jSONObject2, str2, x6.f.f44161h, z6.f44689i0, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivS…LIDATOR, env.logger, env)");
            return listL;
        }
    }

    public static final class t extends vc.l implements uc.q<String, JSONObject, u9.c, List<x7>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f44780c = new t();

        public t() {
            super(3);
        }

        @Override // uc.q
        public List<x7> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x7.f44168h);
            return h9.c.w(jSONObject2, str2, x7.f44173m, z6.f44691k0, cVar2.a(), cVar2);
        }
    }

    public static final class u extends vc.l implements uc.q<String, JSONObject, u9.c, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f44781c = new u();

        public u() {
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
            return z7Var == null ? z6.K : z7Var;
        }
    }

    public static final class v extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<b8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f44782c = new v();

        public v() {
            super(3);
        }

        @Override // uc.q
        public v9.b<b8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(b8.Converter);
            uc.l lVar = b8.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<b8> bVar = z6.L;
            v9.b<b8> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, z6.Q);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class w extends vc.l implements uc.q<String, JSONObject, u9.c, r0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f44783c = new w();

        public w() {
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

    public static final class x extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f44784c = new x();

        public x() {
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

    public static final class y extends vc.l implements uc.q<String, JSONObject, u9.c, y9.a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f44785c = new y();

        public y() {
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

    public static final class z extends vc.l implements uc.q<String, JSONObject, u9.c, List<c8>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f44786c = new z();

        public z() {
            super(3);
        }

        @Override // uc.q
        public List<c8> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c8.Converter);
            return h9.c.v(jSONObject2, str2, c8.FROM_STRING, z6.f44693m0, cVar2.a(), cVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new i0(null);
        v9.b bVar = null;
        E = new y9.o(null, bVar, null, null, null, null, 63, null);
        v9.b.a aVar = v9.b.f36747a;
        F = aVar.a(Double.valueOf(1.0d));
        G = new k0(null, null, null, null, null, 31, null);
        H = new l6.e(new q8(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        v9.b bVar2 = null;
        I = new x1(null, null, null, bVar2, null, 31, null);
        J = new x1(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        K = new z7(0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 7, null);
        L = aVar.a(b8.STATE_CHANGE);
        M = aVar.a(n8.VISIBLE);
        N = new l6.d(new i4(null, 1, null));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(y9.t.values());
        a0 a0Var = a0.f44734c;
        fd.j0.i(objQ, "default");
        fd.j0.i(a0Var, "validator");
        O = new h9.k.a.C0302a(objQ, a0Var);
        Object objQ2 = kc.j.q(y9.u.values());
        b0 b0Var = b0.f44736c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(b0Var, "validator");
        P = new h9.k.a.C0302a(objQ2, b0Var);
        Object objQ3 = kc.j.q(b8.values());
        c0 c0Var = c0.f44738c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(c0Var, "validator");
        Q = new h9.k.a.C0302a(objQ3, c0Var);
        Object objQ4 = kc.j.q(n8.values());
        d0 d0Var = d0.f44740c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(d0Var, "validator");
        R = new h9.k.a.C0302a(objQ4, d0Var);
        S = w6.f43788f;
        T = y6.f44519f;
        U = w6.f43796n;
        V = y6.f44522i;
        W = w6.f43797o;
        X = y6.f44523j;
        Y = w6.f43798p;
        Z = y6.f44524k;
        f44681a0 = w6.f43799q;
        f44682b0 = y6.f44525l;
        f44683c0 = r6.C;
        f44684d0 = w6.f43789g;
        f44685e0 = r6.D;
        f44686f0 = w6.f43790h;
        f44687g0 = r6.E;
        f44688h0 = w6.f43791i;
        f44689i0 = y6.f44517d;
        f44690j0 = w6.f43792j;
        f44691k0 = y6.f44518e;
        f44692l0 = w6.f43793k;
        f44693m0 = w6.f43794l;
        f44694n0 = y6.f44520g;
        f44695o0 = w6.f43795m;
        f44696p0 = y6.f44521h;
        f44697q0 = a.f44733c;
        f44698r0 = b.f44735c;
        f44699s0 = c.f44737c;
        f44700t0 = d.f44739c;
        f44701u0 = e.f44741c;
        f44702v0 = f.f44743c;
        f44703w0 = g.f44745c;
        f44704x0 = h.f44747c;
        f44705y0 = i.f44749c;
        f44706z0 = j.f44750c;
        A0 = k.f44771c;
        B0 = l.f44772c;
        C0 = m.f44773c;
        D0 = n.f44774c;
        E0 = o.f44775c;
        F0 = p.f44776c;
        G0 = q.f44777c;
        H0 = r.f44778c;
        I0 = s.f44779c;
        J0 = t.f44780c;
        K0 = u.f44781c;
        L0 = v.f44782c;
        M0 = w.f44783c;
        N0 = x.f44784c;
        O0 = y.f44785c;
        P0 = z.f44786c;
        Q0 = g0.f44746c;
        R0 = f0.f44744c;
        S0 = e0.f44742c;
        T0 = h0.f44748c;
    }

    public z6(u9.c cVar, z6 z6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y9.p> aVar = z6Var == null ? null : z6Var.f44707a;
        Objects.requireNonNull(y9.p.f41863g);
        j9.a<y9.p> aVarO = h9.e.o(jSONObject, "accessibility", z10, aVar, y9.p.f41879w, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44707a = aVarO;
        j9.a<v9.b<y9.t>> aVar2 = z6Var == null ? null : z6Var.f44708b;
        Objects.requireNonNull(y9.t.Converter);
        j9.a<v9.b<y9.t>> aVarS = h9.e.s(jSONObject, "alignment_horizontal", z10, aVar2, y9.t.FROM_STRING, eVarA, cVar, O);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…PER_ALIGNMENT_HORIZONTAL)");
        this.f44708b = aVarS;
        j9.a<v9.b<y9.u>> aVar3 = z6Var == null ? null : z6Var.f44709c;
        Objects.requireNonNull(y9.u.Converter);
        j9.a<v9.b<y9.u>> aVarS2 = h9.e.s(jSONObject, "alignment_vertical", z10, aVar3, y9.u.FROM_STRING, eVarA, cVar, P);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…ELPER_ALIGNMENT_VERTICAL)");
        this.f44709c = aVarS2;
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, z6Var == null ? null : z6Var.f44710d, h9.h.f30981d, S, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44710d = aVarR;
        j9.a<List<y9.f0>> aVar4 = z6Var == null ? null : z6Var.f44711e;
        Objects.requireNonNull(y9.f0.f39918a);
        j9.a<List<y9.f0>> aVarU = h9.e.u(jSONObject, "background", z10, aVar4, y9.f0.f39919b, V, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44711e = aVarU;
        j9.a<l0> aVar5 = z6Var == null ? null : z6Var.f44712f;
        Objects.requireNonNull(l0.f41168f);
        j9.a<l0> aVarO2 = h9.e.o(jSONObject, "border", z10, aVar5, l0.f41177o, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44712f = aVarO2;
        j9.a<v9.b<Long>> aVar6 = z6Var == null ? null : z6Var.f44713g;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = W;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "column_span", z10, aVar6, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44713g = aVarR2;
        j9.a<v9.b<String>> aVarQ = h9.e.q(jSONObject, "default_state_id", z10, z6Var == null ? null : z6Var.f44714h, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarQ, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f44714h = aVarQ;
        j9.a<List<s1>> aVar7 = z6Var == null ? null : z6Var.f44715i;
        Objects.requireNonNull(s1.f42440i);
        j9.a<List<s1>> aVarU2 = h9.e.u(jSONObject, "disappear_actions", z10, aVar7, s1.C, Z, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44715i = aVarU2;
        j9.a<String> aVarM = h9.e.m(jSONObject, "div_id", z10, z6Var == null ? null : z6Var.f44716j, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …rent?.divId, logger, env)");
        this.f44716j = aVarM;
        j9.a<List<a2>> aVar8 = z6Var == null ? null : z6Var.f44717k;
        Objects.requireNonNull(a2.f38997c);
        j9.a<List<a2>> aVarU3 = h9.e.u(jSONObject, "extensions", z10, aVar8, a2.f39002h, f44682b0, eVarA, cVar);
        fd.j0.h(aVarU3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44717k = aVarU3;
        j9.a<o2> aVar9 = z6Var == null ? null : z6Var.f44718l;
        Objects.requireNonNull(o2.f41743f);
        j9.a<o2> aVarO3 = h9.e.o(jSONObject, "focus", z10, aVar9, o2.f41756s, eVarA, cVar);
        fd.j0.h(aVarO3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44718l = aVarO3;
        j9.a<m6> aVar10 = z6Var == null ? null : z6Var.f44719m;
        m6.b bVar = m6.f41448a;
        Objects.requireNonNull(bVar);
        uc.p<u9.c, JSONObject, m6> pVar = m6.f41449b;
        j9.a<m6> aVarO4 = h9.e.o(jSONObject, "height", z10, aVar10, pVar, eVarA, cVar);
        fd.j0.h(aVarO4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44719m = aVarO4;
        j9.a<String> aVarL = h9.e.l(jSONObject, FacebookMediationAdapter.KEY_ID, z10, z6Var == null ? null : z6Var.f44720n, f44683c0, eVarA, cVar);
        fd.j0.h(aVarL, "readOptionalField(json, …E_VALIDATOR, logger, env)");
        this.f44720n = aVarL;
        j9.a<y1> aVar11 = z6Var == null ? null : z6Var.f44721o;
        y1.h hVar = y1.f44196f;
        Objects.requireNonNull(hVar);
        uc.p<u9.c, JSONObject, y1> pVar2 = y1.f44216z;
        j9.a<y1> aVarO5 = h9.e.o(jSONObject, "margins", z10, aVar11, pVar2, eVarA, cVar);
        fd.j0.h(aVarO5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44721o = aVarO5;
        j9.a<y1> aVar12 = z6Var == null ? null : z6Var.f44722p;
        Objects.requireNonNull(hVar);
        j9.a<y1> aVarO6 = h9.e.o(jSONObject, "paddings", z10, aVar12, pVar2, eVarA, cVar);
        fd.j0.h(aVarO6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44722p = aVarO6;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "row_span", z10, z6Var == null ? null : z6Var.f44723q, lVar, f44685e0, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44723q = aVarR3;
        j9.a<List<y9.s>> aVar13 = z6Var == null ? null : z6Var.f44724r;
        Objects.requireNonNull(y9.s.f42386i);
        j9.a<List<y9.s>> aVarU4 = h9.e.u(jSONObject, "selected_actions", z10, aVar13, y9.s.f42400w, f44688h0, eVarA, cVar);
        fd.j0.h(aVarU4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44724r = aVarU4;
        j9.a<List<j0>> aVar14 = z6Var == null ? null : z6Var.f44725s;
        Objects.requireNonNull(j0.f44751f);
        this.f44725s = h9.e.k(jSONObject, "states", z10, aVar14, j0.f44759n, f44690j0, eVarA, cVar);
        j9.a<List<y7>> aVar15 = z6Var == null ? null : z6Var.f44726t;
        Objects.requireNonNull(y7.f44541h);
        j9.a<List<y7>> aVarU5 = h9.e.u(jSONObject, "tooltips", z10, aVar15, y7.f44555v, f44692l0, eVarA, cVar);
        fd.j0.h(aVarU5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44726t = aVarU5;
        j9.a<a8> aVar16 = z6Var == null ? null : z6Var.f44727u;
        Objects.requireNonNull(a8.f39097d);
        j9.a<a8> aVarO7 = h9.e.o(jSONObject, "transform", z10, aVar16, a8.f39103j, eVarA, cVar);
        fd.j0.h(aVarO7, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44727u = aVarO7;
        j9.a<v9.b<b8>> aVar17 = z6Var == null ? null : z6Var.f44728v;
        Objects.requireNonNull(b8.Converter);
        j9.a<v9.b<b8>> aVarS3 = h9.e.s(jSONObject, "transition_animation_selector", z10, aVar17, b8.FROM_STRING, eVarA, cVar, Q);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…ITION_ANIMATION_SELECTOR)");
        this.f44728v = aVarS3;
        j9.a<s0> aVar18 = z6Var == null ? null : z6Var.f44729w;
        Objects.requireNonNull(s0.f42435a);
        j9.a<s0> aVarO8 = h9.e.o(jSONObject, "transition_change", z10, aVar18, s0.f42436b, eVarA, cVar);
        fd.j0.h(aVarO8, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44729w = aVarO8;
        j9.a<y9.b0> aVar19 = z6Var == null ? null : z6Var.f44730x;
        y9.b0.b bVar2 = y9.b0.f39111a;
        Objects.requireNonNull(bVar2);
        uc.p<u9.c, JSONObject, y9.b0> pVar3 = y9.b0.f39112b;
        j9.a<y9.b0> aVarO9 = h9.e.o(jSONObject, "transition_in", z10, aVar19, pVar3, eVarA, cVar);
        fd.j0.h(aVarO9, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44730x = aVarO9;
        j9.a<y9.b0> aVar20 = z6Var == null ? null : z6Var.f44731y;
        Objects.requireNonNull(bVar2);
        j9.a<y9.b0> aVarO10 = h9.e.o(jSONObject, "transition_out", z10, aVar20, pVar3, eVarA, cVar);
        fd.j0.h(aVarO10, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f44731y = aVarO10;
        j9.a<List<c8>> aVar21 = z6Var == null ? null : z6Var.f44732z;
        Objects.requireNonNull(c8.Converter);
        j9.a<List<c8>> aVarT = h9.e.t(jSONObject, "transition_triggers", z10, aVar21, c8.FROM_STRING, f44694n0, eVarA, cVar);
        fd.j0.h(aVarT, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f44732z = aVarT;
        j9.a<v9.b<n8>> aVar22 = z6Var == null ? null : z6Var.A;
        Objects.requireNonNull(n8.Converter);
        j9.a<v9.b<n8>> aVarS4 = h9.e.s(jSONObject, "visibility", z10, aVar22, n8.FROM_STRING, eVarA, cVar, R);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…, TYPE_HELPER_VISIBILITY)");
        this.A = aVarS4;
        j9.a<p8> aVar23 = z6Var == null ? null : z6Var.B;
        p8.j jVar = p8.f42056i;
        Objects.requireNonNull(jVar);
        uc.p<u9.c, JSONObject, p8> pVar4 = p8.C;
        j9.a<p8> aVarO11 = h9.e.o(jSONObject, "visibility_action", z10, aVar23, pVar4, eVarA, cVar);
        fd.j0.h(aVarO11, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.B = aVarO11;
        j9.a<List<p8>> aVar24 = z6Var == null ? null : z6Var.C;
        Objects.requireNonNull(jVar);
        j9.a<List<p8>> aVarU6 = h9.e.u(jSONObject, "visibility_actions", z10, aVar24, pVar4, f44696p0, eVarA, cVar);
        fd.j0.h(aVarU6, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.C = aVarU6;
        j9.a<m6> aVar25 = z6Var == null ? null : z6Var.D;
        Objects.requireNonNull(bVar);
        j9.a<m6> aVarO12 = h9.e.o(jSONObject, "width", z10, aVar25, pVar, eVarA, cVar);
        fd.j0.h(aVarO12, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.D = aVarO12;
    }

    public /* synthetic */ z6(u9.c cVar, z6 z6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : z6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        y9.o oVar = (y9.o) y8.c0.K(this.f44707a, cVar, "accessibility", jSONObject, f44697q0);
        if (oVar == null) {
            oVar = E;
        }
        y9.o oVar2 = oVar;
        v9.b bVar = (v9.b) y8.c0.H(this.f44708b, cVar, "alignment_horizontal", jSONObject, f44698r0);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f44709c, cVar, "alignment_vertical", jSONObject, f44699s0);
        v9.b<Double> bVar3 = (v9.b) y8.c0.H(this.f44710d, cVar, "alpha", jSONObject, f44700t0);
        if (bVar3 == null) {
            bVar3 = F;
        }
        v9.b<Double> bVar4 = bVar3;
        List listL = y8.c0.L(this.f44711e, cVar, "background", jSONObject, U, f44701u0);
        k0 k0Var = (k0) y8.c0.K(this.f44712f, cVar, "border", jSONObject, f44702v0);
        if (k0Var == null) {
            k0Var = G;
        }
        k0 k0Var2 = k0Var;
        v9.b bVar5 = (v9.b) y8.c0.H(this.f44713g, cVar, "column_span", jSONObject, f44703w0);
        v9.b bVar6 = (v9.b) y8.c0.H(this.f44714h, cVar, "default_state_id", jSONObject, f44704x0);
        List listL2 = y8.c0.L(this.f44715i, cVar, "disappear_actions", jSONObject, Y, f44705y0);
        String str = (String) y8.c0.H(this.f44716j, cVar, "div_id", jSONObject, f44706z0);
        List listL3 = y8.c0.L(this.f44717k, cVar, "extensions", jSONObject, f44681a0, A0);
        n2 n2Var = (n2) y8.c0.K(this.f44718l, cVar, "focus", jSONObject, B0);
        l6 l6Var = (l6) y8.c0.K(this.f44719m, cVar, "height", jSONObject, C0);
        if (l6Var == null) {
            l6Var = H;
        }
        l6 l6Var2 = l6Var;
        String str2 = (String) y8.c0.H(this.f44720n, cVar, FacebookMediationAdapter.KEY_ID, jSONObject, D0);
        x1 x1Var = (x1) y8.c0.K(this.f44721o, cVar, "margins", jSONObject, E0);
        if (x1Var == null) {
            x1Var = I;
        }
        x1 x1Var2 = x1Var;
        x1 x1Var3 = (x1) y8.c0.K(this.f44722p, cVar, "paddings", jSONObject, F0);
        if (x1Var3 == null) {
            x1Var3 = J;
        }
        x1 x1Var4 = x1Var3;
        v9.b bVar7 = (v9.b) y8.c0.H(this.f44723q, cVar, "row_span", jSONObject, G0);
        List listL4 = y8.c0.L(this.f44724r, cVar, "selected_actions", jSONObject, f44687g0, H0);
        List listN = y8.c0.N(this.f44725s, cVar, "states", jSONObject, f44689i0, I0);
        List listL5 = y8.c0.L(this.f44726t, cVar, "tooltips", jSONObject, f44691k0, J0);
        z7 z7Var = (z7) y8.c0.K(this.f44727u, cVar, "transform", jSONObject, K0);
        if (z7Var == null) {
            z7Var = K;
        }
        z7 z7Var2 = z7Var;
        v9.b<b8> bVar8 = (v9.b) y8.c0.H(this.f44728v, cVar, "transition_animation_selector", jSONObject, L0);
        if (bVar8 == null) {
            bVar8 = L;
        }
        v9.b<b8> bVar9 = bVar8;
        r0 r0Var = (r0) y8.c0.K(this.f44729w, cVar, "transition_change", jSONObject, M0);
        y9.a0 a0Var = (y9.a0) y8.c0.K(this.f44730x, cVar, "transition_in", jSONObject, N0);
        y9.a0 a0Var2 = (y9.a0) y8.c0.K(this.f44731y, cVar, "transition_out", jSONObject, O0);
        List listJ = y8.c0.J(this.f44732z, cVar, "transition_triggers", jSONObject, f44693m0, P0);
        v9.b<n8> bVar10 = (v9.b) y8.c0.H(this.A, cVar, "visibility", jSONObject, Q0);
        if (bVar10 == null) {
            bVar10 = M;
        }
        v9.b<n8> bVar11 = bVar10;
        o8 o8Var = (o8) y8.c0.K(this.B, cVar, "visibility_action", jSONObject, R0);
        List listL6 = y8.c0.L(this.C, cVar, "visibility_actions", jSONObject, f44695o0, S0);
        l6 l6Var3 = (l6) y8.c0.K(this.D, cVar, "width", jSONObject, T0);
        if (l6Var3 == null) {
            l6Var3 = N;
        }
        return new x6(oVar2, bVar, bVar2, bVar4, listL, k0Var2, bVar5, bVar6, listL2, str, listL3, n2Var, l6Var2, str2, x1Var2, x1Var4, bVar7, listL4, listN, listL5, z7Var2, bVar9, r0Var, a0Var, a0Var2, listJ, bVar11, o8Var, listL6, l6Var3);
    }
}
