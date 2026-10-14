package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r8 implements u9.a, u9.b<q8> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f42363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, q8.b> f42364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, q8.b> f42365f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f42366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<e> f42367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<e> f42368c;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42369c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30980c, cVar2.a(), cVar2, h9.l.f30997a);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, q8.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42370c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public q8.b b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q8.b.f42195c);
            return (q8.b) h9.c.n(jSONObject2, str2, q8.b.f42199g, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, q8.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42371c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public q8.b b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q8.b.f42195c);
            return (q8.b) h9.c.n(jSONObject2, str2, q8.b.f42199g, cVar2.a(), cVar2);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    public static class e implements u9.a, u9.b<q8.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0478e f42372c = new C0478e(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v9.b<n6> f42373d = v9.b.f36747a.a(n6.DP);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.k<n6> f42374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<Long> f42375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<Long> f42376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f42377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42378i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, e> f42379j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<n6>> f42380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f42381b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42382c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public e invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new e(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f42383c = new b();

            public b() {
                super(1);
            }

            @Override // uc.l
            public Boolean invoke(Object obj) {
                fd.j0.i(obj, "it");
                return Boolean.valueOf(obj instanceof n6);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f42384c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<n6> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(n6.Converter);
                uc.l lVar = n6.FROM_STRING;
                u9.e eVarA = cVar2.a();
                v9.b<n6> bVar = e.f42373d;
                v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, e.f42374e);
                return bVarT == null ? bVar : bVarT;
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f42385c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, e.f42376g, cVar2.a(), h9.l.f30998b);
            }
        }

        /* JADX INFO: renamed from: y9.r8$e$e, reason: collision with other inner class name */
        public static final class C0478e {
            public C0478e() {
            }

            public C0478e(vc.g gVar) {
            }
        }

        static {
            int i10 = h9.k.f30992a;
            Object objQ = kc.j.q(n6.values());
            b bVar = b.f42383c;
            fd.j0.i(objQ, "default");
            fd.j0.i(bVar, "validator");
            f42374e = new h9.k.a.C0302a(objQ, bVar);
            f42375f = k8.f41145q;
            f42376g = l8.f41373n;
            f42377h = c.f42384c;
            f42378i = d.f42385c;
            f42379j = a.f42382c;
        }

        public e(u9.c cVar, e eVar, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<n6>> aVar = eVar == null ? null : eVar.f42380a;
            Objects.requireNonNull(n6.Converter);
            j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "unit", z10, aVar, n6.FROM_STRING, eVarA, cVar, f42374e);
            fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
            this.f42380a = aVarS;
            this.f42381b = h9.e.i(jSONObject, "value", z10, eVar == null ? null : eVar.f42381b, h9.h.f30982e, f42375f, eVarA, cVar, h9.l.f30998b);
        }

        public /* synthetic */ e(u9.c cVar, e eVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            v9.b<n6> bVar = (v9.b) y8.c0.H(this.f42380a, cVar, "unit", jSONObject, f42377h);
            if (bVar == null) {
                bVar = f42373d;
            }
            return new q8.b(bVar, (v9.b) y8.c0.E(this.f42381b, cVar, "value", jSONObject, f42378i));
        }
    }

    static {
        new d(null);
        f42363d = a.f42369c;
        f42364e = b.f42370c;
        f42365f = c.f42371c;
    }

    public r8(u9.c cVar, r8 r8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Boolean>> aVarS = h9.e.s(jSONObject, "constrained", z10, r8Var == null ? null : r8Var.f42366a, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f42366a = aVarS;
        j9.a<e> aVar = r8Var == null ? null : r8Var.f42367b;
        Objects.requireNonNull(e.f42372c);
        uc.p<u9.c, JSONObject, e> pVar = e.f42379j;
        j9.a<e> aVarO = h9.e.o(jSONObject, "max_size", z10, aVar, pVar, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42367b = aVarO;
        j9.a<e> aVarO2 = h9.e.o(jSONObject, "min_size", z10, r8Var == null ? null : r8Var.f42368c, pVar, eVarA, cVar);
        fd.j0.h(aVarO2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42368c = aVarO2;
    }

    public /* synthetic */ r8(u9.c cVar, r8 r8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : r8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new q8((v9.b) y8.c0.H(this.f42366a, cVar, "constrained", jSONObject, f42363d), (q8.b) y8.c0.K(this.f42367b, cVar, "max_size", jSONObject, f42364e), (q8.b) y8.c0.K(this.f42368c, cVar, "min_size", jSONObject, f42365f));
    }
}
