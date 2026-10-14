package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j7 implements h9.m, h9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j7 f40922d = new j7(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j7 f40923e = new j7(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j7 f40924f = new j7(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ j7 f40925g = new j7(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j7 f40926h = new j7(12);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j7 f40927i = new j7(13);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ j7 f40928j = new j7(14);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ j7 f40929k = new j7(15);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ j7 f40930l = new j7(16);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ j7 f40931m = new j7(17);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ j7 f40932n = new j7(18);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ j7 f40933o = new j7(19);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ j7 f40934p = new j7(20);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ j7 f40935q = new j7(21);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ j7 f40936r = new j7(22);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ j7 f40937s = new j7(23);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ j7 f40938t = new j7(24);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j7 f40939u = new j7(25);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j7 f40940v = new j7(26);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ j7 f40941w = new j7(27);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j7 f40942x = new j7(28);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ j7 f40943y = new j7(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40944c;

    public /* synthetic */ j7(int i10) {
        this.f40944c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f40944c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                l7.k kVar = l7.f41242a0;
                return jLongValue >= 0;
            case 1:
            case 3:
            case 6:
            case 14:
            case 15:
            case 18:
            case 19:
            case 21:
            case 24:
            default:
                String str = (String) obj;
                o oVar = u7.f43114a0;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
                long jLongValue2 = ((Long) obj).longValue();
                l7.k kVar2 = l7.f41242a0;
                return jLongValue2 >= 0;
            case 4:
                String str2 = (String) obj;
                l7.l.b bVar = l7.l.f41305e;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                l7.m.c cVar = l7.m.f41316g;
                return jLongValue3 >= 0;
            case 7:
                long jLongValue4 = ((Long) obj).longValue();
                l7.n.g gVar = l7.n.f41331o;
                return jLongValue4 > 0;
            case 8:
                long jLongValue5 = ((Long) obj).longValue();
                l7.n.g gVar2 = l7.n.f41331o;
                return jLongValue5 >= 0;
            case 9:
                long jLongValue6 = ((Long) obj).longValue();
                l7.n.g gVar3 = l7.n.f41331o;
                return jLongValue6 >= 0;
            case 10:
                long jLongValue7 = ((Long) obj).longValue();
                l7.n.g gVar4 = l7.n.f41331o;
                return jLongValue7 >= 0;
            case 11:
                long jLongValue8 = ((Long) obj).longValue();
                l7.n.g gVar5 = l7.n.f41331o;
                return jLongValue8 >= 0;
            case 12:
                long jLongValue9 = ((Long) obj).longValue();
                q7.b bVar2 = q7.f42185c;
                return jLongValue9 >= 0;
            case 13:
                long jLongValue10 = ((Long) obj).longValue();
                r7.d dVar = r7.f42352c;
                return jLongValue10 >= 0;
            case 16:
                long jLongValue11 = ((Long) obj).longValue();
                o oVar2 = u7.f43114a0;
                return jLongValue11 >= 0;
            case 17:
                String str3 = (String) obj;
                o oVar3 = u7.f43114a0;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 20:
                long jLongValue12 = ((Long) obj).longValue();
                o oVar4 = u7.f43114a0;
                return jLongValue12 >= 0;
            case 22:
                long jLongValue13 = ((Long) obj).longValue();
                o oVar5 = u7.f43114a0;
                return jLongValue13 >= 0;
            case 23:
                long jLongValue14 = ((Long) obj).longValue();
                o oVar6 = u7.f43114a0;
                return jLongValue14 >= 0;
            case 25:
                long jLongValue15 = ((Long) obj).longValue();
                o oVar7 = u7.f43114a0;
                return jLongValue15 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f40944c) {
            case 1:
                l7.k kVar = l7.f41242a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                l7.l.b bVar = l7.l.f41305e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                l7.n.g gVar = l7.n.f41331o;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar2 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                o oVar3 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar4 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar5 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar6 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                o oVar7 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 28:
                o oVar8 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar9 = u7.f43114a0;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
