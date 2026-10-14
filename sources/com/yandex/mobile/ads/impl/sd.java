package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f25044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f25045b;

    public sd(Context context, k2 k2Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        this.f25044a = k2Var;
        this.f25045b = context.getApplicationContext();
    }

    public final rd a(AdResponse<String> adResponse, SizeInfo sizeInfo) throws xi1 {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(sizeInfo, "configurationSizeInfo");
        try {
            return new rd(this.f25045b, adResponse, this.f25044a, sizeInfo);
        } catch (Throwable unused) {
            throw new xi1();
        }
    }
}
