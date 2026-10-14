package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y1 implements u9.a, u9.b<x1> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f44196f = new h(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f44197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Long> f44198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f44199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f44200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<n6> f44201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.k<n6> f44202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f44203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f44204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f44205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f44206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Long> f44207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.m<Long> f44208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.m<Long> f44209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h9.m<Long> f44210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f44214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f44215y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, y1> f44216z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f44220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f44221e;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44222c = new a();

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
            h9.m<Long> mVar = y1.f44204n;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = y1.f44197g;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, y1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44223c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public y1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new y1(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44224c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = y1.f44206p;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = y1.f44198h;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f44225c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = y1.f44208r;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = y1.f44199i;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f44226c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = y1.f44210t;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = y1.f44200j;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f44227c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f44228c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<n6> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<n6> bVar = y1.f44201k;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, y1.f44202l);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class h {
        public h() {
        }

        public h(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f44197g = aVar.a(0L);
        f44198h = aVar.a(0L);
        f44199i = aVar.a(0L);
        f44200j = aVar.a(0L);
        f44201k = aVar.a(n6.DP);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        f fVar = f.f44227c;
        fd.j0.i(objQ, "default");
        fd.j0.i(fVar, "validator");
        f44202l = new h9.k.a.C0302a(objQ, fVar);
        f44203m = k1.f41011m;
        f44204n = r1.f42242m;
        f44205o = k1.f41012n;
        f44206p = r1.f42243n;
        f44207q = k1.f41013o;
        f44208r = r1.f42244o;
        f44209s = k1.f41014p;
        f44210t = r1.f42245p;
        f44211u = a.f44222c;
        f44212v = c.f44224c;
        f44213w = d.f44225c;
        f44214x = e.f44226c;
        f44215y = g.f44228c;
        f44216z = b.f44223c;
    }

    public y1(u9.c cVar, y1 y1Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = y1Var == null ? null : y1Var.f44217a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f44203m;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "bottom", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44217a = aVarR;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "left", z10, y1Var == null ? null : y1Var.f44218b, lVar, f44205o, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44218b = aVarR2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "right", z10, y1Var == null ? null : y1Var.f44219c, lVar, f44207q, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44219c = aVarR3;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "top", z10, y1Var == null ? null : y1Var.f44220d, lVar, f44209s, eVarA, cVar, kVar);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f44220d = aVarR4;
        j9.a<v9.b<n6>> aVar2 = y1Var == null ? null : y1Var.f44221e;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "unit", z10, aVar2, n6.FROM_STRING, eVarA, cVar, f44202l);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f44221e = aVarS;
    }

    public /* synthetic */ y1(u9.c cVar, y1 y1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : y1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f44217a, cVar, "bottom", jSONObject, f44211u);
        if (bVar == null) {
            bVar = f44197g;
        }
        v9.b<Long> bVar2 = bVar;
        v9.b<Long> bVar3 = (v9.b) y8.c0.H(this.f44218b, cVar, "left", jSONObject, f44212v);
        if (bVar3 == null) {
            bVar3 = f44198h;
        }
        v9.b<Long> bVar4 = bVar3;
        v9.b<Long> bVar5 = (v9.b) y8.c0.H(this.f44219c, cVar, "right", jSONObject, f44213w);
        if (bVar5 == null) {
            bVar5 = f44199i;
        }
        v9.b<Long> bVar6 = bVar5;
        v9.b<Long> bVar7 = (v9.b) y8.c0.H(this.f44220d, cVar, "top", jSONObject, f44214x);
        if (bVar7 == null) {
            bVar7 = f44200j;
        }
        v9.b<Long> bVar8 = bVar7;
        v9.b<n6> bVar9 = (v9.b) y8.c0.H(this.f44221e, cVar, "unit", jSONObject, f44215y);
        if (bVar9 == null) {
            bVar9 = f44201k;
        }
        return new x1(bVar2, bVar4, bVar6, bVar8, bVar9);
    }
}
