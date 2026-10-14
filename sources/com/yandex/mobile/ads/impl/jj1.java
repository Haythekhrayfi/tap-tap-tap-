package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jj1 {
    public static Pair<Long, Long> a(com.yandex.mobile.ads.exo.drm.e eVar) {
        long j10;
        Map<String, String> mapE = eVar.e();
        if (mapE == null) {
            return null;
        }
        long j11 = -9223372036854775807L;
        try {
            String str = mapE.get("LicenseDurationRemaining");
            j10 = str != null ? Long.parseLong(str) : -9223372036854775807L;
        } catch (NumberFormatException unused) {
        }
        Long lValueOf = Long.valueOf(j10);
        try {
            String str2 = mapE.get("PlaybackDurationRemaining");
            if (str2 != null) {
                j11 = Long.parseLong(str2);
            }
        } catch (NumberFormatException unused2) {
        }
        return new Pair<>(lValueOf, Long.valueOf(j11));
    }
}
