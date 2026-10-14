package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements u9.a, u9.b<i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.m<Long> f40649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Long> f40650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40651d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40652a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40653c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.g(jSONObject2, str2, h9.h.f30982e, j0.f40650c, cVar2.a(), h9.l.f30998b);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        new b(null);
        f40649b = m.f41402t;
        f40650c = r.f42219s;
        f40651d = a.f40653c;
    }

    public j0(u9.c cVar, j0 j0Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        this.f40652a = h9.e.i(jSONObject, "radius", z10, j0Var == null ? null : j0Var.f40652a, h9.h.f30982e, f40649b, cVar.a(), cVar, h9.l.f30998b);
    }

    public /* synthetic */ j0(u9.c cVar, j0 j0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : j0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new i0((v9.b) y8.c0.E(this.f40652a, cVar, "radius", jSONObject, f40651d));
    }
}
