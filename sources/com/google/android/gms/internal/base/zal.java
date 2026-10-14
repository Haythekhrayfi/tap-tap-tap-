package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zal {
    public static final int zaa;

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 33554432;
        if (i10 < 31) {
            if (i10 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
        }
        zaa = i11;
    }

    public static PendingIntent zaa(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getActivity(context, i10, intent, i11);
    }
}
