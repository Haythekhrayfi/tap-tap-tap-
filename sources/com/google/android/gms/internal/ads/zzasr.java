package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasr extends zzath {
    private final zzarl zzi;

    public zzasr(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, zzarl zzarlVar) {
        super(zzartVar, "bdLwb+FSMvnkuJhbzKDCMXfu1B/xx4c1DUAXM+xzbUjcDvNDxjFjT1GT/o1T/BYK", "os/73Qwr79ouqjFLpLjJlgtKKsT75hksFSajjoaerIA=", zzanqVar, i10, 94);
        this.zzi = zzarlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzaoe.zza(iIntValue));
        }
    }
}
