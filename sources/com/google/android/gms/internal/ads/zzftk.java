package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftk {
    public static Object zza(@CheckForNull Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.a.a("at index ", i10));
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
