package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
final class zzfbt {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfcs zzd = new zzfcs();

    public zzfbt(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - ((zzfcd) this.zza.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfcd zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfcd zzfcdVar = (zzfcd) this.zza.remove();
        if (zzfcdVar != null) {
            this.zzd.zzh();
        }
        return zzfcdVar;
    }

    public final zzfcr zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfcd zzfcdVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfcdVar);
        return true;
    }
}
