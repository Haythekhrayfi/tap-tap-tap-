package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzggp extends zzgdt {
    public final /* synthetic */ zzggq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzggp(zzggq zzggqVar, Class cls) {
        super(cls);
        this.zza = zzggqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgkc zzgkcVar = (zzgkc) zzgqwVar;
        zzgjy zzgjyVarZzc = zzgjz.zzc();
        zzgjyVarZzc.zzc(0);
        zzgjyVarZzc.zzb(zzgkcVar.zzh());
        byte[] bArrZza = zzgng.zza(zzgkcVar.zza());
        zzgjyVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        return (zzgjz) zzgjyVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgkc.zzg(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzggq.zzn(32, 16, 5, 1));
        map.put("HMAC_SHA256_128BITTAG_RAW", zzggq.zzn(32, 16, 5, 3));
        map.put("HMAC_SHA256_256BITTAG", zzggq.zzn(32, 32, 5, 1));
        map.put("HMAC_SHA256_256BITTAG_RAW", zzggq.zzn(32, 32, 5, 3));
        map.put("HMAC_SHA512_128BITTAG", zzggq.zzn(64, 16, 6, 1));
        map.put("HMAC_SHA512_128BITTAG_RAW", zzggq.zzn(64, 16, 6, 3));
        map.put("HMAC_SHA512_256BITTAG", zzggq.zzn(64, 32, 6, 1));
        map.put("HMAC_SHA512_256BITTAG_RAW", zzggq.zzn(64, 32, 6, 3));
        map.put("HMAC_SHA512_512BITTAG", zzggq.zzn(64, 64, 6, 1));
        map.put("HMAC_SHA512_512BITTAG_RAW", zzggq.zzn(64, 64, 6, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgkc zzgkcVar = (zzgkc) zzgqwVar;
        if (zzgkcVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzggq.zzo(zzgkcVar.zzh());
    }
}
