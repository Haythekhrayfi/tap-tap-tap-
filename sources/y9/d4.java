package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d4 implements u9.a, u9.b<c4> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<Boolean> f39623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<String> f39624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<String> f39625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<String> f39626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<String> f39627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<String> f39628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f39629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f39630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f39632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39633o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f39634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<String>> f39635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<String>> f39636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<String> f39637d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39638c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            u9.e eVarA = cVar2.a();
            v9.b<Boolean> bVar = d4.f39623e;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39639c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.e(jSONObject2, str2, d4.f39625g, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39640c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.e(jSONObject2, str2, d4.f39627i, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39641c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = d4.f39629k;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    static {
        new e(null);
        f39623e = v9.b.f36747a.a(Boolean.FALSE);
        f39624f = x3.f44075p;
        f39625g = w3.f43735n;
        f39626h = x3.f44076q;
        f39627i = w3.f43736o;
        f39628j = x3.f44077r;
        f39629k = w3.f43737p;
        f39630l = a.f39638c;
        f39631m = b.f39639c;
        f39632n = c.f39640c;
        f39633o = d.f39641c;
    }

    public d4(u9.c cVar, d4 d4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Boolean>> aVarS = h9.e.s(jSONObject, "allow_empty", z10, d4Var == null ? null : d4Var.f39634a, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f39634a = aVarS;
        j9.a<v9.b<String>> aVar = d4Var == null ? null : d4Var.f39635b;
        h9.m<String> mVar = f39624f;
        h9.k<String> kVar = h9.l.f30999c;
        this.f39635b = h9.e.g(jSONObject, "label_id", z10, aVar, mVar, eVarA, cVar, kVar);
        this.f39636c = h9.e.g(jSONObject, "pattern", z10, d4Var == null ? null : d4Var.f39636c, f39626h, eVarA, cVar, kVar);
        this.f39637d = h9.e.b(jSONObject, "variable", z10, d4Var == null ? null : d4Var.f39637d, f39628j, eVarA, cVar);
    }

    public /* synthetic */ d4(u9.c cVar, d4 d4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : d4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Boolean> bVar = (v9.b) y8.c0.H(this.f39634a, cVar, "allow_empty", jSONObject, f39630l);
        if (bVar == null) {
            bVar = f39623e;
        }
        return new c4(bVar, (v9.b) y8.c0.E(this.f39635b, cVar, "label_id", jSONObject, f39631m), (v9.b) y8.c0.E(this.f39636c, cVar, "pattern", jSONObject, f39632n), (String) y8.c0.E(this.f39637d, cVar, "variable", jSONObject, f39633o));
    }
}
