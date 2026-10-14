package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xn1 implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26570e;

    public /* synthetic */ xn1(String str, boolean z10, int i10) {
        this.f26568c = i10;
        this.f26569d = str;
        this.f26570e = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f26568c) {
            case 0:
                return ea1.a(this.f26569d, this.f26570e, runnable);
            default:
                return Util.m139threadFactory$lambda1(this.f26569d, this.f26570e, runnable);
        }
    }
}
