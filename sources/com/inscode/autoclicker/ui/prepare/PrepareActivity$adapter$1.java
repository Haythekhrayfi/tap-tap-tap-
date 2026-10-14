package com.inscode.autoclicker.ui.prepare;

import android.view.View;
import fd.j0;
import jc.w;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PrepareActivity$adapter$1 extends l implements p<View, PrepareScreen, w> {
    public final /* synthetic */ PrepareActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareActivity$adapter$1(PrepareActivity prepareActivity) {
        super(2);
        this.this$0 = prepareActivity;
    }

    @Override // uc.p
    public /* bridge */ /* synthetic */ w invoke(View view, PrepareScreen prepareScreen) {
        invoke2(view, prepareScreen);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view, PrepareScreen prepareScreen) {
        j0.i(view, "itemView");
        j0.i(prepareScreen, "item");
        this.this$0.bindScreen(view, prepareScreen);
    }
}
