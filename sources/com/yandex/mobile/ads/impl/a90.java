package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class a90 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f18814d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a90 f18815e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f18816a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ph0 f18817b = new ph0("YandexMobileAds.BaseController");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18818c = 0;

    private a90() {
    }

    public static a90 a() {
        if (f18815e == null) {
            synchronized (f18814d) {
                if (f18815e == null) {
                    f18815e = new a90();
                }
            }
        }
        return f18815e;
    }

    public final Executor b() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f18814d) {
            if (this.f18816a.size() < 4) {
                executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f18817b);
                this.f18816a.add(executorNewSingleThreadExecutor);
            } else {
                executorNewSingleThreadExecutor = (Executor) this.f18816a.get(this.f18818c);
                int i10 = this.f18818c + 1;
                this.f18818c = i10;
                if (i10 == 4) {
                    this.f18818c = 0;
                }
            }
        }
        return executorNewSingleThreadExecutor;
    }
}
