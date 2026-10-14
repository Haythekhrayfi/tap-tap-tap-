package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbg extends zzgdt {
    public final /* synthetic */ zzgbh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbg(zzgbh zzgbhVar, Class cls) {
        super(cls);
        this.zza = zzgbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgjk zzgjkVarZzc = zzgjl.zzc();
        byte[] bArrZza = zzgng.zza(((zzgjo) zzgqwVar).zza());
        zzgjkVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        zzgjkVarZzc.zzb(0);
        return (zzgjl) zzgjkVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgjo.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", zzgbh.zzh(16, 1));
        map.put("AES128_GCM_SIV_RAW", zzgbh.zzh(16, 3));
        map.put("AES256_GCM_SIV", zzgbh.zzh(32, 1));
        map.put("AES256_GCM_SIV_RAW", zzgbh.zzh(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgni.zza(((zzgjo) zzgqwVar).zza());
    }
}
