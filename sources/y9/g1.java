package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g1 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g1 f40076d = new g1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g1 f40077e = new g1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g1 f40078f = new g1(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g1 f40079g = new g1(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g1 f40080h = new g1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g1 f40081i = new g1(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g1 f40082j = new g1(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ g1 f40083k = new g1(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g1 f40084l = new g1(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g1 f40085m = new g1(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g1 f40086n = new g1(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ g1 f40087o = new g1(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ g1 f40088p = new g1(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ g1 f40089q = new g1(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g1 f40090r = new g1(17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ g1 f40091s = new g1(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g1 f40092t = new g1(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ g1 f40093u = new g1(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g1 f40094v = new g1(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ g1 f40095w = new g1(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g1 f40096x = new g1(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g1 f40097y = new g1(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ g1 f40098z = new g1(25);
    public static final /* synthetic */ g1 A = new g1(26);
    public static final /* synthetic */ g1 B = new g1(27);
    public static final /* synthetic */ g1 C = new g1(28);
    public static final /* synthetic */ g1 D = new g1(29);

    public /* synthetic */ g1(int i10) {
        this.f40099c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f40099c) {
            case 0:
                String str = (String) obj;
                h9.m<String> mVar = h1.f40253c;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                i1.d dVar = i1.D;
                return jLongValue >= 0;
            case 2:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 22:
            case 23:
            default:
                String str2 = (String) obj;
                s1.j jVar = s1.f42440i;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                i1.d dVar2 = i1.D;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 5:
                long jLongValue2 = ((Long) obj).longValue();
                i1.d dVar3 = i1.D;
                return jLongValue2 >= 0;
            case 7:
                String str3 = (String) obj;
                i1.d dVar4 = i1.D;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 9:
                String str4 = (String) obj;
                o oVar = j1.D;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 11:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar2 = j1.D;
                return jLongValue3 >= 0;
            case 14:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar3 = j1.D;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 18:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar4 = j1.D;
                return jLongValue4 >= 0;
            case 21:
                String str5 = (String) obj;
                l1.b bVar = l1.f41189h;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 24:
                long jLongValue5 = ((Long) obj).longValue();
                q1.b bVar2 = q1.f42118a;
                return jLongValue5 >= 0;
            case 25:
                String str6 = (String) obj;
                q1.b bVar3 = q1.f42118a;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 26:
                long jLongValue6 = ((Long) obj).longValue();
                q1.b bVar4 = q1.f42118a;
                return jLongValue6 >= 0;
            case 27:
                long jLongValue7 = ((Long) obj).longValue();
                q1.b bVar5 = q1.f42118a;
                return jLongValue7 >= 0 && jLongValue7 < 100;
            case 28:
                long jLongValue8 = ((Long) obj).longValue();
                s1.j jVar2 = s1.f42440i;
                return jLongValue8 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f40099c) {
            case 2:
                i1.d dVar = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                i1.d dVar2 = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 14:
            case 18:
            case 21:
            default:
                l1.b bVar = l1.f41189h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                i1.d dVar3 = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                i1.d dVar4 = i1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar2 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar3 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar4 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar5 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                o oVar6 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar7 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                o oVar8 = j1.D;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                l1.b bVar2 = l1.f41189h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
