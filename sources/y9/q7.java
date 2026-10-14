package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q7 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f42185c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<Long> f42186d = j7.f40926h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, q7> f42187e = a.f42190c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f42188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7 f42189b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, q7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42190c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public q7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(q7.f42185c);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            v9.b bVarQ = h9.c.q(jSONObject2, "corner_radius", h9.h.f30982e, q7.f42186d, eVarA, cVar2, h9.l.f30998b);
            Objects.requireNonNull(c7.f39537d);
            return new q7(bVarQ, (c7) h9.c.n(jSONObject2, "stroke", c7.f39542i, eVarA, cVar2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public q7(v9.b<Long> bVar, c7 c7Var) {
        this.f42188a = bVar;
        this.f42189b = c7Var;
    }

    public /* synthetic */ q7(v9.b bVar, c7 c7Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : c7Var);
    }
}
