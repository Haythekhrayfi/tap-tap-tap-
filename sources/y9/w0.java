package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w0 implements u9.a, g0 {
    public static final h N = new h(null);
    public static final o O;
    public static final v P;
    public static final v9.b<Double> Q;
    public static final k0 R;
    public static final v9.b<y0> S;
    public static final v9.b<z0> T;
    public static final l6.e U;
    public static final v9.b<i> V;
    public static final x1 W;
    public static final v9.b<j> X;
    public static final x1 Y;
    public static final z7 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<n8> f43595a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final l6.d f43596b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<t> f43597c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<u> f43598d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<y0> f43599e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<z0> f43600f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<i> f43601g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.k<j> f43602h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.k<n8> f43603i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<q> f43604j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Double> f43605k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<e0> f43606l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f43607m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<q1> f43608n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<q> f43609o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<z1> f43610p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<String> f43611q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<y9.k> f43612r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<q> f43613s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<Long> f43614t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<q> f43615u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<x7> f43616v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<c8> f43617w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.g<o8> f43618x0;
    public final v9.b<Long> A;
    public final List<q> B;
    public final k C;
    public final List<x7> D;
    public final z7 E;
    public final r0 F;
    public final a0 G;
    public final a0 H;
    public final List<c8> I;
    public final v9.b<n8> J;
    public final o8 K;
    public final List<o8> L;
    public final l6 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f43619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f43620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f43621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f43622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f43623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f43624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f43625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f43626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<e0> f43627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f43628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<Long> f43629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<y0> f43630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v9.b<z0> f43631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<q1> f43632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<q> f43633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<z1> f43634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n2 f43635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l6 f43636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f43637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<y9.k> f43638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v9.b<i> f43639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f43640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<q> f43641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x1 f43642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b<j> f43643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x1 f43644z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43645c = new a();

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
        public static final b f43646c = new b();

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
        public static final c f43647c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof y0);
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f43648c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof z0);
        }
    }

    public static final class e extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f43649c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof i);
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f43650c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof j);
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f43651c = new g();

        public g() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class h {
        public h() {
        }

        public h(vc.g gVar) {
        }

        public final w0 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = w0.O;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            q.c cVar2 = q.f42091g;
            Objects.requireNonNull(cVar2);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            q qVar = (q) h9.c.n(jSONObject, "action", pVar, eVarA, cVar);
            Objects.requireNonNull(v.f43377h);
            v vVar = (v) h9.c.n(jSONObject, "action_animation", v.f43387r, eVarA, cVar);
            if (vVar == null) {
                vVar = w0.P;
            }
            v vVar2 = vVar;
            fd.j0.h(vVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List listW = h9.c.w(jSONObject, "actions", pVar, w0.f43604j0, eVarA, cVar);
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, w0.f43597c0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, w0.f43598d0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = w0.f43605k0;
            v9.b<Double> bVar = w0.Q;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(c0.f39344b);
            c0 c0Var = (c0) h9.c.n(jSONObject, "aspect", c0.f39346d, eVarA, cVar);
            Objects.requireNonNull(e0.f39726a);
            List listW2 = h9.c.w(jSONObject, "background", e0.f39727b, w0.f43606l0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = w0.R;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = w0.f43607m0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            Objects.requireNonNull(y0.Converter);
            uc.l lVar3 = y0.FROM_STRING;
            v9.b<y0> bVar2 = w0.S;
            v9.b<y0> bVarT = h9.c.t(jSONObject, "content_alignment_horizontal", lVar3, eVarA, cVar, bVar2, w0.f43599e0);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            Objects.requireNonNull(z0.Converter);
            uc.l lVar4 = z0.FROM_STRING;
            v9.b<z0> bVar3 = w0.T;
            v9.b<z0> bVarT2 = h9.c.t(jSONObject, "content_alignment_vertical", lVar4, eVarA, cVar, bVar3, w0.f43600f0);
            if (bVarT2 != null) {
                bVar3 = bVarT2;
            }
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, w0.f43608n0, eVarA, cVar);
            List listW4 = h9.c.w(jSONObject, "doubletap_actions", pVar, w0.f43609o0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, w0.f43610p0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = w0.U;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, w0.f43611q0, eVarA);
            Objects.requireNonNull(y9.k.f40973a);
            List listL = h9.c.l(jSONObject, "items", y9.k.f40974b, w0.f43612r0, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            Objects.requireNonNull(i.Converter);
            uc.l lVar5 = i.FROM_STRING;
            v9.b<i> bVar4 = w0.V;
            v9.b<i> bVarT3 = h9.c.t(jSONObject, "layout_mode", lVar5, eVarA, cVar, bVar4, w0.f43601g0);
            if (bVarT3 != null) {
                bVar4 = bVarT3;
            }
            Objects.requireNonNull(k.f43654e);
            uc.p<u9.c, JSONObject, k> pVar3 = k.f43659j;
            k kVar2 = (k) h9.c.n(jSONObject, "line_separator", pVar3, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "longtap_actions", pVar, w0.f43613s0, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar4 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar4, eVarA, cVar);
            if (x1Var == null) {
                x1Var = w0.W;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Objects.requireNonNull(j.Converter);
            uc.l lVar6 = j.FROM_STRING;
            v9.b<j> bVar5 = w0.X;
            v9.b<j> bVarT4 = h9.c.t(jSONObject, "orientation", lVar6, eVarA, cVar, bVar5, w0.f43602h0);
            if (bVarT4 != null) {
                bVar5 = bVarT4;
            }
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar4, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = w0.Y;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, w0.f43614t0, eVarA, cVar, kVar);
            Objects.requireNonNull(cVar2);
            List listW7 = h9.c.w(jSONObject, "selected_actions", pVar, w0.f43615u0, eVarA, cVar);
            k kVar3 = (k) h9.c.n(jSONObject, "separator", pVar3, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW8 = h9.c.w(jSONObject, "tooltips", x7.f44173m, w0.f43616v0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = w0.Z;
            }
            z7 z7Var2 = z7Var;
            fd.j0.h(z7Var2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            Objects.requireNonNull(r0.f42228a);
            r0 r0Var = (r0) h9.c.n(jSONObject, "transition_change", r0.f42229b, eVarA, cVar);
            Objects.requireNonNull(a0.f38966a);
            uc.p<u9.c, JSONObject, a0> pVar5 = a0.f38967b;
            a0 a0Var = (a0) h9.c.n(jSONObject, "transition_in", pVar5, eVarA, cVar);
            a0 a0Var2 = (a0) h9.c.n(jSONObject, "transition_out", pVar5, eVarA, cVar);
            Objects.requireNonNull(c8.Converter);
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, w0.f43617w0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar7 = n8.FROM_STRING;
            v9.b<n8> bVar6 = w0.f43595a0;
            v9.b<n8> bVarT5 = h9.c.t(jSONObject, "visibility", lVar7, eVarA, cVar, bVar6, w0.f43603i0);
            v9.b<n8> bVar7 = bVarT5 == null ? bVar6 : bVarT5;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar6 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar6, eVarA, cVar);
            List listW9 = h9.c.w(jSONObject, "visibility_actions", pVar6, w0.f43618x0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = w0.f43596b0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new w0(oVar2, qVar, vVar2, listW, bVarS, bVarS2, bVar, c0Var, listW2, k0Var2, bVarQ, bVar2, bVar3, listW3, listW4, listW5, n2Var, l6Var2, str, listL, bVar4, kVar2, listW6, x1Var2, bVar5, x1Var4, bVarQ2, listW7, kVar3, listW8, z7Var2, r0Var, a0Var, a0Var2, listV, bVar7, o8Var, listW9, l6Var3);
        }
    }

    public enum i {
        NO_WRAP("no_wrap"),
        WRAP("wrap");

        public static final b Converter = new b(null);
        private static final uc.l<String, i> FROM_STRING = a.f43652c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43652c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public i invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                i iVar = i.NO_WRAP;
                if (fd.j0.d(str2, iVar.value)) {
                    return iVar;
                }
                i iVar2 = i.WRAP;
                if (fd.j0.d(str2, iVar2.value)) {
                    return iVar2;
                }
                return null;
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        i(String str) {
            this.value = str;
        }
    }

    public enum j {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");

        public static final b Converter = new b(null);
        private static final uc.l<String, j> FROM_STRING = a.f43653c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, j> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43653c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public j invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                j jVar = j.VERTICAL;
                if (fd.j0.d(str2, jVar.value)) {
                    return jVar;
                }
                j jVar2 = j.HORIZONTAL;
                if (fd.j0.d(str2, jVar2.value)) {
                    return jVar2;
                }
                j jVar3 = j.OVERLAP;
                if (fd.j0.d(str2, jVar3.value)) {
                    return jVar3;
                }
                return null;
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        j(String str) {
            this.value = str;
        }
    }

    public static class k implements u9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f43654e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final x1 f43655f = new x1(null, null, null, null, null, 31, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final v9.b<Boolean> f43656g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final v9.b<Boolean> f43657h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v9.b<Boolean> f43658i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, k> f43659j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<Boolean> f43660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<Boolean> f43661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<Boolean> f43662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v1 f43663d;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, k> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43664c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public k invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(k.f43654e);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(x1.f44020f);
                x1 x1Var = (x1) h9.c.n(jSONObject2, "margins", x1.f44031q, eVarA, cVar2);
                if (x1Var == null) {
                    x1Var = k.f43655f;
                }
                x1 x1Var2 = x1Var;
                fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
                uc.l<Object, Boolean> lVar = h9.h.f30980c;
                v9.b<Boolean> bVar = k.f43656g;
                h9.k<Boolean> kVar = h9.l.f30997a;
                v9.b<Boolean> bVarT = h9.c.t(jSONObject2, "show_at_end", lVar, eVarA, cVar2, bVar, kVar);
                if (bVarT != null) {
                    bVar = bVarT;
                }
                v9.b<Boolean> bVar2 = k.f43657h;
                v9.b<Boolean> bVarT2 = h9.c.t(jSONObject2, "show_at_start", lVar, eVarA, cVar2, bVar2, kVar);
                if (bVarT2 != null) {
                    bVar2 = bVarT2;
                }
                v9.b<Boolean> bVar3 = k.f43658i;
                v9.b<Boolean> bVarT3 = h9.c.t(jSONObject2, "show_between", lVar, eVarA, cVar2, bVar3, kVar);
                v9.b<Boolean> bVar4 = bVarT3 == null ? bVar3 : bVarT3;
                Objects.requireNonNull(v1.f43423a);
                return new k(x1Var2, bVar, bVar2, bVar4, (v1) h9.c.d(jSONObject2, "style", v1.f43424b, h9.c.f30971a, cVar2));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            Boolean bool = Boolean.FALSE;
            f43656g = aVar.a(bool);
            f43657h = aVar.a(bool);
            f43658i = aVar.a(Boolean.TRUE);
            f43659j = a.f43664c;
        }

        public k(x1 x1Var, v9.b<Boolean> bVar, v9.b<Boolean> bVar2, v9.b<Boolean> bVar3, v1 v1Var) {
            fd.j0.i(x1Var, "margins");
            fd.j0.i(bVar, "showAtEnd");
            fd.j0.i(bVar2, "showAtStart");
            fd.j0.i(bVar3, "showBetween");
            fd.j0.i(v1Var, "style");
            this.f43660a = bVar;
            this.f43661b = bVar2;
            this.f43662c = bVar3;
            this.f43663d = v1Var;
        }

        public /* synthetic */ k(x1 x1Var, v9.b bVar, v9.b bVar2, v9.b bVar3, v1 v1Var, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? f43655f : x1Var, (i10 & 2) != 0 ? f43656g : bVar, (i10 & 4) != 0 ? f43657h : bVar2, (i10 & 8) != 0 ? f43658i : bVar3, v1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        O = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        P = new v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        Q = aVar.a(dValueOf);
        v9.b bVar2 = null;
        R = new k0(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        S = aVar.a(y0.LEFT);
        T = aVar.a(z0.TOP);
        U = new l6.e(new q8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        V = aVar.a(i.NO_WRAP);
        v9.b bVar3 = null;
        int i10 = 31;
        W = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, bVar3, null == true ? 1 : 0, i10, gVar);
        X = aVar.a(j.VERTICAL);
        Y = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, bVar3, null == true ? 1 : 0, i10, gVar);
        Z = new z7(null, null, bVar, 7, null);
        f43595a0 = aVar.a(n8.VISIBLE);
        f43596b0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i11 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f43645c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f43597c0 = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar4 = b.f43646c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar4, "validator");
        f43598d0 = new h9.k.a.C0302a(objQ2, bVar4);
        Object objQ3 = kc.j.q(y0.values());
        c cVar = c.f43647c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f43599e0 = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(z0.values());
        d dVar = d.f43648c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        f43600f0 = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(i.values());
        e eVar = e.f43649c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f43601g0 = new h9.k.a.C0302a(objQ5, eVar);
        Object objQ6 = kc.j.q(j.values());
        f fVar = f.f43650c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(fVar, "validator");
        f43602h0 = new h9.k.a.C0302a(objQ6, fVar);
        Object objQ7 = kc.j.q(n8.values());
        g gVar2 = g.f43651c;
        fd.j0.i(objQ7, "default");
        fd.j0.i(gVar2, "validator");
        f43603i0 = new h9.k.a.C0302a(objQ7, gVar2);
        f43604j0 = r.A;
        f43605k0 = n0.f41612l;
        f43606l0 = v0.f43399d;
        f43607m0 = v0.f43400e;
        f43608n0 = n0.f41613m;
        f43609o0 = v0.f43401f;
        f43610p0 = n0.f41614n;
        f43611q0 = n0.f41607g;
        f43612r0 = r.B;
        f43613s0 = n0.f41608h;
        f43614t0 = n0.f41609i;
        f43615u0 = r.C;
        f43616v0 = n0.f41610j;
        f43617w0 = r.D;
        f43618x0 = n0.f41611k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0(o oVar, q qVar, v vVar, List<? extends q> list, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, c0 c0Var, List<? extends e0> list2, k0 k0Var, v9.b<Long> bVar4, v9.b<y0> bVar5, v9.b<z0> bVar6, List<? extends q1> list3, List<? extends q> list4, List<? extends z1> list5, n2 n2Var, l6 l6Var, String str, List<? extends y9.k> list6, v9.b<i> bVar7, k kVar, List<? extends q> list7, x1 x1Var, v9.b<j> bVar8, x1 x1Var2, v9.b<Long> bVar9, List<? extends q> list8, k kVar2, List<? extends x7> list9, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list10, v9.b<n8> bVar10, o8 o8Var, List<? extends o8> list11, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(vVar, "actionAnimation");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar5, "contentAlignmentHorizontal");
        fd.j0.i(bVar6, "contentAlignmentVertical");
        fd.j0.i(l6Var, "height");
        fd.j0.i(list6, "items");
        fd.j0.i(bVar7, "layoutMode");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(bVar8, "orientation");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar10, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f43619a = oVar;
        this.f43620b = qVar;
        this.f43621c = vVar;
        this.f43622d = list;
        this.f43623e = bVar;
        this.f43624f = bVar2;
        this.f43625g = bVar3;
        this.f43626h = c0Var;
        this.f43627i = list2;
        this.f43628j = k0Var;
        this.f43629k = bVar4;
        this.f43630l = bVar5;
        this.f43631m = bVar6;
        this.f43632n = list3;
        this.f43633o = list4;
        this.f43634p = list5;
        this.f43635q = n2Var;
        this.f43636r = l6Var;
        this.f43637s = str;
        this.f43638t = list6;
        this.f43639u = bVar7;
        this.f43640v = kVar;
        this.f43641w = list7;
        this.f43642x = x1Var;
        this.f43643y = bVar8;
        this.f43644z = x1Var2;
        this.A = bVar9;
        this.B = list8;
        this.C = kVar2;
        this.D = list9;
        this.E = z7Var;
        this.F = r0Var;
        this.G = a0Var;
        this.H = a0Var2;
        this.I = list10;
        this.J = bVar10;
        this.K = o8Var;
        this.L = list11;
        this.M = l6Var2;
    }

    public /* synthetic */ w0(o oVar, q qVar, v vVar, List list, v9.b bVar, v9.b bVar2, v9.b bVar3, c0 c0Var, List list2, k0 k0Var, v9.b bVar4, v9.b bVar5, v9.b bVar6, List list3, List list4, List list5, n2 n2Var, l6 l6Var, String str, List list6, v9.b bVar7, k kVar, List list7, x1 x1Var, v9.b bVar8, x1 x1Var2, v9.b bVar9, List list8, k kVar2, List list9, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list10, v9.b bVar10, o8 o8Var, List list11, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? O : oVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? P : vVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? Q : bVar3, (i10 & 128) != 0 ? null : c0Var, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? R : k0Var, (i10 & 1024) != 0 ? null : bVar4, (i10 & 2048) != 0 ? S : bVar5, (i10 & 4096) != 0 ? T : bVar6, (i10 & 8192) != 0 ? null : list3, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i10) != 0 ? null : list5, (65536 & i10) != 0 ? null : n2Var, (131072 & i10) != 0 ? U : l6Var, (262144 & i10) != 0 ? null : str, list6, (1048576 & i10) != 0 ? V : bVar7, (2097152 & i10) != 0 ? null : kVar, (4194304 & i10) != 0 ? null : list7, (8388608 & i10) != 0 ? W : x1Var, (16777216 & i10) != 0 ? X : bVar8, (33554432 & i10) != 0 ? Y : x1Var2, (67108864 & i10) != 0 ? null : bVar9, (134217728 & i10) != 0 ? null : list8, (268435456 & i10) != 0 ? null : kVar2, (536870912 & i10) != 0 ? null : list9, (1073741824 & i10) != 0 ? Z : z7Var, (i10 & Integer.MIN_VALUE) != 0 ? null : r0Var, (i11 & 1) != 0 ? null : a0Var, (i11 & 2) != 0 ? null : a0Var2, (i11 & 4) != 0 ? null : list10, (i11 & 8) != 0 ? f43595a0 : bVar10, (i11 & 16) != 0 ? null : o8Var, (i11 & 32) != 0 ? null : list11, (i11 & 64) != 0 ? f43596b0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.E;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f43627i;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.L;
    }

    @Override // y9.g0
    public o d() {
        return this.f43619a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f43629k;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f43642x;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.A;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f43628j;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f43636r;
    }

    @Override // y9.g0
    public String getId() {
        return this.f43637s;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.J;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.M;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f43644z;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.I;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.B;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f43623e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f43634p;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.D;
    }

    @Override // y9.g0
    public o8 n() {
        return this.K;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f43624f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.G;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f43625g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f43635q;
    }

    @Override // y9.g0
    public a0 s() {
        return this.H;
    }

    @Override // y9.g0
    public r0 t() {
        return this.F;
    }
}
