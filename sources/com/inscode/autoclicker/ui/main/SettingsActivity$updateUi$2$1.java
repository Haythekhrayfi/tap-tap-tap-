package com.inscode.autoclicker.ui.main;

import java.util.Objects;
import jc.w;
import k7.g;
import r6.h;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsActivity$updateUi$2$1 extends l implements uc.l<Integer, w> {
    public final /* synthetic */ SettingsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsActivity$updateUi$2$1(SettingsActivity settingsActivity) {
        super(1);
        this.this$0 = settingsActivity;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(Integer num) {
        invoke(num.intValue());
        return w.f31842a;
    }

    public final void invoke(int i10) {
        r6.e appSettings = this.this$0.getAppSettings();
        Objects.requireNonNull(appSettings);
        g.b("layout_orientation", Integer.valueOf(i10));
        appSettings.f35179a.d(new h(i10));
    }
}
