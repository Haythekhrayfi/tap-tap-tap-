package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.v;
import com.yandex.mobile.ads.exo.metadata.mp4.SlowMotionData;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l f7309d = new l(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l f7310e = new l(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l f7311f = new l(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l f7312g = new l(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l f7313h = new l(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7314c;

    public /* synthetic */ l(int i10) {
        this.f7314c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7314c) {
            case 0:
                return b.a((v) obj, (v) obj2);
            case 1:
                return c.a((Integer) obj, (Integer) obj2);
            case 2:
                return ((String) obj).compareToIgnoreCase((String) obj2);
            case 3:
                Charset charset = k5.b.f31897d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                c8.e eVar = (c8.e) obj;
                c8.e eVar2 = (c8.e) obj2;
                long j10 = eVar.f3632a;
                long j11 = eVar2.f3632a;
                if (j10 != j11) {
                    return (int) (j10 - j11);
                }
                int iMin = Math.min(eVar.f3633b.size(), eVar2.f3633b.size());
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = i10 + 1;
                    jc.h<String, String> hVar = eVar.f3633b.get(i10);
                    jc.h<String, String> hVar2 = eVar2.f3633b.get(i10);
                    int iCompareTo = hVar.f31811c.compareTo(hVar2.f31811c);
                    if (iCompareTo != 0 || hVar.f31812d.compareTo(hVar2.f31812d) != 0) {
                        return iCompareTo;
                    }
                    i10 = i11;
                }
                return eVar.f3633b.size() - eVar2.f3633b.size();
            default:
                return SlowMotionData.Segment.a((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
        }
    }
}
