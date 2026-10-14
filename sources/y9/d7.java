package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d7 implements u9.a, u9.b<c7> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f39693d = new f(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<n6> f39694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Long> f39695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.k<n6> f39696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f39697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f39698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f39699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f39700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, d7> f39702m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f39703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f39704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39705c;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39706c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30978a, cVar2.a(), cVar2, h9.l.f31002f);
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, d7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39707c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public d7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new d7(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class c extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39708c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39709c = new d();

        public d() {
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
            v9.b<n6> bVar = d7.f39694e;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, d7.f39696g);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f39710c = new e();

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
            h9.m<Long> mVar = d7.f39698i;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = d7.f39695f;
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
        f39694e = aVar.a(n6.DP);
        f39695f = aVar.a(1L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        c cVar = c.f39708c;
        fd.j0.i(objQ, "default");
        fd.j0.i(cVar, "validator");
        f39696g = new h9.k.a.C0302a(objQ, cVar);
        f39697h = w6.f43802t;
        f39698i = y6.f44530q;
        f39699j = a.f39706c;
        f39700k = d.f39709c;
        f39701l = e.f39710c;
        f39702m = b.f39707c;
    }

    public d7(u9.c cVar, d7 d7Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f39703a = h9.e.j(jSONObject, "color", z10, d7Var == null ? null : d7Var.f39703a, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        j9.a<v9.b<n6>> aVar = d7Var == null ? null : d7Var.f39704b;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "unit", z10, aVar, n6.FROM_STRING, eVarA, cVar, f39696g);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f39704b = aVarS;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "width", z10, d7Var == null ? null : d7Var.f39705c, h9.h.f30982e, f39697h, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39705c = aVarR;
    }

    public /* synthetic */ d7(u9.c cVar, d7 d7Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : d7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b bVar = (v9.b) y8.c0.E(this.f39703a, cVar, "color", jSONObject, f39699j);
        v9.b<n6> bVar2 = (v9.b) y8.c0.H(this.f39704b, cVar, "unit", jSONObject, f39700k);
        if (bVar2 == null) {
            bVar2 = f39694e;
        }
        v9.b<Long> bVar3 = (v9.b) y8.c0.H(this.f39705c, cVar, "width", jSONObject, f39701l);
        if (bVar3 == null) {
            bVar3 = f39695f;
        }
        return new c7(bVar, bVar2, bVar3);
    }
}
