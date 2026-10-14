package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g2 implements h9.m, h9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g2 f40100d = new g2(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g2 f40101e = new g2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g2 f40102f = new g2(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g2 f40103g = new g2(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g2 f40104h = new g2(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g2 f40105i = new g2(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g2 f40106j = new g2(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ g2 f40107k = new g2(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g2 f40108l = new g2(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g2 f40109m = new g2(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g2 f40110n = new g2(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ g2 f40111o = new g2(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ g2 f40112p = new g2(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ g2 f40113q = new g2(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g2 f40114r = new g2(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ g2 f40115s = new g2(21);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g2 f40116t = new g2(22);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ g2 f40117u = new g2(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g2 f40118v = new g2(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ g2 f40119w = new g2(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g2 f40120x = new g2(26);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g2 f40121y = new g2(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40122c;

    public /* synthetic */ g2(int i10) {
        this.f40122c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f40122c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                h9.m<Long> mVar = h2.f40263b;
                return jLongValue >= 0;
            case 1:
                String str = (String) obj;
                i2.a aVar = i2.f40562e;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
            case 7:
            case 13:
            case 19:
            case 20:
            case 21:
            default:
                String str2 = (String) obj;
                t2.g gVar = t2.J;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 3:
                String str3 = (String) obj;
                i2.a aVar2 = i2.f40562e;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 4:
                String str4 = (String) obj;
                i2.b.C0474b c0474b = i2.b.f40571d;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 5:
                String str5 = (String) obj;
                i2.b.C0474b c0474b2 = i2.b.f40571d;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 6:
                String str6 = (String) obj;
                v9.b<Boolean> bVar = j2.f40738e;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 8:
                String str7 = (String) obj;
                v9.b<Boolean> bVar2 = j2.f40738e;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 9:
                String str8 = (String) obj;
                j2.f.e eVar = j2.f.f40757d;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
            case 10:
                String str9 = (String) obj;
                j2.f.e eVar2 = j2.f.f40757d;
                fd.j0.i(str9, "it");
                return str9.length() >= 1;
            case 11:
                long jLongValue2 = ((Long) obj).longValue();
                l2.c cVar = l2.f41210c;
                return jLongValue2 >= 0;
            case 12:
                long jLongValue3 = ((Long) obj).longValue();
                m2.e eVar3 = m2.f41420c;
                return jLongValue3 >= 0;
            case 14:
                String str10 = (String) obj;
                n2.c.b bVar3 = n2.c.f41644f;
                fd.j0.i(str10, "it");
                return str10.length() >= 1;
            case 15:
                String str11 = (String) obj;
                n2.c.b bVar4 = n2.c.f41644f;
                fd.j0.i(str11, "it");
                return str11.length() >= 1;
            case 16:
                String str12 = (String) obj;
                n2.c.b bVar5 = n2.c.f41644f;
                fd.j0.i(str12, "it");
                return str12.length() >= 1;
            case 17:
                String str13 = (String) obj;
                n2.c.b bVar6 = n2.c.f41644f;
                fd.j0.i(str13, "it");
                return str13.length() >= 1;
            case 18:
                String str14 = (String) obj;
                n2.c.b bVar7 = n2.c.f41644f;
                fd.j0.i(str14, "it");
                return str14.length() >= 1;
            case 22:
                String str15 = (String) obj;
                o2.h.g gVar2 = o2.h.f41768f;
                fd.j0.i(str15, "it");
                return str15.length() >= 1;
            case 23:
                String str16 = (String) obj;
                o2.h.g gVar3 = o2.h.f41768f;
                fd.j0.i(str16, "it");
                return str16.length() >= 1;
            case 24:
                String str17 = (String) obj;
                o2.h.g gVar4 = o2.h.f41768f;
                fd.j0.i(str17, "it");
                return str17.length() >= 1;
            case 25:
                String str18 = (String) obj;
                o2.h.g gVar5 = o2.h.f41768f;
                fd.j0.i(str18, "it");
                return str18.length() >= 1;
            case 26:
                String str19 = (String) obj;
                o2.h.g gVar6 = o2.h.f41768f;
                fd.j0.i(str19, "it");
                return str19.length() >= 1;
            case 27:
                double dDoubleValue = ((Double) obj).doubleValue();
                t2.g gVar7 = t2.J;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f40122c) {
            case 2:
                i2.a aVar = i2.f40562e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                v9.b<Boolean> bVar = j2.f40738e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                n2.b bVar2 = n2.f41632f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o2.g gVar = o2.f41743f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o2.g gVar2 = o2.f41743f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                o2.g gVar3 = o2.f41743f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                t2.g gVar4 = t2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
