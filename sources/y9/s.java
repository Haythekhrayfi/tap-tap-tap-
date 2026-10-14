package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s implements u9.a, u9.b<q> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f42386i = new k(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<q.e> f42387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f42388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<String> f42389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.g<q.d> f42390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.g<l> f42391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, t1> f42392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f42393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f42394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<q.d>> f42395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, JSONObject> f42396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f42397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<q.e>> f42398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f42399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, s> f42400w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<u1> f42401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<String> f42402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<l>> f42404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<JSONObject> f42405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<q.e>> f42407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f42408h;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42409c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public s invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new s(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, t1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42410c = new b();

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
        public static final c f42411c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = s.f42389l;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f42412c = new d();

        public d() {
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

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, List<q.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f42413c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public List<q.d> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q.d.f42104d);
            return h9.c.w(jSONObject2, str2, q.d.f42107g, s.f42390m, cVar2.a(), cVar2);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, JSONObject> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f42414c = new f();

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
        public static final g f42415c = new g();

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

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<q.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f42416c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public v9.b<q.e> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(q.e.Converter);
            return h9.c.s(jSONObject2, str2, q.e.FROM_STRING, cVar2.a(), cVar2, s.f42387j);
        }
    }

    public static final class i extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f42417c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof q.e);
        }
    }

    public static final class j extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f42418c = new j();

        public j() {
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

    public static final class k {
        public k() {
        }

        public k(vc.g gVar) {
        }
    }

    public static class l implements u9.a, u9.b<q.d> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f42419d = new e(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.g<q> f42420e = m.f41393k;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.g<s> f42421f = r.f42208h;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<String> f42422g = m.f41394l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.m<String> f42423h = r.f42209i;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, q> f42424i = b.f42432c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, List<q>> f42425j = a.f42431c;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f42426k = d.f42434c;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, l> f42427l = c.f42433c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<s> f42428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<List<s>> f42429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j9.a<v9.b<String>> f42430c;

        public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, List<q>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f42431c = new a();

            public a() {
                super(3);
            }

            @Override // uc.q
            public List<q> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(q.f42091g);
                return h9.c.w(jSONObject2, str2, q.f42095k, l.f42420e, cVar2.a(), cVar2);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, q> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f42432c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public q b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                Objects.requireNonNull(q.f42091g);
                return (q) h9.c.n(jSONObject2, str2, q.f42095k, cVar2.a(), cVar2);
            }
        }

        public static final class c extends vc.l implements uc.p<u9.c, JSONObject, l> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f42433c = new c();

            public c() {
                super(2);
            }

            @Override // uc.p
            public l invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new l(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f42434c = new d();

            public d() {
                super(3);
            }

            @Override // uc.q
            public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.e(jSONObject2, str2, l.f42423h, cVar2.a(), cVar2, h9.l.f30999c);
            }
        }

        public static final class e {
            public e() {
            }

            public e(vc.g gVar) {
            }
        }

        public l(u9.c cVar, l lVar, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<s> aVar = lVar == null ? null : lVar.f42428a;
            k kVar = s.f42386i;
            Objects.requireNonNull(kVar);
            uc.p<u9.c, JSONObject, s> pVar = s.f42400w;
            j9.a<s> aVarO = h9.e.o(jSONObject, "action", z10, aVar, pVar, eVarA, cVar);
            fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f42428a = aVarO;
            j9.a<List<s>> aVar2 = lVar == null ? null : lVar.f42429b;
            Objects.requireNonNull(kVar);
            j9.a<List<s>> aVarU = h9.e.u(jSONObject, "actions", z10, aVar2, pVar, f42421f, eVarA, cVar);
            fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f42429b = aVarU;
            this.f42430c = h9.e.g(jSONObject, "text", z10, lVar == null ? null : lVar.f42430c, f42422g, eVarA, cVar, h9.l.f30999c);
        }

        public /* synthetic */ l(u9.c cVar, l lVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
            this(cVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new q.d((q) y8.c0.K(this.f42428a, cVar, "action", jSONObject, f42424i), y8.c0.L(this.f42429b, cVar, "actions", jSONObject, f42420e, f42425j), (v9.b) y8.c0.E(this.f42430c, cVar, "text", jSONObject, f42426k));
        }
    }

    static {
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(q.e.values());
        i iVar = i.f42417c;
        fd.j0.i(objQ, "default");
        fd.j0.i(iVar, "validator");
        f42387j = new h9.k.a.C0302a(objQ, iVar);
        f42388k = m.f41391i;
        f42389l = r.f42206f;
        f42390m = m.f41392j;
        f42391n = r.f42207g;
        f42392o = b.f42410c;
        f42393p = c.f42411c;
        f42394q = d.f42412c;
        f42395r = e.f42413c;
        f42396s = f.f42414c;
        f42397t = g.f42415c;
        f42398u = h.f42416c;
        f42399v = j.f42418c;
        f42400w = a.f42409c;
    }

    public s(u9.c cVar, s sVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<u1> aVar = sVar == null ? null : sVar.f42401a;
        Objects.requireNonNull(u1.f42942c);
        j9.a<u1> aVarO = h9.e.o(jSONObject, "download_callbacks", z10, aVar, u1.f42949j, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42401a = aVarO;
        this.f42402b = h9.e.b(jSONObject, "log_id", z10, sVar == null ? null : sVar.f42402b, f42388k, eVarA, cVar);
        j9.a<v9.b<Uri>> aVar2 = sVar == null ? null : sVar.f42403c;
        uc.l<String, Uri> lVar = h9.h.f30979b;
        h9.k<Uri> kVar = h9.l.f31001e;
        j9.a<v9.b<Uri>> aVarS = h9.e.s(jSONObject, "log_url", z10, aVar2, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42403c = aVarS;
        j9.a<List<l>> aVar3 = sVar == null ? null : sVar.f42404d;
        Objects.requireNonNull(l.f42419d);
        j9.a<List<l>> aVarU = h9.e.u(jSONObject, "menu_items", z10, aVar3, l.f42427l, f42391n, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f42404d = aVarU;
        j9.a<JSONObject> aVarM = h9.e.m(jSONObject, "payload", z10, sVar == null ? null : sVar.f42405e, eVarA, cVar);
        fd.j0.h(aVarM, "readOptionalField(json, …nt?.payload, logger, env)");
        this.f42405e = aVarM;
        j9.a<v9.b<Uri>> aVarS2 = h9.e.s(jSONObject, "referer", z10, sVar == null ? null : sVar.f42406f, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42406f = aVarS2;
        j9.a<v9.b<q.e>> aVar4 = sVar == null ? null : sVar.f42407g;
        Objects.requireNonNull(q.e.Converter);
        j9.a<v9.b<q.e>> aVarS3 = h9.e.s(jSONObject, "target", z10, aVar4, q.e.FROM_STRING, eVarA, cVar, f42387j);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp… env, TYPE_HELPER_TARGET)");
        this.f42407g = aVarS3;
        j9.a<v9.b<Uri>> aVarS4 = h9.e.s(jSONObject, ImagesContract.URL, z10, sVar == null ? null : sVar.f42408h, lVar, eVarA, cVar, kVar);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f42408h = aVarS4;
    }

    public /* synthetic */ s(u9.c cVar, s sVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : sVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new q((t1) y8.c0.K(this.f42401a, cVar, "download_callbacks", jSONObject, f42392o), (String) y8.c0.E(this.f42402b, cVar, "log_id", jSONObject, f42393p), (v9.b) y8.c0.H(this.f42403c, cVar, "log_url", jSONObject, f42394q), y8.c0.L(this.f42404d, cVar, "menu_items", jSONObject, f42390m, f42395r), (JSONObject) y8.c0.H(this.f42405e, cVar, "payload", jSONObject, f42396s), (v9.b) y8.c0.H(this.f42406f, cVar, "referer", jSONObject, f42397t), (v9.b) y8.c0.H(this.f42407g, cVar, "target", jSONObject, f42398u), (v9.b) y8.c0.H(this.f42408h, cVar, ImagesContract.URL, jSONObject, f42399v));
    }
}
