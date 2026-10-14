package com.yandex.mobile.ads.instream.pauseroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.ba0;
import com.yandex.mobile.ads.impl.zp0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* JADX INFO: loaded from: classes3.dex */
public class PauserollQueueProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ba0<Pauseroll> f27500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp0 f27501b = new zp0();

    public PauserollQueueProvider(Context context, InstreamAd instreamAd) {
        this.f27500a = new ba0<>(context, instreamAd);
    }

    public InstreamAdBreakQueue<Pauseroll> getQueue() {
        return this.f27500a.a(this.f27501b, InstreamAdBreakType.PAUSEROLL);
    }
}
