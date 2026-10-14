package y9;

import android.net.Uri;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w2 implements u9.a, g0 {
    public static final g N = new g(null);
    public static final o O;
    public static final v P;
    public static final v9.b<Double> Q;
    public static final k0 R;
    public static final v9.b<t> S;
    public static final v9.b<u> T;
    public static final l6.e U;
    public static final x1 V;
    public static final x1 W;
    public static final v9.b<Integer> X;
    public static final v9.b<Boolean> Y;
    public static final v9.b<h3> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final z7 f43669a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final v9.b<n8> f43670b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final l6.d f43671c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<t> f43672d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<u> f43673e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<t> f43674f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<u> f43675g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.k<h3> f43676h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.k<n8> f43677i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<q> f43678j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Double> f43679k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<e0> f43680l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<Long> f43681m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<q1> f43682n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<q> f43683o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<z1> f43684p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<String> f43685q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<q> f43686r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.m<String> f43687s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<Long> f43688t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<q> f43689u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<x7> f43690v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.g<c8> f43691w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.g<o8> f43692x0;
    public final v9.b<Long> A;
    public final v9.b<h3> B;
    public final List<q> C;
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
    public final o f43693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f43694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f43695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f43696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f43697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f43698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f43699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f43700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<e0> f43701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f43702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<Long> f43703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<t> f43704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v9.b<u> f43705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<q1> f43706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<q> f43707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<z1> f43708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n2 f43709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9.b<Uri> f43710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l6 f43711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f43712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<q> f43713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x1 f43714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f43715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v9.b<Integer> f43716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b<Boolean> f43717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v9.b<String> f43718z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43719c = new a();

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
        public static final b f43720c = new b();

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
        public static final c f43721c = new c();

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
        public static final d f43722c = new d();

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
        public static final e f43723c = new e();

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
        public static final f f43724c = new f();

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

        public final w2 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = w2.O;
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
                vVar = w2.P;
            }
            v vVar2 = vVar;
            fd.j0.h(vVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List listW = h9.c.w(jSONObject, "actions", pVar, w2.f43678j0, eVarA, cVar);
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, w2.f43672d0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, w2.f43673e0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = w2.f43679k0;
            v9.b<Double> bVar = w2.Q;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(c0.f39344b);
            c0 c0Var = (c0) h9.c.n(jSONObject, "aspect", c0.f39346d, eVarA, cVar);
            Objects.requireNonNull(e0.f39726a);
            List listW2 = h9.c.w(jSONObject, "background", e0.f39727b, w2.f43680l0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = w2.R;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = w2.f43681m0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            uc.l lVar3 = t.FROM_STRING;
            v9.b<t> bVar2 = w2.S;
            v9.b<t> bVarT = h9.c.t(jSONObject, "content_alignment_horizontal", lVar3, eVarA, cVar, bVar2, w2.f43674f0);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            uc.l lVar4 = u.FROM_STRING;
            v9.b<u> bVar3 = w2.T;
            v9.b<u> bVarT2 = h9.c.t(jSONObject, "content_alignment_vertical", lVar4, eVarA, cVar, bVar3, w2.f43675g0);
            if (bVarT2 != null) {
                bVar3 = bVarT2;
            }
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, w2.f43682n0, eVarA, cVar);
            List listW4 = h9.c.w(jSONObject, "doubletap_actions", pVar, w2.f43683o0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, w2.f43684p0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            v9.b bVarH = h9.c.h(jSONObject, "gif_url", h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = w2.U;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, w2.f43685q0, eVarA);
            List listW6 = h9.c.w(jSONObject, "longtap_actions", pVar, w2.f43686r0, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = w2.V;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = w2.W;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            uc.l<Object, Integer> lVar5 = h9.h.f30978a;
            v9.b<Integer> bVar4 = w2.X;
            v9.b<Integer> bVarT3 = h9.c.t(jSONObject, "placeholder_color", lVar5, eVarA, cVar, bVar4, h9.l.f31002f);
            if (bVarT3 != null) {
                bVar4 = bVarT3;
            }
            uc.l<Object, Boolean> lVar6 = h9.h.f30980c;
            v9.b<Boolean> bVar5 = w2.Y;
            v9.b<Boolean> bVarT4 = h9.c.t(jSONObject, "preload_required", lVar6, eVarA, cVar, bVar5, h9.l.f30997a);
            if (bVarT4 != null) {
                bVar5 = bVarT4;
            }
            v9.b bVarO = h9.c.o(jSONObject, "preview", w2.f43687s0, eVarA, cVar, h9.l.f30999c);
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, w2.f43688t0, eVarA, cVar, kVar);
            Objects.requireNonNull(h3.Converter);
            uc.l lVar7 = h3.FROM_STRING;
            v9.b<h3> bVar6 = w2.Z;
            v9.b<h3> bVarT5 = h9.c.t(jSONObject, "scale", lVar7, eVarA, cVar, bVar6, w2.f43676h0);
            v9.b<h3> bVar7 = bVarT5 == null ? bVar6 : bVarT5;
            Objects.requireNonNull(cVar2);
            List listW7 = h9.c.w(jSONObject, "selected_actions", pVar, w2.f43689u0, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW8 = h9.c.w(jSONObject, "tooltips", x7.f44173m, w2.f43690v0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = w2.f43669a0;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, w2.f43691w0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar8 = n8.FROM_STRING;
            v9.b<n8> bVar8 = w2.f43670b0;
            v9.b<n8> bVarT6 = h9.c.t(jSONObject, "visibility", lVar8, eVarA, cVar, bVar8, w2.f43677i0);
            v9.b<n8> bVar9 = bVarT6 == null ? bVar8 : bVarT6;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW9 = h9.c.w(jSONObject, "visibility_actions", pVar5, w2.f43692x0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = w2.f43671c0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new w2(oVar2, qVar, vVar2, listW, bVarS, bVarS2, bVar, c0Var, listW2, k0Var2, bVarQ, bVar2, bVar3, listW3, listW4, listW5, n2Var, bVarH, l6Var2, str, listW6, x1Var2, x1Var4, bVar4, bVar5, bVarO, bVarQ2, bVar7, listW7, listW8, z7Var2, r0Var, a0Var, a0Var2, listV, bVar9, o8Var, listW9, l6Var3);
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
        R = new k0(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        S = aVar.a(t.CENTER);
        T = aVar.a(u.CENTER);
        U = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        V = new x1(null, null, null, bVar, null == true ? 1 : 0, 31, null == true ? 1 : 0);
        W = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null);
        X = aVar.a(335544320);
        Y = aVar.a(Boolean.FALSE);
        Z = aVar.a(h3.FILL);
        f43669a0 = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        f43670b0 = aVar.a(n8.VISIBLE);
        f43671c0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f43719c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f43672d0 = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar2 = b.f43720c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar2, "validator");
        f43673e0 = new h9.k.a.C0302a(objQ2, bVar2);
        Object objQ3 = kc.j.q(t.values());
        c cVar = c.f43721c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f43674f0 = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(u.values());
        d dVar = d.f43722c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        f43675g0 = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(h3.values());
        e eVar = e.f43723c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f43676h0 = new h9.k.a.C0302a(objQ5, eVar);
        Object objQ6 = kc.j.q(n8.values());
        f fVar = f.f43724c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(fVar, "validator");
        f43677i0 = new h9.k.a.C0302a(objQ6, fVar);
        f43678j0 = r2.B;
        f43679k0 = v2.f43428e;
        f43680l0 = s2.f42494w;
        f43681m0 = s2.f42495x;
        f43682n0 = v2.f43429f;
        f43683o0 = s2.f42496y;
        f43684p0 = v2.f43430g;
        f43685q0 = s2.f42491t;
        f43686r0 = r2.C;
        f43687s0 = r2.D;
        f43688t0 = r2.E;
        f43689u0 = s2.f42492u;
        f43690v0 = r2.F;
        f43691w0 = s2.f42493v;
        f43692x0 = v2.f43427d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w2(o oVar, q qVar, v vVar, List<? extends q> list, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, c0 c0Var, List<? extends e0> list2, k0 k0Var, v9.b<Long> bVar4, v9.b<t> bVar5, v9.b<u> bVar6, List<? extends q1> list3, List<? extends q> list4, List<? extends z1> list5, n2 n2Var, v9.b<Uri> bVar7, l6 l6Var, String str, List<? extends q> list6, x1 x1Var, x1 x1Var2, v9.b<Integer> bVar8, v9.b<Boolean> bVar9, v9.b<String> bVar10, v9.b<Long> bVar11, v9.b<h3> bVar12, List<? extends q> list7, List<? extends x7> list8, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list9, v9.b<n8> bVar13, o8 o8Var, List<? extends o8> list10, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(vVar, "actionAnimation");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar5, "contentAlignmentHorizontal");
        fd.j0.i(bVar6, "contentAlignmentVertical");
        fd.j0.i(bVar7, "gifUrl");
        fd.j0.i(l6Var, "height");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar8, "placeholderColor");
        fd.j0.i(bVar9, "preloadRequired");
        fd.j0.i(bVar12, "scale");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar13, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f43693a = oVar;
        this.f43694b = qVar;
        this.f43695c = vVar;
        this.f43696d = list;
        this.f43697e = bVar;
        this.f43698f = bVar2;
        this.f43699g = bVar3;
        this.f43700h = c0Var;
        this.f43701i = list2;
        this.f43702j = k0Var;
        this.f43703k = bVar4;
        this.f43704l = bVar5;
        this.f43705m = bVar6;
        this.f43706n = list3;
        this.f43707o = list4;
        this.f43708p = list5;
        this.f43709q = n2Var;
        this.f43710r = bVar7;
        this.f43711s = l6Var;
        this.f43712t = str;
        this.f43713u = list6;
        this.f43714v = x1Var;
        this.f43715w = x1Var2;
        this.f43716x = bVar8;
        this.f43717y = bVar9;
        this.f43718z = bVar10;
        this.A = bVar11;
        this.B = bVar12;
        this.C = list7;
        this.D = list8;
        this.E = z7Var;
        this.F = r0Var;
        this.G = a0Var;
        this.H = a0Var2;
        this.I = list9;
        this.J = bVar13;
        this.K = o8Var;
        this.L = list10;
        this.M = l6Var2;
    }

    public /* synthetic */ w2(o oVar, q qVar, v vVar, List list, v9.b bVar, v9.b bVar2, v9.b bVar3, c0 c0Var, List list2, k0 k0Var, v9.b bVar4, v9.b bVar5, v9.b bVar6, List list3, List list4, List list5, n2 n2Var, v9.b bVar7, l6 l6Var, String str, List list6, x1 x1Var, x1 x1Var2, v9.b bVar8, v9.b bVar9, v9.b bVar10, v9.b bVar11, v9.b bVar12, List list7, List list8, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list9, v9.b bVar13, o8 o8Var, List list10, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? O : oVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? P : vVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? Q : bVar3, (i10 & 128) != 0 ? null : c0Var, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? R : k0Var, (i10 & 1024) != 0 ? null : bVar4, (i10 & 2048) != 0 ? S : bVar5, (i10 & 4096) != 0 ? T : bVar6, (i10 & 8192) != 0 ? null : list3, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i10) != 0 ? null : list5, (65536 & i10) != 0 ? null : n2Var, bVar7, (262144 & i10) != 0 ? U : l6Var, (524288 & i10) != 0 ? null : str, (1048576 & i10) != 0 ? null : list6, (2097152 & i10) != 0 ? V : x1Var, (4194304 & i10) != 0 ? W : x1Var2, (8388608 & i10) != 0 ? X : bVar8, (16777216 & i10) != 0 ? Y : bVar9, (33554432 & i10) != 0 ? null : bVar10, (67108864 & i10) != 0 ? null : bVar11, (134217728 & i10) != 0 ? Z : bVar12, (268435456 & i10) != 0 ? null : list7, (536870912 & i10) != 0 ? null : list8, (1073741824 & i10) != 0 ? f43669a0 : z7Var, (i10 & Integer.MIN_VALUE) != 0 ? null : r0Var, (i11 & 1) != 0 ? null : a0Var, (i11 & 2) != 0 ? null : a0Var2, (i11 & 4) != 0 ? null : list9, (i11 & 8) != 0 ? f43670b0 : bVar13, (i11 & 16) != 0 ? null : o8Var, (i11 & 32) != 0 ? null : list10, (i11 & 64) != 0 ? f43671c0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.E;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f43701i;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.L;
    }

    @Override // y9.g0
    public o d() {
        return this.f43693a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f43703k;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f43714v;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.A;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f43702j;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f43711s;
    }

    @Override // y9.g0
    public String getId() {
        return this.f43712t;
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
        return this.f43715w;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.I;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.C;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f43697e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f43708p;
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
        return this.f43698f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.G;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f43699g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f43709q;
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
