package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x4 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f44086b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Double> f44087c = q4.f42147u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, x4> f44088d = a.f44090c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f44089a;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, x4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44090c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public x4 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(x4.f44086b);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            return new x4(h9.c.g(jSONObject2, "value", h9.h.f30981d, x4.f44087c, cVar2.a(), h9.l.f31000d));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public x4(v9.b<Double> bVar) {
        fd.j0.i(bVar, "value");
        this.f44089a = bVar;
    }
}
