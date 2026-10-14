package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1 f20059a;

    public e4(ue1 ue1Var) {
        this.f20059a = new z1(ue1Var);
    }

    public final AdPlaybackState a(InstreamAd instreamAd, Object obj) {
        List<? extends InstreamAdBreak> adBreaks = instreamAd.getAdBreaks();
        if (adBreaks.isEmpty()) {
            return AdPlaybackState.NONE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends InstreamAdBreak> it = adBreaks.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            long jA = this.f20059a.a(it.next().getAdBreakPosition());
            if (jA == Long.MIN_VALUE) {
                i10 = 1;
            } else if (jA != -1) {
                arrayList.add(Long.valueOf(Util.msToUs(jA)));
            }
        }
        int size = arrayList.size() + i10;
        long[] jArr = new long[size];
        if (i10 != 0) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        return new AdPlaybackState(obj, jArr);
    }
}
