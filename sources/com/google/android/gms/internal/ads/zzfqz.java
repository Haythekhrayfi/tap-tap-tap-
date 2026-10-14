package com.google.android.gms.internal.ads;

import androidx.activity.j;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqz {
    public static int zza(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(j.a("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
