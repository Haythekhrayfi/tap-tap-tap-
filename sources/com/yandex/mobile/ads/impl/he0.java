package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: loaded from: classes3.dex */
public final class he0 {
    public static long a(Context context, long j10) {
        long availableBlocks;
        long jMin = Math.min(j10, 52428800L);
        try {
            StatFs statFs = new StatFs(jp.a(context, "").getAbsolutePath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e10) {
            x60.a(e10, "Unable to calculate available disk space, a default used", new Object[0]);
            availableBlocks = jMin;
        }
        long j11 = (2 * availableBlocks) / 100;
        return Math.max(Math.min(j11, 52428800L), Math.min(jMin, (availableBlocks * 50) / 100));
    }
}
