package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    public static Intent a() {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        return intent;
    }
}
