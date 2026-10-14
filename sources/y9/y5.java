package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y5 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y5 f44493d = new y5(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y5 f44494e = new y5(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y5 f44495f = new y5(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y5 f44496g = new y5(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y5 f44497h = new y5(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y5 f44498i = new y5(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ y5 f44499j = new y5(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ y5 f44500k = new y5(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ y5 f44501l = new y5(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ y5 f44502m = new y5(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ y5 f44503n = new y5(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ y5 f44504o = new y5(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ y5 f44505p = new y5(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ y5 f44506q = new y5(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ y5 f44507r = new y5(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ y5 f44508s = new y5(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ y5 f44509t = new y5(20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y5 f44510u = new y5(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y5 f44511v = new y5(22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ y5 f44512w = new y5(23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ y5 f44513x = new y5(25);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ y5 f44514y = new y5(26);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ y5 f44515z = new y5(28);
    public static final /* synthetic */ y5 A = new y5(29);

    public /* synthetic */ y5(int i10) {
        this.f44516c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f44516c) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                z5.g gVar = z5.L;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 1:
                String str = (String) obj;
                z5.g gVar2 = z5.L;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
            case 4:
            case 11:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                long jLongValue = ((Long) obj).longValue();
                d6.d dVar = d6.G;
                return jLongValue >= 0;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                z5.g gVar3 = z5.L;
                return jLongValue2 >= 0;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                z5.g gVar4 = z5.L;
                return jLongValue3 >= 0;
            case 6:
                String str2 = (String) obj;
                z5.g gVar5 = z5.L;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 7:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar = b6.L;
                return jLongValue4 >= 0;
            case 8:
                String str3 = (String) obj;
                o oVar2 = b6.L;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 9:
                String str4 = (String) obj;
                o oVar3 = b6.L;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 10:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar4 = b6.L;
                return jLongValue5 >= 0;
            case 12:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar5 = b6.L;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 13:
                long jLongValue6 = ((Long) obj).longValue();
                o oVar6 = b6.L;
                return jLongValue6 >= 0;
            case 17:
                String str5 = (String) obj;
                o oVar7 = b6.L;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 20:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar8 = b6.L;
                return jLongValue7 >= 0;
            case 23:
                String str6 = (String) obj;
                d6.d dVar2 = d6.G;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 24:
                long jLongValue8 = ((Long) obj).longValue();
                d6.d dVar3 = d6.G;
                return jLongValue8 >= 0;
            case 27:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                d6.d dVar4 = d6.G;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f44516c) {
            case 2:
                z5.g gVar = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                z5.g gVar2 = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar2 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar3 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar4 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar5 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar6 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar7 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar8 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                d6.d dVar = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                d6.d dVar2 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                d6.d dVar3 = d6.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
