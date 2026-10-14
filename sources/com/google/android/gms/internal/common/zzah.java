package com.google.android.gms.internal.common;

import android.support.v4.media.a;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class zzah {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(a.a("at index ", i11));
            }
        }
        return objArr;
    }
}
