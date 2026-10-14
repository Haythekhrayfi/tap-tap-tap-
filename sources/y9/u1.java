package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u1 implements u9.a, u9.b<t1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f42942c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.g<q> f42943d = k1.f41009k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.g<s> f42944e = r1.f42236g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.g<q> f42945f = k1.f41010l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.g<s> f42946g = r1.f42237h;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q>> f42947h = b.f42953c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q>> f42948i = c.f42954c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, u1> f42949j = a.f42952c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<List<s>> f42950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<List<s>> f42951b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, u1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42952c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public u1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new u1(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, List<q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42953c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public List<q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q.f42091g);
            return h9.c.w(jSONObject2, str2, q.f42095k, u1.f42943d, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, List<q>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42954c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public List<q> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q.f42091g);
            return h9.c.w(jSONObject2, str2, q.f42095k, u1.f42945f, cVar2.a(), cVar2);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    public u1(u9.c cVar, u1 u1Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<List<s>> aVar = u1Var == null ? null : u1Var.f42950a;
        s.k kVar = s.f42386i;
        Objects.requireNonNull(kVar);
        uc.p<u9.c, JSONObject, s> pVar = s.f42400w;
        j9.a<List<s>> aVarU = h9.e.u(jSONObject, "on_fail_actions", z10, aVar, pVar, f42944e, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42950a = aVarU;
        j9.a<List<s>> aVar2 = u1Var == null ? null : u1Var.f42951b;
        Objects.requireNonNull(kVar);
        j9.a<List<s>> aVarU2 = h9.e.u(jSONObject, "on_success_actions", z10, aVar2, pVar, f42946g, eVarA, cVar);
        fd.j0.h(aVarU2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42951b = aVarU2;
    }

    public /* synthetic */ u1(u9.c cVar, u1 u1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : u1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new t1(y8.c0.L(this.f42950a, cVar, "on_fail_actions", jSONObject, f42943d, f42947h), y8.c0.L(this.f42951b, cVar, "on_success_actions", jSONObject, f42945f, f42948i));
    }
}
