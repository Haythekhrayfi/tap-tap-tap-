package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i1 implements u9.a, g0 {
    public static final d D = new d(null);
    public static final o E;
    public static final v9.b<Double> F;
    public static final k0 G;
    public static final l6.e H;
    public static final x1 I;
    public static final x1 J;
    public static final z7 K;
    public static final v9.b<n8> L;
    public static final l6.d M;
    public static final h9.k<t> N;
    public static final h9.k<u> O;
    public static final h9.k<n8> P;
    public static final h9.m<Double> Q;
    public static final h9.g<e0> R;
    public static final h9.m<Long> S;
    public static final h9.g<q1> T;
    public static final h9.g<z1> U;
    public static final h9.m<String> V;
    public static final h9.g<k> W;
    public static final h9.m<Long> X;
    public static final h9.g<q> Y;
    public static final h9.g<x7> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.g<c8> f40531a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.g<o8> f40532b0;
    public final o8 A;
    public final List<o8> B;
    public final l6 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f40534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f40535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f40536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f40537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f40538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f40539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f40540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f40541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<q1> f40542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<z1> f40543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n2 f40544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l6 f40545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f40546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<k> f40547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1 f40548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x1 f40549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9.b<Long> f40550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<q> f40551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<x7> f40552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z7 f40553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r0 f40554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a0 f40555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a0 f40556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<c8> f40557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v9.b<n8> f40558z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40559c = new a();

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
        public static final b f40560c = new b();

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
        public static final c f40561c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }

        public final i1 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = i1.E;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, i1.N);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, i1.O);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = i1.Q;
            v9.b<Double> bVar = i1.F;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            v9.b<Double> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, i1.R, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = i1.G;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = i1.S;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            uc.l<?, ?> lVar3 = h9.c.f30973c;
            h9.m<?> mVar3 = h9.c.f30971a;
            JSONObject jSONObject2 = (JSONObject) h9.c.m(jSONObject, "custom_props", lVar3, mVar3, eVarA);
            String str = (String) h9.c.c(jSONObject, "custom_type", lVar3, mVar3);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, i1.T, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, i1.U, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar, eVarA, cVar);
            if (l6Var == null) {
                l6Var = i1.H;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar3, i1.V, eVarA);
            Objects.requireNonNull(k.f40973a);
            List listW4 = h9.c.w(jSONObject, "items", k.f40974b, i1.W, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar2 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar2, eVarA, cVar);
            if (x1Var == null) {
                x1Var = i1.I;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar2, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = i1.J;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, i1.X, eVarA, cVar, kVar);
            Objects.requireNonNull(q.f42091g);
            List listW5 = h9.c.w(jSONObject, "selected_actions", q.f42095k, i1.Y, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW6 = h9.c.w(jSONObject, "tooltips", x7.f44173m, i1.Z, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = i1.K;
            }
            z7 z7Var2 = z7Var;
            fd.j0.h(z7Var2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            Objects.requireNonNull(r0.f42228a);
            r0 r0Var = (r0) h9.c.n(jSONObject, "transition_change", r0.f42229b, eVarA, cVar);
            Objects.requireNonNull(a0.f38966a);
            uc.p<u9.c, JSONObject, a0> pVar3 = a0.f38967b;
            a0 a0Var = (a0) h9.c.n(jSONObject, "transition_in", pVar3, eVarA, cVar);
            a0 a0Var2 = (a0) h9.c.n(jSONObject, "transition_out", pVar3, eVarA, cVar);
            Objects.requireNonNull(c8.Converter);
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, i1.f40531a0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar4 = n8.FROM_STRING;
            v9.b<n8> bVar3 = i1.L;
            v9.b<n8> bVarT = h9.c.t(jSONObject, "visibility", lVar4, eVarA, cVar, bVar3, i1.P);
            v9.b<n8> bVar4 = bVarT == null ? bVar3 : bVarT;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar4 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar4, eVarA, cVar);
            List listW7 = h9.c.w(jSONObject, "visibility_actions", pVar4, i1.f40532b0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = i1.M;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new i1(oVar2, bVarS, bVarS2, bVar2, listW, k0Var2, bVarQ, jSONObject2, str, listW2, listW3, n2Var, l6Var2, str2, listW4, x1Var2, x1Var4, bVarQ2, listW5, listW6, z7Var2, r0Var, a0Var, a0Var2, listV, bVar4, o8Var, listW7, l6Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        v9.b bVar = null;
        vc.g gVar = null;
        E = new o(null, bVar, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        F = aVar.a(Double.valueOf(1.0d));
        G = new k0(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, gVar);
        H = new l6.e(new q8(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        v9.b bVar2 = null;
        I = new x1(null, null, null, bVar2, null, 31, null);
        J = new x1(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        K = new z7(0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 7, null);
        L = aVar.a(n8.VISIBLE);
        M = new l6.d(new i4(null, 1, 0 == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f40559c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        N = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar3 = b.f40560c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar3, "validator");
        O = new h9.k.a.C0302a(objQ2, bVar3);
        Object objQ3 = kc.j.q(n8.values());
        c cVar = c.f40561c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        P = new h9.k.a.C0302a(objQ3, cVar);
        Q = g1.f40079g;
        R = a1.f38982m;
        S = a1.f38983n;
        T = g1.f40080h;
        U = a1.f38984o;
        V = a1.f38985p;
        W = g1.f40081i;
        X = a1.f38979j;
        Y = g1.f40077e;
        Z = a1.f38980k;
        f40531a0 = g1.f40078f;
        f40532b0 = a1.f38981l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, JSONObject jSONObject, String str, List<? extends q1> list2, List<? extends z1> list3, n2 n2Var, l6 l6Var, String str2, List<? extends k> list4, x1 x1Var, x1 x1Var2, v9.b<Long> bVar5, List<? extends q> list5, List<? extends x7> list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list7, v9.b<n8> bVar6, o8 o8Var, List<? extends o8> list8, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(str, "customType");
        fd.j0.i(l6Var, "height");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar6, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f40533a = oVar;
        this.f40534b = bVar;
        this.f40535c = bVar2;
        this.f40536d = bVar3;
        this.f40537e = list;
        this.f40538f = k0Var;
        this.f40539g = bVar4;
        this.f40540h = jSONObject;
        this.f40541i = str;
        this.f40542j = list2;
        this.f40543k = list3;
        this.f40544l = n2Var;
        this.f40545m = l6Var;
        this.f40546n = str2;
        this.f40547o = list4;
        this.f40548p = x1Var;
        this.f40549q = x1Var2;
        this.f40550r = bVar5;
        this.f40551s = list5;
        this.f40552t = list6;
        this.f40553u = z7Var;
        this.f40554v = r0Var;
        this.f40555w = a0Var;
        this.f40556x = a0Var2;
        this.f40557y = list7;
        this.f40558z = bVar6;
        this.A = o8Var;
        this.B = list8;
        this.C = l6Var2;
    }

    public /* synthetic */ i1(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, JSONObject jSONObject, String str, List list2, List list3, n2 n2Var, l6 l6Var, String str2, List list4, x1 x1Var, x1 x1Var2, v9.b bVar5, List list5, List list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list7, v9.b bVar6, o8 o8Var, List list8, l6 l6Var2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? E : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? F : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? G : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : jSONObject, str, (i10 & 512) != 0 ? null : list2, (i10 & 1024) != 0 ? null : list3, (i10 & 2048) != 0 ? null : n2Var, (i10 & 4096) != 0 ? H : l6Var, (i10 & 8192) != 0 ? null : str2, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i10) != 0 ? I : x1Var, (65536 & i10) != 0 ? J : x1Var2, (131072 & i10) != 0 ? null : bVar5, (262144 & i10) != 0 ? null : list5, (524288 & i10) != 0 ? null : list6, (1048576 & i10) != 0 ? K : z7Var, (2097152 & i10) != 0 ? null : r0Var, (4194304 & i10) != 0 ? null : a0Var, (8388608 & i10) != 0 ? null : a0Var2, (16777216 & i10) != 0 ? null : list7, (33554432 & i10) != 0 ? L : bVar6, (67108864 & i10) != 0 ? null : o8Var, (134217728 & i10) != 0 ? null : list8, (i10 & 268435456) != 0 ? M : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.f40553u;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f40537e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.B;
    }

    @Override // y9.g0
    public o d() {
        return this.f40533a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f40539g;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f40548p;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f40550r;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f40538f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f40545m;
    }

    @Override // y9.g0
    public String getId() {
        return this.f40546n;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.f40558z;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.C;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f40549q;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.f40557y;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f40551s;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f40534b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f40543k;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.f40552t;
    }

    @Override // y9.g0
    public o8 n() {
        return this.A;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f40535c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.f40555w;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f40536d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f40544l;
    }

    @Override // y9.g0
    public a0 s() {
        return this.f40556x;
    }

    @Override // y9.g0
    public r0 t() {
        return this.f40554v;
    }
}
