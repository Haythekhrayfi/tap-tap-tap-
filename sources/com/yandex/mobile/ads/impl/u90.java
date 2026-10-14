package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u90 {
    public static Boolean a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return a(context, R.string.yandex_mobileads_age_restricted_user);
    }

    private static Boolean a(Context context, int i10) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            String string = context.getResources().getString(i10);
            fd.j0.h(string, "context.resources.getString(flagNameResource)");
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable th) {
                x60.a(th, th.getMessage(), new Object[0]);
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(string)) {
                Object obj = bundle.get(string);
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                return null;
            }
        } catch (Throwable th2) {
            x60.a(th2, th2.getMessage(), new Object[0]);
        }
        return null;
    }

    public static boolean b(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Boolean boolA = a(context, R.string.yandex_mobileads_automatic_sdk_initialization);
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return true;
    }
}
