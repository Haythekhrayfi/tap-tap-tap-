package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f11 {
    public static SharedPreferences a(f11 f11Var, Context context, String str) {
        boolean zIsUserUnlocked;
        SharedPreferences sharedPreferences;
        String str2;
        Objects.requireNonNull(f11Var);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(str, "prefName");
        try {
            Object systemService = context.getSystemService("user");
            fd.j0.g(systemService, "null cannot be cast to non-null type android.os.UserManager");
            zIsUserUnlocked = ((UserManager) systemService).isUserUnlocked();
        } catch (Throwable unused) {
            zIsUserUnlocked = true;
        }
        if (zIsUserUnlocked) {
            sharedPreferences = context.getSharedPreferences(str, 0);
            str2 = "{\n            context.ge…prefName, mode)\n        }";
        } else {
            sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
            str2 = "{\n            context.cr…prefName, mode)\n        }";
        }
        fd.j0.h(sharedPreferences, str2);
        return sharedPreferences;
    }
}
