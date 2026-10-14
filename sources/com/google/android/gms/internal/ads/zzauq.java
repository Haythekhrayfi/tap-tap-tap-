package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzauq {
    public int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzaup zza(boolean z10) {
        synchronized (this.zzb) {
            zzaup zzaupVar = null;
            if (this.zzc.isEmpty()) {
                zzbzr.zze("Queue empty");
                return null;
            }
            int i10 = 0;
            if (this.zzc.size() < 2) {
                zzaup zzaupVar2 = (zzaup) this.zzc.get(0);
                if (z10) {
                    this.zzc.remove(0);
                } else {
                    zzaupVar2.zzi();
                }
                return zzaupVar2;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = 0;
            for (zzaup zzaupVar3 : this.zzc) {
                int iZzb = zzaupVar3.zzb();
                if (iZzb > i11) {
                    i10 = i12;
                }
                int i13 = iZzb > i11 ? iZzb : i11;
                if (iZzb > i11) {
                    zzaupVar = zzaupVar3;
                }
                i12++;
                i11 = i13;
            }
            this.zzc.remove(i10);
            return zzaupVar;
        }
    }

    public final void zzb(zzaup zzaupVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                zzbzr.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i10 = this.zza;
            this.zza = i10 + 1;
            zzaupVar.zzj(i10);
            zzaupVar.zzn();
            this.zzc.add(zzaupVar);
        }
    }

    public final boolean zzc(zzaup zzaupVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzaup zzaupVar2 = (zzaup) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && !zzaupVar.equals(zzaupVar2) && zzaupVar2.zzf().equals(zzaupVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzaupVar.equals(zzaupVar2) && zzaupVar2.zzd().equals(zzaupVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzaup zzaupVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzaupVar);
        }
    }
}
