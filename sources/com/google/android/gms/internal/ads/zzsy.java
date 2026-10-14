package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsy implements zzvh {
    public final zzvh[] zza;

    public zzsy(zzvh[] zzvhVarArr) {
        this.zza = zzvhVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (zzvh zzvhVar : this.zza) {
            long jZzb = zzvhVar.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == RecyclerView.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (zzvh zzvhVar : this.zza) {
            long jZzc = zzvhVar.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == RecyclerView.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzm(long j10) {
        for (zzvh zzvhVar : this.zza) {
            zzvhVar.zzm(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final boolean zzo(long j10) {
        boolean zZzo;
        boolean z10 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (zzvh zzvhVar : this.zza) {
                long jZzc2 = zzvhVar.zzc();
                boolean z11 = jZzc2 != Long.MIN_VALUE && jZzc2 <= j10;
                if (jZzc2 == jZzc || z11) {
                    zZzo |= zzvhVar.zzo(j10);
                }
            }
            z10 |= zZzo;
        } while (zZzo);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final boolean zzp() {
        for (zzvh zzvhVar : this.zza) {
            if (zzvhVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
