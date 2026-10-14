package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t0 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f42674d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l2 f42675e = new l2(null, v9.b.f36747a.a(10L), 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Integer> f42676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f42677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7 f42678c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final t0 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            v9.b bVarS = h9.c.s(jSONObject, "background_color", h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject, "radius", l2.f41214g, eVarA, cVar);
            if (l2Var == null) {
                l2Var = t0.f42675e;
            }
            fd.j0.h(l2Var, "JsonParser.readOptional(…) ?: RADIUS_DEFAULT_VALUE");
            Objects.requireNonNull(c7.f39537d);
            return new t0(bVarS, l2Var, (c7) h9.c.n(jSONObject, "stroke", c7.f39542i, eVarA, cVar));
        }
    }

    public t0() {
        this(null, null, null, 7, null);
    }

    public t0(v9.b<Integer> bVar, l2 l2Var, c7 c7Var) {
        fd.j0.i(l2Var, "radius");
        this.f42676a = bVar;
        this.f42677b = l2Var;
        this.f42678c = c7Var;
    }

    public /* synthetic */ t0(v9.b bVar, l2 l2Var, c7 c7Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? f42675e : l2Var, (i10 & 4) != 0 ? null : c7Var);
    }
}
