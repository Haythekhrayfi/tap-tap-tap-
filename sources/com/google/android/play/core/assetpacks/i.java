package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
final class i extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Handler handler, com.google.android.play.core.tasks.i iVar) {
        super(handler);
        this.f12188b = jVar;
        this.f12187a = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.f12187a.b(-1);
            this.f12188b.f12196h.a(null);
        } else if (i10 != 2) {
            this.f12187a.b((Exception) new AssetPackException(-100));
        } else {
            this.f12187a.b(0);
        }
    }
}
