package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q4 implements h9.g, h9.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q4 f42130d = new q4(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q4 f42131e = new q4(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q4 f42132f = new q4(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q4 f42133g = new q4(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ q4 f42134h = new q4(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ q4 f42135i = new q4(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ q4 f42136j = new q4(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ q4 f42137k = new q4(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ q4 f42138l = new q4(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ q4 f42139m = new q4(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ q4 f42140n = new q4(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ q4 f42141o = new q4(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ q4 f42142p = new q4(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ q4 f42143q = new q4(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ q4 f42144r = new q4(17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ q4 f42145s = new q4(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ q4 f42146t = new q4(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ q4 f42147u = new q4(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ q4 f42148v = new q4(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ q4 f42149w = new q4(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ q4 f42150x = new q4(28);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ q4 f42151y = new q4(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42152c;

    public /* synthetic */ q4(int i10) {
        this.f42152c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42152c) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                r4.e eVar = r4.G;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                r4.e eVar2 = r4.G;
                return jLongValue >= 0;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                r4.e eVar3 = r4.G;
                return jLongValue2 >= 0;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 22:
            default:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                v9.b<Long> bVar = x5.f44091g;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 5:
                String str = (String) obj;
                r4.e eVar4 = r4.G;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 7:
                String str2 = (String) obj;
                o oVar = v4.G;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 9:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar2 = v4.G;
                return jLongValue3 >= 0;
            case 11:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                o oVar3 = v4.G;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 16:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar4 = v4.G;
                return jLongValue4 >= 0;
            case 17:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar5 = v4.G;
                return jLongValue5 >= 0;
            case 20:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                x4.b bVar2 = x4.f44086b;
                return dDoubleValue4 > 0.0d;
            case 21:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                y4.c cVar = y4.f44485b;
                return dDoubleValue5 > 0.0d;
            case 23:
                long jLongValue6 = ((Long) obj).longValue();
                v5.b bVar3 = v5.f43547g;
                return jLongValue6 >= 0;
            case 24:
                double dDoubleValue6 = ((Double) obj).doubleValue();
                v5.b bVar4 = v5.f43547g;
                return dDoubleValue6 >= 0.0d && dDoubleValue6 <= 1.0d;
            case 25:
                double dDoubleValue7 = ((Double) obj).doubleValue();
                v5.b bVar5 = v5.f43547g;
                return dDoubleValue7 >= 0.0d && dDoubleValue7 <= 1.0d;
            case 26:
                double dDoubleValue8 = ((Double) obj).doubleValue();
                v5.b bVar6 = v5.f43547g;
                return dDoubleValue8 >= 0.0d;
            case 27:
                long jLongValue7 = ((Long) obj).longValue();
                v5.b bVar7 = v5.f43547g;
                return jLongValue7 >= 0;
            case 28:
                long jLongValue8 = ((Long) obj).longValue();
                v9.b<Long> bVar8 = x5.f44091g;
                return jLongValue8 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42152c) {
            case 0:
                r4.e eVar = r4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 16:
            case 17:
            default:
                i5.d dVar = s5.f42568e;
                fd.j0.i(list, "it");
                return list.size() >= 2;
            case 4:
                r4.e eVar2 = r4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar2 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar3 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar4 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar5 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar6 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar7 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar8 = v4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                w4.a.b bVar = w4.a.f43754c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
