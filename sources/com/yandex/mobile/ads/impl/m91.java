package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: classes3.dex */
final class m91 {
    public static AdPlaybackState a(AdPlaybackState adPlaybackState, long j10) {
        AdPlaybackState adPlaybackStateWithContentDurationUs = adPlaybackState.withContentDurationUs(j10);
        for (int i10 = 0; i10 < adPlaybackStateWithContentDurationUs.adGroupCount; i10++) {
            if (adPlaybackStateWithContentDurationUs.getAdGroup(i10).timeUs > j10) {
                adPlaybackStateWithContentDurationUs = adPlaybackStateWithContentDurationUs.withSkippedAdGroup(i10);
            }
        }
        return adPlaybackStateWithContentDurationUs;
    }
}
