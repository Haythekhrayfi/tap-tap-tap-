package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbs extends zzfyt {
    private final zzgbx zza;
    private final zzgnl zzb;
    private final zzgnk zzc;

    @Nullable
    private final Integer zzd;

    private zzgbs(zzgbx zzgbxVar, zzgnl zzgnlVar, zzgnk zzgnkVar, @Nullable Integer num) {
        this.zza = zzgbxVar;
        this.zzb = zzgnlVar;
        this.zzc = zzgnkVar;
        this.zzd = num;
    }

    public static zzgbs zza(zzgbw zzgbwVar, zzgnl zzgnlVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgnk zzgnkVarZzb;
        zzgbw zzgbwVar2 = zzgbw.zzc;
        if (zzgbwVar != zzgbwVar2 && num == null) {
            throw new GeneralSecurityException(j.a("For given Variant ", zzgbwVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgbwVar == zzgbwVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgnlVar.zza() != 32) {
            throw new GeneralSecurityException(android.support.v4.media.a.a("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgnlVar.zza()));
        }
        zzgbx zzgbxVarZzb = zzgbx.zzb(zzgbwVar);
        if (zzgbxVarZzb.zza() == zzgbwVar2) {
            zzgnkVarZzb = zzgnk.zzb(new byte[0]);
        } else if (zzgbxVarZzb.zza() == zzgbw.zzb) {
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzgbxVarZzb.zza() != zzgbw.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgbxVarZzb.zza().toString()));
            }
            zzgnkVarZzb = zzgnk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzgbs(zzgbxVarZzb, zzgnlVar, zzgnkVarZzb, num);
    }
}
