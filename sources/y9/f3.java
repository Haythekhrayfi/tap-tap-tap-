package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f3 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f3 f39933d = new f3(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f3 f39934e = new f3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f3 f39935f = new f3(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f3 f39936g = new f3(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f3 f39937h = new f3(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f3 f39938i = new f3(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f3 f39939j = new f3(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f3 f39940k = new f3(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f3 f39941l = new f3(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f3 f39942m = new f3(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f3 f39943n = new f3(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f3 f39944o = new f3(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f3 f39945p = new f3(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f3 f39946q = new f3(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f3 f39947r = new f3(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f3 f39948s = new f3(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ f3 f39949t = new f3(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f3 f39950u = new f3(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ f3 f39951v = new f3(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f3 f39952w = new f3(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ f3 f39953x = new f3(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ f3 f39954y = new f3(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f3 f39955z = new f3(23);
    public static final /* synthetic */ f3 A = new f3(24);
    public static final /* synthetic */ f3 B = new f3(25);
    public static final /* synthetic */ f3 C = new f3(26);
    public static final /* synthetic */ f3 D = new f3(27);
    public static final /* synthetic */ f3 E = new f3(28);
    public static final /* synthetic */ f3 F = new f3(29);

    public /* synthetic */ f3(int i10) {
        this.f39956c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f39956c) {
            case 4:
                String str = (String) obj;
                o oVar = j3.S;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 7:
                String str2 = (String) obj;
                o oVar2 = j3.S;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                o oVar3 = j3.S;
                return jLongValue >= 0;
            case 13:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar4 = j3.S;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 15:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar5 = j3.S;
                return jLongValue2 >= 0;
            case 17:
                String str3 = (String) obj;
                k3.f fVar = k3.M;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 18:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                k3.f fVar2 = k3.M;
                return dDoubleValue2 > 0.0d;
            case 19:
                long jLongValue3 = ((Long) obj).longValue();
                k3.f fVar3 = k3.M;
                return jLongValue3 >= 0;
            case 22:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                k3.f fVar4 = k3.M;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 24:
                long jLongValue4 = ((Long) obj).longValue();
                k3.f fVar5 = k3.M;
                return jLongValue4 >= 0;
            case 26:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                o oVar6 = p3.M;
                return dDoubleValue4 > 0.0d;
            case 28:
                String str4 = (String) obj;
                o oVar7 = p3.M;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            default:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                o oVar8 = p3.M;
                return dDoubleValue5 > 0.0d;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f39956c) {
            case 0:
                v9.b<Double> bVar = g3.f40123h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                o oVar = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar3 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
            case 7:
            case 8:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            default:
                o oVar4 = p3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar5 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar6 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar7 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar8 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar9 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar10 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar11 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar12 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                k3.f fVar = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                k3.f fVar2 = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                k3.f fVar3 = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                k3.f fVar4 = k3.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
