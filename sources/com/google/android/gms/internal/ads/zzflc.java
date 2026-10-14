package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflc {
    public final /* synthetic */ zzfld zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzflc(zzfld zzfldVar, byte[] bArr, zzflb zzflbVar) {
        this.zza = zzfldVar;
        this.zzb = bArr;
    }

    public final zzflc zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzflc zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfld zzfldVar = this.zza;
            if (zzfldVar.zzb) {
                zzfldVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }
}
