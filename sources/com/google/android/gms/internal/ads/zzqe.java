package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzqe implements zzow {
    public final /* synthetic */ zzqf zza;

    public /* synthetic */ zzqe(zzqf zzqfVar, zzqd zzqdVar) {
        this.zza = zzqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zza(Exception exc) {
        zzer.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzb() {
        zzqf zzqfVar = this.zza;
        if (zzqfVar.zzm != null) {
            zzqfVar.zzm.zzb();
        }
    }
}
