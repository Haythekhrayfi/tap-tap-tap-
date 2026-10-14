package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l2 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f41210c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<n6> f41211d = v9.b.f36747a.a(n6.DP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.k<n6> f41212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<Long> f41213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, l2> f41214g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<n6> f41215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f41216b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, l2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41217c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public l2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return l2.f41210c.a(cVar2, jSONObject2);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41218c = new b();

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

        public final l2 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            v9.b<n6> bVar = l2.f41211d;
            v9.b<n6> bVarT = h9.c.t(jSONObject, "unit", lVar, eVarA, cVar, bVar, l2.f41212e);
            if (bVarT != null) {
                bVar = bVarT;
            }
            return new l2(bVar, h9.c.g(jSONObject, "value", h9.h.f30982e, l2.f41213f, eVarA, h9.l.f30998b));
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        b bVar = b.f41218c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f41212e = new h9.k.a.C0302a(objQ, bVar);
        f41213f = g2.f40110n;
        f41214g = a.f41217c;
    }

    public l2(v9.b<n6> bVar, v9.b<Long> bVar2) {
        fd.j0.i(bVar, "unit");
        fd.j0.i(bVar2, "value");
        this.f41215a = bVar;
        this.f41216b = bVar2;
    }

    public /* synthetic */ l2(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f41211d : bVar, bVar2);
    }
}
