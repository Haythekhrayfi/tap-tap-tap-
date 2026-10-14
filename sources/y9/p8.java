package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p8 implements u9.a, u9.b<o8> {
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> A;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> B;
    public static final uc.p<u9.c, JSONObject, p8> C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f42056i = new j(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f42057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<Long> f42058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Long> f42059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<String> f42060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<String> f42061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f42062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f42063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Long> f42064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.m<Long> f42065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.m<Long> f42066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h9.m<Long> f42067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, t1> f42068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f42069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, JSONObject> f42071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f42072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f42073z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<u1> f42074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<String> f42075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<JSONObject> f42077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42081h;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, p8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42082c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public p8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new p8(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, t1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42083c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public t1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t1.f42679c);
            return (t1) h9.c.n(jSONObject2, str2, t1.f42682f, cVar2.a(), cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42084c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = p8.f42061n;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42085c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = p8.f42063p;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = p8.f42057j;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, JSONObject> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f42086c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public JSONObject b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            return (JSONObject) h9.c.m(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env"));
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f42087c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Uri> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30979b, cVar2.a(), cVar2, h9.l.f31001e);
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f42088c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Uri> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30979b, cVar2.a(), cVar2, h9.l.f31001e);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f42089c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = p8.f42065r;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = p8.f42058k;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f42090c = new i();

        public i() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = p8.f42067t;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = p8.f42059l;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class j {
        public j() {
        }

        public j(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f42057j = aVar.a(1L);
        f42058k = aVar.a(800L);
        f42059l = aVar.a(50L);
        f42060m = k8.f41141m;
        f42061n = l8.f41368i;
        f42062o = k8.f41142n;
        f42063p = l8.f41369j;
        f42064q = k8.f41143o;
        f42065r = l8.f41370k;
        f42066s = k8.f41144p;
        f42067t = l8.f41371l;
        f42068u = b.f42083c;
        f42069v = c.f42084c;
        f42070w = d.f42085c;
        f42071x = e.f42086c;
        f42072y = f.f42087c;
        f42073z = g.f42088c;
        A = h.f42089c;
        B = i.f42090c;
        C = a.f42082c;
    }

    public p8(u9.c cVar, p8 p8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<u1> aVar = p8Var == null ? null : p8Var.f42074a;
        Objects.requireNonNull(u1.f42942c);
        j9.a<u1> aVarO = h9.e.o(jSONObject, "download_callbacks", z10, aVar, u1.f42949j, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42074a = aVarO;
        this.f42075b = h9.e.b(jSONObject, "log_id", z10, p8Var == null ? null : p8Var.f42075b, f42060m, eVarA, cVar);
        j9.a<v9.b<Long>> aVar2 = p8Var == null ? null : p8Var.f42076c;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f42062o;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "log_limit", z10, aVar2, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42076c = aVarR;
        j9.a<JSONObject> aVarM = h9.e.m(jSONObject, "payload", z10, p8Var == null ? null : p8Var.f42077d, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …nt?.payload, logger, env)");
        this.f42077d = aVarM;
        j9.a<v9.b<Uri>> aVar3 = p8Var == null ? null : p8Var.f42078e;
        uc.l<String, Uri> lVar2 = h9.h.f30979b;
        h9.k<Uri> kVar2 = h9.l.f31001e;
        j9.a<v9.b<Uri>> aVarS = h9.e.s(jSONObject, "referer", z10, aVar3, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42078e = aVarS;
        j9.a<v9.b<Uri>> aVarS2 = h9.e.s(jSONObject, ImagesContract.URL, z10, p8Var == null ? null : p8Var.f42079f, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42079f = aVarS2;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "visibility_duration", z10, p8Var == null ? null : p8Var.f42080g, lVar, f42064q, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42080g = aVarR2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "visibility_percentage", z10, p8Var == null ? null : p8Var.f42081h, lVar, f42066s, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42081h = aVarR3;
    }

    public /* synthetic */ p8(u9.c cVar, p8 p8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : p8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        t1 t1Var = (t1) y8.c0.K(this.f42074a, cVar, "download_callbacks", jSONObject, f42068u);
        String str = (String) y8.c0.E(this.f42075b, cVar, "log_id", jSONObject, f42069v);
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f42076c, cVar, "log_limit", jSONObject, f42070w);
        if (bVar == null) {
            bVar = f42057j;
        }
        v9.b<Long> bVar2 = bVar;
        JSONObject jSONObject2 = (JSONObject) y8.c0.H(this.f42077d, cVar, "payload", jSONObject, f42071x);
        v9.b bVar3 = (v9.b) y8.c0.H(this.f42078e, cVar, "referer", jSONObject, f42072y);
        v9.b bVar4 = (v9.b) y8.c0.H(this.f42079f, cVar, ImagesContract.URL, jSONObject, f42073z);
        v9.b<Long> bVar5 = (v9.b) y8.c0.H(this.f42080g, cVar, "visibility_duration", jSONObject, A);
        if (bVar5 == null) {
            bVar5 = f42058k;
        }
        v9.b<Long> bVar6 = bVar5;
        v9.b<Long> bVar7 = (v9.b) y8.c0.H(this.f42081h, cVar, "visibility_percentage", jSONObject, B);
        if (bVar7 == null) {
            bVar7 = f42059l;
        }
        return new o8(t1Var, str, bVar2, jSONObject2, bVar3, bVar4, bVar6, bVar7);
    }
}
