package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class zzhr extends BroadcastReceiver implements Runnable {
    public final /* synthetic */ zzht zza;
    private final zzhs zzb;
    private final Handler zzc;

    public zzhr(zzht zzhtVar, Handler handler, zzhs zzhsVar) {
        this.zza = zzhtVar;
        this.zzc = handler;
        this.zzb = zzhsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
