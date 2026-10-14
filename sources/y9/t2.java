package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t2 implements u9.a, g0 {
    public static final g J = new g(null);
    public static final o K;
    public static final v9.b<Double> L;
    public static final k0 M;
    public static final v9.b<h> N;
    public static final v9.b<Long> O;
    public static final l6.e P;
    public static final v9.b<Long> Q;
    public static final x1 R;
    public static final v9.b<i> S;
    public static final x1 T;
    public static final v9.b<Boolean> U;
    public static final v9.b<j> V;
    public static final z7 W;
    public static final v9.b<n8> X;
    public static final l6.d Y;
    public static final h9.k<t> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<u> f42686a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.k<h> f42687b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.k<i> f42688c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<j> f42689d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<n8> f42690e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.m<Double> f42691f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<e0> f42692g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Long> f42693h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Long> f42694i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.m<Long> f42695j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Long> f42696k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<q1> f42697l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<z1> f42698m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<String> f42699n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f42700o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<k> f42701p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.m<Long> f42702q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<q> f42703r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<x7> f42704s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<c8> f42705t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h9.g<o8> f42706u0;
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
    public final o f42707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f42708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f42709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f42710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f42711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f42712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f42713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.b<Long> f42714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v9.b<h> f42715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v9.b<Long> f42716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<Long> f42717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<q1> f42718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<z1> f42719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n2 f42720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l6 f42721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f42722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<Long> f42723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<k> f42724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x1 f42725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v9.b<i> f42726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x1 f42727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v9.b<Boolean> f42728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v9.b<Long> f42729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v9.b<j> f42730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<q> f42731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<x7> f42732z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42733c = new a();

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
        public static final b f42734c = new b();

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
        public static final c f42735c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h);
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42736c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof i);
        }
    }

    public static final class e extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f42737c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof j);
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f42738c = new f();

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

        public final t2 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = t2.K;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, t2.Z);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, t2.f42686a0);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = t2.f42691f0;
            v9.b<Double> bVar = t2.L;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            v9.b<Double> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, t2.f42692g0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = t2.M;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = t2.f42693h0;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_count", lVar2, mVar2, eVarA, cVar, kVar);
            v9.b bVarQ2 = h9.c.q(jSONObject, "column_span", lVar2, t2.f42694i0, eVarA, cVar, kVar);
            Objects.requireNonNull(h.Converter);
            uc.l lVar3 = h.FROM_STRING;
            v9.b<h> bVar3 = t2.N;
            v9.b<h> bVarT = h9.c.t(jSONObject, "cross_content_alignment", lVar3, eVarA, cVar, bVar3, t2.f42687b0);
            if (bVarT != null) {
                bVar3 = bVarT;
            }
            v9.b bVarQ3 = h9.c.q(jSONObject, "cross_spacing", lVar2, t2.f42695j0, eVarA, cVar, kVar);
            h9.m<Long> mVar3 = t2.f42696k0;
            v9.b<Long> bVar4 = t2.O;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "default_item", lVar2, mVar3, eVarA, bVar4, kVar);
            if (bVarR2 != null) {
                bVar4 = bVarR2;
            }
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, t2.f42697l0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, t2.f42698m0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar, eVarA, cVar);
            if (l6Var == null) {
                l6Var = t2.P;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, t2.f42699n0, eVarA);
            h9.m<Long> mVar4 = t2.f42700o0;
            v9.b<Long> bVar5 = t2.Q;
            v9.b<Long> bVarR3 = h9.c.r(jSONObject, "item_spacing", lVar2, mVar4, eVarA, bVar5, kVar);
            if (bVarR3 != null) {
                bVar5 = bVarR3;
            }
            Objects.requireNonNull(k.f40973a);
            List listL = h9.c.l(jSONObject, "items", k.f40974b, t2.f42701p0, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar2 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar2, eVarA, cVar);
            if (x1Var == null) {
                x1Var = t2.R;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Objects.requireNonNull(i.Converter);
            uc.l lVar4 = i.FROM_STRING;
            v9.b<i> bVar6 = t2.S;
            v9.b<i> bVarT2 = h9.c.t(jSONObject, "orientation", lVar4, eVarA, cVar, bVar6, t2.f42688c0);
            if (bVarT2 != null) {
                bVar6 = bVarT2;
            }
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar2, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = t2.T;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            uc.l<Object, Boolean> lVar5 = h9.h.f30980c;
            v9.b<Boolean> bVar7 = t2.U;
            v9.b<Boolean> bVarT3 = h9.c.t(jSONObject, "restrict_parent_scroll", lVar5, eVarA, cVar, bVar7, h9.l.f30997a);
            v9.b<Boolean> bVar8 = bVarT3 == null ? bVar7 : bVarT3;
            v9.b bVarQ4 = h9.c.q(jSONObject, "row_span", lVar2, t2.f42702q0, eVarA, cVar, kVar);
            Objects.requireNonNull(j.Converter);
            uc.l lVar6 = j.FROM_STRING;
            v9.b<j> bVar9 = t2.V;
            v9.b<j> bVarT4 = h9.c.t(jSONObject, "scroll_mode", lVar6, eVarA, cVar, bVar9, t2.f42689d0);
            v9.b<j> bVar10 = bVarT4 == null ? bVar9 : bVarT4;
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, t2.f42703r0, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, t2.f42704s0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = t2.W;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, t2.f42705t0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar7 = n8.FROM_STRING;
            v9.b<n8> bVar11 = t2.X;
            v9.b<n8> bVarT5 = h9.c.t(jSONObject, "visibility", lVar7, eVarA, cVar, bVar11, t2.f42690e0);
            v9.b<n8> bVar12 = bVarT5 == null ? bVar11 : bVarT5;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar4 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar4, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "visibility_actions", pVar4, t2.f42706u0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = t2.Y;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new t2(oVar2, bVarS, bVarS2, bVar2, listW, k0Var2, bVarQ, bVarQ2, bVar3, bVarQ3, bVar4, listW2, listW3, n2Var, l6Var2, str, bVar5, listL, x1Var2, bVar6, x1Var4, bVar8, bVarQ4, bVar10, listW4, listW5, z7Var2, r0Var, a0Var, a0Var2, listV, bVar12, o8Var, listW6, l6Var3);
        }
    }

    public enum h {
        START("start"),
        CENTER("center"),
        END("end");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, h> FROM_STRING = a.f42739c;

        public static final class a extends vc.l implements uc.l<String, h> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42739c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public h invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                h hVar = h.START;
                if (fd.j0.d(str2, hVar.value)) {
                    return hVar;
                }
                h hVar2 = h.CENTER;
                if (fd.j0.d(str2, hVar2.value)) {
                    return hVar2;
                }
                h hVar3 = h.END;
                if (fd.j0.d(str2, hVar3.value)) {
                    return hVar3;
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

        h(String str) {
            this.value = str;
        }
    }

    public enum i {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        public static final b Converter = new b(null);
        private static final uc.l<String, i> FROM_STRING = a.f42740c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42740c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public i invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                i iVar = i.HORIZONTAL;
                if (fd.j0.d(str2, iVar.value)) {
                    return iVar;
                }
                i iVar2 = i.VERTICAL;
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
        PAGING("paging"),
        DEFAULT("default");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, j> FROM_STRING = a.f42741c;

        public static final class a extends vc.l implements uc.l<String, j> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42741c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public j invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                j jVar = j.PAGING;
                if (fd.j0.d(str2, jVar.value)) {
                    return jVar;
                }
                j jVar2 = j.DEFAULT;
                if (fd.j0.d(str2, jVar2.value)) {
                    return jVar2;
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        K = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        L = aVar.a(Double.valueOf(1.0d));
        M = new k0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        N = aVar.a(h.START);
        O = aVar.a(0L);
        P = new l6.e(new q8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        Q = aVar.a(8L);
        v9.b bVar = null;
        int i10 = 31;
        R = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, bVar, null == true ? 1 : 0, i10, gVar);
        S = aVar.a(i.HORIZONTAL);
        T = new x1(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, bVar, null == true ? 1 : 0, i10, gVar);
        U = aVar.a(Boolean.FALSE);
        V = aVar.a(j.DEFAULT);
        W = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
        X = aVar.a(n8.VISIBLE);
        Y = new l6.d(new i4(null, 1, null == true ? 1 : 0));
        int i11 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f42733c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        Z = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar2 = b.f42734c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar2, "validator");
        f42686a0 = new h9.k.a.C0302a(objQ2, bVar2);
        Object objQ3 = kc.j.q(h.values());
        c cVar = c.f42735c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f42687b0 = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(i.values());
        d dVar = d.f42736c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        f42688c0 = new h9.k.a.C0302a(objQ4, dVar);
        Object objQ5 = kc.j.q(j.values());
        e eVar = e.f42737c;
        fd.j0.i(objQ5, "default");
        fd.j0.i(eVar, "validator");
        f42689d0 = new h9.k.a.C0302a(objQ5, eVar);
        Object objQ6 = kc.j.q(n8.values());
        f fVar = f.f42738c;
        fd.j0.i(objQ6, "default");
        fd.j0.i(fVar, "validator");
        f42690e0 = new h9.k.a.C0302a(objQ6, fVar);
        f42691f0 = k2.f41042z;
        f42692g0 = r2.f42261h;
        f42693h0 = r2.f42262i;
        f42694i0 = r2.f42263j;
        f42695j0 = r2.f42264k;
        f42696k0 = k2.f41038v;
        f42697l0 = g2.f40121y;
        f42698m0 = k2.f41039w;
        f42699n0 = k2.f41040x;
        f42700o0 = k2.f41041y;
        f42701p0 = r2.f42257d;
        f42702q0 = r2.f42258e;
        f42703r0 = r2.f42259f;
        f42704s0 = k2.A;
        f42705t0 = r2.f42260g;
        f42706u0 = k2.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t2(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, v9.b<Long> bVar5, v9.b<h> bVar6, v9.b<Long> bVar7, v9.b<Long> bVar8, List<? extends q1> list2, List<? extends z1> list3, n2 n2Var, l6 l6Var, String str, v9.b<Long> bVar9, List<? extends k> list4, x1 x1Var, v9.b<i> bVar10, x1 x1Var2, v9.b<Boolean> bVar11, v9.b<Long> bVar12, v9.b<j> bVar13, List<? extends q> list5, List<? extends x7> list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list7, v9.b<n8> bVar14, o8 o8Var, List<? extends o8> list8, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(bVar6, "crossContentAlignment");
        fd.j0.i(bVar8, "defaultItem");
        fd.j0.i(l6Var, "height");
        fd.j0.i(bVar9, "itemSpacing");
        fd.j0.i(list4, "items");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(bVar10, "orientation");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar11, "restrictParentScroll");
        fd.j0.i(bVar13, "scrollMode");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar14, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f42707a = oVar;
        this.f42708b = bVar;
        this.f42709c = bVar2;
        this.f42710d = bVar3;
        this.f42711e = list;
        this.f42712f = k0Var;
        this.f42713g = bVar4;
        this.f42714h = bVar5;
        this.f42715i = bVar6;
        this.f42716j = bVar7;
        this.f42717k = bVar8;
        this.f42718l = list2;
        this.f42719m = list3;
        this.f42720n = n2Var;
        this.f42721o = l6Var;
        this.f42722p = str;
        this.f42723q = bVar9;
        this.f42724r = list4;
        this.f42725s = x1Var;
        this.f42726t = bVar10;
        this.f42727u = x1Var2;
        this.f42728v = bVar11;
        this.f42729w = bVar12;
        this.f42730x = bVar13;
        this.f42731y = list5;
        this.f42732z = list6;
        this.A = z7Var;
        this.B = r0Var;
        this.C = a0Var;
        this.D = a0Var2;
        this.E = list7;
        this.F = bVar14;
        this.G = o8Var;
        this.H = list8;
        this.I = l6Var2;
    }

    public /* synthetic */ t2(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, v9.b bVar5, v9.b bVar6, v9.b bVar7, v9.b bVar8, List list2, List list3, n2 n2Var, l6 l6Var, String str, v9.b bVar9, List list4, x1 x1Var, v9.b bVar10, x1 x1Var2, v9.b bVar11, v9.b bVar12, v9.b bVar13, List list5, List list6, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list7, v9.b bVar14, o8 o8Var, List list8, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? K : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? L : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? M : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : bVar5, (i10 & 256) != 0 ? N : bVar6, (i10 & 512) != 0 ? null : bVar7, (i10 & 1024) != 0 ? O : bVar8, (i10 & 2048) != 0 ? null : list2, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : n2Var, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? P : l6Var, (32768 & i10) != 0 ? null : str, (65536 & i10) != 0 ? Q : bVar9, list4, (262144 & i10) != 0 ? R : x1Var, (524288 & i10) != 0 ? S : bVar10, (1048576 & i10) != 0 ? T : x1Var2, (2097152 & i10) != 0 ? U : bVar11, (4194304 & i10) != 0 ? null : bVar12, (8388608 & i10) != 0 ? V : bVar13, (16777216 & i10) != 0 ? null : list5, (33554432 & i10) != 0 ? null : list6, (67108864 & i10) != 0 ? W : z7Var, (134217728 & i10) != 0 ? null : r0Var, (268435456 & i10) != 0 ? null : a0Var, (536870912 & i10) != 0 ? null : a0Var2, (1073741824 & i10) != 0 ? null : list7, (i10 & Integer.MIN_VALUE) != 0 ? X : bVar14, (i11 & 1) != 0 ? null : o8Var, (i11 & 2) != 0 ? null : list8, (i11 & 4) != 0 ? Y : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.A;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f42711e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.H;
    }

    @Override // y9.g0
    public o d() {
        return this.f42707a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f42714h;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f42725s;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f42729w;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f42712f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f42721o;
    }

    @Override // y9.g0
    public String getId() {
        return this.f42722p;
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
        return this.f42727u;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.E;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f42731y;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f42708b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f42719m;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.f42732z;
    }

    @Override // y9.g0
    public o8 n() {
        return this.G;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f42709c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.C;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f42710d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f42720n;
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
