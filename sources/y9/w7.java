package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w7 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w7 f43810d = new w7(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w7 f43811e = new w7(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w7 f43812f = new w7(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w7 f43813g = new w7(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w7 f43814h = new w7(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w7 f43815i = new w7(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w7 f43816j = new w7(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w7 f43817k = new w7(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w7 f43818l = new w7(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w7 f43819m = new w7(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w7 f43820n = new w7(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w7 f43821o = new w7(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w7 f43822p = new w7(18);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w7 f43823q = new w7(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w7 f43824r = new w7(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ w7 f43825s = new w7(21);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w7 f43826t = new w7(22);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w7 f43827u = new w7(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w7 f43828v = new w7(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w7 f43829w = new w7(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w7 f43830x = new w7(26);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w7 f43831y = new w7(27);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ w7 f43832z = new w7(28);
    public static final /* synthetic */ w7 A = new w7(29);

    public /* synthetic */ w7(int i10) {
        this.f43833c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f43833c) {
            case 0:
                String str = (String) obj;
                x7.c cVar = x7.f44168h;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                y7.j jVar = y7.f44541h;
                return jLongValue >= 0;
            case 2:
                String str2 = (String) obj;
                y7.j jVar2 = y7.f44541h;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 3:
            case 4:
            case 6:
            case 10:
            case 11:
            case 12:
            case 14:
            case 22:
            case 23:
            case 24:
            case 26:
            default:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar = m8.M;
                return jLongValue2 >= 0;
            case 5:
                String str3 = (String) obj;
                h8.d dVar = h8.L;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 7:
                String str4 = (String) obj;
                h8.d dVar2 = h8.L;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 8:
                long jLongValue3 = ((Long) obj).longValue();
                h8.d dVar3 = h8.L;
                return jLongValue3 >= 0;
            case 9:
                double dDoubleValue = ((Double) obj).doubleValue();
                h8.d dVar4 = h8.L;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 13:
                long jLongValue4 = ((Long) obj).longValue();
                h8.d dVar5 = h8.L;
                return jLongValue4 >= 0;
            case 15:
                String str5 = (String) obj;
                h8.d dVar6 = h8.L;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 16:
                long jLongValue5 = ((Long) obj).longValue();
                i8.c.b bVar = i8.c.f40642c;
                return jLongValue5 > 0;
            case 17:
                long jLongValue6 = ((Long) obj).longValue();
                i8.c.b bVar2 = i8.c.f40642c;
                return jLongValue6 > 0;
            case 18:
                long jLongValue7 = ((Long) obj).longValue();
                j8.g.d dVar7 = j8.g.f40960c;
                return jLongValue7 > 0;
            case 19:
                long jLongValue8 = ((Long) obj).longValue();
                j8.g.d dVar8 = j8.g.f40960c;
                return jLongValue8 > 0;
            case 20:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar2 = m8.M;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 21:
                String str6 = (String) obj;
                o oVar3 = m8.M;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 25:
                String str7 = (String) obj;
                o oVar4 = m8.M;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 27:
                String str8 = (String) obj;
                o oVar5 = m8.M;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f43833c) {
            case 3:
                d8.c cVar = d8.f39711d;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                h8.d dVar = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                h8.d dVar2 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                h8.d dVar3 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                h8.d dVar4 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                h8.d dVar5 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                h8.d dVar6 = h8.L;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar2 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar3 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                o oVar4 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar5 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
