package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
final class zzcaw implements Runnable {
    public final /* synthetic */ MediaPlayer zza;
    public final /* synthetic */ zzcbe zzb;

    public zzcaw(zzcbe zzcbeVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcbeVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbe.zzl(this.zzb, this.zza);
        zzcbe zzcbeVar = this.zzb;
        if (zzcbeVar.zzq != null) {
            zzcbeVar.zzq.zzf();
        }
    }
}
