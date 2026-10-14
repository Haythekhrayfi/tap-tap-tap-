package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s6 implements u9.a, g0 {
    public static final d M = new d(null);
    public static final o N;
    public static final v9.b<Double> O;
    public static final k0 P;
    public static final l6.e Q;
    public static final x1 R;
    public static final v9.b<Long> S;
    public static final v9.b<Long> T;
    public static final x1 U;
    public static final o V;
    public static final z7 W;
    public static final v9.b<n8> X;
    public static final l6.d Y;
    public static final h9.k<t> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<u> f42585a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.k<n8> f42586b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<Double> f42587c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<e0> f42588d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Long> f42589e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<q1> f42590f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<z1> f42591g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<String> f42592h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Long> f42593i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<q> f42594j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<String> f42595k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.m<String> f42596l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<x7> f42597m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<c8> f42598n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.g<o8> f42599o0;
    public final List<x7> A;
    public final v1 B;
    public final v1 C;
    public final z7 D;
    public final r0 E;
    public final a0 F;
    public final a0 G;
    public final List<c8> H;
    public final v9.b<n8> I;
    public final o8 J;
    public final List<o8> K;
    public final l6 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f42600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f42601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f42602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f42603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f42604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f42605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f42606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<q1> f42607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<z1> f42608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n2 f42609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l6 f42610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f42611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x1 f42612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v9.b<Long> f42613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v9.b<Long> f42614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1 f42615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<Long> f42616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<q> f42617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v1 f42618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f42619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f42620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v1 f42621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f42622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f42623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v1 f42624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v1 f42625z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42626c = new a();

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
        public static final b f42627c = new b();

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
        public static final c f42628c = new c();

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

        public final s6 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            uc.p<u9.c, JSONObject, o> pVar = o.f41707m;
            o oVar = (o) h9.c.n(jSONObject, "accessibility", pVar, eVarA, cVar);
            if (oVar == null) {
                oVar = s6.N;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, s6.Z);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, s6.f42585a0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = s6.f42587c0;
            v9.b<Double> bVar = s6.O;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, s6.f42588d0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = s6.P;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = s6.f42589e0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, s6.f42590f0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, s6.f42591g0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = s6.Q;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            h9.m<String> mVar3 = s6.f42592h0;
            uc.l<?, ?> lVar3 = h9.c.f30973c;
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar3, mVar3, eVarA);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = s6.R;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            v9.b<Long> bVar2 = s6.S;
            v9.b<Double> bVar3 = bVar;
            v9.b<Long> bVarT = h9.c.t(jSONObject, "max_value", lVar2, eVarA, cVar, bVar2, kVar);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            v9.b<Long> bVar4 = s6.T;
            v9.b<Long> bVarT2 = h9.c.t(jSONObject, "min_value", lVar2, eVarA, cVar, bVar4, kVar);
            if (bVarT2 != null) {
                bVar4 = bVarT2;
            }
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = s6.U;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, s6.f42593i0, eVarA, cVar, kVar);
            o oVar3 = (o) h9.c.n(jSONObject, "secondary_value_accessibility", pVar, eVarA, cVar);
            if (oVar3 == null) {
                oVar3 = s6.V;
            }
            o oVar4 = oVar3;
            fd.j0.h(oVar4, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, s6.f42594j0, eVarA, cVar);
            Objects.requireNonNull(v1.f43423a);
            uc.p<u9.c, JSONObject, v1> pVar4 = v1.f43424b;
            v1 v1Var = (v1) h9.c.n(jSONObject, "thumb_secondary_style", pVar4, eVarA, cVar);
            Objects.requireNonNull(e.f42629f);
            uc.p<u9.c, JSONObject, e> pVar5 = e.f42636m;
            e eVar = (e) h9.c.n(jSONObject, "thumb_secondary_text_style", pVar5, eVarA, cVar);
            String str2 = (String) h9.c.m(jSONObject, "thumb_secondary_value_variable", lVar3, s6.f42595k0, eVarA);
            h9.m<?> mVar4 = h9.c.f30971a;
            v1 v1Var2 = (v1) h9.c.d(jSONObject, "thumb_style", pVar4, mVar4, cVar);
            e eVar2 = (e) h9.c.n(jSONObject, "thumb_text_style", pVar5, eVarA, cVar);
            String str3 = (String) h9.c.m(jSONObject, "thumb_value_variable", lVar3, s6.f42596l0, eVarA);
            v1 v1Var3 = (v1) h9.c.n(jSONObject, "tick_mark_active_style", pVar4, eVarA, cVar);
            v1 v1Var4 = (v1) h9.c.n(jSONObject, "tick_mark_inactive_style", pVar4, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, s6.f42597m0, eVarA, cVar);
            v1 v1Var5 = (v1) h9.c.d(jSONObject, "track_active_style", pVar4, mVar4, cVar);
            v1 v1Var6 = (v1) h9.c.d(jSONObject, "track_inactive_style", pVar4, mVar4, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = s6.W;
            }
            z7 z7Var2 = z7Var;
            fd.j0.h(z7Var2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            Objects.requireNonNull(r0.f42228a);
            r0 r0Var = (r0) h9.c.n(jSONObject, "transition_change", r0.f42229b, eVarA, cVar);
            Objects.requireNonNull(a0.f38966a);
            uc.p<u9.c, JSONObject, a0> pVar6 = a0.f38967b;
            a0 a0Var = (a0) h9.c.n(jSONObject, "transition_in", pVar6, eVarA, cVar);
            a0 a0Var2 = (a0) h9.c.n(jSONObject, "transition_out", pVar6, eVarA, cVar);
            Objects.requireNonNull(c8.Converter);
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, s6.f42598n0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar4 = n8.FROM_STRING;
            v9.b<n8> bVar5 = s6.X;
            v9.b<n8> bVarT3 = h9.c.t(jSONObject, "visibility", lVar4, eVarA, cVar, bVar5, s6.f42586b0);
            v9.b<n8> bVar6 = bVarT3 == null ? bVar5 : bVarT3;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar7 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar7, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "visibility_actions", pVar7, s6.f42599o0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = s6.Y;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new s6(oVar2, bVarS, bVarS2, bVar3, listW, k0Var2, bVarQ, listW2, listW3, n2Var, l6Var2, str, x1Var2, bVar2, bVar4, x1Var4, bVarQ2, oVar4, listW4, v1Var, eVar, str2, v1Var2, eVar2, str3, v1Var3, v1Var4, listW5, v1Var5, v1Var6, z7Var2, r0Var, a0Var, a0Var2, listV, bVar6, o8Var, listW6, l6Var3);
        }
    }

    public static class e implements u9.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f42629f = new d(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final v9.b<n6> f42630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final v9.b<q2> f42631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v9.b<Integer> f42632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h9.k<n6> f42633j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.k<q2> f42634k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h9.m<Long> f42635l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, e> f42636m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<Long> f42637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<n6> f42638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<q2> f42639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f5 f42640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v9.b<Integer> f42641e;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42642c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public e invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(e.f42629f);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                v9.b bVarG = h9.c.g(jSONObject2, "font_size", h9.h.f30982e, e.f42635l, eVarA, h9.l.f30998b);
                Objects.requireNonNull(n6.Converter);
                uc.l lVar = n6.FROM_STRING;
                v9.b<n6> bVar = e.f42630g;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, "font_size_unit", lVar, eVarA, cVar2, bVar, e.f42633j);
                if (bVarT != null) {
                    bVar = bVarT;
                }
                Objects.requireNonNull(q2.Converter);
                uc.l lVar2 = q2.FROM_STRING;
                v9.b<q2> bVar2 = e.f42631h;
                v9.b<q2> bVarT2 = h9.c.t(jSONObject2, "font_weight", lVar2, eVarA, cVar2, bVar2, e.f42634k);
                if (bVarT2 != null) {
                    bVar2 = bVarT2;
                }
                Objects.requireNonNull(f5.f39958c);
                f5 f5Var = (f5) h9.c.n(jSONObject2, "offset", f5.f39959d, eVarA, cVar2);
                uc.l<Object, Integer> lVar3 = h9.h.f30978a;
                v9.b<Integer> bVar3 = e.f42632i;
                v9.b<Integer> bVarT3 = h9.c.t(jSONObject2, "text_color", lVar3, eVarA, cVar2, bVar3, h9.l.f31002f);
                return new e(bVarG, bVar, bVar2, f5Var, bVarT3 == null ? bVar3 : bVarT3);
            }
        }

        public static final class b extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f42643c = new b();

            public b() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class c extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f42644c = new c();

            public c() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof q2);
            }
        }

        public static final class d {
            public d() {
            }

            public d(vc.g gVar) {
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            f42630g = aVar.a(n6.SP);
            f42631h = aVar.a(q2.REGULAR);
            f42632i = aVar.a(-16777216);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(n6.values());
            b bVar = b.f42643c;
            fd.j0.i(objQ, "default");
            fd.j0.i(bVar, "validator");
            f42633j = new h9.k.a.C0302a(objQ, bVar);
            Object objQ2 = kc.j.q(q2.values());
            c cVar = c.f42644c;
            fd.j0.i(objQ2, "default");
            fd.j0.i(cVar, "validator");
            f42634k = new h9.k.a.C0302a(objQ2, cVar);
            f42635l = p6.f42036l;
            f42636m = a.f42642c;
        }

        public e(v9.b<Long> bVar, v9.b<n6> bVar2, v9.b<q2> bVar3, f5 f5Var, v9.b<Integer> bVar4) {
            fd.j0.i(bVar, "fontSize");
            fd.j0.i(bVar2, "fontSizeUnit");
            fd.j0.i(bVar3, "fontWeight");
            fd.j0.i(bVar4, "textColor");
            this.f42637a = bVar;
            this.f42638b = bVar2;
            this.f42639c = bVar3;
            this.f42640d = f5Var;
            this.f42641e = bVar4;
        }

        public /* synthetic */ e(v9.b bVar, v9.b bVar2, v9.b bVar3, f5 f5Var, v9.b bVar4, int i10, vc.g gVar) {
            this(bVar, (i10 & 2) != 0 ? f42630g : bVar2, (i10 & 4) != 0 ? f42631h : bVar3, (i10 & 8) != 0 ? null : f5Var, (i10 & 16) != 0 ? f42632i : bVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        N = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        O = aVar.a(Double.valueOf(1.0d));
        P = new k0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        Q = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        v9.b bVar = null;
        v9.b bVar2 = null;
        v9.b bVar3 = null;
        v9.b bVar4 = null;
        R = new x1(null, bVar, bVar2, bVar3, bVar4, 31, null);
        S = aVar.a(100L);
        T = aVar.a(0L);
        U = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null);
        V = new o(bVar, bVar2, bVar3, bVar4, null, null == true ? 1 : 0, 63, null);
        W = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        X = aVar.a(n8.VISIBLE);
        Y = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f42626c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        Z = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar5 = b.f42627c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar5, "validator");
        f42585a0 = new h9.k.a.C0302a(objQ2, bVar5);
        Object objQ3 = kc.j.q(n8.values());
        c cVar = c.f42628c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f42586b0 = new h9.k.a.C0302a(objQ3, cVar);
        f42587c0 = p6.f42034j;
        f42588d0 = c6.D;
        f42589e0 = r6.f42328d;
        f42590f0 = p6.f42035k;
        f42591g0 = r6.f42329e;
        f42592h0 = r6.f42330f;
        f42593i0 = c6.A;
        f42594j0 = p6.f42030f;
        f42595k0 = p6.f42031g;
        f42596l0 = p6.f42032h;
        f42597m0 = c6.B;
        f42598n0 = p6.f42033i;
        f42599o0 = c6.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s6(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, List<? extends q1> list2, List<? extends z1> list3, n2 n2Var, l6 l6Var, String str, x1 x1Var, v9.b<Long> bVar5, v9.b<Long> bVar6, x1 x1Var2, v9.b<Long> bVar7, o oVar2, List<? extends q> list4, v1 v1Var, e eVar, String str2, v1 v1Var2, e eVar2, String str3, v1 v1Var3, v1 v1Var4, List<? extends x7> list5, v1 v1Var5, v1 v1Var6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list6, v9.b<n8> bVar8, o8 o8Var, List<? extends o8> list7, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(l6Var, "height");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(bVar5, "maxValue");
        fd.j0.i(bVar6, "minValue");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(oVar2, "secondaryValueAccessibility");
        fd.j0.i(v1Var2, "thumbStyle");
        fd.j0.i(v1Var5, "trackActiveStyle");
        fd.j0.i(v1Var6, "trackInactiveStyle");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar8, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f42600a = oVar;
        this.f42601b = bVar;
        this.f42602c = bVar2;
        this.f42603d = bVar3;
        this.f42604e = list;
        this.f42605f = k0Var;
        this.f42606g = bVar4;
        this.f42607h = list2;
        this.f42608i = list3;
        this.f42609j = n2Var;
        this.f42610k = l6Var;
        this.f42611l = str;
        this.f42612m = x1Var;
        this.f42613n = bVar5;
        this.f42614o = bVar6;
        this.f42615p = x1Var2;
        this.f42616q = bVar7;
        this.f42617r = list4;
        this.f42618s = v1Var;
        this.f42619t = eVar;
        this.f42620u = str2;
        this.f42621v = v1Var2;
        this.f42622w = eVar2;
        this.f42623x = str3;
        this.f42624y = v1Var3;
        this.f42625z = v1Var4;
        this.A = list5;
        this.B = v1Var5;
        this.C = v1Var6;
        this.D = z7Var;
        this.E = r0Var;
        this.F = a0Var;
        this.G = a0Var2;
        this.H = list6;
        this.I = bVar8;
        this.J = o8Var;
        this.K = list7;
        this.L = l6Var2;
    }

    public /* synthetic */ s6(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, List list2, List list3, n2 n2Var, l6 l6Var, String str, x1 x1Var, v9.b bVar5, v9.b bVar6, x1 x1Var2, v9.b bVar7, o oVar2, List list4, v1 v1Var, e eVar, String str2, v1 v1Var2, e eVar2, String str3, v1 v1Var3, v1 v1Var4, List list5, v1 v1Var5, v1 v1Var6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list6, v9.b bVar8, o8 o8Var, List list7, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? N : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? O : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? P : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : list3, (i10 & 512) != 0 ? null : n2Var, (i10 & 1024) != 0 ? Q : l6Var, (i10 & 2048) != 0 ? null : str, (i10 & 4096) != 0 ? R : x1Var, (i10 & 8192) != 0 ? S : bVar5, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? T : bVar6, (32768 & i10) != 0 ? U : x1Var2, (65536 & i10) != 0 ? null : bVar7, (131072 & i10) != 0 ? V : oVar2, (262144 & i10) != 0 ? null : list4, (524288 & i10) != 0 ? null : v1Var, (1048576 & i10) != 0 ? null : eVar, (2097152 & i10) != 0 ? null : str2, v1Var2, (8388608 & i10) != 0 ? null : eVar2, (16777216 & i10) != 0 ? null : str3, (33554432 & i10) != 0 ? null : v1Var3, (67108864 & i10) != 0 ? null : v1Var4, (134217728 & i10) != 0 ? null : list5, v1Var5, v1Var6, (1073741824 & i10) != 0 ? W : z7Var, (i10 & Integer.MIN_VALUE) != 0 ? null : r0Var, (i11 & 1) != 0 ? null : a0Var, (i11 & 2) != 0 ? null : a0Var2, (i11 & 4) != 0 ? null : list6, (i11 & 8) != 0 ? X : bVar8, (i11 & 16) != 0 ? null : o8Var, (i11 & 32) != 0 ? null : list7, (i11 & 64) != 0 ? Y : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.D;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f42604e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.K;
    }

    @Override // y9.g0
    public o d() {
        return this.f42600a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f42606g;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f42612m;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f42616q;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f42605f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f42610k;
    }

    @Override // y9.g0
    public String getId() {
        return this.f42611l;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.I;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.L;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f42615p;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.H;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f42617r;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f42601b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f42608i;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.A;
    }

    @Override // y9.g0
    public o8 n() {
        return this.J;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f42602c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.F;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f42603d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f42609j;
    }

    @Override // y9.g0
    public a0 s() {
        return this.G;
    }

    @Override // y9.g0
    public r0 t() {
        return this.E;
    }
}
