package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgb implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final zzbzx zzf;
    private int zzi;
    private final zzdns zzj;
    private final List zzk;
    private final zzdyw zzm;
    private final zzbuq zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfgg zzg = zzfgj.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfgb(Context context, zzbzx zzbzxVar, zzdns zzdnsVar, zzdyw zzdywVar, zzbuq zzbuqVar) {
        this.zze = context;
        this.zzf = zzbzxVar;
        this.zzj = zzdnsVar;
        this.zzm = zzdywVar;
        this.zzn = zzbuqVar;
        this.zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziq)).booleanValue() ? com.google.android.gms.ads.internal.util.zzs.zzd() : zzfsc.zzl();
    }

    public static boolean zza() {
        boolean zBooleanValue;
        Boolean boolValueOf;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbcy.zzb.zze()).booleanValue()) {
                    boolValueOf = Boolean.valueOf(Math.random() < ((Double) zzbcy.zza.zze()).doubleValue());
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                zzb = boolValueOf;
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzax;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        bArrZzax = ((zzfgj) this.zzg.zzal()).zzax();
                        this.zzg.zzc();
                    }
                    new zzdyv(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzdyt((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzik), DateTimeConstants.MILLIS_PER_MINUTE, new HashMap(), bArrZzax, "application/x-protobuf", false));
                } catch (Exception e10) {
                    if ((e10 instanceof zzdtx) && ((zzdtx) e10).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzffr zzffrVar) {
        zzcae.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzffrVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzffr zzffrVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzn(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzil)).intValue();
                    zzcae.zzd.scheduleAtFixedRate(this, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
                }
            }
        }
        if (zza() && zzffrVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzim)).intValue()) {
                    return;
                }
                zzfgd zzfgdVarZza = zzfge.zza();
                zzfgdVarZza.zzt(zzffrVar.zzl());
                zzfgdVarZza.zzp(zzffrVar.zzk());
                zzfgdVarZza.zzg(zzffrVar.zzb());
                zzfgdVarZza.zzv(3);
                zzfgdVarZza.zzm(this.zzf.zza);
                zzfgdVarZza.zzb(this.zzh);
                zzfgdVarZza.zzk(Build.VERSION.RELEASE);
                zzfgdVarZza.zzq(Build.VERSION.SDK_INT);
                zzfgdVarZza.zzu(zzffrVar.zzn());
                zzfgdVarZza.zzj(zzffrVar.zza());
                zzfgdVarZza.zze(this.zzi);
                zzfgdVarZza.zzs(zzffrVar.zzm());
                zzfgdVarZza.zzc(zzffrVar.zzd());
                zzfgdVarZza.zzf(zzffrVar.zzf());
                zzfgdVarZza.zzh(zzffrVar.zzg());
                zzfgdVarZza.zzi(this.zzj.zzc(zzffrVar.zzg()));
                zzfgdVarZza.zzl(zzffrVar.zzh());
                zzfgdVarZza.zzd(zzffrVar.zze());
                zzfgdVarZza.zzr(zzffrVar.zzj());
                zzfgdVarZza.zzn(zzffrVar.zzi());
                zzfgdVarZza.zzo(zzffrVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziq)).booleanValue()) {
                    zzfgdVarZza.zza(this.zzk);
                }
                zzfgg zzfggVar = this.zzg;
                zzfgh zzfghVarZza = zzfgi.zza();
                zzfghVarZza.zza(zzfgdVarZza);
                zzfggVar.zzb(zzfghVarZza);
            }
        }
    }
}
