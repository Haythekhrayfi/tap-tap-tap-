package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.z30;

/* JADX INFO: loaded from: classes3.dex */
public class InstreamAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z30 f27464a;

    public InstreamAdLoader(Context context) {
        this.f27464a = new z30(context);
    }

    public void loadInstreamAd(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f27464a.a(instreamAdRequestConfiguration);
    }

    public void setInstreamAdLoadListener(InstreamAdLoadListener instreamAdLoadListener) {
        this.f27464a.a(instreamAdLoadListener);
    }
}
