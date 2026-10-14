package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.j;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbsw implements zzbsy {
    public static zzbsy zza;
    public static zzbsy zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzbzx zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbsw(Context context, zzbzx zzbzxVar) {
        zzfmc.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    public static zzbsy zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbdn.zze.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhq)).booleanValue()) {
                        zza = new zzbsx();
                    } else {
                        zza = new zzbsw(context, zzbzx.zza());
                    }
                } else {
                    zza = new zzbsx();
                }
            }
        }
        return zza;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:22:0x0060, B:23:0x0067, B:14:0x0039, B:15:0x0040), top: B:29:0x0003, inners: #1 }] */
    public static zzbsy zzb(Context context, zzbzx zzbzxVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbdn.zze.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhq)).booleanValue()) {
                        zzb = new zzbsx();
                    } else {
                        zzbsw zzbswVar = new zzbsw(context, zzbzxVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbswVar.zzd) {
                                zzbswVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbsv(zzbswVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbsu(zzbswVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbswVar;
                    }
                } else {
                    zzb = new zzbsx();
                }
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfpw.zzc(zzbzk.zzf(zzc(th)));
    }

    public final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= zzbzk.zzo(stackTraceElement.getClassName());
                    zEquals |= zzbsw.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            zzg(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzg(Throwable th, String str, float f10) {
        Throwable th2;
        String packageName;
        Handler handler = zzbzk.zza;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) zzbdn.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z10 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzbzk.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z10 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                        }
                        arrayList.add(stackTraceElement);
                    }
                }
                if (z10) {
                    Throwable th4 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th4.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    th2 = th4;
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String strZzc = zzc(th);
        String strZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzip)).booleanValue() ? zzd(th) : "";
        double d10 = f10;
        double dRandom = Math.random();
        int i10 = f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (int) (1.0f / f10) : 1;
        if (dRandom < d10) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zIsCallerInstantApp = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th5) {
                zzbzr.zzh("Error fetching instant app info", th5);
            }
            try {
                packageName = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzbzr.zzj("Cannot obtain package name, proceeding.");
                packageName = AppLovinMediationProvider.UNKNOWN;
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String strA = Build.MODEL;
            if (!strA.startsWith(str2)) {
                strA = j.a(str2, " ", strA);
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", strA).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZzc).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "549114221").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbdn.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1");
            if (!TextUtils.isEmpty(strZzd)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strZzd);
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str3 : arrayList2) {
                final zzbzw zzbzwVar = new zzbzw(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbst
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzwVar.zza(str3);
                    }
                });
            }
        }
    }
}
