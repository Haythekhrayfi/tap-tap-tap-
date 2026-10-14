package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zztx {
    public final int zza;
    public final zzto zzb;
    private final CopyOnWriteArrayList zzc;

    public zztx() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zztx(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzto zztoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztoVar;
    }

    public final zztx zza(int i10, zzto zztoVar) {
        return new zztx(this.zzc, 0, zztoVar);
    }

    public final void zzb(Handler handler, zzty zztyVar) {
        this.zzc.add(new zztw(handler, zztyVar));
    }

    public final void zzc(final zztk zztkVar) {
        for (zztw zztwVar : this.zzc) {
            final zzty zztyVar = zztwVar.zzb;
            zzfj.zzF(zztwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztr
                @Override // java.lang.Runnable
                public final void run() {
                    zztx zztxVar = this.zza;
                    zztyVar.zzac(0, zztxVar.zzb, zztkVar);
                }
            });
        }
    }

    public final void zzd(final zztf zztfVar, final zztk zztkVar) {
        for (zztw zztwVar : this.zzc) {
            final zzty zztyVar = zztwVar.zzb;
            zzfj.zzF(zztwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzts
                @Override // java.lang.Runnable
                public final void run() {
                    zztx zztxVar = this.zza;
                    zztyVar.zzad(0, zztxVar.zzb, zztfVar, zztkVar);
                }
            });
        }
    }

    public final void zze(final zztf zztfVar, final zztk zztkVar) {
        for (zztw zztwVar : this.zzc) {
            final zzty zztyVar = zztwVar.zzb;
            zzfj.zzF(zztwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztv
                @Override // java.lang.Runnable
                public final void run() {
                    zztx zztxVar = this.zza;
                    zztyVar.zzae(0, zztxVar.zzb, zztfVar, zztkVar);
                }
            });
        }
    }

    public final void zzf(final zztf zztfVar, final zztk zztkVar, final IOException iOException, final boolean z10) {
        for (zztw zztwVar : this.zzc) {
            final zzty zztyVar = zztwVar.zzb;
            zzfj.zzF(zztwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztt
                @Override // java.lang.Runnable
                public final void run() {
                    zztx zztxVar = this.zza;
                    zztyVar.zzaf(0, zztxVar.zzb, zztfVar, zztkVar, iOException, z10);
                }
            });
        }
    }

    public final void zzg(final zztf zztfVar, final zztk zztkVar) {
        for (zztw zztwVar : this.zzc) {
            final zzty zztyVar = zztwVar.zzb;
            zzfj.zzF(zztwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztu
                @Override // java.lang.Runnable
                public final void run() {
                    zztx zztxVar = this.zza;
                    zztyVar.zzag(0, zztxVar.zzb, zztfVar, zztkVar);
                }
            });
        }
    }

    public final void zzh(zzty zztyVar) {
        for (zztw zztwVar : this.zzc) {
            if (zztwVar.zzb == zztyVar) {
                this.zzc.remove(zztwVar);
            }
        }
    }
}
