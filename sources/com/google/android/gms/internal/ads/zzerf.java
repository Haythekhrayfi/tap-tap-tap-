package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzerf implements zzeqy {
    private final zzfwn zza;
    private final Context zzb;

    public zzerf(zzfwn zzfwnVar, Context context) {
        this.zza = zzfwnVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzere
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0140  */
    /* JADX WARN: Code duplicated, block: B:8:0x0061  */
    public final /* synthetic */ zzerd zzc() throws Exception {
        ActivityInfo activityInfo;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        boolean z10;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        boolean zZzr = zzbzk.zzr();
        boolean zIsLatchsky = DeviceProperties.isLatchsky(this.zzb);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(this.zzb);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i10 = 0; i10 < localeList.size(); i10++) {
            arrayList.add(localeList.get(i10).getLanguage());
        }
        Context context = this.zzb;
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    str = packageInfo.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
            } else {
                str2 = null;
            }
        } catch (Exception unused2) {
        }
        String str4 = Build.FINGERPRINT;
        Context context2 = this.zzb;
        if (packageManager != null) {
            str3 = str2;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                zEquals = false;
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= listQueryIntentActivities.size()) {
                    zEquals = false;
                    break;
                }
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i11).activityInfo.name)) {
                    zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzgws.zza(context2));
                    break;
                }
                i11++;
            }
        } else {
            zEquals = false;
            str3 = str2;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjO)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzx(this.zzb)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return new zzerd(resolveInfoZzd != null, resolveInfoZzd2 != null, country, zZzr, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str4, zEquals, Build.MODEL, availableBytes, z10);
    }
}
