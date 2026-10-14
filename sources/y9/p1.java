package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p1 implements u9.a, u9.b<o1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f41897c = new e(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<n6> f41898d = v9.b.f36747a.a(n6.DP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.k<n6> f41899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f41900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f41901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, p1> f41902h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f41903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f41904b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, p1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41905c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public p1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new p1(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41906c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41907c = new c();

        public c() {
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
            v9.b<n6> bVar = p1.f41898d;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p1.f41899e);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41908c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30981d, cVar2.a(), cVar2, h9.l.f31000d);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        b bVar = b.f41906c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f41899e = new h9.k.a.C0302a(objQ, bVar);
        f41900f = c.f41907c;
        f41901g = d.f41908c;
        f41902h = a.f41905c;
    }

    public p1(u9.c cVar, p1 p1Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<n6>> aVar = p1Var == null ? null : p1Var.f41903a;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "unit", z10, aVar, n6.FROM_STRING, eVarA, cVar, f41899e);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f41903a = aVarS;
        this.f41904b = h9.e.j(jSONObject, "value", z10, p1Var == null ? null : p1Var.f41904b, h9.h.f30981d, eVarA, cVar, h9.l.f31000d);
    }

    public /* synthetic */ p1(u9.c cVar, p1 p1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : p1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<n6> bVar = (v9.b) y8.c0.H(this.f41903a, cVar, "unit", jSONObject, f41900f);
        if (bVar == null) {
            bVar = f41898d;
        }
        return new o1(bVar, (v9.b) y8.c0.E(this.f41904b, cVar, "value", jSONObject, f41901g));
    }
}
