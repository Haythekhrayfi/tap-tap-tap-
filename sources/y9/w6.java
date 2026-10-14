package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w6 implements h9.m, h9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w6 f43786d = new w6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w6 f43787e = new w6(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w6 f43788f = new w6(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w6 f43789g = new w6(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w6 f43790h = new w6(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w6 f43791i = new w6(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w6 f43792j = new w6(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w6 f43793k = new w6(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w6 f43794l = new w6(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w6 f43795m = new w6(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w6 f43796n = new w6(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w6 f43797o = new w6(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w6 f43798p = new w6(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w6 f43799q = new w6(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w6 f43800r = new w6(17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ w6 f43801s = new w6(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w6 f43802t = new w6(21);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w6 f43803u = new w6(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w6 f43804v = new w6(25);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w6 f43805w = new w6(26);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w6 f43806x = new w6(27);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w6 f43807y = new w6(28);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ w6 f43808z = new w6(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43809c;

    public /* synthetic */ w6(int i10) {
        this.f43809c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f43809c) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                x6.e eVar = x6.E;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                x6.e eVar2 = x6.E;
                return jLongValue >= 0;
            case 2:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            default:
                long jLongValue2 = ((Long) obj).longValue();
                f7.d dVar = f7.K;
                return jLongValue2 >= 0;
            case 3:
                String str = (String) obj;
                x6.e eVar3 = x6.E;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 4:
                long jLongValue3 = ((Long) obj).longValue();
                x6.e eVar4 = x6.E;
                return jLongValue3 >= 0;
            case 5:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar = z6.E;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 6:
                String str2 = (String) obj;
                o oVar2 = z6.E;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 7:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar3 = z6.E;
                return jLongValue4 >= 0;
            case 14:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar4 = z6.E;
                return jLongValue5 >= 0;
            case 18:
                long jLongValue6 = ((Long) obj).longValue();
                a7.a aVar = a7.f39091c;
                return jLongValue6 > 0;
            case 19:
                long jLongValue7 = ((Long) obj).longValue();
                l2 l2Var = b7.f39325c;
                return jLongValue7 > 0;
            case 20:
                long jLongValue8 = ((Long) obj).longValue();
                c7.c cVar = c7.f39537d;
                return jLongValue8 >= 0;
            case 21:
                long jLongValue9 = ((Long) obj).longValue();
                d7.f fVar = d7.f39693d;
                return jLongValue9 >= 0;
            case 22:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                f7.d dVar2 = f7.K;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 23:
                long jLongValue10 = ((Long) obj).longValue();
                f7.d dVar3 = f7.K;
                return jLongValue10 >= 0;
            case 24:
                long jLongValue11 = ((Long) obj).longValue();
                f7.d dVar4 = f7.K;
                return jLongValue11 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f43809c) {
            case 2:
                x6.e eVar = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar2 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar3 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar4 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar5 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar6 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar7 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar8 = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                z6.j0.g gVar = z6.j0.f44751f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                f7.d dVar = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                f7.d dVar2 = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                f7.d dVar3 = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                f7.d dVar4 = f7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
