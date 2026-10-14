package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o30 implements dc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gc1 f23685a = new gc1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hc1 f23686b = new hc1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ic1 f23687c = new ic1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fc1 f23688d;

    public final void a(bc1 bc1Var) {
        if (bc1Var != null) {
            Objects.requireNonNull(this.f23686b);
            if (!(bc1Var.a() != null)) {
                return;
            }
        }
        this.f23688d = null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    public final void a(cc1 cc1Var) {
        boolean z10;
        boolean z11;
        if (cc1Var != null) {
            Objects.requireNonNull(this.f23687c);
            VideoAdControlsContainer videoAdControlsContainerE = cc1Var.e();
            ArrayList arrayList = new ArrayList();
            arrayList.add(videoAdControlsContainerE);
            arrayList.add(cc1Var.d());
            arrayList.add(cc1Var.b());
            arrayList.add(cc1Var.a());
            arrayList.add(cc1Var.c());
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if (it.next() == null) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                z11 = videoAdControlsContainerE.getParent() != null ? false : true;
            }
            if (!z11) {
                return;
            }
        }
        this.f23688d = null;
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(v30 v30Var) {
        fd.j0.i(v30Var, "videoAdCreativePlayback");
        fc1 fc1Var = this.f23688d;
        if (fc1Var != null) {
            v30Var.a(fc1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdClicked(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdCompleted(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdError(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdPaused(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdResumed(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdSkipped(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStarted(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStopped(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        fd.j0.i(videoAd, "videoAd");
    }
}
