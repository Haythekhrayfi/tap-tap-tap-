package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggs {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;
    private zzggt zzc;
    private zzggu zzd;

    private zzggs() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzggs(zzggr zzggrVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzggu.zzd;
    }

    public final zzggs zza(zzggt zzggtVar) {
        this.zzc = zzggtVar;
        return this;
    }

    public final zzggs zzb(int i10) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzggs zzc(int i10) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzggs zzd(zzggu zzgguVar) {
        this.zzd = zzgguVar;
        return this;
    }

    public final zzggw zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        int iIntValue = this.zzb.intValue();
        zzggt zzggtVar = this.zzc;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
        }
        if (zzggtVar == zzggt.zza) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (zzggtVar == zzggt.zzb) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (zzggtVar == zzggt.zzc) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (zzggtVar == zzggt.zzd) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (zzggtVar != zzggt.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new zzggw(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
