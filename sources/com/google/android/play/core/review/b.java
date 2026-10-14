package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.i;

/* JADX INFO: loaded from: classes2.dex */
final class b extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f12321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Handler handler, i iVar) {
        super(handler);
        this.f12321a = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f12321a.b((Object) null);
    }
}
