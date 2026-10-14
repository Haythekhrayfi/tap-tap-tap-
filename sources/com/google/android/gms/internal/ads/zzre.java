package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class zzre extends Handler {
    public final /* synthetic */ zzrg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzre(zzrg zzrgVar, Looper looper) {
        super(looper);
        this.zza = zzrgVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzrg.zza(this.zza, message);
    }
}
