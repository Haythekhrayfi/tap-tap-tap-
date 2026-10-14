package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.Scopes;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s3 implements u9.a, g0 {
    public static final h9.m<Long> A0;
    public static final h9.m<Long> B0;
    public static final h9.g<q> C0;
    public static final h9.m<String> D0;
    public static final h9.g<x7> E0;
    public static final h9.g<c8> F0;
    public static final h9.g<z3> G0;
    public static final h9.g<o8> H0;
    public static final h R = new h(null);
    public static final o S;
    public static final v9.b<Double> T;
    public static final k0 U;
    public static final v9.b<p2> V;
    public static final v9.b<Long> W;
    public static final v9.b<n6> X;
    public static final v9.b<q2> Y;
    public static final l6.e Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v9.b<Integer> f42499a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final v9.b<i> f42500b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final v9.b<Double> f42501c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final x1 f42502d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final x1 f42503e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final v9.b<Boolean> f42504f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final v9.b<Integer> f42505g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final z7 f42506h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final v9.b<n8> f42507i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final l6.d f42508j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.k<t> f42509k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.k<u> f42510l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.k<p2> f42511m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.k<n6> f42512n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.k<q2> f42513o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.k<i> f42514p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.k<n8> f42515q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.m<Double> f42516r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<e0> f42517s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.m<Long> f42518t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<q1> f42519u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h9.g<z1> f42520v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h9.m<Long> f42521w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h9.m<String> f42522x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h9.m<String> f42523y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h9.m<Long> f42524z0;
    public final x1 A;
    public final v9.b<Long> B;
    public final v9.b<Boolean> C;
    public final List<q> D;
    public final v9.b<Integer> E;
    public final String F;
    public final List<x7> G;
    public final z7 H;
    public final r0 I;
    public final a0 J;
    public final a0 K;
    public final List<c8> L;
    public final List<z3> M;
    public final v9.b<n8> N;
    public final o8 O;
    public final List<o8> P;
    public final l6 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f42525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f42526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f42527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f42528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f42529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f42530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f42531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<q1> f42532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<z1> f42533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n2 f42534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<p2> f42535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.b<Long> f42536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v9.b<n6> f42537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v9.b<q2> f42538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l6 f42539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v9.b<Integer> f42540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<Integer> f42541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9.b<String> f42542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f42543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v9.b<i> f42544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v9.b<Double> f42545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v9.b<Long> f42546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f42547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t3 f42548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b<Long> f42549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j f42550z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42551c = new a();

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
        public static final b f42552c = new b();

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
        public static final c f42553c = new c();

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
        public static final d f42554c = new d();

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
        public static final e f42555c = new e();

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
        public static final f f42556c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof i);
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f42557c = new g();

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

        public final s3 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = s3.S;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, s3.f42509k0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, s3.f42510l0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = s3.f42516r0;
            v9.b<Double> bVar = s3.T;
            h9.k<Double> kVar = h9.l.f31000d;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, s3.f42517s0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = s3.U;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = s3.f42518t0;
            h9.k<Long> kVar2 = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar2);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, s3.f42519u0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, s3.f42520v0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(p2.Converter);
            uc.l lVar3 = p2.FROM_STRING;
            v9.b<p2> bVar2 = s3.V;
            v9.b<p2> bVarT = h9.c.t(jSONObject, "font_family", lVar3, eVarA, cVar, bVar2, s3.f42511m0);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            h9.m<Long> mVar3 = s3.f42521w0;
            v9.b<Long> bVar3 = s3.W;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "font_size", lVar2, mVar3, eVarA, bVar3, kVar2);
            if (bVarR2 != null) {
                bVar3 = bVarR2;
            }
            Objects.requireNonNull(n6.Converter);
            uc.l lVar4 = n6.FROM_STRING;
            v9.b<n6> bVar4 = s3.X;
            v9.b<n6> bVarT2 = h9.c.t(jSONObject, "font_size_unit", lVar4, eVarA, cVar, bVar4, s3.f42512n0);
            if (bVarT2 != null) {
                bVar4 = bVarT2;
            }
            Objects.requireNonNull(q2.Converter);
            uc.l lVar5 = q2.FROM_STRING;
            v9.b<q2> bVar5 = s3.Y;
            v9.b<q2> bVarT3 = h9.c.t(jSONObject, "font_weight", lVar5, eVarA, cVar, bVar5, s3.f42513o0);
            if (bVarT3 != null) {
                bVar5 = bVarT3;
            }
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar, eVarA, cVar);
            if (l6Var == null) {
                l6Var = s3.Z;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            uc.l<Object, Integer> lVar6 = h9.h.f30978a;
            h9.k<Integer> kVar3 = h9.l.f31002f;
            v9.b bVarS3 = h9.c.s(jSONObject, "highlight_color", lVar6, eVarA, cVar, kVar3);
            v9.b<Integer> bVar6 = s3.f42499a0;
            v9.b<Double> bVar7 = bVar;
            v9.b<Integer> bVarT4 = h9.c.t(jSONObject, "hint_color", lVar6, eVarA, cVar, bVar6, kVar3);
            if (bVarT4 != null) {
                bVar6 = bVarT4;
            }
            v9.b bVarO = h9.c.o(jSONObject, "hint_text", s3.f42522x0, eVarA, cVar, h9.l.f30999c);
            h9.m<String> mVar4 = s3.f42523y0;
            uc.l<?, ?> lVar7 = h9.c.f30973c;
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar7, mVar4, eVarA);
            Objects.requireNonNull(i.Converter);
            uc.l lVar8 = i.FROM_STRING;
            v9.b<i> bVar8 = s3.f42500b0;
            v9.b<i> bVarT5 = h9.c.t(jSONObject, "keyboard_type", lVar8, eVarA, cVar, bVar8, s3.f42514p0);
            if (bVarT5 != null) {
                bVar8 = bVarT5;
            }
            v9.b<Double> bVar9 = s3.f42501c0;
            v9.b<Double> bVarT6 = h9.c.t(jSONObject, "letter_spacing", lVar, eVarA, cVar, bVar9, kVar);
            if (bVarT6 != null) {
                bVar9 = bVarT6;
            }
            v9.b bVarQ2 = h9.c.q(jSONObject, "line_height", lVar2, s3.f42524z0, eVarA, cVar, kVar2);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar2 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar2, eVarA, cVar);
            if (x1Var == null) {
                x1Var = s3.f42502d0;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Objects.requireNonNull(t3.f42742a);
            t3 t3Var = (t3) h9.c.n(jSONObject, "mask", t3.f42743b, eVarA, cVar);
            v9.b bVarQ3 = h9.c.q(jSONObject, "max_visible_lines", lVar2, s3.A0, eVarA, cVar, kVar2);
            Objects.requireNonNull(j.f42559b);
            j jVar = (j) h9.c.n(jSONObject, "native_interface", j.f42560c, eVarA, cVar);
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar2, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = s3.f42503e0;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ4 = h9.c.q(jSONObject, "row_span", lVar2, s3.B0, eVarA, cVar, kVar2);
            uc.l<Object, Boolean> lVar9 = h9.h.f30980c;
            v9.b<Boolean> bVar10 = s3.f42504f0;
            v9.b<Boolean> bVarT7 = h9.c.t(jSONObject, "select_all_on_focus", lVar9, eVarA, cVar, bVar10, h9.l.f30997a);
            v9.b<Boolean> bVar11 = bVarT7 == null ? bVar10 : bVarT7;
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, s3.C0, eVarA, cVar);
            v9.b<Integer> bVar12 = s3.f42505g0;
            v9.b<Integer> bVarT8 = h9.c.t(jSONObject, "text_color", lVar6, eVarA, cVar, bVar12, kVar3);
            v9.b<Integer> bVar13 = bVarT8 == null ? bVar12 : bVarT8;
            String str2 = (String) h9.c.c(jSONObject, "text_variable", lVar7, s3.D0);
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, s3.E0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = s3.f42506h0;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, s3.F0, eVarA, cVar);
            Objects.requireNonNull(z3.f44612a);
            List listW6 = h9.c.w(jSONObject, "validators", z3.f44613b, s3.G0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar10 = n8.FROM_STRING;
            v9.b<n8> bVar14 = s3.f42507i0;
            v9.b<n8> bVarT9 = h9.c.t(jSONObject, "visibility", lVar10, eVarA, cVar, bVar14, s3.f42515q0);
            v9.b<n8> bVar15 = bVarT9 == null ? bVar14 : bVarT9;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar4 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar4, eVarA, cVar);
            List listW7 = h9.c.w(jSONObject, "visibility_actions", pVar4, s3.H0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = s3.f42508j0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new s3(oVar2, bVarS, bVarS2, bVar7, listW, k0Var2, bVarQ, listW2, listW3, n2Var, bVar2, bVar3, bVar4, bVar5, l6Var2, bVarS3, bVar6, bVarO, str, bVar8, bVar9, bVarQ2, x1Var2, t3Var, bVarQ3, jVar, x1Var4, bVarQ4, bVar11, listW4, bVar13, str2, listW5, z7Var2, r0Var, a0Var, a0Var2, listV, listW6, bVar15, o8Var, listW7, l6Var3);
        }
    }

    public enum i {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL(Scopes.EMAIL),
        URI("uri");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, i> FROM_STRING = a.f42558c;

        public static final class a extends vc.l implements uc.l<String, i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42558c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public i invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                i iVar = i.SINGLE_LINE_TEXT;
                if (fd.j0.d(str2, iVar.value)) {
                    return iVar;
                }
                i iVar2 = i.MULTI_LINE_TEXT;
                if (fd.j0.d(str2, iVar2.value)) {
                    return iVar2;
                }
                i iVar3 = i.PHONE;
                if (fd.j0.d(str2, iVar3.value)) {
                    return iVar3;
                }
                i iVar4 = i.NUMBER;
                if (fd.j0.d(str2, iVar4.value)) {
                    return iVar4;
                }
                i iVar5 = i.EMAIL;
                if (fd.j0.d(str2, iVar5.value)) {
                    return iVar5;
                }
                i iVar6 = i.URI;
                if (fd.j0.d(str2, iVar6.value)) {
                    return iVar6;
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

    public static class j implements u9.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f42559b = new b(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, j> f42560c = a.f42562c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<Integer> f42561a;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, j> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42562c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public j invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(j.f42559b);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                return new j(h9.c.h(jSONObject2, "color", h9.h.f30978a, cVar2.a(), cVar2, h9.l.f31002f));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        public j(v9.b<Integer> bVar) {
            fd.j0.i(bVar, "color");
            this.f42561a = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        S = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        T = aVar.a(Double.valueOf(1.0d));
        U = new k0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        V = aVar.a(p2.TEXT);
        W = aVar.a(12L);
        X = aVar.a(n6.SP);
        Y = aVar.a(q2.REGULAR);
        Z = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f42499a0 = aVar.a(1929379840);
        f42500b0 = aVar.a(i.MULTI_LINE_TEXT);
        f42501c0 = aVar.a(Double.valueOf(0.0d));
        f42502d0 = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, gVar);
        f42503e0 = new x1(null, null, null, null, null, 31, null);
        f42504f0 = aVar.a(Boolean.FALSE);
        f42505g0 = aVar.a(-16777216);
        f42506h0 = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        f42507i0 = aVar.a(n8.VISIBLE);
        f42508j0 = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f42551c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f42509k0 = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar = b.f42552c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar, "validator");
        f42510l0 = new h9.k.a.C0302a(objQ2, bVar);
        Object objQ3 = kc.j.q(p2.values());
        c cVar = c.f42553c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f42511m0 = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(n6.values());
        d dVar = d.f42554c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        f42512n0 = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(q2.values());
        e eVar = e.f42555c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f42513o0 = new h9.k.a.C0302a(objQ5, eVar);
        Object objQ6 = kc.j.q(i.values());
        f fVar = f.f42556c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(fVar, "validator");
        f42514p0 = new h9.k.a.C0302a(objQ6, fVar);
        Object objQ7 = kc.j.q(n8.values());
        g gVar2 = g.f42557c;
        fd.j0.i(objQ7, "default");
        fd.j0.i(gVar2, "validator");
        f42515q0 = new h9.k.a.C0302a(objQ7, gVar2);
        f42516r0 = n3.f41663j;
        f42517s0 = o3.f41808p;
        f42518t0 = o3.f41809q;
        f42519u0 = n3.f41667n;
        f42520v0 = o3.f41810r;
        f42521w0 = o3.f41811s;
        f42522x0 = n3.f41658e;
        f42523y0 = n3.f41659f;
        f42524z0 = n3.f41660g;
        A0 = n3.f41661h;
        B0 = n3.f41662i;
        C0 = o3.f41805m;
        D0 = n3.f41664k;
        E0 = o3.f41806n;
        F0 = n3.f41665l;
        G0 = o3.f41807o;
        H0 = n3.f41666m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s3(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, List<? extends q1> list2, List<? extends z1> list3, n2 n2Var, v9.b<p2> bVar5, v9.b<Long> bVar6, v9.b<n6> bVar7, v9.b<q2> bVar8, l6 l6Var, v9.b<Integer> bVar9, v9.b<Integer> bVar10, v9.b<String> bVar11, String str, v9.b<i> bVar12, v9.b<Double> bVar13, v9.b<Long> bVar14, x1 x1Var, t3 t3Var, v9.b<Long> bVar15, j jVar, x1 x1Var2, v9.b<Long> bVar16, v9.b<Boolean> bVar17, List<? extends q> list4, v9.b<Integer> bVar18, String str2, List<? extends x7> list5, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list6, List<? extends z3> list7, v9.b<n8> bVar19, o8 o8Var, List<? extends o8> list8, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar5, "fontFamily");
        fd.j0.i(bVar6, "fontSize");
        fd.j0.i(bVar7, "fontSizeUnit");
        fd.j0.i(bVar8, "fontWeight");
        fd.j0.i(l6Var, "height");
        fd.j0.i(bVar10, "hintColor");
        fd.j0.i(bVar12, "keyboardType");
        fd.j0.i(bVar13, "letterSpacing");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar17, "selectAllOnFocus");
        fd.j0.i(bVar18, "textColor");
        fd.j0.i(str2, "textVariable");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar19, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f42525a = oVar;
        this.f42526b = bVar;
        this.f42527c = bVar2;
        this.f42528d = bVar3;
        this.f42529e = list;
        this.f42530f = k0Var;
        this.f42531g = bVar4;
        this.f42532h = list2;
        this.f42533i = list3;
        this.f42534j = n2Var;
        this.f42535k = bVar5;
        this.f42536l = bVar6;
        this.f42537m = bVar7;
        this.f42538n = bVar8;
        this.f42539o = l6Var;
        this.f42540p = bVar9;
        this.f42541q = bVar10;
        this.f42542r = bVar11;
        this.f42543s = str;
        this.f42544t = bVar12;
        this.f42545u = bVar13;
        this.f42546v = bVar14;
        this.f42547w = x1Var;
        this.f42548x = t3Var;
        this.f42549y = bVar15;
        this.f42550z = jVar;
        this.A = x1Var2;
        this.B = bVar16;
        this.C = bVar17;
        this.D = list4;
        this.E = bVar18;
        this.F = str2;
        this.G = list5;
        this.H = z7Var;
        this.I = r0Var;
        this.J = a0Var;
        this.K = a0Var2;
        this.L = list6;
        this.M = list7;
        this.N = bVar19;
        this.O = o8Var;
        this.P = list8;
        this.Q = l6Var2;
    }

    public /* synthetic */ s3(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, List list2, List list3, n2 n2Var, v9.b bVar5, v9.b bVar6, v9.b bVar7, v9.b bVar8, l6 l6Var, v9.b bVar9, v9.b bVar10, v9.b bVar11, String str, v9.b bVar12, v9.b bVar13, v9.b bVar14, x1 x1Var, t3 t3Var, v9.b bVar15, j jVar, x1 x1Var2, v9.b bVar16, v9.b bVar17, List list4, v9.b bVar18, String str2, List list5, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list6, List list7, v9.b bVar19, o8 o8Var, List list8, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? S : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? T : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? U : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : list3, (i10 & 512) != 0 ? null : n2Var, (i10 & 1024) != 0 ? V : bVar5, (i10 & 2048) != 0 ? W : bVar6, (i10 & 4096) != 0 ? X : bVar7, (i10 & 8192) != 0 ? Y : bVar8, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Z : l6Var, (32768 & i10) != 0 ? null : bVar9, (65536 & i10) != 0 ? f42499a0 : bVar10, (131072 & i10) != 0 ? null : bVar11, (262144 & i10) != 0 ? null : str, (524288 & i10) != 0 ? f42500b0 : bVar12, (1048576 & i10) != 0 ? f42501c0 : bVar13, (2097152 & i10) != 0 ? null : bVar14, (4194304 & i10) != 0 ? f42502d0 : x1Var, (8388608 & i10) != 0 ? null : t3Var, (16777216 & i10) != 0 ? null : bVar15, (33554432 & i10) != 0 ? null : jVar, (67108864 & i10) != 0 ? f42503e0 : x1Var2, (134217728 & i10) != 0 ? null : bVar16, (268435456 & i10) != 0 ? f42504f0 : bVar17, (536870912 & i10) != 0 ? null : list4, (i10 & 1073741824) != 0 ? f42505g0 : bVar18, str2, (i11 & 1) != 0 ? null : list5, (i11 & 2) != 0 ? f42506h0 : z7Var, (i11 & 4) != 0 ? null : r0Var, (i11 & 8) != 0 ? null : a0Var, (i11 & 16) != 0 ? null : a0Var2, (i11 & 32) != 0 ? null : list6, (i11 & 64) != 0 ? null : list7, (i11 & 128) != 0 ? f42507i0 : bVar19, (i11 & 256) != 0 ? null : o8Var, (i11 & 512) != 0 ? null : list8, (i11 & 1024) != 0 ? f42508j0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.H;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f42529e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.P;
    }

    @Override // y9.g0
    public o d() {
        return this.f42525a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f42531g;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f42547w;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.B;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f42530f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f42539o;
    }

    @Override // y9.g0
    public String getId() {
        return this.f42543s;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.N;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.Q;
    }

    @Override // y9.g0
    public x1 h() {
        return this.A;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.L;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.D;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f42526b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f42533i;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.G;
    }

    @Override // y9.g0
    public o8 n() {
        return this.O;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f42527c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.J;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f42528d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f42534j;
    }

    @Override // y9.g0
    public a0 s() {
        return this.K;
    }

    @Override // y9.g0
    public r0 t() {
        return this.I;
    }
}
