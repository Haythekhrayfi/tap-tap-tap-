package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class jp {
    public static File a(Context context, String str) {
        File cacheDir;
        try {
            if (!bv.a() || (cacheDir = context.getExternalCacheDir()) == null || !cacheDir.canWrite()) {
                cacheDir = null;
            }
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
        }
        if (cacheDir == null) {
            cacheDir = context.getCacheDir();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cacheDir.getPath());
        return new File(androidx.activity.k.a(sb2, File.separator, str));
    }
}
