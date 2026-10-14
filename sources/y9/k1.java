package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements h9.g, h9.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k1 f41002d = new k1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k1 f41003e = new k1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k1 f41004f = new k1(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k1 f41005g = new k1(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k1 f41006h = new k1(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k1 f41007i = new k1(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k1 f41008j = new k1(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k1 f41009k = new k1(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k1 f41010l = new k1(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k1 f41011m = new k1(17);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k1 f41012n = new k1(18);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ k1 f41013o = new k1(19);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ k1 f41014p = new k1(20);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ k1 f41015q = new k1(22);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ k1 f41016r = new k1(26);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ k1 f41017s = new k1(27);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ k1 f41018t = new k1(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41019c;

    public /* synthetic */ k1(int i10) {
        this.f41019c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41019c) {
            case 2:
                long jLongValue = ((Long) obj).longValue();
                q1.b bVar = q1.f42118a;
                return jLongValue >= 0;
            case 3:
                String str = (String) obj;
                q1.b bVar2 = q1.f42118a;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 4:
                long jLongValue2 = ((Long) obj).longValue();
                q1.b bVar3 = q1.f42118a;
                return jLongValue2 >= 0;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                q1.b bVar4 = q1.f42118a;
                return jLongValue3 >= 0 && jLongValue3 < 100;
            case 6:
                long jLongValue4 = ((Long) obj).longValue();
                s1.j jVar = s1.f42440i;
                return jLongValue4 >= 0;
            case 7:
                String str2 = (String) obj;
                s1.j jVar2 = s1.f42440i;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 8:
                long jLongValue5 = ((Long) obj).longValue();
                s1.j jVar3 = s1.f42440i;
                return jLongValue5 >= 0;
            case 9:
                long jLongValue6 = ((Long) obj).longValue();
                s1.j jVar4 = s1.f42440i;
                return jLongValue6 >= 0 && jLongValue6 < 100;
            case 10:
            case 11:
            case 12:
            default:
                long jLongValue7 = ((Long) obj).longValue();
                f2.a aVar = f2.f39931a;
                return jLongValue7 >= 0;
            case 13:
                long jLongValue8 = ((Long) obj).longValue();
                x1.c cVar = x1.f44020f;
                return jLongValue8 >= 0;
            case 14:
                long jLongValue9 = ((Long) obj).longValue();
                x1.c cVar2 = x1.f44020f;
                return jLongValue9 >= 0;
            case 15:
                long jLongValue10 = ((Long) obj).longValue();
                x1.c cVar3 = x1.f44020f;
                return jLongValue10 >= 0;
            case 16:
                long jLongValue11 = ((Long) obj).longValue();
                x1.c cVar4 = x1.f44020f;
                return jLongValue11 >= 0;
            case 17:
                long jLongValue12 = ((Long) obj).longValue();
                y1.h hVar = y1.f44196f;
                return jLongValue12 >= 0;
            case 18:
                long jLongValue13 = ((Long) obj).longValue();
                y1.h hVar2 = y1.f44196f;
                return jLongValue13 >= 0;
            case 19:
                long jLongValue14 = ((Long) obj).longValue();
                y1.h hVar3 = y1.f44196f;
                return jLongValue14 >= 0;
            case 20:
                long jLongValue15 = ((Long) obj).longValue();
                y1.h hVar4 = y1.f44196f;
                return jLongValue15 >= 0;
            case 21:
                String str3 = (String) obj;
                z1.b bVar5 = z1.f44582c;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 22:
                String str4 = (String) obj;
                a2.d dVar = a2.f38997c;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 23:
                double dDoubleValue = ((Double) obj).doubleValue();
                b2.c cVar5 = b2.f39129e;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 24:
                long jLongValue16 = ((Long) obj).longValue();
                b2.c cVar6 = b2.f39129e;
                return jLongValue16 >= 0;
            case 25:
                long jLongValue17 = ((Long) obj).longValue();
                b2.c cVar7 = b2.f39129e;
                return jLongValue17 >= 0;
            case 26:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                c2.g gVar = c2.f39372e;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 27:
                long jLongValue18 = ((Long) obj).longValue();
                c2.g gVar2 = c2.f39372e;
                return jLongValue18 >= 0;
            case 28:
                long jLongValue19 = ((Long) obj).longValue();
                c2.g gVar3 = c2.f39372e;
                return jLongValue19 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41019c) {
            case 0:
                l1.b bVar = l1.f41189h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                l1.b bVar2 = l1.f41189h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                t1.b bVar3 = t1.f42679c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                u1.d dVar = u1.f42942c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                u1.d dVar2 = u1.f42942c;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
