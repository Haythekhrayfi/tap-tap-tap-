package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x1 implements u9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f44020f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f44021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Long> f44022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Long> f44023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v9.b<Long> f44024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v9.b<n6> f44025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.k<n6> f44026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f44027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<Long> f44028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<Long> f44029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<Long> f44030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, x1> f44031q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f44032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<Long> f44033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Long> f44034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Long> f44035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<n6> f44036e;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, x1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44037c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public x1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(x1.f44020f);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = x1.f44027m;
            v9.b<Long> bVar = x1.f44021g;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "bottom", lVar, mVar, eVarA, bVar, kVar);
            v9.b<Long> bVar2 = bVarR == null ? bVar : bVarR;
            h9.m<Long> mVar2 = x1.f44028n;
            v9.b<Long> bVar3 = x1.f44022h;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject2, "left", lVar, mVar2, eVarA, bVar3, kVar);
            v9.b<Long> bVar4 = bVarR2 == null ? bVar3 : bVarR2;
            h9.m<Long> mVar3 = x1.f44029o;
            v9.b<Long> bVar5 = x1.f44023i;
            v9.b<Long> bVarR3 = h9.c.r(jSONObject2, "right", lVar, mVar3, eVarA, bVar5, kVar);
            v9.b<Long> bVar6 = bVarR3 == null ? bVar5 : bVarR3;
            h9.m<Long> mVar4 = x1.f44030p;
            v9.b<Long> bVar7 = x1.f44024j;
            v9.b<Long> bVarR4 = h9.c.r(jSONObject2, "top", lVar, mVar4, eVarA, bVar7, kVar);
            v9.b<Long> bVar8 = bVarR4 == null ? bVar7 : bVarR4;
            Objects.requireNonNull(n6.Converter);
            uc.l lVar2 = n6.FROM_STRING;
            v9.b<n6> bVar9 = x1.f44025k;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, "unit", lVar2, eVarA, cVar2, bVar9, x1.f44026l);
            return new x1(bVar2, bVar4, bVar6, bVar8, bVarT == null ? bVar9 : bVarT);
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44038c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f44021g = aVar.a(0L);
        f44022h = aVar.a(0L);
        f44023i = aVar.a(0L);
        f44024j = aVar.a(0L);
        f44025k = aVar.a(n6.DP);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        b bVar = b.f44038c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f44026l = new h9.k.a.C0302a(objQ, bVar);
        f44027m = r1.f42238i;
        f44028n = r1.f42239j;
        f44029o = r1.f42240k;
        f44030p = r1.f42241l;
        f44031q = a.f44037c;
    }

    public x1() {
        this(null, null, null, null, null, 31, null);
    }

    public x1(v9.b<Long> bVar, v9.b<Long> bVar2, v9.b<Long> bVar3, v9.b<Long> bVar4, v9.b<n6> bVar5) {
        fd.j0.i(bVar, "bottom");
        fd.j0.i(bVar2, "left");
        fd.j0.i(bVar3, "right");
        fd.j0.i(bVar4, "top");
        fd.j0.i(bVar5, "unit");
        this.f44032a = bVar;
        this.f44033b = bVar2;
        this.f44034c = bVar3;
        this.f44035d = bVar4;
        this.f44036e = bVar5;
    }

    public /* synthetic */ x1(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f44021g : bVar, (i10 & 2) != 0 ? f44022h : bVar2, (i10 & 4) != 0 ? f44023i : bVar3, (i10 & 8) != 0 ? f44024j : bVar4, (i10 & 16) != 0 ? f44025k : bVar5);
    }
}
