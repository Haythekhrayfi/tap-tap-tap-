package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdy {
    @Pure
    public static int zza(int i10, int i11, int i12) {
        if (i10 < 0 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static Object zzb(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @Pure
    public static void zzd(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    @Pure
    public static void zzf(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }
}
