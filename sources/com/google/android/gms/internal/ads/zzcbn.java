package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcbn implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzcbo zzb;

    public zzcbn(zzcbo zzcboVar, boolean z10) {
        this.zzb = zzcboVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
