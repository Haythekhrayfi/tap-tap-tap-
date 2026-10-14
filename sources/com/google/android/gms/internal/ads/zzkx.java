package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzkx implements zzty, zzqp {
    public final /* synthetic */ zzlb zza;
    private final zzkz zzb;

    public zzkx(zzlb zzlbVar, zzkz zzkzVar) {
        this.zza = zzlbVar;
        this.zzb = zzkzVar;
    }

    private final Pair zzf(int i10, zzto zztoVar) {
        zzto zztoVarZzc;
        zzto zztoVar2 = null;
        if (zztoVar != null) {
            zzkz zzkzVar = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 >= zzkzVar.zzc.size()) {
                    zztoVarZzc = null;
                    break;
                }
                if (((zzto) zzkzVar.zzc.get(i11)).zzd == zztoVar.zzd) {
                    zztoVarZzc = zztoVar.zzc(Pair.create(zzkzVar.zzb, zztoVar.zza));
                    break;
                }
                i11++;
            }
            if (zztoVarZzc == null) {
                return null;
            }
            zztoVar2 = zztoVarZzc;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzac(int i10, zzto zztoVar, final zztk zztkVar) {
        final Pair pairZzf = zzf(0, zztoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final void run() {
                    zzkx zzkxVar = this.zza;
                    Pair pair = pairZzf;
                    zzkxVar.zza.zzh.zzac(((Integer) pair.first).intValue(), (zzto) pair.second, zztkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzad(int i10, zzto zztoVar, final zztf zztfVar, final zztk zztkVar) {
        final Pair pairZzf = zzf(0, zztoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final void run() {
                    zzkx zzkxVar = this.zza;
                    Pair pair = pairZzf;
                    zzkxVar.zza.zzh.zzad(((Integer) pair.first).intValue(), (zzto) pair.second, zztfVar, zztkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzae(int i10, zzto zztoVar, final zztf zztfVar, final zztk zztkVar) {
        final Pair pairZzf = zzf(0, zztoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // java.lang.Runnable
                public final void run() {
                    zzkx zzkxVar = this.zza;
                    Pair pair = pairZzf;
                    zzkxVar.zza.zzh.zzae(((Integer) pair.first).intValue(), (zzto) pair.second, zztfVar, zztkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzaf(int i10, zzto zztoVar, final zztf zztfVar, final zztk zztkVar, final IOException iOException, final boolean z10) {
        final Pair pairZzf = zzf(0, zztoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final void run() {
                    zzkx zzkxVar = this.zza;
                    Pair pair = pairZzf;
                    zzkxVar.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzto) pair.second, zztfVar, zztkVar, iOException, z10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzag(int i10, zzto zztoVar, final zztf zztfVar, final zztk zztkVar) {
        final Pair pairZzf = zzf(0, zztoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    zzkx zzkxVar = this.zza;
                    Pair pair = pairZzf;
                    zzkxVar.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzto) pair.second, zztfVar, zztkVar);
                }
            });
        }
    }
}
