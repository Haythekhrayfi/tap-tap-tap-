package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k4 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41095b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f41096a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final k4 a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            Objects.requireNonNull(l2.f41210c);
            return new k4((l2) h9.c.d(jSONObject, "neighbour_page_width", l2.f41214g, h9.c.f30971a, cVar));
        }
    }

    public k4(l2 l2Var) {
        fd.j0.i(l2Var, "neighbourPageWidth");
        this.f41096a = l2Var;
    }
}
