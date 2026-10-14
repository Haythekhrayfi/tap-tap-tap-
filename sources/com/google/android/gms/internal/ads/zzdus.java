package com.google.android.gms.internal.ads;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdus implements zzgwe {
    public static zzdus zza() {
        return zzdur.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzgwm.zzb(string);
        return string;
    }
}
