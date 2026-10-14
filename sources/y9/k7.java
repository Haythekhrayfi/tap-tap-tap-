package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k7 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k7 f41108d = new k7(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k7 f41109e = new k7(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k7 f41110f = new k7(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k7 f41111g = new k7(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k7 f41112h = new k7(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k7 f41113i = new k7(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k7 f41114j = new k7(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k7 f41115k = new k7(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k7 f41116l = new k7(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k7 f41117m = new k7(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k7 f41118n = new k7(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ k7 f41119o = new k7(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ k7 f41120p = new k7(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ k7 f41121q = new k7(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ k7 f41122r = new k7(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ k7 f41123s = new k7(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ k7 f41124t = new k7(21);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ k7 f41125u = new k7(22);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k7 f41126v = new k7(23);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ k7 f41127w = new k7(24);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k7 f41128x = new k7(25);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ k7 f41129y = new k7(26);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ k7 f41130z = new k7(27);
    public static final /* synthetic */ k7 A = new k7(28);
    public static final /* synthetic */ k7 B = new k7(29);

    public /* synthetic */ k7(int i10) {
        this.f41131c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41131c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                l7.k kVar = l7.f41242a0;
                return jLongValue >= 0;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                l7.k kVar2 = l7.f41242a0;
                return jLongValue2 >= 0;
            case 2:
                long jLongValue3 = ((Long) obj).longValue();
                l7.k kVar3 = l7.f41242a0;
                return jLongValue3 >= 0;
            case 3:
                long jLongValue4 = ((Long) obj).longValue();
                l7.k kVar4 = l7.f41242a0;
                return jLongValue4 >= 0;
            case 4:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 22:
            case 23:
            case 24:
            default:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar = u7.f43114a0;
                return jLongValue5 >= 0;
            case 5:
                String str = (String) obj;
                l7.k kVar5 = l7.f41242a0;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 7:
                double dDoubleValue = ((Double) obj).doubleValue();
                l7.k kVar6 = l7.f41242a0;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 8:
                long jLongValue6 = ((Long) obj).longValue();
                l7.k kVar7 = l7.f41242a0;
                return jLongValue6 >= 0;
            case 13:
                String str2 = (String) obj;
                l7.l.b bVar = l7.l.f41305e;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 14:
                long jLongValue7 = ((Long) obj).longValue();
                l7.m.c cVar = l7.m.f41316g;
                return jLongValue7 >= 0;
            case 15:
                long jLongValue8 = ((Long) obj).longValue();
                l7.n.g gVar = l7.n.f41331o;
                return jLongValue8 >= 0;
            case 16:
                long jLongValue9 = ((Long) obj).longValue();
                l7.n.g gVar2 = l7.n.f41331o;
                return jLongValue9 > 0;
            case 17:
                long jLongValue10 = ((Long) obj).longValue();
                l7.n.g gVar3 = l7.n.f41331o;
                return jLongValue10 >= 0;
            case 18:
                long jLongValue11 = ((Long) obj).longValue();
                l7.n.g gVar4 = l7.n.f41331o;
                return jLongValue11 >= 0;
            case 19:
                long jLongValue12 = ((Long) obj).longValue();
                l7.n.g gVar5 = l7.n.f41331o;
                return jLongValue12 >= 0;
            case 20:
                long jLongValue13 = ((Long) obj).longValue();
                q7.b bVar2 = q7.f42185c;
                return jLongValue13 >= 0;
            case 21:
                long jLongValue14 = ((Long) obj).longValue();
                r7.d dVar = r7.f42352c;
                return jLongValue14 >= 0;
            case 25:
                long jLongValue15 = ((Long) obj).longValue();
                o oVar2 = u7.f43114a0;
                return jLongValue15 >= 0;
            case 26:
                String str3 = (String) obj;
                o oVar3 = u7.f43114a0;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41131c) {
            case 4:
                l7.k kVar = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                l7.k kVar2 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                l7.k kVar3 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                l7.k kVar4 = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                l7.l.b bVar = l7.l.f41305e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                l7.l.b bVar2 = l7.l.f41305e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar2 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar3 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar4 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar5 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
