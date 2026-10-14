package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
final class zzev implements Runnable {
    public final /* synthetic */ zzew zza;

    public zzev(zzew zzewVar) {
        this.zza = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzew zzewVar = this.zza;
        if (zzewVar.zza != null) {
            try {
                zzewVar.zza.zze(1);
            } catch (RemoteException e10) {
                zzbzr.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
