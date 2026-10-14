package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a1 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a1 f38973d = new a1(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a1 f38974e = new a1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a1 f38975f = new a1(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a1 f38976g = new a1(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a1 f38977h = new a1(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a1 f38978i = new a1(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a1 f38979j = new a1(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a1 f38980k = new a1(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a1 f38981l = new a1(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a1 f38982m = new a1(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a1 f38983n = new a1(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a1 f38984o = new a1(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a1 f38985p = new a1(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a1 f38986q = new a1(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a1 f38987r = new a1(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a1 f38988s = new a1(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a1 f38989t = new a1(20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a1 f38990u = new a1(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a1 f38991v = new a1(22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a1 f38992w = new a1(23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a1 f38993x = new a1(24);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a1 f38994y = new a1(25);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a1 f38995z = new a1(26);
    public static final /* synthetic */ a1 A = new a1(27);
    public static final /* synthetic */ a1 B = new a1(28);

    public /* synthetic */ a1(int i10) {
        this.f38996c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f38996c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                b1.b bVar = b1.f39118e;
                return jLongValue >= 0;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                c1.f fVar = c1.f39349e;
                return jLongValue2 >= 0;
            case 2:
                long jLongValue3 = ((Long) obj).longValue();
                c1.f fVar2 = c1.f39349e;
                return jLongValue3 >= 0;
            case 3:
                long jLongValue4 = ((Long) obj).longValue();
                c1.f fVar3 = c1.f39349e;
                return jLongValue4 >= 0;
            case 4:
                long jLongValue5 = ((Long) obj).longValue();
                c1.f fVar4 = c1.f39349e;
                return jLongValue5 >= 0;
            case 5:
                String str = (String) obj;
                f1.a aVar = f1.f39926c;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 6:
                String str2 = (String) obj;
                f1.a aVar2 = f1.f39926c;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 7:
                String str3 = (String) obj;
                h9.m<String> mVar = h1.f40253c;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 8:
                String str4 = (String) obj;
                h9.m<String> mVar2 = h1.f40253c;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 9:
                double dDoubleValue = ((Double) obj).doubleValue();
                i1.d dVar = i1.D;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 10:
                long jLongValue6 = ((Long) obj).longValue();
                i1.d dVar2 = i1.D;
                return jLongValue6 >= 0;
            case 11:
            case 12:
            case 13:
            case 15:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                String str5 = (String) obj;
                l1.b bVar2 = l1.f41189h;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 14:
                long jLongValue7 = ((Long) obj).longValue();
                i1.d dVar3 = i1.D;
                return jLongValue7 >= 0;
            case 16:
                String str6 = (String) obj;
                i1.d dVar4 = i1.D;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 17:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar = j1.D;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 18:
                String str7 = (String) obj;
                o oVar2 = j1.D;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 20:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar3 = j1.D;
                return jLongValue8 >= 0;
            case 26:
                long jLongValue9 = ((Long) obj).longValue();
                o oVar4 = j1.D;
                return jLongValue9 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f38996c) {
            case 11:
                i1.d dVar = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                i1.d dVar2 = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                i1.d dVar3 = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 26:
            default:
                o oVar = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                i1.d dVar4 = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar2 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o oVar3 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar4 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar5 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar6 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar7 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar8 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
