package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x6 implements u9.a, g0 {
    public static final e E = new e(null);
    public static final o F;
    public static final v9.b<Double> G;
    public static final k0 H;
    public static final l6.e I;
    public static final x1 J;
    public static final x1 K;
    public static final z7 L;
    public static final v9.b<b8> M;
    public static final v9.b<n8> N;
    public static final l6.d O;
    public static final h9.k<t> P;
    public static final h9.k<u> Q;
    public static final h9.k<b8> R;
    public static final h9.k<n8> S;
    public static final h9.m<Double> T;
    public static final h9.g<e0> U;
    public static final h9.m<Long> V;
    public static final h9.g<q1> W;
    public static final h9.g<z1> X;
    public static final h9.m<String> Y;
    public static final h9.m<Long> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.g<q> f44124a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.g<f> f44125b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.g<x7> f44126c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<c8> f44127d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.g<o8> f44128e0;
    public final v9.b<n8> A;
    public final o8 B;
    public final List<o8> C;
    public final l6 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f44129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f44130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f44131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f44132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e0> f44133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f44134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f44135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.b<String> f44136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<q1> f44137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f44138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<z1> f44139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n2 f44140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l6 f44141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f44142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x1 f44143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1 f44144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9.b<Long> f44145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<q> f44146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<f> f44147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<x7> f44148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z7 f44149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v9.b<b8> f44150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r0 f44151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a0 f44152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a0 f44153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<c8> f44154z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44155c = new a();

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
        public static final b f44156c = new b();

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
        public static final c f44157c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof b8);
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44158c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n8);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }

        public final x6 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = x6.F;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, x6.P);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, x6.Q);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = x6.T;
            v9.b<Double> bVar = x6.G;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            v9.b<Double> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, x6.U, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = x6.H;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = x6.V;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar2, mVar2, eVarA, cVar, kVar);
            v9.b<String> bVarP = h9.c.p(jSONObject, "default_state_id", eVarA, cVar, h9.l.f30999c);
            Objects.requireNonNull(q1.f42118a);
            List listW2 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, x6.W, eVarA, cVar);
            uc.l<?, ?> lVar3 = h9.c.f30973c;
            String str = (String) h9.c.m(jSONObject, "div_id", lVar3, h9.c.f30971a, eVarA);
            Objects.requireNonNull(z1.f44582c);
            List listW3 = h9.c.w(jSONObject, "extensions", z1.f44584e, x6.X, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar, eVarA, cVar);
            if (l6Var == null) {
                l6Var = x6.I;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar3, x6.Y, eVarA);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar2 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar2, eVarA, cVar);
            if (x1Var == null) {
                x1Var = x6.J;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar2, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = x6.K;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar2, x6.Z, eVarA, cVar, kVar);
            Objects.requireNonNull(q.f42091g);
            List listW4 = h9.c.w(jSONObject, "selected_actions", q.f42095k, x6.f44124a0, eVarA, cVar);
            Objects.requireNonNull(f.f44159f);
            List listL = h9.c.l(jSONObject, "states", f.f44161h, x6.f44125b0, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"states\",…S_VALIDATOR, logger, env)");
            Objects.requireNonNull(x7.f44168h);
            List listW5 = h9.c.w(jSONObject, "tooltips", x7.f44173m, x6.f44126c0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = x6.L;
            }
            z7 z7Var2 = z7Var;
            fd.j0.h(z7Var2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            Objects.requireNonNull(b8.Converter);
            uc.l lVar4 = b8.FROM_STRING;
            v9.b<b8> bVar3 = x6.M;
            v9.b<b8> bVarT = h9.c.t(jSONObject, "transition_animation_selector", lVar4, eVarA, cVar, bVar3, x6.R);
            v9.b<b8> bVar4 = bVarT == null ? bVar3 : bVarT;
            Objects.requireNonNull(r0.f42228a);
            r0 r0Var = (r0) h9.c.n(jSONObject, "transition_change", r0.f42229b, eVarA, cVar);
            Objects.requireNonNull(a0.f38966a);
            uc.p<u9.c, JSONObject, a0> pVar3 = a0.f38967b;
            a0 a0Var = (a0) h9.c.n(jSONObject, "transition_in", pVar3, eVarA, cVar);
            a0 a0Var2 = (a0) h9.c.n(jSONObject, "transition_out", pVar3, eVarA, cVar);
            Objects.requireNonNull(c8.Converter);
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, x6.f44127d0, eVarA, cVar);
            Objects.requireNonNull(n8.Converter);
            uc.l lVar5 = n8.FROM_STRING;
            v9.b<n8> bVar5 = x6.N;
            v9.b<n8> bVarT2 = h9.c.t(jSONObject, "visibility", lVar5, eVarA, cVar, bVar5, x6.S);
            v9.b<n8> bVar6 = bVarT2 == null ? bVar5 : bVarT2;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar4 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar4, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "visibility_actions", pVar4, x6.f44128e0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = x6.O;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new x6(oVar2, bVarS, bVarS2, bVar2, listW, k0Var2, bVarQ, bVarP, listW2, str, listW3, n2Var, l6Var2, str2, x1Var2, x1Var4, bVarQ2, listW4, listL, listW5, z7Var2, bVar4, r0Var, a0Var, a0Var2, listV, bVar6, o8Var, listW6, l6Var3);
        }
    }

    public static class f implements u9.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f44159f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.g<q> f44160g = r6.B;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, f> f44161h = a.f44167c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f44162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f44163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f44164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f44165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<q> f44166e;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, f> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f44167c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public f invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(f.f44159f);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(v.f43377h);
                uc.p<u9.c, JSONObject, v> pVar = v.f43387r;
                v vVar = (v) h9.c.n(jSONObject2, "animation_in", pVar, eVarA, cVar2);
                v vVar2 = (v) h9.c.n(jSONObject2, "animation_out", pVar, eVarA, cVar2);
                Objects.requireNonNull(k.f40973a);
                k kVar = (k) h9.c.n(jSONObject2, "div", k.f40974b, eVarA, cVar2);
                String str = (String) h9.c.c(jSONObject2, "state_id", h9.c.f30973c, h9.c.f30971a);
                Objects.requireNonNull(q.f42091g);
                return new f(vVar, vVar2, kVar, str, h9.c.w(jSONObject2, "swipe_out_actions", q.f42095k, f.f44160g, eVarA, cVar2));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(v vVar, v vVar2, k kVar, String str, List<? extends q> list) {
            fd.j0.i(str, "stateId");
            this.f44162a = vVar;
            this.f44163b = vVar2;
            this.f44164c = kVar;
            this.f44165d = str;
            this.f44166e = list;
        }

        public /* synthetic */ f(v vVar, v vVar2, k kVar, String str, List list, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : vVar, (i10 & 2) != 0 ? null : vVar2, (i10 & 4) != 0 ? null : kVar, str, (i10 & 16) != 0 ? null : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        v9.b bVar = null;
        vc.g gVar = null;
        F = new o(null, bVar, null, null, null, null, 63, gVar);
        v9.b.a aVar = v9.b.f36747a;
        G = aVar.a(Double.valueOf(1.0d));
        H = new k0(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, gVar);
        I = new l6.e(new q8(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        v9.b bVar2 = null;
        J = new x1(null, null, null, bVar2, null, 31, null);
        K = new x1(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        L = new z7(0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 7, null);
        M = aVar.a(b8.STATE_CHANGE);
        N = aVar.a(n8.VISIBLE);
        O = new l6.d(new i4(null, 1, 0 == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f44155c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        P = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar3 = b.f44156c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar3, "validator");
        Q = new h9.k.a.C0302a(objQ2, bVar3);
        Object objQ3 = kc.j.q(b8.values());
        c cVar = c.f44157c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        R = new h9.k.a.C0302a(objQ3, cVar);
        Object objQ4 = kc.j.q(n8.values());
        d dVar = d.f44158c;
        fd.j0.i(objQ4, "default");
        fd.j0.i(dVar, "validator");
        S = new h9.k.a.C0302a(objQ4, dVar);
        T = w6.f43786d;
        U = r6.f42348x;
        V = r6.f42349y;
        W = w6.f43787e;
        X = r6.f42350z;
        Y = r6.A;
        Z = p6.A;
        f44124a0 = r6.f42345u;
        f44125b0 = p6.B;
        f44126c0 = r6.f42346v;
        f44127d0 = p6.C;
        f44128e0 = r6.f42347w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x6(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, List<? extends e0> list, k0 k0Var, v9.b<Long> bVar4, v9.b<String> bVar5, List<? extends q1> list2, String str, List<? extends z1> list3, n2 n2Var, l6 l6Var, String str2, x1 x1Var, x1 x1Var2, v9.b<Long> bVar6, List<? extends q> list4, List<? extends f> list5, List<? extends x7> list6, z7 z7Var, v9.b<b8> bVar7, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list7, v9.b<n8> bVar8, o8 o8Var, List<? extends o8> list8, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(k0Var, "border");
        fd.j0.i(l6Var, "height");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(list5, "states");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(bVar7, "transitionAnimationSelector");
        fd.j0.i(bVar8, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f44129a = oVar;
        this.f44130b = bVar;
        this.f44131c = bVar2;
        this.f44132d = bVar3;
        this.f44133e = list;
        this.f44134f = k0Var;
        this.f44135g = bVar4;
        this.f44136h = bVar5;
        this.f44137i = list2;
        this.f44138j = str;
        this.f44139k = list3;
        this.f44140l = n2Var;
        this.f44141m = l6Var;
        this.f44142n = str2;
        this.f44143o = x1Var;
        this.f44144p = x1Var2;
        this.f44145q = bVar6;
        this.f44146r = list4;
        this.f44147s = list5;
        this.f44148t = list6;
        this.f44149u = z7Var;
        this.f44150v = bVar7;
        this.f44151w = r0Var;
        this.f44152x = a0Var;
        this.f44153y = a0Var2;
        this.f44154z = list7;
        this.A = bVar8;
        this.B = o8Var;
        this.C = list8;
        this.D = l6Var2;
    }

    public /* synthetic */ x6(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, List list, k0 k0Var, v9.b bVar4, v9.b bVar5, List list2, String str, List list3, n2 n2Var, l6 l6Var, String str2, x1 x1Var, x1 x1Var2, v9.b bVar6, List list4, List list5, List list6, z7 z7Var, v9.b bVar7, r0 r0Var, a0 a0Var, a0 a0Var2, List list7, v9.b bVar8, o8 o8Var, List list8, l6 l6Var2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? F : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? G : bVar3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? H : k0Var, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? null : bVar5, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? null : str, (i10 & 1024) != 0 ? null : list3, (i10 & 2048) != 0 ? null : n2Var, (i10 & 4096) != 0 ? I : l6Var, (i10 & 8192) != 0 ? null : str2, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? J : x1Var, (32768 & i10) != 0 ? K : x1Var2, (65536 & i10) != 0 ? null : bVar6, (131072 & i10) != 0 ? null : list4, list5, (524288 & i10) != 0 ? null : list6, (1048576 & i10) != 0 ? L : z7Var, (2097152 & i10) != 0 ? M : bVar7, (4194304 & i10) != 0 ? null : r0Var, (8388608 & i10) != 0 ? null : a0Var, (16777216 & i10) != 0 ? null : a0Var2, (33554432 & i10) != 0 ? null : list7, (67108864 & i10) != 0 ? N : bVar8, (134217728 & i10) != 0 ? null : o8Var, (268435456 & i10) != 0 ? null : list8, (i10 & 536870912) != 0 ? O : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.f44149u;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f44133e;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.C;
    }

    @Override // y9.g0
    public o d() {
        return this.f44129a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f44135g;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f44143o;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f44145q;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f44134f;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f44141m;
    }

    @Override // y9.g0
    public String getId() {
        return this.f44142n;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.A;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.D;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f44144p;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.f44154z;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f44146r;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f44130b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f44139k;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.f44148t;
    }

    @Override // y9.g0
    public o8 n() {
        return this.B;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f44131c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.f44152x;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f44132d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f44140l;
    }

    @Override // y9.g0
    public a0 s() {
        return this.f44153y;
    }

    @Override // y9.g0
    public r0 t() {
        return this.f44151w;
    }
}
