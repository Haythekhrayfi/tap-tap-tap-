package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfid {
    public static void zza(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zzb(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
