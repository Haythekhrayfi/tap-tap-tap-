package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzke {
    public final /* synthetic */ zzki zza;
    private zzkd zzb;

    public zzke(zzki zzkiVar) {
        this.zza = zzkiVar;
    }

    public final void zza(long j10) {
        this.zzb = new zzkd(this, this.zza.zzs.zzav().currentTimeMillis(), j10);
        this.zza.zzd.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        this.zza.zzg();
        zzkd zzkdVar = this.zzb;
        if (zzkdVar != null) {
            this.zza.zzd.removeCallbacks(zzkdVar);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
