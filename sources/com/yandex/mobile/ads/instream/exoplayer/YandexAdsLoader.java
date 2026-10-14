package com.yandex.mobile.ads.instream.exoplayer;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.yandex.mobile.ads.impl.f7;
import com.yandex.mobile.ads.impl.t40;
import com.yandex.mobile.ads.impl.x60;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class YandexAdsLoader implements AdsLoader {
    public static final String AD_TAG_URI = "yandex://ad_tag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t40 f27497a;

    public YandexAdsLoader(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f27497a = new f7(context, instreamAdRequestConfiguration).a();
    }

    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i10, int i11) {
        this.f27497a.a(i10, i11);
    }

    public void handlePrepareError(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException) {
        this.f27497a.a(i10, i11, iOException);
    }

    public void release() {
        this.f27497a.a();
    }

    public void requestAds(ViewGroup viewGroup) {
        this.f27497a.a(viewGroup, Collections.emptyList());
    }

    public void setPlayer(Player player) {
        this.f27497a.a(player);
    }

    public void setSupportedContentTypes(int... iArr) {
    }

    public void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f27497a.a(videoAdPlaybackListener);
    }

    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        if (eventListener != null) {
            this.f27497a.a(eventListener, adViewProvider, obj);
        } else {
            x60.c("Start called with null eventListener", new Object[0]);
        }
    }

    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        this.f27497a.b();
    }
}
