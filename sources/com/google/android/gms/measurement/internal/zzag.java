package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag extends zzgr {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    public zzag(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeb.zzC.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        zzem zzemVarZzd;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            zzemVarZzd = this.zzs.zzay().zzd();
            str3 = "Could not find SystemProperties class";
            zzemVarZzd.zzb(str3, e);
            return "";
        } catch (IllegalAccessException e11) {
            e = e11;
            zzemVarZzd = this.zzs.zzay().zzd();
            str3 = "Could not access SystemProperties.get()";
            zzemVarZzd.zzb(str3, e);
            return "";
        } catch (NoSuchMethodException e12) {
            e = e12;
            zzemVarZzd = this.zzs.zzay().zzd();
            str3 = "Could not find SystemProperties.get() method";
            zzemVarZzd.zzb(str3, e);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            zzemVarZzd = this.zzs.zzay().zzd();
            str3 = "SystemProperties.get() threw an exception";
            zzemVarZzd.zzb(str3, e);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeb.zzc.zza(null)).longValue();
    }

    public final double zza(String str, zzea zzeaVar) {
        if (str != null) {
            String strZza = this.zzb.zza(str, zzeaVar.zzb());
            if (!TextUtils.isEmpty(strZza)) {
                try {
                    return ((Double) zzeaVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) zzeaVar.zza(null)).doubleValue();
    }

    public final int zzb(String str) {
        return zzf(str, zzeb.zzG, 500, 2000);
    }

    public final int zzc() {
        zzlh zzlhVarZzv = this.zzs.zzv();
        Boolean boolZzj = zzlhVarZzv.zzs.zzt().zzj();
        if (zzlhVarZzv.zzm() < 201500) {
            return (boolZzj == null || boolZzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzeb.zzH, 25, 100);
    }

    public final int zze(String str, zzea zzeaVar) {
        if (str != null) {
            String strZza = this.zzb.zza(str, zzeaVar.zzb());
            if (!TextUtils.isEmpty(strZza)) {
                try {
                    return ((Integer) zzeaVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) zzeaVar.zza(null)).intValue();
    }

    public final int zzf(String str, zzea zzeaVar, int i10, int i11) {
        return Math.max(Math.min(zze(str, zzeaVar), i11), i10);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 73000L;
    }

    public final long zzi(String str, zzea zzeaVar) {
        if (str != null) {
            String strZza = this.zzb.zza(str, zzeaVar.zzb());
            if (!TextUtils.isEmpty(strZza)) {
                try {
                    return ((Long) zzeaVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) zzeaVar.zza(null)).longValue();
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzj = zzj();
        if (bundleZzj == null) {
            a.a(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzj.containsKey(str)) {
            return Boolean.valueOf(bundleZzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzs.zzaw();
        return "FA";
    }

    public final String zzo(String str, zzea zzeaVar) {
        return (String) zzeaVar.zza(str == null ? null : this.zzb.zza(str, zzeaVar.zzb()));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003b A[Catch: NotFoundException -> 0x0040, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0040, blocks: (B:10:0x0026, B:13:0x003b), top: B:18:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    public final List zzp(String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleZzj = zzj();
        if (bundleZzj != null) {
            if (bundleZzj.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleZzj.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzs.zzau().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.zzs.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        a.a(this.zzs, "Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzs.zzau().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean boolZzk = zzk("google_analytics_adid_collection_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public final boolean zzs(String str, zzea zzeaVar) {
        Object objZza;
        if (str == null) {
            objZza = zzeaVar.zza(null);
        } else {
            String strZza = this.zzb.zza(str, zzeaVar.zzb());
            if (TextUtils.isEmpty(strZza)) {
                objZza = zzeaVar.zza(null);
            } else {
                objZza = zzeaVar.zza(Boolean.valueOf("1".equals(strZza)));
            }
        }
        return ((Boolean) objZza).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolZzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean boolZzk = zzk("firebase_analytics_collection_deactivated");
        return boolZzk != null && boolZzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean boolZzk = zzk("app_measurement_lite");
            this.zza = boolZzk;
            if (boolZzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzs.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(myProcessName)) {
                            z10 = true;
                        }
                        this.zzc = Boolean.valueOf(z10);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
