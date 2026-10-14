package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
final class zzpw extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ zzpz zza;
    public final /* synthetic */ zzpx zzb;

    public zzpw(zzpx zzpxVar, zzpz zzpzVar) {
        this.zzb = zzpxVar;
        this.zza = zzpzVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzpz zzpzVar = this.zzb.zza;
            if (zzpzVar.zzp == null || !zzpzVar.zzQ) {
                return;
            }
            zzpzVar.zzp.zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzpz zzpzVar = this.zzb.zza;
            if (zzpzVar.zzp == null || !zzpzVar.zzQ) {
                return;
            }
            zzpzVar.zzp.zzb();
        }
    }
}
