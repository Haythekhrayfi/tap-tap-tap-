package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgdt {
    private final Class zza;

    public zzgdt(Class cls) {
        this.zza = cls;
    }

    public abstract zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException;

    public abstract zzgqw zzb(zzgoe zzgoeVar) throws zzgpy;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgqw zzgqwVar) throws GeneralSecurityException;
}
