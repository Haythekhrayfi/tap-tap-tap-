package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
public final class zzek extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        Bundle bundle = null;
        try {
            bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            str = "Failed to load metadata: Package name not found.";
            zzbzr.zzh(str, e);
        } catch (NullPointerException e11) {
            e = e11;
            str = "Failed to load metadata: Null pointer exception.";
            zzbzr.zzh(str, e);
        }
        zzbnp zzbnpVarZza = zzbnp.zza();
        if (bundle == null) {
            zzbzr.zzg("Metadata was null.");
        } else {
            try {
                String str2 = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        String str3 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str2 != null) {
                            if (!str2.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            zzbzr.zze("Publisher provided Google AdMob App ID in manifest: ".concat(str2));
                            if (bool == null || !bool.booleanValue()) {
                                zzbnpVarZza.zzb(context, str2);
                            }
                        } else {
                            if (TextUtils.isEmpty(str3)) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            zzbzr.zze("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str3)));
                        }
                    } catch (ClassCastException e12) {
                        throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e12);
                    }
                } catch (ClassCastException e13) {
                    throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e13);
                }
            } catch (ClassCastException e14) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e14);
            }
        }
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z11 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z10) {
                zzbzr.zze("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z11) {
                zzbzr.zze("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
