package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgab {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;

    @Nullable
    private Integer zzc;
    private zzgac zzd;

    private zzgab() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzgab(zzgaa zzgaaVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgac.zzc;
    }

    public final zzgab zza(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgab zzb(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgab zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgab zzd(zzgac zzgacVar) {
        this.zzd = zzgacVar;
        return this;
    }

    public final zzgae zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.intValue();
        return new zzgae(iIntValue, iIntValue2, 16, this.zzd, null);
    }
}
