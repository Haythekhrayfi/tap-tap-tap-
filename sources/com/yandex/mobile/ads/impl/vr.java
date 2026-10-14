package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f26067a = new hp();

    public final boolean a(View view, int i10, int i11, int i12, int i13) {
        fd.j0.i(view, "view");
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        hp hpVar = this.f26067a;
        Context context = view.getContext();
        Objects.requireNonNull(hpVar);
        int iA = hp.a(context, 144.0f);
        hp hpVar2 = this.f26067a;
        Context context2 = view.getContext();
        Objects.requireNonNull(hpVar2);
        return i14 >= iA && i15 >= hp.a(context2, 96.0f);
    }
}
