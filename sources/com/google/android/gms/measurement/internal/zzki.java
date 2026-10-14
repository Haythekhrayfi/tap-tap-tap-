package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzki extends zzf {
    public final zzkh zza;
    public final zzkg zzb;
    public final zzke zzc;
    private Handler zzd;

    public zzki(zzfy zzfyVar) {
        super(zzfyVar);
        this.zza = new zzkh(this);
        this.zzb = new zzkg(this);
        this.zzc = new zzke(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzki zzkiVar, long j10) {
        zzkiVar.zzg();
        zzkiVar.zzm();
        zzkiVar.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzkiVar.zzc.zza(j10);
        if (zzkiVar.zzs.zzf().zzu()) {
            zzkiVar.zzb.zzb(j10);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzki zzkiVar, long j10) {
        zzkiVar.zzg();
        zzkiVar.zzm();
        zzkiVar.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzkiVar.zzs.zzf().zzu() || zzkiVar.zzs.zzm().zzl.zzb()) {
            zzkiVar.zzb.zzc(j10);
        }
        zzkiVar.zzc.zzb();
        zzkh zzkhVar = zzkiVar.zza;
        zzkhVar.zza.zzg();
        if (zzkhVar.zza.zzs.zzJ()) {
            zzkhVar.zzb(zzkhVar.zza.zzs.zzav().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }
}
