package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v5 implements u9.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f43547g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Long> f43548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<w> f43549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Double> f43550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<Double> f43551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v9.b<Double> f43552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v9.b<Long> f43553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.k<w> f43554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f43555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Double> f43556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h9.m<Double> f43557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h9.m<Double> f43558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h9.m<Long> f43559s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f43560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<w> f43561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Double> f43562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Double> f43563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Double> f43564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v9.b<Long> f43565f;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43566c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final v5 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = v5.f43555o;
            v9.b<Long> bVar = v5.f43548h;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject, "duration", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(w.Converter);
            uc.l lVar2 = w.FROM_STRING;
            v9.b<w> bVar2 = v5.f43549i;
            v9.b<w> bVarT = h9.c.t(jSONObject, "interpolator", lVar2, eVarA, cVar, bVar2, v5.f43554n);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            uc.l<Number, Double> lVar3 = h9.h.f30981d;
            h9.m<Double> mVar2 = v5.f43556p;
            v9.b<Double> bVar3 = v5.f43550j;
            h9.k<Double> kVar2 = h9.l.f31000d;
            v9.b<Double> bVarR2 = h9.c.r(jSONObject, "pivot_x", lVar3, mVar2, eVarA, bVar3, kVar2);
            if (bVarR2 != null) {
                bVar3 = bVarR2;
            }
            h9.m<Double> mVar3 = v5.f43557q;
            v9.b<Double> bVar4 = v5.f43551k;
            v9.b<Double> bVarR3 = h9.c.r(jSONObject, "pivot_y", lVar3, mVar3, eVarA, bVar4, kVar2);
            if (bVarR3 != null) {
                bVar4 = bVarR3;
            }
            h9.m<Double> mVar4 = v5.f43558r;
            v9.b<Double> bVar5 = v5.f43552l;
            v9.b<Double> bVarR4 = h9.c.r(jSONObject, "scale", lVar3, mVar4, eVarA, bVar5, kVar2);
            if (bVarR4 != null) {
                bVar5 = bVarR4;
            }
            h9.m<Long> mVar5 = v5.f43559s;
            v9.b<Long> bVar6 = v5.f43553m;
            v9.b<Long> bVarR5 = h9.c.r(jSONObject, "start_delay", lVar, mVar5, eVarA, bVar6, kVar);
            return new v5(bVar, bVar2, bVar3, bVar4, bVar5, bVarR5 == null ? bVar6 : bVarR5);
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f43548h = aVar.a(200L);
        f43549i = aVar.a(w.EASE_IN_OUT);
        Double dValueOf = Double.valueOf(0.5d);
        f43550j = aVar.a(dValueOf);
        f43551k = aVar.a(dValueOf);
        f43552l = aVar.a(Double.valueOf(0.0d));
        f43553m = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        a aVar2 = a.f43566c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f43554n = new h9.k.a.C0302a(objQ, aVar2);
        f43555o = u4.f43081r;
        f43556p = u4.f43082s;
        f43557q = u4.f43083t;
        f43558r = u4.f43084u;
        f43559s = u4.f43085v;
    }

    public v5() {
        this(null, null, null, null, null, null, 63, null);
    }

    public v5(v9.b<Long> bVar, v9.b<w> bVar2, v9.b<Double> bVar3, v9.b<Double> bVar4, v9.b<Double> bVar5, v9.b<Long> bVar6) {
        fd.j0.i(bVar, "duration");
        fd.j0.i(bVar2, "interpolator");
        fd.j0.i(bVar3, "pivotX");
        fd.j0.i(bVar4, "pivotY");
        fd.j0.i(bVar5, "scale");
        fd.j0.i(bVar6, "startDelay");
        this.f43560a = bVar;
        this.f43561b = bVar2;
        this.f43562c = bVar3;
        this.f43563d = bVar4;
        this.f43564e = bVar5;
        this.f43565f = bVar6;
    }

    public /* synthetic */ v5(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, v9.b bVar6, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f43548h : bVar, (i10 & 2) != 0 ? f43549i : bVar2, (i10 & 4) != 0 ? f43550j : bVar3, (i10 & 8) != 0 ? f43551k : bVar4, (i10 & 16) != 0 ? f43552l : bVar5, (i10 & 32) != 0 ? f43553m : bVar6);
    }
}
