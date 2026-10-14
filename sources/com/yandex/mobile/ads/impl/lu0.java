package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RatingBar;
import com.yandex.mobile.ads.nativeads.Rating;

/* JADX INFO: loaded from: classes3.dex */
public class lu0 extends RatingBar implements Rating {
    public lu0(Context context) {
        super(context);
    }

    public lu0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public lu0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.nativeads.Rating
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.nativeads.Rating
    public void setRating(float f10) {
        super.setRating(f10);
    }
}
