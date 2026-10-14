package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q8 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f42191d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Boolean> f42192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f42193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f42194c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final q8 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            v9.b bVarS = h9.c.s(jSONObject, "constrained", h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
            Objects.requireNonNull(b.f42195c);
            uc.p<u9.c, JSONObject, b> pVar = b.f42199g;
            return new q8(bVarS, (b) h9.c.n(jSONObject, "max_size", pVar, eVarA, cVar), (b) h9.c.n(jSONObject, "min_size", pVar, eVarA, cVar));
        }
    }

    public static class b implements u9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42195c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v9.b<n6> f42196d = v9.b.f36747a.a(n6.DP);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.k<n6> f42197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<Long> f42198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, b> f42199g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<n6> f42200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<Long> f42201b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, b> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42202c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public b invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(b.f42195c);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(n6.Converter);
                uc.l lVar = n6.FROM_STRING;
                v9.b<n6> bVar = b.f42196d;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, "unit", lVar, eVarA, cVar2, bVar, b.f42197e);
                if (bVarT == null) {
                    bVarT = bVar;
                }
                return new b(bVarT, h9.c.g(jSONObject2, "value", h9.h.f30982e, b.f42198f, eVarA, h9.l.f30998b));
            }
        }

        /* JADX INFO: renamed from: y9.q8$b$b, reason: collision with other inner class name */
        public static final class C0477b extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0477b f42203c = new C0477b();

            public C0477b() {
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
            C0477b c0477b = C0477b.f42203c;
            fd.j0.i(objQ, "default");
            fd.j0.i(c0477b, "validator");
            f42197e = new h9.k.a.C0302a(objQ, c0477b);
            f42198f = l8.f41372m;
            f42199g = a.f42202c;
        }

        public b(v9.b<n6> bVar, v9.b<Long> bVar2) {
            fd.j0.i(bVar, "unit");
            fd.j0.i(bVar2, "value");
            this.f42200a = bVar;
            this.f42201b = bVar2;
        }

        public /* synthetic */ b(v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? f42196d : bVar, bVar2);
        }
    }

    public q8() {
        this(null, null, null, 7, null);
    }

    public q8(v9.b<Boolean> bVar, b bVar2, b bVar3) {
        this.f42192a = bVar;
        this.f42193b = bVar2;
        this.f42194c = bVar3;
    }

    public /* synthetic */ q8(v9.b bVar, b bVar2, b bVar3, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : bVar3);
    }
}
