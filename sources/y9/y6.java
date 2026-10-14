package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y6 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y6 f44517d = new y6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y6 f44518e = new y6(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y6 f44519f = new y6(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y6 f44520g = new y6(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y6 f44521h = new y6(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y6 f44522i = new y6(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ y6 f44523j = new y6(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ y6 f44524k = new y6(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ y6 f44525l = new y6(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ y6 f44526m = new y6(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ y6 f44527n = new y6(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ y6 f44528o = new y6(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ y6 f44529p = new y6(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ y6 f44530q = new y6(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ y6 f44531r = new y6(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ y6 f44532s = new y6(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ y6 f44533t = new y6(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y6 f44534u = new y6(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y6 f44535v = new y6(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ y6 f44536w = new y6(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ y6 f44537x = new y6(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ y6 f44538y = new y6(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ y6 f44539z = new y6(25);
    public static final /* synthetic */ y6 A = new y6(26);
    public static final /* synthetic */ y6 B = new y6(27);
    public static final /* synthetic */ y6 C = new y6(28);
    public static final /* synthetic */ y6 D = new y6(29);

    public /* synthetic */ y6(int i10) {
        this.f44540c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f44540c) {
            case 2:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = z6.E;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 15:
            case 17:
            case 20:
            case 22:
            default:
                String str = (String) obj;
                o oVar2 = h7.K;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 6:
                long jLongValue = ((Long) obj).longValue();
                o oVar3 = z6.E;
                return jLongValue >= 0;
            case 10:
                long jLongValue2 = ((Long) obj).longValue();
                a7.a aVar = a7.f39091c;
                return jLongValue2 > 0;
            case 11:
                long jLongValue3 = ((Long) obj).longValue();
                l2 l2Var = b7.f39325c;
                return jLongValue3 > 0;
            case 12:
                long jLongValue4 = ((Long) obj).longValue();
                c7.c cVar = c7.f39537d;
                return jLongValue4 >= 0;
            case 13:
                long jLongValue5 = ((Long) obj).longValue();
                d7.f fVar = d7.f39693d;
                return jLongValue5 >= 0;
            case 14:
                long jLongValue6 = ((Long) obj).longValue();
                f7.d dVar = f7.K;
                return jLongValue6 >= 0;
            case 16:
                long jLongValue7 = ((Long) obj).longValue();
                f7.d dVar2 = f7.K;
                return jLongValue7 >= 0;
            case 18:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                f7.d dVar3 = f7.K;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 19:
                long jLongValue8 = ((Long) obj).longValue();
                f7.d dVar4 = f7.K;
                return jLongValue8 >= 0;
            case 21:
                String str2 = (String) obj;
                f7.d dVar5 = f7.K;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 23:
                String str3 = (String) obj;
                f7.e.b bVar = f7.e.f40023d;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 24:
                long jLongValue9 = ((Long) obj).longValue();
                f7.f.i iVar = f7.f.f40030r;
                return jLongValue9 >= 0;
            case 25:
                long jLongValue10 = ((Long) obj).longValue();
                f7.f.i iVar2 = f7.f.f40030r;
                return jLongValue10 >= 0;
            case 26:
                long jLongValue11 = ((Long) obj).longValue();
                f7.f.i iVar3 = f7.f.f40030r;
                return jLongValue11 >= 0;
            case 27:
                long jLongValue12 = ((Long) obj).longValue();
                f7.f.i iVar4 = f7.f.f40030r;
                return jLongValue12 >= 0;
            case 28:
                long jLongValue13 = ((Long) obj).longValue();
                f7.f.i iVar5 = f7.f.f40030r;
                return jLongValue13 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f44540c) {
            case 0:
                o oVar = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                o oVar2 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 18:
            case 19:
            default:
                f7.d dVar = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar3 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar4 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar5 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar6 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar7 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                z6.j0.g gVar = z6.j0.f44751f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                f7.d dVar2 = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                f7.d dVar3 = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                f7.d dVar4 = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
