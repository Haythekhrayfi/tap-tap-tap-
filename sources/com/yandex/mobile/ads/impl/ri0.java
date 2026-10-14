package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class ri0 extends xd<cj0> {
    public ri0(Context context, ww0<cj0> ww0Var, k2 k2Var, String str, String str2, ke.a<AdResponse<cj0>> aVar) {
        super(context, k2Var, str, str2, new yi0(ww0Var), aVar, new bj0());
    }

    @Override // com.yandex.mobile.ads.impl.xd
    public final boolean b(wm0 wm0Var, int i10) {
        if (200 == i10) {
            byte[] bArr = wm0Var.f26320b;
            if (bArr != null && bArr.length > 0) {
                return true;
            }
        }
        return 204 == i10;
    }
}
