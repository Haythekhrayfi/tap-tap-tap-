package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemn implements zzeqy {
    private final zzfwn zza;
    private final Context zzb;

    public zzemn(zzfwn zzfwnVar, Context context) {
        this.zza = zzfwnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzemo zzc() throws Exception {
        int iZzk;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = -1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjz)).booleanValue()) {
            iZzk = com.google.android.gms.ads.internal.zzt.zzq().zzk(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iZzk = -1;
        }
        return new zzemo(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iZzk, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzr().zza(), com.google.android.gms.ads.internal.zzt.zzr().zze());
    }
}
