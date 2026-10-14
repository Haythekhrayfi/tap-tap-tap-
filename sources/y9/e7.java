package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e7 implements h9.m, h9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e7 f39876d = new e7(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e7 f39877e = new e7(7);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e7 f39878f = new e7(8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e7 f39879g = new e7(9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e7 f39880h = new e7(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e7 f39881i = new e7(11);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ e7 f39882j = new e7(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e7 f39883k = new e7(13);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ e7 f39884l = new e7(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ e7 f39885m = new e7(15);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ e7 f39886n = new e7(16);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ e7 f39887o = new e7(17);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ e7 f39888p = new e7(18);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ e7 f39889q = new e7(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ e7 f39890r = new e7(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e7 f39891s = new e7(21);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ e7 f39892t = new e7(22);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e7 f39893u = new e7(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e7 f39894v = new e7(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e7 f39895w = new e7(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e7 f39896x = new e7(26);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e7 f39897y = new e7(28);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e7 f39898z = new e7(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39899c;

    public /* synthetic */ e7(int i10) {
        this.f39899c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f39899c) {
            case 0:
                String str = (String) obj;
                f7.d dVar = f7.K;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 1:
                String str2 = (String) obj;
                f7.e.b bVar = f7.e.f40023d;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                f7.f.i iVar = f7.f.f40030r;
                return jLongValue >= 0;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                f7.f.i iVar2 = f7.f.f40030r;
                return jLongValue2 >= 0;
            case 4:
                long jLongValue3 = ((Long) obj).longValue();
                f7.f.i iVar3 = f7.f.f40030r;
                return jLongValue3 >= 0;
            case 5:
                long jLongValue4 = ((Long) obj).longValue();
                f7.f.i iVar4 = f7.f.f40030r;
                return jLongValue4 >= 0;
            case 6:
                long jLongValue5 = ((Long) obj).longValue();
                f7.f.i iVar5 = f7.f.f40030r;
                return jLongValue5 >= 0;
            case 7:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = h7.K;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 8:
                String str3 = (String) obj;
                o oVar2 = h7.K;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 26:
            default:
                long jLongValue6 = ((Long) obj).longValue();
                l7.k kVar = l7.f41242a0;
                return jLongValue6 >= 0;
            case 10:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar3 = h7.K;
                return jLongValue7 >= 0;
            case 12:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar4 = h7.K;
                return jLongValue8 >= 0;
            case 17:
                long jLongValue9 = ((Long) obj).longValue();
                o oVar5 = h7.K;
                return jLongValue9 >= 0;
            case 20:
                String str4 = (String) obj;
                h7.o0.e eVar = h7.o0.f40389d;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 21:
                long jLongValue10 = ((Long) obj).longValue();
                h7.p0.z zVar = h7.p0.f40418s;
                return jLongValue10 >= 0;
            case 22:
                long jLongValue11 = ((Long) obj).longValue();
                h7.p0.z zVar2 = h7.p0.f40418s;
                return jLongValue11 >= 0;
            case 23:
                long jLongValue12 = ((Long) obj).longValue();
                h7.p0.z zVar3 = h7.p0.f40418s;
                return jLongValue12 >= 0;
            case 24:
                long jLongValue13 = ((Long) obj).longValue();
                h7.p0.z zVar4 = h7.p0.f40418s;
                return jLongValue13 >= 0;
            case 25:
                long jLongValue14 = ((Long) obj).longValue();
                h7.p0.z zVar5 = h7.p0.f40418s;
                return jLongValue14 >= 0;
            case 27:
                String str5 = (String) obj;
                l7.k kVar2 = l7.f41242a0;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f39899c) {
            case 9:
                o oVar = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar2 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar3 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar4 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar5 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar6 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar7 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar8 = h7.K;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                l7.k kVar = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                l7.k kVar2 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
