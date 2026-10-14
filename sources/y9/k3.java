package y9;

import ch.qos.logback.core.util.FileUtil;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k3 implements u9.a, g0 {
    public static final f M = new f(null);
    public static final o N;
    public static final v9.b<Integer> O;
    public static final v9.b<Double> P;
    public static final v9.b<Double> Q;
    public static final v9.b<a> R;
    public static final k0 S;
    public static final l6.e T;
    public static final v9.b<Integer> U;
    public static final x1 V;
    public static final v9.b<Double> W;
    public static final x1 X;
    public static final h6.d Y;
    public static final l2 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final z7 f41044a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final v9.b<n8> f41045b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final l6.d f41046c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.k<t> f41047d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.k<u> f41048e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.k<a> f41049f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.k<n8> f41050g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.m<Double> f41051h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.m<Double> f41052i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<e0> f41053j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<Long> f41054k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<q1> f41055l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.g<z1> f41056m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.m<String> f41057n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Double> f41058o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.m<Long> f41059p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<q> f41060q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<x7> f41061r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<c8> f41062s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<o8> f41063t0;
    public final h6 A;
    public final l2 B;
    public final List<x7> C;
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
    public final o f41064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Integer> f41065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Double> f41066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t5 f41067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f41068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f41069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f41070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.b<a> f41071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<e0> f41072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f41073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.b<Long> f41074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<q1> f41075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<z1> f41076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n2 f41077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l6 f41078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f41079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<Integer> f41080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t5 f41081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t5 f41082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l3 f41083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x1 f41084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v9.b<Double> f41085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f41086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f41087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b<Long> f41088y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<q> f41089z;

    public enum a {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");

        public static final b Converter = new b(null);
        private static final uc.l<String, a> FROM_STRING = C0476a.f41090c;
        private final String value;

        /* JADX INFO: renamed from: y9.k3$a$a, reason: collision with other inner class name */
        public static final class C0476a extends vc.l implements uc.l<String, a> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0476a f41090c = new C0476a();

            public C0476a() {
                super(1);
            }

            @Override // uc.l
            public a invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                a aVar = a.SCALE;
                if (fd.j0.d(str2, aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.WORM;
                if (fd.j0.d(str2, aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.SLIDER;
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

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41091c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t);
        }
    }

    public static final class c extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41092c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof u);
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41093c = new d();

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
        public static final e f41094c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class f {
        public f() {
        }

        public f(vc.g gVar) {
        }

        public final k3 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = k3.N;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            uc.l<Object, Integer> lVar = h9.h.f30978a;
            v9.b<Integer> bVar = k3.O;
            h9.k<Integer> kVar = h9.l.f31002f;
            v9.b<Integer> bVarT = h9.c.t(jSONObject, "active_item_color", lVar, eVarA, cVar, bVar, kVar);
            if (bVarT != null) {
                bVar = bVarT;
            }
            uc.l<Number, Double> lVar2 = h9.h.f30981d;
            h9.m<Double> mVar = k3.f41051h0;
            v9.b<Double> bVar2 = k3.P;
            h9.k<Double> kVar2 = h9.l.f31000d;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "active_item_size", lVar2, mVar, eVarA, bVar2, kVar2);
            if (bVarR != null) {
                bVar2 = bVarR;
            }
            Objects.requireNonNull(t5.f42752f);
            uc.p<u9.c, JSONObject, t5> pVar = t5.f42756j;
            t5 t5Var = (t5) h9.c.n(jSONObject, "active_shape", pVar, eVarA, cVar);
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, k3.f41047d0);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, k3.f41048e0);
            h9.m<Double> mVar2 = k3.f41052i0;
            v9.b<Double> bVar3 = k3.Q;
            v9.b<Double> bVar4 = bVar2;
            v9.b<Double> bVarR2 = h9.c.r(jSONObject, "alpha", lVar2, mVar2, eVarA, bVar3, kVar2);
            if (bVarR2 != null) {
                bVar3 = bVarR2;
            }
            Objects.requireNonNull(a.Converter);
            uc.l lVar3 = a.FROM_STRING;
            v9.b<a> bVar5 = k3.R;
            v9.b<a> bVarT2 = h9.c.t(jSONObject, "animation", lVar3, eVarA, cVar, bVar5, k3.f41049f0);
            if (bVarT2 != null) {
                bVar5 = bVarT2;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, k3.f41053j0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = k3.S;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar4 = h9.h.f30982e;
            h9.m<Long> mVar3 = k3.f41054k0;
            h9.k<Long> kVar3 = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar4, mVar3, eVarA, cVar, kVar3);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, k3.f41055l0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, k3.f41056m0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = k3.T;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            h9.m<String> mVar4 = k3.f41057n0;
            uc.l<?, ?> lVar5 = h9.c.f30973c;
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar5, mVar4, eVarA);
            v9.b<Integer> bVar6 = k3.U;
            v9.b<Integer> bVar7 = bVar;
            v9.b<Integer> bVarT3 = h9.c.t(jSONObject, "inactive_item_color", lVar, eVarA, cVar, bVar6, kVar);
            if (bVarT3 != null) {
                bVar6 = bVarT3;
            }
            t5 t5Var2 = (t5) h9.c.n(jSONObject, "inactive_minimum_shape", pVar, eVarA, cVar);
            t5 t5Var3 = (t5) h9.c.n(jSONObject, "inactive_shape", pVar, eVarA, cVar);
            Objects.requireNonNull(l3.f41219a);
            l3 l3Var = (l3) h9.c.n(jSONObject, "items_placement", l3.f41220b, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = k3.V;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            h9.m<Double> mVar5 = k3.f41058o0;
            v9.b<Double> bVar8 = k3.W;
            v9.b<Double> bVarR3 = h9.c.r(jSONObject, "minimum_item_size", lVar2, mVar5, eVarA, bVar8, kVar2);
            if (bVarR3 != null) {
                bVar8 = bVarR3;
            }
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = k3.X;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            String str2 = (String) h9.c.m(jSONObject, "pager_id", lVar5, h9.c.f30971a, eVarA);
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar4, k3.f41059p0, eVarA, cVar, kVar3);
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, k3.f41060q0, eVarA, cVar);
            Objects.requireNonNull(h6.f40289a);
            h6 h6Var = (h6) h9.c.n(jSONObject, "shape", h6.f40290b, eVarA, cVar);
            if (h6Var == null) {
                h6Var = k3.Y;
            }
            h6 h6Var2 = h6Var;
            fd.j0.h(h6Var2, "JsonParser.readOptional(…v) ?: SHAPE_DEFAULT_VALUE");
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject, "space_between_centers", l2.f41214g, eVarA, cVar);
            if (l2Var == null) {
                l2Var = k3.Z;
            }
            l2 l2Var2 = l2Var;
            fd.j0.h(l2Var2, "JsonParser.readOptional(…EEN_CENTERS_DEFAULT_VALUE");
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, k3.f41061r0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = k3.f41044a0;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, k3.f41062s0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar6 = n8.FROM_STRING;
            v9.b<n8> bVar9 = k3.f41045b0;
            v9.b<n8> bVarT4 = h9.c.t(jSONObject, "visibility", lVar6, eVarA, cVar, bVar9, k3.f41050g0);
            v9.b<n8> bVar10 = bVarT4 == null ? bVar9 : bVarT4;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "visibility_actions", pVar5, k3.f41063t0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = k3.f41046c0;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new k3(oVar2, bVar7, bVar4, t5Var, bVarS, bVarS2, bVar3, bVar5, listW, k0Var2, bVarQ, listW2, listW3, n2Var, l6Var2, str, bVar6, t5Var2, t5Var3, l3Var, x1Var2, bVar8, x1Var4, str2, bVarQ2, listW4, h6Var2, l2Var2, listW5, z7Var2, r0Var, a0Var, a0Var2, listV, bVar10, o8Var, listW6, l6Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        v9.b bVar = null;
        vc.g gVar = null;
        N = new o(null, bVar, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        O = aVar.a(16768096);
        P = aVar.a(Double.valueOf(1.3d));
        Q = aVar.a(Double.valueOf(1.0d));
        R = aVar.a(a.SCALE);
        S = new k0(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        T = new l6.e(new q8(bVar, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        U = aVar.a(865180853);
        int i10 = 31;
        V = new x1(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, i10, gVar);
        W = aVar.a(Double.valueOf(0.5d));
        X = new x1(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i10, gVar);
        Y = new h6.d(new t5(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i10, gVar));
        int i11 = 1;
        Z = new l2(null, aVar.a(15L), i11, null == true ? 1 : 0);
        f41044a0 = new z7(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, gVar);
        f41045b0 = aVar.a(n8.VISIBLE);
        f41046c0 = new l6.d(new i4(null == true ? 1 : 0, i11, null == true ? 1 : 0));
        int i12 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        b bVar2 = b.f41091c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar2, "validator");
        f41047d0 = new h9.k.a.C0302a(objQ, bVar2);
        Object objQ2 = kc.j.q(u.values());
        c cVar = c.f41092c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(cVar, "validator");
        f41048e0 = new h9.k.a.C0302a(objQ2, cVar);
        Object objQ3 = kc.j.q(a.values());
        d dVar = d.f41093c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(dVar, "validator");
        f41049f0 = new h9.k.a.C0302a(objQ3, dVar);
        Object objQ4 = kc.j.q(n8.values());
        e eVar = e.f41094c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(eVar, "validator");
        f41050g0 = new h9.k.a.C0302a(objQ4, eVar);
        f41051h0 = i3.f40590n;
        f41052i0 = i3.f40591o;
        f41053j0 = f3.f39955z;
        f41054k0 = f3.A;
        f41055l0 = i3.f40592p;
        f41056m0 = f3.B;
        f41057n0 = f3.f39950u;
        f41058o0 = f3.f39951v;
        f41059p0 = f3.f39952w;
        f41060q0 = i3.f40588l;
        f41061r0 = f3.f39953x;
        f41062s0 = i3.f40589m;
        f41063t0 = f3.f39954y;
    }

    public k3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k3(o oVar, v9.b<Integer> bVar, v9.b<Double> bVar2, t5 t5Var, v9.b<t> bVar3, v9.b<u> bVar4, v9.b<Double> bVar5, v9.b<a> bVar6, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar7, List<? extends q1> list2, List<? extends z1> list3, n2 n2Var, l6 l6Var, String str, v9.b<Integer> bVar8, t5 t5Var2, t5 t5Var3, l3 l3Var, x1 x1Var, v9.b<Double> bVar9, x1 x1Var2, String str2, v9.b<Long> bVar10, List<? extends q> list4, h6 h6Var, l2 l2Var, List<? extends x7> list5, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list6, v9.b<n8> bVar11, o8 o8Var, List<? extends o8> list7, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar, "activeItemColor");
        fd.j0.i(bVar2, "activeItemSize");
        fd.j0.i(bVar5, "alpha");
        fd.j0.i(bVar6, "animation");
        fd.j0.i(k0Var, "border");
        fd.j0.i(l6Var, "height");
        fd.j0.i(bVar8, "inactiveItemColor");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(bVar9, "minimumItemSize");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(h6Var, "shape");
        fd.j0.i(l2Var, "spaceBetweenCenters");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar11, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f41064a = oVar;
        this.f41065b = bVar;
        this.f41066c = bVar2;
        this.f41067d = t5Var;
        this.f41068e = bVar3;
        this.f41069f = bVar4;
        this.f41070g = bVar5;
        this.f41071h = bVar6;
        this.f41072i = list;
        this.f41073j = k0Var;
        this.f41074k = bVar7;
        this.f41075l = list2;
        this.f41076m = list3;
        this.f41077n = n2Var;
        this.f41078o = l6Var;
        this.f41079p = str;
        this.f41080q = bVar8;
        this.f41081r = t5Var2;
        this.f41082s = t5Var3;
        this.f41083t = l3Var;
        this.f41084u = x1Var;
        this.f41085v = bVar9;
        this.f41086w = x1Var2;
        this.f41087x = str2;
        this.f41088y = bVar10;
        this.f41089z = list4;
        this.A = h6Var;
        this.B = l2Var;
        this.C = list5;
        this.D = z7Var;
        this.E = r0Var;
        this.F = a0Var;
        this.G = a0Var2;
        this.H = list6;
        this.I = bVar11;
        this.J = o8Var;
        this.K = list7;
        this.L = l6Var2;
    }

    public /* synthetic */ k3(o oVar, v9.b bVar, v9.b bVar2, t5 t5Var, v9.b bVar3, v9.b bVar4, v9.b bVar5, v9.b bVar6, List list, k0 k0Var, v9.b bVar7, List list2, List list3, n2 n2Var, l6 l6Var, String str, v9.b bVar8, t5 t5Var2, t5 t5Var3, l3 l3Var, x1 x1Var, v9.b bVar9, x1 x1Var2, String str2, v9.b bVar10, List list4, h6 h6Var, l2 l2Var, List list5, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list6, v9.b bVar11, o8 o8Var, List list7, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? N : oVar, (i10 & 2) != 0 ? O : bVar, (i10 & 4) != 0 ? P : bVar2, (i10 & 8) != 0 ? null : t5Var, (i10 & 16) != 0 ? null : bVar3, (i10 & 32) != 0 ? null : bVar4, (i10 & 64) != 0 ? Q : bVar5, (i10 & 128) != 0 ? R : bVar6, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? S : k0Var, (i10 & 1024) != 0 ? null : bVar7, (i10 & 2048) != 0 ? null : list2, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : n2Var, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? T : l6Var, (i10 & FileUtil.BUF_SIZE) != 0 ? null : str, (i10 & 65536) != 0 ? U : bVar8, (i10 & 131072) != 0 ? null : t5Var2, (i10 & 262144) != 0 ? null : t5Var3, (i10 & 524288) != 0 ? null : l3Var, (i10 & 1048576) != 0 ? V : x1Var, (i10 & 2097152) != 0 ? W : bVar9, (i10 & 4194304) != 0 ? X : x1Var2, (i10 & 8388608) != 0 ? null : str2, (i10 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bVar10, (i10 & 33554432) != 0 ? null : list4, (i10 & 67108864) != 0 ? Y : h6Var, (i10 & 134217728) != 0 ? Z : l2Var, (i10 & 268435456) != 0 ? null : list5, (i10 & 536870912) != 0 ? f41044a0 : z7Var, (i10 & 1073741824) != 0 ? null : r0Var, (i10 & Integer.MIN_VALUE) != 0 ? null : a0Var, (i11 & 1) != 0 ? null : a0Var2, (i11 & 2) != 0 ? null : list6, (i11 & 4) != 0 ? f41045b0 : bVar11, (i11 & 8) != 0 ? null : o8Var, (i11 & 16) != 0 ? null : list7, (i11 & 32) != 0 ? f41046c0 : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.D;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f41072i;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.K;
    }

    @Override // y9.g0
    public o d() {
        return this.f41064a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f41074k;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f41084u;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f41088y;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f41073j;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f41078o;
    }

    @Override // y9.g0
    public String getId() {
        return this.f41079p;
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
        return this.f41086w;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.H;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f41089z;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f41068e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f41076m;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.C;
    }

    @Override // y9.g0
    public o8 n() {
        return this.J;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f41069f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.F;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f41070g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f41077n;
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
