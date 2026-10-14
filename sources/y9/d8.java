package y9;

import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d8 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f39711d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<d> f39712e = v9.b.f36747a.a(d.ON_CONDITION);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.k<d> f39713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.g<q> f39714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, d8> f39715h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f39716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Boolean> f39717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<d> f39718c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, d8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39719c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public d8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(d8.f39711d);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(q.f42091g);
            List listL = h9.c.l(jSONObject2, "actions", q.f42095k, d8.f39714g, eVarA, cVar2);
            fd.j0.h(listL, "readList(json, \"actions\"…S_VALIDATOR, logger, env)");
            v9.b bVarH = h9.c.h(jSONObject2, "condition", h9.h.f30980c, eVarA, cVar2, h9.l.f30997a);
            Objects.requireNonNull(d.Converter);
            uc.l lVar = d.FROM_STRING;
            v9.b<d> bVar = d8.f39712e;
            v9.b<d> bVarT = h9.c.t(jSONObject2, "mode", lVar, eVarA, cVar2, bVar, d8.f39713f);
            if (bVarT != null) {
                bVar = bVarT;
            }
            return new d8(listL, bVarH, bVar);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39720c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof d);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public enum d {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");

        public static final b Converter = new b(null);
        private static final uc.l<String, d> FROM_STRING = a.f39721c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f39721c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public d invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                d dVar = d.ON_CONDITION;
                if (fd.j0.d(str2, dVar.value)) {
                    return dVar;
                }
                d dVar2 = d.ON_VARIABLE;
                if (fd.j0.d(str2, dVar2.value)) {
                    return dVar2;
                }
                return null;
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        d(String str) {
            this.value = str;
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(d.values());
        b bVar = b.f39720c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f39713f = new h9.k.a.C0302a(objQ, bVar);
        f39714g = w7.f43812f;
        f39715h = a.f39719c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d8(List<? extends q> list, v9.b<Boolean> bVar, v9.b<d> bVar2) {
        fd.j0.i(list, "actions");
        fd.j0.i(bVar, "condition");
        fd.j0.i(bVar2, "mode");
        this.f39716a = list;
        this.f39717b = bVar;
        this.f39718c = bVar2;
    }

    public /* synthetic */ d8(List list, v9.b bVar, v9.b bVar2, int i10, vc.g gVar) {
        this(list, bVar, (i10 & 4) != 0 ? f39712e : bVar2);
    }
}
