package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n implements u9.a, u9.b<l> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f41577e = new f(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Long> f41578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f41579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Long> f41580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f41581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Long> f41582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f41583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f41584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f41585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f41586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f41587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f41588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Long> f41589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, n> f41594v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41598d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41599c = new a();

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
            h9.m<Long> mVar = n.f41583k;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = n.f41578f;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41600c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public n invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new n(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41601c = new c();

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
            h9.m<Long> mVar = n.f41585m;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = n.f41579g;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41602c = new d();

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
            h9.m<Long> mVar = n.f41587o;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = n.f41580h;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41603c = new e();

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
            h9.m<Long> mVar = n.f41589q;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = n.f41581i;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f {
        public f() {
        }

        public f(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f41578f = aVar.a(0L);
        f41579g = aVar.a(0L);
        f41580h = aVar.a(0L);
        f41581i = aVar.a(0L);
        f41582j = i5.a.f31268x;
        f41583k = p7.d1.f34499w;
        f41584l = i5.a.f31269y;
        f41585m = p7.d1.f34500x;
        f41586n = i5.a.f31270z;
        f41587o = p7.d1.f34501y;
        f41588p = m.f41386d;
        f41589q = p7.d1.f34502z;
        f41590r = a.f41599c;
        f41591s = c.f41601c;
        f41592t = d.f41602c;
        f41593u = e.f41603c;
        f41594v = b.f41600c;
    }

    public n(u9.c cVar, n nVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = nVar == null ? null : nVar.f41595a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f41582j;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "bottom", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41595a = aVarR;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "left", z10, nVar == null ? null : nVar.f41596b, lVar, f41584l, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41596b = aVarR2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "right", z10, nVar == null ? null : nVar.f41597c, lVar, f41586n, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41597c = aVarR3;
        j9.a<v9.b<Long>> aVarR4 = h9.e.r(jSONObject, "top", z10, nVar == null ? null : nVar.f41598d, lVar, f41588p, eVarA, cVar, kVar);
        fd.j0.h(aVarR4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41598d = aVarR4;
    }

    public /* synthetic */ n(u9.c cVar, n nVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : nVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f41595a, cVar, "bottom", jSONObject, f41590r);
        if (bVar == null) {
            bVar = f41578f;
        }
        v9.b<Long> bVar2 = (v9.b) y8.c0.H(this.f41596b, cVar, "left", jSONObject, f41591s);
        if (bVar2 == null) {
            bVar2 = f41579g;
        }
        v9.b<Long> bVar3 = (v9.b) y8.c0.H(this.f41597c, cVar, "right", jSONObject, f41592t);
        if (bVar3 == null) {
            bVar3 = f41580h;
        }
        v9.b<Long> bVar4 = (v9.b) y8.c0.H(this.f41598d, cVar, "top", jSONObject, f41593u);
        if (bVar4 == null) {
            bVar4 = f41581i;
        }
        return new l(bVar, bVar2, bVar3, bVar4);
    }
}
