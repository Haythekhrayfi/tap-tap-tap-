package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 {
    public static boolean a(AdPlaybackState adPlaybackState, int i10, int i11) {
        AdPlaybackState.AdGroup adGroup;
        int i12;
        return i10 < adPlaybackState.adGroupCount && (i12 = (adGroup = adPlaybackState.getAdGroup(i10)).count) != -1 && i11 < i12 && adGroup.states[i11] == 2;
    }
}
