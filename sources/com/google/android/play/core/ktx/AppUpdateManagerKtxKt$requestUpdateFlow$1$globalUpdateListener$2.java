package com.google.android.play.core.ktx;

import fd.j0;
import hd.p;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends l implements uc.l<AppUpdatePassthroughListener, w> {
    public final /* synthetic */ p $this_callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(p pVar) {
        super(1);
        this.$this_callbackFlow = pVar;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        invoke2(appUpdatePassthroughListener);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        j0.j(appUpdatePassthroughListener, "$receiver");
        this.$this_callbackFlow.v(null);
    }
}
