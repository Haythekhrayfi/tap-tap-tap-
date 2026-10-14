package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zacz extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(zada zadaVar, Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Status statusZaa;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String strValueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            }
            StringBuilder sb2 = new StringBuilder(70);
            sb2.append("TransformationResultHandler received unknown message type: ");
            sb2.append(i10);
            Log.e("TransformedResultImpl", sb2.toString());
            return;
        }
        PendingResult<?> pendingResult = (PendingResult) message.obj;
        synchronized (this.zaa.zae) {
            zada zadaVar = (zada) Preconditions.checkNotNull(this.zaa.zab);
            if (pendingResult == null) {
                statusZaa = new Status(13, "Transform returned null");
            } else if (pendingResult instanceof zacp) {
                statusZaa = ((zacp) pendingResult).zaa();
            } else {
                zadaVar.zai(pendingResult);
            }
            zadaVar.zaj(statusZaa);
        }
    }
}
