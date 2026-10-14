package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k5 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f41097c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<n6> f41098d = v9.b.f36747a.a(n6.DP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.k<n6> f41099e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<n6> f41100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f41101b;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41102c = new a();

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

        public final k5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            v9.b<n6> bVar = k5.f41098d;
            v9.b<n6> bVarT = h9.c.t(jSONObject, "unit", lVar, eVarA, cVar, bVar, k5.f41099e);
            if (bVarT != null) {
                bVar = bVarT;
            }
            return new k5(bVar, h9.c.h(jSONObject, "value", h9.h.f30982e, eVarA, cVar, h9.l.f30998b));
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        a aVar = a.f41102c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar, "validator");
        f41099e = new h9.k.a.C0302a(objQ, aVar);
    }

    public k5(v9.b<n6> bVar, v9.b<Long> bVar2) {
        fd.j0.i(bVar, "unit");
        fd.j0.i(bVar2, "value");
        this.f41100a = bVar;
        this.f41101b = bVar2;
    }

    public /* synthetic */ k5(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f41098d : bVar, bVar2);
    }
}
