package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgap extends zzgdt {
    public final /* synthetic */ zzgaq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgap(zzgaq zzgaqVar, Class cls) {
        super(cls);
        this.zza = zzgaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgje zzgjeVarZzc = zzgjf.zzc();
        byte[] bArrZza = zzgng.zza(((zzgji) zzgqwVar).zza());
        zzgjeVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        zzgjeVarZzc.zzb(0);
        return (zzgjf) zzgjeVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgji.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgaq.zzg(16, 1));
        map.put("AES128_GCM_RAW", zzgaq.zzg(16, 3));
        map.put("AES256_GCM", zzgaq.zzg(32, 1));
        map.put("AES256_GCM_RAW", zzgaq.zzg(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgni.zza(((zzgji) zzgqwVar).zza());
    }
}
