package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v0 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v0 f43399d = new v0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v0 f43400e = new v0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v0 f43401f = new v0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v0 f43402g = new v0(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v0 f43403h = new v0(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v0 f43404i = new v0(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v0 f43405j = new v0(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ v0 f43406k = new v0(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ v0 f43407l = new v0(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ v0 f43408m = new v0(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ v0 f43409n = new v0(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ v0 f43410o = new v0(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ v0 f43411p = new v0(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ v0 f43412q = new v0(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ v0 f43413r = new v0(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ v0 f43414s = new v0(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v0 f43415t = new v0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ v0 f43416u = new v0(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v0 f43417v = new v0(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v0 f43418w = new v0(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ v0 f43419x = new v0(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ v0 f43420y = new v0(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ v0 f43421z = new v0(23);
    public static final /* synthetic */ v0 A = new v0(24);
    public static final /* synthetic */ v0 B = new v0(25);
    public static final /* synthetic */ v0 C = new v0(26);
    public static final /* synthetic */ v0 D = new v0(27);
    public static final /* synthetic */ v0 E = new v0(28);
    public static final /* synthetic */ v0 F = new v0(29);

    public /* synthetic */ v0(int i10) {
        this.f43422c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f43422c) {
            case 1:
                long jLongValue = ((Long) obj).longValue();
                w0.h hVar = w0.N;
                return jLongValue >= 0;
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 18:
            default:
                String str = (String) obj;
                h9.m<String> mVar = h1.f40253c;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 3:
                String str2 = (String) obj;
                w0.h hVar2 = w0.N;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 6:
                String str3 = (String) obj;
                o oVar = x0.N;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 10:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar2 = x0.N;
                return jLongValue2 >= 0;
            case 15:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar3 = x0.N;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 17:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar4 = x0.N;
                return jLongValue3 >= 0;
            case 19:
                long jLongValue4 = ((Long) obj).longValue();
                b1.b bVar = b1.f39118e;
                return jLongValue4 >= 0;
            case 20:
                long jLongValue5 = ((Long) obj).longValue();
                b1.b bVar2 = b1.f39118e;
                return jLongValue5 >= 0;
            case 21:
                long jLongValue6 = ((Long) obj).longValue();
                b1.b bVar3 = b1.f39118e;
                return jLongValue6 >= 0;
            case 22:
                long jLongValue7 = ((Long) obj).longValue();
                b1.b bVar4 = b1.f39118e;
                return jLongValue7 >= 0;
            case 23:
                long jLongValue8 = ((Long) obj).longValue();
                c1.f fVar = c1.f39349e;
                return jLongValue8 >= 0;
            case 24:
                long jLongValue9 = ((Long) obj).longValue();
                c1.f fVar2 = c1.f39349e;
                return jLongValue9 >= 0;
            case 25:
                long jLongValue10 = ((Long) obj).longValue();
                c1.f fVar3 = c1.f39349e;
                return jLongValue10 >= 0;
            case 26:
                long jLongValue11 = ((Long) obj).longValue();
                c1.f fVar4 = c1.f39349e;
                return jLongValue11 >= 0;
            case 27:
                String str4 = (String) obj;
                f1.a aVar = f1.f39926c;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 28:
                String str5 = (String) obj;
                f1.a aVar2 = f1.f39926c;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f43422c) {
            case 0:
                w0.h hVar = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
            case 3:
            case 6:
            case 10:
            case 15:
            default:
                o oVar = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                w0.h hVar2 = w0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar2 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar3 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar4 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar5 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar6 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar7 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar8 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar9 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar10 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar11 = x0.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
