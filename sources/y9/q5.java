package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q5 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f42153b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.k<c> f42154c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<c> f42155a;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42156c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof c);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final q5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            Objects.requireNonNull(c.Converter);
            return new q5(h9.c.h(jSONObject, "value", c.FROM_STRING, eVarA, cVar, q5.f42154c));
        }
    }

    public enum c {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, c> FROM_STRING = a.f42157c;

        public static final class a extends vc.l implements uc.l<String, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42157c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public c invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                c cVar = c.NEAREST_CORNER;
                if (fd.j0.d(str2, cVar.value)) {
                    return cVar;
                }
                c cVar2 = c.FARTHEST_CORNER;
                if (fd.j0.d(str2, cVar2.value)) {
                    return cVar2;
                }
                c cVar3 = c.NEAREST_SIDE;
                if (fd.j0.d(str2, cVar3.value)) {
                    return cVar3;
                }
                c cVar4 = c.FARTHEST_SIDE;
                if (fd.j0.d(str2, cVar4.value)) {
                    return cVar4;
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

        c(String str) {
            this.value = str;
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(c.values());
        a aVar = a.f42156c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar, "validator");
        f42154c = new h9.k.a.C0302a(objQ, aVar);
    }

    public q5(v9.b<c> bVar) {
        fd.j0.i(bVar, "value");
        this.f42155a = bVar;
    }
}
