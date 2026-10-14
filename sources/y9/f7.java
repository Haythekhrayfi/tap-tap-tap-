package y9;

import ch.qos.logback.core.util.FileUtil;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f7 implements u9.a, g0 {
    public static final d K = new d(null);
    public static final o L;
    public static final v9.b<Double> M;
    public static final k0 N;
    public static final v9.b<Boolean> O;
    public static final v9.b<Boolean> P;
    public static final l6.e Q;
    public static final x1 R;
    public static final x1 S;
    public static final v9.b<Boolean> T;
    public static final v9.b<Long> U;
    public static final v9.b<Integer> V;
    public static final x1 W;
    public static final v9.b<Boolean> X;
    public static final f Y;
    public static final x1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final z7 f39975a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final v9.b<n8> f39976b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final l6.d f39977c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<t> f39978d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<u> f39979e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<n8> f39980f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.m<Double> f39981g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<e0> f39982h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Long> f39983i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<q1> f39984j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.g<z1> f39985k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<String> f39986l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<e> f39987m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<Long> f39988n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<q> f39989o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<Long> f39990p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<x7> f39991q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<c8> f39992r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<o8> f39993s0;
    public final List<x7> A;
    public final z7 B;
    public final r0 C;
    public final a0 D;
    public final a0 E;
    public final List<c8> F;
    public final v9.b<n8> G;
    public final o8 H;
    public final List<o8> I;
    public final l6 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f39995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f39996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f39997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f39998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f39999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f40000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<q1> f40001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v9.b<Boolean> f40002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<z1> f40003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n2 f40004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<Boolean> f40005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l6 f40006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f40007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<e> f40008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1 f40009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x1 f40010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9.b<Boolean> f40011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v9.b<Long> f40012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<q> f40013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v9.b<Long> f40014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v9.b<Integer> f40015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f40016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v9.b<Boolean> f40017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f40018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x1 f40019z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40020c = new a();

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
        public static final b f40021c = new b();

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
        public static final c f40022c = new c();

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

        public final f7 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = f7.L;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, f7.f39978d0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, f7.f39979e0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = f7.f39981g0;
            v9.b<Double> bVar = f7.M;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            v9.b<Double> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, f7.f39982h0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = f7.N;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = f7.f39983i0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, f7.f39984j0, eVarA, cVar);
            uc.l<Object, Boolean> lVar3 = h9.h.f30980c;
            v9.b<Boolean> bVar3 = f7.O;
            h9.k<Boolean> kVar2 = h9.l.f30997a;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject, "dynamic_height", lVar3, eVarA, cVar, bVar3, kVar2);
            if (bVarT != null) {
                bVar3 = bVarT;
            }
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, f7.f39985k0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            v9.b<Boolean> bVar4 = f7.P;
            v9.b<Boolean> bVarT2 = h9.c.t(jSONObject, "has_separator", lVar3, eVarA, cVar, bVar4, kVar2);
            if (bVarT2 != null) {
                bVar4 = bVarT2;
            }
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar, eVarA, cVar);
            if (l6Var == null) {
                l6Var = f7.Q;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, f7.f39986l0, eVarA);
            Objects.requireNonNull(e.f40023d);
            List listL = h9.c.l(jSONObject, "items", e.f40025f, f7.f39987m0, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar2 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar2, eVarA, cVar);
            if (x1Var == null) {
                x1Var = f7.R;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar2, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = f7.S;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b<Boolean> bVar5 = f7.T;
            v9.b<Boolean> bVarT3 = h9.c.t(jSONObject, "restrict_parent_scroll", lVar3, eVarA, cVar, bVar5, kVar2);
            if (bVarT3 != null) {
                bVar5 = bVarT3;
            }
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, f7.f39988n0, eVarA, cVar, kVar);
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, f7.f39989o0, eVarA, cVar);
            h9.m<Long> mVar3 = f7.f39990p0;
            v9.b<Long> bVar6 = f7.U;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "selected_tab", lVar2, mVar3, eVarA, bVar6, kVar);
            if (bVarR2 != null) {
                bVar6 = bVarR2;
            }
            uc.l<Object, Integer> lVar4 = h9.h.f30978a;
            v9.b<Integer> bVar7 = f7.V;
            v9.b<Integer> bVarT4 = h9.c.t(jSONObject, "separator_color", lVar4, eVarA, cVar, bVar7, h9.l.f31002f);
            v9.b<Integer> bVar8 = bVarT4 == null ? bVar7 : bVarT4;
            x1 x1Var5 = (x1) h9.c.n(jSONObject, "separator_paddings", pVar2, eVarA, cVar);
            if (x1Var5 == null) {
                x1Var5 = f7.W;
            }
            x1 x1Var6 = x1Var5;
            fd.j0.h(x1Var6, "JsonParser.readOptional(…OR_PADDINGS_DEFAULT_VALUE");
            v9.b<Boolean> bVar9 = f7.X;
            v9.b<Boolean> bVarT5 = h9.c.t(jSONObject, "switch_tabs_by_content_swipe_enabled", lVar3, eVarA, cVar, bVar9, kVar2);
            v9.b<Boolean> bVar10 = bVarT5 == null ? bVar9 : bVarT5;
            Objects.requireNonNull(f.f40030r);
            f fVar = (f) h9.c.n(jSONObject, "tab_title_style", f.P, eVarA, cVar);
            if (fVar == null) {
                fVar = f7.Y;
            }
            f fVar2 = fVar;
            fd.j0.h(fVar2, "JsonParser.readOptional(…TITLE_STYLE_DEFAULT_VALUE");
            x1 x1Var7 = (x1) h9.c.n(jSONObject, "title_paddings", pVar2, eVarA, cVar);
            if (x1Var7 == null) {
                x1Var7 = f7.Z;
            }
            x1 x1Var8 = x1Var7;
            fd.j0.h(x1Var8, "JsonParser.readOptional(…LE_PADDINGS_DEFAULT_VALUE");
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, f7.f39991q0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = f7.f39975a0;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, f7.f39992r0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar5 = n8.FROM_STRING;
            v9.b<n8> bVar11 = f7.f39976b0;
            v9.b<n8> bVarT6 = h9.c.t(jSONObject, "visibility", lVar5, eVarA, cVar, bVar11, f7.f39980f0);
            v9.b<n8> bVar12 = bVarT6 == null ? bVar11 : bVarT6;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar4 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar4, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "visibility_actions", pVar4, f7.f39993s0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = f7.f39977c0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new f7(oVar2, bVarS, bVarS2, bVar2, listW, k0Var2, bVarQ, listW2, bVar3, listW3, n2Var, bVar4, l6Var2, str, listL, x1Var2, x1Var4, bVar5, bVarQ2, listW4, bVar6, bVar8, x1Var6, bVar10, fVar2, x1Var8, listW5, z7Var2, r0Var, a0Var, a0Var2, listV, bVar12, o8Var, listW6, l6Var3);
        }
    }

    public static class e implements u9.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f40023d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.m<String> f40024e = y6.f44537x;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, e> f40025f = a.f40029c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f40026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<String> f40027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f40028c;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40029c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public e invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(e.f40023d);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(k.f40973a);
                k kVar = (k) h9.c.d(jSONObject2, "div", k.f40974b, h9.c.f30971a, cVar2);
                v9.b bVarE = h9.c.e(jSONObject2, "title", e.f40024e, eVarA, cVar2, h9.l.f30999c);
                Objects.requireNonNull(q.f42091g);
                return new e(kVar, bVarE, (q) h9.c.n(jSONObject2, "title_click_action", q.f42095k, eVarA, cVar2));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        public e(k kVar, v9.b<String> bVar, q qVar) {
            fd.j0.i(kVar, "div");
            fd.j0.i(bVar, "title");
            this.f40026a = kVar;
            this.f40027b = bVar;
            this.f40028c = qVar;
        }

        public /* synthetic */ e(k kVar, v9.b bVar, q qVar, int i10, vc.g gVar) {
            this(kVar, bVar, (i10 & 4) != 0 ? null : qVar);
        }
    }

    public static class f implements u9.a {
        public static final v9.b<Integer> A;
        public static final v9.b<Long> B;
        public static final v9.b<Double> C;
        public static final x1 D;
        public static final h9.k<q2> E;
        public static final h9.k<a> F;
        public static final h9.k<p2> G;
        public static final h9.k<n6> H;
        public static final h9.k<q2> I;
        public static final h9.k<q2> J;
        public static final h9.m<Long> K;
        public static final h9.m<Long> L;
        public static final h9.m<Long> M;
        public static final h9.m<Long> N;
        public static final h9.m<Long> O;
        public static final uc.p<u9.c, JSONObject, f> P;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final i f40030r = new i(null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final v9.b<Integer> f40031s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final v9.b<Integer> f40032t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final v9.b<Long> f40033u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final v9.b<a> f40034v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final v9.b<p2> f40035w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final v9.b<Long> f40036x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final v9.b<n6> f40037y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final v9.b<q2> f40038z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<Integer> f40039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<q2> f40040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<Integer> f40041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v9.b<Long> f40042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v9.b<a> f40043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final v9.b<Long> f40044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b1 f40045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final v9.b<Long> f40046h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final v9.b<n6> f40047i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final v9.b<q2> f40048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final v9.b<Integer> f40049k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final v9.b<q2> f40050l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final v9.b<Integer> f40051m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final v9.b<Long> f40052n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final v9.b<Double> f40053o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final v9.b<Long> f40054p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final x1 f40055q;

        public enum a {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");

            private final String value;
            public static final b Converter = new b(null);
            private static final uc.l<String, a> FROM_STRING = C0472a.f40056c;

            /* JADX INFO: renamed from: y9.f7$f$a$a, reason: collision with other inner class name */
            public static final class C0472a extends vc.l implements uc.l<String, a> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C0472a f40056c = new C0472a();

                public C0472a() {
                    super(1);
                }

                @Override // uc.l
                public a invoke(String str) {
                    String str2 = str;
                    fd.j0.i(str2, "string");
                    a aVar = a.SLIDE;
                    if (fd.j0.d(str2, aVar.value)) {
                        return aVar;
                    }
                    a aVar2 = a.FADE;
                    if (fd.j0.d(str2, aVar2.value)) {
                        return aVar2;
                    }
                    a aVar3 = a.NONE;
                    if (fd.j0.d(str2, aVar3.value)) {
                        return aVar3;
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

            a(String str) {
                this.value = str;
            }
        }

        public static final class b extends vc.l implements uc.p<u9.c, JSONObject, f> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f40057c = new b();

            public b() {
                super(2);
            }

            @Override // uc.p
            public f invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(f.f40030r);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                uc.l<Object, Integer> lVar = h9.h.f30978a;
                v9.b<Integer> bVar = f.f40031s;
                h9.k<Integer> kVar = h9.l.f31002f;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, "active_background_color", lVar, eVarA, cVar2, bVar, kVar);
                if (bVarT != null) {
                    bVar = bVarT;
                }
                Objects.requireNonNull(q2.Converter);
                v9.b bVarS = h9.c.s(jSONObject2, "active_font_weight", q2.FROM_STRING, eVarA, cVar2, f.E);
                v9.b<Integer> bVar2 = f.f40032t;
                v9.b<Integer> bVarT2 = h9.c.t(jSONObject2, "active_text_color", lVar, eVarA, cVar2, bVar2, kVar);
                if (bVarT2 != null) {
                    bVar2 = bVarT2;
                }
                uc.l<Number, Long> lVar2 = h9.h.f30982e;
                h9.m<Long> mVar = f.K;
                v9.b<Long> bVar3 = f.f40033u;
                h9.k<Long> kVar2 = h9.l.f30998b;
                v9.b<Long> bVarR = h9.c.r(jSONObject2, "animation_duration", lVar2, mVar, eVarA, bVar3, kVar2);
                if (bVarR != null) {
                    bVar3 = bVarR;
                }
                Objects.requireNonNull(a.Converter);
                uc.l lVar3 = a.FROM_STRING;
                v9.b<a> bVar4 = f.f40034v;
                v9.b<a> bVarT3 = h9.c.t(jSONObject2, "animation_type", lVar3, eVarA, cVar2, bVar4, f.F);
                if (bVarT3 != null) {
                    bVar4 = bVarT3;
                }
                v9.b bVarQ = h9.c.q(jSONObject2, "corner_radius", lVar2, f.L, eVarA, cVar2, kVar2);
                Objects.requireNonNull(b1.f39118e);
                b1 b1Var = (b1) h9.c.n(jSONObject2, "corners_radius", b1.f39123j, eVarA, cVar2);
                Objects.requireNonNull(p2.Converter);
                uc.l lVar4 = p2.FROM_STRING;
                v9.b<p2> bVar5 = f.f40035w;
                v9.b<p2> bVarT4 = h9.c.t(jSONObject2, "font_family", lVar4, eVarA, cVar2, bVar5, f.G);
                if (bVarT4 != null) {
                    bVar5 = bVarT4;
                }
                h9.m<Long> mVar2 = f.M;
                v9.b<Long> bVar6 = f.f40036x;
                v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "font_size", lVar2, mVar2, eVarA, bVar6, kVar2);
                if (bVarR2 != null) {
                    bVar6 = bVarR2;
                }
                Objects.requireNonNull(n6.Converter);
                uc.l lVar5 = n6.FROM_STRING;
                v9.b<n6> bVar7 = f.f40037y;
                v9.b<n6> bVarT5 = h9.c.t(jSONObject2, "font_size_unit", lVar5, eVarA, cVar2, bVar7, f.H);
                if (bVarT5 != null) {
                    bVar7 = bVarT5;
                }
                uc.l lVar6 = q2.FROM_STRING;
                v9.b<q2> bVar8 = f.f40038z;
                v9.b<q2> bVarT6 = h9.c.t(jSONObject2, "font_weight", lVar6, eVarA, cVar2, bVar8, f.I);
                if (bVarT6 != null) {
                    bVar8 = bVarT6;
                }
                v9.b bVarS2 = h9.c.s(jSONObject2, "inactive_background_color", lVar, eVarA, cVar2, kVar);
                v9.b bVarS3 = h9.c.s(jSONObject2, "inactive_font_weight", q2.FROM_STRING, eVarA, cVar2, f.J);
                v9.b<Integer> bVar9 = f.A;
                v9.b<Integer> bVarT7 = h9.c.t(jSONObject2, "inactive_text_color", lVar, eVarA, cVar2, bVar9, kVar);
                if (bVarT7 != null) {
                    bVar9 = bVarT7;
                }
                h9.m<Long> mVar3 = f.N;
                v9.b<Long> bVar10 = f.B;
                v9.b<Long> bVarR3 = h9.c.r(jSONObject2, "item_spacing", lVar2, mVar3, eVarA, bVar10, kVar2);
                v9.b<Long> bVar11 = bVarR3 == null ? bVar10 : bVarR3;
                uc.l<Number, Double> lVar7 = h9.h.f30981d;
                v9.b<Double> bVar12 = f.C;
                v9.b<Double> bVarT8 = h9.c.t(jSONObject2, "letter_spacing", lVar7, eVarA, cVar2, bVar12, h9.l.f31000d);
                v9.b<Double> bVar13 = bVarT8 == null ? bVar12 : bVarT8;
                v9.b bVarQ2 = h9.c.q(jSONObject2, "line_height", lVar2, f.O, eVarA, cVar2, kVar2);
                Objects.requireNonNull(x1.f44020f);
                x1 x1Var = (x1) h9.c.n(jSONObject2, "paddings", x1.f44031q, eVarA, cVar2);
                if (x1Var == null) {
                    x1Var = f.D;
                }
                fd.j0.h(x1Var, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
                return new f(bVar, bVarS, bVar2, bVar3, bVar4, bVarQ, b1Var, bVar5, bVar6, bVar7, bVar8, bVarS2, bVarS3, bVar9, bVar11, bVar13, bVarQ2, x1Var);
            }
        }

        public static final class c extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f40058c = new c();

            public c() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class d extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f40059c = new d();

            public d() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof a);
            }
        }

        public static final class e extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f40060c = new e();

            public e() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof p2);
            }
        }

        /* JADX INFO: renamed from: y9.f7$f$f, reason: collision with other inner class name */
        public static final class C0473f extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0473f f40061c = new C0473f();

            public C0473f() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class g extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f40062c = new g();

            public g() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class h extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f40063c = new h();

            public h() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
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
            f40031s = aVar.a(-9120);
            f40032t = aVar.a(-872415232);
            f40033u = aVar.a(300L);
            f40034v = aVar.a(a.SLIDE);
            f40035w = aVar.a(p2.TEXT);
            f40036x = aVar.a(12L);
            f40037y = aVar.a(n6.SP);
            f40038z = aVar.a(q2.REGULAR);
            A = aVar.a(Integer.MIN_VALUE);
            B = aVar.a(0L);
            C = aVar.a(Double.valueOf(0.0d));
            D = new x1(aVar.a(6L), aVar.a(8L), aVar.a(8L), aVar.a(6L), null, 16, null);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(q2.values());
            c cVar = c.f40058c;
            fd.j0.i(objQ, "default");
            fd.j0.i(cVar, "validator");
            E = new h9.k.a.C0302a(objQ, cVar);
            Object objQ2 = kc.j.q(a.values());
            d dVar = d.f40059c;
            fd.j0.i(objQ2, "default");
            fd.j0.i(dVar, "validator");
            F = new h9.k.a.C0302a(objQ2, dVar);
            Object objQ3 = kc.j.q(p2.values());
            e eVar = e.f40060c;
            fd.j0.i(objQ3, "default");
            fd.j0.i(eVar, "validator");
            G = new h9.k.a.C0302a(objQ3, eVar);
            Object objQ4 = kc.j.q(n6.values());
            C0473f c0473f = C0473f.f40061c;
            fd.j0.i(objQ4, "default");
            fd.j0.i(c0473f, "validator");
            H = new h9.k.a.C0302a(objQ4, c0473f);
            Object objQ5 = kc.j.q(q2.values());
            g gVar = g.f40062c;
            fd.j0.i(objQ5, "default");
            fd.j0.i(gVar, "validator");
            I = new h9.k.a.C0302a(objQ5, gVar);
            Object objQ6 = kc.j.q(q2.values());
            h hVar = h.f40063c;
            fd.j0.i(objQ6, "default");
            fd.j0.i(hVar, "validator");
            J = new h9.k.a.C0302a(objQ6, hVar);
            K = y6.f44538y;
            L = y6.f44539z;
            M = y6.A;
            N = y6.B;
            O = y6.C;
            P = b.f40057c;
        }

        public f() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }

        public f(v9.b<Integer> bVar, v9.b<q2> bVar2, v9.b<Integer> bVar3, v9.b<Long> bVar4, v9.b<a> bVar5, v9.b<Long> bVar6, b1 b1Var, v9.b<p2> bVar7, v9.b<Long> bVar8, v9.b<n6> bVar9, v9.b<q2> bVar10, v9.b<Integer> bVar11, v9.b<q2> bVar12, v9.b<Integer> bVar13, v9.b<Long> bVar14, v9.b<Double> bVar15, v9.b<Long> bVar16, x1 x1Var) {
            fd.j0.i(bVar, "activeBackgroundColor");
            fd.j0.i(bVar3, "activeTextColor");
            fd.j0.i(bVar4, "animationDuration");
            fd.j0.i(bVar5, "animationType");
            fd.j0.i(bVar7, "fontFamily");
            fd.j0.i(bVar8, "fontSize");
            fd.j0.i(bVar9, "fontSizeUnit");
            fd.j0.i(bVar10, "fontWeight");
            fd.j0.i(bVar13, "inactiveTextColor");
            fd.j0.i(bVar14, "itemSpacing");
            fd.j0.i(bVar15, "letterSpacing");
            fd.j0.i(x1Var, "paddings");
            this.f40039a = bVar;
            this.f40040b = bVar2;
            this.f40041c = bVar3;
            this.f40042d = bVar4;
            this.f40043e = bVar5;
            this.f40044f = bVar6;
            this.f40045g = b1Var;
            this.f40046h = bVar8;
            this.f40047i = bVar9;
            this.f40048j = bVar10;
            this.f40049k = bVar11;
            this.f40050l = bVar12;
            this.f40051m = bVar13;
            this.f40052n = bVar14;
            this.f40053o = bVar15;
            this.f40054p = bVar16;
            this.f40055q = x1Var;
        }

        public /* synthetic */ f(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, v9.b bVar6, b1 b1Var, v9.b bVar7, v9.b bVar8, v9.b bVar9, v9.b bVar10, v9.b bVar11, v9.b bVar12, v9.b bVar13, v9.b bVar14, v9.b bVar15, v9.b bVar16, x1 x1Var, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? f40031s : bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? f40032t : bVar3, (i10 & 8) != 0 ? f40033u : bVar4, (i10 & 16) != 0 ? f40034v : bVar5, (i10 & 32) != 0 ? null : bVar6, (i10 & 64) != 0 ? null : b1Var, (i10 & 128) != 0 ? f40035w : bVar7, (i10 & 256) != 0 ? f40036x : bVar8, (i10 & 512) != 0 ? f40037y : bVar9, (i10 & 1024) != 0 ? f40038z : bVar10, (i10 & 2048) != 0 ? null : bVar11, (i10 & 4096) != 0 ? null : bVar12, (i10 & 8192) != 0 ? A : bVar13, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? B : bVar14, (i10 & FileUtil.BUF_SIZE) != 0 ? C : bVar15, (i10 & 65536) != 0 ? null : bVar16, (i10 & 131072) != 0 ? D : x1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        v9.b bVar = null;
        vc.g gVar = null;
        L = new o(null, bVar, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        M = aVar.a(Double.valueOf(1.0d));
        N = new k0(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        Boolean bool = Boolean.FALSE;
        O = aVar.a(bool);
        P = aVar.a(bool);
        Q = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        v9.b bVar2 = null;
        v9.b bVar3 = null;
        R = new x1(null, null, null, bVar2, bVar3, 31, null);
        vc.g gVar2 = null;
        S = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, gVar2);
        T = aVar.a(bool);
        U = aVar.a(0L);
        V = aVar.a(335544320);
        int i10 = 16;
        W = new x1(aVar.a(0L), aVar.a(12L), aVar.a(12L), aVar.a(0L), null == true ? 1 : 0, i10, gVar2);
        X = aVar.a(Boolean.TRUE);
        Y = new f(null == true ? 1 : 0, bVar2, bVar3, null, null == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        Z = new x1(aVar.a(8L), aVar.a(12L), aVar.a(12L), aVar.a(0L), null == true ? 1 : 0, i10, gVar2);
        f39975a0 = new z7(null, null == true ? 1 : 0, bVar2, 7, null == true ? 1 : 0);
        f39976b0 = aVar.a(n8.VISIBLE);
        f39977c0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i11 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f40020c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f39978d0 = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar4 = b.f40021c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar4, "validator");
        f39979e0 = new h9.k.a.C0302a(objQ2, bVar4);
        Object objQ3 = kc.j.q(n8.values());
        c cVar = c.f40022c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f39980f0 = new h9.k.a.C0302a(objQ3, cVar);
        f39981g0 = y6.f44534u;
        f39982h0 = w6.f43806x;
        f39983i0 = w6.f43807y;
        f39984j0 = y6.f44535v;
        f39985k0 = w6.f43808z;
        f39986l0 = e7.f39876d;
        f39987m0 = y6.f44536w;
        f39988n0 = w6.f43803u;
        f39989o0 = y6.f44531r;
        f39990p0 = y6.f44532s;
        f39991q0 = w6.f43804v;
        f39992r0 = y6.f44533t;
        f39993s0 = w6.f43805w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f7(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, List<? extends q1> list2, v9.b<Boolean> bVar5, List<? extends z1> list3, n2 n2Var, v9.b<Boolean> bVar6, l6 l6Var, String str, List<? extends e> list4, x1 x1Var, x1 x1Var2, v9.b<Boolean> bVar7, v9.b<Long> bVar8, List<? extends q> list5, v9.b<Long> bVar9, v9.b<Integer> bVar10, x1 x1Var3, v9.b<Boolean> bVar11, f fVar, x1 x1Var4, List<? extends x7> list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list7, v9.b<n8> bVar12, o8 o8Var, List<? extends o8> list8, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar5, "dynamicHeight");
        fd.j0.i(bVar6, "hasSeparator");
        fd.j0.i(l6Var, "height");
        fd.j0.i(list4, "items");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar7, "restrictParentScroll");
        fd.j0.i(bVar9, "selectedTab");
        fd.j0.i(bVar10, "separatorColor");
        fd.j0.i(x1Var3, "separatorPaddings");
        fd.j0.i(bVar11, "switchTabsByContentSwipeEnabled");
        fd.j0.i(fVar, "tabTitleStyle");
        fd.j0.i(x1Var4, "titlePaddings");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar12, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f39994a = oVar;
        this.f39995b = bVar;
        this.f39996c = bVar2;
        this.f39997d = bVar3;
        this.f39998e = list;
        this.f39999f = k0Var;
        this.f40000g = bVar4;
        this.f40001h = list2;
        this.f40002i = bVar5;
        this.f40003j = list3;
        this.f40004k = n2Var;
        this.f40005l = bVar6;
        this.f40006m = l6Var;
        this.f40007n = str;
        this.f40008o = list4;
        this.f40009p = x1Var;
        this.f40010q = x1Var2;
        this.f40011r = bVar7;
        this.f40012s = bVar8;
        this.f40013t = list5;
        this.f40014u = bVar9;
        this.f40015v = bVar10;
        this.f40016w = x1Var3;
        this.f40017x = bVar11;
        this.f40018y = fVar;
        this.f40019z = x1Var4;
        this.A = list6;
        this.B = z7Var;
        this.C = r0Var;
        this.D = a0Var;
        this.E = a0Var2;
        this.F = list7;
        this.G = bVar12;
        this.H = o8Var;
        this.I = list8;
        this.J = l6Var2;
    }

    public /* synthetic */ f7(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, List list2, v9.b bVar5, List list3, n2 n2Var, v9.b bVar6, l6 l6Var, String str, List list4, x1 x1Var, x1 x1Var2, v9.b bVar7, v9.b bVar8, List list5, v9.b bVar9, v9.b bVar10, x1 x1Var3, v9.b bVar11, f fVar, x1 x1Var4, List list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list7, v9.b bVar12, o8 o8Var, List list8, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? L : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? M : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? N : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? O : bVar5, (i10 & 512) != 0 ? null : list3, (i10 & 1024) != 0 ? null : n2Var, (i10 & 2048) != 0 ? P : bVar6, (i10 & 4096) != 0 ? Q : l6Var, (i10 & 8192) != 0 ? null : str, list4, (32768 & i10) != 0 ? R : x1Var, (65536 & i10) != 0 ? S : x1Var2, (131072 & i10) != 0 ? T : bVar7, (262144 & i10) != 0 ? null : bVar8, (524288 & i10) != 0 ? null : list5, (1048576 & i10) != 0 ? U : bVar9, (2097152 & i10) != 0 ? V : bVar10, (4194304 & i10) != 0 ? W : x1Var3, (8388608 & i10) != 0 ? X : bVar11, (16777216 & i10) != 0 ? Y : fVar, (33554432 & i10) != 0 ? Z : x1Var4, (67108864 & i10) != 0 ? null : list6, (134217728 & i10) != 0 ? f39975a0 : z7Var, (268435456 & i10) != 0 ? null : r0Var, (536870912 & i10) != 0 ? null : a0Var, (1073741824 & i10) != 0 ? null : a0Var2, (i10 & Integer.MIN_VALUE) != 0 ? null : list7, (i11 & 1) != 0 ? f39976b0 : bVar12, (i11 & 2) != 0 ? null : o8Var, (i11 & 4) != 0 ? null : list8, (i11 & 8) != 0 ? f39977c0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.B;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f39998e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.I;
    }

    @Override // y9.g0
    public o d() {
        return this.f39994a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f40000g;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f40009p;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f40012s;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f39999f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f40006m;
    }

    @Override // y9.g0
    public String getId() {
        return this.f40007n;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.G;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.J;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f40010q;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.F;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f40013t;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f39995b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f40003j;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.A;
    }

    @Override // y9.g0
    public o8 n() {
        return this.H;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f39996c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.D;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f39997d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f40004k;
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
