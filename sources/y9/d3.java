package y9;

import android.net.Uri;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d3 implements u9.a, g0 {
    public static final h9.g<q> A0;
    public static final h9.m<String> B0;
    public static final h9.m<Long> C0;
    public static final h9.g<q> D0;
    public static final h9.g<x7> E0;
    public static final h9.g<c8> F0;
    public static final h9.g<o8> G0;
    public static final h S = new h(null);
    public static final o T;
    public static final v U;
    public static final v9.b<Double> V;
    public static final k0 W;
    public static final v9.b<t> X;
    public static final v9.b<u> Y;
    public static final l6.e Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<Boolean> f39564a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final x1 f39565b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final x1 f39566c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final v9.b<Integer> f39567d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final v9.b<Boolean> f39568e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final v9.b<h3> f39569f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final v9.b<h0> f39570g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final z7 f39571h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final v9.b<n8> f39572i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final l6.d f39573j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.k<t> f39574k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.k<u> f39575l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.k<t> f39576m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.k<u> f39577n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.k<h3> f39578o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.k<h0> f39579p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.k<n8> f39580q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<q> f39581r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<Double> f39582s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<e0> f39583t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.m<Long> f39584u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<q1> f39585v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<q> f39586w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.g<z1> f39587x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.g<d2> f39588y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.m<String> f39589z0;
    public final v9.b<Integer> A;
    public final v9.b<Boolean> B;
    public final v9.b<String> C;
    public final v9.b<Long> D;
    public final v9.b<h3> E;
    public final List<q> F;
    public final v9.b<Integer> G;
    public final v9.b<h0> H;
    public final List<x7> I;
    public final z7 J;
    public final r0 K;
    public final a0 L;
    public final a0 M;
    public final List<c8> N;
    public final v9.b<n8> O;
    public final o8 P;
    public final List<o8> Q;
    public final l6 R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f39591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f39592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f39593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f39594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f39595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f39596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f39597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f39598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<e0> f39599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f39600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<Long> f39601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v9.b<t> f39602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v9.b<u> f39603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<q1> f39604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<q> f39605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<z1> f39606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<d2> f39607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n2 f39608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l6 f39609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v9.b<Boolean> f39610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f39611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v9.b<Uri> f39612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<q> f39613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x1 f39614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x1 f39615z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39616c = new a();

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
        public static final b f39617c = new b();

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
        public static final c f39618c = new c();

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
        public static final d f39619c = new d();

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
        public static final e f39620c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h3);
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f39621c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h0);
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f39622c = new g();

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

        public final d3 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = d3.T;
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
                vVar = d3.U;
            }
            v vVar2 = vVar;
            fd.j0.h(vVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List listW = h9.c.w(jSONObject, "actions", pVar, d3.f39581r0, eVarA, cVar);
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, d3.f39574k0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, d3.f39575l0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = d3.f39582s0;
            v9.b<Double> bVar = d3.V;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(b2.f39129e);
            b2 b2Var = (b2) h9.c.n(jSONObject, "appearance_animation", b2.f39138n, eVarA, cVar);
            Objects.requireNonNull(c0.f39344b);
            c0 c0Var = (c0) h9.c.n(jSONObject, "aspect", c0.f39346d, eVarA, cVar);
            Objects.requireNonNull(e0.f39726a);
            List listW2 = h9.c.w(jSONObject, "background", e0.f39727b, d3.f39583t0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = d3.W;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = d3.f39584u0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            uc.l lVar3 = t.FROM_STRING;
            v9.b<t> bVar2 = d3.X;
            v9.b<t> bVarT = h9.c.t(jSONObject, "content_alignment_horizontal", lVar3, eVarA, cVar, bVar2, d3.f39576m0);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            uc.l lVar4 = u.FROM_STRING;
            v9.b<u> bVar3 = d3.Y;
            v9.b<u> bVarT2 = h9.c.t(jSONObject, "content_alignment_vertical", lVar4, eVarA, cVar, bVar3, d3.f39577n0);
            if (bVarT2 != null) {
                bVar3 = bVarT2;
            }
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, d3.f39585v0, eVarA, cVar);
            List listW4 = h9.c.w(jSONObject, "doubletap_actions", pVar, d3.f39586w0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, d3.f39587x0, eVarA, cVar);
            Objects.requireNonNull(d2.f39560a);
            List listW6 = h9.c.w(jSONObject, "filters", d2.f39561b, d3.f39588y0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = d3.Z;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            uc.l<Object, Boolean> lVar5 = h9.h.f30980c;
            v9.b<Boolean> bVar4 = d3.f39564a0;
            h9.k<Boolean> kVar2 = h9.l.f30997a;
            v9.b<Boolean> bVarT3 = h9.c.t(jSONObject, "high_priority_preview_show", lVar5, eVarA, cVar, bVar4, kVar2);
            if (bVarT3 != null) {
                bVar4 = bVarT3;
            }
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, d3.f39589z0, eVarA);
            v9.b bVarH = h9.c.h(jSONObject, "image_url", h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
            List listW7 = h9.c.w(jSONObject, "longtap_actions", pVar, d3.A0, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = d3.f39565b0;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = d3.f39566c0;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            uc.l<Object, Integer> lVar6 = h9.h.f30978a;
            v9.b<Integer> bVar5 = d3.f39567d0;
            h9.k<Integer> kVar3 = h9.l.f31002f;
            v9.b<Integer> bVarT4 = h9.c.t(jSONObject, "placeholder_color", lVar6, eVarA, cVar, bVar5, kVar3);
            if (bVarT4 != null) {
                bVar5 = bVarT4;
            }
            v9.b<Boolean> bVar6 = d3.f39568e0;
            v9.b<Boolean> bVarT5 = h9.c.t(jSONObject, "preload_required", lVar5, eVarA, cVar, bVar6, kVar2);
            if (bVarT5 != null) {
                bVar6 = bVarT5;
            }
            v9.b bVarO = h9.c.o(jSONObject, "preview", d3.B0, eVarA, cVar, h9.l.f30999c);
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, d3.C0, eVarA, cVar, kVar);
            Objects.requireNonNull(h3.Converter);
            uc.l lVar7 = h3.FROM_STRING;
            v9.b<h3> bVar7 = d3.f39569f0;
            v9.b<h3> bVarT6 = h9.c.t(jSONObject, "scale", lVar7, eVarA, cVar, bVar7, d3.f39578o0);
            v9.b<h3> bVar8 = bVarT6 == null ? bVar7 : bVarT6;
            Objects.requireNonNull(cVar2);
            List listW8 = h9.c.w(jSONObject, "selected_actions", pVar, d3.D0, eVarA, cVar);
            v9.b bVarS3 = h9.c.s(jSONObject, "tint_color", lVar6, eVarA, cVar, kVar3);
            Objects.requireNonNull(h0.Converter);
            uc.l lVar8 = h0.FROM_STRING;
            v9.b<h0> bVar9 = d3.f39570g0;
            v9.b<h0> bVarT7 = h9.c.t(jSONObject, "tint_mode", lVar8, eVarA, cVar, bVar9, d3.f39579p0);
            v9.b<h0> bVar10 = bVarT7 == null ? bVar9 : bVarT7;
            Objects.requireNonNull(x7.f44168h);
            List listW9 = h9.c.w(jSONObject, "tooltips", x7.f44173m, d3.E0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = d3.f39571h0;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, d3.F0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar9 = n8.FROM_STRING;
            v9.b<n8> bVar11 = d3.f39572i0;
            v9.b<n8> bVarT8 = h9.c.t(jSONObject, "visibility", lVar9, eVarA, cVar, bVar11, d3.f39580q0);
            v9.b<n8> bVar12 = bVarT8 == null ? bVar11 : bVarT8;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW10 = h9.c.w(jSONObject, "visibility_actions", pVar5, d3.G0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = d3.f39573j0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new d3(oVar2, qVar, vVar2, listW, bVarS, bVarS2, bVar, b2Var, c0Var, listW2, k0Var2, bVarQ, bVar2, bVar3, listW3, listW4, listW5, listW6, n2Var, l6Var2, bVar4, str, bVarH, listW7, x1Var2, x1Var4, bVar5, bVar6, bVarO, bVarQ2, bVar8, listW8, bVarS3, bVar10, listW9, z7Var2, r0Var, a0Var, a0Var2, listV, bVar12, o8Var, listW10, l6Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        T = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        U = new v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        V = aVar.a(dValueOf);
        v9.b bVar2 = null;
        W = new k0(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        X = aVar.a(t.CENTER);
        Y = aVar.a(u.CENTER);
        Z = new l6.e(new q8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        Boolean bool = Boolean.FALSE;
        f39564a0 = aVar.a(bool);
        f39565b0 = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, null, 31, null);
        f39566c0 = new x1(null, bVar, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null);
        f39567d0 = aVar.a(335544320);
        f39568e0 = aVar.a(bool);
        f39569f0 = aVar.a(h3.FILL);
        f39570g0 = aVar.a(h0.SOURCE_IN);
        f39571h0 = new z7(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        f39572i0 = aVar.a(n8.VISIBLE);
        f39573j0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f39616c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f39574k0 = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar3 = b.f39617c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar3, "validator");
        f39575l0 = new h9.k.a.C0302a(objQ2, bVar3);
        Object objQ3 = kc.j.q(t.values());
        c cVar = c.f39618c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f39576m0 = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(u.values());
        d dVar = d.f39619c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        f39577n0 = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(h3.values());
        e eVar = e.f39620c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f39578o0 = new h9.k.a.C0302a(objQ5, eVar);
        Object objQ6 = kc.j.q(h0.values());
        f fVar = f.f39621c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(fVar, "validator");
        f39579p0 = new h9.k.a.C0302a(objQ6, fVar);
        Object objQ7 = kc.j.q(n8.values());
        g gVar2 = g.f39622c;
        fd.j0.i(objQ7, "default");
        fd.j0.i(gVar2, "validator");
        f39580q0 = new h9.k.a.C0302a(objQ7, gVar2);
        f39581r0 = b3.f39153l;
        f39582s0 = z2.f44609y;
        f39583t0 = b3.f39158q;
        f39584u0 = b3.f39159r;
        f39585v0 = z2.f44610z;
        f39586w0 = b3.f39160s;
        f39587x0 = z2.A;
        f39588y0 = b3.f39161t;
        f39589z0 = b3.f39154m;
        A0 = z2.f44605u;
        B0 = z2.f44606v;
        C0 = z2.f44607w;
        D0 = b3.f39155n;
        E0 = z2.f44608x;
        F0 = b3.f39156o;
        G0 = b3.f39157p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d3(o oVar, q qVar, v vVar, List<? extends q> list, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, b2 b2Var, c0 c0Var, List<? extends e0> list2, k0 k0Var, v9.b<Long> bVar4, v9.b<t> bVar5, v9.b<u> bVar6, List<? extends q1> list3, List<? extends q> list4, List<? extends z1> list5, List<? extends d2> list6, n2 n2Var, l6 l6Var, v9.b<Boolean> bVar7, String str, v9.b<Uri> bVar8, List<? extends q> list7, x1 x1Var, x1 x1Var2, v9.b<Integer> bVar9, v9.b<Boolean> bVar10, v9.b<String> bVar11, v9.b<Long> bVar12, v9.b<h3> bVar13, List<? extends q> list8, v9.b<Integer> bVar14, v9.b<h0> bVar15, List<? extends x7> list9, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list10, v9.b<n8> bVar16, o8 o8Var, List<? extends o8> list11, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(vVar, "actionAnimation");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar5, "contentAlignmentHorizontal");
        fd.j0.i(bVar6, "contentAlignmentVertical");
        fd.j0.i(l6Var, "height");
        fd.j0.i(bVar7, "highPriorityPreviewShow");
        fd.j0.i(bVar8, "imageUrl");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar9, "placeholderColor");
        fd.j0.i(bVar10, "preloadRequired");
        fd.j0.i(bVar13, "scale");
        fd.j0.i(bVar15, "tintMode");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar16, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f39590a = oVar;
        this.f39591b = qVar;
        this.f39592c = vVar;
        this.f39593d = list;
        this.f39594e = bVar;
        this.f39595f = bVar2;
        this.f39596g = bVar3;
        this.f39597h = b2Var;
        this.f39598i = c0Var;
        this.f39599j = list2;
        this.f39600k = k0Var;
        this.f39601l = bVar4;
        this.f39602m = bVar5;
        this.f39603n = bVar6;
        this.f39604o = list3;
        this.f39605p = list4;
        this.f39606q = list5;
        this.f39607r = list6;
        this.f39608s = n2Var;
        this.f39609t = l6Var;
        this.f39610u = bVar7;
        this.f39611v = str;
        this.f39612w = bVar8;
        this.f39613x = list7;
        this.f39614y = x1Var;
        this.f39615z = x1Var2;
        this.A = bVar9;
        this.B = bVar10;
        this.C = bVar11;
        this.D = bVar12;
        this.E = bVar13;
        this.F = list8;
        this.G = bVar14;
        this.H = bVar15;
        this.I = list9;
        this.J = z7Var;
        this.K = r0Var;
        this.L = a0Var;
        this.M = a0Var2;
        this.N = list10;
        this.O = bVar16;
        this.P = o8Var;
        this.Q = list11;
        this.R = l6Var2;
    }

    public /* synthetic */ d3(o oVar, q qVar, v vVar, List list, v9.b bVar, v9.b bVar2, v9.b bVar3, b2 b2Var, c0 c0Var, List list2, k0 k0Var, v9.b bVar4, v9.b bVar5, v9.b bVar6, List list3, List list4, List list5, List list6, n2 n2Var, l6 l6Var, v9.b bVar7, String str, v9.b bVar8, List list7, x1 x1Var, x1 x1Var2, v9.b bVar9, v9.b bVar10, v9.b bVar11, v9.b bVar12, v9.b bVar13, List list8, v9.b bVar14, v9.b bVar15, List list9, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list10, v9.b bVar16, o8 o8Var, List list11, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? T : oVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? U : vVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? V : bVar3, (i10 & 128) != 0 ? null : b2Var, (i10 & 256) != 0 ? null : c0Var, (i10 & 512) != 0 ? null : list2, (i10 & 1024) != 0 ? W : k0Var, (i10 & 2048) != 0 ? null : bVar4, (i10 & 4096) != 0 ? X : bVar5, (i10 & 8192) != 0 ? Y : bVar6, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list3, (32768 & i10) != 0 ? null : list4, (65536 & i10) != 0 ? null : list5, (131072 & i10) != 0 ? null : list6, (262144 & i10) != 0 ? null : n2Var, (524288 & i10) != 0 ? Z : l6Var, (1048576 & i10) != 0 ? f39564a0 : bVar7, (2097152 & i10) != 0 ? null : str, bVar8, (8388608 & i10) != 0 ? null : list7, (16777216 & i10) != 0 ? f39565b0 : x1Var, (33554432 & i10) != 0 ? f39566c0 : x1Var2, (67108864 & i10) != 0 ? f39567d0 : bVar9, (134217728 & i10) != 0 ? f39568e0 : bVar10, (268435456 & i10) != 0 ? null : bVar11, (536870912 & i10) != 0 ? null : bVar12, (1073741824 & i10) != 0 ? f39569f0 : bVar13, (i10 & Integer.MIN_VALUE) != 0 ? null : list8, (i11 & 1) != 0 ? null : bVar14, (i11 & 2) != 0 ? f39570g0 : bVar15, (i11 & 4) != 0 ? null : list9, (i11 & 8) != 0 ? f39571h0 : z7Var, (i11 & 16) != 0 ? null : r0Var, (i11 & 32) != 0 ? null : a0Var, (i11 & 64) != 0 ? null : a0Var2, (i11 & 128) != 0 ? null : list10, (i11 & 256) != 0 ? f39572i0 : bVar16, (i11 & 512) != 0 ? null : o8Var, (i11 & 1024) != 0 ? null : list11, (i11 & 2048) != 0 ? f39573j0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.J;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f39599j;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.Q;
    }

    @Override // y9.g0
    public o d() {
        return this.f39590a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f39601l;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f39614y;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.D;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f39600k;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f39609t;
    }

    @Override // y9.g0
    public String getId() {
        return this.f39611v;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.O;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.R;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f39615z;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.N;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.F;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f39594e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f39606q;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.I;
    }

    @Override // y9.g0
    public o8 n() {
        return this.P;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f39595f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.L;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f39596g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f39608s;
    }

    @Override // y9.g0
    public a0 s() {
        return this.M;
    }

    @Override // y9.g0
    public r0 t() {
        return this.K;
    }
}
