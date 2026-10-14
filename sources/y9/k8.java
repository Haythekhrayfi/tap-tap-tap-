package y9;

import com.yandex.mobile.ads.impl.tk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k8 implements h9.g, h9.m, tk, com.yandex.mobile.ads.exo.drm.g.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k8 f41132d = new k8(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k8 f41133e = new k8(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k8 f41134f = new k8(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k8 f41135g = new k8(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k8 f41136h = new k8(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k8 f41137i = new k8(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k8 f41138j = new k8(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k8 f41139k = new k8(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k8 f41140l = new k8(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k8 f41141m = new k8(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k8 f41142n = new k8(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ k8 f41143o = new k8(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ k8 f41144p = new k8(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ k8 f41145q = new k8(18);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ k8 f41146r = new k8(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ k8 f41147s = new k8(22);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ k8 f41148t = new k8(24);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ k8 f41149u = new k8(26);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k8 f41150v = new k8(27);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ k8 f41151w = new k8(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41152c;

    public /* synthetic */ k8(int i10) {
        this.f41152c = i10;
    }

    @Override // com.yandex.mobile.ads.impl.tk
    public void accept(Object obj) {
        ((com.yandex.mobile.ads.exo.drm.f.a) obj).b();
    }

    @Override // h9.m
    public boolean d(Object obj) {
        switch (this.f41152c) {
            case 7:
                long jLongValue = ((Long) obj).longValue();
                o oVar = m8.M;
                return jLongValue >= 0;
            case 8:
            default:
                String str = (String) obj;
                h9.m<String> mVar = z8.f44795c;
                fd.j0.i(str, "it");
                return str.length() >= 1;
            case 9:
                String str2 = (String) obj;
                o8.b bVar = o8.f41845i;
                fd.j0.i(str2, "it");
                return str2.length() >= 1;
            case 10:
                long jLongValue2 = ((Long) obj).longValue();
                o8.b bVar2 = o8.f41845i;
                return jLongValue2 >= 0;
            case 11:
                long jLongValue3 = ((Long) obj).longValue();
                o8.b bVar3 = o8.f41845i;
                return jLongValue3 >= 0;
            case 12:
                long jLongValue4 = ((Long) obj).longValue();
                o8.b bVar4 = o8.f41845i;
                return jLongValue4 > 0 && jLongValue4 <= 100;
            case 13:
                String str3 = (String) obj;
                p8.j jVar = p8.f42056i;
                fd.j0.i(str3, "it");
                return str3.length() >= 1;
            case 14:
                long jLongValue5 = ((Long) obj).longValue();
                p8.j jVar2 = p8.f42056i;
                return jLongValue5 >= 0;
            case 15:
                long jLongValue6 = ((Long) obj).longValue();
                p8.j jVar3 = p8.f42056i;
                return jLongValue6 >= 0;
            case 16:
                long jLongValue7 = ((Long) obj).longValue();
                p8.j jVar4 = p8.f42056i;
                return jLongValue7 > 0 && jLongValue7 <= 100;
            case 17:
                long jLongValue8 = ((Long) obj).longValue();
                q8.b.c cVar = q8.b.f42195c;
                return jLongValue8 >= 0;
            case 18:
                long jLongValue9 = ((Long) obj).longValue();
                r8.e.C0478e c0478e = r8.e.f42372c;
                return jLongValue9 >= 0;
            case 19:
                String str4 = (String) obj;
                s8.a aVar = s8.f42669c;
                fd.j0.i(str4, "it");
                return str4.length() >= 1;
            case 20:
                String str5 = (String) obj;
                h9.m<String> mVar2 = t8.f42923c;
                fd.j0.i(str5, "it");
                return str5.length() >= 1;
            case 21:
                String str6 = (String) obj;
                u8.a aVar2 = u8.f43373c;
                fd.j0.i(str6, "it");
                return str6.length() >= 1;
            case 22:
                String str7 = (String) obj;
                h9.m<String> mVar3 = v8.f43586c;
                fd.j0.i(str7, "it");
                return str7.length() >= 1;
            case 23:
                String str8 = (String) obj;
                w8.a aVar3 = w8.f43834c;
                fd.j0.i(str8, "it");
                return str8.length() >= 1;
            case 24:
                String str9 = (String) obj;
                h9.m<String> mVar4 = x8.f44184c;
                fd.j0.i(str9, "it");
                return str9.length() >= 1;
            case 25:
                String str10 = (String) obj;
                y8.a aVar4 = y8.f44572c;
                fd.j0.i(str10, "it");
                return str10.length() >= 1;
        }
    }

    @Override // h9.g
    public boolean isValid(List list) {
        switch (this.f41152c) {
            case 0:
                o oVar = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 1:
                o oVar2 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 2:
                o oVar3 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 3:
                o oVar4 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 4:
                o oVar5 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 5:
                o oVar6 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            case 6:
                o oVar7 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
            default:
                o oVar8 = m8.M;
                fd.j0.i(list, "it");
                return list.size() >= 1;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.g.b
    public void release() {
        com.yandex.mobile.ads.exo.drm.g.b.lambda$static$0();
    }
}
