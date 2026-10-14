package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import fd.j0;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$2 extends l implements uc.l<u6.a, w> {
    public final /* synthetic */ AlertDialog $dialog;
    public final /* synthetic */ uc.l<u6.a, w> $onLoadListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$2(uc.l<? super u6.a, w> lVar, AlertDialog alertDialog) {
        super(1);
        this.$onLoadListener = lVar;
        this.$dialog = alertDialog;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(u6.a aVar) {
        invoke2(aVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(u6.a aVar) {
        j0.i(aVar, "it");
        this.$onLoadListener.invoke(aVar);
        this.$dialog.dismiss();
    }
}
