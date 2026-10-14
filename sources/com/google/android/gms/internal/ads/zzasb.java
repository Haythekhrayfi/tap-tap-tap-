package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzasb implements AppOpsManager.OnOpActiveChangedListener {
    public final /* synthetic */ zzasc zza;

    public zzasb(zzasc zzascVar) {
        this.zza = zzascVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzasc zzascVar;
        boolean z11;
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            zzascVar = this.zza;
            z11 = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzasc zzascVar2 = this.zza;
            if (zzascVar2.zzc > 0 && jCurrentTimeMillis >= zzascVar2.zzc) {
                zzascVar2.zzd = jCurrentTimeMillis - zzascVar2.zzc;
            }
            zzascVar = this.zza;
            z11 = false;
        }
        zzascVar.zze = z11;
    }
}
