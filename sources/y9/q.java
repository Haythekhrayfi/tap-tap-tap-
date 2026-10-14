package y9;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q implements u9.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f42091g = new c(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.k<e> f42092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<String> f42093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.g<d> f42094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, q> f42095k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f42096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Uri> f42097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f42098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f42099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Uri> f42100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<Uri> f42101f;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42102c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public q invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(q.f42091g);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(t1.f42679c);
            t1 t1Var = (t1) h9.c.n(jSONObject2, "download_callbacks", t1.f42682f, eVarA, cVar2);
            h9.m<String> mVar = q.f42093i;
            uc.l<?, ?> lVar = h9.c.f30973c;
            String str = (String) h9.c.c(jSONObject2, "log_id", lVar, mVar);
            uc.l<String, Uri> lVar2 = h9.h.f30979b;
            h9.k<Uri> kVar = h9.l.f31001e;
            v9.b bVarS = h9.c.s(jSONObject2, "log_url", lVar2, eVarA, cVar2, kVar);
            Objects.requireNonNull(d.f42104d);
            List listW = h9.c.w(jSONObject2, "menu_items", d.f42107g, q.f42094j, eVarA, cVar2);
            JSONObject jSONObject3 = (JSONObject) h9.c.m(jSONObject2, "payload", lVar, h9.c.f30971a, eVarA);
            v9.b bVarS2 = h9.c.s(jSONObject2, "referer", lVar2, eVarA, cVar2, kVar);
            Objects.requireNonNull(e.Converter);
            return new q(t1Var, str, bVarS, listW, jSONObject3, bVarS2, h9.c.s(jSONObject2, "target", e.FROM_STRING, eVarA, cVar2, q.f42092h), h9.c.s(jSONObject2, ImagesContract.URL, lVar2, eVarA, cVar2, kVar));
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42103c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof e);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public static class d implements u9.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f42104d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.g<q> f42105e = r.f42204d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<String> f42106f = r.f42205e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, d> f42107g = a.f42111c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f42108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<q> f42109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<String> f42110c;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42111c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public d invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(d.f42104d);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                Objects.requireNonNull(q.f42091g);
                uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
                return new d((q) h9.c.n(jSONObject2, "action", pVar, eVarA, cVar2), h9.c.w(jSONObject2, "actions", pVar, d.f42105e, eVarA, cVar2), h9.c.e(jSONObject2, "text", d.f42106f, eVarA, cVar2, h9.l.f30999c));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(q qVar, List<? extends q> list, v9.b<String> bVar) {
            fd.j0.i(bVar, "text");
            this.f42108a = qVar;
            this.f42109b = list;
            this.f42110c = bVar;
        }

        public /* synthetic */ d(q qVar, List list, v9.b bVar, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : qVar, (i10 & 2) != 0 ? null : list, bVar);
        }
    }

    public enum e {
        SELF("_self"),
        BLANK("_blank");

        public static final b Converter = new b(null);
        private static final uc.l<String, e> FROM_STRING = a.f42112c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42112c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public e invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                e eVar = e.SELF;
                if (fd.j0.d(str2, eVar.value)) {
                    return eVar;
                }
                e eVar2 = e.BLANK;
                if (fd.j0.d(str2, eVar2.value)) {
                    return eVar2;
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

        e(String str) {
            this.value = str;
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(e.values());
        b bVar = b.f42103c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f42092h = new h9.k.a.C0302a(objQ, bVar);
        f42093i = p7.d1.G;
        f42094j = m.f41390h;
        f42095k = a.f42102c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(t1 t1Var, String str, v9.b<Uri> bVar, List<? extends d> list, JSONObject jSONObject, v9.b<Uri> bVar2, v9.b<e> bVar3, v9.b<Uri> bVar4) {
        fd.j0.i(str, "logId");
        this.f42096a = t1Var;
        this.f42097b = bVar;
        this.f42098c = list;
        this.f42099d = jSONObject;
        this.f42100e = bVar2;
        this.f42101f = bVar4;
    }

    public /* synthetic */ q(t1 t1Var, String str, v9.b bVar, List list, JSONObject jSONObject, v9.b bVar2, v9.b bVar3, v9.b bVar4, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : t1Var, str, (i10 & 4) != 0 ? null : bVar, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : jSONObject, (i10 & 32) != 0 ? null : bVar2, (i10 & 64) != 0 ? null : bVar3, (i10 & 128) != 0 ? null : bVar4);
    }
}
