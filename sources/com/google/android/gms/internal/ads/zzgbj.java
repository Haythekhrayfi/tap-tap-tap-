package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbj {

    @Nullable
    private Integer zza;
    private zzgbk zzb;

    private zzgbj() {
        this.zza = null;
        throw null;
    }

    public /* synthetic */ zzgbj(zzgbi zzgbiVar) {
        this.zza = null;
        this.zzb = zzgbk.zzc;
    }

    public final zzgbj zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgbj zzb(zzgbk zzgbkVar) {
        this.zzb = zzgbkVar;
        return this;
    }

    public final zzgbm zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzgbm(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
