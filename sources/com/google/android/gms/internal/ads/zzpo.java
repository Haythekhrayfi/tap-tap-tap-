package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
final class zzpo {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdo zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;

    public zzpo(zzam zzamVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzdo zzdoVar, boolean z10, boolean z11) {
        this.zza = zzamVar;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzdoVar;
    }

    public final long zza(long j10) {
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final AudioTrack zzb(boolean z10, zzk zzkVar, int i10) throws zzov {
        AudioTrack audioTrack;
        try {
            int i11 = zzfj.zza;
            if (i11 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzkVar.zza().zza).setAudioFormat(zzfj.zzs(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i10).setOffloadedPlayback(this.zzc == 1).build();
            } else if (i11 < 21) {
                int i12 = zzkVar.zzc;
                audioTrack = i10 == 0 ? new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1) : new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i10);
            } else {
                audioTrack = new AudioTrack(zzkVar.zza().zza, zzfj.zzs(this.zze, this.zzf, this.zzg), this.zzh, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzov(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzov(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e10);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
