package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasd extends zzath {
    private final Activity zzi;
    private final View zzj;

    public zzasd(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, View view, Activity activity) {
        super(zzartVar, "oOIFXcRPpX8LfJq50/GOu7yJ8Zd8cAWeHAa6OVB78FPJKt0W3zZLCFS9LAEUOvnB", "IY/8616zaYO0dHl/DcP0mMorHg57Bu7A3dpF1R9ox9k=", zzanqVar, i10, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcm)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(zBooleanValue));
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
