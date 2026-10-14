package y9;

import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p0 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41894b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.g<r0> f41895c = n0.f41605e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r0> f41896a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final p0 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(r0.f42228a);
            List listL = h9.c.l(jSONObject, "items", r0.f42229b, p0.f41895c, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            return new p0(listL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(List<? extends r0> list) {
        fd.j0.i(list, "items");
        this.f41896a = list;
    }
}
