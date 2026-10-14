package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqw {
    public static final boolean zza;

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    static {
        boolean z10 = true;
        if ("Amazon".equals(zzfj.zzc)) {
            String str = zzfj.zzd;
            if (!"AFTM".equals(str) && !"AFTB".equals(str)) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        zza = z10;
    }
}
