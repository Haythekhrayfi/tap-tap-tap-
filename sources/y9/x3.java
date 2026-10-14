package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x3 implements h9.m, h9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x3 f44063d = new x3(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x3 f44064e = new x3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x3 f44065f = new x3(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x3 f44066g = new x3(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x3 f44067h = new x3(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x3 f44068i = new x3(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x3 f44069j = new x3(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x3 f44070k = new x3(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ x3 f44071l = new x3(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x3 f44072m = new x3(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ x3 f44073n = new x3(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x3 f44074o = new x3(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x3 f44075p = new x3(18);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ x3 f44076q = new x3(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x3 f44077r = new x3(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ x3 f44078s = new x3(22);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ x3 f44079t = new x3(23);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x3 f44080u = new x3(24);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x3 f44081v = new x3(25);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ x3 f44082w = new x3(26);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x3 f44083x = new x3(27);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ x3 f44084y = new x3(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44085c;

    public /* synthetic */ x3(int i10) {
        this.f44085c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f44085c) {
            case 0:
                String str = (String) obj;
                o oVar = y3.R;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 22:
            case 24:
            default:
                long jLongValue = ((Long) obj).longValue();
                r4.e eVar = r4.G;
                return jLongValue >= 0;
            case 6:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar2 = y3.R;
                return jLongValue2 >= 0;
            case 9:
                String str2 = (String) obj;
                a4.a aVar = a4.f39056a;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 10:
                String str3 = (String) obj;
                a4.a aVar2 = a4.f39056a;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 11:
                String str4 = (String) obj;
                a4.a aVar3 = a4.f39056a;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 12:
                String str5 = (String) obj;
                v9.b<Boolean> bVar = b4.f39169e;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 13:
                String str6 = (String) obj;
                v9.b<Boolean> bVar2 = b4.f39169e;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 14:
                String str7 = (String) obj;
                v9.b<Boolean> bVar3 = b4.f39169e;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 15:
                String str8 = (String) obj;
                c4.a aVar4 = c4.f39506a;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
            case 16:
                String str9 = (String) obj;
                c4.a aVar5 = c4.f39506a;
                fd.j0.i(str9, "it");
                return str9.length() >= 1;
            case 17:
                String str10 = (String) obj;
                c4.a aVar6 = c4.f39506a;
                fd.j0.i(str10, "it");
                return str10.length() >= 1;
            case 18:
                String str11 = (String) obj;
                v9.b<Boolean> bVar4 = d4.f39623e;
                fd.j0.i(str11, "it");
                return str11.length() >= 1;
            case 19:
                String str12 = (String) obj;
                v9.b<Boolean> bVar5 = d4.f39623e;
                fd.j0.i(str12, "it");
                return str12.length() >= 1;
            case 20:
                String str13 = (String) obj;
                v9.b<Boolean> bVar6 = d4.f39623e;
                fd.j0.i(str13, "it");
                return str13.length() >= 1;
            case 21:
                long jLongValue3 = ((Long) obj).longValue();
                g4.a aVar7 = g4.f40159c;
                return jLongValue3 >= 0 && jLongValue3 <= 360;
            case 23:
                long jLongValue4 = ((Long) obj).longValue();
                v9.b<Long> bVar7 = h4.f40269c;
                return jLongValue4 >= 0 && jLongValue4 <= 360;
            case 25:
                double dDoubleValue = ((Double) obj).doubleValue();
                i4.a aVar8 = i4.f40604b;
                return dDoubleValue > 0.0d;
            case 26:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                h9.m<Double> mVar = j4.f40903b;
                return dDoubleValue2 > 0.0d;
            case 27:
                String str14 = (String) obj;
                r4.e eVar2 = r4.G;
                fd.j0.i(str14, "it");
                return str14.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f44085c) {
            case 1:
                o oVar = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar2 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar3 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar4 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar5 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar6 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                o oVar7 = y3.R;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                g4.a aVar = g4.f40159c;
                fd.j0.i(list, "it");
                return list.size() >= 2;
            case 24:
                v9.b<Long> bVar = h4.f40269c;
                fd.j0.i(list, "it");
                return list.size() >= 2;
            default:
                r4.e eVar = r4.G;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
