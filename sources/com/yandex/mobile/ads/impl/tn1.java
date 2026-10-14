package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.InitializationListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tn1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InitializationListener f25422d;

    public /* synthetic */ tn1(InitializationListener initializationListener, int i10) {
        this.f25421c = i10;
        this.f25422d = initializationListener;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25421c) {
        }
        this.f25422d.onInitializationCompleted();
    }
}
