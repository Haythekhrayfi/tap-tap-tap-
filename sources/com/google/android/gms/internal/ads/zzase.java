package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzase extends zzath {
    public zzase(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "lLEcLen4XJo/9ctFaIvSh5tcVBsSnbqu0rI+2Kifyh1W1KyZ3vLik/Ze/ZMY2qUv", "//DjFwPNWi1x71lk0qWorofqZI5qNKPVeYTJHiqA44Q=", zzanqVar, i10, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zzf.invoke(null, new Object[0]);
        synchronized (this.zze) {
            this.zze.zzg(str);
        }
    }
}
