package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzate extends zzath {
    private final View zzi;

    public zzate(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, View view) {
        super(zzartVar, "ZCuJ2BZ9pjX66HItj5rJVOE3CFRvMlTjLwpTXK/hjirliOmVxPsb2SejOT7YbM4P", "ALSn7l1sKMxPVb0fohyyuRzRspt/TYmvV6oorF8J62I=", zzanqVar, i10, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdb);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjy);
            zzarx zzarxVar = new zzarx((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaol zzaolVarZza = zzaom.zza();
            zzaolVarZza.zzb(zzarxVar.zza.longValue());
            zzaolVarZza.zzd(zzarxVar.zzb.longValue());
            zzaolVarZza.zze(zzarxVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaolVarZza.zzc(zzarxVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaolVarZza.zza(zzarxVar.zzd.longValue());
            }
            this.zze.zzY((zzaom) zzaolVarZza.zzal());
        }
    }
}
