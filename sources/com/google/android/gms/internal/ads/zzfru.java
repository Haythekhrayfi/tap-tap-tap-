package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfru {
    public static int zza(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int zzb(@CheckForNull Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
