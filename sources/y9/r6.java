package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r6 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r6 f42328d = new r6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r6 f42329e = new r6(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r6 f42330f = new r6(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r6 f42331g = new r6(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r6 f42332h = new r6(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r6 f42333i = new r6(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r6 f42334j = new r6(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ r6 f42335k = new r6(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ r6 f42336l = new r6(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ r6 f42337m = new r6(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ r6 f42338n = new r6(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r6 f42339o = new r6(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ r6 f42340p = new r6(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ r6 f42341q = new r6(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ r6 f42342r = new r6(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ r6 f42343s = new r6(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ r6 f42344t = new r6(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r6 f42345u = new r6(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ r6 f42346v = new r6(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ r6 f42347w = new r6(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ r6 f42348x = new r6(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r6 f42349y = new r6(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ r6 f42350z = new r6(24);
    public static final /* synthetic */ r6 A = new r6(25);
    public static final /* synthetic */ r6 B = new r6(26);
    public static final /* synthetic */ r6 C = new r6(27);
    public static final /* synthetic */ r6 D = new r6(28);
    public static final /* synthetic */ r6 E = new r6(29);

    public /* synthetic */ r6(int i10) {
        this.f42351c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42351c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                s6.d dVar = s6.M;
                return jLongValue >= 0;
            case 2:
                String str = (String) obj;
                s6.d dVar2 = s6.M;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                s6.e.d dVar3 = s6.e.f42629f;
                return jLongValue2 >= 0;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = t6.N;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 5:
                String str2 = (String) obj;
                o oVar2 = t6.N;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 6:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar3 = t6.N;
                return jLongValue3 >= 0;
            case 8:
                String str3 = (String) obj;
                o oVar4 = t6.N;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 9:
                String str4 = (String) obj;
                o oVar5 = t6.N;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 14:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar6 = t6.N;
                return jLongValue4 >= 0;
            case 17:
                long jLongValue5 = ((Long) obj).longValue();
                t6.r0.i iVar = t6.r0.f42864f;
                return jLongValue5 >= 0;
            case 18:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                x6.e eVar = x6.E;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 23:
                long jLongValue6 = ((Long) obj).longValue();
                x6.e eVar2 = x6.E;
                return jLongValue6 >= 0;
            case 25:
                String str5 = (String) obj;
                x6.e eVar3 = x6.E;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 27:
                String str6 = (String) obj;
                o oVar7 = z6.E;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            default:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar8 = z6.E;
                return jLongValue7 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42351c) {
            case 1:
                s6.d dVar = s6.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 14:
            case 17:
            case 18:
            case 23:
            case 25:
            default:
                o oVar = z6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar2 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar3 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar4 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar5 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar6 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar7 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 16:
                o oVar8 = t6.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                x6.e eVar = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                x6.e eVar2 = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                x6.e eVar3 = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                x6.e eVar4 = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                x6.e eVar5 = x6.E;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                x6.f.b bVar = x6.f.f44159f;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
