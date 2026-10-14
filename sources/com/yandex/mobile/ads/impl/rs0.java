package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f24872a = new f0();

    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        Objects.requireNonNull(this.f24872a);
        return f0.b();
    }
}
