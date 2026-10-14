package com.yandex.mobile.ads.banner;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.jd;
import com.yandex.mobile.ads.impl.nz0;
import com.yandex.mobile.ads.impl.pd;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    public static final AdSize a(Context context, int i10) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nz0 nz0VarA = i01.b().a(context);
        pd pdVarA = pd.a.a(nz0VarA != null ? nz0VarA.e() : null);
        if (pdVarA != null) {
            return new AdSize(i10, jd.a(pdVarA).a(context, i10), 4);
        }
        AdSize adSizeStickySize = AdSize.stickySize(i10);
        j0.h(adSizeStickySize, "stickySize(width)");
        return adSizeStickySize;
    }
}
