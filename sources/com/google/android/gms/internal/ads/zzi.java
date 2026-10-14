package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi {
    public final AudioAttributes zza;

    public /* synthetic */ zzi(zzk zzkVar, zzh zzhVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = zzfj.zza;
        if (i10 >= 29) {
            zzf.zza(usage, 1);
        }
        if (i10 >= 32) {
            zzg.zza(usage, 0);
        }
        this.zza = usage.build();
    }
}
