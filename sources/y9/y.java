package y9;

import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44192b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.g<a0> f44193c = r.f42214n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a0> f44194a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final y a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(a0.f38966a);
            List listL = h9.c.l(jSONObject, "items", a0.f38967b, y.f44193c, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            return new y(listL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(List<? extends a0> list) {
        fd.j0.i(list, "items");
        this.f44194a = list;
    }
}
