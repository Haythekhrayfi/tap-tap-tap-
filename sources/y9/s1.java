package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s1 implements u9.a, u9.b<q1> {
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> A;
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> B;
    public static final uc.p<u9.c, JSONObject, s1> C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f42440i = new j(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f42441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<Long> f42442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Long> f42443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f42444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f42445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<String> f42446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<String> f42447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Long> f42448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.m<Long> f42449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.m<Long> f42450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h9.m<Long> f42451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42452u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, t1> f42453v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f42454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, JSONObject> f42456y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f42457z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<u1> f42459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<String> f42460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<JSONObject> f42462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42465h;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, s1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42466c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public s1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new s1(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42467c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = s1.f42445n;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = s1.f42441j;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, t1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42468c = new c();

        public c() {
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

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42469c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = s1.f42447p;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f42470c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = s1.f42449r;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = s1.f42442k;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, JSONObject> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f42471c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public JSONObject b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            return (JSONObject) h9.c.m(jSONObject2, str2, h9.c.f30973c, h9.c.f30971a, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar, "env"));
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f42472c = new g();

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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f42473c = new h();

        public h() {
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

    public static final class i extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f42474c = new i();

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
            h9.m<Long> mVar = s1.f42451t;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = s1.f42443l;
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
        f42441j = aVar.a(800L);
        f42442k = aVar.a(1L);
        f42443l = aVar.a(0L);
        f42444m = k1.f41004f;
        f42445n = g1.C;
        f42446o = k1.f41005g;
        f42447p = g1.D;
        f42448q = k1.f41006h;
        f42449r = r1.f42233d;
        f42450s = k1.f41007i;
        f42451t = r1.f42234e;
        f42452u = b.f42467c;
        f42453v = c.f42468c;
        f42454w = d.f42469c;
        f42455x = e.f42470c;
        f42456y = f.f42471c;
        f42457z = g.f42472c;
        A = h.f42473c;
        B = i.f42474c;
        C = a.f42466c;
    }

    public s1(u9.c cVar, s1 s1Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = s1Var == null ? null : s1Var.f42458a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f42444m;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "disappear_duration", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42458a = aVarR;
        j9.a<u1> aVar2 = s1Var == null ? null : s1Var.f42459b;
        Objects.requireNonNull(u1.f42942c);
        j9.a<u1> aVarO = h9.e.o(jSONObject, "download_callbacks", z10, aVar2, u1.f42949j, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42459b = aVarO;
        this.f42460c = h9.e.b(jSONObject, "log_id", z10, s1Var == null ? null : s1Var.f42460c, f42446o, eVarA, cVar);
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "log_limit", z10, s1Var == null ? null : s1Var.f42461d, lVar, f42448q, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42461d = aVarR2;
        j9.a<JSONObject> aVarM = h9.e.m(jSONObject, "payload", z10, s1Var == null ? null : s1Var.f42462e, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …nt?.payload, logger, env)");
        this.f42462e = aVarM;
        j9.a<v9.b<Uri>> aVar3 = s1Var == null ? null : s1Var.f42463f;
        uc.l<String, Uri> lVar2 = h9.h.f30979b;
        h9.k<Uri> kVar2 = h9.l.f31001e;
        j9.a<v9.b<Uri>> aVarS = h9.e.s(jSONObject, "referer", z10, aVar3, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42463f = aVarS;
        j9.a<v9.b<Uri>> aVarS2 = h9.e.s(jSONObject, ImagesContract.URL, z10, s1Var == null ? null : s1Var.f42464g, lVar2, eVarA, cVar, kVar2);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42464g = aVarS2;
        j9.a<v9.b<Long>> aVarR3 = h9.e.r(jSONObject, "visibility_percentage", z10, s1Var == null ? null : s1Var.f42465h, lVar, f42450s, eVarA, cVar, kVar);
        fd.j0.h(aVarR3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42465h = aVarR3;
    }

    public /* synthetic */ s1(u9.c cVar, s1 s1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : s1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f42458a, cVar, "disappear_duration", jSONObject, f42452u);
        if (bVar == null) {
            bVar = f42441j;
        }
        v9.b<Long> bVar2 = bVar;
        t1 t1Var = (t1) y8.c0.K(this.f42459b, cVar, "download_callbacks", jSONObject, f42453v);
        String str = (String) y8.c0.E(this.f42460c, cVar, "log_id", jSONObject, f42454w);
        v9.b<Long> bVar3 = (v9.b) y8.c0.H(this.f42461d, cVar, "log_limit", jSONObject, f42455x);
        if (bVar3 == null) {
            bVar3 = f42442k;
        }
        v9.b<Long> bVar4 = bVar3;
        JSONObject jSONObject2 = (JSONObject) y8.c0.H(this.f42462e, cVar, "payload", jSONObject, f42456y);
        v9.b bVar5 = (v9.b) y8.c0.H(this.f42463f, cVar, "referer", jSONObject, f42457z);
        v9.b bVar6 = (v9.b) y8.c0.H(this.f42464g, cVar, ImagesContract.URL, jSONObject, A);
        v9.b<Long> bVar7 = (v9.b) y8.c0.H(this.f42465h, cVar, "visibility_percentage", jSONObject, B);
        if (bVar7 == null) {
            bVar7 = f42443l;
        }
        return new q1(bVar2, t1Var, str, bVar4, jSONObject2, bVar5, bVar6, bVar7);
    }
}
