package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f25525a = new k0();

    @SuppressLint({"WrongConstant"})
    public final void a(Context context) throws n60 {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.yandex.mobile.ads.common.AdActivity"), 0);
            fd.j0.h(activityInfo, "context.packageManager.g…ityInfo(componentName, 0)");
            Objects.requireNonNull(this.f25525a);
            k0.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new n60("There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.");
        }
    }
}
