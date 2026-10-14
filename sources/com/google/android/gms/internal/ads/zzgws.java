package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgws {
    private static String zza;

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    public static String zza(Context context) {
        String str;
        String str2 = zza;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str3 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            zza = null;
        } else {
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else if (TextUtils.isEmpty(str3)) {
                str = "com.android.chrome";
                if (!arrayList.contains("com.android.chrome")) {
                    str = "com.chrome.beta";
                    if (!arrayList.contains("com.chrome.beta")) {
                        str = "com.chrome.dev";
                        if (!arrayList.contains("com.chrome.dev")) {
                            str = "com.google.android.apps.chrome";
                            if (arrayList.contains("com.google.android.apps.chrome")) {
                            }
                        }
                    }
                }
            } else {
                try {
                    List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                        Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ResolveInfo next = it.next();
                                IntentFilter intentFilter = next.filter;
                                if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                                }
                            } else if (arrayList.contains(str3)) {
                                zza = str3;
                            }
                            str = "com.android.chrome";
                            if (!arrayList.contains("com.android.chrome")) {
                                str = "com.chrome.beta";
                                if (!arrayList.contains("com.chrome.beta")) {
                                    str = "com.chrome.dev";
                                    if (!arrayList.contains("com.chrome.dev")) {
                                        str = "com.google.android.apps.chrome";
                                        if (arrayList.contains("com.google.android.apps.chrome")) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (arrayList.contains(str3)) {
                        zza = str3;
                    } else {
                        str = "com.android.chrome";
                        if (!arrayList.contains("com.android.chrome")) {
                            str = "com.chrome.beta";
                            if (!arrayList.contains("com.chrome.beta")) {
                                str = "com.chrome.dev";
                                if (!arrayList.contains("com.chrome.dev")) {
                                    str = "com.google.android.apps.chrome";
                                    if (arrayList.contains("com.google.android.apps.chrome")) {
                                    }
                                }
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
            }
            zza = str;
        }
        return zza;
    }
}
