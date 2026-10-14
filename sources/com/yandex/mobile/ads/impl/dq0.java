package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    private static final List<String> f19970a = kc.l.c("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) throws n60 {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            List listJ = kc.t.J(f19970a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                ArrayList arrayList = (ArrayList) listJ;
                arrayList.removeAll(kc.j.B(strArr));
                if (arrayList.size() <= 0) {
                    return;
                }
                String str = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{listJ}, 1));
                fd.j0.h(str, "format(format, *args)");
                throw new n60(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
