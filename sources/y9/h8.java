package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h8 implements u9.a, g0 {
    public static final d L = new d(null);
    public static final o M = new o(null, null, null, null, null, null, 63, null);
    public static final v9.b<Double> N;
    public static final v9.b<Boolean> O;
    public static final k0 P;
    public static final l6.e Q;
    public static final x1 R;
    public static final v9.b<Boolean> S;
    public static final x1 T;
    public static final v9.b<Boolean> U;
    public static final z7 V;
    public static final v9.b<n8> W;
    public static final l6.d X;
    public static final h9.k<t> Y;
    public static final h9.k<u> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h9.k<n8> f40479a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h9.m<Double> f40480b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h9.g<e0> f40481c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h9.g<q> f40482d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h9.m<Long> f40483e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h9.g<q1> f40484f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h9.m<String> f40485g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h9.g<q> f40486h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h9.g<z1> f40487i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h9.g<q> f40488j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h9.m<String> f40489k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h9.g<q> f40490l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h9.m<String> f40491m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h9.g<q> f40492n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h9.m<Long> f40493o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9.g<q> f40494p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h9.g<x7> f40495q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h9.g<c8> f40496r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h9.g<i8> f40497s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h9.g<o8> f40498t0;
    public final List<x7> A;
    public final z7 B;
    public final r0 C;
    public final a0 D;
    public final a0 E;
    public final List<c8> F;
    public final List<i8> G;
    public final v9.b<n8> H;
    public final o8 I;
    public final List<o8> J;
    public final l6 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f40500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f40501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f40502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Boolean> f40503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e0> f40504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f40505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<q> f40506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v9.b<Long> f40507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<q1> f40508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f40509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<q> f40510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<z1> f40511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<q> f40512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n2 f40513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l6 f40514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f40515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x1 f40516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v9.b<Boolean> f40517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x1 f40518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<q> f40519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final JSONObject f40520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v9.b<Boolean> f40521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<q> f40522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b<Long> f40523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<q> f40524z;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40525c = new a();

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
        public static final b f40526c = new b();

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
        public static final c f40527c = new c();

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

        public final h8 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(o.f41700f);
            o oVar = (o) h9.c.n(jSONObject, "accessibility", o.f41707m, eVarA, cVar);
            if (oVar == null) {
                oVar = h8.M;
            }
            o oVar2 = oVar;
            fd.j0.h(oVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Objects.requireNonNull(t.Converter);
            v9.b bVarS = h9.c.s(jSONObject, "alignment_horizontal", t.FROM_STRING, eVarA, cVar, h8.Y);
            Objects.requireNonNull(u.Converter);
            v9.b bVarS2 = h9.c.s(jSONObject, "alignment_vertical", u.FROM_STRING, eVarA, cVar, h8.Z);
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = h8.f40480b0;
            v9.b<Double> bVar = h8.N;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            v9.b<Double> bVar2 = bVarR == null ? bVar : bVarR;
            uc.l<Object, Boolean> lVar2 = h9.h.f30980c;
            v9.b<Boolean> bVar3 = h8.O;
            h9.k<Boolean> kVar = h9.l.f30997a;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject, "autostart", lVar2, eVarA, cVar, bVar3, kVar);
            if (bVarT != null) {
                bVar3 = bVarT;
            }
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject, "background", e0.f39727b, h8.f40481c0, eVarA, cVar);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject, "border", k0.f40995i, eVarA, cVar);
            if (k0Var == null) {
                k0Var = h8.P;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Objects.requireNonNull(q.f42091g);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            List listW2 = h9.c.w(jSONObject, "buffering_actions", pVar, h8.f40482d0, eVarA, cVar);
            uc.l<Number, Long> lVar3 = h9.h.f30982e;
            h9.m<Long> mVar2 = h8.f40483e0;
            h9.k<Long> kVar2 = h9.l.f30998b;
            v9.b bVarQ = h9.c.q(jSONObject, "column_span", lVar3, mVar2, eVarA, cVar, kVar2);
            Objects.requireNonNull(q1.f42118a);
            List listW3 = h9.c.w(jSONObject, "disappear_actions", q1.f42126i, h8.f40484f0, eVarA, cVar);
            h9.m<String> mVar3 = h8.f40485g0;
            uc.l<?, ?> lVar4 = h9.c.f30973c;
            String str = (String) h9.c.m(jSONObject, "elapsed_time_variable", lVar4, mVar3, eVarA);
            List listW4 = h9.c.w(jSONObject, "end_actions", pVar, h8.f40486h0, eVarA, cVar);
            Objects.requireNonNull(z1.f44582c);
            List listW5 = h9.c.w(jSONObject, "extensions", z1.f44584e, h8.f40487i0, eVarA, cVar);
            List listW6 = h9.c.w(jSONObject, "fatal_actions", pVar, h8.f40488j0, eVarA, cVar);
            Objects.requireNonNull(n2.f41632f);
            n2 n2Var = (n2) h9.c.n(jSONObject, "focus", n2.f41637k, eVarA, cVar);
            Objects.requireNonNull(l6.f41236a);
            uc.p<u9.c, JSONObject, l6> pVar2 = l6.f41237b;
            l6 l6Var = (l6) h9.c.n(jSONObject, "height", pVar2, eVarA, cVar);
            if (l6Var == null) {
                l6Var = h8.Q;
            }
            l6 l6Var2 = l6Var;
            fd.j0.h(l6Var2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) h9.c.m(jSONObject, FacebookMediationAdapter.KEY_ID, lVar4, h8.f40489k0, eVarA);
            Objects.requireNonNull(x1.f44020f);
            uc.p<u9.c, JSONObject, x1> pVar3 = x1.f44031q;
            x1 x1Var = (x1) h9.c.n(jSONObject, "margins", pVar3, eVarA, cVar);
            if (x1Var == null) {
                x1Var = h8.R;
            }
            x1 x1Var2 = x1Var;
            fd.j0.h(x1Var2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            v9.b<Boolean> bVar4 = h8.S;
            v9.b<Boolean> bVar5 = bVar3;
            v9.b<Double> bVar6 = bVar2;
            v9.b<Boolean> bVarT2 = h9.c.t(jSONObject, "muted", lVar2, eVarA, cVar, bVar4, kVar);
            if (bVarT2 != null) {
                bVar4 = bVarT2;
            }
            x1 x1Var3 = (x1) h9.c.n(jSONObject, "paddings", pVar3, eVarA, cVar);
            if (x1Var3 == null) {
                x1Var3 = h8.T;
            }
            x1 x1Var4 = x1Var3;
            fd.j0.h(x1Var4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            List listW7 = h9.c.w(jSONObject, "pause_actions", pVar, h8.f40490l0, eVarA, cVar);
            JSONObject jSONObject2 = (JSONObject) h9.c.m(jSONObject, "player_settings_payload", lVar4, h9.c.f30971a, eVarA);
            v9.b bVarO = h9.c.o(jSONObject, "preview", h8.f40491m0, eVarA, cVar, h9.l.f30999c);
            v9.b<Boolean> bVar7 = h8.U;
            v9.b<Boolean> bVarT3 = h9.c.t(jSONObject, "repeatable", lVar2, eVarA, cVar, bVar7, kVar);
            v9.b<Boolean> bVar8 = bVarT3 == null ? bVar7 : bVarT3;
            List listW8 = h9.c.w(jSONObject, "resume_actions", pVar, h8.f40492n0, eVarA, cVar);
            v9.b bVarQ2 = h9.c.q(jSONObject, "row_span", lVar3, h8.f40493o0, eVarA, cVar, kVar2);
            List listW9 = h9.c.w(jSONObject, "selected_actions", pVar, h8.f40494p0, eVarA, cVar);
            Objects.requireNonNull(x7.f44168h);
            List listW10 = h9.c.w(jSONObject, "tooltips", x7.f44173m, h8.f40495q0, eVarA, cVar);
            Objects.requireNonNull(z7.f44787d);
            z7 z7Var = (z7) h9.c.n(jSONObject, "transform", z7.f44790g, eVarA, cVar);
            if (z7Var == null) {
                z7Var = h8.V;
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
            List listV = h9.c.v(jSONObject, "transition_triggers", c8.FROM_STRING, h8.f40496r0, eVarA, cVar);
            Objects.requireNonNull(i8.f40635e);
            List listL = h9.c.l(jSONObject, "video_sources", i8.f40636f, h8.f40497s0, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"video_so…S_VALIDATOR, logger, env)");
            Objects.requireNonNull(n8.Converter);
            uc.l lVar5 = n8.FROM_STRING;
            v9.b<n8> bVar9 = h8.W;
            v9.b<n8> bVarT4 = h9.c.t(jSONObject, "visibility", lVar5, eVarA, cVar, bVar9, h8.f40479a0);
            v9.b<n8> bVar10 = bVarT4 == null ? bVar9 : bVarT4;
            Objects.requireNonNull(o8.f41845i);
            uc.p<u9.c, JSONObject, o8> pVar5 = o8.f41853q;
            o8 o8Var = (o8) h9.c.n(jSONObject, "visibility_action", pVar5, eVarA, cVar);
            List listW11 = h9.c.w(jSONObject, "visibility_actions", pVar5, h8.f40498t0, eVarA, cVar);
            l6 l6Var3 = (l6) h9.c.n(jSONObject, "width", pVar2, eVarA, cVar);
            if (l6Var3 == null) {
                l6Var3 = h8.X;
            }
            fd.j0.h(l6Var3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new h8(oVar2, bVarS, bVarS2, bVar6, bVar5, listW, k0Var2, listW2, bVarQ, listW3, str, listW4, listW5, listW6, n2Var, l6Var2, str2, x1Var2, bVar4, x1Var4, listW7, jSONObject2, bVarO, bVar8, listW8, bVarQ2, listW9, listW10, z7Var2, r0Var, a0Var, a0Var2, listV, listL, bVar10, o8Var, listW11, l6Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        v9.b.a aVar = v9.b.f36747a;
        N = aVar.a(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        O = aVar.a(bool);
        P = new k0(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 31, null);
        Q = new l6.e(new q8(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        R = new x1(null, null, null, null, null, 31, null);
        S = aVar.a(bool);
        T = new x1(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        U = aVar.a(bool);
        V = new z7(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        W = aVar.a(n8.VISIBLE);
        X = new l6.d(new i4(null, 1, 0 == true ? 1 : 0));
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f40525c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        Y = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar = b.f40526c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar, "validator");
        Z = new h9.k.a.C0302a(objQ2, bVar);
        Object objQ3 = kc.j.q(n8.values());
        c cVar = c.f40527c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f40479a0 = new h9.k.a.C0302a(objQ3, cVar);
        f40480b0 = w7.f43816j;
        f40481c0 = w7.f43819m;
        f40482d0 = g8.f40224h;
        f40483e0 = g8.f40225i;
        f40484f0 = w7.f43820n;
        f40485g0 = w7.f43821o;
        f40486h0 = g8.f40226j;
        f40487i0 = w7.f43813g;
        f40488j0 = t7.B;
        f40489k0 = t7.C;
        f40490l0 = w7.f43814h;
        f40491m0 = w7.f43815i;
        f40492n0 = t7.D;
        f40493o0 = g8.f40220d;
        f40494p0 = g8.f40221e;
        f40495q0 = w7.f43817k;
        f40496r0 = g8.f40222f;
        f40497s0 = w7.f43818l;
        f40498t0 = g8.f40223g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h8(o oVar, v9.b<t> bVar, v9.b<u> bVar2, v9.b<Double> bVar3, v9.b<Boolean> bVar4, List<? extends e0> list, k0 k0Var, List<? extends q> list2, v9.b<Long> bVar5, List<? extends q1> list3, String str, List<? extends q> list4, List<? extends z1> list5, List<? extends q> list6, n2 n2Var, l6 l6Var, String str2, x1 x1Var, v9.b<Boolean> bVar6, x1 x1Var2, List<? extends q> list7, JSONObject jSONObject, v9.b<String> bVar7, v9.b<Boolean> bVar8, List<? extends q> list8, v9.b<Long> bVar9, List<? extends q> list9, List<? extends x7> list10, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List<? extends c8> list11, List<? extends i8> list12, v9.b<n8> bVar10, o8 o8Var, List<? extends o8> list13, l6 l6Var2) {
        fd.j0.i(oVar, "accessibility");
        fd.j0.i(bVar3, "alpha");
        fd.j0.i(bVar4, "autostart");
        fd.j0.i(k0Var, "border");
        fd.j0.i(l6Var, "height");
        fd.j0.i(x1Var, "margins");
        fd.j0.i(bVar6, "muted");
        fd.j0.i(x1Var2, "paddings");
        fd.j0.i(bVar8, "repeatable");
        fd.j0.i(z7Var, "transform");
        fd.j0.i(list12, "videoSources");
        fd.j0.i(bVar10, "visibility");
        fd.j0.i(l6Var2, "width");
        this.f40499a = oVar;
        this.f40500b = bVar;
        this.f40501c = bVar2;
        this.f40502d = bVar3;
        this.f40503e = bVar4;
        this.f40504f = list;
        this.f40505g = k0Var;
        this.f40506h = list2;
        this.f40507i = bVar5;
        this.f40508j = list3;
        this.f40509k = str;
        this.f40510l = list4;
        this.f40511m = list5;
        this.f40512n = list6;
        this.f40513o = n2Var;
        this.f40514p = l6Var;
        this.f40515q = str2;
        this.f40516r = x1Var;
        this.f40517s = bVar6;
        this.f40518t = x1Var2;
        this.f40519u = list7;
        this.f40520v = jSONObject;
        this.f40521w = bVar8;
        this.f40522x = list8;
        this.f40523y = bVar9;
        this.f40524z = list9;
        this.A = list10;
        this.B = z7Var;
        this.C = r0Var;
        this.D = a0Var;
        this.E = a0Var2;
        this.F = list11;
        this.G = list12;
        this.H = bVar10;
        this.I = o8Var;
        this.J = list13;
        this.K = l6Var2;
    }

    public /* synthetic */ h8(o oVar, v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, List list, k0 k0Var, List list2, v9.b bVar5, List list3, String str, List list4, List list5, List list6, n2 n2Var, l6 l6Var, String str2, x1 x1Var, v9.b bVar6, x1 x1Var2, List list7, JSONObject jSONObject, v9.b bVar7, v9.b bVar8, List list8, v9.b bVar9, List list9, List list10, z7 z7Var, r0 r0Var, a0 a0Var, a0 a0Var2, List list11, List list12, v9.b bVar10, o8 o8Var, List list13, l6 l6Var2, int i10, int i11, vc.g gVar) {
        this((i10 & 1) != 0 ? M : oVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? N : bVar3, (i10 & 16) != 0 ? O : bVar4, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? P : k0Var, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : bVar5, (i10 & 512) != 0 ? null : list3, (i10 & 1024) != 0 ? null : str, (i10 & 2048) != 0 ? null : list4, (i10 & 4096) != 0 ? null : list5, (i10 & 8192) != 0 ? null : list6, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : n2Var, (32768 & i10) != 0 ? Q : l6Var, (65536 & i10) != 0 ? null : str2, (131072 & i10) != 0 ? R : x1Var, (262144 & i10) != 0 ? S : bVar6, (524288 & i10) != 0 ? T : x1Var2, (1048576 & i10) != 0 ? null : list7, (2097152 & i10) != 0 ? null : jSONObject, (4194304 & i10) != 0 ? null : bVar7, (8388608 & i10) != 0 ? U : bVar8, (16777216 & i10) != 0 ? null : list8, (33554432 & i10) != 0 ? null : bVar9, (67108864 & i10) != 0 ? null : list9, (134217728 & i10) != 0 ? null : list10, (268435456 & i10) != 0 ? V : z7Var, (536870912 & i10) != 0 ? null : r0Var, (1073741824 & i10) != 0 ? null : a0Var, (i10 & Integer.MIN_VALUE) != 0 ? null : a0Var2, (i11 & 1) != 0 ? null : list11, list12, (i11 & 4) != 0 ? W : bVar10, (i11 & 8) != 0 ? null : o8Var, (i11 & 16) != 0 ? null : list13, (i11 & 32) != 0 ? X : l6Var2);
    }

    @Override // y9.g0
    public z7 a() {
        return this.B;
    }

    @Override // y9.g0
    public List<e0> b() {
        return this.f40504f;
    }

    @Override // y9.g0
    public List<o8> c() {
        return this.J;
    }

    @Override // y9.g0
    public o d() {
        return this.f40499a;
    }

    @Override // y9.g0
    public v9.b<Long> e() {
        return this.f40507i;
    }

    @Override // y9.g0
    public x1 f() {
        return this.f40516r;
    }

    @Override // y9.g0
    public v9.b<Long> g() {
        return this.f40523y;
    }

    @Override // y9.g0
    public k0 getBorder() {
        return this.f40505g;
    }

    @Override // y9.g0
    public l6 getHeight() {
        return this.f40514p;
    }

    @Override // y9.g0
    public String getId() {
        return this.f40515q;
    }

    @Override // y9.g0
    public v9.b<n8> getVisibility() {
        return this.H;
    }

    @Override // y9.g0
    public l6 getWidth() {
        return this.K;
    }

    @Override // y9.g0
    public x1 h() {
        return this.f40518t;
    }

    @Override // y9.g0
    public List<c8> i() {
        return this.F;
    }

    @Override // y9.g0
    public List<q> j() {
        return this.f40524z;
    }

    @Override // y9.g0
    public v9.b<t> k() {
        return this.f40500b;
    }

    @Override // y9.g0
    public List<z1> l() {
        return this.f40511m;
    }

    @Override // y9.g0
    public List<x7> m() {
        return this.A;
    }

    @Override // y9.g0
    public o8 n() {
        return this.I;
    }

    @Override // y9.g0
    public v9.b<u> o() {
        return this.f40501c;
    }

    @Override // y9.g0
    public a0 p() {
        return this.D;
    }

    @Override // y9.g0
    public v9.b<Double> q() {
        return this.f40502d;
    }

    @Override // y9.g0
    public n2 r() {
        return this.f40513o;
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
