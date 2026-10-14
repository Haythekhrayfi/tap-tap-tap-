package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o0 implements u9.a, u9.b<m0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.b<Long> f41717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<w> f41718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Long> f41719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.k<w> f41720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f41721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f41722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Long> f41723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f41724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<w>> f41726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41727n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<w>> f41729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41730c;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41731c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = o0.f41722i;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = o0.f41717d;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<w>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41732c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<w> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(w.Converter);
            uc.l lVar = w.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<w> bVar = o0.f41718e;
            v9.b<w> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, o0.f41720g);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41733c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = o0.f41724k;
            u9.e eVarA = cVar2.a();
            v9.b<Long> bVar = o0.f41719f;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, str2, lVar, mVar, eVarA, bVar, h9.l.f30998b);
            return bVarR == null ? bVar : bVarR;
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41734c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }
    }

    static {
        new e(null);
        v9.b.a aVar = v9.b.f36747a;
        f41717d = aVar.a(200L);
        f41718e = aVar.a(w.EASE_IN_OUT);
        f41719f = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        d dVar = d.f41734c;
        fd.j0.i(objQ, "default");
        fd.j0.i(dVar, "validator");
        f41720g = new h9.k.a.C0302a(objQ, dVar);
        f41721h = m.f41404v;
        f41722i = r.f42224x;
        f41723j = n0.f41604d;
        f41724k = r.f42225y;
        f41725l = a.f41731c;
        f41726m = b.f41732c;
        f41727n = c.f41733c;
    }

    public o0(u9.c cVar, o0 o0Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVar = o0Var == null ? null : o0Var.f41728a;
        uc.l<Number, Long> lVar = h9.h.f30982e;
        h9.m<Long> mVar = f41721h;
        h9.k<Long> kVar = h9.l.f30998b;
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "duration", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41728a = aVarR;
        j9.a<v9.b<w>> aVar2 = o0Var == null ? null : o0Var.f41729b;
        Objects.requireNonNull(w.Converter);
        j9.a<v9.b<w>> aVarS = h9.e.s(jSONObject, "interpolator", z10, aVar2, w.FROM_STRING, eVarA, cVar, f41720g);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f41729b = aVarS;
        j9.a<v9.b<Long>> aVarR2 = h9.e.r(jSONObject, "start_delay", z10, o0Var == null ? null : o0Var.f41730c, lVar, f41723j, eVarA, cVar, kVar);
        fd.j0.h(aVarR2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41730c = aVarR2;
    }

    public /* synthetic */ o0(u9.c cVar, o0 o0Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : o0Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<Long> bVar = (v9.b) y8.c0.H(this.f41728a, cVar, "duration", jSONObject, f41725l);
        if (bVar == null) {
            bVar = f41717d;
        }
        v9.b<w> bVar2 = (v9.b) y8.c0.H(this.f41729b, cVar, "interpolator", jSONObject, f41726m);
        if (bVar2 == null) {
            bVar2 = f41718e;
        }
        v9.b<Long> bVar3 = (v9.b) y8.c0.H(this.f41730c, cVar, "start_delay", jSONObject, f41727n);
        if (bVar3 == null) {
            bVar3 = f41719f;
        }
        return new m0(bVar, bVar2, bVar3);
    }
}
