package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabg {
    public static zzbz zza(zzaax zzaaxVar, boolean z10) throws Throwable {
        zzbz zzbzVarZza = new zzabn().zza(zzaaxVar, z10 ? null : zzaem.zza);
        if (zzbzVarZza == null || zzbzVarZza.zza() == 0) {
            return null;
        }
        return zzbzVarZza;
    }

    public static zzabi zzb(zzfa zzfaVar) {
        zzfaVar.zzG(1);
        int iZzm = zzfaVar.zzm();
        long jZzc = zzfaVar.zzc();
        long j10 = iZzm;
        int i10 = iZzm / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jZzr = zzfaVar.zzr();
            if (jZzr == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZzr;
            jArrCopyOf2[i11] = zzfaVar.zzr();
            zzfaVar.zzG(2);
        }
        zzfaVar.zzG((int) ((jZzc + j10) - ((long) zzfaVar.zzc())));
        return new zzabi(jArrCopyOf, jArrCopyOf2);
    }
}
