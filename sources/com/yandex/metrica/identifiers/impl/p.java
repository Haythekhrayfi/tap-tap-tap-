package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Intent f13607a;

    static {
        Intent intent = new Intent("com.yandex.android.advid.IDENTIFIER_SERVICE").setPackage("com.yandex.android.advid");
        j0.h(intent, "Intent(\"com.yandex.andro…om.yandex.android.advid\")");
        f13607a = intent;
    }
}
