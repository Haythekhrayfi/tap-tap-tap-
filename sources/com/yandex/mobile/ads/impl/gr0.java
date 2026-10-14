package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21141a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f21142b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f21143a;

        static {
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f21143a = logSessionId;
        }
    }

    static {
        if (da1.f19803a < 31) {
            new gr0();
        } else {
            int i10 = a.f21142b;
        }
    }

    public gr0() {
        this((a) null);
        pa.b(da1.f19803a < 31);
    }

    public gr0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private gr0(a aVar) {
        this.f21141a = aVar;
    }

    public final LogSessionId a() {
        a aVar = this.f21141a;
        Objects.requireNonNull(aVar);
        return aVar.f21143a;
    }
}
