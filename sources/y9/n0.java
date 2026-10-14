package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n0 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n0 f41604d = new n0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n0 f41605e = new n0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n0 f41606f = new n0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n0 f41607g = new n0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n0 f41608h = new n0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n0 f41609i = new n0(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n0 f41610j = new n0(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n0 f41611k = new n0(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n0 f41612l = new n0(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n0 f41613m = new n0(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n0 f41614n = new n0(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ n0 f41615o = new n0(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ n0 f41616p = new n0(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ n0 f41617q = new n0(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n0 f41618r = new n0(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ n0 f41619s = new n0(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ n0 f41620t = new n0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ n0 f41621u = new n0(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ n0 f41622v = new n0(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ n0 f41623w = new n0(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ n0 f41624x = new n0(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ n0 f41625y = new n0(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ n0 f41626z = new n0(23);
    public static final /* synthetic */ n0 A = new n0(24);
    public static final /* synthetic */ n0 B = new n0(25);
    public static final /* synthetic */ n0 C = new n0(26);

    public /* synthetic */ n0(int i10) {
        this.f41627c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41627c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                v9.b<Long> bVar = o0.f41717d;
                return jLongValue >= 0;
            case 3:
                String str = (String) obj;
                w0.h hVar = w0.N;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 5:
                long jLongValue2 = ((Long) obj).longValue();
                w0.h hVar2 = w0.N;
                return jLongValue2 >= 0;
            case 8:
                double dDoubleValue = ((Double) obj).doubleValue();
                w0.h hVar3 = w0.N;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 9:
                long jLongValue3 = ((Long) obj).longValue();
                w0.h hVar4 = w0.N;
                return jLongValue3 >= 0;
            case 15:
                String str2 = (String) obj;
                o oVar = x0.N;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 18:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar2 = x0.N;
                return jLongValue4 >= 0;
            case 23:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar3 = x0.N;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 25:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar4 = x0.N;
                return jLongValue5 >= 0;
            case 27:
                long jLongValue6 = ((Long) obj).longValue();
                b1.b bVar2 = b1.f39118e;
                return jLongValue6 >= 0;
            case 28:
                long jLongValue7 = ((Long) obj).longValue();
                b1.b bVar3 = b1.f39118e;
                return jLongValue7 >= 0;
            default:
                long jLongValue8 = ((Long) obj).longValue();
                b1.b bVar4 = b1.f39118e;
                return jLongValue8 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41627c) {
            case 1:
                p0.a aVar = p0.f41894b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                h9.g<r0> gVar = q0.f42113b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
            case 5:
            case 8:
            case 9:
            case 15:
            case 18:
            case 23:
            default:
                o oVar = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                w0.h hVar = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                w0.h hVar2 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                w0.h hVar3 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                w0.h hVar4 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                w0.h hVar5 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar2 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar3 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar4 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar5 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                o oVar6 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar7 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o oVar8 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar9 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar10 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar11 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
