package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.b.h0;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes2.dex */
final class zzaka implements zzakb {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzaaz zzc;
    private final zzabz zzd;
    private final zzake zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfa zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaka(zzaaz zzaazVar, zzabz zzabzVar, zzake zzakeVar) throws zzcd {
        this.zzc = zzaazVar;
        this.zzd = zzabzVar;
        this.zze = zzakeVar;
        int iMax = Math.max(1, zzakeVar.zzc / 10);
        this.zzi = iMax;
        zzfa zzfaVar = new zzfa(zzakeVar.zzf);
        zzfaVar.zzi();
        int iZzi = zzfaVar.zzi();
        this.zzf = iZzi;
        int i10 = zzakeVar.zzb;
        int i11 = zzakeVar.zzd;
        int iA = h0.a(i11 - (i10 * 4), 8, zzakeVar.zze * i10, 1);
        if (iZzi != iA) {
            throw zzcd.zza("Expected frames per block: " + iA + "; got: " + iZzi, null);
        }
        int i12 = zzfj.zza;
        int i13 = ((iMax + iZzi) - 1) / iZzi;
        this.zzg = new byte[i11 * i13];
        this.zzh = new zzfa((iZzi + iZzi) * i10 * i13);
        int i14 = ((zzakeVar.zzc * zzakeVar.zzd) * 8) / iZzi;
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/raw");
        zzakVar.zzv(i14);
        zzakVar.zzO(i14);
        zzakVar.zzL((iMax + iMax) * i10);
        zzakVar.zzw(zzakeVar.zzb);
        zzakVar.zzT(zzakeVar.zzc);
        zzakVar.zzN(2);
        this.zzj = zzakVar.zzY();
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long jZzp = this.zzl + zzfj.zzp(this.zzn, 1000000L, this.zze.zzc);
        int iZze = zze(i10);
        this.zzd.zzs(jZzp, 1, iZze, this.zzm - iZze, null);
        this.zzn += (long) i10;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zza(int i10, long j10) {
        this.zzc.zzN(new zzakh(this.zze, this.zzf, i10, j10));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[LOOP:0: B:6:0x0023->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzakb
    public final boolean zzc(com.google.android.gms.internal.ads.zzaax r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaka.zzc(com.google.android.gms.internal.ads.zzaax, long):boolean");
    }
}
