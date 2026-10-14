package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgdn {
    private final zzgnk zza;
    private final Class zzb;

    public /* synthetic */ zzgdn(zzgnk zzgnkVar, Class cls, zzgdm zzgdmVar) {
        this.zza = zzgnkVar;
        this.zzb = cls;
    }

    public static zzgdn zzb(zzgdl zzgdlVar, zzgnk zzgnkVar, Class cls) {
        return new zzgdk(zzgnkVar, cls, zzgdlVar);
    }

    public abstract zzfxn zza(zzgfd zzgfdVar, @Nullable zzfyq zzfyqVar) throws GeneralSecurityException;

    public final zzgnk zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
