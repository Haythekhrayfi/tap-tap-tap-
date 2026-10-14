package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.sd0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class e extends sd0 {
    public e(k2 k2Var) {
        super(k2Var);
    }

    @Override // com.yandex.mobile.ads.impl.sd0
    public final HashMap a(Context context) {
        HashMap mapA = super.a(context);
        SizeInfo sizeInfoN = this.f25046a.n();
        if (sizeInfoN != null) {
            mapA.put("width", Integer.valueOf(sizeInfoN.c(context)));
            mapA.put("height", Integer.valueOf(sizeInfoN.a(context)));
        }
        return mapA;
    }
}
