package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x8 implements u9.a, u9.b<w8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f44184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f44185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44187f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f44188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<String> f44189b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44190c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = x8.f44185d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44191c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            i.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env");
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a);
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
        f44184c = k8.f41148t;
        f44185d = l8.f41379t;
        f44186e = a.f44190c;
        f44187f = b.f44191c;
    }

    public x8(u9.c cVar, x8 x8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f44188a = h9.e.b(jSONObject, "name", z10, x8Var == null ? null : x8Var.f44188a, f44184c, eVarA, cVar);
        this.f44189b = h9.e.c(jSONObject, "value", z10, x8Var == null ? null : x8Var.f44189b, eVarA, cVar);
    }

    public /* synthetic */ x8(u9.c cVar, x8 x8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : x8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new w8((String) y8.c0.E(this.f44188a, cVar, "name", jSONObject, f44186e), (String) y8.c0.E(this.f44189b, cVar, "value", jSONObject, f44187f));
    }
}
