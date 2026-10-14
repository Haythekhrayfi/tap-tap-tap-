package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g7 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g7 f40196d = new g7(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g7 f40197e = new g7(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g7 f40198f = new g7(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g7 f40199g = new g7(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g7 f40200h = new g7(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g7 f40201i = new g7(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g7 f40202j = new g7(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ g7 f40203k = new g7(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g7 f40204l = new g7(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g7 f40205m = new g7(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g7 f40206n = new g7(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ g7 f40207o = new g7(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ g7 f40208p = new g7(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ g7 f40209q = new g7(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g7 f40210r = new g7(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ g7 f40211s = new g7(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g7 f40212t = new g7(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ g7 f40213u = new g7(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g7 f40214v = new g7(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ g7 f40215w = new g7(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g7 f40216x = new g7(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g7 f40217y = new g7(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ g7 f40218z = new g7(24);
    public static final /* synthetic */ g7 A = new g7(25);
    public static final /* synthetic */ g7 B = new g7(27);
    public static final /* synthetic */ g7 C = new g7(28);
    public static final /* synthetic */ g7 D = new g7(29);

    public /* synthetic */ g7(int i10) {
        this.f40219c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f40219c) {
            case 1:
                long jLongValue = ((Long) obj).longValue();
                o oVar = h7.K;
                return jLongValue >= 0;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 21:
            case 24:
            default:
                String str = (String) obj;
                l7.k kVar = l7.f41242a0;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar2 = h7.K;
                return jLongValue2 >= 0;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = h7.K;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 9:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar4 = h7.K;
                return jLongValue3 >= 0;
            case 12:
                String str2 = (String) obj;
                h7.o0.e eVar = h7.o0.f40389d;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 13:
                long jLongValue4 = ((Long) obj).longValue();
                h7.p0.z zVar = h7.p0.f40418s;
                return jLongValue4 >= 0;
            case 14:
                long jLongValue5 = ((Long) obj).longValue();
                h7.p0.z zVar2 = h7.p0.f40418s;
                return jLongValue5 >= 0;
            case 15:
                long jLongValue6 = ((Long) obj).longValue();
                h7.p0.z zVar3 = h7.p0.f40418s;
                return jLongValue6 >= 0;
            case 16:
                long jLongValue7 = ((Long) obj).longValue();
                h7.p0.z zVar4 = h7.p0.f40418s;
                return jLongValue7 >= 0;
            case 17:
                long jLongValue8 = ((Long) obj).longValue();
                h7.p0.z zVar5 = h7.p0.f40418s;
                return jLongValue8 >= 0;
            case 18:
                long jLongValue9 = ((Long) obj).longValue();
                l7.k kVar2 = l7.f41242a0;
                return jLongValue9 >= 0;
            case 19:
                String str3 = (String) obj;
                l7.k kVar3 = l7.f41242a0;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 20:
                long jLongValue10 = ((Long) obj).longValue();
                l7.k kVar4 = l7.f41242a0;
                return jLongValue10 >= 0;
            case 22:
                long jLongValue11 = ((Long) obj).longValue();
                l7.k kVar5 = l7.f41242a0;
                return jLongValue11 >= 0;
            case 23:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                l7.k kVar6 = l7.f41242a0;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 25:
                long jLongValue12 = ((Long) obj).longValue();
                l7.k kVar7 = l7.f41242a0;
                return jLongValue12 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f40219c) {
            case 0:
                o oVar = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar3 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar4 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar5 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar6 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar7 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar8 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                l7.k kVar = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                l7.k kVar2 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                l7.k kVar3 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 28:
                l7.k kVar4 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                l7.k kVar5 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
