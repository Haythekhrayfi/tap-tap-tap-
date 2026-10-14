package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r1 f42233d = new r1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r1 f42234e = new r1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r1 f42235f = new r1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r1 f42236g = new r1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r1 f42237h = new r1(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r1 f42238i = new r1(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r1 f42239j = new r1(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ r1 f42240k = new r1(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ r1 f42241l = new r1(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ r1 f42242m = new r1(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ r1 f42243n = new r1(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r1 f42244o = new r1(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ r1 f42245p = new r1(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ r1 f42246q = new r1(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ r1 f42247r = new r1(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ r1 f42248s = new r1(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ r1 f42249t = new r1(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r1 f42250u = new r1(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ r1 f42251v = new r1(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ r1 f42252w = new r1(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ r1 f42253x = new r1(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r1 f42254y = new r1(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ r1 f42255z = new r1(22);
    public static final /* synthetic */ r1 A = new r1(23);
    public static final /* synthetic */ r1 B = new r1(27);
    public static final /* synthetic */ r1 C = new r1(28);
    public static final /* synthetic */ r1 D = new r1(29);

    public /* synthetic */ r1(int i10) {
        this.f42256c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42256c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                s1.j jVar = s1.f42440i;
                return jLongValue >= 0;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                s1.j jVar2 = s1.f42440i;
                return jLongValue2 >= 0 && jLongValue2 < 100;
            case 2:
            case 3:
            case 4:
            default:
                String str = (String) obj;
                v9.b<Boolean> bVar = j2.f40738e;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                x1.c cVar = x1.f44020f;
                return jLongValue3 >= 0;
            case 6:
                long jLongValue4 = ((Long) obj).longValue();
                x1.c cVar2 = x1.f44020f;
                return jLongValue4 >= 0;
            case 7:
                long jLongValue5 = ((Long) obj).longValue();
                x1.c cVar3 = x1.f44020f;
                return jLongValue5 >= 0;
            case 8:
                long jLongValue6 = ((Long) obj).longValue();
                x1.c cVar4 = x1.f44020f;
                return jLongValue6 >= 0;
            case 9:
                long jLongValue7 = ((Long) obj).longValue();
                y1.h hVar = y1.f44196f;
                return jLongValue7 >= 0;
            case 10:
                long jLongValue8 = ((Long) obj).longValue();
                y1.h hVar2 = y1.f44196f;
                return jLongValue8 >= 0;
            case 11:
                long jLongValue9 = ((Long) obj).longValue();
                y1.h hVar3 = y1.f44196f;
                return jLongValue9 >= 0;
            case 12:
                long jLongValue10 = ((Long) obj).longValue();
                y1.h hVar4 = y1.f44196f;
                return jLongValue10 >= 0;
            case 13:
                String str2 = (String) obj;
                z1.b bVar2 = z1.f44582c;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 14:
                String str3 = (String) obj;
                a2.d dVar = a2.f38997c;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 15:
                double dDoubleValue = ((Double) obj).doubleValue();
                b2.c cVar5 = b2.f39129e;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 16:
                long jLongValue11 = ((Long) obj).longValue();
                b2.c cVar6 = b2.f39129e;
                return jLongValue11 >= 0;
            case 17:
                long jLongValue12 = ((Long) obj).longValue();
                b2.c cVar7 = b2.f39129e;
                return jLongValue12 >= 0;
            case 18:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                c2.g gVar = c2.f39372e;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 19:
                long jLongValue13 = ((Long) obj).longValue();
                c2.g gVar2 = c2.f39372e;
                return jLongValue13 >= 0;
            case 20:
                long jLongValue14 = ((Long) obj).longValue();
                c2.g gVar3 = c2.f39372e;
                return jLongValue14 >= 0;
            case 21:
                long jLongValue15 = ((Long) obj).longValue();
                f2.a aVar = f2.f39931a;
                return jLongValue15 >= 0;
            case 22:
                long jLongValue16 = ((Long) obj).longValue();
                h9.m<Long> mVar = h2.f40263b;
                return jLongValue16 >= 0;
            case 23:
                String str4 = (String) obj;
                i2.a aVar2 = i2.f40562e;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 24:
                String str5 = (String) obj;
                i2.a aVar3 = i2.f40562e;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 25:
                String str6 = (String) obj;
                i2.b.C0474b c0474b = i2.b.f40571d;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 26:
                String str7 = (String) obj;
                i2.b.C0474b c0474b2 = i2.b.f40571d;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 27:
                String str8 = (String) obj;
                v9.b<Boolean> bVar3 = j2.f40738e;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42256c) {
            case 2:
                t1.b bVar = t1.f42679c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                u1.d dVar = u1.f42942c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                u1.d dVar2 = u1.f42942c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                v9.b<Boolean> bVar2 = j2.f40738e;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
