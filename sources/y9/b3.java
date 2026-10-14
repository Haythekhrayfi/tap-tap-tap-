package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b3 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b3 f39145d = new b3(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b3 f39146e = new b3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b3 f39147f = new b3(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b3 f39148g = new b3(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b3 f39149h = new b3(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b3 f39150i = new b3(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b3 f39151j = new b3(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b3 f39152k = new b3(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b3 f39153l = new b3(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b3 f39154m = new b3(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b3 f39155n = new b3(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b3 f39156o = new b3(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b3 f39157p = new b3(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ b3 f39158q = new b3(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b3 f39159r = new b3(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ b3 f39160s = new b3(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b3 f39161t = new b3(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b3 f39162u = new b3(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b3 f39163v = new b3(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b3 f39164w = new b3(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b3 f39165x = new b3(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b3 f39166y = new b3(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ b3 f39167z = new b3(24);
    public static final /* synthetic */ b3 A = new b3(25);
    public static final /* synthetic */ b3 B = new b3(26);
    public static final /* synthetic */ b3 C = new b3(27);
    public static final /* synthetic */ b3 D = new b3(28);
    public static final /* synthetic */ b3 E = new b3(29);

    public /* synthetic */ b3(int i10) {
        this.f39168c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f39168c) {
            case 3:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar = c3.J;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 6:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = c3.J;
                return jLongValue >= 0;
            case 7:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar3 = c3.J;
                return jLongValue2 >= 0;
            case 9:
                String str = (String) obj;
                d3.h hVar = d3.S;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 10:
                String str2 = (String) obj;
                d3.h hVar2 = d3.S;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 11:
                long jLongValue3 = ((Long) obj).longValue();
                d3.h hVar3 = d3.S;
                return jLongValue3 >= 0;
            case 16:
                long jLongValue4 = ((Long) obj).longValue();
                d3.h hVar4 = d3.S;
                return jLongValue4 >= 0;
            case 19:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                e3.d dVar = e3.f39743h;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 20:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                v9.b<Double> bVar = g3.f40123h;
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
            case 26:
                String str3 = (String) obj;
                o oVar4 = j3.S;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 28:
                String str4 = (String) obj;
                o oVar5 = j3.S;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            default:
                long jLongValue5 = ((Long) obj).longValue();
                o oVar6 = j3.S;
                return jLongValue5 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f39168c) {
            case 0:
                o oVar = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                o oVar2 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar3 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 16:
            case 19:
            case 20:
            default:
                o oVar4 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar5 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar6 = c3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 8:
                d3.h hVar = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                d3.h hVar2 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                d3.h hVar3 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                d3.h hVar4 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                d3.h hVar5 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                d3.h hVar6 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 18:
                d3.h hVar7 = d3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 21:
                v9.b<Double> bVar = g3.f40123h;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                o oVar7 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 23:
                o oVar8 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                o oVar9 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                o oVar10 = j3.S;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
