package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z2 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z2 f44588d = new z2(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z2 f44589e = new z2(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z2 f44590f = new z2(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z2 f44591g = new z2(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z2 f44592h = new z2(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z2 f44593i = new z2(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ z2 f44594j = new z2(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ z2 f44595k = new z2(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ z2 f44596l = new z2(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ z2 f44597m = new z2(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ z2 f44598n = new z2(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ z2 f44599o = new z2(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ z2 f44600p = new z2(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ z2 f44601q = new z2(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ z2 f44602r = new z2(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ z2 f44603s = new z2(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ z2 f44604t = new z2(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ z2 f44605u = new z2(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ z2 f44606v = new z2(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ z2 f44607w = new z2(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ z2 f44608x = new z2(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ z2 f44609y = new z2(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ z2 f44610z = new z2(25);
    public static final /* synthetic */ z2 A = new z2(26);
    public static final /* synthetic */ z2 B = new z2(28);
    public static final /* synthetic */ z2 C = new z2(29);

    public /* synthetic */ z2(int i10) {
        this.f44611c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f44611c) {
            case 4:
                String str = (String) obj;
                o oVar = c3.J;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = c3.J;
                return jLongValue >= 0;
            case 13:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = c3.J;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 15:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar4 = c3.J;
                return jLongValue2 >= 0;
            case 16:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar5 = c3.J;
                return jLongValue3 >= 0;
            case 17:
                String str2 = (String) obj;
                d3.h hVar = d3.S;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 19:
                String str3 = (String) obj;
                d3.h hVar2 = d3.S;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 20:
                long jLongValue4 = ((Long) obj).longValue();
                d3.h hVar3 = d3.S;
                return jLongValue4 >= 0;
            case 22:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                d3.h hVar4 = d3.S;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 23:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                d3.h hVar5 = d3.S;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 24:
                long jLongValue5 = ((Long) obj).longValue();
                d3.h hVar6 = d3.S;
                return jLongValue5 >= 0;
            case 27:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                e3.d dVar = e3.f39743h;
                return dDoubleValue4 >= 0.0d && dDoubleValue4 <= 1.0d;
            default:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                v9.b<Double> bVar = g3.f40123h;
                return dDoubleValue5 >= 0.0d && dDoubleValue5 <= 1.0d;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f44611c) {
            case 0:
                a3.f fVar = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                o oVar = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar3 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
            case 8:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                e3.d dVar = e3.f39743h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar4 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar5 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar6 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar7 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar8 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar9 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar10 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar11 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                d3.h hVar = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                d3.h hVar2 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                d3.h hVar3 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                d3.h hVar4 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
