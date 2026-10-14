package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class t90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n61 f25291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f25292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f25293c;

    public t90(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f25291a = new n61();
        this.f25292b = context.getApplicationContext();
        this.f25293c = new AtomicBoolean();
    }

    public final void a() {
        if (u6.a(this.f25292b)) {
            Objects.requireNonNull(this.f25291a);
            if (n61.a() || this.f25293c.getAndSet(true)) {
                return;
            }
            o60.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
