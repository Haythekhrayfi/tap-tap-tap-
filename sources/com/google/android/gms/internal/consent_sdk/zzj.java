package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends Exception {
    private final int zza;

    public zzj(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzj(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = i10;
    }

    public final FormError zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new FormError(this.zza, getMessage());
    }
}
