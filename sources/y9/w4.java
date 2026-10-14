package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w4 implements u9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f43749b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9.b<d> f43750c = v9.b.f36747a.a(d.PARTIAL);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.k<d> f43751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.g<a> f43752e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f43753a;

    public static class a implements u9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43754c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h9.g<k> f43755d = q4.f42146t;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, a> f43756e = C0479a.f43759c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<k> f43758b;

        /* JADX INFO: renamed from: y9.w4$a$a, reason: collision with other inner class name */
        public static final class C0479a extends vc.l implements uc.p<u9.c, JSONObject, a> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0479a f43759c = new C0479a();

            public C0479a() {
                super(2);
            }

            @Override // uc.p
            public a invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(a.f43754c);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                String str = (String) h9.c.c(jSONObject2, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, h9.c.f30971a);
                Objects.requireNonNull(k.f40973a);
                return new a(str, h9.c.w(jSONObject2, "items", k.f40974b, a.f43755d, eVarA, cVar2));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends k> list) {
            fd.j0.i(str, FacebookMediationAdapter.KEY_ID);
            this.f43757a = str;
            this.f43758b = list;
        }

        public /* synthetic */ a(String str, List list, int i10, vc.g gVar) {
            this(str, (i10 & 2) != 0 ? null : list);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43760c = new b();

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
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");

        public static final b Converter = new b(null);
        private static final uc.l<String, d> FROM_STRING = a.f43761c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43761c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public d invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                d dVar = d.TRANSACTIONAL;
                if (fd.j0.d(str2, dVar.value)) {
                    return dVar;
                }
                d dVar2 = d.PARTIAL;
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
        b bVar = b.f43760c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f43751d = new h9.k.a.C0302a(objQ, bVar);
        f43752e = u4.f43077n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w4(List<? extends a> list, v9.b<d> bVar) {
        fd.j0.i(list, "changes");
        fd.j0.i(bVar, "mode");
        this.f43753a = list;
    }

    public /* synthetic */ w4(List list, v9.b bVar, int i10, vc.g gVar) {
        this(list, (i10 & 2) != 0 ? f43750c : bVar);
    }
}
