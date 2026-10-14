package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r5 implements u9.a, u9.b<q5> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h9.k<q5.c> f42323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<q5.c>> f42324c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<q5.c>> f42325a;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42326c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof q5.c);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q5.c>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42327c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<q5.c> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q5.c.Converter);
            return h9.c.h(jSONObject2, str2, q5.c.FROM_STRING, cVar2.a(), cVar2, r5.f42323b);
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
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(q5.c.values());
        a aVar = a.f42326c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar, "validator");
        f42323b = new h9.k.a.C0302a(objQ, aVar);
        f42324c = b.f42327c;
    }

    public r5(u9.c cVar, r5 r5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<q5.c>> aVar = r5Var == null ? null : r5Var.f42325a;
        Objects.requireNonNull(q5.c.Converter);
        this.f42325a = h9.e.j(jSONObject, "value", z10, aVar, q5.c.FROM_STRING, eVarA, cVar, f42323b);
    }

    public /* synthetic */ r5(u9.c cVar, r5 r5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : r5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new q5((v9.b) y8.c0.E(this.f42325a, cVar, "value", jSONObject, f42324c));
    }
}
