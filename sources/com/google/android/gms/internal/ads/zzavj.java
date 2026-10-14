package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzavj {
    public static long zza(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        return (i10 & 1) == 0 ? zza((j10 * j10) % 1073807359, i10 >> 1) % 1073807359 : ((zza((j10 * j10) % 1073807359, i10 >> 1) % 1073807359) * j10) % 1073807359;
    }

    public static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            zzbzr.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 >= i13) {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        int i12 = 6;
        if (length < 6) {
            zzd(i10, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i10, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i13 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i13 >= length2 - 5) {
                return;
            }
            long jZza = zzavf.zza(strArr[i13 - 1]);
            long jZza2 = zzavf.zza(strArr[i13 + 5]);
            String strZzb = zzb(strArr, i13, i12);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i10, jZze, strZzb, length2, priorityQueue);
            i13++;
            i12 = 6;
        }
    }

    public static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzavi zzaviVar = new zzavi(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzavi) priorityQueue.peek()).zzc <= zzaviVar.zzc && ((zzavi) priorityQueue.peek()).zza <= zzaviVar.zza)) && !priorityQueue.contains(zzaviVar)) {
            priorityQueue.add(zzaviVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long jZza = (((long) zzavf.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jZza = (((((long) zzavf.zza(strArr[i12])) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
