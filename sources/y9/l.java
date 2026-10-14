package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l implements u9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f41153e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Long> f41154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f41155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Long> f41156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f41157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Long> f41158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f41159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<Long> f41160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f41161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, l> f41162n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f41163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f41164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Long> f41165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Long> f41166d;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41167c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public l invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(l.f41153e);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = l.f41158j;
            v9.b<Long> bVar = l.f41154f;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "bottom", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            h9.m<Long> mVar2 = l.f41159k;
            v9.b<Long> bVar2 = l.f41155g;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "left", lVar, mVar2, eVarA, bVar2, kVar);
            if (bVarR2 != null) {
                bVar2 = bVarR2;
            }
            h9.m<Long> mVar3 = l.f41160l;
            v9.b<Long> bVar3 = l.f41156h;
            v9.b<Long> bVarR3 = h9.c.r(jSONObject2, "right", lVar, mVar3, eVarA, bVar3, kVar);
            if (bVarR3 != null) {
                bVar3 = bVarR3;
            }
            h9.m<Long> mVar4 = l.f41161m;
            v9.b<Long> bVar4 = l.f41157i;
            v9.b<Long> bVarR4 = h9.c.r(jSONObject2, "top", lVar, mVar4, eVarA, bVar4, kVar);
            if (bVarR4 != null) {
                bVar4 = bVarR4;
            }
            return new l(bVar, bVar2, bVar3, bVar4);
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
        f41154f = aVar.a(0L);
        f41155g = aVar.a(0L);
        f41156h = aVar.a(0L);
        f41157i = aVar.a(0L);
        f41158j = p7.d1.f34495s;
        f41159k = p7.d1.f34496t;
        f41160l = p7.d1.f34497u;
        f41161m = p7.d1.f34498v;
        f41162n = a.f41167c;
    }

    public l() {
        this(null, null, null, null, 15, null);
    }

    public l(v9.b<Long> bVar, v9.b<Long> bVar2, v9.b<Long> bVar3, v9.b<Long> bVar4) {
        fd.j0.i(bVar, "bottom");
        fd.j0.i(bVar2, "left");
        fd.j0.i(bVar3, "right");
        fd.j0.i(bVar4, "top");
        this.f41163a = bVar;
        this.f41164b = bVar2;
        this.f41165c = bVar3;
        this.f41166d = bVar4;
    }

    public /* synthetic */ l(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f41154f : bVar, (i10 & 2) != 0 ? f41155g : bVar2, (i10 & 4) != 0 ? f41156h : bVar3, (i10 & 8) != 0 ? f41157i : bVar4);
    }
}
