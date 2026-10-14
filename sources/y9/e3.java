package y9;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e3 implements u9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f39743h = new d(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Double> f39744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<t> f39745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<u> f39746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Boolean> f39747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v9.b<h3> f39748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.k<t> f39749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.k<u> f39750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.k<h3> f39751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Double> f39752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.g<d2> f39753r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f39754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<t> f39755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<u> f39756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d2> f39757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Uri> f39758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<Boolean> f39759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<h3> f39760g;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39761c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof t);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39762c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof u);
        }
    }

    public static final class c extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39763c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof h3);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }

        public final e3 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = e3.f39752q;
            v9.b<Double> bVar = e3.f39744i;
            v9.b<Double> bVarR = h9.c.r(jSONObject, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            v9.b<Double> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(t.Converter);
            uc.l lVar2 = t.FROM_STRING;
            v9.b<t> bVar3 = e3.f39745j;
            v9.b<t> bVarT = h9.c.t(jSONObject, "content_alignment_horizontal", lVar2, eVarA, cVar, bVar3, e3.f39749n);
            v9.b<t> bVar4 = bVarT == null ? bVar3 : bVarT;
            Objects.requireNonNull(u.Converter);
            uc.l lVar3 = u.FROM_STRING;
            v9.b<u> bVar5 = e3.f39746k;
            v9.b<u> bVarT2 = h9.c.t(jSONObject, "content_alignment_vertical", lVar3, eVarA, cVar, bVar5, e3.f39750o);
            v9.b<u> bVar6 = bVarT2 == null ? bVar5 : bVarT2;
            Objects.requireNonNull(d2.f39560a);
            List listW = h9.c.w(jSONObject, "filters", d2.f39561b, e3.f39753r, eVarA, cVar);
            v9.b bVarH = h9.c.h(jSONObject, "image_url", h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
            uc.l<Object, Boolean> lVar4 = h9.h.f30980c;
            v9.b<Boolean> bVar7 = e3.f39747l;
            v9.b<Boolean> bVarT3 = h9.c.t(jSONObject, "preload_required", lVar4, eVarA, cVar, bVar7, h9.l.f30997a);
            v9.b<Boolean> bVar8 = bVarT3 == null ? bVar7 : bVarT3;
            Objects.requireNonNull(h3.Converter);
            uc.l lVar5 = h3.FROM_STRING;
            v9.b<h3> bVar9 = e3.f39748m;
            v9.b<h3> bVarT4 = h9.c.t(jSONObject, "scale", lVar5, eVarA, cVar, bVar9, e3.f39751p);
            return new e3(bVar2, bVar4, bVar6, listW, bVarH, bVar8, bVarT4 == null ? bVar9 : bVarT4);
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f39744i = aVar.a(Double.valueOf(1.0d));
        f39745j = aVar.a(t.CENTER);
        f39746k = aVar.a(u.CENTER);
        f39747l = aVar.a(Boolean.FALSE);
        f39748m = aVar.a(h3.FILL);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(t.values());
        a aVar2 = a.f39761c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f39749n = new h9.k.a.C0302a(objQ, aVar2);
        Object objQ2 = kc.j.q(u.values());
        b bVar = b.f39762c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(bVar, "validator");
        f39750o = new h9.k.a.C0302a(objQ2, bVar);
        Object objQ3 = kc.j.q(h3.values());
        c cVar = c.f39763c;
        fd.j0.i(objQ3, "default");
        fd.j0.i(cVar, "validator");
        f39751p = new h9.k.a.C0302a(objQ3, cVar);
        f39752q = b3.f39162u;
        f39753r = z2.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e3(v9.b<Double> bVar, v9.b<t> bVar2, v9.b<u> bVar3, List<? extends d2> list, v9.b<Uri> bVar4, v9.b<Boolean> bVar5, v9.b<h3> bVar6) {
        fd.j0.i(bVar, "alpha");
        fd.j0.i(bVar2, "contentAlignmentHorizontal");
        fd.j0.i(bVar3, "contentAlignmentVertical");
        fd.j0.i(bVar4, "imageUrl");
        fd.j0.i(bVar5, "preloadRequired");
        fd.j0.i(bVar6, "scale");
        this.f39754a = bVar;
        this.f39755b = bVar2;
        this.f39756c = bVar3;
        this.f39757d = list;
        this.f39758e = bVar4;
        this.f39759f = bVar5;
        this.f39760g = bVar6;
    }

    public /* synthetic */ e3(v9.b bVar, v9.b bVar2, v9.b bVar3, List list, v9.b bVar4, v9.b bVar5, v9.b bVar6, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39744i : bVar, (i10 & 2) != 0 ? f39745j : bVar2, (i10 & 4) != 0 ? f39746k : bVar3, (i10 & 8) != 0 ? null : list, bVar4, (i10 & 32) != 0 ? f39747l : bVar5, (i10 & 64) != 0 ? f39748m : bVar6);
    }
}
