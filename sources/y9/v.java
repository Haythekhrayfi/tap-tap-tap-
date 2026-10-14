package y9;

import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v implements u9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f43377h = new d(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f43378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<w> f43379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d1.d f43380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Long> f43381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.k<w> f43382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.k<e> f43383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f43384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.g<v> f43385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Long> f43386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, v> f43387r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f43388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Double> f43389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<w> f43390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<v> f43391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<e> f43392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<Long> f43393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<Double> f43394g;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, v> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43395c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public v invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(v.f43377h);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = v.f43384o;
            v9.b<Long> bVar = v.f43378i;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "duration", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            uc.l<Number, Double> lVar2 = h9.h.f30981d;
            h9.k<Double> kVar2 = h9.l.f31000d;
            v9.b bVarS = h9.c.s(jSONObject2, "end_value", lVar2, eVarA, cVar2, kVar2);
            Objects.requireNonNull(w.Converter);
            uc.l lVar3 = w.FROM_STRING;
            v9.b<w> bVar2 = v.f43379j;
            v9.b<w> bVarT = h9.c.t(jSONObject2, "interpolator", lVar3, eVarA, cVar2, bVar2, v.f43382m);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            List listW = h9.c.w(jSONObject2, "items", v.f43387r, v.f43385p, eVarA, cVar2);
            Objects.requireNonNull(e.Converter);
            v9.b bVarH = h9.c.h(jSONObject2, "name", e.FROM_STRING, eVarA, cVar2, v.f43383n);
            Objects.requireNonNull(d1.f39557a);
            d1 d1Var = (d1) h9.c.n(jSONObject2, "repeat", d1.f39558b, eVarA, cVar2);
            if (d1Var == null) {
                d1Var = v.f43380k;
            }
            d1 d1Var2 = d1Var;
            fd.j0.h(d1Var2, "JsonParser.readOptional(…) ?: REPEAT_DEFAULT_VALUE");
            h9.m<Long> mVar2 = v.f43386q;
            v9.b<Long> bVar3 = v.f43381l;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "start_delay", lVar, mVar2, eVarA, bVar3, kVar);
            if (bVarR2 != null) {
                bVar3 = bVarR2;
            }
            return new v(bVar, bVarS, bVar2, listW, bVarH, d1Var2, bVar3, h9.c.s(jSONObject2, "start_value", lVar2, eVarA, cVar2, kVar2));
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43396c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class c extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f43397c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof e);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    public enum e {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE(PluginErrorDetails.Platform.NATIVE),
        SET("set"),
        NO_ANIMATION("no_animation");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, e> FROM_STRING = a.f43398c;

        public static final class a extends vc.l implements uc.l<String, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f43398c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public e invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                e eVar = e.FADE;
                if (fd.j0.d(str2, eVar.value)) {
                    return eVar;
                }
                e eVar2 = e.TRANSLATE;
                if (fd.j0.d(str2, eVar2.value)) {
                    return eVar2;
                }
                e eVar3 = e.SCALE;
                if (fd.j0.d(str2, eVar3.value)) {
                    return eVar3;
                }
                e eVar4 = e.NATIVE;
                if (fd.j0.d(str2, eVar4.value)) {
                    return eVar4;
                }
                e eVar5 = e.SET;
                if (fd.j0.d(str2, eVar5.value)) {
                    return eVar5;
                }
                e eVar6 = e.NO_ANIMATION;
                if (fd.j0.d(str2, eVar6.value)) {
                    return eVar6;
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
        v9.b.a aVar = v9.b.f36747a;
        f43378i = aVar.a(300L);
        f43379j = aVar.a(w.SPRING);
        f43380k = new d1.d(new q3());
        f43381l = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        b bVar = b.f43396c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f43382m = new h9.k.a.C0302a(objQ, bVar);
        Object objQ2 = kc.j.q(e.values());
        c cVar = c.f43397c;
        fd.j0.i(objQ2, "default");
        fd.j0.i(cVar, "validator");
        f43383n = new h9.k.a.C0302a(objQ2, cVar);
        f43384o = r.f42210j;
        f43385p = m.f41395m;
        f43386q = m.f41396n;
        f43387r = a.f43395c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(v9.b<Long> bVar, v9.b<Double> bVar2, v9.b<w> bVar3, List<? extends v> list, v9.b<e> bVar4, d1 d1Var, v9.b<Long> bVar5, v9.b<Double> bVar6) {
        fd.j0.i(bVar, "duration");
        fd.j0.i(bVar3, "interpolator");
        fd.j0.i(bVar4, "name");
        fd.j0.i(d1Var, "repeat");
        fd.j0.i(bVar5, "startDelay");
        this.f43388a = bVar;
        this.f43389b = bVar2;
        this.f43390c = bVar3;
        this.f43391d = list;
        this.f43392e = bVar4;
        this.f43393f = bVar5;
        this.f43394g = bVar6;
    }

    public /* synthetic */ v(v9.b bVar, v9.b bVar2, v9.b bVar3, List list, v9.b bVar4, d1 d1Var, v9.b bVar5, v9.b bVar6, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f43378i : bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? f43379j : bVar3, (i10 & 8) != 0 ? null : list, bVar4, (i10 & 32) != 0 ? f43380k : d1Var, (i10 & 64) != 0 ? f43381l : bVar5, (i10 & 128) != 0 ? null : bVar6);
    }
}
