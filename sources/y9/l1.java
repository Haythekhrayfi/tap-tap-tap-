package y9;

import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l1 implements u9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f41189h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<b8> f41190i = v9.b.f36747a.a(b8.NONE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<b8> f41191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f41192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.g<c> f41193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.g<v7> f41194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.g<d8> f41195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.g<e8> f41196o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f41198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<v7> f41199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<b8> f41200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d8> f41201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e8> f41202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Exception> f41203g;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41204c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof b8);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final l1 a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            w8.c cVar2 = new w8.c(cVar);
            u9.e eVar = cVar2.f37169d;
            String str = (String) h9.c.c(jSONObject, "log_id", h9.c.f30973c, l1.f41192k);
            Objects.requireNonNull(c.f41205c);
            List listY = h9.c.y(jSONObject, "states", c.f41206d, l1.f41193l, eVar, cVar2);
            fd.j0.h(listY, "readStrictList(json, \"st…S_VALIDATOR, logger, env)");
            Objects.requireNonNull(v7.f43570g);
            List listW = h9.c.w(jSONObject, "timers", v7.f43578o, l1.f41194m, eVar, cVar2);
            Objects.requireNonNull(b8.Converter);
            uc.l lVar = b8.FROM_STRING;
            v9.b<b8> bVar = l1.f41190i;
            v9.b<b8> bVarT = h9.c.t(jSONObject, "transition_animation_selector", lVar, eVar, cVar2, bVar, l1.f41191j);
            if (bVarT != null) {
                bVar = bVarT;
            }
            Objects.requireNonNull(d8.f39711d);
            List listW2 = h9.c.w(jSONObject, "variable_triggers", d8.f39715h, l1.f41195n, eVar, cVar2);
            Objects.requireNonNull(e8.f39900a);
            return new l1(str, listY, listW, bVar, listW2, h9.c.w(jSONObject, "variables", e8.f39901b, l1.f41196o, eVar, cVar2), kc.t.H(cVar2.f37167b));
        }
    }

    public static class c implements u9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41205c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, c> f41206d = a.f41209c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f41207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f41208b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41209c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public c invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(c.f41205c);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                cVar2.a();
                Objects.requireNonNull(k.f40973a);
                uc.p<u9.c, JSONObject, k> pVar = k.f40974b;
                h9.m<?> mVar = h9.c.f30971a;
                return new c((k) h9.c.d(jSONObject2, "div", pVar, mVar, cVar2), ((Number) h9.c.c(jSONObject2, "state_id", h9.h.f30982e, mVar)).longValue());
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        public c(k kVar, long j10) {
            fd.j0.i(kVar, "div");
            this.f41207a = kVar;
            this.f41208b = j10;
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(b8.values());
        a aVar = a.f41204c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar, "validator");
        f41191j = new h9.k.a.C0302a(objQ, aVar);
        f41192k = g1.f40094v;
        f41193l = k1.f41002d;
        f41194m = g1.f40095w;
        f41195n = k1.f41003e;
        f41196o = g1.f40096x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l1(String str, List<? extends c> list, List<? extends v7> list2, v9.b<b8> bVar, List<? extends d8> list3, List<? extends e8> list4, List<? extends Exception> list5) {
        fd.j0.i(str, "logId");
        fd.j0.i(list, "states");
        fd.j0.i(bVar, "transitionAnimationSelector");
        this.f41197a = str;
        this.f41198b = list;
        this.f41199c = list2;
        this.f41200d = bVar;
        this.f41201e = list3;
        this.f41202f = list4;
        this.f41203g = list5;
    }

    public /* synthetic */ l1(String str, List list, List list2, v9.b bVar, List list3, List list4, List list5, int i10, vc.g gVar) {
        this(str, list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? f41190i : bVar, (i10 & 16) != 0 ? null : list3, (i10 & 32) != 0 ? null : list4, (i10 & 64) != 0 ? null : list5);
    }
}
