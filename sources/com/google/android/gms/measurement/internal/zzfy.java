package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznv;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy implements zzgt {
    private static volatile zzfy zzd;
    private zzef zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;

    @VisibleForTesting
    public Boolean zza;

    @VisibleForTesting
    public Boolean zzb;

    @VisibleForTesting
    public final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfd zzl;
    private final zzeo zzm;
    private final zzfv zzn;
    private final zzki zzo;
    private final zzlh zzp;
    private final zzej zzq;
    private final Clock zzr;
    private final zzis zzs;
    private final zzid zzt;
    private final zzd zzu;
    private final zzih zzv;
    private final String zzw;
    private zzeh zzx;
    private zzjs zzy;
    private zzaq zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzfy(zzhb zzhbVar) {
        zzem zzemVarZzk;
        String str;
        Bundle bundle;
        Preconditions.checkNotNull(zzhbVar);
        Context context = zzhbVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzdy.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhbVar.zzb;
        this.zzg = zzhbVar.zzc;
        this.zzh = zzhbVar.zzd;
        this.zzi = zzhbVar.zzh;
        this.zzE = zzhbVar.zze;
        this.zzw = zzhbVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhbVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzia.zze(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l10 = zzhbVar.zzi;
        this.zzc = l10 != null ? l10.longValue() : defaultClock.currentTimeMillis();
        this.zzk = new zzag(this);
        zzfd zzfdVar = new zzfd(this);
        zzfdVar.zzv();
        this.zzl = zzfdVar;
        zzeo zzeoVar = new zzeo(this);
        zzeoVar.zzv();
        this.zzm = zzeoVar;
        zzlh zzlhVar = new zzlh(this);
        zzlhVar.zzv();
        this.zzp = zzlhVar;
        this.zzq = new zzej(new zzha(zzhbVar, this));
        this.zzu = new zzd(this);
        zzis zzisVar = new zzis(this);
        zzisVar.zzb();
        this.zzs = zzisVar;
        zzid zzidVar = new zzid(this);
        zzidVar.zzb();
        this.zzt = zzidVar;
        zzki zzkiVar = new zzki(this);
        zzkiVar.zzb();
        this.zzo = zzkiVar;
        zzih zzihVar = new zzih(this);
        zzihVar.zzv();
        this.zzv = zzihVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzv();
        this.zzn = zzfvVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhbVar.zzg;
        boolean z10 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzid zzidVarZzq = zzq();
            if (zzidVarZzq.zzs.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzidVarZzq.zzs.zze.getApplicationContext();
                if (zzidVarZzq.zza == null) {
                    zzidVarZzq.zza = new zzic(zzidVarZzq, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzidVarZzq.zza);
                    application.registerActivityLifecycleCallbacks(zzidVarZzq.zza);
                    zzemVarZzk = zzidVarZzq.zzs.zzay().zzj();
                    str = "Registered activity lifecycle callback";
                }
            }
            zzfvVar.zzp(new zzfx(this, zzhbVar));
        }
        zzemVarZzk = zzay().zzk();
        str = "Application context is not an Application";
        zzemVarZzk.zza(str);
        zzfvVar.zzp(new zzfx(this, zzhbVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzfy zzfyVar, zzhb zzhbVar) {
        zzfyVar.zzaz().zzg();
        zzfyVar.zzk.zzn();
        zzaq zzaqVar = new zzaq(zzfyVar);
        zzaqVar.zzv();
        zzfyVar.zzz = zzaqVar;
        zzef zzefVar = new zzef(zzfyVar, zzhbVar.zzf);
        zzefVar.zzb();
        zzfyVar.zzA = zzefVar;
        zzeh zzehVar = new zzeh(zzfyVar);
        zzehVar.zzb();
        zzfyVar.zzx = zzehVar;
        zzjs zzjsVar = new zzjs(zzfyVar);
        zzjsVar.zzb();
        zzfyVar.zzy = zzjsVar;
        zzfyVar.zzp.zzw();
        zzfyVar.zzl.zzw();
        zzfyVar.zzA.zzc();
        zzem zzemVarZzi = zzfyVar.zzay().zzi();
        zzfyVar.zzk.zzh();
        zzemVarZzi.zzb("App measurement initialized, version", 73000L);
        zzfyVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzl = zzefVar.zzl();
        if (TextUtils.isEmpty(zzfyVar.zzf)) {
            if (zzfyVar.zzv().zzae(strZzl)) {
                zzfyVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzfyVar.zzay().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strZzl)));
            }
        }
        zzfyVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzfyVar.zzG != zzfyVar.zzH.get()) {
            zzfyVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzfyVar.zzG), Integer.valueOf(zzfyVar.zzH.get()));
        }
        zzfyVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgr zzgrVar) {
        if (zzgrVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzfVar.zze()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
        }
    }

    private static final void zzR(zzgs zzgsVar) {
        if (zzgsVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzgsVar.zzx()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgsVar.getClass())));
        }
    }

    public static zzfy zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzfy.class) {
                if (zzd == null) {
                    zzd = new zzfy(new zzhb(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public final /* synthetic */ void zzC(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        if (i10 == 200 || i10 == 204) {
            if (th == null) {
                zzm().zzm.zza(true);
                if (bArr != null || bArr.length == 0) {
                    zzay().zzc().zza("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    String strOptString2 = jSONObject.optString("gclid", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(strOptString)) {
                        zzay().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlh zzlhVarZzv = zzv();
                    zzfy zzfyVar = zzlhVarZzv.zzs;
                    if (!TextUtils.isEmpty(strOptString) && (listQueryIntentActivities = zzlhVarZzv.zzs.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) != null && !listQueryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzlh zzlhVarZzv2 = zzv();
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = zzlhVarZzv2.zzs.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                zzlhVarZzv2.zzs.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e10) {
                            zzlhVarZzv2.zzs.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                    zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                    return;
                } catch (JSONException e11) {
                    zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
        } else if (i10 == 304) {
            i10 = 304;
            if (th == null) {
                zzm().zzm.zza(true);
                if (bArr != null) {
                }
                zzay().zzc().zza("Deferred Deep Link response empty.");
                return;
            }
        }
        zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzem zzemVarZzc;
        String str;
        zzaz().zzg();
        zzR(zzr());
        String strZzl = zzh().zzl();
        Pair pairZzb = zzm().zzb(strZzl);
        if (!this.zzk.zzr() || ((Boolean) pairZzb.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairZzb.first)) {
            zzemVarZzc = zzay().zzc();
            str = "ADID unavailable to retrieve Deferred Deep Link. Skipping";
        } else {
            zzih zzihVarZzr = zzr();
            zzihVarZzr.zzu();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzihVarZzr.zzs.zze.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = null;
            if (connectivityManager != null) {
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                zzlh zzlhVarZzv = zzv();
                zzh().zzs.zzk.zzh();
                URL urlZzE = zzlhVarZzv.zzE(73000L, strZzl, (String) pairZzb.first, zzm().zzn.zza() - 1);
                if (urlZzE != null) {
                    zzih zzihVarZzr2 = zzr();
                    zzfw zzfwVar = new zzfw(this);
                    zzihVarZzr2.zzg();
                    zzihVarZzr2.zzu();
                    Preconditions.checkNotNull(urlZzE);
                    Preconditions.checkNotNull(zzfwVar);
                    zzihVarZzr2.zzs.zzaz().zzo(new zzig(zzihVarZzr2, strZzl, urlZzE, null, null, zzfwVar, null));
                    return;
                }
                return;
            }
            zzemVarZzc = zzay().zzk();
            str = "Network is not available for Deferred Deep Link request. Skipping";
        }
        zzemVarZzc.zza(str);
    }

    public final void zzF(boolean z10) {
        this.zzE = Boolean.valueOf(z10);
    }

    public final void zzG(boolean z10) {
        zzaz().zzg();
        this.zzF = z10;
    }

    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzai zzaiVar;
        zzaz().zzg();
        zzai zzaiVarZzc = zzm().zzc();
        zzfd zzfdVarZzm = zzm();
        zzfy zzfyVar = zzfdVarZzm.zzs;
        zzfdVarZzm.zzg();
        int i10 = 100;
        int i11 = zzfdVarZzm.zza().getInt("consent_source", 100);
        zzag zzagVar = this.zzk;
        zzfy zzfyVar2 = zzagVar.zzs;
        Boolean boolZzk = zzagVar.zzk("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.zzk;
        zzfy zzfyVar3 = zzagVar2.zzs;
        Boolean boolZzk2 = zzagVar2.zzk("google_analytics_default_allow_analytics_storage");
        if (!(boolZzk == null && boolZzk2 == null) && zzm().zzl(-10)) {
            zzaiVar = new zzai(boolZzk, boolZzk2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                zzq().zzS(zzai.zza, -10, this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzaiVar = zzai.zza(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.zza)) {
                    i10 = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            zzq().zzS(zzaiVar, i10, this.zzc);
            zzaiVarZzc = zzaiVar;
        }
        zzq().zzV(zzaiVarZzc);
        if (zzm().zzc.zza() == 0) {
            zzay().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (zzM()) {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzlh zzlhVarZzv = zzv();
                String strZzm = zzh().zzm();
                zzfd zzfdVarZzm2 = zzm();
                zzfdVarZzm2.zzg();
                String string = zzfdVarZzm2.zza().getString("gmp_app_id", null);
                String strZzk = zzh().zzk();
                zzfd zzfdVarZzm3 = zzm();
                zzfdVarZzm3.zzg();
                if (zzlhVarZzv.zzam(strZzm, string, strZzk, zzfdVarZzm3.zza().getString("admob_app_id", null))) {
                    zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfd zzfdVarZzm4 = zzm();
                    zzfdVarZzm4.zzg();
                    Boolean boolZzd = zzfdVarZzm4.zzd();
                    SharedPreferences.Editor editorEdit = zzfdVarZzm4.zza().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolZzd != null) {
                        zzfdVarZzm4.zzh(boolZzd);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfd zzfdVarZzm5 = zzm();
                String strZzm2 = zzh().zzm();
                zzfdVarZzm5.zzg();
                SharedPreferences.Editor editorEdit2 = zzfdVarZzm5.zza().edit();
                editorEdit2.putString("gmp_app_id", strZzm2);
                editorEdit2.apply();
                zzfd zzfdVarZzm6 = zzm();
                String strZzk2 = zzh().zzk();
                zzfdVarZzm6.zzg();
                SharedPreferences.Editor editorEdit3 = zzfdVarZzm6.zza().edit();
                editorEdit3.putString("admob_app_id", strZzk2);
                editorEdit3.apply();
            }
            if (!zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzO(zzm().zze.zza());
            zznv.zzc();
            if (this.zzk.zzs(null, zzeb.zzac)) {
                try {
                    zzv().zzs.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzo.zza())) {
                        zzay().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzo.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zZzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zZzJ);
                }
                if (zZzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzr.zza());
            }
        } else if (zzJ()) {
            if (!zzv().zzad("android.permission.INTERNET")) {
                a.a(this, "App is missing INTERNET permission");
            }
            if (!zzv().zzad("android.permission.ACCESS_NETWORK_STATE")) {
                a.a(this, "App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                if (!zzlh.zzaj(this.zze)) {
                    a.a(this, "AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlh.zzak(this.zze, false)) {
                    a.a(this, "AppMeasurementService not registered/enabled");
                }
            }
            a.a(this, "Uploading is not possible. App measurement disabled");
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzaz().zzg();
        return this.zzF;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    public final boolean zzM() {
        if (!this.zzB) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaz().zzg();
        Boolean bool = this.zzC;
        if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
            this.zzD = this.zzr.elapsedRealtime();
            boolean z10 = true;
            Boolean boolValueOf = Boolean.valueOf(zzv().zzad("android.permission.INTERNET") && zzv().zzad("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlh.zzaj(this.zze) && zzlh.zzak(this.zze, false))));
            this.zzC = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzv().zzX(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                    z10 = false;
                }
                this.zzC = Boolean.valueOf(z10);
            }
        }
        return this.zzC.booleanValue();
    }

    @Pure
    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaz().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaz().zzg();
        if (!this.zzF) {
            return 8;
        }
        Boolean boolZzd = zzm().zzd();
        if (boolZzd != null) {
            return boolZzd.booleanValue() ? 0 : 3;
        }
        zzag zzagVar = this.zzk;
        zzab zzabVar = zzagVar.zzs.zzj;
        Boolean boolZzk = zzagVar.zzk("firebase_analytics_collection_enabled");
        if (boolZzk != null) {
            return boolZzk.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    @Pure
    public final Context zzau() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    @Pure
    public final Clock zzav() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    @Pure
    public final zzab zzaw() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    @Pure
    public final zzeo zzay() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    @Pure
    public final zzfv zzaz() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.zzk;
    }

    @Pure
    public final zzaq zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzef zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzeh zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzej zzj() {
        return this.zzq;
    }

    public final zzeo zzl() {
        zzeo zzeoVar = this.zzm;
        if (zzeoVar == null || !zzeoVar.zzx()) {
            return null;
        }
        return zzeoVar;
    }

    @Pure
    public final zzfd zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    public final zzfv zzo() {
        return this.zzn;
    }

    @Pure
    public final zzid zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzih zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzis zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjs zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzki zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    @Pure
    public final zzlh zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzg;
    }

    @Pure
    public final String zzy() {
        return this.zzh;
    }

    @Pure
    public final String zzz() {
        return this.zzw;
    }
}
