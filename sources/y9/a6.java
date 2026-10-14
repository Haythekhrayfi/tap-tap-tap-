package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a6 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a6 f39067d = new a6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a6 f39068e = new a6(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a6 f39069f = new a6(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a6 f39070g = new a6(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a6 f39071h = new a6(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a6 f39072i = new a6(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a6 f39073j = new a6(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a6 f39074k = new a6(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a6 f39075l = new a6(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a6 f39076m = new a6(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a6 f39077n = new a6(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a6 f39078o = new a6(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a6 f39079p = new a6(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a6 f39080q = new a6(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a6 f39081r = new a6(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a6 f39082s = new a6(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a6 f39083t = new a6(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a6 f39084u = new a6(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a6 f39085v = new a6(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a6 f39086w = new a6(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a6 f39087x = new a6(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a6 f39088y = new a6(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a6 f39089z = new a6(23);
    public static final /* synthetic */ a6 A = new a6(26);
    public static final /* synthetic */ a6 B = new a6(27);

    public /* synthetic */ a6(int i10) {
        this.f39090c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f39090c) {
            case 3:
                long jLongValue = ((Long) obj).longValue();
                d6.d dVar = d6.G;
                return jLongValue >= 0;
            case 6:
                double dDoubleValue = ((Double) obj).doubleValue();
                d6.d dVar2 = d6.G;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 7:
                long jLongValue2 = ((Long) obj).longValue();
                d6.d dVar3 = d6.G;
                return jLongValue2 >= 0;
            case 13:
                String str = (String) obj;
                o oVar = e6.G;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 15:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar2 = e6.G;
                return jLongValue3 >= 0;
            case 20:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar3 = e6.G;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 22:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar4 = e6.G;
                return jLongValue4 >= 0;
            case 24:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                f6.b bVar = f6.f39963e;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 25:
                long jLongValue5 = ((Long) obj).longValue();
                f6.b bVar2 = f6.f39963e;
                return jLongValue5 >= 0;
            case 26:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                g6.f fVar = g6.f40174e;
                return dDoubleValue4 >= 0.0d && dDoubleValue4 <= 1.0d;
            case 27:
                long jLongValue6 = ((Long) obj).longValue();
                g6.f fVar2 = g6.f40174e;
                return jLongValue6 >= 0;
            case 28:
                long jLongValue7 = ((Long) obj).longValue();
                o6.c cVar = o6.f41824f;
                return jLongValue7 >= 0;
            default:
                long jLongValue8 = ((Long) obj).longValue();
                o6.c cVar2 = o6.f41824f;
                return jLongValue8 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f39090c) {
            case 0:
                o oVar = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                d6.d dVar = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                d6.d dVar2 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
            case 6:
            case 7:
            case 13:
            case 15:
            case 20:
            default:
                o oVar2 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                d6.d dVar3 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                d6.d dVar4 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                d6.d dVar5 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                d6.d dVar6 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar3 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar4 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar5 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar6 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar7 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                o oVar8 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar9 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar10 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar11 = e6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
