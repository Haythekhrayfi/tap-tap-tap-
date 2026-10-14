package com.inscode.autoclicker.ui.main;

import android.content.ComponentCallbacks;
import fd.f;
import vc.b0;
import vc.l;
import yd.h;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsActivity$special$$inlined$inject$default$1 extends l implements uc.a<r6.e> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ uc.a $parameters;
    public final /* synthetic */ de.a $scope;
    public final /* synthetic */ ComponentCallbacks receiver$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsActivity$special$$inlined$inject$default$1(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
        super(0);
        this.receiver$0 = componentCallbacks;
        this.$name = str;
        this.$scope = aVar;
        this.$parameters = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
    @Override // uc.a
    public final r6.e invoke() {
        return f.d(this.receiver$0).f37311a.c(new h(this.$name, b0.a(r6.e.class), this.$scope, this.$parameters));
    }
}
