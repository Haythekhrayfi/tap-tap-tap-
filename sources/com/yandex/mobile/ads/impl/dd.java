package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class dd implements c6 {
    @Override // com.yandex.mobile.ads.impl.c6
    public final boolean a(Context context, SizeInfo sizeInfo) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sizeInfo, "sizeInfo");
        return sizeInfo.c(context) >= 0 && sizeInfo.a(context) >= 0;
    }
}
