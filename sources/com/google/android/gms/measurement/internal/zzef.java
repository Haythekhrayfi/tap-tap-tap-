package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpf;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzef extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzef(zzfy zzfyVar, long j10) {
        super(zzfyVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j10;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165 A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0173 A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0189 A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x018c A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    public final void zzd() {
        String str;
        String string;
        Object[] objArr;
        int iZza;
        zzeo zzeoVarZzay;
        zzem zzemVarZzj;
        String str2;
        List listZzp;
        Iterator it;
        String strZzc;
        String str3;
        Context contextZzau;
        String strZzz;
        String packageName = this.zzs.zzau().getPackageName();
        PackageManager packageManager = this.zzs.zzau().getPackageManager();
        String str4 = "Unknown";
        int i10 = Integer.MIN_VALUE;
        String installerPackageName = AppLovinMediationProvider.UNKNOWN;
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzs.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeo.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzs.zzau().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str4 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str4;
                            str4 = string;
                            this.zzs.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeo.zzn(packageName), str4);
                            string = str4;
                            str4 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str4;
                this.zzc = i10;
                this.zze = string;
                this.zzf = 0L;
                if (TextUtils.isEmpty(this.zzs.zzw()) && "am".equals(this.zzs.zzx())) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                iZza = this.zzs.zza();
                zzeoVarZzay = this.zzs.zzay();
                switch (iZza) {
                    case 0:
                        zzemVarZzj = zzeoVarZzay.zzj();
                        str2 = "App measurement collection enabled";
                        break;
                    case 1:
                        zzemVarZzj = zzeoVarZzay.zzi();
                        str2 = "App measurement deactivated via the manifest";
                        break;
                    case 2:
                        zzemVarZzj = zzeoVarZzay.zzj();
                        str2 = "App measurement deactivated via the init parameters";
                        break;
                    case 3:
                        zzemVarZzj = zzeoVarZzay.zzi();
                        str2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                        break;
                    case 4:
                        zzemVarZzj = zzeoVarZzay.zzi();
                        str2 = "App measurement disabled via the manifest";
                        break;
                    case 5:
                        zzemVarZzj = zzeoVarZzay.zzj();
                        str2 = "App measurement disabled via the init parameters";
                        break;
                    case 6:
                        zzemVarZzj = zzeoVarZzay.zzl();
                        str2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                        break;
                    case 7:
                        zzemVarZzj = zzeoVarZzay.zzi();
                        str2 = "App measurement disabled via the global data collection setting";
                        break;
                    default:
                        zzemVarZzj = zzeoVarZzay.zzi();
                        str2 = "App measurement disabled due to denied storage consent";
                        break;
                }
                zzemVarZzj.zza(str2);
                this.zzk = "";
                this.zzl = "";
                this.zzs.zzaw();
                if (objArr != false) {
                    this.zzl = this.zzs.zzw();
                }
                strZzc = zzij.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
                this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
                if (!TextUtils.isEmpty(strZzc)) {
                    contextZzau = this.zzs.zzau();
                    strZzz = this.zzs.zzz();
                    Preconditions.checkNotNull(contextZzau);
                    Resources resources = contextZzau.getResources();
                    if (!TextUtils.isEmpty(strZzz)) {
                        strZzz = zzfq.zza(contextZzau);
                    }
                    this.zzl = zzfq.zzb("admob_app_id", resources, strZzz);
                }
                if (iZza == 0) {
                    zzem zzemVarZzj2 = this.zzs.zzay().zzj();
                    String str5 = this.zza;
                    if (TextUtils.isEmpty(this.zzk)) {
                        str3 = this.zzl;
                    } else {
                        str3 = this.zzk;
                    }
                    zzemVarZzj2.zzc("App measurement enabled for app package, google app id", str5, str3);
                }
                this.zzh = null;
                this.zzs.zzaw();
                listZzp = this.zzs.zzf().zzp("analytics.safelisted_events");
                if (listZzp != null) {
                    this.zzh = listZzp;
                } else if (listZzp.isEmpty()) {
                    this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZzp.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzh = listZzp;
                        }
                    } while (this.zzs.zzv().zzab("safelisted event", (String) it.next()));
                }
                if (packageManager != null) {
                    this.zzj = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
                } else {
                    this.zzj = 0;
                }
            }
            this.zzs.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeo.zzn(packageName));
            strZzc = zzij.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
            this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
            if (!TextUtils.isEmpty(strZzc)) {
                contextZzau = this.zzs.zzau();
                strZzz = this.zzs.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources2 = contextZzau.getResources();
                if (!TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfq.zza(contextZzau);
                }
                this.zzl = zzfq.zzb("admob_app_id", resources2, strZzz);
            }
            if (iZza == 0) {
                zzem zzemVarZzj3 = this.zzs.zzay().zzj();
                String str6 = this.zza;
                if (TextUtils.isEmpty(this.zzk)) {
                    str3 = this.zzl;
                } else {
                    str3 = this.zzk;
                }
                zzemVarZzj3.zzc("App measurement enabled for app package, google app id", str6, str3);
            }
        } catch (IllegalStateException e10) {
            this.zzs.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeo.zzn(packageName), e10);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str4;
        this.zzc = i10;
        this.zze = string;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzs.zzw())) {
            objArr = false;
        } else {
            objArr = false;
        }
        iZza = this.zzs.zza();
        zzeoVarZzay = this.zzs.zzay();
        switch (iZza) {
            case 0:
                zzemVarZzj = zzeoVarZzay.zzj();
                str2 = "App measurement collection enabled";
                break;
            case 1:
                zzemVarZzj = zzeoVarZzay.zzi();
                str2 = "App measurement deactivated via the manifest";
                break;
            case 2:
                zzemVarZzj = zzeoVarZzay.zzj();
                str2 = "App measurement deactivated via the init parameters";
                break;
            case 3:
                zzemVarZzj = zzeoVarZzay.zzi();
                str2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                break;
            case 4:
                zzemVarZzj = zzeoVarZzay.zzi();
                str2 = "App measurement disabled via the manifest";
                break;
            case 5:
                zzemVarZzj = zzeoVarZzay.zzj();
                str2 = "App measurement disabled via the init parameters";
                break;
            case 6:
                zzemVarZzj = zzeoVarZzay.zzl();
                str2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                break;
            case 7:
                zzemVarZzj = zzeoVarZzay.zzi();
                str2 = "App measurement disabled via the global data collection setting";
                break;
            default:
                zzemVarZzj = zzeoVarZzay.zzi();
                str2 = "App measurement disabled due to denied storage consent";
                break;
        }
        zzemVarZzj.zza(str2);
        this.zzk = "";
        this.zzl = "";
        this.zzs.zzaw();
        if (objArr != false) {
            this.zzl = this.zzs.zzw();
        }
        this.zzh = null;
        this.zzs.zzaw();
        listZzp = this.zzs.zzf().zzp("analytics.safelisted_events");
        if (listZzp != null) {
            this.zzh = listZzp;
        } else if (listZzp.isEmpty()) {
            this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listZzp.iterator();
            do {
                if (it.hasNext()) {
                    this.zzh = listZzp;
                }
            } while (this.zzs.zzv().zzab("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.zzj = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
        } else {
            this.zzj = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    public final zzq zzj(String str) {
        String str2;
        List list;
        String str3;
        String str4;
        zzem zzemVarZzm;
        String str5;
        zzg();
        String strZzl = zzl();
        String strZzm = zzm();
        zza();
        String str6 = this.zzb;
        zza();
        long j10 = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str7 = this.zzd;
        this.zzs.zzf().zzh();
        zza();
        zzg();
        long j11 = this.zzf;
        long jZzp = 0;
        if (j11 == 0) {
            zzlh zzlhVarZzv = this.zzs.zzv();
            Context contextZzau = this.zzs.zzau();
            String packageName = this.zzs.zzau().getPackageName();
            zzlhVarZzv.zzg();
            Preconditions.checkNotNull(contextZzau);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzau.getPackageManager();
            MessageDigest messageDigestZzF = zzlh.zzF();
            if (messageDigestZzF == null) {
                a.a(zzlhVarZzv.zzs, "Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (!zzlhVarZzv.zzag(contextZzau, packageName)) {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzau).getPackageInfo(zzlhVarZzv.zzs.zzau().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzlhVarZzv.zzs.zzay().zzk().zza("Could not get signatures");
                            } else {
                                jZzp = zzlh.zzp(messageDigestZzF.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        zzlhVarZzv.zzs.zzay().zzd().zzb("Package name not found", e10);
                    }
                }
                this.zzf = jZzp;
            }
            jZzp = -1;
            this.zzf = jZzp;
        } else {
            jZzp = j11;
        }
        boolean zZzJ = this.zzs.zzJ();
        boolean z10 = !this.zzs.zzm().zzk;
        zzg();
        if (this.zzs.zzJ()) {
            zzpf.zzc();
            if (this.zzs.zzf().zzs(null, zzeb.zzaa)) {
                this.zzs.zzay().zzj().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.zzs.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzs.zzau());
                            if (objInvoke == null) {
                                str4 = null;
                            } else {
                                try {
                                    str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    zzemVarZzm = this.zzs.zzay().zzl();
                                    str5 = "Failed to retrieve Firebase Instance Id";
                                    zzemVarZzm.zza(str5);
                                    str4 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            zzemVarZzm = this.zzs.zzay().zzm();
                            str5 = "Failed to obtain Firebase Analytics instance";
                        }
                        str2 = str4;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzfy zzfyVar = this.zzs;
        long jZza = zzfyVar.zzm().zzc.zza();
        long jMin = jZza == 0 ? zzfyVar.zzc : Math.min(zzfyVar.zzc, jZza);
        zza();
        int i10 = this.zzj;
        boolean zZzr = this.zzs.zzf().zzr();
        zzfd zzfdVarZzm = this.zzs.zzm();
        zzfdVarZzm.zzg();
        boolean z11 = zzfdVarZzm.zza().getBoolean("deferred_analytics_collection", false);
        zza();
        String str8 = this.zzl;
        Boolean boolZzk = this.zzs.zzf().zzk("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolZzk == null ? null : Boolean.valueOf(!boolZzk.booleanValue());
        long j12 = this.zzg;
        List list2 = this.zzh;
        String strZzh = this.zzs.zzm().zzc().zzh();
        if (this.zzi == null) {
            this.zzi = this.zzs.zzf().zzs(null, zzeb.zzax) ? this.zzs.zzv().zzC() : "";
        }
        String str9 = this.zzi;
        zzoz.zzc();
        String str10 = null;
        if (this.zzs.zzf().zzs(null, zzeb.zzas)) {
            zzg();
            if (this.zzn == 0) {
                list = list2;
                str3 = str8;
            } else {
                list = list2;
                str3 = str8;
                long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis() - this.zzn;
                if (this.zzm != null && jCurrentTimeMillis > 86400000 && this.zzo == null) {
                    zzo();
                }
            }
            if (this.zzm == null) {
                zzo();
            }
            str10 = this.zzm;
        } else {
            list = list2;
            str3 = str8;
        }
        return new zzq(strZzl, strZzm, str6, j10, str7, 73000L, jZzp, str, zZzJ, z10, str2, 0L, jMin, i10, zZzr, z11, str3, boolValueOf, j12, list, (String) null, strZzh, str9, str10);
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String str;
        zzg();
        if (this.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzs.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzs.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzem zzemVarZzc = this.zzs.zzay().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzemVarZzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = str;
        this.zzn = this.zzs.zzav().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.zzo = str;
        return z10;
    }
}
