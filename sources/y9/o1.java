package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o1 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f41735c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<n6> f41736d = v9.b.f36747a.a(n6.DP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.k<n6> f41737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, o1> f41738f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<n6> f41739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Double> f41740b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, o1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41741c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public o1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(o1.f41735c);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            v9.b<n6> bVar = o1.f41736d;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, "unit", lVar, eVarA, cVar2, bVar, o1.f41737e);
            if (bVarT != null) {
                bVar = bVarT;
            }
            return new o1(bVar, h9.c.h(jSONObject2, "value", h9.h.f30981d, eVarA, cVar2, h9.l.f31000d));
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41742c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        b bVar = b.f41742c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f41737e = new h9.k.a.C0302a(objQ, bVar);
        f41738f = a.f41741c;
    }

    public o1(v9.b<n6> bVar, v9.b<Double> bVar2) {
        fd.j0.i(bVar, "unit");
        fd.j0.i(bVar2, "value");
        this.f41739a = bVar;
        this.f41740b = bVar2;
    }

    public /* synthetic */ o1(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f41736d : bVar, bVar2);
    }
}
