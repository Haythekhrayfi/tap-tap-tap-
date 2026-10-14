package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwz {
    public final zzcy zza;
    public final int[] zzb;

    public zzwz(zzcy zzcyVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzer.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcyVar;
        this.zzb = iArr;
    }
}
