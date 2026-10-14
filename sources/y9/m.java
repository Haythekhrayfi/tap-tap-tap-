package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements h9.m, h9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m f41386d = new m(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m f41387e = new m(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m f41388f = new m(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m f41389g = new m(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m f41390h = new m(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m f41391i = new m(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ m f41392j = new m(11);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ m f41393k = new m(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ m f41394l = new m(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ m f41395m = new m(15);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ m f41396n = new m(16);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ m f41397o = new m(17);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ m f41398p = new m(18);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ m f41399q = new m(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ m f41400r = new m(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ m f41401s = new m(22);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ m f41402t = new m(24);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ m f41403u = new m(26);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m f41404v = new m(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41405c;

    public /* synthetic */ m(int i10) {
        this.f41405c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41405c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                n.f fVar = n.f41577e;
                return jLongValue >= 0;
            case 1:
                String str = (String) obj;
                o.c cVar = o.f41700f;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
                String str2 = (String) obj;
                o.c cVar2 = o.f41700f;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 3:
                String str3 = (String) obj;
                o.c cVar3 = o.f41700f;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 4:
                String str4 = (String) obj;
                p.i iVar = p.f41863g;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 5:
                String str5 = (String) obj;
                p.i iVar2 = p.f41863g;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 6:
                String str6 = (String) obj;
                p.i iVar3 = p.f41863g;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 7:
                String str7 = (String) obj;
                q.c cVar4 = q.f42091g;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 8:
            case 11:
            case 12:
            case 15:
            case 18:
            case 20:
            default:
                long jLongValue2 = ((Long) obj).longValue();
                v9.b<Long> bVar = o0.f41717d;
                return jLongValue2 >= 0;
            case 9:
                String str8 = (String) obj;
                q.d.b bVar2 = q.d.f42104d;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
            case 10:
                String str9 = (String) obj;
                s.k kVar = s.f42386i;
                fd.j0.i(str9, "it");
                return str9.length() >= 1;
            case 13:
                String str10 = (String) obj;
                s.l.e eVar = s.l.f42419d;
                fd.j0.i(str10, "it");
                return str10.length() >= 1;
            case 14:
                long jLongValue3 = ((Long) obj).longValue();
                v.d dVar = v.f43377h;
                return jLongValue3 >= 0;
            case 16:
                long jLongValue4 = ((Long) obj).longValue();
                v.d dVar2 = v.f43377h;
                return jLongValue4 >= 0;
            case 17:
                long jLongValue5 = ((Long) obj).longValue();
                x.l lVar = x.f43838i;
                return jLongValue5 >= 0;
            case 19:
                long jLongValue6 = ((Long) obj).longValue();
                x.l lVar2 = x.f43838i;
                return jLongValue6 >= 0;
            case 21:
                double dDoubleValue = ((Double) obj).doubleValue();
                c0.b bVar3 = c0.f39344b;
                return dDoubleValue > 0.0d;
            case 22:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                d0.c cVar5 = d0.f39549b;
                return dDoubleValue2 > 0.0d;
            case 23:
                long jLongValue7 = ((Long) obj).longValue();
                i0.a aVar = i0.f40528b;
                return jLongValue7 >= 0;
            case 24:
                long jLongValue8 = ((Long) obj).longValue();
                h9.m<Long> mVar = j0.f40649b;
                return jLongValue8 >= 0;
            case 25:
                long jLongValue9 = ((Long) obj).longValue();
                k0.b bVar4 = k0.f40992f;
                return jLongValue9 >= 0;
            case 26:
                long jLongValue10 = ((Long) obj).longValue();
                l0.g gVar = l0.f41168f;
                return jLongValue10 >= 0;
            case 27:
                long jLongValue11 = ((Long) obj).longValue();
                m0.b bVar5 = m0.f41406d;
                return jLongValue11 >= 0;
            case 28:
                long jLongValue12 = ((Long) obj).longValue();
                m0.b bVar6 = m0.f41406d;
                return jLongValue12 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41405c) {
            case 8:
                q.c cVar = q.f42091g;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                s.k kVar = s.f42386i;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                s.l.e eVar = s.l.f42419d;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                v.d dVar = v.f43377h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                x.l lVar = x.f43838i;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                h9.g<a0> gVar = z.f44576b;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
