package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i6 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40612d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Integer> f40613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6 f40614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7 f40615c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final i6 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            v9.b bVarH = h9.c.h(jSONObject, "color", h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            Objects.requireNonNull(h6.f40289a);
            h6 h6Var = (h6) h9.c.d(jSONObject, "shape", h6.f40290b, h9.c.f30971a, cVar);
            Objects.requireNonNull(c7.f39537d);
            return new i6(bVarH, h6Var, (c7) h9.c.n(jSONObject, "stroke", c7.f39542i, eVarA, cVar));
        }
    }

    public i6(v9.b<Integer> bVar, h6 h6Var, c7 c7Var) {
        fd.j0.i(bVar, "color");
        fd.j0.i(h6Var, "shape");
        this.f40613a = bVar;
        this.f40614b = h6Var;
        this.f40615c = c7Var;
    }

    public /* synthetic */ i6(v9.b bVar, h6 h6Var, c7 c7Var, int i10, vc.g gVar) {
        this(bVar, h6Var, (i10 & 4) != 0 ? null : c7Var);
    }
}
