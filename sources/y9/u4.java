package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u4 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u4 f43067d = new u4(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u4 f43068e = new u4(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u4 f43069f = new u4(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u4 f43070g = new u4(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u4 f43071h = new u4(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u4 f43072i = new u4(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ u4 f43073j = new u4(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ u4 f43074k = new u4(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u4 f43075l = new u4(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ u4 f43076m = new u4(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ u4 f43077n = new u4(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ u4 f43078o = new u4(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ u4 f43079p = new u4(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ u4 f43080q = new u4(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ u4 f43081r = new u4(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ u4 f43082s = new u4(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ u4 f43083t = new u4(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ u4 f43084u = new u4(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ u4 f43085v = new u4(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u4 f43086w = new u4(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ u4 f43087x = new u4(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ u4 f43088y = new u4(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ u4 f43089z = new u4(23);
    public static final /* synthetic */ u4 A = new u4(24);
    public static final /* synthetic */ u4 B = new u4(25);
    public static final /* synthetic */ u4 C = new u4(26);
    public static final /* synthetic */ u4 D = new u4(27);
    public static final /* synthetic */ u4 E = new u4(29);

    public /* synthetic */ u4(int i10) {
        this.f43090c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f43090c) {
            case 1:
                long jLongValue = ((Long) obj).longValue();
                o oVar = v4.G;
                return jLongValue >= 0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            default:
                long jLongValue2 = ((Long) obj).longValue();
                z5.g gVar = z5.L;
                return jLongValue2 >= 0;
            case 7:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar2 = v4.G;
                return jLongValue3 >= 0;
            case 8:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar3 = v4.G;
                return jLongValue4 >= 0;
            case 11:
                double dDoubleValue = ((Double) obj).doubleValue();
                x4.b bVar = x4.f44086b;
                return dDoubleValue > 0.0d;
            case 12:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                y4.c cVar = y4.f44485b;
                return dDoubleValue2 > 0.0d;
            case 15:
                long jLongValue5 = ((Long) obj).longValue();
                v5.b bVar2 = v5.f43547g;
                return jLongValue5 >= 0;
            case 16:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                v5.b bVar3 = v5.f43547g;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 17:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                v5.b bVar4 = v5.f43547g;
                return dDoubleValue4 >= 0.0d && dDoubleValue4 <= 1.0d;
            case 18:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                v5.b bVar5 = v5.f43547g;
                return dDoubleValue5 >= 0.0d;
            case 19:
                long jLongValue6 = ((Long) obj).longValue();
                v5.b bVar6 = v5.f43547g;
                return jLongValue6 >= 0;
            case 20:
                long jLongValue7 = ((Long) obj).longValue();
                v9.b<Long> bVar7 = x5.f44091g;
                return jLongValue7 >= 0;
            case 21:
                double dDoubleValue6 = ((Double) obj).doubleValue();
                v9.b<Long> bVar8 = x5.f44091g;
                return dDoubleValue6 >= 0.0d && dDoubleValue6 <= 1.0d;
            case 22:
                double dDoubleValue7 = ((Double) obj).doubleValue();
                v9.b<Long> bVar9 = x5.f44091g;
                return dDoubleValue7 >= 0.0d && dDoubleValue7 <= 1.0d;
            case 23:
                double dDoubleValue8 = ((Double) obj).doubleValue();
                v9.b<Long> bVar10 = x5.f44091g;
                return dDoubleValue8 >= 0.0d;
            case 24:
                long jLongValue8 = ((Long) obj).longValue();
                v9.b<Long> bVar11 = x5.f44091g;
                return jLongValue8 >= 0;
            case 25:
                String str = (String) obj;
                z5.g gVar2 = z5.L;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 26:
                String str2 = (String) obj;
                z5.g gVar3 = z5.L;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 27:
                long jLongValue9 = ((Long) obj).longValue();
                z5.g gVar4 = z5.L;
                return jLongValue9 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f43090c) {
            case 0:
                o oVar = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
            case 7:
            case 8:
            case 11:
            case 12:
            default:
                z5.g gVar = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar3 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar4 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar5 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar6 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar7 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                w4.c cVar = w4.f43749b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                h5.a aVar = h5.f40280e;
                fd.j0.i(list, "it");
                return list.size() >= 2;
            case 14:
                i5.d dVar = s5.f42568e;
                fd.j0.i(list, "it");
                return list.size() >= 2;
        }
    }
}
