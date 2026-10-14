package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r2 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r2 f42257d = new r2(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r2 f42258e = new r2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r2 f42259f = new r2(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r2 f42260g = new r2(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r2 f42261h = new r2(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r2 f42262i = new r2(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r2 f42263j = new r2(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ r2 f42264k = new r2(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ r2 f42265l = new r2(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ r2 f42266m = new r2(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ r2 f42267n = new r2(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r2 f42268o = new r2(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ r2 f42269p = new r2(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ r2 f42270q = new r2(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ r2 f42271r = new r2(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ r2 f42272s = new r2(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ r2 f42273t = new r2(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r2 f42274u = new r2(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ r2 f42275v = new r2(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ r2 f42276w = new r2(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ r2 f42277x = new r2(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r2 f42278y = new r2(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ r2 f42279z = new r2(23);
    public static final /* synthetic */ r2 A = new r2(24);
    public static final /* synthetic */ r2 B = new r2(25);
    public static final /* synthetic */ r2 C = new r2(26);
    public static final /* synthetic */ r2 D = new r2(27);
    public static final /* synthetic */ r2 E = new r2(28);
    public static final /* synthetic */ r2 F = new r2(29);

    public /* synthetic */ r2(int i10) {
        this.f42280c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42280c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                t2.g gVar = t2.J;
                return jLongValue >= 0;
            case 2:
                long jLongValue2 = ((Long) obj).longValue();
                t2.g gVar2 = t2.J;
                return jLongValue2 >= 0;
            case 6:
                long jLongValue3 = ((Long) obj).longValue();
                t2.g gVar3 = t2.J;
                return jLongValue3 > 0;
            case 7:
                long jLongValue4 = ((Long) obj).longValue();
                t2.g gVar4 = t2.J;
                return jLongValue4 >= 0;
            case 8:
                long jLongValue5 = ((Long) obj).longValue();
                t2.g gVar5 = t2.J;
                return jLongValue5 >= 0;
            case 9:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = u2.J;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 10:
                long jLongValue6 = ((Long) obj).longValue();
                o oVar2 = u2.J;
                return jLongValue6 >= 0;
            case 13:
                String str = (String) obj;
                o oVar3 = u2.J;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 14:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar4 = u2.J;
                return jLongValue7 >= 0;
            case 16:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar5 = u2.J;
                return jLongValue8 >= 0;
            case 22:
                long jLongValue9 = ((Long) obj).longValue();
                o oVar6 = u2.J;
                return jLongValue9 > 0;
            case 23:
                long jLongValue10 = ((Long) obj).longValue();
                o oVar7 = u2.J;
                return jLongValue10 >= 0;
            case 24:
                long jLongValue11 = ((Long) obj).longValue();
                o oVar8 = u2.J;
                return jLongValue11 >= 0;
            case 27:
                String str2 = (String) obj;
                w2.g gVar6 = w2.N;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            default:
                long jLongValue12 = ((Long) obj).longValue();
                w2.g gVar7 = w2.N;
                return jLongValue12 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42280c) {
            case 1:
                t2.g gVar = t2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 16:
            case 22:
            case 23:
            case 24:
            default:
                w2.g gVar2 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                t2.g gVar3 = t2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                t2.g gVar4 = t2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                t2.g gVar5 = t2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar2 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar3 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                o oVar4 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar5 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar6 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o oVar7 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar8 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                w2.g gVar6 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                w2.g gVar7 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
