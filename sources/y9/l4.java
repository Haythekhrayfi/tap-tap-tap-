package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l4 implements u9.a, u9.b<k4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f41224b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<m2> f41225a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41226c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public l2 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l2.f41210c);
            uc.p<u9.c, JSONObject, l2> pVar = l2.f41214g;
            cVar2.a();
            return (l2) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
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
        f41224b = a.f41226c;
    }

    public l4(u9.c cVar, l4 l4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<m2> aVar = l4Var == null ? null : l4Var.f41225a;
        Objects.requireNonNull(m2.f41420c);
        this.f41225a = h9.e.f(jSONObject, "neighbour_page_width", z10, aVar, m2.f41427j, eVarA, cVar);
    }

    public /* synthetic */ l4(u9.c cVar, l4 l4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : l4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new k4((l2) y8.c0.M(this.f41225a, cVar, "neighbour_page_width", jSONObject, f41224b));
    }
}
