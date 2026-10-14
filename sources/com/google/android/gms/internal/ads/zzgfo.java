package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfo {

    @Nullable
    private zzgfz zza = null;

    @Nullable
    private zzgnl zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgfo() {
    }

    public /* synthetic */ zzgfo(zzgfn zzgfnVar) {
    }

    public final zzgfo zza(zzgnl zzgnlVar) throws GeneralSecurityException {
        this.zzb = zzgnlVar;
        return this;
    }

    public final zzgfo zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfo zzc(zzgfz zzgfzVar) {
        this.zza = zzgfzVar;
        return this;
    }

    public final zzgfq zzd() throws GeneralSecurityException {
        zzgnl zzgnlVar;
        zzgnk zzgnkVarZzb;
        zzgfz zzgfzVar = this.zza;
        if (zzgfzVar == null || (zzgnlVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfzVar.zzb() != zzgnlVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgfzVar.zze() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zze() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgfx.zzd) {
            zzgnkVarZzb = zzgnk.zzb(new byte[0]);
        } else if (this.zza.zzd() == zzgfx.zzc || this.zza.zzd() == zzgfx.zzb) {
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzd() != zzgfx.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgfq(this.zza, this.zzb, zzgnkVarZzb, this.zzc, null);
    }
}
