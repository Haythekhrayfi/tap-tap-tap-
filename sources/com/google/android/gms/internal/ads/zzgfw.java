package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfw {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;
    private zzgfx zzc;

    private zzgfw() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    public /* synthetic */ zzgfw(zzgfv zzgfvVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgfx.zzd;
    }

    public final zzgfw zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgfw zzb(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(android.support.v4.media.a.a("Invalid tag size for AesCmacParameters: ", i10));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgfw zzc(zzgfx zzgfxVar) {
        this.zzc = zzgfxVar;
        return this;
    }

    public final zzgfz zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgfz(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
