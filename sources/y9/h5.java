package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h5 implements u9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40280e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i5.d f40281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i5.d f40282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m5.d f40283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.g<Integer> f40284i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5 f40285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i5 f40286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.c<Integer> f40287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m5 f40288d;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final h5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(i5.f40607a);
            uc.p<u9.c, JSONObject, i5> pVar = i5.f40608b;
            i5 i5Var = (i5) h9.c.n(jSONObject, "center_x", pVar, eVarA, cVar);
            if (i5Var == null) {
                i5Var = h5.f40281f;
            }
            i5 i5Var2 = i5Var;
            fd.j0.h(i5Var2, "JsonParser.readOptional(…?: CENTER_X_DEFAULT_VALUE");
            i5 i5Var3 = (i5) h9.c.n(jSONObject, "center_y", pVar, eVarA, cVar);
            if (i5Var3 == null) {
                i5Var3 = h5.f40282g;
            }
            i5 i5Var4 = i5Var3;
            fd.j0.h(i5Var4, "JsonParser.readOptional(…?: CENTER_Y_DEFAULT_VALUE");
            v9.c cVarJ = h9.c.j(jSONObject, "colors", h9.h.f30978a, h5.f40284i, eVarA, cVar, h9.l.f31002f);
            Objects.requireNonNull(m5.f41443a);
            m5 m5Var = (m5) h9.c.n(jSONObject, "radius", m5.f41444b, eVarA, cVar);
            if (m5Var == null) {
                m5Var = h5.f40283h;
            }
            fd.j0.h(m5Var, "JsonParser.readOptional(…) ?: RADIUS_DEFAULT_VALUE");
            return new h5(i5Var2, i5Var4, cVarJ, m5Var);
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        Double dValueOf = Double.valueOf(0.5d);
        f40281f = new i5.d(new o5(aVar.a(dValueOf)));
        f40282g = new i5.d(new o5(aVar.a(dValueOf)));
        f40283h = new m5.d(new q5(aVar.a(q5.c.FARTHEST_CORNER)));
        f40284i = u4.f43079p;
    }

    public h5(i5 i5Var, i5 i5Var2, v9.c<Integer> cVar, m5 m5Var) {
        fd.j0.i(i5Var, "centerX");
        fd.j0.i(i5Var2, "centerY");
        fd.j0.i(cVar, "colors");
        fd.j0.i(m5Var, "radius");
        this.f40285a = i5Var;
        this.f40286b = i5Var2;
        this.f40287c = cVar;
        this.f40288d = m5Var;
    }

    public /* synthetic */ h5(i5 i5Var, i5 i5Var2, v9.c cVar, m5 m5Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f40281f : i5Var, (i10 & 2) != 0 ? f40282g : i5Var2, cVar, (i10 & 8) != 0 ? f40283h : m5Var);
    }
}
