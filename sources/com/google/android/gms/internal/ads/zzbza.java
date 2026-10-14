package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbza {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbze zzc;
    private boolean zzd;
    private Context zze;
    private zzbzx zzf;
    private String zzg;
    private zzbbu zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzbyz zzk;
    private final Object zzl;
    private zzfwm zzm;
    private final AtomicBoolean zzn;

    public zzbza() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbze(com.google.android.gms.ads.internal.client.zzay.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzbyz(null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzju)).booleanValue()) {
                return zzbzv.zza(this.zze).getResources();
            }
            zzbzv.zza(this.zze).getResources();
            return null;
        } catch (zzbzu e10) {
            zzbzr.zzk("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final zzbbu zzf() {
        zzbbu zzbbuVar;
        synchronized (this.zza) {
            zzbbuVar = this.zzh;
        }
        return zzbbuVar;
    }

    public final zzbze zzg() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final zzfwm zzj() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzct)).booleanValue()) {
                synchronized (this.zzl) {
                    zzfwm zzfwmVar = this.zzm;
                    if (zzfwmVar != null) {
                        return zzfwmVar;
                    }
                    zzfwm zzfwmVarZzb = zzcae.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzn();
                        }
                    });
                    this.zzm = zzfwmVarZzb;
                    return zzfwmVarZzb;
                }
            }
        }
        return zzfwc.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzn() throws Exception {
        Context contextZza = zzbus.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzs(Context context, zzbzx zzbzxVar) {
        zzbbu zzbbuVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzbzxVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbsw.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (((Boolean) zzbcz.zzc.zze()).booleanValue()) {
                    zzbbuVar = new zzbbu();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbbuVar = null;
                }
                this.zzh = zzbbuVar;
                if (zzbbuVar != null) {
                    zzcah.zza(new zzbyw(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhW)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbyx(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbzxVar.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzbsw.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbdn.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzbsw.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhW)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
