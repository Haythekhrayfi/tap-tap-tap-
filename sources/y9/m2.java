package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m2 implements u9.a, u9.b<l2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f41420c = new e(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<n6> f41421d = v9.b.f36747a.a(n6.DP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.k<n6> f41422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<Long> f41423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<Long> f41424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f41425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, m2> f41427j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f41428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41429b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41430c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public m2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new m2(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41431c = new b();

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
        public static final c f41432c = new c();

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
            v9.b<n6> bVar = m2.f41421d;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, m2.f41422e);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41433c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.g(jSONObject2, str2, h9.h.f30982e, m2.f41424g, cVar2.a(), h9.l.f30998b);
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
        b bVar = b.f41431c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f41422e = new h9.k.a.C0302a(objQ, bVar);
        f41423f = k2.f41022f;
        f41424g = g2.f40111o;
        f41425h = c.f41432c;
        f41426i = d.f41433c;
        f41427j = a.f41430c;
    }

    public m2(u9.c cVar, m2 m2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<n6>> aVar = m2Var == null ? null : m2Var.f41428a;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "unit", z10, aVar, n6.FROM_STRING, eVarA, cVar, f41422e);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f41428a = aVarS;
        this.f41429b = h9.e.i(jSONObject, "value", z10, m2Var == null ? null : m2Var.f41429b, h9.h.f30982e, f41423f, eVarA, cVar, h9.l.f30998b);
    }

    public /* synthetic */ m2(u9.c cVar, m2 m2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : m2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<n6> bVar = (v9.b) y8.c0.H(this.f41428a, cVar, "unit", jSONObject, f41425h);
        if (bVar == null) {
            bVar = f41421d;
        }
        return new l2(bVar, (v9.b) y8.c0.E(this.f41429b, cVar, "value", jSONObject, f41426i));
    }
}
