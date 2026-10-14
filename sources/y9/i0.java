package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i0 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40528b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Long> f40529c = r.f42218r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f40530a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final i0 a(u9.c cVar, JSONObject jSONObject) {
            return new i0(h9.c.g(jSONObject, "radius", h9.h.f30982e, i0.f40529c, cVar.a(), h9.l.f30998b));
        }
    }

    public i0(v9.b<Long> bVar) {
        fd.j0.i(bVar, "radius");
        this.f40530a = bVar;
    }
}
