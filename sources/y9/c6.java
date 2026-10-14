package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c6 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c6 f39513d = new c6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c6 f39514e = new c6(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c6 f39515f = new c6(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c6 f39516g = new c6(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c6 f39517h = new c6(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c6 f39518i = new c6(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c6 f39519j = new c6(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c6 f39520k = new c6(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ c6 f39521l = new c6(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c6 f39522m = new c6(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c6 f39523n = new c6(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ c6 f39524o = new c6(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c6 f39525p = new c6(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ c6 f39526q = new c6(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c6 f39527r = new c6(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ c6 f39528s = new c6(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c6 f39529t = new c6(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ c6 f39530u = new c6(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c6 f39531v = new c6(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c6 f39532w = new c6(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c6 f39533x = new c6(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c6 f39534y = new c6(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ c6 f39535z = new c6(23);
    public static final /* synthetic */ c6 A = new c6(24);
    public static final /* synthetic */ c6 B = new c6(27);
    public static final /* synthetic */ c6 C = new c6(28);
    public static final /* synthetic */ c6 D = new c6(29);

    public /* synthetic */ c6(int i10) {
        this.f39536c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f39536c) {
            case 1:
                String str = (String) obj;
                d6.d dVar = d6.G;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 15:
            default:
                String str2 = (String) obj;
                s6.d dVar2 = s6.M;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 4:
                String str3 = (String) obj;
                o oVar = e6.G;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 6:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = e6.G;
                return jLongValue >= 0;
            case 12:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = e6.G;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 14:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar4 = e6.G;
                return jLongValue2 >= 0;
            case 16:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                f6.b bVar = f6.f39963e;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 17:
                long jLongValue3 = ((Long) obj).longValue();
                f6.b bVar2 = f6.f39963e;
                return jLongValue3 >= 0;
            case 18:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                g6.f fVar = g6.f40174e;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 19:
                long jLongValue4 = ((Long) obj).longValue();
                g6.f fVar2 = g6.f40174e;
                return jLongValue4 >= 0;
            case 20:
                long jLongValue5 = ((Long) obj).longValue();
                o6.c cVar = o6.f41824f;
                return jLongValue5 >= 0;
            case 21:
                long jLongValue6 = ((Long) obj).longValue();
                o6.c cVar2 = o6.f41824f;
                return jLongValue6 >= 0;
            case 22:
                long jLongValue7 = ((Long) obj).longValue();
                v9.b<Long> bVar3 = q6.f42158f;
                return jLongValue7 >= 0;
            case 23:
                long jLongValue8 = ((Long) obj).longValue();
                v9.b<Long> bVar4 = q6.f42158f;
                return jLongValue8 >= 0;
            case 24:
                long jLongValue9 = ((Long) obj).longValue();
                s6.d dVar3 = s6.M;
                return jLongValue9 >= 0;
            case 25:
                String str4 = (String) obj;
                s6.d dVar4 = s6.M;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f39536c) {
            case 0:
                d6.d dVar = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar2 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar3 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar4 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar5 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar6 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar7 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar8 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar9 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar10 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                s6.d dVar2 = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 28:
                s6.d dVar3 = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                s6.d dVar4 = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
