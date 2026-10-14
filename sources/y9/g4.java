package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g4 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40159c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<Long> f40160d = v9.b.f36747a.a(0L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<Long> f40161e = w3.f43738q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.g<Integer> f40162f = x3.f44078s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f40163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.c<Integer> f40164b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final g4 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = g4.f40161e;
            v9.b<Long> bVar = g4.f40160d;
            v9.b<Long> bVarR = h9.c.r(jSONObject, "angle", lVar, mVar, eVarA, bVar, h9.l.f30998b);
            if (bVarR != null) {
                bVar = bVarR;
            }
            return new g4(bVar, h9.c.j(jSONObject, "colors", h9.h.f30978a, g4.f40162f, eVarA, cVar, h9.l.f31002f));
        }
    }

    public g4(v9.b<Long> bVar, v9.c<Integer> cVar) {
        fd.j0.i(bVar, "angle");
        fd.j0.i(cVar, "colors");
        this.f40163a = bVar;
        this.f40164b = cVar;
    }

    public /* synthetic */ g4(v9.b bVar, v9.c cVar, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f40160d : bVar, cVar);
    }
}
