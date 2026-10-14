package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o4 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41820b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4 f41821a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final o4 a(u9.c cVar, JSONObject jSONObject) {
            cVar.a();
            Objects.requireNonNull(x4.f44086b);
            return new o4((x4) h9.c.d(jSONObject, "page_width", x4.f44088d, h9.c.f30971a, cVar));
        }
    }

    public o4(x4 x4Var) {
        fd.j0.i(x4Var, "pageWidth");
        this.f41821a = x4Var;
    }
}
