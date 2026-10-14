package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g8 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g8 f40220d = new g8(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g8 f40221e = new g8(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g8 f40222f = new g8(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g8 f40223g = new g8(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g8 f40224h = new g8(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g8 f40225i = new g8(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g8 f40226j = new g8(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ g8 f40227k = new g8(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g8 f40228l = new g8(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g8 f40229m = new g8(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g8 f40230n = new g8(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ g8 f40231o = new g8(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ g8 f40232p = new g8(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ g8 f40233q = new g8(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g8 f40234r = new g8(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ g8 f40235s = new g8(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g8 f40236t = new g8(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ g8 f40237u = new g8(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g8 f40238v = new g8(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ g8 f40239w = new g8(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g8 f40240x = new g8(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g8 f40241y = new g8(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ g8 f40242z = new g8(23);
    public static final /* synthetic */ g8 A = new g8(24);
    public static final /* synthetic */ g8 B = new g8(25);
    public static final /* synthetic */ g8 C = new g8(26);
    public static final /* synthetic */ g8 D = new g8(27);
    public static final /* synthetic */ g8 E = new g8(28);
    public static final /* synthetic */ g8 F = new g8(29);

    public /* synthetic */ g8(int i10) {
        this.f40243c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f40243c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                h8.d dVar = h8.L;
                return jLongValue >= 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 13:
            case 14:
            case 15:
            case 18:
            case 20:
            default:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar = m8.M;
                return jLongValue2 >= 0;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                h8.d dVar2 = h8.L;
                return jLongValue3 >= 0;
            case 6:
                String str = (String) obj;
                h8.d dVar3 = h8.L;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 8:
                long jLongValue4 = ((Long) obj).longValue();
                i8.c.b bVar = i8.c.f40642c;
                return jLongValue4 > 0;
            case 9:
                long jLongValue5 = ((Long) obj).longValue();
                i8.c.b bVar2 = i8.c.f40642c;
                return jLongValue5 > 0;
            case 10:
                long jLongValue6 = ((Long) obj).longValue();
                j8.g.d dVar4 = j8.g.f40960c;
                return jLongValue6 > 0;
            case 11:
                long jLongValue7 = ((Long) obj).longValue();
                j8.g.d dVar5 = j8.g.f40960c;
                return jLongValue7 > 0;
            case 12:
                String str2 = (String) obj;
                o oVar2 = m8.M;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 16:
                String str3 = (String) obj;
                o oVar3 = m8.M;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 17:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar4 = m8.M;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 19:
                String str4 = (String) obj;
                o oVar5 = m8.M;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 21:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar6 = m8.M;
                return jLongValue8 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f40243c) {
            case 1:
                h8.d dVar = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                h8.d dVar2 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                h8.d dVar3 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                h8.d dVar4 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
            case 19:
            case 21:
            default:
                o oVar = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                h8.d dVar5 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar2 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar3 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar4 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar5 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o oVar6 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar7 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar8 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar9 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar10 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                o oVar11 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar12 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
