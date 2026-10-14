package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import n.i;
import n.k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwt extends k {
    private final WeakReference zza;

    public zzgwt(zzbcn zzbcnVar) {
        this.zza = new WeakReference(zzbcnVar);
    }

    @Override // n.k
    public final void onCustomTabsServiceConnected(ComponentName componentName, i iVar) {
        zzbcn zzbcnVar = (zzbcn) this.zza.get();
        if (zzbcnVar != null) {
            zzbcnVar.zzc(iVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbcn zzbcnVar = (zzbcn) this.zza.get();
        if (zzbcnVar != null) {
            zzbcnVar.zzd();
        }
    }
}
