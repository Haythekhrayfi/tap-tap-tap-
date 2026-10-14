package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a7 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39091c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2 f39092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<Long> f39093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<Long> f39094f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f39095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f39096b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final a7 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject, "item_spacing", l2.f41214g, eVarA, cVar);
            if (l2Var == null) {
                l2Var = a7.f39092d;
            }
            fd.j0.h(l2Var, "JsonParser.readOptional(…TEM_SPACING_DEFAULT_VALUE");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = a7.f39094f;
            v9.b<Long> bVar = a7.f39093e;
            v9.b<Long> bVarR = h9.c.r(jSONObject, "max_visible_items", lVar, mVar, eVarA, bVar, h9.l.f30998b);
            if (bVarR != null) {
                bVar = bVarR;
            }
            return new a7(l2Var, bVar);
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f39092d = new l2(null, aVar.a(5L), 1, null);
        f39093e = aVar.a(10L);
        f39094f = y6.f44527n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public a7(l2 l2Var, v9.b<Long> bVar) {
        fd.j0.i(l2Var, "itemSpacing");
        fd.j0.i(bVar, "maxVisibleItems");
        this.f39095a = l2Var;
        this.f39096b = bVar;
    }

    public /* synthetic */ a7(l2 l2Var, v9.b bVar, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39092d : l2Var, (i10 & 2) != 0 ? f39093e : bVar);
    }
}
