package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfe implements zzeh {
    private Message zza;
    private zzff zzb;

    private zzfe() {
    }

    public /* synthetic */ zzfe(zzfd zzfdVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzff.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzeh
    public final void zza() {
        Message message = this.zza;
        Objects.requireNonNull(message);
        message.sendToTarget();
        zzd();
    }

    public final zzfe zzb(Message message, zzff zzffVar) {
        this.zza = message;
        this.zzb = zzffVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        Objects.requireNonNull(message);
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return zSendMessageAtFrontOfQueue;
    }
}
