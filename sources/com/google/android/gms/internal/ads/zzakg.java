package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzakg {
    public static Pair zza(zzaax zzaaxVar) throws IOException {
        zzaaxVar.zzj();
        zzakf zzakfVarZzd = zzd(1684108385, zzaaxVar, new zzfa(8));
        ((zzaam) zzaaxVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzaaxVar.zzf()), Long.valueOf(zzakfVarZzd.zzb));
    }

    public static zzake zzb(zzaax zzaaxVar) throws IOException {
        byte[] bArr;
        zzfa zzfaVar = new zzfa(16);
        zzakf zzakfVarZzd = zzd(1718449184, zzaaxVar, zzfaVar);
        zzdy.zzf(zzakfVarZzd.zzb >= 16);
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzm(zzfaVar.zzH(), 0, 16, false);
        zzfaVar.zzF(0);
        int iZzi = zzfaVar.zzi();
        int iZzi2 = zzfaVar.zzi();
        int iZzh = zzfaVar.zzh();
        int iZzh2 = zzfaVar.zzh();
        int iZzi3 = zzfaVar.zzi();
        int iZzi4 = zzfaVar.zzi();
        int i10 = ((int) zzakfVarZzd.zzb) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            zzaamVar.zzm(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = zzfj.zzf;
        }
        ((zzaam) zzaaxVar).zzo((int) (zzaaxVar.zze() - zzaaxVar.zzf()), false);
        return new zzake(iZzi, iZzi2, iZzh, iZzh2, iZzi3, iZzi4, bArr);
    }

    public static boolean zzc(zzaax zzaaxVar) throws IOException {
        zzfa zzfaVar = new zzfa(8);
        int i10 = zzakf.zza(zzaaxVar, zzfaVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((zzaam) zzaaxVar).zzm(zzfaVar.zzH(), 0, 4, false);
        zzfaVar.zzF(0);
        int iZze = zzfaVar.zze();
        if (iZze == 1463899717) {
            return true;
        }
        zzer.zzc("WavHeaderReader", "Unsupported form type: " + iZze);
        return false;
    }

    private static zzakf zzd(int i10, zzaax zzaaxVar, zzfa zzfaVar) throws IOException {
        while (true) {
            zzakf zzakfVarZza = zzakf.zza(zzaaxVar, zzfaVar);
            int i11 = zzakfVarZza.zza;
            if (i11 == i10) {
                return zzakfVarZza;
            }
            zzer.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = zzakfVarZza.zzb + 8;
            if (j10 > 2147483647L) {
                throw zzcd.zzc("Chunk is too large (~2GB+) to skip; id: " + zzakfVarZza.zza);
            }
            ((zzaam) zzaaxVar).zzo((int) j10, false);
        }
    }
}
