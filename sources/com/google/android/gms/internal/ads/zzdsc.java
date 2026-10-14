package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsc {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdnv zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqj zzl;
    private final zzbzx zzm;
    private final zzdbx zzo;
    private final zzfgb zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcaj zze = new zzcaj();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdsc(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdnv zzdnvVar, ScheduledExecutorService scheduledExecutorService, zzdqj zzdqjVar, zzbzx zzbzxVar, zzdbx zzdbxVar, zzfgb zzfgbVar) {
        this.zzh = zzdnvVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdqjVar;
        this.zzm = zzbzxVar;
        this.zzo = zzdbxVar;
        this.zzp = zzfgbVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdsc zzdscVar, String str) {
        int i10 = 5;
        final zzffn zzffnVarZza = zzffm.zza(zzdscVar.zzf, 5);
        zzffnVarZza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzffn zzffnVarZza2 = zzffm.zza(zzdscVar.zzf, i10);
                zzffnVarZza2.zzh();
                zzffnVarZza2.zzd(next);
                final Object obj = new Object();
                final zzcaj zzcajVar = new zzcaj();
                zzfwm zzfwmVarZzn = zzfwc.zzn(zzcajVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbH)).longValue(), TimeUnit.SECONDS, zzdscVar.zzk);
                zzdscVar.zzl.zzc(next);
                zzdscVar.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzfwmVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzcajVar, next, jElapsedRealtime, zzffnVarZza2);
                    }
                }, zzdscVar.zzi);
                arrayList.add(zzfwmVarZzn);
                final zzdsb zzdsbVar = new zzdsb(zzdscVar, obj, next, jElapsedRealtime, zzffnVarZza2, zzcajVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbkp(strOptString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdscVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfbd zzfbdVarZzc = zzdscVar.zzh.zzc(next, new JSONObject());
                        zzdscVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrx
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzn(zzfbdVarZzc, zzdsbVar, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e10) {
                        zzbzr.zzh("", e10);
                    }
                } catch (zzfan unused2) {
                    zzdsbVar.zze("Failed to create Adapter.");
                }
                i10 = 5;
            }
            zzfwc.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdru
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzf(zzffnVarZza);
                    return null;
                }
            }, zzdscVar.zzi);
        } catch (JSONException e11) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e11);
            zzdscVar.zzo.zza("MalformedJson");
            zzdscVar.zzl.zza("MalformedJson");
            zzdscVar.zze.zze(e11);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e11, "AdapterInitializer.updateAdapterStatus");
            zzfgb zzfgbVar = zzdscVar.zzp;
            zzffnVarZza.zzg(e11);
            zzffnVarZza.zzf(false);
            zzfgbVar.zzb(zzffnVarZza.zzl());
        }
    }

    private final synchronized zzfwm zzu() {
        String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzfwc.zzh(strZzc);
        }
        final zzcaj zzcajVar = new zzcaj();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzcajVar);
            }
        });
        return zzcajVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbkf(str, z10, i10, str2));
    }

    public final /* synthetic */ Object zzf(zzffn zzffnVar) throws Exception {
        this.zze.zzd(Boolean.TRUE);
        zzfgb zzfgbVar = this.zzp;
        zzffnVar.zzf(true);
        zzfgbVar.zzb(zzffnVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbkf zzbkfVar = (zzbkf) this.zzn.get(str);
            arrayList.add(new zzbkf(str, zzbkfVar.zzb, zzbkfVar.zzc, zzbkfVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zze(new Exception());
        }
    }

    public final /* synthetic */ void zzn(zzfbd zzfbdVar, zzbkj zzbkjVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfbdVar.zzi(context, zzbkjVar, list);
            } catch (zzfan unused) {
                zzbkjVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }

    public final /* synthetic */ void zzo(final zzcaj zzcajVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrr
            @Override // java.lang.Runnable
            public final void run() {
                zzcaj zzcajVar2 = zzcajVar;
                String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (TextUtils.isEmpty(strZzc)) {
                    zzcajVar2.zze(new Exception());
                } else {
                    zzcajVar2.zzd(strZzc);
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcaj zzcajVar, String str, long j10, zzffn zzffnVar) {
        synchronized (obj) {
            if (!zzcajVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfgb zzfgbVar = this.zzp;
                zzffnVar.zzc("Timeout");
                zzffnVar.zzf(false);
                zzfgbVar.zzb(zzffnVar.zzl());
                zzcajVar.zzd(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbdk.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbG)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfwm zzfwmVarZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbI)).longValue(), TimeUnit.SECONDS);
                    zzfwc.zzq(zzfwmVarZzu, new zzdsa(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzd(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbkm zzbkmVar) {
        this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrw
            @Override // java.lang.Runnable
            public final void run() {
                zzdsc zzdscVar = this.zza;
                try {
                    zzbkmVar.zzb(zzdscVar.zzg());
                } catch (RemoteException e10) {
                    zzbzr.zzh("", e10);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
