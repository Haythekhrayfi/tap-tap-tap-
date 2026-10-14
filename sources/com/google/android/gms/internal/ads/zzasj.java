package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasj extends zzath {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzasj(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "iZXNXN9xUbn1GVaYCV3sL1wKWUe/HGVr+Kc3Vh94EyUz5Y8L5QIgpXYgDdLj2Tdj", "bBmsyCj4vQqoPhkiTKWAfAhlVNxJgrtws7pZHadifrc=", zzanqVar, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzo(zzi.longValue());
        }
    }
}
