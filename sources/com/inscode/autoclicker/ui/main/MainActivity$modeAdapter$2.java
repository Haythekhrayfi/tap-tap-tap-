package com.inscode.autoclicker.ui.main;

import fd.j0;
import jc.w;
import r6.k;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity$modeAdapter$2 extends l implements uc.l<k, w> {
    public final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$modeAdapter$2(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(k kVar) {
        invoke2(kVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(k kVar) {
        j0.i(kVar, "it");
        MainActivity.onModeItemClick$default(this.this$0, kVar, false, 2, null);
    }
}
