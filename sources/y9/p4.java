package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p4 implements u9.a, u9.b<o4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, x4> f42022b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<y4> f42023a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, x4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42024c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public x4 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(x4.f44086b);
            uc.p<u9.c, JSONObject, x4> pVar = x4.f44088d;
            cVar2.a();
            return (x4) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        new b(null);
        f42022b = a.f42024c;
    }

    public p4(u9.c cVar, p4 p4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<y4> aVar = p4Var == null ? null : p4Var.f42023a;
        Objects.requireNonNull(y4.f44485b);
        this.f42023a = h9.e.f(jSONObject, "page_width", z10, aVar, y4.f44489f, eVarA, cVar);
    }

    public /* synthetic */ p4(u9.c cVar, p4 p4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : p4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new o4((x4) y8.c0.M(this.f42023a, cVar, "page_width", jSONObject, f42022b));
    }
}
