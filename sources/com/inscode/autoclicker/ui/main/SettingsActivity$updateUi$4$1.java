package com.inscode.autoclicker.ui.main;

import java.util.Objects;
import jc.w;
import k7.g;
import r6.i;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsActivity$updateUi$4$1 extends l implements uc.l<Double, w> {
    public final /* synthetic */ SettingsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsActivity$updateUi$4$1(SettingsActivity settingsActivity) {
        super(1);
        this.this$0 = settingsActivity;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(Double d10) {
        invoke(d10.doubleValue());
        return w.f31842a;
    }

    public final void invoke(double d10) {
        r6.e appSettings = this.this$0.getAppSettings();
        Objects.requireNonNull(appSettings);
        g.b("layout_size", Double.valueOf(d10));
        appSettings.f35179a.d(new i(d10));
    }
}
