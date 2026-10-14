package com.yandex.mobile.ads.instream.inroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.ba0;
import com.yandex.mobile.ads.impl.k30;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* JADX INFO: loaded from: classes3.dex */
public class InrollQueueProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ba0<Inroll> f27498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k30 f27499b = new k30();

    public InrollQueueProvider(Context context, InstreamAd instreamAd) {
        this.f27498a = new ba0<>(context, instreamAd);
    }

    public InstreamAdBreakQueue<Inroll> getQueue() {
        return this.f27498a.a(this.f27499b, InstreamAdBreakType.INROLL);
    }
}
