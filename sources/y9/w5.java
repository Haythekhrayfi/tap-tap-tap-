package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w5 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w5 f43762d = new w5(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w5 f43763e = new w5(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w5 f43764f = new w5(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w5 f43765g = new w5(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w5 f43766h = new w5(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w5 f43767i = new w5(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w5 f43768j = new w5(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w5 f43769k = new w5(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w5 f43770l = new w5(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w5 f43771m = new w5(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w5 f43772n = new w5(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w5 f43773o = new w5(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w5 f43774p = new w5(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w5 f43775q = new w5(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w5 f43776r = new w5(17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ w5 f43777s = new w5(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w5 f43778t = new w5(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w5 f43779u = new w5(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w5 f43780v = new w5(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w5 f43781w = new w5(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w5 f43782x = new w5(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w5 f43783y = new w5(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ w5 f43784z = new w5(25);
    public static final /* synthetic */ w5 A = new w5(26);
    public static final /* synthetic */ w5 B = new w5(27);
    public static final /* synthetic */ w5 C = new w5(28);
    public static final /* synthetic */ w5 D = new w5(29);

    public /* synthetic */ w5(int i10) {
        this.f43785c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f43785c) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                v9.b<Long> bVar = x5.f44091g;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 1:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                v9.b<Long> bVar2 = x5.f44091g;
                return dDoubleValue2 >= 0.0d;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                v9.b<Long> bVar3 = x5.f44091g;
                return jLongValue >= 0;
            case 3:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                z5.g gVar = z5.L;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 4:
                String str = (String) obj;
                z5.g gVar2 = z5.L;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 5:
                long jLongValue2 = ((Long) obj).longValue();
                z5.g gVar3 = z5.L;
                return jLongValue2 >= 0;
            case 6:
            case 8:
            case 9:
            case 11:
            case 13:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar = b6.L;
                return jLongValue3 >= 0;
            case 7:
                long jLongValue4 = ((Long) obj).longValue();
                z5.g gVar4 = z5.L;
                return jLongValue4 >= 0;
            case 10:
                String str2 = (String) obj;
                z5.g gVar5 = z5.L;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 12:
                long jLongValue5 = ((Long) obj).longValue();
                z5.g gVar6 = z5.L;
                return jLongValue5 >= 0;
            case 14:
                long jLongValue6 = ((Long) obj).longValue();
                z5.g gVar7 = z5.L;
                return jLongValue6 >= 0;
            case 15:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                o oVar2 = b6.L;
                return dDoubleValue4 >= 0.0d && dDoubleValue4 <= 1.0d;
            case 16:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar3 = b6.L;
                return jLongValue7 >= 0;
            case 17:
                String str3 = (String) obj;
                o oVar4 = b6.L;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 18:
                String str4 = (String) obj;
                o oVar5 = b6.L;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 19:
                long jLongValue8 = ((Long) obj).longValue();
                o oVar6 = b6.L;
                return jLongValue8 >= 0;
            case 21:
                long jLongValue9 = ((Long) obj).longValue();
                o oVar7 = b6.L;
                return jLongValue9 >= 0;
            case 25:
                String str5 = (String) obj;
                o oVar8 = b6.L;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f43785c) {
            case 6:
                z5.g gVar = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                z5.g gVar2 = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                z5.g gVar3 = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                z5.g gVar4 = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                z5.g gVar5 = z5.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o oVar = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar2 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar3 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar4 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                o oVar5 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar6 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar7 = b6.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
