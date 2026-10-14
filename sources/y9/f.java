package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f implements u9.a, u9.b<e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f39910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f39911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, Integer> f39913f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f39914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<Integer> f39915b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39916c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = f.f39911d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39917c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public Integer b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Integer> lVar = h9.h.f30978a;
            cVar2.a();
            return (Integer) h9.c.c(jSONObject2, str2, lVar, h9.c.f30971a);
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
        f39910c = i5.a.f31266v;
        f39911d = p7.d1.f34492p;
        f39912e = a.f39916c;
        f39913f = b.f39917c;
    }

    public f(u9.c cVar, f fVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f39914a = h9.e.b(jSONObject, "name", z10, fVar == null ? null : fVar.f39914a, f39910c, eVarA, cVar);
        this.f39915b = h9.e.e(jSONObject, "value", z10, fVar == null ? null : fVar.f39915b, h9.h.f30978a, eVarA, cVar);
    }

    public /* synthetic */ f(u9.c cVar, f fVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : fVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new e((String) y8.c0.E(this.f39914a, cVar, "name", jSONObject, f39912e), ((Number) y8.c0.E(this.f39915b, cVar, "value", jSONObject, f39913f)).intValue());
    }
}
