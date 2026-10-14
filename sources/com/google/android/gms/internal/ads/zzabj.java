package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabj {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzabi zzk;
    private final zzbz zzl;

    private zzabj(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzabi zzabiVar, zzbz zzbzVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzabiVar;
        this.zzl = zzbzVar;
    }

    public zzabj(byte[] bArr, int i10) {
        zzez zzezVar = new zzez(bArr, bArr.length);
        zzezVar.zzj(i10 * 8);
        this.zza = zzezVar.zzd(16);
        this.zzb = zzezVar.zzd(16);
        this.zzc = zzezVar.zzd(24);
        this.zzd = zzezVar.zzd(24);
        int iZzd = zzezVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzezVar.zzd(3) + 1;
        int iZzd2 = zzezVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        int iZzd3 = zzezVar.zzd(4);
        int iZzd4 = zzezVar.zzd(32);
        int i11 = zzfj.zza;
        this.zzj = ((((long) iZzd3) & 4294967295L) << 32) | (((long) iZzd4) & 4294967295L);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j10) {
        return Math.max(0L, Math.min((j10 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzam zzc(byte[] bArr, zzbz zzbzVar) {
        bArr[4] = -128;
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzbz zzbzVarZzd = zzd(zzbzVar);
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/flac");
        zzakVar.zzL(i10);
        zzakVar.zzw(this.zzg);
        zzakVar.zzT(this.zze);
        zzakVar.zzI(Collections.singletonList(bArr));
        zzakVar.zzM(zzbzVarZzd);
        return zzakVar.zzY();
    }

    public final zzbz zzd(zzbz zzbzVar) {
        zzbz zzbzVar2 = this.zzl;
        return zzbzVar2 == null ? zzbzVar : zzbzVar2.zzd(zzbzVar);
    }

    public final zzabj zze(List list) {
        return new zzabj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbz(list)));
    }

    public final zzabj zzf(zzabi zzabiVar) {
        return new zzabj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzabiVar, this.zzl);
    }

    public final zzabj zzg(List list) {
        return new zzabj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzacf.zzb(list)));
    }
}
