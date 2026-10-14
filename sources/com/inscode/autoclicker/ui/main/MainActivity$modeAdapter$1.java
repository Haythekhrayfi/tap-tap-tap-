package com.inscode.autoclicker.ui.main;

import android.view.View;
import fd.j0;
import jc.w;
import r6.k;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity$modeAdapter$1 extends l implements p<View, k, w> {
    public final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$modeAdapter$1(MainActivity mainActivity) {
        super(2);
        this.this$0 = mainActivity;
    }

    @Override // uc.p
    public /* bridge */ /* synthetic */ w invoke(View view, k kVar) {
        invoke2(view, kVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view, k kVar) {
        j0.i(view, "itemView");
        j0.i(kVar, "item");
        this.this$0.bindModeItem(view, kVar);
    }
}
