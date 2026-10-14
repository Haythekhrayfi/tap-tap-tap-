package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class AppLovinMediaView extends FrameLayout {
    public final ImageView imageView;
    public final y logger;
    public final o sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, o oVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.sdk = oVar;
        this.logger = oVar.F();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        com.applovin.impl.c.a vastAd = appLovinNativeAdImpl.getVastAd();
        Uri uriH = vastAd != null ? vastAd.h() : null;
        if (mainImageUri == null && uriH == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnClickListener(appLovinNativeAdImpl);
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gS)).booleanValue()) {
                l.a(imageView, mainImageUri, oVar);
            } else {
                imageView.setImageURI(mainImageUri);
            }
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        return (imageView == null || (drawable = imageView.getDrawable()) == null) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }
}
