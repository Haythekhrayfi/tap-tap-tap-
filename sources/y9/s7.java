package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s7 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s7 f42645d = new s7(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s7 f42646e = new s7(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s7 f42647f = new s7(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s7 f42648g = new s7(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s7 f42649h = new s7(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s7 f42650i = new s7(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ s7 f42651j = new s7(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ s7 f42652k = new s7(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ s7 f42653l = new s7(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ s7 f42654m = new s7(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s7 f42655n = new s7(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ s7 f42656o = new s7(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ s7 f42657p = new s7(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ s7 f42658q = new s7(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ s7 f42659r = new s7(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ s7 f42660s = new s7(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ s7 f42661t = new s7(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ s7 f42662u = new s7(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ s7 f42663v = new s7(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ s7 f42664w = new s7(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ s7 f42665x = new s7(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ s7 f42666y = new s7(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ s7 f42667z = new s7(22);
    public static final /* synthetic */ s7 A = new s7(23);
    public static final /* synthetic */ s7 B = new s7(25);
    public static final /* synthetic */ s7 C = new s7(26);

    public /* synthetic */ s7(int i10) {
        this.f42668c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42668c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                o oVar = u7.f43114a0;
                return jLongValue >= 0;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar2 = u7.f43114a0;
                return jLongValue2 >= 0;
            case 2:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 25:
            default:
                long jLongValue3 = ((Long) obj).longValue();
                x7.c cVar = x7.f44168h;
                return jLongValue3 >= 0;
            case 3:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = u7.f43114a0;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 4:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar4 = u7.f43114a0;
                return jLongValue4 >= 0;
            case 6:
                String str = (String) obj;
                o oVar5 = u7.f43114a0;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 11:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar6 = u7.f43114a0;
                return jLongValue5 >= 0;
            case 16:
                String str2 = (String) obj;
                u7.l1.f fVar = u7.l1.f43247e;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 17:
                long jLongValue6 = ((Long) obj).longValue();
                u7.m1.i iVar = u7.m1.f43272g;
                return jLongValue6 >= 0;
            case 19:
                long jLongValue7 = ((Long) obj).longValue();
                u7.n1.v vVar = u7.n1.f43302p;
                return jLongValue7 >= 0;
            case 20:
                long jLongValue8 = ((Long) obj).longValue();
                u7.n1.v vVar2 = u7.n1.f43302p;
                return jLongValue8 > 0;
            case 21:
                long jLongValue9 = ((Long) obj).longValue();
                u7.n1.v vVar3 = u7.n1.f43302p;
                return jLongValue9 >= 0;
            case 22:
                long jLongValue10 = ((Long) obj).longValue();
                u7.n1.v vVar4 = u7.n1.f43302p;
                return jLongValue10 >= 0;
            case 23:
                long jLongValue11 = ((Long) obj).longValue();
                u7.n1.v vVar5 = u7.n1.f43302p;
                return jLongValue11 >= 0;
            case 24:
                long jLongValue12 = ((Long) obj).longValue();
                v7.b bVar = v7.f43570g;
                return jLongValue12 >= 0;
            case 26:
                String str3 = (String) obj;
                v7.b bVar2 = v7.f43570g;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 27:
                long jLongValue13 = ((Long) obj).longValue();
                v7.b bVar3 = v7.f43570g;
                return jLongValue13 > 0;
            case 28:
                String str4 = (String) obj;
                v7.b bVar4 = v7.f43570g;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42668c) {
            case 2:
                o oVar = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
            case 4:
            case 6:
            case 11:
            case 16:
            case 17:
            default:
                v7.b bVar = v7.f43570g;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar2 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar3 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar4 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar5 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar6 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar7 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                u7.l1.f fVar = u7.l1.f43247e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                u7.l1.f fVar2 = u7.l1.f43247e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                u7.l1.f fVar3 = u7.l1.f43247e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                u7.n1.v vVar = u7.n1.f43302p;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
