package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzy extends zzgdt {
    public final /* synthetic */ zzfzz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzy(zzfzz zzfzzVar, Class cls) {
        super(cls);
        this.zza = zzfzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgiz zzgizVar = (zzgiz) zzgqwVar;
        zzgiv zzgivVarZzc = zzgiw.zzc();
        byte[] bArrZza = zzgng.zza(zzgizVar.zza());
        zzgivVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        zzgivVarZzc.zzb(zzgizVar.zzf());
        zzgivVarZzc.zzc(0);
        return (zzgiw) zzgivVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgiz.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzfzz.zzg(16, 16, 1));
        map.put("AES128_EAX_RAW", zzfzz.zzg(16, 16, 3));
        map.put("AES256_EAX", zzfzz.zzg(32, 16, 1));
        map.put("AES256_EAX_RAW", zzfzz.zzg(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgiz zzgizVar = (zzgiz) zzgqwVar;
        zzgni.zza(zzgizVar.zza());
        if (zzgizVar.zzf().zza() != 12 && zzgizVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
