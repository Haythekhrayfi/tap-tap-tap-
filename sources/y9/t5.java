package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t5 implements u9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f42752f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l2 f42753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l2 f42754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l2 f42755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, t5> f42756j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Integer> f42757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f42758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f42759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l2 f42760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c7 f42761e;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, t5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42762c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public t5 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return t5.f42752f.a(cVar2, jSONObject2);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final t5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            v9.b bVarS = h9.c.s(jSONObject, "background_color", h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
            Objects.requireNonNull(l2.f41210c);
            uc.p<u9.c, JSONObject, l2> pVar = l2.f41214g;
            l2 l2Var = (l2) h9.c.n(jSONObject, "corner_radius", pVar, eVarA, cVar);
            if (l2Var == null) {
                l2Var = t5.f42753g;
            }
            fd.j0.h(l2Var, "JsonParser.readOptional(…RNER_RADIUS_DEFAULT_VALUE");
            l2 l2Var2 = (l2) h9.c.n(jSONObject, "item_height", pVar, eVarA, cVar);
            if (l2Var2 == null) {
                l2Var2 = t5.f42754h;
            }
            fd.j0.h(l2Var2, "JsonParser.readOptional(…ITEM_HEIGHT_DEFAULT_VALUE");
            l2 l2Var3 = (l2) h9.c.n(jSONObject, "item_width", pVar, eVarA, cVar);
            if (l2Var3 == null) {
                l2Var3 = t5.f42755i;
            }
            l2 l2Var4 = l2Var3;
            fd.j0.h(l2Var4, "JsonParser.readOptional(… ITEM_WIDTH_DEFAULT_VALUE");
            Objects.requireNonNull(c7.f39537d);
            return new t5(bVarS, l2Var, l2Var2, l2Var4, (c7) h9.c.n(jSONObject, "stroke", c7.f39542i, eVarA, cVar));
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f42753g = new l2(null, aVar.a(5L), 1, null);
        f42754h = new l2(null, aVar.a(10L), 1, null);
        f42755i = new l2(null, aVar.a(10L), 1, null);
        f42756j = a.f42762c;
    }

    public t5() {
        this(null, null, null, null, null, 31, null);
    }

    public t5(v9.b<Integer> bVar, l2 l2Var, l2 l2Var2, l2 l2Var3, c7 c7Var) {
        fd.j0.i(l2Var, "cornerRadius");
        fd.j0.i(l2Var2, "itemHeight");
        fd.j0.i(l2Var3, "itemWidth");
        this.f42757a = bVar;
        this.f42758b = l2Var;
        this.f42759c = l2Var2;
        this.f42760d = l2Var3;
        this.f42761e = c7Var;
    }

    public /* synthetic */ t5(v9.b bVar, l2 l2Var, l2 l2Var2, l2 l2Var3, c7 c7Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? f42753g : l2Var, (i10 & 4) != 0 ? f42754h : l2Var2, (i10 & 8) != 0 ? f42755i : l2Var3, (i10 & 16) != 0 ? null : c7Var);
    }
}
