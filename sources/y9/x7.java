package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x7 implements u9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f44168h = new c(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f44169i = v9.b.f36747a.a(5000L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<d> f44170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<Long> f44171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<String> f44172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, x7> f44173m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f44174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f44175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f44176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Long> f44177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f5 f44179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v9.b<d> f44180g;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, x7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44181c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public x7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(x7.f44168h);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(v.f43377h);
            uc.p<u9.c, JSONObject, v> pVar = v.f43387r;
            v vVar = (v) h9.c.n(jSONObject2, "animation_in", pVar, eVarA, cVar2);
            v vVar2 = (v) h9.c.n(jSONObject2, "animation_out", pVar, eVarA, cVar2);
            Objects.requireNonNull(k.f40973a);
            k kVar = (k) h9.c.d(jSONObject2, "div", k.f40974b, h9.c.f30971a, cVar2);
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = x7.f44171k;
            v9.b<Long> bVar = x7.f44169i;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "duration", lVar, mVar, eVarA, bVar, h9.l.f30998b);
            v9.b<Long> bVar2 = bVarR == null ? bVar : bVarR;
            String str = (String) h9.c.c(jSONObject2, FacebookMediationAdapter.KEY_ID, h9.c.f30973c, x7.f44172l);
            Objects.requireNonNull(f5.f39958c);
            f5 f5Var = (f5) h9.c.n(jSONObject2, "offset", f5.f39959d, eVarA, cVar2);
            Objects.requireNonNull(d.Converter);
            return new x7(vVar, vVar2, kVar, bVar2, str, f5Var, h9.c.h(jSONObject2, "position", d.FROM_STRING, eVarA, cVar2, x7.f44170j));
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44182c = new b();

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
        LEFT("left"),
        TOP_LEFT("top-left"),
        TOP("top"),
        TOP_RIGHT("top-right"),
        RIGHT("right"),
        BOTTOM_RIGHT("bottom-right"),
        BOTTOM("bottom"),
        BOTTOM_LEFT("bottom-left");

        public static final b Converter = new b(null);
        private static final uc.l<String, d> FROM_STRING = a.f44183c;
        private final String value;

        public static final class a extends vc.l implements uc.l<String, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f44183c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public d invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                d dVar = d.LEFT;
                if (fd.j0.d(str2, dVar.value)) {
                    return dVar;
                }
                d dVar2 = d.TOP_LEFT;
                if (fd.j0.d(str2, dVar2.value)) {
                    return dVar2;
                }
                d dVar3 = d.TOP;
                if (fd.j0.d(str2, dVar3.value)) {
                    return dVar3;
                }
                d dVar4 = d.TOP_RIGHT;
                if (fd.j0.d(str2, dVar4.value)) {
                    return dVar4;
                }
                d dVar5 = d.RIGHT;
                if (fd.j0.d(str2, dVar5.value)) {
                    return dVar5;
                }
                d dVar6 = d.BOTTOM_RIGHT;
                if (fd.j0.d(str2, dVar6.value)) {
                    return dVar6;
                }
                d dVar7 = d.BOTTOM;
                if (fd.j0.d(str2, dVar7.value)) {
                    return dVar7;
                }
                d dVar8 = d.BOTTOM_LEFT;
                if (fd.j0.d(str2, dVar8.value)) {
                    return dVar8;
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
        b bVar = b.f44182c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f44170j = new h9.k.a.C0302a(objQ, bVar);
        f44171k = t7.f42919x;
        f44172l = t7.f42920y;
        f44173m = a.f44181c;
    }

    public x7(v vVar, v vVar2, k kVar, v9.b<Long> bVar, String str, f5 f5Var, v9.b<d> bVar2) {
        fd.j0.i(kVar, "div");
        fd.j0.i(bVar, "duration");
        fd.j0.i(str, FacebookMediationAdapter.KEY_ID);
        fd.j0.i(bVar2, "position");
        this.f44174a = vVar;
        this.f44175b = vVar2;
        this.f44176c = kVar;
        this.f44177d = bVar;
        this.f44178e = str;
        this.f44179f = f5Var;
        this.f44180g = bVar2;
    }

    public /* synthetic */ x7(v vVar, v vVar2, k kVar, v9.b bVar, String str, f5 f5Var, v9.b bVar2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : vVar, (i10 & 2) != 0 ? null : vVar2, kVar, (i10 & 8) != 0 ? f44169i : bVar, str, (i10 & 32) != 0 ? null : f5Var, bVar2);
    }
}
