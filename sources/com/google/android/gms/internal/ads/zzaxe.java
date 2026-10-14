package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxe {
    public final /* synthetic */ zzaxf zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzaxe(zzaxf zzaxfVar, byte[] bArr, zzaxd zzaxdVar) {
        this.zza = zzaxfVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzaxf zzaxfVar = this.zza;
            if (zzaxfVar.zzb) {
                zzaxfVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            zzbzr.zzf("Clearcut log failed", e10);
        }
    }

    public final zzaxe zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
