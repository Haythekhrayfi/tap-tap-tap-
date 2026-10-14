package y9;

import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t1 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f42679c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.g<q> f42680d = k1.f41008j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.g<q> f42681e = r1.f42235f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, t1> f42682f = a.f42685c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f42683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<q> f42684b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, t1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42685c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public t1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(t1.f42679c);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(q.f42091g);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            return new t1(h9.c.w(jSONObject2, "on_fail_actions", pVar, t1.f42680d, eVarA, cVar2), h9.c.w(jSONObject2, "on_success_actions", pVar, t1.f42681e, eVarA, cVar2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t1(List<? extends q> list, List<? extends q> list2) {
        this.f42683a = list;
        this.f42684b = list2;
    }

    public /* synthetic */ t1(List list, List list2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
