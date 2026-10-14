package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* JADX INFO: loaded from: classes.dex */
final class h {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
