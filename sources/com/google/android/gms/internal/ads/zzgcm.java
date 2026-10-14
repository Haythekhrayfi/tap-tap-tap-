package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcm extends zzgdt {
    public final /* synthetic */ zzgcn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcm(zzgcn zzgcnVar, Class cls) {
        super(cls);
        this.zza = zzgcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzglv zzglvVarZzc = zzglw.zzc();
        zzglvVarZzc.zzb(0);
        byte[] bArrZza = zzgng.zza(32);
        zzglvVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        return (zzglw) zzglvVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzglz.zzd(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", new zzgds(zzglz.zzc(), 1));
        map.put("XCHACHA20_POLY1305_RAW", new zzgds(zzglz.zzc(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
    }
}
