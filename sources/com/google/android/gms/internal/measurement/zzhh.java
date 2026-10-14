package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzhh {
    public static Object zza(zzhi zzhiVar) {
        try {
            return zzhiVar.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzhiVar.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
