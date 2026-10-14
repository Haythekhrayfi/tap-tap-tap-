package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p6 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p6 f42028d = new p6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p6 f42029e = new p6(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p6 f42030f = new p6(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ p6 f42031g = new p6(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p6 f42032h = new p6(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p6 f42033i = new p6(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ p6 f42034j = new p6(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p6 f42035k = new p6(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p6 f42036l = new p6(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p6 f42037m = new p6(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p6 f42038n = new p6(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p6 f42039o = new p6(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ p6 f42040p = new p6(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ p6 f42041q = new p6(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ p6 f42042r = new p6(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ p6 f42043s = new p6(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ p6 f42044t = new p6(20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ p6 f42045u = new p6(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ p6 f42046v = new p6(22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ p6 f42047w = new p6(23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ p6 f42048x = new p6(24);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ p6 f42049y = new p6(25);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ p6 f42050z = new p6(26);
    public static final /* synthetic */ p6 A = new p6(27);
    public static final /* synthetic */ p6 B = new p6(28);
    public static final /* synthetic */ p6 C = new p6(29);

    public /* synthetic */ p6(int i10) {
        this.f42051c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42051c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                v9.b<Long> bVar = q6.f42158f;
                return jLongValue >= 0;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                v9.b<Long> bVar2 = q6.f42158f;
                return jLongValue2 >= 0;
            case 2:
                double dDoubleValue = ((Double) obj).doubleValue();
                s6.d dVar = s6.M;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 3:
            case 6:
            case 9:
            case 15:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            default:
                long jLongValue3 = ((Long) obj).longValue();
                x6.e eVar = x6.E;
                return jLongValue3 >= 0;
            case 4:
                String str = (String) obj;
                s6.d dVar2 = s6.M;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 5:
                String str2 = (String) obj;
                s6.d dVar3 = s6.M;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 7:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                s6.d dVar4 = s6.M;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 8:
                long jLongValue4 = ((Long) obj).longValue();
                s6.d dVar5 = s6.M;
                return jLongValue4 >= 0;
            case 10:
                String str3 = (String) obj;
                s6.d dVar6 = s6.M;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 11:
                long jLongValue5 = ((Long) obj).longValue();
                s6.d dVar7 = s6.M;
                return jLongValue5 >= 0;
            case 12:
                long jLongValue6 = ((Long) obj).longValue();
                s6.e.d dVar8 = s6.e.f42629f;
                return jLongValue6 >= 0;
            case 13:
                String str4 = (String) obj;
                o oVar = t6.N;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 14:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar2 = t6.N;
                return jLongValue7 >= 0;
            case 16:
                String str5 = (String) obj;
                o oVar3 = t6.N;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 17:
                String str6 = (String) obj;
                o oVar4 = t6.N;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 18:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                o oVar5 = t6.N;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 23:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar6 = t6.N;
                return jLongValue8 >= 0;
            case 26:
                long jLongValue9 = ((Long) obj).longValue();
                t6.r0.i iVar = t6.r0.f42864f;
                return jLongValue9 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42051c) {
            case 3:
                s6.d dVar = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                s6.d dVar2 = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                s6.d dVar3 = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar2 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o oVar3 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar4 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar5 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar6 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar7 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 28:
                x6.e eVar = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                x6.e eVar2 = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
