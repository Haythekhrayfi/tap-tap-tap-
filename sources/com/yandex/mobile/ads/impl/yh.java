package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wa f26846a;

    public final void a(View view, String str) {
        fd.j0.i(view, "view");
        fd.j0.i(str, "assetName");
        wa waVar = this.f26846a;
        if (waVar != null) {
            waVar.a(view, str);
        }
    }

    public final void a(wa waVar) {
        fd.j0.i(waVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26846a = waVar;
    }
}
