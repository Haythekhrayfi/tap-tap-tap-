package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t7 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t7 f42899d = new t7(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t7 f42900e = new t7(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ t7 f42901f = new t7(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t7 f42902g = new t7(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ t7 f42903h = new t7(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ t7 f42904i = new t7(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ t7 f42905j = new t7(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ t7 f42906k = new t7(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ t7 f42907l = new t7(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ t7 f42908m = new t7(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ t7 f42909n = new t7(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ t7 f42910o = new t7(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ t7 f42911p = new t7(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ t7 f42912q = new t7(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ t7 f42913r = new t7(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ t7 f42914s = new t7(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ t7 f42915t = new t7(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ t7 f42916u = new t7(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ t7 f42917v = new t7(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ t7 f42918w = new t7(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ t7 f42919x = new t7(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ t7 f42920y = new t7(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ t7 f42921z = new t7(23);
    public static final /* synthetic */ t7 A = new t7(24);
    public static final /* synthetic */ t7 B = new t7(26);
    public static final /* synthetic */ t7 C = new t7(27);
    public static final /* synthetic */ t7 D = new t7(29);

    public /* synthetic */ t7(int i10) {
        this.f42922c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42922c) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = u7.f43114a0;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 18:
            case 26:
            default:
                String str = (String) obj;
                h8.d dVar = h8.L;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = u7.f43114a0;
                return jLongValue >= 0;
            case 8:
                String str2 = (String) obj;
                u7.l1.f fVar = u7.l1.f43247e;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 9:
                long jLongValue2 = ((Long) obj).longValue();
                u7.m1.i iVar = u7.m1.f43272g;
                return jLongValue2 >= 0;
            case 10:
                long jLongValue3 = ((Long) obj).longValue();
                u7.n1.v vVar = u7.n1.f43302p;
                return jLongValue3 >= 0;
            case 12:
                long jLongValue4 = ((Long) obj).longValue();
                u7.n1.v vVar2 = u7.n1.f43302p;
                return jLongValue4 > 0;
            case 13:
                long jLongValue5 = ((Long) obj).longValue();
                u7.n1.v vVar3 = u7.n1.f43302p;
                return jLongValue5 >= 0;
            case 14:
                long jLongValue6 = ((Long) obj).longValue();
                u7.n1.v vVar4 = u7.n1.f43302p;
                return jLongValue6 >= 0;
            case 15:
                long jLongValue7 = ((Long) obj).longValue();
                u7.n1.v vVar5 = u7.n1.f43302p;
                return jLongValue7 >= 0;
            case 16:
                long jLongValue8 = ((Long) obj).longValue();
                v7.b bVar = v7.f43570g;
                return jLongValue8 >= 0;
            case 17:
                String str3 = (String) obj;
                v7.b bVar2 = v7.f43570g;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 19:
                long jLongValue9 = ((Long) obj).longValue();
                v7.b bVar3 = v7.f43570g;
                return jLongValue9 > 0;
            case 20:
                String str4 = (String) obj;
                v7.b bVar4 = v7.f43570g;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 21:
                long jLongValue10 = ((Long) obj).longValue();
                x7.c cVar = x7.f44168h;
                return jLongValue10 >= 0;
            case 22:
                String str5 = (String) obj;
                x7.c cVar2 = x7.f44168h;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 23:
                long jLongValue11 = ((Long) obj).longValue();
                y7.j jVar = y7.f44541h;
                return jLongValue11 >= 0;
            case 24:
                String str6 = (String) obj;
                y7.j jVar2 = y7.f44541h;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 25:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                h8.d dVar2 = h8.L;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 27:
                String str7 = (String) obj;
                h8.d dVar3 = h8.L;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42922c) {
            case 1:
                o oVar = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar3 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                u7.l1.f fVar = u7.l1.f43247e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                u7.l1.f fVar2 = u7.l1.f43247e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                u7.l1.f fVar3 = u7.l1.f43247e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                u7.n1.v vVar = u7.n1.f43302p;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                v7.b bVar = v7.f43570g;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                h8.d dVar = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                h8.d dVar2 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
