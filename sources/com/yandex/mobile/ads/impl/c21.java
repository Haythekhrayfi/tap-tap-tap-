package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class c21 {
    public static final boolean a(Context context, AdResponse<?> adResponse, SizeInfo sizeInfo, c6 c6Var, SizeInfo sizeInfo2) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(sizeInfo, "responseSizeInfo");
        fd.j0.i(c6Var, "adSizeValidator");
        fd.j0.i(sizeInfo2, "containerSizeInfo");
        return adResponse.H() || (c6Var.a(context, sizeInfo) && v6.a(context, sizeInfo, sizeInfo2));
    }
}
