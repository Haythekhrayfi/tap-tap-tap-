package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s2 implements h9.m, h9.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s2 f42475d = new s2(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s2 f42476e = new s2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s2 f42477f = new s2(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s2 f42478g = new s2(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s2 f42479h = new s2(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s2 f42480i = new s2(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ s2 f42481j = new s2(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ s2 f42482k = new s2(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ s2 f42483l = new s2(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ s2 f42484m = new s2(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s2 f42485n = new s2(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ s2 f42486o = new s2(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ s2 f42487p = new s2(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ s2 f42488q = new s2(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ s2 f42489r = new s2(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ s2 f42490s = new s2(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ s2 f42491t = new s2(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ s2 f42492u = new s2(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ s2 f42493v = new s2(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ s2 f42494w = new s2(23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ s2 f42495x = new s2(24);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ s2 f42496y = new s2(25);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ s2 f42497z = new s2(27);
    public static final /* synthetic */ s2 A = new s2(28);
    public static final /* synthetic */ s2 B = new s2(29);

    public /* synthetic */ s2(int i10) {
        this.f42498c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f42498c) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                t2.g gVar = t2.J;
                return jLongValue >= 0;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar = u2.J;
                return jLongValue2 >= 0;
            case 2:
            case 3:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 20:
            case 21:
            case 23:
            case 25:
            default:
                String str = (String) obj;
                o oVar2 = y2.N;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 4:
                String str2 = (String) obj;
                o oVar3 = u2.J;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar4 = u2.J;
                return jLongValue3 >= 0;
            case 6:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar5 = u2.J;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 8:
                long jLongValue4 = ((Long) obj).longValue();
                o oVar6 = u2.J;
                return jLongValue4 >= 0;
            case 14:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar7 = u2.J;
                return jLongValue5 > 0;
            case 15:
                long jLongValue6 = ((Long) obj).longValue();
                o oVar8 = u2.J;
                return jLongValue6 >= 0;
            case 16:
                long jLongValue7 = ((Long) obj).longValue();
                o oVar9 = u2.J;
                return jLongValue7 >= 0;
            case 17:
                String str3 = (String) obj;
                w2.g gVar2 = w2.N;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 18:
                String str4 = (String) obj;
                w2.g gVar3 = w2.N;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 19:
                long jLongValue8 = ((Long) obj).longValue();
                w2.g gVar4 = w2.N;
                return jLongValue8 >= 0;
            case 22:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                w2.g gVar5 = w2.N;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 24:
                long jLongValue9 = ((Long) obj).longValue();
                w2.g gVar6 = w2.N;
                return jLongValue9 >= 0;
            case 26:
                String str5 = (String) obj;
                w2.g gVar7 = w2.N;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f42498c) {
            case 2:
                o oVar = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar2 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar3 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar4 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 10:
                o oVar5 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 11:
                o oVar6 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar7 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar8 = u2.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                w2.g gVar = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                w2.g gVar2 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                w2.g gVar3 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                w2.g gVar4 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 27:
                o oVar9 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar10 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
