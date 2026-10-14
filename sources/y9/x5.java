package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x5 implements u9.a, u9.b<v5> {
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> A;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> B;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f44091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<w> f44092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Double> f44093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Double> f44094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<Double> f44095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Long> f44096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.k<w> f44097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f44098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f44099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Double> f44100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Double> f44101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.m<Double> f44102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.m<Double> f44103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h9.m<Double> f44104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h9.m<Double> f44105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h9.m<Long> f44106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h9.m<Long> f44107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w>> f44109y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f44110z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<w>> f44112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44116f;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44117c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = x5.f44099o;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = x5.f44091g;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44118c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<w> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w.Converter);
            uc.l lVar = w.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<w> bVar = x5.f44092h;
            v9.b<w> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, x5.f44097m);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44119c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = x5.f44101q;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = x5.f44093i;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44120c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = x5.f44103s;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = x5.f44094j;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44121c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = x5.f44105u;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = x5.f44095k;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44122c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = x5.f44107w;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = x5.f44096l;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f44123c = new g();

        public g() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class h {
        public h() {
        }

        public h(vc.g gVar) {
        }
    }

    static {
        new h(null);
        v9.b.a aVar = v9.b.f36747a;
        f44091g = aVar.a(200L);
        f44092h = aVar.a(w.EASE_IN_OUT);
        Double dValueOf = Double.valueOf(0.5d);
        f44093i = aVar.a(dValueOf);
        f44094j = aVar.a(dValueOf);
        f44095k = aVar.a(Double.valueOf(0.0d));
        f44096l = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        g gVar = g.f44123c;
        fd.j0.i(objQ, "default");
        fd.j0.i(gVar, "validator");
        f44097m = new h9.k.a.C0302a(objQ, gVar);
        f44098n = q4.f42150x;
        f44099o = u4.f43086w;
        f44100p = q4.f42151y;
        f44101q = u4.f43087x;
        f44102r = w5.f43762d;
        f44103s = u4.f43088y;
        f44104t = w5.f43763e;
        f44105u = u4.f43089z;
        f44106v = w5.f43764f;
        f44107w = u4.A;
        f44108x = a.f44117c;
        f44109y = b.f44118c;
        f44110z = c.f44119c;
        A = d.f44120c;
        B = e.f44121c;
        C = f.f44122c;
    }

    public x5(u9.c cVar, x5 x5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = x5Var == null ? null : x5Var.f44111a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f44098n;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "duration", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44111a = aVarR;
        j9.a<v9.b<w>> aVar2 = x5Var == null ? null : x5Var.f44112b;
        Objects.requireNonNull(w.Converter);
        j9.a<v9.b<w>> aVarS = h9.e.s(jSONObject, "interpolator", z10, aVar2, w.FROM_STRING, eVarA, cVar, f44097m);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f44112b = aVarS;
        j9.a<v9.b<Double>> aVar3 = x5Var == null ? null : x5Var.f44113c;
        uc.l<Number, Double> lVar2 = h9.h.f30981d;
        h9.m<Double> mVar2 = f44100p;
        h9.k<Double> kVar2 = h9.l.f31000d;
        j9.a<v9.b<Double>> aVarR2 = h9.e.r(jSONObject, "pivot_x", z10, aVar3, lVar2, mVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44113c = aVarR2;
        j9.a<v9.b<Double>> aVarR3 = h9.e.r(jSONObject, "pivot_y", z10, x5Var == null ? null : x5Var.f44114d, lVar2, f44102r, eVarA, cVar, kVar2);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44114d = aVarR3;
        j9.a<v9.b<Double>> aVarR4 = h9.e.r(jSONObject, "scale", z10, x5Var == null ? null : x5Var.f44115e, lVar2, f44104t, eVarA, cVar, kVar2);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f44115e = aVarR4;
        j9.a<v9.b<Long>> aVarR5 = h9.e.r(jSONObject, "start_delay", z10, x5Var == null ? null : x5Var.f44116f, lVar, f44106v, eVarA, cVar, kVar);
        fd.j0.h(aVarR5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44116f = aVarR5;
    }

    public /* synthetic */ x5(u9.c cVar, x5 x5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : x5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f44111a, cVar, "duration", jSONObject, f44108x);
        if (bVar == null) {
            bVar = f44091g;
        }
        v9.b<Long> bVar2 = bVar;
        v9.b<w> bVar3 = (v9.b) y8.c0.H(this.f44112b, cVar, "interpolator", jSONObject, f44109y);
        if (bVar3 == null) {
            bVar3 = f44092h;
        }
        v9.b<w> bVar4 = bVar3;
        v9.b<Double> bVar5 = (v9.b) y8.c0.H(this.f44113c, cVar, "pivot_x", jSONObject, f44110z);
        if (bVar5 == null) {
            bVar5 = f44093i;
        }
        v9.b<Double> bVar6 = bVar5;
        v9.b<Double> bVar7 = (v9.b) y8.c0.H(this.f44114d, cVar, "pivot_y", jSONObject, A);
        if (bVar7 == null) {
            bVar7 = f44094j;
        }
        v9.b<Double> bVar8 = bVar7;
        v9.b<Double> bVar9 = (v9.b) y8.c0.H(this.f44115e, cVar, "scale", jSONObject, B);
        if (bVar9 == null) {
            bVar9 = f44095k;
        }
        v9.b<Double> bVar10 = bVar9;
        v9.b<Long> bVar11 = (v9.b) y8.c0.H(this.f44116f, cVar, "start_delay", jSONObject, C);
        if (bVar11 == null) {
            bVar11 = f44096l;
        }
        return new v5(bVar2, bVar4, bVar6, bVar8, bVar10, bVar11);
    }
}
