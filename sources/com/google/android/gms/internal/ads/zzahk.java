package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
final class zzahk extends zzahu {
    private zzabj zza;
    private zzahj zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zza(zzfa zzfaVar) {
        if (!zzd(zzfaVar.zzH())) {
            return -1L;
        }
        int i10 = (zzfaVar.zzH()[2] & 255) >> 4;
        if (i10 == 6) {
            zzfaVar.zzG(4);
            zzfaVar.zzu();
        } else if (i10 == 7) {
            i10 = 7;
            zzfaVar.zzG(4);
            zzfaVar.zzu();
        }
        int iZza = zzabf.zza(zzfaVar, i10);
        zzfaVar.zzF(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzfa zzfaVar, long j10, zzahr zzahrVar) {
        byte[] bArrZzH = zzfaVar.zzH();
        zzabj zzabjVar = this.zza;
        if (zzabjVar == null) {
            zzabj zzabjVar2 = new zzabj(bArrZzH, 17);
            this.zza = zzabjVar2;
            zzahrVar.zza = zzabjVar2.zzc(Arrays.copyOfRange(bArrZzH, 9, zzfaVar.zzd()), null);
            return true;
        }
        if ((bArrZzH[0] & Ascii.DEL) == 3) {
            zzabi zzabiVarZzb = zzabg.zzb(zzfaVar);
            zzabj zzabjVarZzf = zzabjVar.zzf(zzabiVarZzb);
            this.zza = zzabjVarZzf;
            this.zzb = new zzahj(zzabjVarZzf, zzabiVarZzb);
            return true;
        }
        if (!zzd(bArrZzH)) {
            return true;
        }
        zzahj zzahjVar = this.zzb;
        if (zzahjVar != null) {
            zzahjVar.zza(j10);
            zzahrVar.zzb = this.zzb;
        }
        Objects.requireNonNull(zzahrVar.zza);
        return false;
    }
}
