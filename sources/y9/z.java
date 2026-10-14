package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z implements u9.a, u9.b<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.g<a0> f44576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.g<b0> f44577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<a0>> f44578d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<List<b0>> f44579a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, List<a0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44580c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public List<a0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(a0.f38966a);
            List<a0> listL = h9.c.l(jSONObject2, str2, a0.f38967b, z.f44576b, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivA…LIDATOR, env.logger, env)");
            return listL;
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
        f44576b = m.f41400r;
        f44577c = r.f42215o;
        f44578d = a.f44580c;
    }

    public z(u9.c cVar, z zVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<List<b0>> aVar = zVar == null ? null : zVar.f44579a;
        Objects.requireNonNull(b0.f39111a);
        this.f44579a = h9.e.k(jSONObject, "items", z10, aVar, b0.f39112b, f44577c, eVarA, cVar);
    }

    public /* synthetic */ z(u9.c cVar, z zVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : zVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new y(y8.c0.N(this.f44579a, cVar, "items", jSONObject, f44576b, f44578d));
    }
}
