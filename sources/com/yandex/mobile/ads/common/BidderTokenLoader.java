package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.impl.wk1;

/* JADX INFO: loaded from: classes2.dex */
public final class BidderTokenLoader {
    private BidderTokenLoader() {
    }

    public static void loadBidderToken(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        wk1.a().b(context, bidderTokenLoadListener);
    }
}
