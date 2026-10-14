package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m1 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41417b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2 f41418c = new l2(null, v9.b.f36747a.a(15L), 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f41419a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final m1 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject, "space_between_centers", l2.f41214g, eVarA, cVar);
            if (l2Var == null) {
                l2Var = m1.f41418c;
            }
            fd.j0.h(l2Var, "JsonParser.readOptional(…EEN_CENTERS_DEFAULT_VALUE");
            return new m1(l2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public m1(l2 l2Var) {
        fd.j0.i(l2Var, "spaceBetweenCenters");
        this.f41419a = l2Var;
    }

    public /* synthetic */ m1(l2 l2Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f41418c : l2Var);
    }
}
