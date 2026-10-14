package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n3 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n3 f41657d = new n3(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n3 f41658e = new n3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n3 f41659f = new n3(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n3 f41660g = new n3(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n3 f41661h = new n3(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n3 f41662i = new n3(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n3 f41663j = new n3(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n3 f41664k = new n3(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n3 f41665l = new n3(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n3 f41666m = new n3(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n3 f41667n = new n3(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ n3 f41668o = new n3(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ n3 f41669p = new n3(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ n3 f41670q = new n3(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n3 f41671r = new n3(17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ n3 f41672s = new n3(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ n3 f41673t = new n3(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ n3 f41674u = new n3(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ n3 f41675v = new n3(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ n3 f41676w = new n3(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ n3 f41677x = new n3(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ n3 f41678y = new n3(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ n3 f41679z = new n3(25);
    public static final /* synthetic */ n3 A = new n3(26);
    public static final /* synthetic */ n3 B = new n3(27);
    public static final /* synthetic */ n3 C = new n3(28);
    public static final /* synthetic */ n3 D = new n3(29);

    public /* synthetic */ n3(int i10) {
        this.f41680c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41680c) {
            case 1:
                String str = (String) obj;
                s3.h hVar = s3.R;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
                String str2 = (String) obj;
                s3.h hVar2 = s3.R;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                s3.h hVar3 = s3.R;
                return jLongValue >= 0;
            case 4:
                long jLongValue2 = ((Long) obj).longValue();
                s3.h hVar4 = s3.R;
                return jLongValue2 > 0;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                s3.h hVar5 = s3.R;
                return jLongValue3 >= 0;
            case 6:
                double dDoubleValue = ((Double) obj).doubleValue();
                s3.h hVar6 = s3.R;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 7:
                String str3 = (String) obj;
                s3.h hVar7 = s3.R;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 8:
            case 9:
            case 11:
            case 21:
            default:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar = y3.R;
                return jLongValue4 >= 0;
            case 10:
                long jLongValue5 = ((Long) obj).longValue();
                s3.h hVar8 = s3.R;
                return jLongValue5 >= 0;
            case 12:
                long jLongValue6 = ((Long) obj).longValue();
                s3.h hVar9 = s3.R;
                return jLongValue6 >= 0;
            case 13:
                String str4 = (String) obj;
                s3.h hVar10 = s3.R;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 14:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar2 = y3.R;
                return jLongValue7 >= 0;
            case 15:
                String str5 = (String) obj;
                o oVar3 = y3.R;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 16:
                String str6 = (String) obj;
                o oVar4 = y3.R;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 17:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar5 = y3.R;
                return jLongValue8 >= 0;
            case 18:
                long jLongValue9 = ((Long) obj).longValue();
                o oVar6 = y3.R;
                return jLongValue9 > 0;
            case 19:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar7 = y3.R;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 20:
                long jLongValue10 = ((Long) obj).longValue();
                o oVar8 = y3.R;
                return jLongValue10 >= 0;
            case 22:
                String str7 = (String) obj;
                o oVar9 = y3.R;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41680c) {
            case 0:
                o oVar = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                s3.h hVar = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                s3.h hVar2 = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                s3.h hVar3 = s3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar2 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar3 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar4 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar5 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                o oVar6 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar7 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar8 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
