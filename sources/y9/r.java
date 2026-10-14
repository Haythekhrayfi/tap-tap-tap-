package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r f42204d = new r(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r f42205e = new r(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r f42206f = new r(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r f42207g = new r(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r f42208h = new r(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r f42209i = new r(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r f42210j = new r(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ r f42211k = new r(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ r f42212l = new r(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ r f42213m = new r(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ r f42214n = new r(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r f42215o = new r(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ r f42216p = new r(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ r f42217q = new r(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ r f42218r = new r(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ r f42219s = new r(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ r f42220t = new r(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r f42221u = new r(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ r f42222v = new r(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ r f42223w = new r(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ r f42224x = new r(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r f42225y = new r(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ r f42226z = new r(23);
    public static final /* synthetic */ r A = new r(24);
    public static final /* synthetic */ r B = new r(25);
    public static final /* synthetic */ r C = new r(27);
    public static final /* synthetic */ r D = new r(28);

    public /* synthetic */ r(int i10) {
        this.f42227c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42227c) {
            case 1:
                String str = (String) obj;
                q.d.b bVar = q.d.f42104d;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
                String str2 = (String) obj;
                s.k kVar = s.f42386i;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 3:
            case 4:
            case 9:
            case 11:
            case 12:
            case 23:
            case 24:
            case 25:
            default:
                double dDoubleValue = ((Double) obj).doubleValue();
                w0.h hVar = w0.N;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 5:
                String str3 = (String) obj;
                s.l.e eVar = s.l.f42419d;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 6:
                long jLongValue = ((Long) obj).longValue();
                v.d dVar = v.f43377h;
                return jLongValue >= 0;
            case 7:
                long jLongValue2 = ((Long) obj).longValue();
                v.d dVar2 = v.f43377h;
                return jLongValue2 >= 0;
            case 8:
                long jLongValue3 = ((Long) obj).longValue();
                x.l lVar = x.f43838i;
                return jLongValue3 >= 0;
            case 10:
                long jLongValue4 = ((Long) obj).longValue();
                x.l lVar2 = x.f43838i;
                return jLongValue4 >= 0;
            case 13:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                c0.b bVar2 = c0.f39344b;
                return dDoubleValue2 > 0.0d;
            case 14:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                d0.c cVar = d0.f39549b;
                return dDoubleValue3 > 0.0d;
            case 15:
                long jLongValue5 = ((Long) obj).longValue();
                i0.a aVar = i0.f40528b;
                return jLongValue5 >= 0;
            case 16:
                long jLongValue6 = ((Long) obj).longValue();
                h9.m<Long> mVar = j0.f40649b;
                return jLongValue6 >= 0;
            case 17:
                long jLongValue7 = ((Long) obj).longValue();
                k0.b bVar3 = k0.f40992f;
                return jLongValue7 >= 0;
            case 18:
                long jLongValue8 = ((Long) obj).longValue();
                l0.g gVar = l0.f41168f;
                return jLongValue8 >= 0;
            case 19:
                long jLongValue9 = ((Long) obj).longValue();
                m0.b bVar4 = m0.f41406d;
                return jLongValue9 >= 0;
            case 20:
                long jLongValue10 = ((Long) obj).longValue();
                m0.b bVar5 = m0.f41406d;
                return jLongValue10 >= 0;
            case 21:
                long jLongValue11 = ((Long) obj).longValue();
                v9.b<Long> bVar6 = o0.f41717d;
                return jLongValue11 >= 0;
            case 22:
                long jLongValue12 = ((Long) obj).longValue();
                v9.b<Long> bVar7 = o0.f41717d;
                return jLongValue12 >= 0;
            case 26:
                long jLongValue13 = ((Long) obj).longValue();
                w0.h hVar2 = w0.N;
                return jLongValue13 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42227c) {
            case 0:
                q.d.b bVar = q.d.f42104d;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                s.k kVar = s.f42386i;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                s.l.e eVar = s.l.f42419d;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                x.l lVar = x.f43838i;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                y.a aVar = y.f44192b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                h9.g<a0> gVar = z.f44576b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                h9.g<r0> gVar2 = q0.f42113b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                w0.h hVar = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                w0.h hVar2 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                w0.h hVar3 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                w0.h hVar4 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
