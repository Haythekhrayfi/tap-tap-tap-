package y9;

import ch.qos.logback.core.util.FileUtil;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d6 implements u9.a, g0 {
    public static final d G = new d(null);
    public static final o H;
    public static final v I;
    public static final v9.b<Double> J;
    public static final k0 K;
    public static final e L;
    public static final l6.e M;
    public static final x1 N;
    public static final x1 O;
    public static final z7 P;
    public static final v9.b<n8> Q;
    public static final l6.d R;
    public static final h9.k<t> S;
    public static final h9.k<u> T;
    public static final h9.k<n8> U;
    public static final h9.g<q> V;
    public static final h9.m<Double> W;
    public static final h9.g<e0> X;
    public static final h9.m<Long> Y;
    public static final h9.g<q1> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.g<q> f39645a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.g<z1> f39646b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.m<String> f39647c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<q> f39648d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Long> f39649e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<q> f39650f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.g<x7> f39651g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<c8> f39652h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<o8> f39653i0;
    public final a0 A;
    public final List<c8> B;
    public final v9.b<n8> C;
    public final o8 D;
    public final List<o8> E;
    public final l6 F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f39655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f39656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f39657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<t> f39658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<u> f39659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f39660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e0> f39661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f39662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v9.b<Long> f39663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f39664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<q1> f39665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<q> f39666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<z1> f39667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n2 f39668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l6 f39669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f39670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<q> f39671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x1 f39672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x1 f39673t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v9.b<Long> f39674u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<q> f39675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<x7> f39676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z7 f39677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r0 f39678y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a0 f39679z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39680c = new a();

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
        public static final b f39681c = new b();

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
        public static final c f39682c = new c();

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

        public final d6 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = d6.H;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(q.f42091g);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            q qVar = (q) h9.c.n(jSONObject, "action", pVar, eVarA, cVar);
            Objects.requireNonNull(v.f43377h);
            v vVar = (v) h9.c.n(jSONObject, "action_animation", v.f43387r, eVarA, cVar);
            if (vVar == null) {
                vVar = d6.I;
            }
            v vVar2 = vVar;
            fd.j0.h(vVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List listW = h9.c.w(jSONObject, "actions", pVar, d6.V, eVarA, cVar);
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, d6.S);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, d6.T);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = d6.W;
            v9.b<Double> bVar = d6.J;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW2 = h9.c.w(jSONObject, "background", e0.f39727b, d6.X, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = d6.K;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = d6.Y;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            Objects.requireNonNull(e.f39683c);
            e eVar = (e) h9.c.n(jSONObject, "delimiter_style", e.f39687g, eVarA, cVar);
            if (eVar == null) {
                eVar = d6.L;
            }
            e eVar2 = eVar;
            fd.j0.h(eVar2, "JsonParser.readOptional(…MITER_STYLE_DEFAULT_VALUE");
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, d6.Z, eVarA, cVar);
            List listW4 = h9.c.w(jSONObject, "doubletap_actions", pVar, d6.f39645a0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, d6.f39646b0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = d6.M;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, d6.f39647c0, eVarA);
            List listW6 = h9.c.w(jSONObject, "longtap_actions", pVar, d6.f39648d0, eVarA, cVar);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = d6.N;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = d6.O;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, d6.f39649e0, eVarA, cVar, kVar);
            List listW7 = h9.c.w(jSONObject, "selected_actions", pVar, d6.f39650f0, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW8 = h9.c.w(jSONObject, "tooltips", x7.f44173m, d6.f39651g0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = d6.P;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, d6.f39652h0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar3 = n8.FROM_STRING;
            v9.b<n8> bVar2 = d6.Q;
            v9.b<n8> bVarT = h9.c.t(jSONObject, "visibility", lVar3, eVarA, cVar, bVar2, d6.U);
            v9.b<n8> bVar3 = bVarT == null ? bVar2 : bVarT;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW9 = h9.c.w(jSONObject, "visibility_actions", pVar5, d6.f39653i0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = d6.R;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new d6(oVar2, qVar, vVar2, listW, bVarS, bVarS2, bVar, listW2, k0Var2, bVarQ, eVar2, listW3, listW4, listW5, n2Var, l6Var2, str, listW6, x1Var2, x1Var4, bVarQ2, listW7, listW8, z7Var2, r0Var, a0Var, a0Var2, listV, bVar3, o8Var, listW9, l6Var3);
        }
    }

    public static class e implements u9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39683c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v9.b<Integer> f39684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final v9.b<d> f39685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.k<d> f39686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, e> f39687g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<Integer> f39688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<d> f39689b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f39690c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public e invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(e.f39683c);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                uc.l<Object, Integer> lVar = h9.h.f30978a;
                v9.b<Integer> bVar = e.f39684d;
                v9.b<Integer> bVarT = h9.c.t(jSONObject2, "color", lVar, eVarA, cVar2, bVar, h9.l.f31002f);
                if (bVarT != null) {
                    bVar = bVarT;
                }
                Objects.requireNonNull(d.Converter);
                uc.l lVar2 = d.FROM_STRING;
                v9.b<d> bVar2 = e.f39685e;
                v9.b<d> bVarT2 = h9.c.t(jSONObject2, "orientation", lVar2, eVarA, cVar2, bVar2, e.f39686f);
                if (bVarT2 != null) {
                    bVar2 = bVarT2;
                }
                return new e(bVar, bVar2);
            }
        }

        public static final class b extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f39691c = new b();

            public b() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof d);
            }
        }

        public static final class c {
            public c() {
            }

            public c(vc.g gVar) {
            }
        }

        public enum d {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");

            public static final b Converter = new b(null);
            private static final uc.l<String, d> FROM_STRING = a.f39692c;
            private final String value;

            public static final class a extends vc.l implements uc.l<String, d> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final a f39692c = new a();

                public a() {
                    super(1);
                }

                @Override // uc.l
                public d invoke(String str) {
                    String str2 = str;
                    fd.j0.i(str2, "string");
                    d dVar = d.VERTICAL;
                    if (fd.j0.d(str2, dVar.value)) {
                        return dVar;
                    }
                    d dVar2 = d.HORIZONTAL;
                    if (fd.j0.d(str2, dVar2.value)) {
                        return dVar2;
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

            d(String str) {
                this.value = str;
            }
        }

        static {
            v9.b.a aVar = v9.b.f36747a;
            f39684d = aVar.a(335544320);
            f39685e = aVar.a(d.HORIZONTAL);
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(d.values());
            b bVar = b.f39691c;
            fd.j0.i(objQ, "default");
            fd.j0.i(bVar, "validator");
            f39686f = new h9.k.a.C0302a(objQ, bVar);
            f39687g = a.f39690c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public e(v9.b<Integer> bVar, v9.b<d> bVar2) {
            fd.j0.i(bVar, "color");
            fd.j0.i(bVar2, "orientation");
            this.f39688a = bVar;
            this.f39689b = bVar2;
        }

        public /* synthetic */ e(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? f39684d : bVar, (i10 & 2) != 0 ? f39685e : bVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        vc.g gVar = null;
        H = new o(null, null, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        v9.b bVarA = aVar.a(100L);
        v9.b bVarA2 = aVar.a(Double.valueOf(0.6d));
        v9.b bVarA3 = aVar.a(v.e.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        v9.b bVar = null;
        I = new v(bVarA, bVarA2, bVar, null, bVarA3, null, null, aVar.a(dValueOf), 108, null);
        J = aVar.a(dValueOf);
        v9.b bVar2 = null;
        K = new k0(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 31, gVar);
        L = new e(null, null == true ? 1 : 0, 3, null == true ? 1 : 0);
        M = new l6.e(new q8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        N = new x1(null, null, null, bVar, null == true ? 1 : 0, 31, null == true ? 1 : 0);
        O = new x1(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null);
        P = new z7(null == true ? 1 : 0, null == true ? 1 : 0, bVar, 7, null);
        Q = aVar.a(n8.VISIBLE);
        R = new l6.d(new i4(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f39680c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        S = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar3 = b.f39681c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar3, "validator");
        T = new h9.k.a.C0302a(objQ2, bVar3);
        Object objQ3 = kc.j.q(n8.values());
        c cVar = c.f39682c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        U = new h9.k.a.C0302a(objQ3, cVar);
        V = a6.f39068e;
        W = a6.f39073j;
        X = y5.f44515z;
        Y = y5.A;
        Z = a6.f39074k;
        f39645a0 = c6.f39513d;
        f39646b0 = a6.f39075l;
        f39647c0 = y5.f44512w;
        f39648d0 = a6.f39069f;
        f39649e0 = a6.f39070g;
        f39650f0 = y5.f44513x;
        f39651g0 = a6.f39071h;
        f39652h0 = y5.f44514y;
        f39653i0 = a6.f39072i;
    }

    public d6() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d6(o oVar, q qVar, v vVar, List<? extends q> list, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list2, k0 k0Var, v9.b<Long> bVar4, e eVar, List<? extends q1> list3, List<? extends q> list4, List<? extends z1> list5, n2 n2Var, l6 l6Var, String str, List<? extends q> list6, x1 x1Var, x1 x1Var2, v9.b<Long> bVar5, List<? extends q> list7, List<? extends x7> list8, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list9, v9.b<n8> bVar6, o8 o8Var, List<? extends o8> list10, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(vVar, "actionAnimation");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(eVar, "delimiterStyle");
        fd.j0.i(l6Var, "height");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar6, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f39654a = oVar;
        this.f39655b = qVar;
        this.f39656c = vVar;
        this.f39657d = list;
        this.f39658e = bVar;
        this.f39659f = bVar2;
        this.f39660g = bVar3;
        this.f39661h = list2;
        this.f39662i = k0Var;
        this.f39663j = bVar4;
        this.f39664k = eVar;
        this.f39665l = list3;
        this.f39666m = list4;
        this.f39667n = list5;
        this.f39668o = n2Var;
        this.f39669p = l6Var;
        this.f39670q = str;
        this.f39671r = list6;
        this.f39672s = x1Var;
        this.f39673t = x1Var2;
        this.f39674u = bVar5;
        this.f39675v = list7;
        this.f39676w = list8;
        this.f39677x = z7Var;
        this.f39678y = r0Var;
        this.f39679z = a0Var;
        this.A = a0Var2;
        this.B = list9;
        this.C = bVar6;
        this.D = o8Var;
        this.E = list10;
        this.F = l6Var2;
    }

    public /* synthetic */ d6(o oVar, q qVar, v vVar, List list, v9.b bVar, v9.b bVar2, v9.b bVar3, List list2, k0 k0Var, v9.b bVar4, e eVar, List list3, List list4, List list5, n2 n2Var, l6 l6Var, String str, List list6, x1 x1Var, x1 x1Var2, v9.b bVar5, List list7, List list8, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list9, v9.b bVar6, o8 o8Var, List list10, l6 l6Var2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? H : oVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? I : vVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? J : bVar3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? K : k0Var, (i10 & 512) != 0 ? null : bVar4, (i10 & 1024) != 0 ? L : eVar, (i10 & 2048) != 0 ? null : list3, (i10 & 4096) != 0 ? null : list4, (i10 & 8192) != 0 ? null : list5, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : n2Var, (i10 & FileUtil.BUF_SIZE) != 0 ? M : l6Var, (i10 & 65536) != 0 ? null : str, (i10 & 131072) != 0 ? null : list6, (i10 & 262144) != 0 ? N : x1Var, (i10 & 524288) != 0 ? O : x1Var2, (i10 & 1048576) != 0 ? null : bVar5, (i10 & 2097152) != 0 ? null : list7, (i10 & 4194304) != 0 ? null : list8, (i10 & 8388608) != 0 ? P : z7Var, (i10 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : r0Var, (i10 & 33554432) != 0 ? null : a0Var, (i10 & 67108864) != 0 ? null : a0Var2, (i10 & 134217728) != 0 ? null : list9, (i10 & 268435456) != 0 ? Q : bVar6, (i10 & 536870912) != 0 ? null : o8Var, (i10 & 1073741824) != 0 ? null : list10, (i10 & Integer.MIN_VALUE) != 0 ? R : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.f39677x;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f39661h;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.E;
    }

    @Override // y9.g0
    public o d() {
        return this.f39654a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f39663j;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f39672s;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f39674u;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f39662i;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f39669p;
    }

    @Override // y9.g0
    public String getId() {
        return this.f39670q;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.C;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.F;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f39673t;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.B;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f39675v;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f39658e;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f39667n;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.f39676w;
    }

    @Override // y9.g0
    public o8 n() {
        return this.D;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f39659f;
    }

    @Override // y9.g0
    public a0 p() {
        return this.f39679z;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f39660g;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f39668o;
    }

    @Override // y9.g0
    public a0 s() {
        return this.A;
    }

    @Override // y9.g0
    public r0 t() {
        return this.f39678y;
    }
}
