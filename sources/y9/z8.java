package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z8 implements u9.a, u9.b<y8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f44795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f44796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f44797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, Uri> f44798f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f44799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<Uri> f44800b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44801c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = z8.f44796d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, Uri> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44802c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public Uri b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<String, Uri> lVar = h9.h.f30979b;
            cVar2.a();
            return (Uri) h9.c.c(jSONObject2, str2, lVar, h9.c.f30971a);
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
        f44795c = k8.f41149u;
        f44796d = l8.f41381v;
        f44797e = a.f44801c;
        f44798f = b.f44802c;
    }

    public z8(u9.c cVar, z8 z8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f44799a = h9.e.b(jSONObject, "name", z10, z8Var == null ? null : z8Var.f44799a, f44795c, eVarA, cVar);
        this.f44800b = h9.e.e(jSONObject, "value", z10, z8Var == null ? null : z8Var.f44800b, h9.h.f30979b, eVarA, cVar);
    }

    public /* synthetic */ z8(u9.c cVar, z8 z8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : z8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new y8((String) y8.c0.E(this.f44799a, cVar, "name", jSONObject, f44797e), (Uri) y8.c0.E(this.f44800b, cVar, "value", jSONObject, f44798f));
    }
}
