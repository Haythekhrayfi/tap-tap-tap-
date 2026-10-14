package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkl extends zzkn {
    private final AlarmManager zza;
    private zzap zzb;
    private Integer zzc;

    public zzkl(zzkz zzkzVar) {
        super(zzkzVar);
        this.zza = (AlarmManager) this.zzs.zzau().getSystemService("alarm");
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzs.zzau().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context contextZzau = this.zzs.zzau();
        return PendingIntent.getBroadcast(contextZzau, 0, new Intent().setClassName(contextZzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzap zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkk(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        this.zzs.zzay().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzj();
        return false;
    }

    public final void zzd(long j10) {
        zzW();
        this.zzs.zzaw();
        Context contextZzau = this.zzs.zzau();
        if (!zzlh.zzaj(contextZzau)) {
            this.zzs.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlh.zzak(contextZzau, false)) {
            this.zzs.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j10));
        this.zzs.zzav().elapsedRealtime();
        this.zzs.zzf();
        if (j10 < Math.max(0L, ((Long) zzeb.zzw.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j10);
        }
        this.zzs.zzaw();
        Context contextZzau2 = this.zzs.zzau();
        ComponentName componentName = new ComponentName(contextZzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(contextZzau2, new JobInfo.Builder(iZzf, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
