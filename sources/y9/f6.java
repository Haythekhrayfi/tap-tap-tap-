package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f6 implements u9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f39963e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Double> f39964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f39965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Integer> f39966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Double> f39967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Long> f39968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, f6> f39969k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Double> f39970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f39971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Integer> f39972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f5 f39973d;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, f6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39974c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public f6 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(f6.f39963e);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Double> lVar = h9.h.f30981d;
            h9.m<Double> mVar = f6.f39967i;
            v9.b<Double> bVar = f6.f39964f;
            v9.b<Double> bVarR = h9.c.r(jSONObject2, "alpha", lVar, mVar, eVarA, bVar, h9.l.f31000d);
            if (bVarR != null) {
                bVar = bVarR;
            }
            uc.l<Number, Long> lVar2 = h9.h.f30982e;
            h9.m<Long> mVar2 = f6.f39968j;
            v9.b<Long> bVar2 = f6.f39965g;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "blur", lVar2, mVar2, eVarA, bVar2, h9.l.f30998b);
            if (bVarR2 != null) {
                bVar2 = bVarR2;
            }
            uc.l<Object, Integer> lVar3 = h9.h.f30978a;
            v9.b<Integer> bVar3 = f6.f39966h;
            v9.b<Integer> bVarT = h9.c.t(jSONObject2, "color", lVar3, eVarA, cVar2, bVar3, h9.l.f31002f);
            if (bVarT != null) {
                bVar3 = bVarT;
            }
            Objects.requireNonNull(f5.f39958c);
            return new f6(bVar, bVar2, bVar3, (f5) h9.c.d(jSONObject2, "offset", f5.f39959d, h9.c.f30971a, cVar2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f39964f = aVar.a(Double.valueOf(0.19d));
        f39965g = aVar.a(2L);
        f39966h = aVar.a(0);
        f39967i = c6.f39528s;
        f39968j = c6.f39529t;
        f39969k = a.f39974c;
    }

    public f6(v9.b<Double> bVar, v9.b<Long> bVar2, v9.b<Integer> bVar3, f5 f5Var) {
        fd.j0.i(bVar, "alpha");
        fd.j0.i(bVar2, "blur");
        fd.j0.i(bVar3, "color");
        fd.j0.i(f5Var, "offset");
        this.f39970a = bVar;
        this.f39971b = bVar2;
        this.f39972c = bVar3;
        this.f39973d = f5Var;
    }

    public /* synthetic */ f6(v9.b bVar, v9.b bVar2, v9.b bVar3, f5 f5Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39964f : bVar, (i10 & 2) != 0 ? f39965g : bVar2, (i10 & 4) != 0 ? f39966h : bVar3, f5Var);
    }
}
