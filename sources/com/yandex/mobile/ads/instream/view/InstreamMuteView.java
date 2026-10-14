package com.yandex.mobile.ads.instream.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ii1;
import com.yandex.mobile.ads.impl.jh0;

/* JADX INFO: loaded from: classes3.dex */
public class InstreamMuteView extends ImageView implements jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii1 f27506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27507b;

    public InstreamMuteView(Context context) {
        this(context, null);
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27506a = a(context, attributeSet);
        a();
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f27506a = a(context, attributeSet);
        a();
    }

    @SuppressLint({"CustomViewStyleable"})
    private static ii1 a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.YandexAdsInternalInstreamMuteView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.YandexAdsInternalInstreamMuteView_yandex_sound_on, R.drawable.yandex_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.YandexAdsInternalInstreamMuteView_yandex_sound_off, R.drawable.yandex_ads_internal_ic_sound_off_default);
        typedArrayObtainStyledAttributes.recycle();
        return new ii1(resourceId2, resourceId);
    }

    private void a() {
        setMuted(this.f27507b);
    }

    @Override // com.yandex.mobile.ads.impl.jh0
    public void setMuted(boolean z10) {
        this.f27507b = z10;
        this.f27506a.a(this, z10);
    }
}
