package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class si {
    public static ri a(FrameLayout frameLayout, AdResponse adResponse, um umVar, boolean z10) {
        Long lU = adResponse.u();
        if (z10 && lU == null) {
            return new vf0(frameLayout, new w91());
        }
        return new rn(frameLayout, new lh1(), umVar, lU != null ? lU.longValue() : 0L);
    }
}
