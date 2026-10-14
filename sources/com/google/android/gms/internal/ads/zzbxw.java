package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbxw {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    private String zze = null;
    public final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final AtomicReference zzj = new AtomicReference(null);
    private final BlockingQueue zzk = new ArrayBlockingQueue(20);
    private final Object zzl = new Object();

    private final void zzA(Context context, String str, String str2) {
        if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            Method declaredMethod = (Method) this.zzi.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzi.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzC(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzC(str2, false);
            }
        }
    }

    private final void zzB(Context context, final String str, String str2, Bundle bundle) {
        if (zzu(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                zzbzr.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzv(context)) {
                zzD("logEventInternal", new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxi
                    @Override // com.google.android.gms.internal.ads.zzbxv
                    public final void zza(zzcgq zzcgqVar) throws RemoteException {
                        zzcgqVar.zzo("am", str, bundle2);
                    }
                });
                return;
            }
            if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                Method declaredMethod = (Method) this.zzi.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzi.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzC("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzC("logEventInternal", true);
                }
            }
        }
    }

    private final void zzC(String str, boolean z10) {
        if (this.zza.get()) {
            return;
        }
        zzbzr.zzj("Invoke Firebase method " + str + " error.");
        if (z10) {
            zzbzr.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final void zzD(final String str, final zzbxv zzbxvVar) {
        synchronized (this.zzj) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(zzbxvVar, str);
                }
            }, null);
            if (this.zzj.get() != null) {
                futureTask.run();
            } else {
                this.zzk.offer(futureTask);
            }
        }
    }

    private final boolean zzE(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                zzbxf.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzC("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public static final boolean zzv(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzai)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaj)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzak)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzw(String str, Object obj, zzbxu zzbxuVar) {
        synchronized (this.zzj) {
            if (((zzcgq) this.zzj.get()) != null) {
                try {
                    return zzbxuVar.zza((zzcgq) this.zzj.get());
                } catch (Exception unused) {
                    zzC(str, false);
                }
            }
            return obj;
        }
    }

    private final Object zzx(String str, Context context) {
        if (!zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return null;
        }
        try {
            return zzy(context, str).invoke(this.zzg.get(), new Object[0]);
        } catch (Exception unused) {
            zzC(str, true);
            return null;
        }
    }

    private final Method zzy(Context context, String str) {
        Method method = (Method) this.zzi.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzi.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzC(str, false);
            return null;
        }
    }

    private final ExecutorService zzz() {
        ExecutorService threadPoolExecutor;
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfmc.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzah)).intValue(), new zzbxt(this), 2);
            } else {
                zzbbe zzbbeVar = zzbbm.zzah;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbxt(this));
            }
            zzbxf.zza(this.zzb, null, threadPoolExecutor);
        }
        return (ExecutorService) this.zzb.get();
    }

    public final String zza(Context context) {
        if (!zzu(context)) {
            return null;
        }
        if (zzv(context)) {
            Long l10 = (Long) zzw("getAdEventId", null, new zzbxu() { // from class: com.google.android.gms.internal.ads.zzbxk
                @Override // com.google.android.gms.internal.ads.zzbxu
                public final Object zza(zzcgq zzcgqVar) {
                    return Long.valueOf(zzcgqVar.zzc());
                }
            });
            if (l10 != null) {
                return Long.toString(l10.longValue());
            }
            return null;
        }
        Object objZzx = zzx("generateEventId", context);
        if (objZzx != null) {
            return objZzx.toString();
        }
        return null;
    }

    public final String zzb(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zze;
            if (str != null) {
                return str;
            }
            this.zze = zzv(context) ? (String) zzw("getAppIdOrigin", this.zze, new zzbxu() { // from class: com.google.android.gms.internal.ads.zzbxo
                @Override // com.google.android.gms.internal.ads.zzbxu
                public final Object zza(zzcgq zzcgqVar) {
                    return zzcgqVar.zze();
                }
            }) : "fa";
            return this.zze;
        }
    }

    public final String zzc(final Context context) {
        if (!zzu(context)) {
            return null;
        }
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzag)).longValue();
        if (zzv(context)) {
            try {
                return jLongValue < 0 ? (String) zzw("getAppInstanceId", null, zzbxp.zza) : (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzf();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) zzx("getAppInstanceId", context);
        }
        try {
            return (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzg(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String zzd(Context context) {
        if (!zzu(context)) {
            return "";
        }
        if (zzv(context)) {
            return (String) zzw("getCurrentScreenNameOrScreenClass", "", new zzbxu() { // from class: com.google.android.gms.internal.ads.zzbxl
                @Override // com.google.android.gms.internal.ads.zzbxu
                public final Object zza(zzcgq zzcgqVar) throws RemoteException {
                    String strZzh = zzcgqVar.zzh();
                    return (strZzh == null && (strZzh = zzcgqVar.zzg()) == null) ? "" : strZzh;
                }
            });
        }
        if (!zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return "";
        }
        try {
            String str = (String) zzy(context, "getCurrentScreenName").invoke(this.zzg.get(), new Object[0]);
            if (str == null) {
                str = (String) zzy(context, "getCurrentScreenClass").invoke(this.zzg.get(), new Object[0]);
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            zzC("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zze(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            this.zzd = zzv(context) ? (String) zzw("getGmpAppId", this.zzd, new zzbxu() { // from class: com.google.android.gms.internal.ads.zzbxh
                @Override // com.google.android.gms.internal.ads.zzbxu
                public final Object zza(zzcgq zzcgqVar) {
                    return zzcgqVar.zzi();
                }
            }) : (String) zzx("getGmpAppId", context);
            return this.zzd;
        }
    }

    public final /* synthetic */ String zzf() throws Exception {
        return (String) zzw("getAppInstanceId", null, zzbxp.zza);
    }

    public final /* synthetic */ String zzg(Context context) throws Exception {
        return (String) zzx("getAppInstanceId", context);
    }

    public final void zzh(Context context, final String str) {
        if (zzu(context)) {
            if (zzv(context)) {
                zzD("beginAdUnitExposure", new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxg
                    @Override // com.google.android.gms.internal.ads.zzbxv
                    public final void zza(zzcgq zzcgqVar) throws RemoteException {
                        zzcgqVar.zzl(str);
                    }
                });
            } else {
                zzA(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzi(Context context, final String str) {
        if (zzu(context)) {
            if (zzv(context)) {
                zzD("endAdUnitExposure", new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxn
                    @Override // com.google.android.gms.internal.ads.zzbxv
                    public final void zza(zzcgq zzcgqVar) throws RemoteException {
                        zzcgqVar.zzn(str);
                    }
                });
            } else {
                zzA(context, str, "endAdUnitExposure");
            }
        }
    }

    public final /* synthetic */ void zzj(zzbxv zzbxvVar, String str) {
        if (((zzcgq) this.zzj.get()) != null) {
            try {
                zzbxvVar.zza((zzcgq) this.zzj.get());
            } catch (Exception unused) {
                zzC(str, false);
            }
        }
    }

    public final void zzk(Context context, String str) {
        zzB(context, "_aa", str, null);
    }

    public final void zzl(Context context, String str) {
        zzB(context, "_aq", str, null);
    }

    public final void zzm(Context context, String str) {
        zzB(context, "_ac", str, null);
    }

    public final void zzn(Context context, String str) {
        zzB(context, "_ai", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i10) {
        if (zzu(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            zzB(context, "_ar", str, bundle);
            com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
        }
    }

    public final void zzp(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzan)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzq(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzbxx.zzd(context).zzb().zzd(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzan)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzr(final Bundle bundle) {
        zzD("setConsent", new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxs
            @Override // com.google.android.gms.internal.ads.zzbxv
            public final void zza(zzcgq zzcgqVar) throws RemoteException {
                zzcgqVar.zzr(bundle);
            }
        });
    }

    @Deprecated
    public final void zzs(final Context context, final String str) {
        if (zzu(context) && (context instanceof Activity)) {
            if (zzv(context)) {
                zzD("setScreenName", new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxm
                    @Override // com.google.android.gms.internal.ads.zzbxv
                    public final void zza(zzcgq zzcgqVar) throws RemoteException {
                        Context context2 = context;
                        zzcgqVar.zzs(ObjectWrapper.wrap(context2), str, context2.getPackageName());
                    }
                });
                return;
            }
            if (zzE(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
                Method declaredMethod = (Method) this.zzi.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.zzi.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        zzC("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    zzC("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean zzt() {
        synchronized (this.zzl) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean zzu(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzab)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzal)).booleanValue()) {
                return true;
            }
            if (this.zzf.get() == -1) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzbzk.zzs(context, 12451000)) {
                    this.zzf.set(1);
                } else {
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    if (zzbzk.zzt(context)) {
                        zzbzr.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzf.set(0);
                    } else {
                        this.zzf.set(1);
                    }
                }
            }
            if (this.zzf.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
