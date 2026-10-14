package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i4 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40604b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Double> f40605c = x3.f44081v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f40606a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final i4 a(u9.c cVar, JSONObject jSONObject) {
            return new i4(h9.c.q(jSONObject, "weight", h9.h.f30981d, i4.f40605c, cVar.a(), cVar, h9.l.f31000d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public i4(v9.b<Double> bVar) {
        this.f40606a = bVar;
    }

    public /* synthetic */ i4(v9.b bVar, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar);
    }
}
