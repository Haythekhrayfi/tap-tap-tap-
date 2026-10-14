package com.inscode.autoclicker.ui.prepare;

import android.content.ComponentCallbacks;
import fd.f;
import i7.d;
import uc.a;
import vc.b0;
import vc.l;
import yd.h;

/* JADX INFO: loaded from: classes2.dex */
public final class PrepareActivity$special$$inlined$inject$default$1 extends l implements a<d> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ a $parameters;
    public final /* synthetic */ de.a $scope;
    public final /* synthetic */ ComponentCallbacks receiver$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareActivity$special$$inlined$inject$default$1(ComponentCallbacks componentCallbacks, String str, de.a aVar, a aVar2) {
        super(0);
        this.receiver$0 = componentCallbacks;
        this.$name = str;
        this.$scope = aVar;
        this.$parameters = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i7.d, java.lang.Object] */
    @Override // uc.a
    public final d invoke() {
        return f.d(this.receiver$0).f37311a.c(new h(this.$name, b0.a(d.class), this.$scope, this.$parameters));
    }
}
