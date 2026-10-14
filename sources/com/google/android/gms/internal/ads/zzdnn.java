package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnn implements zzcwb {
    private final zzcez zza;

    public zzdnn(zzcez zzcezVar) {
        this.zza = zzcezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzbn(Context context) {
        zzcez zzcezVar = this.zza;
        if (zzcezVar != null) {
            zzcezVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzbp(Context context) {
        zzcez zzcezVar = this.zza;
        if (zzcezVar != null) {
            zzcezVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzbq(Context context) {
        zzcez zzcezVar = this.zza;
        if (zzcezVar != null) {
            zzcezVar.onResume();
        }
    }
}
