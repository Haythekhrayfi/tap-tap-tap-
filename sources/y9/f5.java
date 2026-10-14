package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f5 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39958c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, f5> f39959d = a.f39962c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f39960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f39961b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, f5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39962c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public f5 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(f5.f39958c);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            cVar2.a();
            Objects.requireNonNull(o1.f41735c);
            uc.p<u9.c, JSONObject, o1> pVar = o1.f41738f;
            h9.m<?> mVar = h9.c.f30971a;
            return new f5((o1) h9.c.d(jSONObject2, "x", pVar, mVar, cVar2), (o1) h9.c.d(jSONObject2, "y", pVar, mVar, cVar2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public f5(o1 o1Var, o1 o1Var2) {
        fd.j0.i(o1Var, "x");
        fd.j0.i(o1Var2, "y");
        this.f39960a = o1Var;
        this.f39961b = o1Var2;
    }
}
