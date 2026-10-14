package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g3 implements u9.a, u9.b<e3> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Double> f40123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<t> f40124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<u> f40125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<Boolean> f40126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<h3> f40127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.k<t> f40128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.k<u> f40129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.k<h3> f40130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Double> f40131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Double> f40132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.g<d2> f40133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.g<e2> f40134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f40135t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<t>> f40136u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<u>> f40137v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, List<d2>> f40138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f40139x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f40140y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<h3>> f40141z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f40142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<t>> f40143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<u>> f40144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<List<e2>> f40145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f40146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f40147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9.a<v9.b<h3>> f40148g;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40149c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = g3.f40132q;
            u9.e eVarA = cVar2.a();
            v9.b<Double> bVar = g3.f40123h;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f31000d);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<t>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40150c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<t> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(t.Converter);
            uc.l lVar = t.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<t> bVar = g3.f40124i;
            v9.b<t> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, g3.f40128m);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<u>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40151c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<u> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(u.Converter);
            uc.l lVar = u.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<u> bVar = g3.f40125j;
            v9.b<u> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, g3.f40129n);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, List<d2>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40152c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public List<d2> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(d2.f39560a);
            return h9.c.w(jSONObject2, str2, d2.f39561b, g3.f40133r, cVar2.a(), cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f40153c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Uri> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30979b, cVar2.a(), cVar2, h9.l.f31001e);
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f40154c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            u9.e eVarA = cVar2.a();
            v9.b<Boolean> bVar = g3.f40126k;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class g extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<h3>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f40155c = new g();

        public g() {
            super(3);
        }

        @Override // uc.q
        public v9.b<h3> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(h3.Converter);
            uc.l lVar = h3.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<h3> bVar = g3.f40127l;
            v9.b<h3> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, g3.f40130o);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class h extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f40156c = new h();

        public h() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t);
        }
    }

    public static final class i extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f40157c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof u);
        }
    }

    public static final class j extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f40158c = new j();

        public j() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h3);
        }
    }

    public static final class k {
        public k() {
        }

        public k(vc.g gVar) {
        }
    }

    static {
        new k(null);
        v9.b.a aVar = v9.b.f36747a;
        f40123h = aVar.a(Double.valueOf(1.0d));
        f40124i = aVar.a(t.CENTER);
        f40125j = aVar.a(u.CENTER);
        f40126k = aVar.a(Boolean.FALSE);
        f40127l = aVar.a(h3.FILL);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        h hVar = h.f40156c;
        fd.j0.i(objQ, "default");
        fd.j0.i(hVar, "validator");
        f40128m = new h9.k.a.C0302a(objQ, hVar);
        Object objQ2 = kc.j.q(u.values());
        i iVar = i.f40157c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(iVar, "validator");
        f40129n = new h9.k.a.C0302a(objQ2, iVar);
        Object objQ3 = kc.j.q(h3.values());
        j jVar = j.f40158c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(jVar, "validator");
        f40130o = new h9.k.a.C0302a(objQ3, jVar);
        f40131p = b3.f39163v;
        f40132q = z2.C;
        f40133r = b3.f39164w;
        f40134s = f3.f39933d;
        f40135t = a.f40149c;
        f40136u = b.f40150c;
        f40137v = c.f40151c;
        f40138w = d.f40152c;
        f40139x = e.f40153c;
        f40140y = f.f40154c;
        f40141z = g.f40155c;
    }

    public g3(u9.c cVar, g3 g3Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Double>> aVarR = h9.e.r(jSONObject, "alpha", z10, g3Var == null ? null : g3Var.f40142a, h9.h.f30981d, f40131p, eVarA, cVar, h9.l.f31000d);
        fd.j0.h(aVarR, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f40142a = aVarR;
        j9.a<v9.b<t>> aVar = g3Var == null ? null : g3Var.f40143b;
        Objects.requireNonNull(t.Converter);
        j9.a<v9.b<t>> aVarS = h9.e.s(jSONObject, "content_alignment_horizontal", z10, aVar, t.FROM_STRING, eVarA, cVar, f40128m);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…ENT_ALIGNMENT_HORIZONTAL)");
        this.f40143b = aVarS;
        j9.a<v9.b<u>> aVar2 = g3Var == null ? null : g3Var.f40144c;
        Objects.requireNonNull(u.Converter);
        j9.a<v9.b<u>> aVarS2 = h9.e.s(jSONObject, "content_alignment_vertical", z10, aVar2, u.FROM_STRING, eVarA, cVar, f40129n);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…NTENT_ALIGNMENT_VERTICAL)");
        this.f40144c = aVarS2;
        j9.a<List<e2>> aVar3 = g3Var == null ? null : g3Var.f40145d;
        Objects.requireNonNull(e2.f39739a);
        j9.a<List<e2>> aVarU = h9.e.u(jSONObject, "filters", z10, aVar3, e2.f39740b, f40134s, eVarA, cVar);
        fd.j0.h(aVarU, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f40145d = aVarU;
        this.f40146e = h9.e.j(jSONObject, "image_url", z10, g3Var == null ? null : g3Var.f40146e, h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
        j9.a<v9.b<Boolean>> aVarS3 = h9.e.s(jSONObject, "preload_required", z10, g3Var == null ? null : g3Var.f40147f, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS3, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f40147f = aVarS3;
        j9.a<v9.b<h3>> aVar4 = g3Var == null ? null : g3Var.f40148g;
        Objects.requireNonNull(h3.Converter);
        j9.a<v9.b<h3>> aVarS4 = h9.e.s(jSONObject, "scale", z10, aVar4, h3.FROM_STRING, eVarA, cVar, f40130o);
        fd.j0.h(aVarS4, "readOptionalFieldWithExp…, env, TYPE_HELPER_SCALE)");
        this.f40148g = aVarS4;
    }

    public /* synthetic */ g3(u9.c cVar, g3 g3Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : g3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e3 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Double> bVar = (v9.b) y8.c0.H(this.f40142a, cVar, "alpha", jSONObject, f40135t);
        if (bVar == null) {
            bVar = f40123h;
        }
        v9.b<Double> bVar2 = bVar;
        v9.b<t> bVar3 = (v9.b) y8.c0.H(this.f40143b, cVar, "content_alignment_horizontal", jSONObject, f40136u);
        if (bVar3 == null) {
            bVar3 = f40124i;
        }
        v9.b<t> bVar4 = bVar3;
        v9.b<u> bVar5 = (v9.b) y8.c0.H(this.f40144c, cVar, "content_alignment_vertical", jSONObject, f40137v);
        if (bVar5 == null) {
            bVar5 = f40125j;
        }
        v9.b<u> bVar6 = bVar5;
        List listL = y8.c0.L(this.f40145d, cVar, "filters", jSONObject, f40133r, f40138w);
        v9.b bVar7 = (v9.b) y8.c0.E(this.f40146e, cVar, "image_url", jSONObject, f40139x);
        v9.b<Boolean> bVar8 = (v9.b) y8.c0.H(this.f40147f, cVar, "preload_required", jSONObject, f40140y);
        if (bVar8 == null) {
            bVar8 = f40126k;
        }
        v9.b<Boolean> bVar9 = bVar8;
        v9.b<h3> bVar10 = (v9.b) y8.c0.H(this.f40148g, cVar, "scale", jSONObject, f40141z);
        if (bVar10 == null) {
            bVar10 = f40127l;
        }
        return new e3(bVar2, bVar4, bVar6, listL, bVar7, bVar9, bVar10);
    }
}
