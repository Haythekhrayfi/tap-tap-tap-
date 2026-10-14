package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Intent f13609a;

    static {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid");
        j0.h(intent, "Intent(\"com.uodis.opende…ackage(\"com.huawei.hwid\")");
        f13609a = intent;
    }
}
