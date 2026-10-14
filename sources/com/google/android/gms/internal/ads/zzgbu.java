package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbu extends zzgdt {
    public final /* synthetic */ zzgbv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbu(zzgbv zzgbvVar, Class cls) {
        super(cls);
        this.zza = zzgbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgjq zzgjqVarZzc = zzgjr.zzc();
        zzgjqVarZzc.zzb(0);
        byte[] bArrZza = zzgng.zza(32);
        zzgjqVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        return (zzgjr) zzgjqVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgju.zzd(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new zzgds(zzgju.zzc(), 1));
        map.put("CHACHA20_POLY1305_RAW", new zzgds(zzgju.zzc(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
    }
}
