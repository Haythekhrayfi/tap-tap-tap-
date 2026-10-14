package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgft extends zzgdt {
    public zzgft(zzgfu zzgfuVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgib zzgibVar = (zzgib) zzgqwVar;
        zzghx zzghxVarZzc = zzghy.zzc();
        zzghxVarZzc.zzc(0);
        byte[] bArrZza = zzgng.zza(zzgibVar.zza());
        zzghxVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        zzghxVarZzc.zzb(zzgibVar.zzf());
        return (zzghy) zzghxVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgib.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzgia zzgiaVarZzc = zzgib.zzc();
        zzgiaVarZzc.zza(32);
        zzgid zzgidVarZzc = zzgie.zzc();
        zzgidVarZzc.zza(16);
        zzgiaVarZzc.zzb((zzgie) zzgidVarZzc.zzal());
        map.put("AES_CMAC", new zzgds((zzgib) zzgiaVarZzc.zzal(), 1));
        zzgia zzgiaVarZzc2 = zzgib.zzc();
        zzgiaVarZzc2.zza(32);
        zzgid zzgidVarZzc2 = zzgie.zzc();
        zzgidVarZzc2.zza(16);
        zzgiaVarZzc2.zzb((zzgie) zzgidVarZzc2.zzal());
        map.put("AES256_CMAC", new zzgds((zzgib) zzgiaVarZzc2.zzal(), 1));
        zzgia zzgiaVarZzc3 = zzgib.zzc();
        zzgiaVarZzc3.zza(32);
        zzgid zzgidVarZzc3 = zzgie.zzc();
        zzgidVarZzc3.zza(16);
        zzgiaVarZzc3.zzb((zzgie) zzgidVarZzc3.zzal());
        map.put("AES256_CMAC_RAW", new zzgds((zzgib) zzgiaVarZzc3.zzal(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgib zzgibVar = (zzgib) zzgqwVar;
        zzgfu.zzn(zzgibVar.zzf());
        zzgfu.zzo(zzgibVar.zza());
    }
}
