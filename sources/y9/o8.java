package y9;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o8 implements u9.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f41845i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f41846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<Long> f41847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Long> f41848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<String> f41849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f41850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f41851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f41852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, o8> f41853q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f41854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Long> f41856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f41857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Uri> f41858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<Uri> f41859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Long> f41860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.b<Long> f41861h;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, o8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41862c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public o8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(o8.f41845i);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(t1.f42679c);
            t1 t1Var = (t1) h9.c.n(jSONObject2, "download_callbacks", t1.f42682f, eVarA, cVar2);
            h9.m<String> mVar = o8.f41849m;
            uc.l<?, ?> lVar = h9.c.f30973c;
            String str = (String) h9.c.c(jSONObject2, "log_id", lVar, mVar);
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = o8.f41850n;
            v9.b<Long> bVar = o8.f41846j;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "log_limit", lVar2, mVar2, eVarA, bVar, kVar);
            v9.b<Long> bVar2 = bVarR == null ? bVar : bVarR;
            JSONObject jSONObject3 = (JSONObject) h9.c.m(jSONObject2, "payload", lVar, h9.c.f30971a, eVarA);
            uc.l<String, Uri> lVar3 = h9.h.f30979b;
            h9.k<Uri> kVar2 = h9.l.f31001e;
            v9.b bVarS = h9.c.s(jSONObject2, "referer", lVar3, eVarA, cVar2, kVar2);
            v9.b bVarS2 = h9.c.s(jSONObject2, ImagesContract.URL, lVar3, eVarA, cVar2, kVar2);
            h9.m<Long> mVar3 = o8.f41851o;
            v9.b<Long> bVar3 = o8.f41847k;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "visibility_duration", lVar2, mVar3, eVarA, bVar3, kVar);
            v9.b<Long> bVar4 = bVarR2 == null ? bVar3 : bVarR2;
            h9.m<Long> mVar4 = o8.f41852p;
            v9.b<Long> bVar5 = o8.f41848l;
            v9.b<Long> bVarR3 = h9.c.r(jSONObject2, "visibility_percentage", lVar2, mVar4, eVarA, bVar5, kVar);
            return new o8(t1Var, str, bVar2, jSONObject3, bVarS, bVarS2, bVar4, bVarR3 == null ? bVar5 : bVarR3);
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
        f41846j = aVar.a(1L);
        f41847k = aVar.a(800L);
        f41848l = aVar.a(50L);
        f41849m = l8.f41364e;
        f41850n = l8.f41365f;
        f41851o = l8.f41366g;
        f41852p = l8.f41367h;
        f41853q = a.f41862c;
    }

    public o8(t1 t1Var, String str, v9.b<Long> bVar, JSONObject jSONObject, v9.b<Uri> bVar2, v9.b<Uri> bVar3, v9.b<Long> bVar4, v9.b<Long> bVar5) {
        fd.j0.i(str, "logId");
        fd.j0.i(bVar, "logLimit");
        fd.j0.i(bVar4, "visibilityDuration");
        fd.j0.i(bVar5, "visibilityPercentage");
        this.f41854a = t1Var;
        this.f41855b = str;
        this.f41856c = bVar;
        this.f41857d = jSONObject;
        this.f41858e = bVar2;
        this.f41859f = bVar3;
        this.f41860g = bVar4;
        this.f41861h = bVar5;
    }

    public /* synthetic */ o8(t1 t1Var, String str, v9.b bVar, JSONObject jSONObject, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : t1Var, str, (i10 & 4) != 0 ? f41846j : bVar, (i10 & 8) != 0 ? null : jSONObject, (i10 & 16) != 0 ? null : bVar2, (i10 & 32) != 0 ? null : bVar3, (i10 & 64) != 0 ? f41847k : bVar4, (i10 & 128) != 0 ? f41848l : bVar5);
    }
}
