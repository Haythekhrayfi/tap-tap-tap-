package com.inscode.autoclicker.ui.dialogs;

import vc.b0;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsDialogs$Companion$showCreateShortcutDialog$1$appSettings$1$special$$inlined$inject$default$1 extends l implements uc.a<r6.e> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ uc.a $parameters;
    public final /* synthetic */ de.a $scope;
    public final /* synthetic */ le.a receiver$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsDialogs$Companion$showCreateShortcutDialog$1$appSettings$1$special$$inlined$inject$default$1(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
        super(0);
        this.receiver$0 = aVar;
        this.$name = str;
        this.$scope = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
    @Override // uc.a
    public final r6.e invoke() {
        return this.receiver$0.getKoin().f37311a.c(new yd.h(this.$name, b0.a(r6.e.class), this.$scope, this.$parameters));
    }
}
