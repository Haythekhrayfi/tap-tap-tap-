package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b1 implements u9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f39118e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<Long> f39119f = v0.f43417v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<Long> f39120g = v0.f43418w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f39121h = v0.f43419x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f39122i = v0.f43420y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, b1> f39123j = a.f39128c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f39124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f39125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Long> f39126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Long> f39127d;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, b1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39128c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public b1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(b1.f39118e);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = b1.f39119f;
            h9.k<Long> kVar = h9.l.f30998b;
            return new b1(h9.c.q(jSONObject2, "bottom-left", lVar, mVar, eVarA, cVar2, kVar), h9.c.q(jSONObject2, "bottom-right", lVar, b1.f39120g, eVarA, cVar2, kVar), h9.c.q(jSONObject2, "top-left", lVar, b1.f39121h, eVarA, cVar2, kVar), h9.c.q(jSONObject2, "top-right", lVar, b1.f39122i, eVarA, cVar2, kVar));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public b1() {
        this(null, null, null, null, 15, null);
    }

    public b1(v9.b<Long> bVar, v9.b<Long> bVar2, v9.b<Long> bVar3, v9.b<Long> bVar4) {
        this.f39124a = bVar;
        this.f39125b = bVar2;
        this.f39126c = bVar3;
        this.f39127d = bVar4;
    }

    public /* synthetic */ b1(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : bVar3, (i10 & 8) != 0 ? null : bVar4);
    }
}
