package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyz {

    @Nullable
    private zzfzk zza = null;

    @Nullable
    private zzgnl zzb = null;

    @Nullable
    private zzgnl zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzfyz() {
    }

    public /* synthetic */ zzfyz(zzfyy zzfyyVar) {
    }

    public final zzfyz zza(zzgnl zzgnlVar) {
        this.zzb = zzgnlVar;
        return this;
    }

    public final zzfyz zzb(zzgnl zzgnlVar) {
        this.zzc = zzgnlVar;
        return this;
    }

    public final zzfyz zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzfyz zzd(zzfzk zzfzkVar) {
        this.zza = zzfzkVar;
        return this;
    }

    public final zzfzb zze() throws GeneralSecurityException {
        zzgnk zzgnkVarZzb;
        zzfzk zzfzkVar = this.zza;
        if (zzfzkVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgnl zzgnlVar = this.zzb;
        if (zzgnlVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzfzkVar.zza() != zzgnlVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzfzkVar.zzb() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zzg() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzg() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzfzi.zzc) {
            zzgnkVarZzb = zzgnk.zzb(new byte[0]);
        } else if (this.zza.zzf() == zzfzi.zzb) {
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
        } else {
            if (this.zza.zzf() != zzfzi.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
        }
        return new zzfzb(this.zza, this.zzb, this.zzc, zzgnkVarZzb, this.zzd, null);
    }
}
