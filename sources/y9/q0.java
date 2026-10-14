package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q0 implements u9.a, u9.b<p0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.g<r0> f42113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.g<s0> f42114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<r0>> f42115d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<List<s0>> f42116a;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, List<r0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42117c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public List<r0> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(r0.f42228a);
            List<r0> listL = h9.c.l(jSONObject2, str2, r0.f42229b, q0.f42113b, cVar2.a(), cVar2);
            fd.j0.h(listL, "readList(json, key, DivC…LIDATOR, env.logger, env)");
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
        f42113b = r.f42226z;
        f42114c = n0.f41606f;
        f42115d = a.f42117c;
    }

    public q0(u9.c cVar, q0 q0Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<List<s0>> aVar = q0Var == null ? null : q0Var.f42116a;
        Objects.requireNonNull(s0.f42435a);
        this.f42116a = h9.e.k(jSONObject, "items", z10, aVar, s0.f42436b, f42114c, eVarA, cVar);
    }

    public /* synthetic */ q0(u9.c cVar, q0 q0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : q0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new p0(y8.c0.N(this.f42116a, cVar, "items", jSONObject, f42113b, f42115d));
    }
}
