package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i3 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i3 f40580d = new i3(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i3 f40581e = new i3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i3 f40582f = new i3(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i3 f40583g = new i3(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i3 f40584h = new i3(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i3 f40585i = new i3(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ i3 f40586j = new i3(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i3 f40587k = new i3(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ i3 f40588l = new i3(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ i3 f40589m = new i3(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ i3 f40590n = new i3(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ i3 f40591o = new i3(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ i3 f40592p = new i3(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ i3 f40593q = new i3(18);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ i3 f40594r = new i3(19);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ i3 f40595s = new i3(20);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ i3 f40596t = new i3(21);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i3 f40597u = new i3(22);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i3 f40598v = new i3(23);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i3 f40599w = new i3(24);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i3 f40600x = new i3(25);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ i3 f40601y = new i3(26);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ i3 f40602z = new i3(27);
    public static final /* synthetic */ i3 A = new i3(28);
    public static final /* synthetic */ i3 B = new i3(29);

    public /* synthetic */ i3(int i10) {
        this.f40603c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f40603c) {
            case 3:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = j3.S;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 4:
            case 5:
            case 7:
            case 11:
            case 12:
            case 16:
            case 18:
            case 22:
            case 24:
            case 25:
            case 26:
            default:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = p3.M;
                return jLongValue >= 0;
            case 6:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar3 = j3.S;
                return jLongValue2 >= 0;
            case 8:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                k3.f fVar = k3.M;
                return dDoubleValue2 > 0.0d;
            case 9:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                k3.f fVar2 = k3.M;
                return dDoubleValue3 > 0.0d;
            case 10:
                long jLongValue3 = ((Long) obj).longValue();
                k3.f fVar3 = k3.M;
                return jLongValue3 >= 0;
            case 13:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                k3.f fVar4 = k3.M;
                return dDoubleValue4 > 0.0d;
            case 14:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                k3.f fVar5 = k3.M;
                return dDoubleValue5 >= 0.0d && dDoubleValue5 <= 1.0d;
            case 15:
                long jLongValue4 = ((Long) obj).longValue();
                k3.f fVar6 = k3.M;
                return jLongValue4 >= 0;
            case 17:
                String str = (String) obj;
                k3.f fVar7 = k3.M;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 19:
                String str2 = (String) obj;
                o oVar4 = p3.M;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 20:
                double dDoubleValue6 = ((Double) obj).doubleValue();
                o oVar5 = p3.M;
                return dDoubleValue6 > 0.0d;
            case 21:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar6 = p3.M;
                return jLongValue5 >= 0;
            case 23:
                double dDoubleValue7 = ((Double) obj).doubleValue();
                o oVar7 = p3.M;
                return dDoubleValue7 > 0.0d;
            case 27:
                double dDoubleValue8 = ((Double) obj).doubleValue();
                o oVar8 = p3.M;
                return dDoubleValue8 >= 0.0d && dDoubleValue8 <= 1.0d;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f40603c) {
            case 0:
                o oVar = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                o oVar2 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar3 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
            case 6:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 23:
            default:
                o oVar4 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar5 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar6 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar7 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                k3.f fVar = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                k3.f fVar2 = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                k3.f fVar3 = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar8 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar9 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar10 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar11 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                o oVar12 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
