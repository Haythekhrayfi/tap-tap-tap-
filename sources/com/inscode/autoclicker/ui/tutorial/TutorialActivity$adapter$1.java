package com.inscode.autoclicker.ui.tutorial;

import android.view.View;
import fd.j0;
import jc.w;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class TutorialActivity$adapter$1 extends l implements p<View, Tutorial, w> {
    public final /* synthetic */ TutorialActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialActivity$adapter$1(TutorialActivity tutorialActivity) {
        super(2);
        this.this$0 = tutorialActivity;
    }

    @Override // uc.p
    public /* bridge */ /* synthetic */ w invoke(View view, Tutorial tutorial) {
        invoke2(view, tutorial);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view, Tutorial tutorial) {
        j0.i(view, "itemView");
        j0.i(tutorial, "item");
        this.this$0.bindTutorialPage(view, tutorial);
    }
}
