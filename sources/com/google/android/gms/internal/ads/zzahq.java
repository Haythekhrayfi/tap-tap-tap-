package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
final class zzahq extends zzahu {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfa zzfaVar) {
        return zzk(zzfaVar, zza);
    }

    private static boolean zzk(zzfa zzfaVar, byte[] bArr) {
        if (zzfaVar.zza() < 8) {
            return false;
        }
        int iZzc = zzfaVar.zzc();
        byte[] bArr2 = new byte[8];
        zzfaVar.zzB(bArr2, 0, 8);
        zzfaVar.zzF(iZzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zza(zzfa zzfaVar) {
        return zzg(zzabr.zzc(zzfaVar.zzH()));
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzfa zzfaVar, long j10, zzahr zzahrVar) throws zzcd {
        zzam zzamVarZzY;
        if (zzk(zzfaVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfaVar.zzH(), zzfaVar.zzd());
            int i10 = bArrCopyOf[9] & 255;
            List listZzd = zzabr.zzd(bArrCopyOf);
            if (zzahrVar.zza != null) {
                return true;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/opus");
            zzakVar.zzw(i10);
            zzakVar.zzT(48000);
            zzakVar.zzI(listZzd);
            zzamVarZzY = zzakVar.zzY();
        } else {
            if (!zzk(zzfaVar, zzb)) {
                zzdy.zzb(zzahrVar.zza);
                return false;
            }
            zzdy.zzb(zzahrVar.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzfaVar.zzG(8);
            zzbz zzbzVarZzb = zzacf.zzb(zzfsc.zzk(zzacf.zzc(zzfaVar, false, false).zzb));
            if (zzbzVarZzb == null) {
                return true;
            }
            zzak zzakVarZzb = zzahrVar.zza.zzb();
            zzakVarZzb.zzM(zzbzVarZzb.zzd(zzahrVar.zza.zzk));
            zzamVarZzY = zzakVarZzb.zzY();
        }
        zzahrVar.zza = zzamVarZzY;
        return true;
    }
}
