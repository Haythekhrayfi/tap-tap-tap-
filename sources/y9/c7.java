package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c7 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f39537d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<n6> f39538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Long> f39539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.k<n6> f39540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f39541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, c7> f39542i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Integer> f39543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<n6> f39544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Long> f39545c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, c7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39546c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public c7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(c7.f39537d);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            v9.b bVarH = h9.c.h(jSONObject2, "color", h9.h.f30978a, eVarA, cVar2, h9.l.f31002f);
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            v9.b<n6> bVar = c7.f39538e;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, "unit", lVar, eVarA, cVar2, bVar, c7.f39540g);
            if (bVarT != null) {
                bVar = bVarT;
            }
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar = c7.f39541h;
            v9.b<Long> bVar2 = c7.f39539f;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "width", lVar2, mVar, eVarA, bVar2, h9.l.f30998b);
            if (bVarR != null) {
                bVar2 = bVarR;
            }
            return new c7(bVarH, bVar, bVar2);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39547c = new b();

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
        v9.b.a aVar = v9.b.f36747a;
        f39538e = aVar.a(n6.DP);
        f39539f = aVar.a(1L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        b bVar = b.f39547c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f39540g = new h9.k.a.C0302a(objQ, bVar);
        f39541h = y6.f44529p;
        f39542i = a.f39546c;
    }

    public c7(v9.b<Integer> bVar, v9.b<n6> bVar2, v9.b<Long> bVar3) {
        fd.j0.i(bVar, "color");
        fd.j0.i(bVar2, "unit");
        fd.j0.i(bVar3, "width");
        this.f39543a = bVar;
        this.f39544b = bVar2;
        this.f39545c = bVar3;
    }

    public /* synthetic */ c7(v9.b bVar, v9.b bVar2, v9.b bVar3, int i10, vc.g gVar) {
        this(bVar, (i10 & 2) != 0 ? f39538e : bVar2, (i10 & 4) != 0 ? f39539f : bVar3);
    }
}
