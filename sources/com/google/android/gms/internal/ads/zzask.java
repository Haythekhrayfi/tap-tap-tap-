package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzask extends zzath {
    private final long zzi;

    public zzask(zzart zzartVar, String str, String str2, zzanq zzanqVar, long j10, int i10, int i11) {
        super(zzartVar, "NMP1pkZrrrrQ0P+ZBWjqO+z0j/WpBuzawmkUKjAkUeiPRyMNSyS1dkwhVpRyfOJm", "AZMD/mGrEYmMNAgrqG/aC8rQLooaM7BFn42uxO3SldA=", zzanqVar, i10, 25);
        this.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(jLongValue);
            long j10 = this.zzi;
            if (j10 != 0) {
                this.zze.zzT(jLongValue - j10);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
