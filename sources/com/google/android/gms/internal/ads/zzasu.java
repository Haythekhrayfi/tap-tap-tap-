package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasu extends zzath {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzasu(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "2m6PXcXEiAGusXS1ajjgFu9K1U9p6obL/gDG6se9LFdmc45IuOdD+G2rJwfF1UCD", "fUXpTL496nlEwFWDjJss3QGGSMP1brRky/zh6LpetKA=", zzanqVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
