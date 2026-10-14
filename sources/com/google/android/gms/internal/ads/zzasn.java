package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasn extends zzath {
    private final zzaru zzi;

    public zzasn(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, zzaru zzaruVar) {
        super(zzartVar, "gO/haGNVF7sBb6Dp7iKXhg7Swim1l/GlLybMc7sdMRAQTJzM+NV+MpiqlcqP3EHg", "3QFFvrLAbfvZBnCmYb/H5Zm44EsMhBJStIcWOORiyIo=", zzanqVar, i10, 85);
        this.zzi = zzaruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
