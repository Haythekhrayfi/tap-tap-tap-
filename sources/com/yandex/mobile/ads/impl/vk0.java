package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class vk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj0 f26004a;

    public vk0(Context context) {
        this.f26004a = new gj0(context);
    }

    public final cj0 a(AdResponse<String> adResponse) {
        String strC = adResponse.C();
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return this.f26004a.a(strC);
    }
}
