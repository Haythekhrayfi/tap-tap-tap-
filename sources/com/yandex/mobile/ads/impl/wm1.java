package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class wm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final im1 f26324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gw f26326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26327d;

    public wm1(View view, gw gwVar, String str) {
        this.f26324a = new im1(view);
        this.f26325b = view.getClass().getCanonicalName();
        this.f26326c = gwVar;
        this.f26327d = str;
    }

    public final im1 a() {
        return this.f26324a;
    }

    public final String b() {
        return this.f26325b;
    }

    public final gw c() {
        return this.f26326c;
    }

    public final String d() {
        return this.f26327d;
    }
}
