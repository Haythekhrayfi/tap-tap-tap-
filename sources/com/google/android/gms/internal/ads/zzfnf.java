package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzfnf extends zzfnx {
    public final /* synthetic */ zzfnl zza;
    public final /* synthetic */ zzfno zzb;
    public final /* synthetic */ TaskCompletionSource zzc;
    public final /* synthetic */ zzfnj zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnf(zzfnj zzfnjVar, TaskCompletionSource taskCompletionSource, zzfnl zzfnlVar, zzfno zzfnoVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfnjVar;
        this.zza = zzfnlVar;
        this.zzb = zzfnoVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfnt] */
    @Override // com.google.android.gms.internal.ads.zzfnx
    public final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            zzfnj zzfnjVar = this.zzd;
            String str = zzfnjVar.zzd;
            zzfnl zzfnlVar = this.zza;
            String str2 = zzfnjVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfnlVar.zze());
            bundle.putString("adFieldEnifd", zzfnlVar.zzf());
            bundle.putInt("layoutGravity", zzfnlVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfnlVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfnlVar.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (zzfnlVar.zzg() != null) {
                bundle.putString("appId", zzfnlVar.zzg());
            }
            Zze.zzf(str, bundle, new zzfni(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzfnj.zzb.zzb(e10, "show overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
