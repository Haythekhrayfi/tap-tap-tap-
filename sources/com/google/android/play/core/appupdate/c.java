package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
final class c extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11733a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, com.google.android.play.core.tasks.i iVar) {
        super(handler);
        this.f11733a = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        com.google.android.play.core.tasks.i iVar;
        int i11 = 1;
        if (i10 == 1) {
            iVar = this.f11733a;
            i11 = -1;
        } else if (i10 != 2) {
            iVar = this.f11733a;
        } else {
            iVar = this.f11733a;
            i11 = 0;
        }
        iVar.b(Integer.valueOf(i11));
    }
}
