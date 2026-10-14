package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfmd;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends zzfmd {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzp();
            zzs.zzI(com.google.android.gms.ads.internal.zzt.zzo().zzc(), th);
            throw th;
        }
    }
}
