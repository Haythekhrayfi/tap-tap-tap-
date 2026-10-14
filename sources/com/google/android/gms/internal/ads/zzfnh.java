package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzfnh extends zzfnx {
    public final /* synthetic */ zzfnq zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzfno zzc;
    public final /* synthetic */ TaskCompletionSource zzd;
    public final /* synthetic */ zzfnj zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnh(zzfnj zzfnjVar, TaskCompletionSource taskCompletionSource, zzfnq zzfnqVar, int i10, zzfno zzfnoVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfnjVar;
        this.zza = zzfnqVar;
        this.zzb = i10;
        this.zzc = zzfnoVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfnt] */
    @Override // com.google.android.gms.internal.ads.zzfnx
    public final void zza() {
        try {
            ?? Zze = this.zze.zza.zze();
            zzfnq zzfnqVar = this.zza;
            String str = this.zze.zzd;
            int i10 = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfnqVar.zzb());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfnqVar.zza());
            Zze.zzg(bundle, new zzfni(this.zze, this.zzc));
        } catch (RemoteException e10) {
            zzfnj.zzb.zzb(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e10));
        }
    }
}
