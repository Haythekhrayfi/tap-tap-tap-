package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f39344b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Double> f39345c = r.f42216p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, c0> f39346d = a.f39348c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f39347a;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39348c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public c0 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(c0.f39344b);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            return new c0(h9.c.g(jSONObject2, "ratio", h9.h.f30981d, c0.f39345c, cVar2.a(), h9.l.f31000d));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public c0(v9.b<Double> bVar) {
        fd.j0.i(bVar, "ratio");
        this.f39347a = bVar;
    }
}
