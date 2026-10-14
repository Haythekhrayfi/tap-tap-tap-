package p7;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1 implements e1, t9.j, u9.h.a, b9.o, h9.m, h9.g, h9.c.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d1 f34480d = new d1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d1 f34481e = new d1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d1 f34482f = new d1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d1 f34483g = new d1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d1 f34484h = new d1(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d1 f34485i = new d1(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d1 f34486j = new d1(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ d1 f34487k = new d1(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ d1 f34488l = new d1(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d1 f34489m = new d1(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ d1 f34490n = new d1(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ d1 f34491o = new d1(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ d1 f34492p = new d1(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ d1 f34493q = new d1(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d1 f34494r = new d1(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ d1 f34495s = new d1(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d1 f34496t = new d1(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d1 f34497u = new d1(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d1 f34498v = new d1(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d1 f34499w = new d1(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d1 f34500x = new d1(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d1 f34501y = new d1(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ d1 f34502z = new d1(22);
    public static final /* synthetic */ d1 A = new d1(23);
    public static final /* synthetic */ d1 B = new d1(24);
    public static final /* synthetic */ d1 C = new d1(25);
    public static final /* synthetic */ d1 D = new d1(26);
    public static final /* synthetic */ d1 E = new d1(27);
    public static final /* synthetic */ d1 F = new d1(28);
    public static final /* synthetic */ d1 G = new d1(29);

    public /* synthetic */ d1(int i10) {
        this.f34503c = i10;
    }

    @Override // t9.j
    public t9.u.a a(ViewGroup viewGroup, t9.j.b bVar, t9.j.a aVar) {
        return new t9.k(viewGroup, bVar, aVar);
    }

    @Override // h9.c.a
    public void b(u9.f fVar) {
        h9.c.a.g(fVar);
        throw null;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f34503c) {
            case 5:
                h9.m<?> mVar = h9.c.f30971a;
                return true;
            case 6:
            case 7:
            default:
                String str = (String) obj;
                y9.q.c cVar = y9.q.f42091g;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 8:
                String str2 = (String) obj;
                fd.j0.i(str2, "it");
                return str2.length() > 0;
            case 9:
                String str3 = (String) obj;
                y9.a.C0470a c0470a = y9.a.f38962c;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 10:
                String str4 = (String) obj;
                h9.m<String> mVar2 = y9.c.f39336c;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 11:
                String str5 = (String) obj;
                y9.e.a aVar = y9.e.f39722c;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 12:
                String str6 = (String) obj;
                h9.m<String> mVar3 = y9.f.f39910c;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 13:
                String str7 = (String) obj;
                y9.g.a aVar2 = y9.g.f40072c;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 14:
                String str8 = (String) obj;
                h9.m<String> mVar4 = y9.h.f40244c;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                y9.l.b bVar = y9.l.f41153e;
                return jLongValue >= 0;
            case 16:
                long jLongValue2 = ((Long) obj).longValue();
                y9.l.b bVar2 = y9.l.f41153e;
                return jLongValue2 >= 0;
            case 17:
                long jLongValue3 = ((Long) obj).longValue();
                y9.l.b bVar3 = y9.l.f41153e;
                return jLongValue3 >= 0;
            case 18:
                long jLongValue4 = ((Long) obj).longValue();
                y9.l.b bVar4 = y9.l.f41153e;
                return jLongValue4 >= 0;
            case 19:
                long jLongValue5 = ((Long) obj).longValue();
                y9.n.f fVar = y9.n.f41577e;
                return jLongValue5 >= 0;
            case 20:
                long jLongValue6 = ((Long) obj).longValue();
                y9.n.f fVar2 = y9.n.f41577e;
                return jLongValue6 >= 0;
            case 21:
                long jLongValue7 = ((Long) obj).longValue();
                y9.n.f fVar3 = y9.n.f41577e;
                return jLongValue7 >= 0;
            case 22:
                long jLongValue8 = ((Long) obj).longValue();
                y9.n.f fVar4 = y9.n.f41577e;
                return jLongValue8 >= 0;
            case 23:
                String str9 = (String) obj;
                y9.o.c cVar2 = y9.o.f41700f;
                fd.j0.i(str9, "it");
                return str9.length() >= 1;
            case 24:
                String str10 = (String) obj;
                y9.o.c cVar3 = y9.o.f41700f;
                fd.j0.i(str10, "it");
                return str10.length() >= 1;
            case 25:
                String str11 = (String) obj;
                y9.o.c cVar4 = y9.o.f41700f;
                fd.j0.i(str11, "it");
                return str11.length() >= 1;
            case 26:
                String str12 = (String) obj;
                y9.p.i iVar = y9.p.f41863g;
                fd.j0.i(str12, "it");
                return str12.length() >= 1;
            case 27:
                String str13 = (String) obj;
                y9.p.i iVar2 = y9.p.f41863g;
                fd.j0.i(str13, "it");
                return str13.length() >= 1;
            case 28:
                String str14 = (String) obj;
                y9.p.i iVar3 = y9.p.f41863g;
                fd.j0.i(str14, "it");
                return str14.length() >= 1;
        }
    }

    @Override // b9.o
    public boolean e(String str) {
        b9.o.a aVar = b9.o.a.f3395a;
        return false;
    }

    @Override // h9.g
    public boolean isValid(List list) {
        h9.m<?> mVar = h9.c.f30971a;
        return true;
    }
}
