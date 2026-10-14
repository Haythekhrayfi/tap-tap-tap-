package y9;

import com.yandex.mobile.ads.impl.tk;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l8 implements h9.g, h9.m, tk, com.yandex.mobile.ads.exo.drm.m.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l8 f41363d = new l8(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l8 f41364e = new l8(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l8 f41365f = new l8(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l8 f41366g = new l8(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l8 f41367h = new l8(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l8 f41368i = new l8(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ l8 f41369j = new l8(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ l8 f41370k = new l8(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ l8 f41371l = new l8(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ l8 f41372m = new l8(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ l8 f41373n = new l8(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ l8 f41374o = new l8(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ l8 f41375p = new l8(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ l8 f41376q = new l8(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ l8 f41377r = new l8(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ l8 f41378s = new l8(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ l8 f41379t = new l8(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ l8 f41380u = new l8(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ l8 f41381v = new l8(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ l8 f41382w = new l8(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ l8 f41383x = new l8(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ l8 f41384y = new l8(21);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41385c;

    public /* synthetic */ l8(int i10) {
        this.f41385c = i10;
    }

    @Override // com.yandex.mobile.ads.exo.drm.m.c
    public com.yandex.mobile.ads.exo.drm.m a(UUID uuid) {
        return com.yandex.mobile.ads.exo.drm.n.b(uuid);
    }

    @Override // com.yandex.mobile.ads.impl.tk
    public void accept(Object obj) {
        switch (this.f41385c) {
            case 19:
                ((com.yandex.mobile.ads.exo.drm.f.a) obj).c();
                break;
            default:
                ((com.yandex.mobile.ads.exo.drm.f.a) obj).a();
                break;
        }
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41385c) {
            case 1:
                String str = (String) obj;
                o8.b bVar = o8.f41845i;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                o8.b bVar2 = o8.f41845i;
                return jLongValue >= 0;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                o8.b bVar3 = o8.f41845i;
                return jLongValue2 >= 0;
            case 4:
                long jLongValue3 = ((Long) obj).longValue();
                o8.b bVar4 = o8.f41845i;
                return jLongValue3 > 0 && jLongValue3 <= 100;
            case 5:
                String str2 = (String) obj;
                p8.j jVar = p8.f42056i;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 6:
                long jLongValue4 = ((Long) obj).longValue();
                p8.j jVar2 = p8.f42056i;
                return jLongValue4 >= 0;
            case 7:
                long jLongValue5 = ((Long) obj).longValue();
                p8.j jVar3 = p8.f42056i;
                return jLongValue5 >= 0;
            case 8:
                long jLongValue6 = ((Long) obj).longValue();
                p8.j jVar4 = p8.f42056i;
                return jLongValue6 > 0 && jLongValue6 <= 100;
            case 9:
                long jLongValue7 = ((Long) obj).longValue();
                q8.b.c cVar = q8.b.f42195c;
                return jLongValue7 >= 0;
            case 10:
                long jLongValue8 = ((Long) obj).longValue();
                r8.e.C0478e c0478e = r8.e.f42372c;
                return jLongValue8 >= 0;
            case 11:
                String str3 = (String) obj;
                s8.a aVar = s8.f42669c;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 12:
                String str4 = (String) obj;
                h9.m<String> mVar = t8.f42923c;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 13:
                String str5 = (String) obj;
                u8.a aVar2 = u8.f43373c;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 14:
                String str6 = (String) obj;
                h9.m<String> mVar2 = v8.f43586c;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 15:
                String str7 = (String) obj;
                w8.a aVar3 = w8.f43834c;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 16:
                String str8 = (String) obj;
                h9.m<String> mVar3 = x8.f44184c;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
            case 17:
                String str9 = (String) obj;
                y8.a aVar4 = y8.f44572c;
                fd.j0.i(str9, "it");
                return str9.length() >= 1;
            default:
                String str10 = (String) obj;
                h9.m<String> mVar4 = z8.f44795c;
                fd.j0.i(str10, "it");
                return str10.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        o oVar = m8.M;
        fd.j0.i(list, "it");
        return list.size() >= 1;
    }
}
