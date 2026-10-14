package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b7 implements u9.a, u9.b<a7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2 f39325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<Long> f39326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<Long> f39327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<Long> f39328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l2> f39329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f39330h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<m2> f39331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f39332b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39333c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public l2 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l2.f41210c);
            l2 l2Var = (l2) h9.c.n(jSONObject2, str2, l2.f41214g, cVar2.a(), cVar2);
            return l2Var == null ? b7.f39325c : l2Var;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39334c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = b7.f39328f;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = b7.f39326d;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    static {
        new c(null);
        v9.b.a aVar = v9.b.f36747a;
        f39325c = new l2(null, aVar.a(5L), 1, null);
        f39326d = aVar.a(10L);
        f39327e = w6.f43801s;
        f39328f = y6.f44528o;
        f39329g = a.f39333c;
        f39330h = b.f39334c;
    }

    public b7(u9.c cVar, b7 b7Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<m2> aVar = b7Var == null ? null : b7Var.f39331a;
        Objects.requireNonNull(m2.f41420c);
        j9.a<m2> aVarO = h9.e.o(jSONObject, "item_spacing", z10, aVar, m2.f41427j, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39331a = aVarO;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "max_visible_items", z10, b7Var == null ? null : b7Var.f39332b, h9.h.f30982e, f39327e, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f39332b = aVarR;
    }

    public /* synthetic */ b7(u9.c cVar, b7 b7Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : b7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a7 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        l2 l2Var = (l2) y8.c0.K(this.f39331a, cVar, "item_spacing", jSONObject, f39329g);
        if (l2Var == null) {
            l2Var = f39325c;
        }
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f39332b, cVar, "max_visible_items", jSONObject, f39330h);
        if (bVar == null) {
            bVar = f39326d;
        }
        return new a7(l2Var, bVar);
    }
}
