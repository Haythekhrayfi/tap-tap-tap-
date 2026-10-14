package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n4 implements u9.a, u9.b<m4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f41681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f41682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, l> f41683e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f41684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<n> f41685b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41686c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Uri> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30979b, cVar2.a(), cVar2, h9.l.f31001e);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41687c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public l b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(l.f41153e);
            l lVar = (l) h9.c.n(jSONObject2, str2, l.f41162n, cVar2.a(), cVar2);
            return lVar == null ? n4.f41681c : lVar;
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
        f41681c = new l(null, null, null, null, 15, null);
        f41682d = a.f41686c;
        f41683e = b.f41687c;
    }

    public n4(u9.c cVar, n4 n4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f41684a = h9.e.j(jSONObject, "image_url", z10, n4Var == null ? null : n4Var.f41684a, h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
        j9.a<n> aVar = n4Var == null ? null : n4Var.f41685b;
        Objects.requireNonNull(n.f41577e);
        j9.a<n> aVarO = h9.e.o(jSONObject, "insets", z10, aVar, n.f41594v, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f41685b = aVarO;
    }

    public /* synthetic */ n4(u9.c cVar, n4 n4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : n4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m4 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b bVar = (v9.b) y8.c0.E(this.f41684a, cVar, "image_url", jSONObject, f41682d);
        l lVar = (l) y8.c0.M(this.f41685b, cVar, "insets", jSONObject, f41683e);
        if (lVar == null) {
            lVar = f41681c;
        }
        return new m4(bVar, lVar);
    }
}
