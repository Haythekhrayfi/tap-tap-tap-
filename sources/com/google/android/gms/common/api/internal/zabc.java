package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class zabc extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            zabe.zaj(this.zaa);
            return;
        }
        if (i10 == 2) {
            zabe.zai(this.zaa);
            return;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Unknown message id: ");
        sb2.append(i10);
        Log.w("GoogleApiClientImpl", sb2.toString());
    }
}
