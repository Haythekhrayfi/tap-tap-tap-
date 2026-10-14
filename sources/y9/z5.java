package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z5 implements u9.a, g0 {
    public static final g L = new g(null);
    public static final o M;
    public static final v9.b<Double> N;
    public static final k0 O;
    public static final v9.b<p2> P;
    public static final v9.b<Long> Q;
    public static final v9.b<n6> R;
    public static final v9.b<q2> S;
    public static final l6.e T;
    public static final v9.b<Integer> U;
    public static final v9.b<Double> V;
    public static final x1 W;
    public static final x1 X;
    public static final v9.b<Integer> Y;
    public static final z7 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<n8> f44620a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final l6.d f44621b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<t> f44622c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<u> f44623d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<p2> f44624e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<n6> f44625f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<q2> f44626g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.k<n8> f44627h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Double> f44628i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<e0> f44629j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Long> f44630k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<q1> f44631l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<z1> f44632m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<Long> f44633n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<String> f44634o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<String> f44635p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<Long> f44636q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<h> f44637r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<Long> f44638s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<q> f44639t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<x7> f44640u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<c8> f44641v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<String> f44642w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.g<o8> f44643x0;
    public final List<x7> A;
    public final z7 B;
    public final r0 C;
    public final a0 D;
    public final a0 E;
    public final List<c8> F;
    public final String G;
    public final v9.b<n8> H;
    public final o8 I;
    public final List<o8> J;
    public final l6 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f44644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f44645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f44646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f44647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f44648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f44649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f44650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<q1> f44651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<z1> f44652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n2 f44653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<p2> f44654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<Long> f44655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v9.b<n6> f44656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v9.b<q2> f44657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l6 f44658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v9.b<Integer> f44659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<String> f44660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f44661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v9.b<Double> f44662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v9.b<Long> f44663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x1 f44664u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<h> f44665v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f44666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v9.b<Long> f44667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<q> f44668y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v9.b<Integer> f44669z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44670c = new a();

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
        public static final b f44671c = new b();

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
        public static final c f44672c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof p2);
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44673c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class e extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44674c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof q2);
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44675c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class g {
        public g() {
        }

        public g(vc.g gVar) {
        }

        public final z5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = z5.M;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, z5.f44622c0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, z5.f44623d0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = z5.f44628i0;
            v9.b<Double> bVar = z5.N;
            h9.k<Double> kVar = h9.l.f31000d;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, z5.f44629j0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = z5.O;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = z5.f44630k0;
            h9.k<Long> kVar2 = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar2);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, z5.f44631l0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, z5.f44632m0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(p2.Converter);
            uc.l lVar3 = p2.FROM_STRING;
            v9.b<p2> bVar2 = z5.P;
            v9.b<p2> bVarT = h9.c.t(jSONObject, "font_family", lVar3, eVarA, cVar, bVar2, z5.f44624e0);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            h9.m<Long> mVar3 = z5.f44633n0;
            v9.b<Long> bVar3 = z5.Q;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "font_size", lVar2, mVar3, eVarA, bVar3, kVar2);
            if (bVarR2 != null) {
                bVar3 = bVarR2;
            }
            Objects.requireNonNull(n6.Converter);
            uc.l lVar4 = n6.FROM_STRING;
            v9.b<n6> bVar4 = z5.R;
            v9.b<n6> bVarT2 = h9.c.t(jSONObject, "font_size_unit", lVar4, eVarA, cVar, bVar4, z5.f44625f0);
            if (bVarT2 != null) {
                bVar4 = bVarT2;
            }
            Objects.requireNonNull(q2.Converter);
            uc.l lVar5 = q2.FROM_STRING;
            v9.b<q2> bVar5 = z5.S;
            v9.b<q2> bVarT3 = h9.c.t(jSONObject, "font_weight", lVar5, eVarA, cVar, bVar5, z5.f44626g0);
            if (bVarT3 != null) {
                bVar5 = bVarT3;
            }
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar, eVarA, cVar);
            if (l6Var == null) {
                l6Var = z5.T;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            uc.l<Object, Integer> lVar6 = h9.h.f30978a;
            v9.b<Integer> bVar6 = z5.U;
            h9.k<Integer> kVar3 = h9.l.f31002f;
            v9.b<Double> bVar7 = bVar;
            v9.b<Integer> bVarT4 = h9.c.t(jSONObject, "hint_color", lVar6, eVarA, cVar, bVar6, kVar3);
            if (bVarT4 != null) {
                bVar6 = bVarT4;
            }
            v9.b bVarO = h9.c.o(jSONObject, "hint_text", z5.f44634o0, eVarA, cVar, h9.l.f30999c);
            h9.m<String> mVar4 = z5.f44635p0;
            uc.l<?, ?> lVar7 = h9.c.f30973c;
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar7, mVar4, eVarA);
            v9.b<Double> bVar8 = z5.V;
            v9.b<Double> bVarT5 = h9.c.t(jSONObject, "letter_spacing", lVar, eVarA, cVar, bVar8, kVar);
            if (bVarT5 != null) {
                bVar8 = bVarT5;
            }
            v9.b bVarQ2 = h9.c.q(jSONObject, "line_height", lVar2, z5.f44636q0, eVarA, cVar, kVar2);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar2 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar2, eVarA, cVar);
            if (x1Var == null) {
                x1Var = z5.W;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Objects.requireNonNull(h.f44676c);
            List listL = h9.c.l(jSONObject, "options", h.f44677d, z5.f44637r0, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"options\"…S_VALIDATOR, logger, env)");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar2, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = z5.X;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ3 = h9.c.q(jSONObject, "row_span", lVar2, z5.f44638s0, eVarA, cVar, kVar2);
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, z5.f44639t0, eVarA, cVar);
            v9.b<Integer> bVar9 = z5.Y;
            v9.b<Integer> bVarT6 = h9.c.t(jSONObject, "text_color", lVar6, eVarA, cVar, bVar9, kVar3);
            v9.b<Integer> bVar10 = bVarT6 == null ? bVar9 : bVarT6;
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, z5.f44640u0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = z5.Z;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, z5.f44641v0, eVarA, cVar);
            String str2 = (String) h9.c.c(jSONObject, "value_variable", lVar7, z5.f44642w0);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar8 = n8.FROM_STRING;
            v9.b<n8> bVar11 = z5.f44620a0;
            v9.b<n8> bVarT7 = h9.c.t(jSONObject, "visibility", lVar8, eVarA, cVar, bVar11, z5.f44627h0);
            v9.b<n8> bVar12 = bVarT7 == null ? bVar11 : bVarT7;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar4 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar4, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "visibility_actions", pVar4, z5.f44643x0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = z5.f44621b0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new z5(oVar2, bVarS, bVarS2, bVar7, listW, k0Var2, bVarQ, listW2, listW3, n2Var, bVar2, bVar3, bVar4, bVar5, l6Var2, bVar6, bVarO, str, bVar8, bVarQ2, x1Var2, listL, x1Var4, bVarQ3, listW4, bVar10, listW5, z7Var2, r0Var, a0Var, a0Var2, listV, str2, bVar12, o8Var, listW6, l6Var3);
        }
    }

    public static class h implements u9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44676c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, h> f44677d = a.f44680c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<String> f44678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<String> f44679b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, h> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f44680c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public h invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(h.f44676c);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                h9.k<String> kVar = h9.l.f30999c;
                return new h(h9.c.p(jSONObject2, "text", eVarA, cVar2, kVar), h9.c.f(jSONObject2, "value", eVarA, cVar2, kVar));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        public h(v9.b<String> bVar, v9.b<String> bVar2) {
            fd.j0.i(bVar2, "value");
            this.f44678a = bVar;
            this.f44679b = bVar2;
        }

        public /* synthetic */ h(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : bVar, bVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        M = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        N = aVar.a(Double.valueOf(1.0d));
        O = new k0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        P = aVar.a(p2.TEXT);
        Q = aVar.a(12L);
        R = aVar.a(n6.SP);
        S = aVar.a(q2.REGULAR);
        T = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        U = aVar.a(1929379840);
        V = aVar.a(Double.valueOf(0.0d));
        W = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, gVar);
        X = new x1(null, null, null, null, null, 31, null);
        Y = aVar.a(-16777216);
        Z = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        f44620a0 = aVar.a(n8.VISIBLE);
        f44621b0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f44670c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f44622c0 = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar = b.f44671c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar, "validator");
        f44623d0 = new h9.k.a.C0302a(objQ2, bVar);
        Object objQ3 = kc.j.q(p2.values());
        c cVar = c.f44672c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f44624e0 = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(n6.values());
        d dVar = d.f44673c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        f44625f0 = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(q2.values());
        e eVar = e.f44674c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f44626g0 = new h9.k.a.C0302a(objQ5, eVar);
        Object objQ6 = kc.j.q(n8.values());
        f fVar = f.f44675c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(fVar, "validator");
        f44627h0 = new h9.k.a.C0302a(objQ6, fVar);
        f44628i0 = y5.f44493d;
        f44629j0 = w5.f43770l;
        f44630k0 = w5.f43771m;
        f44631l0 = y5.f44495f;
        f44632m0 = w5.f43772n;
        f44633n0 = w5.f43773o;
        f44634o0 = u4.B;
        f44635p0 = u4.C;
        f44636q0 = u4.D;
        f44637r0 = w5.f43765g;
        f44638s0 = w5.f43766h;
        f44639t0 = u4.E;
        f44640u0 = w5.f43767i;
        f44641v0 = w5.f43768j;
        f44642w0 = w5.f43769k;
        f44643x0 = y5.f44494e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z5(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, List<? extends q1> list2, List<? extends z1> list3, n2 n2Var, v9.b<p2> bVar5, v9.b<Long> bVar6, v9.b<n6> bVar7, v9.b<q2> bVar8, l6 l6Var, v9.b<Integer> bVar9, v9.b<String> bVar10, String str, v9.b<Double> bVar11, v9.b<Long> bVar12, x1 x1Var, List<? extends h> list4, x1 x1Var2, v9.b<Long> bVar13, List<? extends q> list5, v9.b<Integer> bVar14, List<? extends x7> list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list7, String str2, v9.b<n8> bVar15, o8 o8Var, List<? extends o8> list8, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar5, "fontFamily");
        fd.j0.i(bVar6, "fontSize");
        fd.j0.i(bVar7, "fontSizeUnit");
        fd.j0.i(bVar8, "fontWeight");
        fd.j0.i(l6Var, "height");
        fd.j0.i(bVar9, "hintColor");
        fd.j0.i(bVar11, "letterSpacing");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(list4, "options");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar14, "textColor");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(str2, "valueVariable");
        fd.j0.i(bVar15, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f44644a = oVar;
        this.f44645b = bVar;
        this.f44646c = bVar2;
        this.f44647d = bVar3;
        this.f44648e = list;
        this.f44649f = k0Var;
        this.f44650g = bVar4;
        this.f44651h = list2;
        this.f44652i = list3;
        this.f44653j = n2Var;
        this.f44654k = bVar5;
        this.f44655l = bVar6;
        this.f44656m = bVar7;
        this.f44657n = bVar8;
        this.f44658o = l6Var;
        this.f44659p = bVar9;
        this.f44660q = bVar10;
        this.f44661r = str;
        this.f44662s = bVar11;
        this.f44663t = bVar12;
        this.f44664u = x1Var;
        this.f44665v = list4;
        this.f44666w = x1Var2;
        this.f44667x = bVar13;
        this.f44668y = list5;
        this.f44669z = bVar14;
        this.A = list6;
        this.B = z7Var;
        this.C = r0Var;
        this.D = a0Var;
        this.E = a0Var2;
        this.F = list7;
        this.G = str2;
        this.H = bVar15;
        this.I = o8Var;
        this.J = list8;
        this.K = l6Var2;
    }

    public /* synthetic */ z5(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, List list2, List list3, n2 n2Var, v9.b bVar5, v9.b bVar6, v9.b bVar7, v9.b bVar8, l6 l6Var, v9.b bVar9, v9.b bVar10, String str, v9.b bVar11, v9.b bVar12, x1 x1Var, List list4, x1 x1Var2, v9.b bVar13, List list5, v9.b bVar14, List list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list7, String str2, v9.b bVar15, o8 o8Var, List list8, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? M : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? N : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? O : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : list3, (i10 & 512) != 0 ? null : n2Var, (i10 & 1024) != 0 ? P : bVar5, (i10 & 2048) != 0 ? Q : bVar6, (i10 & 4096) != 0 ? R : bVar7, (i10 & 8192) != 0 ? S : bVar8, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? T : l6Var, (32768 & i10) != 0 ? U : bVar9, (65536 & i10) != 0 ? null : bVar10, (131072 & i10) != 0 ? null : str, (262144 & i10) != 0 ? V : bVar11, (524288 & i10) != 0 ? null : bVar12, (1048576 & i10) != 0 ? W : x1Var, list4, (4194304 & i10) != 0 ? X : x1Var2, (8388608 & i10) != 0 ? null : bVar13, (16777216 & i10) != 0 ? null : list5, (33554432 & i10) != 0 ? Y : bVar14, (67108864 & i10) != 0 ? null : list6, (134217728 & i10) != 0 ? Z : z7Var, (268435456 & i10) != 0 ? null : r0Var, (536870912 & i10) != 0 ? null : a0Var, (1073741824 & i10) != 0 ? null : a0Var2, (i10 & Integer.MIN_VALUE) != 0 ? null : list7, str2, (i11 & 2) != 0 ? f44620a0 : bVar15, (i11 & 4) != 0 ? null : o8Var, (i11 & 8) != 0 ? null : list8, (i11 & 16) != 0 ? f44621b0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.B;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f44648e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.J;
    }

    @Override // y9.g0
    public o d() {
        return this.f44644a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f44650g;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f44664u;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f44667x;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f44649f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f44658o;
    }

    @Override // y9.g0
    public String getId() {
        return this.f44661r;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.H;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.K;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f44666w;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.F;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f44668y;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f44645b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f44652i;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.A;
    }

    @Override // y9.g0
    public o8 n() {
        return this.I;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f44646c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.D;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f44647d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f44653j;
    }

    @Override // y9.g0
    public a0 s() {
        return this.E;
    }

    @Override // y9.g0
    public r0 t() {
        return this.C;
    }
}
