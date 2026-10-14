package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bh0 f25978a = new bh0();

    public final ExtendedViewContainer a(Context context, List<? extends j20> list) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(list, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context);
        Objects.requireNonNull(this.f25978a);
        extendedViewContainer.setMeasureSpecProvider(new mt0((float) bh0.a(list)));
        return extendedViewContainer;
    }
}
