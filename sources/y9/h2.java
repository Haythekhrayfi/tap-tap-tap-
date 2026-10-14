package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h2 implements u9.a, u9.b<f2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.m<Long> f40263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Long> f40264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40265d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40266a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40267c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.g(jSONObject2, str2, h9.h.f30982e, h2.f40264c, cVar2.a(), h9.l.f30998b);
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
        f40263b = g2.f40100d;
        f40264c = r1.f42255z;
        f40265d = a.f40267c;
    }

    public h2(u9.c cVar, h2 h2Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        this.f40266a = h9.e.i(jSONObject, "value", z10, h2Var == null ? null : h2Var.f40266a, h9.h.f30982e, f40263b, cVar.a(), cVar, h9.l.f30998b);
    }

    public /* synthetic */ h2(u9.c cVar, h2 h2Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : h2Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new f2((v9.b) y8.c0.E(this.f40266a, cVar, "value", jSONObject, f40265d));
    }
}
