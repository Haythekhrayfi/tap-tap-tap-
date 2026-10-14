package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z1 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44582c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f44583d = r1.f42246q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, z1> f44584e = a.f44587c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f44586b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, z1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44587c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public z1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(z1.f44582c);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            h9.m<String> mVar = z1.f44583d;
            uc.l<?, ?> lVar = h9.c.f30973c;
            return new z1((String) h9.c.c(jSONObject2, FacebookMediationAdapter.KEY_ID, lVar, mVar), (JSONObject) h9.c.m(jSONObject2, "params", lVar, h9.c.f30971a, eVarA));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public z1(String str, JSONObject jSONObject) {
        fd.j0.i(str, FacebookMediationAdapter.KEY_ID);
        this.f44585a = str;
        this.f44586b = jSONObject;
    }

    public /* synthetic */ z1(String str, JSONObject jSONObject, int i10, vc.g gVar) {
        this(str, (i10 & 2) != 0 ? null : jSONObject);
    }
}
