package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggk {

    @Nullable
    private zzggw zza = null;

    @Nullable
    private zzgnl zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzggk() {
    }

    public /* synthetic */ zzggk(zzggj zzggjVar) {
    }

    public final zzggk zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggk zzb(zzgnl zzgnlVar) {
        this.zzb = zzgnlVar;
        return this;
    }

    public final zzggk zzc(zzggw zzggwVar) {
        this.zza = zzggwVar;
        return this;
    }

    public final zzggm zzd() throws GeneralSecurityException {
        zzgnl zzgnlVar;
        zzgnk zzgnkVarZzb;
        zzggw zzggwVar = this.zza;
        if (zzggwVar == null || (zzgnlVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggwVar.zzb() != zzgnlVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzggwVar.zzf() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzf() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzggu.zzd) {
            zzgnkVarZzb = zzgnk.zzb(new byte[0]);
        } else if (this.zza.zze() == zzggu.zzc || this.zza.zze() == zzggu.zzb) {
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zze() != zzggu.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzggm(this.zza, this.zzb, zzgnkVarZzb, this.zzc, null);
    }
}
