package y9;

import android.net.Uri;
import ch.qos.logback.core.util.FileUtil;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l7 implements u9.a, g0 {
    public static final h9.k<q2> A0;
    public static final h9.k<f4> B0;
    public static final h9.k<t> C0;
    public static final h9.k<u> D0;
    public static final h9.k<f4> E0;
    public static final h9.k<n8> F0;
    public static final h9.g<q> G0;
    public static final h9.m<Double> H0;
    public static final h9.g<e0> I0;
    public static final h9.m<Long> J0;
    public static final h9.g<q1> K0;
    public static final h9.g<q> L0;
    public static final h9.g<z1> M0;
    public static final h9.m<Long> N0;
    public static final h9.m<String> O0;
    public static final h9.g<m> P0;
    public static final h9.m<Long> Q0;
    public static final h9.g<q> R0;
    public static final h9.m<Long> S0;
    public static final h9.m<Long> T0;
    public static final h9.g<n> U0;
    public static final h9.m<Long> V0;
    public static final h9.g<q> W0;
    public static final h9.m<String> X0;
    public static final h9.g<x7> Y0;
    public static final h9.g<c8> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final k f41242a0 = new k(null);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final h9.g<o8> f41243a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final o f41244b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final v f41245c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final v9.b<Double> f41246d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final k0 f41247e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final v9.b<p2> f41248f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final v9.b<Long> f41249g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final v9.b<n6> f41250h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final v9.b<q2> f41251i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final l6.e f41252j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final v9.b<Double> f41253k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final x1 f41254l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final x1 f41255m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final v9.b<Boolean> f41256n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final v9.b<f4> f41257o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v9.b<t> f41258p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final v9.b<u> f41259q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final v9.b<Integer> f41260r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final z7 f41261s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final v9.b<f4> f41262t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final v9.b<n8> f41263u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final l6.d f41264v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.k<t> f41265w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.k<u> f41266x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.k<p2> f41267y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.k<n6> f41268z0;
    public final List<q> A;
    public final x1 B;
    public final v9.b<Long> C;
    public final v9.b<Long> D;
    public final x1 E;
    public final List<n> F;
    public final v9.b<Long> G;
    public final v9.b<Boolean> H;
    public final List<q> I;
    public final v9.b<f4> J;
    public final v9.b<String> K;
    public final v9.b<t> L;
    public final v9.b<u> M;
    public final v9.b<Integer> N;
    public final m7 O;
    public final List<x7> P;
    public final z7 Q;
    public final r0 R;
    public final a0 S;
    public final a0 T;
    public final List<c8> U;
    public final v9.b<f4> V;
    public final v9.b<n8> W;
    public final o8 X;
    public final List<o8> Y;
    public final l6 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f41269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f41270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f41271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f41272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f41273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f41274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f41275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.b<Boolean> f41276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<e0> f41277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f41278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<Long> f41279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<q1> f41280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<q> f41281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f41282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<z1> f41283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n2 f41284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<Integer> f41285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9.b<p2> f41286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v9.b<Long> f41287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v9.b<n6> f41288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v9.b<q2> f41289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l6 f41290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f41291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<m> f41292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b<Double> f41293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v9.b<Long> f41294z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41295c = new a();

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
        public static final b f41296c = new b();

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
        public static final c f41297c = new c();

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
        public static final d f41298c = new d();

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
        public static final e f41299c = new e();

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
        public static final f f41300c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof f4);
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f41301c = new g();

        public g() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t);
        }
    }

    public static final class h extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f41302c = new h();

        public h() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof u);
        }
    }

    public static final class i extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f41303c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof f4);
        }
    }

    public static final class j extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f41304c = new j();

        public j() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class k {
        public k() {
        }

        public k(vc.g gVar) {
        }

        public final l7 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = l7.f41244b0;
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
                vVar = l7.f41245c0;
            }
            v vVar2 = vVar;
            fd.j0.h(vVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List listW = h9.c.w(jSONObject, "actions", pVar, l7.G0, eVarA, cVar);
            t.b bVar = t.Converter;
            Objects.requireNonNull(bVar);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, l7.f41265w0);
            u.b bVar2 = u.Converter;
            Objects.requireNonNull(bVar2);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, l7.f41266x0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = l7.H0;
            v9.b<Double> bVar3 = l7.f41246d0;
            h9.k<Double> kVar = h9.l.f31000d;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar3, kVar);
            if (bVarR != null) {
                bVar3 = bVarR;
            }
            uc.l<Object, Boolean> lVar2 = h9.h.f30980c;
            h9.k<Boolean> kVar2 = h9.l.f30997a;
            v9.b bVarS3 = h9.c.s(jSONObject, "auto_ellipsize", lVar2, eVarA, cVar, kVar2);
            Objects.requireNonNull(e0.f39726a);
            List listW2 = h9.c.w(jSONObject, "background", e0.f39727b, l7.I0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = l7.f41247e0;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar3 = h9.h.f30982e;
            h9.m<Long> mVar2 = l7.J0;
            h9.k<Long> kVar3 = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar3, mVar2, eVarA, cVar, kVar3);
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, l7.K0, eVarA, cVar);
            List listW4 = h9.c.w(jSONObject, "doubletap_actions", pVar, l7.L0, eVarA, cVar);
            Objects.requireNonNull(l.f41305e);
            l lVar4 = (l) h9.c.n(jSONObject, "ellipsis", l.f41310j, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, l7.M0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            uc.l<Object, Integer> lVar5 = h9.h.f30978a;
            h9.k<Integer> kVar4 = h9.l.f31002f;
            v9.b bVarS4 = h9.c.s(jSONObject, "focused_text_color", lVar5, eVarA, cVar, kVar4);
            Objects.requireNonNull(p2.Converter);
            uc.l lVar6 = p2.FROM_STRING;
            v9.b<p2> bVar4 = l7.f41248f0;
            v9.b<p2> bVarT = h9.c.t(jSONObject, "font_family", lVar6, eVarA, cVar, bVar4, l7.f41267y0);
            if (bVarT != null) {
                bVar4 = bVarT;
            }
            h9.m<Long> mVar3 = l7.N0;
            v9.b<Long> bVar5 = l7.f41249g0;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "font_size", lVar3, mVar3, eVarA, bVar5, kVar3);
            if (bVarR2 != null) {
                bVar5 = bVarR2;
            }
            Objects.requireNonNull(n6.Converter);
            uc.l lVar7 = n6.FROM_STRING;
            v9.b<n6> bVar6 = l7.f41250h0;
            v9.b<n6> bVarT2 = h9.c.t(jSONObject, "font_size_unit", lVar7, eVarA, cVar, bVar6, l7.f41268z0);
            if (bVarT2 != null) {
                bVar6 = bVarT2;
            }
            Objects.requireNonNull(q2.Converter);
            uc.l lVar8 = q2.FROM_STRING;
            v9.b<q2> bVar7 = l7.f41251i0;
            v9.b<q2> bVarT3 = h9.c.t(jSONObject, "font_weight", lVar8, eVarA, cVar, bVar7, l7.A0);
            if (bVarT3 != null) {
                bVar7 = bVarT3;
            }
            l6.b bVar8 = l6.f41236a;
            Objects.requireNonNull(bVar8);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = l7.f41252j0;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, l7.O0, eVarA);
            Objects.requireNonNull(m.f41316g);
            List listW6 = h9.c.w(jSONObject, "images", m.f41322m, l7.P0, eVarA, cVar);
            v9.b<Double> bVar9 = l7.f41253k0;
            v9.b<Double> bVarT4 = h9.c.t(jSONObject, "letter_spacing", lVar, eVarA, cVar, bVar9, kVar);
            if (bVarT4 != null) {
                bVar9 = bVarT4;
            }
            v9.b bVarQ2 = h9.c.q(jSONObject, "line_height", lVar3, l7.Q0, eVarA, cVar, kVar3);
            Objects.requireNonNull(cVar2);
            List listW7 = h9.c.w(jSONObject, "longtap_actions", pVar, l7.R0, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = l7.f41254l0;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            v9.b bVarQ3 = h9.c.q(jSONObject, "max_lines", lVar3, l7.S0, eVarA, cVar, kVar3);
            v9.b bVarQ4 = h9.c.q(jSONObject, "min_hidden_lines", lVar3, l7.T0, eVarA, cVar, kVar3);
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = l7.f41255m0;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Objects.requireNonNull(n.f41331o);
            List listW8 = h9.c.w(jSONObject, "ranges", n.B, l7.U0, eVarA, cVar);
            v9.b bVarQ5 = h9.c.q(jSONObject, "row_span", lVar3, l7.V0, eVarA, cVar, kVar3);
            v9.b<Boolean> bVar10 = l7.f41256n0;
            v9.b<Boolean> bVarT5 = h9.c.t(jSONObject, "selectable", lVar2, eVarA, cVar, bVar10, kVar2);
            v9.b<Boolean> bVar11 = bVarT5 == null ? bVar10 : bVarT5;
            List listW9 = h9.c.w(jSONObject, "selected_actions", pVar, l7.W0, eVarA, cVar);
            Objects.requireNonNull(f4.Converter);
            uc.l lVar9 = f4.FROM_STRING;
            v9.b<f4> bVar12 = l7.f41257o0;
            v9.b<f4> bVarT6 = h9.c.t(jSONObject, "strike", lVar9, eVarA, cVar, bVar12, l7.B0);
            v9.b<f4> bVar13 = bVarT6 == null ? bVar12 : bVarT6;
            v9.b bVarE = h9.c.e(jSONObject, "text", l7.X0, eVarA, cVar, h9.l.f30999c);
            Objects.requireNonNull(bVar);
            uc.l lVar10 = t.FROM_STRING;
            v9.b<t> bVar14 = l7.f41258p0;
            v9.b<t> bVarT7 = h9.c.t(jSONObject, "text_alignment_horizontal", lVar10, eVarA, cVar, bVar14, l7.C0);
            v9.b<t> bVar15 = bVarT7 == null ? bVar14 : bVarT7;
            Objects.requireNonNull(bVar2);
            uc.l lVar11 = u.FROM_STRING;
            v9.b<u> bVar16 = l7.f41259q0;
            v9.b<u> bVarT8 = h9.c.t(jSONObject, "text_alignment_vertical", lVar11, eVarA, cVar, bVar16, l7.D0);
            v9.b<u> bVar17 = bVarT8 == null ? bVar16 : bVarT8;
            v9.b<Integer> bVar18 = l7.f41260r0;
            v9.b<Integer> bVarT9 = h9.c.t(jSONObject, "text_color", lVar5, eVarA, cVar, bVar18, kVar4);
            v9.b<Integer> bVar19 = bVarT9 == null ? bVar18 : bVarT9;
            Objects.requireNonNull(m7.f41454a);
            m7 m7Var = (m7) h9.c.n(jSONObject, "text_gradient", m7.f41455b, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW10 = h9.c.w(jSONObject, "tooltips", x7.f44173m, l7.Y0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = l7.f41261s0;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, l7.Z0, eVarA, cVar);
            uc.l lVar12 = f4.FROM_STRING;
            v9.b<f4> bVar20 = l7.f41262t0;
            v9.b<f4> bVarT10 = h9.c.t(jSONObject, "underline", lVar12, eVarA, cVar, bVar20, l7.E0);
            v9.b<f4> bVar21 = bVarT10 == null ? bVar20 : bVarT10;
            Objects.requireNonNull(n8.Converter);
            uc.l lVar13 = n8.FROM_STRING;
            v9.b<n8> bVar22 = l7.f41263u0;
            v9.b<n8> bVarT11 = h9.c.t(jSONObject, "visibility", lVar13, eVarA, cVar, bVar22, l7.F0);
            v9.b<n8> bVar23 = bVarT11 == null ? bVar22 : bVarT11;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW11 = h9.c.w(jSONObject, "visibility_actions", pVar5, l7.f41243a1, eVarA, cVar);
            Objects.requireNonNull(bVar8);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = l7.f41264v0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new l7(oVar2, qVar, vVar2, listW, bVarS, bVarS2, bVar3, bVarS3, listW2, k0Var2, bVarQ, listW3, listW4, lVar4, listW5, n2Var, bVarS4, bVar4, bVar5, bVar6, bVar7, l6Var2, str, listW6, bVar9, bVarQ2, listW7, x1Var2, bVarQ3, bVarQ4, x1Var4, listW8, bVarQ5, bVar11, listW9, bVar13, bVarE, bVar15, bVar17, bVar19, m7Var, listW10, z7Var2, r0Var, a0Var, a0Var2, listV, bVar21, bVar23, o8Var, listW11, l6Var3);
        }
    }

    public static class l implements u9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f41305e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.g<q> f41306f = k7.f41115k;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.g<m> f41307g = j7.f40924f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.g<n> f41308h = k7.f41116l;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final h9.m<String> f41309i = k7.f41117m;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, l> f41310j = a.f41315c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<q> f41311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<m> f41312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<n> f41313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v9.b<String> f41314d;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, l> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41315c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public l invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(l.f41305e);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(q.f42091g);
                List listW = h9.c.w(jSONObject2, "actions", q.f42095k, l.f41306f, eVarA, cVar2);
                Objects.requireNonNull(m.f41316g);
                List listW2 = h9.c.w(jSONObject2, "images", m.f41322m, l.f41307g, eVarA, cVar2);
                Objects.requireNonNull(n.f41331o);
                return new l(listW, listW2, h9.c.w(jSONObject2, "ranges", n.B, l.f41308h, eVarA, cVar2), h9.c.e(jSONObject2, "text", l.f41309i, eVarA, cVar2, h9.l.f30999c));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public l(List<? extends q> list, List<? extends m> list2, List<? extends n> list3, v9.b<String> bVar) {
            fd.j0.i(bVar, "text");
            this.f41311a = list;
            this.f41312b = list2;
            this.f41313c = list3;
            this.f41314d = bVar;
        }

        public /* synthetic */ l(List list, List list2, List list3, v9.b bVar, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2, (i10 & 4) != 0 ? null : list3, bVar);
        }
    }

    public static class m implements u9.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f41316g = new c(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final l2 f41317h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v9.b<h0> f41318i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final l2 f41319j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.k<h0> f41320k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h9.m<Long> f41321l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, m> f41322m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l2 f41323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<Long> f41324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<Integer> f41325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v9.b<h0> f41326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v9.b<Uri> f41327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l2 f41328f;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41329c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public m invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(m.f41316g);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(l2.f41210c);
                uc.p<u9.c, JSONObject, l2> pVar = l2.f41214g;
                l2 l2Var = (l2) h9.c.n(jSONObject2, "height", pVar, eVarA, cVar2);
                if (l2Var == null) {
                    l2Var = m.f41317h;
                }
                l2 l2Var2 = l2Var;
                fd.j0.h(l2Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
                v9.b bVarG = h9.c.g(jSONObject2, "start", h9.h.f30982e, m.f41321l, eVarA, h9.l.f30998b);
                v9.b bVarS = h9.c.s(jSONObject2, "tint_color", h9.h.f30978a, eVarA, cVar2, h9.l.f31002f);
                Objects.requireNonNull(h0.Converter);
                uc.l lVar = h0.FROM_STRING;
                v9.b<h0> bVar = m.f41318i;
                v9.b<h0> bVarT = h9.c.t(jSONObject2, "tint_mode", lVar, eVarA, cVar2, bVar, m.f41320k);
                if (bVarT != null) {
                    bVar = bVarT;
                }
                v9.b bVarH = h9.c.h(jSONObject2, ImagesContract.URL, h9.h.f30979b, eVarA, cVar2, h9.l.f31001e);
                l2 l2Var3 = (l2) h9.c.n(jSONObject2, "width", pVar, eVarA, cVar2);
                if (l2Var3 == null) {
                    l2Var3 = m.f41319j;
                }
                l2 l2Var4 = l2Var3;
                fd.j0.h(l2Var4, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
                return new m(l2Var2, bVarG, bVarS, bVar, bVarH, l2Var4);
            }
        }

        public static final class b extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f41330c = new b();

            public b() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof h0);
            }
        }

        public static final class c {
            public c() {
            }

            public c(vc.g gVar) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            v9.b.a aVar = v9.b.f36747a;
            int i10 = 1;
            f41317h = new l2(null, aVar.a(20L), i10, null == true ? 1 : 0);
            f41318i = aVar.a(h0.SOURCE_IN);
            f41319j = new l2(null == true ? 1 : 0, aVar.a(20L), i10, null == true ? 1 : 0);
            int i11 = h9.k.f30992a;
            Object objQ = kc.j.q(h0.values());
            b bVar = b.f41330c;
            fd.j0.i(objQ, "default");
            fd.j0.i(bVar, "validator");
            f41320k = new h9.k.a.C0302a(objQ, bVar);
            f41321l = k7.f41118n;
            f41322m = a.f41329c;
        }

        public m(l2 l2Var, v9.b<Long> bVar, v9.b<Integer> bVar2, v9.b<h0> bVar3, v9.b<Uri> bVar4, l2 l2Var2) {
            fd.j0.i(l2Var, "height");
            fd.j0.i(bVar, "start");
            fd.j0.i(bVar3, "tintMode");
            fd.j0.i(bVar4, ImagesContract.URL);
            fd.j0.i(l2Var2, "width");
            this.f41323a = l2Var;
            this.f41324b = bVar;
            this.f41325c = bVar2;
            this.f41326d = bVar3;
            this.f41327e = bVar4;
            this.f41328f = l2Var2;
        }

        public /* synthetic */ m(l2 l2Var, v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, l2 l2Var2, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? f41317h : l2Var, bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? f41318i : bVar3, bVar4, (i10 & 32) != 0 ? f41319j : l2Var2);
        }
    }

    public static class n implements u9.a {
        public static final h9.m<Long> A;
        public static final uc.p<u9.c, JSONObject, n> B;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final g f41331o = new g(null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final v9.b<n6> f41332p = v9.b.f36747a.a(n6.SP);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final h9.k<p2> f41333q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final h9.k<n6> f41334r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final h9.k<q2> f41335s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final h9.k<f4> f41336t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final h9.k<f4> f41337u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final h9.g<q> f41338v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final h9.m<Long> f41339w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final h9.m<Long> f41340x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final h9.m<Long> f41341y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final h9.m<Long> f41342z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<q> f41343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o7 f41344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q7 f41345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v9.b<Long> f41346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v9.b<Long> f41347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final v9.b<n6> f41348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v9.b<q2> f41349g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final v9.b<Double> f41350h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final v9.b<Long> f41351i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final v9.b<Long> f41352j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final v9.b<f4> f41353k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final v9.b<Integer> f41354l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final v9.b<Long> f41355m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final v9.b<f4> f41356n;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, n> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41357c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public n invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(n.f41331o);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(q.f42091g);
                List listW = h9.c.w(jSONObject2, "actions", q.f42095k, n.f41338v, eVarA, cVar2);
                Objects.requireNonNull(o7.f41841a);
                o7 o7Var = (o7) h9.c.n(jSONObject2, "background", o7.f41842b, eVarA, cVar2);
                Objects.requireNonNull(q7.f42185c);
                q7 q7Var = (q7) h9.c.n(jSONObject2, "border", q7.f42187e, eVarA, cVar2);
                uc.l<Number, Long> lVar = h9.h.f30982e;
                h9.m<Long> mVar = n.f41339w;
                h9.k<Long> kVar = h9.l.f30998b;
                v9.b bVarG = h9.c.g(jSONObject2, "end", lVar, mVar, eVarA, kVar);
                Objects.requireNonNull(p2.Converter);
                v9.b bVarS = h9.c.s(jSONObject2, "font_family", p2.FROM_STRING, eVarA, cVar2, n.f41333q);
                v9.b bVarQ = h9.c.q(jSONObject2, "font_size", lVar, n.f41340x, eVarA, cVar2, kVar);
                Objects.requireNonNull(n6.Converter);
                uc.l lVar2 = n6.FROM_STRING;
                v9.b<n6> bVar = n.f41332p;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, "font_size_unit", lVar2, eVarA, cVar2, bVar, n.f41334r);
                if (bVarT != null) {
                    bVar = bVarT;
                }
                Objects.requireNonNull(q2.Converter);
                v9.b bVarS2 = h9.c.s(jSONObject2, "font_weight", q2.FROM_STRING, eVarA, cVar2, n.f41335s);
                v9.b bVarS3 = h9.c.s(jSONObject2, "letter_spacing", h9.h.f30981d, eVarA, cVar2, h9.l.f31000d);
                v9.b bVarQ2 = h9.c.q(jSONObject2, "line_height", lVar, n.f41341y, eVarA, cVar2, kVar);
                v9.b bVarG2 = h9.c.g(jSONObject2, "start", lVar, n.f41342z, eVarA, kVar);
                Objects.requireNonNull(f4.Converter);
                return new n(listW, o7Var, q7Var, bVarG, bVarS, bVarQ, bVar, bVarS2, bVarS3, bVarQ2, bVarG2, h9.c.s(jSONObject2, "strike", f4.FROM_STRING, eVarA, cVar2, n.f41336t), h9.c.s(jSONObject2, "text_color", h9.h.f30978a, eVarA, cVar2, h9.l.f31002f), h9.c.q(jSONObject2, "top_offset", lVar, n.A, eVarA, cVar2, kVar), h9.c.s(jSONObject2, "underline", f4.FROM_STRING, eVarA, cVar2, n.f41337u));
            }
        }

        public static final class b extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f41358c = new b();

            public b() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof p2);
            }
        }

        public static final class c extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f41359c = new c();

            public c() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class d extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f41360c = new d();

            public d() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class e extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f41361c = new e();

            public e() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof f4);
            }
        }

        public static final class f extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f41362c = new f();

            public f() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof f4);
            }
        }

        public static final class g {
            public g() {
            }

            public g(vc.g gVar) {
            }
        }

        static {
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(p2.values());
            b bVar = b.f41358c;
            fd.j0.i(objQ, "default");
            fd.j0.i(bVar, "validator");
            f41333q = new h9.k.a.C0302a(objQ, bVar);
            Object objQ2 = kc.j.q(n6.values());
            c cVar = c.f41359c;
            fd.j0.i(objQ2, "default");
            fd.j0.i(cVar, "validator");
            f41334r = new h9.k.a.C0302a(objQ2, cVar);
            Object objQ3 = kc.j.q(q2.values());
            d dVar = d.f41360c;
            fd.j0.i(objQ3, "default");
            fd.j0.i(dVar, "validator");
            f41335s = new h9.k.a.C0302a(objQ3, dVar);
            Object objQ4 = kc.j.q(f4.values());
            e eVar = e.f41361c;
            fd.j0.i(objQ4, "default");
            fd.j0.i(eVar, "validator");
            f41336t = new h9.k.a.C0302a(objQ4, eVar);
            Object objQ5 = kc.j.q(f4.values());
            f fVar = f.f41362c;
            fd.j0.i(objQ5, "default");
            fd.j0.i(fVar, "validator");
            f41337u = new h9.k.a.C0302a(objQ5, fVar);
            f41338v = j7.f40925g;
            f41339w = k7.f41120p;
            f41340x = k7.f41121q;
            f41341y = k7.f41122r;
            f41342z = k7.f41123s;
            A = k7.f41119o;
            B = a.f41357c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public n(List<? extends q> list, o7 o7Var, q7 q7Var, v9.b<Long> bVar, v9.b<p2> bVar2, v9.b<Long> bVar3, v9.b<n6> bVar4, v9.b<q2> bVar5, v9.b<Double> bVar6, v9.b<Long> bVar7, v9.b<Long> bVar8, v9.b<f4> bVar9, v9.b<Integer> bVar10, v9.b<Long> bVar11, v9.b<f4> bVar12) {
            fd.j0.i(bVar, "end");
            fd.j0.i(bVar4, "fontSizeUnit");
            fd.j0.i(bVar8, "start");
            this.f41343a = list;
            this.f41344b = o7Var;
            this.f41345c = q7Var;
            this.f41346d = bVar;
            this.f41347e = bVar3;
            this.f41348f = bVar4;
            this.f41349g = bVar5;
            this.f41350h = bVar6;
            this.f41351i = bVar7;
            this.f41352j = bVar8;
            this.f41353k = bVar9;
            this.f41354l = bVar10;
            this.f41355m = bVar11;
            this.f41356n = bVar12;
        }

        public /* synthetic */ n(List list, o7 o7Var, q7 q7Var, v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, v9.b bVar6, v9.b bVar7, v9.b bVar8, v9.b bVar9, v9.b bVar10, v9.b bVar11, v9.b bVar12, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : o7Var, (i10 & 4) != 0 ? null : q7Var, bVar, (i10 & 16) != 0 ? null : bVar2, (i10 & 32) != 0 ? null : bVar3, (i10 & 64) != 0 ? f41332p : bVar4, (i10 & 128) != 0 ? null : bVar5, (i10 & 256) != 0 ? null : bVar6, (i10 & 512) != 0 ? null : bVar7, bVar8, (i10 & 2048) != 0 ? null : bVar9, (i10 & 4096) != 0 ? null : bVar10, (i10 & 8192) != 0 ? null : bVar11, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bVar12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        f41244b0 = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        f41245c0 = new v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        f41246d0 = aVar.a(dValueOf);
        f41247e0 = new k0(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        f41248f0 = aVar.a(p2.TEXT);
        f41249g0 = aVar.a(12L);
        f41250h0 = aVar.a(n6.SP);
        f41251i0 = aVar.a(q2.REGULAR);
        f41252j0 = new l6.e(new q8(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f41253k0 = aVar.a(Double.valueOf(0.0d));
        v9.b bVar2 = null;
        f41254l0 = new x1(null, null == true ? 1 : 0, null == true ? 1 : 0, bVar2, null == true ? 1 : 0, 31, gVar);
        f41255m0 = new x1(null, null, bVar, null == true ? 1 : 0, null, 31, null == true ? 1 : 0);
        f41256n0 = aVar.a(Boolean.FALSE);
        f4 f4Var = f4.NONE;
        f41257o0 = aVar.a(f4Var);
        f41258p0 = aVar.a(t.LEFT);
        f41259q0 = aVar.a(u.TOP);
        f41260r0 = aVar.a(-16777216);
        f41261s0 = new z7(null == true ? 1 : 0, null == true ? 1 : 0, bVar2, 7, null);
        f41262t0 = aVar.a(f4Var);
        f41263u0 = aVar.a(n8.VISIBLE);
        f41264v0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        h9.k.a aVar2 = h9.k.a.f30993a;
        f41265w0 = aVar2.a(kc.j.q(t.values()), a.f41295c);
        f41266x0 = aVar2.a(kc.j.q(u.values()), b.f41296c);
        f41267y0 = aVar2.a(kc.j.q(p2.values()), c.f41297c);
        f41268z0 = aVar2.a(kc.j.q(n6.values()), d.f41298c);
        A0 = aVar2.a(kc.j.q(q2.values()), e.f41299c);
        B0 = aVar2.a(kc.j.q(f4.values()), f.f41300c);
        C0 = aVar2.a(kc.j.q(t.values()), g.f41301c);
        D0 = aVar2.a(kc.j.q(u.values()), h.f41302c);
        E0 = aVar2.a(kc.j.q(f4.values()), i.f41303c);
        F0 = aVar2.a(kc.j.q(n8.values()), j.f41304c);
        G0 = e7.f39896x;
        H0 = k7.f41112h;
        I0 = g7.D;
        J0 = j7.f40922d;
        K0 = k7.f41113i;
        L0 = j7.f40923e;
        M0 = k7.f41114j;
        N0 = g7.f40214v;
        O0 = g7.f40215w;
        P0 = e7.f39897y;
        Q0 = e7.f39898z;
        R0 = g7.f40216x;
        S0 = g7.f40217y;
        T0 = k7.f41108d;
        U0 = g7.f40218z;
        V0 = g7.A;
        W0 = k7.f41109e;
        X0 = k7.f41110f;
        Y0 = g7.B;
        Z0 = k7.f41111g;
        f41243a1 = g7.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l7(o oVar, q qVar, v vVar, List<? extends q> list, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, v9.b<Boolean> bVar4, List<? extends e0> list2, k0 k0Var, v9.b<Long> bVar5, List<? extends q1> list3, List<? extends q> list4, l lVar, List<? extends z1> list5, n2 n2Var, v9.b<Integer> bVar6, v9.b<p2> bVar7, v9.b<Long> bVar8, v9.b<n6> bVar9, v9.b<q2> bVar10, l6 l6Var, String str, List<? extends m> list6, v9.b<Double> bVar11, v9.b<Long> bVar12, List<? extends q> list7, x1 x1Var, v9.b<Long> bVar13, v9.b<Long> bVar14, x1 x1Var2, List<? extends n> list8, v9.b<Long> bVar15, v9.b<Boolean> bVar16, List<? extends q> list9, v9.b<f4> bVar17, v9.b<String> bVar18, v9.b<t> bVar19, v9.b<u> bVar20, v9.b<Integer> bVar21, m7 m7Var, List<? extends x7> list10, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list11, v9.b<f4> bVar22, v9.b<n8> bVar23, o8 o8Var, List<? extends o8> list12, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(vVar, "actionAnimation");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar7, "fontFamily");
        fd.j0.i(bVar8, "fontSize");
        fd.j0.i(bVar9, "fontSizeUnit");
        fd.j0.i(bVar10, "fontWeight");
        fd.j0.i(l6Var, "height");
        fd.j0.i(bVar11, "letterSpacing");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar16, "selectable");
        fd.j0.i(bVar17, "strike");
        fd.j0.i(bVar18, "text");
        fd.j0.i(bVar19, "textAlignmentHorizontal");
        fd.j0.i(bVar20, "textAlignmentVertical");
        fd.j0.i(bVar21, "textColor");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar22, "underline");
        fd.j0.i(bVar23, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f41269a = oVar;
        this.f41270b = qVar;
        this.f41271c = vVar;
        this.f41272d = list;
        this.f41273e = bVar;
        this.f41274f = bVar2;
        this.f41275g = bVar3;
        this.f41276h = bVar4;
        this.f41277i = list2;
        this.f41278j = k0Var;
        this.f41279k = bVar5;
        this.f41280l = list3;
        this.f41281m = list4;
        this.f41282n = lVar;
        this.f41283o = list5;
        this.f41284p = n2Var;
        this.f41285q = bVar6;
        this.f41286r = bVar7;
        this.f41287s = bVar8;
        this.f41288t = bVar9;
        this.f41289u = bVar10;
        this.f41290v = l6Var;
        this.f41291w = str;
        this.f41292x = list6;
        this.f41293y = bVar11;
        this.f41294z = bVar12;
        this.A = list7;
        this.B = x1Var;
        this.C = bVar13;
        this.D = bVar14;
        this.E = x1Var2;
        this.F = list8;
        this.G = bVar15;
        this.H = bVar16;
        this.I = list9;
        this.J = bVar17;
        this.K = bVar18;
        this.L = bVar19;
        this.M = bVar20;
        this.N = bVar21;
        this.O = m7Var;
        this.P = list10;
        this.Q = z7Var;
        this.R = r0Var;
        this.S = a0Var;
        this.T = a0Var2;
        this.U = list11;
        this.V = bVar22;
        this.W = bVar23;
        this.X = o8Var;
        this.Y = list12;
        this.Z = l6Var2;
    }

    public /* synthetic */ l7(o oVar, q qVar, v vVar, List list, v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, List list2, k0 k0Var, v9.b bVar5, List list3, List list4, l lVar, List list5, n2 n2Var, v9.b bVar6, v9.b bVar7, v9.b bVar8, v9.b bVar9, v9.b bVar10, l6 l6Var, String str, List list6, v9.b bVar11, v9.b bVar12, List list7, x1 x1Var, v9.b bVar13, v9.b bVar14, x1 x1Var2, List list8, v9.b bVar15, v9.b bVar16, List list9, v9.b bVar17, v9.b bVar18, v9.b bVar19, v9.b bVar20, v9.b bVar21, m7 m7Var, List list10, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list11, v9.b bVar22, v9.b bVar23, o8 o8Var, List list12, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? f41244b0 : oVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? f41245c0 : vVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? f41246d0 : bVar3, (i10 & 128) != 0 ? null : bVar4, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? f41247e0 : k0Var, (i10 & 1024) != 0 ? null : bVar5, (i10 & 2048) != 0 ? null : list3, (i10 & 4096) != 0 ? null : list4, (i10 & 8192) != 0 ? null : lVar, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list5, (i10 & FileUtil.BUF_SIZE) != 0 ? null : n2Var, (i10 & 65536) != 0 ? null : bVar6, (i10 & 131072) != 0 ? f41248f0 : bVar7, (i10 & 262144) != 0 ? f41249g0 : bVar8, (i10 & 524288) != 0 ? f41250h0 : bVar9, (i10 & 1048576) != 0 ? f41251i0 : bVar10, (i10 & 2097152) != 0 ? f41252j0 : l6Var, (i10 & 4194304) != 0 ? null : str, (i10 & 8388608) != 0 ? null : list6, (i10 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? f41253k0 : bVar11, (i10 & 33554432) != 0 ? null : bVar12, (i10 & 67108864) != 0 ? null : list7, (i10 & 134217728) != 0 ? f41254l0 : x1Var, (i10 & 268435456) != 0 ? null : bVar13, (i10 & 536870912) != 0 ? null : bVar14, (i10 & 1073741824) != 0 ? f41255m0 : x1Var2, (i10 & Integer.MIN_VALUE) != 0 ? null : list8, (i11 & 1) != 0 ? null : bVar15, (i11 & 2) != 0 ? f41256n0 : bVar16, (i11 & 4) != 0 ? null : list9, (i11 & 8) != 0 ? f41257o0 : bVar17, bVar18, (i11 & 32) != 0 ? f41258p0 : bVar19, (i11 & 64) != 0 ? f41259q0 : bVar20, (i11 & 128) != 0 ? f41260r0 : bVar21, (i11 & 256) != 0 ? null : m7Var, (i11 & 512) != 0 ? null : list10, (i11 & 1024) != 0 ? f41261s0 : z7Var, (i11 & 2048) != 0 ? null : r0Var, (i11 & 4096) != 0 ? null : a0Var, (i11 & 8192) != 0 ? null : a0Var2, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list11, (32768 & i11) != 0 ? f41262t0 : bVar22, (i11 & 65536) != 0 ? f41263u0 : bVar23, (i11 & 131072) != 0 ? null : o8Var, (i11 & 262144) != 0 ? null : list12, (i11 & 524288) != 0 ? f41264v0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.Q;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f41277i;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.Y;
    }

    @Override // y9.g0
    public o d() {
        return this.f41269a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f41279k;
    }

    @Override // y9.g0
    public x1 f() {
        return this.B;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.G;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f41278j;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f41290v;
    }

    @Override // y9.g0
    public String getId() {
        return this.f41291w;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.W;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.Z;
    }

    @Override // y9.g0
    public x1 h() {
        return this.E;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.U;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.I;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f41273e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f41283o;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.P;
    }

    @Override // y9.g0
    public o8 n() {
        return this.X;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f41274f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.S;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f41275g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f41284p;
    }

    @Override // y9.g0
    public a0 s() {
        return this.T;
    }

    @Override // y9.g0
    public r0 t() {
        return this.R;
    }
}
