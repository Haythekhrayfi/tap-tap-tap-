package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnd implements zzcwb {
    private final zzfbd zza;

    public zzcnd(zzfbd zzfbdVar) {
        this.zza = zzfbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzbn(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfan e10) {
            zzbzr.zzk("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzbp(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfan e10) {
            zzbzr.zzk("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzbq(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfan e10) {
            zzbzr.zzk("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
