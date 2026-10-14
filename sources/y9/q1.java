package y9;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q1 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42118a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9.b<Long> f42119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9.b<Long> f42120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<Long> f42121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<Long> f42122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<String> f42123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<Long> f42124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f42125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, q1> f42126i;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, q1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42127c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public q1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(q1.f42118a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = q1.f42122e;
            v9.b<Long> bVar = q1.f42119b;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "disappear_duration", lVar, mVar, eVarA, bVar, kVar);
            v9.b<Long> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(t1.f42679c);
            t1 t1Var = (t1) h9.c.n(jSONObject2, "download_callbacks", t1.f42682f, eVarA, cVar2);
            h9.m<String> mVar2 = q1.f42123f;
            uc.l<?, ?> lVar2 = h9.c.f30973c;
            String str = (String) h9.c.c(jSONObject2, "log_id", lVar2, mVar2);
            h9.m<Long> mVar3 = q1.f42124g;
            v9.b<Long> bVar3 = q1.f42120c;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "log_limit", lVar, mVar3, eVarA, bVar3, kVar);
            v9.b<Long> bVar4 = bVarR2 == null ? bVar3 : bVarR2;
            JSONObject jSONObject3 = (JSONObject) h9.c.m(jSONObject2, "payload", lVar2, h9.c.f30971a, eVarA);
            uc.l<String, Uri> lVar3 = h9.h.f30979b;
            h9.k<Uri> kVar2 = h9.l.f31001e;
            v9.b bVarS = h9.c.s(jSONObject2, "referer", lVar3, eVarA, cVar2, kVar2);
            v9.b bVarS2 = h9.c.s(jSONObject2, ImagesContract.URL, lVar3, eVarA, cVar2, kVar2);
            h9.m<Long> mVar4 = q1.f42125h;
            v9.b<Long> bVar5 = q1.f42121d;
            v9.b<Long> bVarR3 = h9.c.r(jSONObject2, "visibility_percentage", lVar, mVar4, eVarA, bVar5, kVar);
            return new q1(bVar2, t1Var, str, bVar4, jSONObject3, bVarS, bVarS2, bVarR3 == null ? bVar5 : bVarR3);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f42119b = aVar.a(800L);
        f42120c = aVar.a(1L);
        f42121d = aVar.a(0L);
        f42122e = g1.f40097y;
        f42123f = g1.f40098z;
        f42124g = g1.A;
        f42125h = g1.B;
        f42126i = a.f42127c;
    }

    public q1(v9.b<Long> bVar, t1 t1Var, String str, v9.b<Long> bVar2, JSONObject jSONObject, v9.b<Uri> bVar3, v9.b<Uri> bVar4, v9.b<Long> bVar5) {
        fd.j0.i(bVar, "disappearDuration");
        fd.j0.i(str, "logId");
        fd.j0.i(bVar2, "logLimit");
        fd.j0.i(bVar5, "visibilityPercentage");
    }

    public /* synthetic */ q1(v9.b bVar, t1 t1Var, String str, v9.b bVar2, JSONObject jSONObject, v9.b bVar3, v9.b bVar4, v9.b bVar5, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f42119b : bVar, (i10 & 2) != 0 ? null : t1Var, str, (i10 & 8) != 0 ? f42120c : bVar2, (i10 & 16) != 0 ? null : jSONObject, (i10 & 32) != 0 ? null : bVar3, (i10 & 64) != 0 ? null : bVar4, (i10 & 128) != 0 ? f42121d : bVar5);
    }
}
