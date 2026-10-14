package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzd extends zzgdt {
    public final /* synthetic */ zzfze zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzd(zzfze zzfzeVar, Class cls) {
        super(cls);
        this.zza = zzfzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgik zzgikVar = (zzgik) zzgqwVar;
        new zzfzs();
        zzgin zzginVarZzf = zzfzr.zzf(zzgikVar.zze());
        zzgqw zzgqwVarZza = new zzggq().zza().zza(zzgikVar.zzf());
        zzgig zzgigVarZzc = zzgih.zzc();
        zzgigVarZzc.zza(zzginVarZzf);
        zzgigVarZzc.zzb((zzgjz) zzgqwVarZza);
        zzgigVarZzc.zzc(0);
        return (zzgih) zzgigVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgik.zzd(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzfze.zzg(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzfze.zzg(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", zzfze.zzg(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzfze.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgik zzgikVar = (zzgik) zzgqwVar;
        ((zzfzr) new zzfzs().zza()).zzd(zzgikVar.zze());
        new zzggq().zza().zzd(zzgikVar.zzf());
        zzgni.zza(zzgikVar.zze().zza());
    }
}
