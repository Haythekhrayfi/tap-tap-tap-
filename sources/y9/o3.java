package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o3 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o3 f41796d = new o3(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o3 f41797e = new o3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o3 f41798f = new o3(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o3 f41799g = new o3(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ o3 f41800h = new o3(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ o3 f41801i = new o3(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ o3 f41802j = new o3(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ o3 f41803k = new o3(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ o3 f41804l = new o3(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ o3 f41805m = new o3(14);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ o3 f41806n = new o3(16);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ o3 f41807o = new o3(17);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ o3 f41808p = new o3(18);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ o3 f41809q = new o3(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ o3 f41810r = new o3(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ o3 f41811s = new o3(21);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ o3 f41812t = new o3(22);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ o3 f41813u = new o3(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o3 f41814v = new o3(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ o3 f41815w = new o3(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ o3 f41816x = new o3(26);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ o3 f41817y = new o3(27);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ o3 f41818z = new o3(28);
    public static final /* synthetic */ o3 A = new o3(29);

    public /* synthetic */ o3(int i10) {
        this.f41819c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41819c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                o oVar = p3.M;
                return jLongValue >= 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            default:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar2 = y3.R;
                return jLongValue2 >= 0;
            case 5:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = p3.M;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 7:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar4 = p3.M;
                return jLongValue3 >= 0;
            case 9:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                s3.h hVar = s3.R;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 10:
                String str = (String) obj;
                s3.h hVar2 = s3.R;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 11:
                long jLongValue4 = ((Long) obj).longValue();
                s3.h hVar3 = s3.R;
                return jLongValue4 >= 0;
            case 12:
                long jLongValue5 = ((Long) obj).longValue();
                s3.h hVar4 = s3.R;
                return jLongValue5 > 0;
            case 13:
                long jLongValue6 = ((Long) obj).longValue();
                s3.h hVar5 = s3.R;
                return jLongValue6 >= 0;
            case 15:
                String str2 = (String) obj;
                s3.h hVar6 = s3.R;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 19:
                long jLongValue7 = ((Long) obj).longValue();
                s3.h hVar7 = s3.R;
                return jLongValue7 >= 0;
            case 21:
                long jLongValue8 = ((Long) obj).longValue();
                s3.h hVar8 = s3.R;
                return jLongValue8 >= 0;
            case 22:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                o oVar5 = y3.R;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 23:
                long jLongValue9 = ((Long) obj).longValue();
                o oVar6 = y3.R;
                return jLongValue9 >= 0;
            case 24:
                String str3 = (String) obj;
                o oVar7 = y3.R;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 25:
                String str4 = (String) obj;
                o oVar8 = y3.R;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 26:
                long jLongValue10 = ((Long) obj).longValue();
                o oVar9 = y3.R;
                return jLongValue10 >= 0;
            case 27:
                long jLongValue11 = ((Long) obj).longValue();
                o oVar10 = y3.R;
                return jLongValue11 > 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41819c) {
            case 1:
                o oVar = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar3 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar4 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 19:
            default:
                o oVar5 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar6 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar7 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                s3.h hVar = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                s3.h hVar2 = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                s3.h hVar3 = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                s3.h hVar4 = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                s3.h hVar5 = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
