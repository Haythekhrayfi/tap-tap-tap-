package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgck extends zzfyt {
    private final zzgcp zza;
    private final zzgnl zzb;
    private final zzgnk zzc;

    @Nullable
    private final Integer zzd;

    private zzgck(zzgcp zzgcpVar, zzgnl zzgnlVar, zzgnk zzgnkVar, @Nullable Integer num) {
        this.zza = zzgcpVar;
        this.zzb = zzgnlVar;
        this.zzc = zzgnkVar;
        this.zzd = num;
    }

    public static zzgck zza(zzgco zzgcoVar, zzgnl zzgnlVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgnk zzgnkVarZzb;
        zzgco zzgcoVar2 = zzgco.zzc;
        if (zzgcoVar != zzgcoVar2 && num == null) {
            throw new GeneralSecurityException(j.a("For given Variant ", zzgcoVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgcoVar == zzgcoVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgnlVar.zza() != 32) {
            throw new GeneralSecurityException(android.support.v4.media.a.a("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgnlVar.zza()));
        }
        zzgcp zzgcpVarZzb = zzgcp.zzb(zzgcoVar);
        if (zzgcpVarZzb.zza() == zzgcoVar2) {
            zzgnkVarZzb = zzgnk.zzb(new byte[0]);
        } else if (zzgcpVarZzb.zza() == zzgco.zzb) {
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzgcpVarZzb.zza() != zzgco.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgcpVarZzb.zza().toString()));
            }
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzgck(zzgcpVarZzb, zzgnlVar, zzgnkVarZzb, num);
    }
}
