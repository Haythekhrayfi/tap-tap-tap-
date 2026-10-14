package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q6 implements u9.a, u9.b<o6> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Long> f42158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<o6.d> f42159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<w> f42160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f42161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<o6.d> f42162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.k<w> f42163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f42164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f42165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f42166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f42167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o1> f42168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<o6.d>> f42170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w>> f42171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42172t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<p1> f42173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<o6.d>> f42175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<w>> f42176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42177e;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, o1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42178c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public o1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o1.f41735c);
            return (o1) h9.c.n(jSONObject2, str2, o1.f41738f, cVar2.a(), cVar2);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42179c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = q6.f42165m;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = q6.f42158f;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<o6.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42180c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<o6.d> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o6.d.Converter);
            uc.l lVar = o6.d.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<o6.d> bVar = q6.f42159g;
            v9.b<o6.d> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, q6.f42162j);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42181c = new d();

        public d() {
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
            v9.b<w> bVar = q6.f42160h;
            v9.b<w> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, q6.f42163k);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f42182c = new e();

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
            h9.m<Long> mVar = q6.f42167o;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = q6.f42161i;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f42183c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof o6.d);
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f42184c = new g();

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
        f42158f = aVar.a(200L);
        f42159g = aVar.a(o6.d.BOTTOM);
        f42160h = aVar.a(w.EASE_IN_OUT);
        f42161i = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(o6.d.values());
        f fVar = f.f42183c;
        fd.j0.i(objQ, "default");
        fd.j0.i(fVar, "validator");
        f42162j = new h9.k.a.C0302a(objQ, fVar);
        Object objQ2 = kc.j.q(w.values());
        g gVar = g.f42184c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(gVar, "validator");
        f42163k = new h9.k.a.C0302a(objQ2, gVar);
        f42164l = p6.f42028d;
        f42165m = c6.f39534y;
        f42166n = p6.f42029e;
        f42167o = c6.f39535z;
        f42168p = a.f42178c;
        f42169q = b.f42179c;
        f42170r = c.f42180c;
        f42171s = d.f42181c;
        f42172t = e.f42182c;
    }

    public q6(u9.c cVar, q6 q6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<p1> aVar = q6Var == null ? null : q6Var.f42173a;
        Objects.requireNonNull(p1.f41897c);
        j9.a<p1> aVarO = h9.e.o(jSONObject, "distance", z10, aVar, p1.f41902h, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42173a = aVarO;
        j9.a<v9.b<Long>> aVar2 = q6Var == null ? null : q6Var.f42174b;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f42164l;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "duration", z10, aVar2, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42174b = aVarR;
        j9.a<v9.b<o6.d>> aVar3 = q6Var == null ? null : q6Var.f42175c;
        Objects.requireNonNull(o6.d.Converter);
        j9.a<v9.b<o6.d>> aVarS = h9.e.s(jSONObject, "edge", z10, aVar3, o6.d.FROM_STRING, eVarA, cVar, f42162j);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_EDGE)");
        this.f42175c = aVarS;
        j9.a<v9.b<w>> aVar4 = q6Var == null ? null : q6Var.f42176d;
        Objects.requireNonNull(w.Converter);
        j9.a<v9.b<w>> aVarS2 = h9.e.s(jSONObject, "interpolator", z10, aVar4, w.FROM_STRING, eVarA, cVar, f42163k);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f42176d = aVarS2;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "start_delay", z10, q6Var == null ? null : q6Var.f42177e, lVar, f42166n, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42177e = aVarR2;
    }

    public /* synthetic */ q6(u9.c cVar, q6 q6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : q6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        o1 o1Var = (o1) y8.c0.K(this.f42173a, cVar, "distance", jSONObject, f42168p);
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f42174b, cVar, "duration", jSONObject, f42169q);
        if (bVar == null) {
            bVar = f42158f;
        }
        v9.b<Long> bVar2 = bVar;
        v9.b<o6.d> bVar3 = (v9.b) y8.c0.H(this.f42175c, cVar, "edge", jSONObject, f42170r);
        if (bVar3 == null) {
            bVar3 = f42159g;
        }
        v9.b<o6.d> bVar4 = bVar3;
        v9.b<w> bVar5 = (v9.b) y8.c0.H(this.f42176d, cVar, "interpolator", jSONObject, f42171s);
        if (bVar5 == null) {
            bVar5 = f42160h;
        }
        v9.b<w> bVar6 = bVar5;
        v9.b<Long> bVar7 = (v9.b) y8.c0.H(this.f42177e, cVar, "start_delay", jSONObject, f42172t);
        if (bVar7 == null) {
            bVar7 = f42161i;
        }
        return new o6(o1Var, bVar2, bVar4, bVar6, bVar7);
    }
}
