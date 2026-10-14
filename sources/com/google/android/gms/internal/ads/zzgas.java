package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgas {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;

    @Nullable
    private Integer zzc;
    private zzgat zzd;

    private zzgas() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzgas(zzgar zzgarVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgat.zzc;
    }

    public final zzgas zza(int i10) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgas zzb(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgas zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgas zzd(zzgat zzgatVar) {
        this.zzd = zzgatVar;
        return this;
    }

    public final zzgav zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzgav(iIntValue, 12, 16, this.zzd, null);
    }
}
