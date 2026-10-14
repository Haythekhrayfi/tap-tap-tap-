package com.google.android.gms.internal.ads;

import androidx.activity.k;
import j1.d;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaak implements zzabv {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaak(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
        }
    }

    public final String toString() {
        int i10 = this.zza;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(this.zzc);
        String string3 = Arrays.toString(this.zze);
        String string4 = Arrays.toString(this.zzd);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(string);
        sb2.append(", offsets=");
        d.a(sb2, string2, ", timeUs=", string3, ", durationsUs=");
        return k.a(sb2, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        int iZzc = zzfj.zzc(this.zze, j10, true, true);
        zzabw zzabwVar = new zzabw(this.zze[iZzc], this.zzc[iZzc]);
        if (zzabwVar.zzb >= j10 || iZzc == this.zza - 1) {
            return new zzabt(zzabwVar, zzabwVar);
        }
        int i10 = iZzc + 1;
        return new zzabt(zzabwVar, new zzabw(this.zze[i10], this.zzc[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
