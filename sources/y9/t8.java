package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t8 implements u9.a, u9.b<s8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f42923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f42924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f42925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, Long> f42926f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f42927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<Long> f42928b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42929c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = t8.f42924d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, Long> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42930c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public Long b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            cVar2.a();
            return (Long) h9.c.c(jSONObject2, str2, lVar, h9.c.f30971a);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    static {
        new c(null);
        f42923c = k8.f41146r;
        f42924d = l8.f41375p;
        f42925e = a.f42929c;
        f42926f = b.f42930c;
    }

    public t8(u9.c cVar, t8 t8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f42927a = h9.e.b(jSONObject, "name", z10, t8Var == null ? null : t8Var.f42927a, f42923c, eVarA, cVar);
        this.f42928b = h9.e.e(jSONObject, "value", z10, t8Var == null ? null : t8Var.f42928b, h9.h.f30982e, eVarA, cVar);
    }

    public /* synthetic */ t8(u9.c cVar, t8 t8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : t8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new s8((String) y8.c0.E(this.f42927a, cVar, "name", jSONObject, f42925e), ((Number) y8.c0.E(this.f42928b, cVar, "value", jSONObject, f42926f)).longValue());
    }
}
