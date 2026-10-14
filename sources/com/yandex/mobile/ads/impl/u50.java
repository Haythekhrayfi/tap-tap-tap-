package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class u50 implements VideoAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaFile f25555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdPodInfo f25556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SkipInfo f25557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f25559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25561g;

    public u50(String str, l50 l50Var, rd1 rd1Var, p50 p50Var, String str2, JSONObject jSONObject, long j10) {
        this.f25561g = str;
        this.f25557c = p50Var;
        this.f25555a = l50Var;
        this.f25556b = rd1Var;
        this.f25558d = str2;
        this.f25559e = jSONObject;
        this.f25560f = j10;
    }

    public final JSONObject a() {
        return this.f25559e;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final AdPodInfo getAdPodInfo() {
        return this.f25556b;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final long getDuration() {
        return this.f25560f;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final String getInfo() {
        return this.f25558d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final MediaFile getMediaFile() {
        return this.f25555a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final SkipInfo getSkipInfo() {
        return this.f25557c;
    }

    public final String toString() {
        return this.f25561g;
    }
}
