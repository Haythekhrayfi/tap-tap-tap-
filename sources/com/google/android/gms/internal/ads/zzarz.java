package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class zzarz extends BroadcastReceiver {
    public final /* synthetic */ zzasa zza;

    public zzarz(zzasa zzasaVar) {
        this.zza = zzasaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
