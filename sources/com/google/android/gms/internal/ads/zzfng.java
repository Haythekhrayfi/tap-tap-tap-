package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzfng extends zzfnx {
    public final /* synthetic */ zzfna zza;
    public final /* synthetic */ zzfno zzb;
    public final /* synthetic */ TaskCompletionSource zzc;
    public final /* synthetic */ zzfnj zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfng(zzfnj zzfnjVar, TaskCompletionSource taskCompletionSource, zzfna zzfnaVar, zzfno zzfnoVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfnjVar;
        this.zza = zzfnaVar;
        this.zzb = zzfnoVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfnt] */
    @Override // com.google.android.gms.internal.ads.zzfnx
    public final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            zzfna zzfnaVar = this.zza;
            String str = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfnaVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfnaVar.zza());
            Zze.zze(bundle, new zzfni(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzfnj.zzb.zzb(e10, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
