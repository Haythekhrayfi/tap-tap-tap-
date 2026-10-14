package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a5 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39061c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<n6> f39062d = v9.b.f36747a.a(n6.DP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.k<n6> f39063e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<n6> f39064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f39065b;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39066c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final a5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            v9.b<n6> bVar = a5.f39062d;
            v9.b<n6> bVarT = h9.c.t(jSONObject, "unit", lVar, eVarA, cVar, bVar, a5.f39063e);
            if (bVarT != null) {
                bVar = bVarT;
            }
            return new a5(bVar, h9.c.s(jSONObject, "value", h9.h.f30982e, eVarA, cVar, h9.l.f30998b));
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        a aVar = a.f39066c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar, "validator");
        f39063e = new h9.k.a.C0302a(objQ, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a5() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public a5(v9.b<n6> bVar, v9.b<Long> bVar2) {
        fd.j0.i(bVar, "unit");
        this.f39064a = bVar;
        this.f39065b = bVar2;
    }

    public /* synthetic */ a5(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39062d : bVar, (i10 & 2) != 0 ? null : bVar2);
    }
}
