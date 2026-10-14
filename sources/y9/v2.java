package y9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v2 implements h9.g, h9.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v2 f43427d = new v2(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v2 f43428e = new v2(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v2 f43429f = new v2(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v2 f43430g = new v2(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v2 f43431h = new v2(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v2 f43432i = new v2(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v2 f43433j = new v2(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ v2 f43434k = new v2(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ v2 f43435l = new v2(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ v2 f43436m = new v2(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ v2 f43437n = new v2(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ v2 f43438o = new v2(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ v2 f43439p = new v2(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ v2 f43440q = new v2(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ v2 f43441r = new v2(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ v2 f43442s = new v2(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v2 f43443t = new v2(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ v2 f43444u = new v2(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v2 f43445v = new v2(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v2 f43446w = new v2(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ v2 f43447x = new v2(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ v2 f43448y = new v2(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ v2 f43449z = new v2(25);
    public static final /* synthetic */ v2 A = new v2(26);
    public static final /* synthetic */ v2 B = new v2(27);
    public static final /* synthetic */ v2 C = new v2(28);
    public static final /* synthetic */ v2 D = new v2(29);

    public /* synthetic */ v2(int i10) {
        this.f43450c = i10;
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f43450c) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                w2.g gVar = w2.N;
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                w2.g gVar2 = w2.N;
                return jLongValue >= 0;
            case 8:
                String str = (String) obj;
                o oVar = y2.N;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 10:
                String str2 = (String) obj;
                o oVar2 = y2.N;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 11:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar3 = y2.N;
                return jLongValue2 >= 0;
            case 16:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                o oVar4 = y2.N;
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 18:
                long jLongValue3 = ((Long) obj).longValue();
                o oVar5 = y2.N;
                return jLongValue3 >= 0;
            case 21:
                String str3 = (String) obj;
                a3.f fVar = a3.J;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 23:
                long jLongValue4 = ((Long) obj).longValue();
                a3.f fVar2 = a3.J;
                return jLongValue4 >= 0;
            case 28:
                long jLongValue5 = ((Long) obj).longValue();
                a3.f fVar3 = a3.J;
                return jLongValue5 >= 0;
            default:
                long jLongValue6 = ((Long) obj).longValue();
                a3.f fVar4 = a3.J;
                return jLongValue6 >= 0;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f43450c) {
            case 0:
                w2.g gVar = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
            case 2:
            case 8:
            case 10:
            case 11:
            case 16:
            case 18:
            case 21:
            case 23:
            default:
                a3.f fVar = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                w2.g gVar2 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                w2.g gVar3 = w2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar2 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 7:
                o oVar3 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 9:
                o oVar4 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 12:
                o oVar5 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 13:
                o oVar6 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 14:
                o oVar7 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 15:
                o oVar8 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 17:
                o oVar9 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 19:
                o oVar10 = y2.N;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 20:
                a3.f fVar2 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 22:
                a3.f fVar3 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 24:
                a3.f fVar4 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 25:
                a3.f fVar5 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 26:
                a3.f fVar6 = a3.J;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }
}
