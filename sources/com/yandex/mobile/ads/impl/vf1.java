package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vf1 {
    public static int a(TypedArray typedArray) {
        int i10 = typedArray.getInt(R.styleable.YandexAdsInternalMediaView_yandex_video_scale_type, -1);
        int[] iArrB = a6.b(3);
        if (i10 < 0 || i10 >= iArrB.length) {
            return 0;
        }
        return iArrB[i10];
    }
}
