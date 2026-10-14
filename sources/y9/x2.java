package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x2 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x2 f44039d = new x2(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x2 f44040e = new x2(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x2 f44041f = new x2(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x2 f44042g = new x2(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x2 f44043h = new x2(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x2 f44044i = new x2(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x2 f44045j = new x2(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x2 f44046k = new x2(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ x2 f44047l = new x2(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x2 f44048m = new x2(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ x2 f44049n = new x2(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x2 f44050o = new x2(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x2 f44051p = new x2(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ x2 f44052q = new x2(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x2 f44053r = new x2(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ x2 f44054s = new x2(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ x2 f44055t = new x2(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x2 f44056u = new x2(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x2 f44057v = new x2(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ x2 f44058w = new x2(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x2 f44059x = new x2(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ x2 f44060y = new x2(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ x2 f44061z = new x2(25);
    public static final /* synthetic */ x2 A = new x2(26);
    public static final /* synthetic */ x2 B = new x2(27);
    public static final /* synthetic */ x2 C = new x2(28);
    public static final /* synthetic */ x2 D = new x2(29);

    public /* synthetic */ x2(int i10) {
        this.f44062c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f44062c) {
            case 1:
                String str = (String) obj;
                o oVar = y2.N;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = y2.N;
                return jLongValue >= 0;
            case 8:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = y2.N;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 10:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar4 = y2.N;
                return jLongValue2 >= 0;
            case 13:
                String str2 = (String) obj;
                a3.f fVar = a3.J;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 15:
                long jLongValue3 = ((Long) obj).longValue();
                a3.f fVar2 = a3.J;
                return jLongValue3 >= 0;
            case 17:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                a3.f fVar3 = a3.J;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 18:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                a3.f fVar4 = a3.J;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 19:
                long jLongValue4 = ((Long) obj).longValue();
                a3.f fVar5 = a3.J;
                return jLongValue4 >= 0;
            case 20:
                long jLongValue5 = ((Long) obj).longValue();
                a3.f fVar6 = a3.J;
                return jLongValue5 >= 0;
            case 26:
                String str3 = (String) obj;
                o oVar5 = c3.J;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            default:
                long jLongValue6 = ((Long) obj).longValue();
                o oVar6 = c3.J;
                return jLongValue6 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f44062c) {
            case 0:
                o oVar = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
            case 3:
            case 8:
            case 10:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 26:
            default:
                o oVar2 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar3 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar4 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar5 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar6 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar7 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar8 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar9 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                a3.f fVar = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                a3.f fVar2 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                a3.f fVar3 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                a3.f fVar4 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar10 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar11 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar12 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar13 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar14 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
