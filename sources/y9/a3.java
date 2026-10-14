package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a3 implements u9.a, g0 {
    public static final f J = new f(null);
    public static final o K;
    public static final v L;
    public static final v9.b<Double> M;
    public static final k0 N;
    public static final v9.b<t> O;
    public static final v9.b<u> P;
    public static final l6.e Q;
    public static final x1 R;
    public static final x1 S;
    public static final z7 T;
    public static final v9.b<n8> U;
    public static final l6.d V;
    public static final h9.k<t> W;
    public static final h9.k<u> X;
    public static final h9.k<t> Y;
    public static final h9.k<u> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<n8> f39008a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.g<q> f39009b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<Double> f39010c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<e0> f39011d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Long> f39012e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.m<Long> f39013f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<q1> f39014g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<q> f39015h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<z1> f39016i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<String> f39017j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<k> f39018k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<q> f39019l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f39020m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<q> f39021n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<x7> f39022o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<c8> f39023p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<o8> f39024q0;
    public final z7 A;
    public final r0 B;
    public final a0 C;
    public final a0 D;
    public final List<c8> E;
    public final v9.b<n8> F;
    public final o8 G;
    public final List<o8> H;
    public final l6 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f39026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f39027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f39028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f39029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f39030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f39031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e0> f39032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f39033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v9.b<Long> f39034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<Long> f39035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<t> f39036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v9.b<u> f39037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<q1> f39038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<q> f39039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<z1> f39040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n2 f39041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l6 f39042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f39043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<k> f39044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<q> f39045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x1 f39046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f39047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v9.b<Long> f39048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<q> f39049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<x7> f39050z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39051c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39052c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof u);
        }
    }

    public static final class c extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39053c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t);
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39054c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof u);
        }
    }

    public static final class e extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39055c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class f {
        public f() {
        }

        public f(vc.g gVar) {
        }

        public final a3 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = a3.K;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(q.f42091g);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            q qVar = (q) h9.c.n(jSONObject, "action", pVar, eVarA, cVar);
            Objects.requireNonNull(v.f43377h);
            v vVar = (v) h9.c.n(jSONObject, "action_animation", v.f43387r, eVarA, cVar);
            if (vVar == null) {
                vVar = a3.L;
            }
            v vVar2 = vVar;
            fd.j0.h(vVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List listW = h9.c.w(jSONObject, "actions", pVar, a3.f39009b0, eVarA, cVar);
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, a3.W);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, a3.X);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = a3.f39010c0;
            v9.b<Double> bVar = a3.M;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW2 = h9.c.w(jSONObject, "background", e0.f39727b, a3.f39011d0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = a3.N;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = a3.f39012e0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarG = h9.c.g(jSONObject, "column_count", lVar2, mVar2, eVarA, kVar);
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, a3.f39013f0, eVarA, cVar, kVar);
            uc.l lVar3 = t.FROM_STRING;
            v9.b<t> bVar2 = a3.O;
            v9.b<t> bVarT = h9.c.t(jSONObject, "content_alignment_horizontal", lVar3, eVarA, cVar, bVar2, a3.Y);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            uc.l lVar4 = u.FROM_STRING;
            v9.b<u> bVar3 = a3.P;
            v9.b<u> bVarT2 = h9.c.t(jSONObject, "content_alignment_vertical", lVar4, eVarA, cVar, bVar3, a3.Z);
            if (bVarT2 != null) {
                bVar3 = bVarT2;
            }
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, a3.f39014g0, eVarA, cVar);
            List listW4 = h9.c.w(jSONObject, "doubletap_actions", pVar, a3.f39015h0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, a3.f39016i0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = a3.Q;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, a3.f39017j0, eVarA);
            Objects.requireNonNull(k.f40973a);
            List listY = h9.c.y(jSONObject, "items", k.f40974b, a3.f39018k0, eVarA, cVar);
            fd.j0.h(listY, "readStrictList(json, \"it…S_VALIDATOR, logger, env)");
            List listW6 = h9.c.w(jSONObject, "longtap_actions", pVar, a3.f39019l0, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = a3.R;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = a3.S;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, a3.f39020m0, eVarA, cVar, kVar);
            List listW7 = h9.c.w(jSONObject, "selected_actions", pVar, a3.f39021n0, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW8 = h9.c.w(jSONObject, "tooltips", x7.f44173m, a3.f39022o0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = a3.T;
            }
            z7 z7Var2 = z7Var;
            fd.j0.h(z7Var2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            Objects.requireNonNull(r0.f42228a);
            r0 r0Var = (r0) h9.c.n(jSONObject, "transition_change", r0.f42229b, eVarA, cVar);
            Objects.requireNonNull(a0.f38966a);
            uc.p<u9.c, JSONObject, a0> pVar4 = a0.f38967b;
            a0 a0Var = (a0) h9.c.n(jSONObject, "transition_in", pVar4, eVarA, cVar);
            a0 a0Var2 = (a0) h9.c.n(jSONObject, "transition_out", pVar4, eVarA, cVar);
            Objects.requireNonNull(c8.Converter);
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, a3.f39023p0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar5 = n8.FROM_STRING;
            v9.b<n8> bVar4 = a3.U;
            v9.b<n8> bVarT3 = h9.c.t(jSONObject, "visibility", lVar5, eVarA, cVar, bVar4, a3.f39008a0);
            v9.b<n8> bVar5 = bVarT3 == null ? bVar4 : bVarT3;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW9 = h9.c.w(jSONObject, "visibility_actions", pVar5, a3.f39024q0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = a3.V;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new a3(oVar2, qVar, vVar2, listW, bVarS, bVarS2, bVar, listW2, k0Var2, bVarG, bVarQ, bVar2, bVar3, listW3, listW4, listW5, n2Var, l6Var2, str, listY, listW6, x1Var2, x1Var4, bVarQ2, listW7, listW8, z7Var2, r0Var, a0Var, a0Var2, listV, bVar5, o8Var, listW9, l6Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        K = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        L = new v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        M = aVar.a(dValueOf);
        v9.b bVar2 = null;
        N = new k0(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        O = aVar.a(t.LEFT);
        P = aVar.a(u.TOP);
        Q = new l6.e(new q8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        R = new x1(null, null, null, bVar, null == true ? 1 : 0, 31, null == true ? 1 : 0);
        S = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null);
        T = new z7(null == true ? 1 : 0, null == true ? 1 : 0, bVar, 7, null);
        U = aVar.a(n8.VISIBLE);
        V = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f39051c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        W = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar3 = b.f39052c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar3, "validator");
        X = new h9.k.a.C0302a(objQ2, bVar3);
        Object objQ3 = kc.j.q(t.values());
        c cVar = c.f39053c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        Y = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(u.values());
        d dVar = d.f39054c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        Z = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(n8.values());
        e eVar = e.f39055c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f39008a0 = new h9.k.a.C0302a(objQ5, eVar);
        f39009b0 = v2.f43446w;
        f39010c0 = x2.f44056u;
        f39011d0 = v2.B;
        f39012e0 = v2.C;
        f39013f0 = v2.D;
        f39014g0 = x2.f44057v;
        f39015h0 = z2.f44588d;
        f39016i0 = x2.f44051p;
        f39017j0 = x2.f44052q;
        f39018k0 = v2.f43447x;
        f39019l0 = x2.f44053r;
        f39020m0 = x2.f44054s;
        f39021n0 = v2.f43448y;
        f39022o0 = x2.f44055t;
        f39023p0 = v2.f43449z;
        f39024q0 = v2.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a3(o oVar, q qVar, v vVar, List<? extends q> list, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list2, k0 k0Var, v9.b<Long> bVar4, v9.b<Long> bVar5, v9.b<t> bVar6, v9.b<u> bVar7, List<? extends q1> list3, List<? extends q> list4, List<? extends z1> list5, n2 n2Var, l6 l6Var, String str, List<? extends k> list6, List<? extends q> list7, x1 x1Var, x1 x1Var2, v9.b<Long> bVar8, List<? extends q> list8, List<? extends x7> list9, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list10, v9.b<n8> bVar9, o8 o8Var, List<? extends o8> list11, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(vVar, "actionAnimation");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar4, "columnCount");
        fd.j0.i(bVar6, "contentAlignmentHorizontal");
        fd.j0.i(bVar7, "contentAlignmentVertical");
        fd.j0.i(l6Var, "height");
        fd.j0.i(list6, "items");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar9, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f39025a = oVar;
        this.f39026b = qVar;
        this.f39027c = vVar;
        this.f39028d = list;
        this.f39029e = bVar;
        this.f39030f = bVar2;
        this.f39031g = bVar3;
        this.f39032h = list2;
        this.f39033i = k0Var;
        this.f39034j = bVar4;
        this.f39035k = bVar5;
        this.f39036l = bVar6;
        this.f39037m = bVar7;
        this.f39038n = list3;
        this.f39039o = list4;
        this.f39040p = list5;
        this.f39041q = n2Var;
        this.f39042r = l6Var;
        this.f39043s = str;
        this.f39044t = list6;
        this.f39045u = list7;
        this.f39046v = x1Var;
        this.f39047w = x1Var2;
        this.f39048x = bVar8;
        this.f39049y = list8;
        this.f39050z = list9;
        this.A = z7Var;
        this.B = r0Var;
        this.C = a0Var;
        this.D = a0Var2;
        this.E = list10;
        this.F = bVar9;
        this.G = o8Var;
        this.H = list11;
        this.I = l6Var2;
    }

    public /* synthetic */ a3(o oVar, q qVar, v vVar, List list, v9.b bVar, v9.b bVar2, v9.b bVar3, List list2, k0 k0Var, v9.b bVar4, v9.b bVar5, v9.b bVar6, v9.b bVar7, List list3, List list4, List list5, n2 n2Var, l6 l6Var, String str, List list6, List list7, x1 x1Var, x1 x1Var2, v9.b bVar8, List list8, List list9, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list10, v9.b bVar9, o8 o8Var, List list11, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? K : oVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? L : vVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? M : bVar3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? N : k0Var, bVar4, (i10 & 1024) != 0 ? null : bVar5, (i10 & 2048) != 0 ? O : bVar6, (i10 & 4096) != 0 ? P : bVar7, (i10 & 8192) != 0 ? null : list3, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i10) != 0 ? null : list5, (65536 & i10) != 0 ? null : n2Var, (131072 & i10) != 0 ? Q : l6Var, (262144 & i10) != 0 ? null : str, list6, (1048576 & i10) != 0 ? null : list7, (2097152 & i10) != 0 ? R : x1Var, (4194304 & i10) != 0 ? S : x1Var2, (8388608 & i10) != 0 ? null : bVar8, (16777216 & i10) != 0 ? null : list8, (33554432 & i10) != 0 ? null : list9, (67108864 & i10) != 0 ? T : z7Var, (134217728 & i10) != 0 ? null : r0Var, (268435456 & i10) != 0 ? null : a0Var, (536870912 & i10) != 0 ? null : a0Var2, (1073741824 & i10) != 0 ? null : list10, (i10 & Integer.MIN_VALUE) != 0 ? U : bVar9, (i11 & 1) != 0 ? null : o8Var, (i11 & 2) != 0 ? null : list11, (i11 & 4) != 0 ? V : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.A;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f39032h;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.H;
    }

    @Override // y9.g0
    public o d() {
        return this.f39025a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f39035k;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f39046v;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f39048x;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f39033i;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f39042r;
    }

    @Override // y9.g0
    public String getId() {
        return this.f39043s;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.F;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.I;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f39047w;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.E;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f39049y;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f39029e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f39040p;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.f39050z;
    }

    @Override // y9.g0
    public o8 n() {
        return this.G;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f39030f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.C;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f39031g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f39041q;
    }

    @Override // y9.g0
    public a0 s() {
        return this.D;
    }

    @Override // y9.g0
    public r0 t() {
        return this.B;
    }
}
