package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ld1 {
    public static kd1 a(VideoAdPlaybackListener videoAdPlaybackListener) {
        fd.j0.i(videoAdPlaybackListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return new kd1(videoAdPlaybackListener);
    }
}
