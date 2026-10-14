package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.MediaFile;

/* JADX INFO: loaded from: classes3.dex */
public final class l50 implements MediaFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InstreamAdBreakPosition f22622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22625d;

    public l50(InstreamAdBreakPosition instreamAdBreakPosition, String str, int i10, int i11) {
        this.f22622a = instreamAdBreakPosition;
        this.f22623b = str;
        this.f22624c = i10;
        this.f22625d = i11;
    }

    public final InstreamAdBreakPosition a() {
        return this.f22622a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f22625d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f22624c;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.fd1
    public final String getUrl() {
        return this.f22623b;
    }
}
