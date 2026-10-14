package com.yandex.mobile.ads.impl;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mo1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f23129d;

    public /* synthetic */ mo1(Set set, int i10) {
        this.f23128c = i10;
        if (i10 == 1 || i10 != 2) {
        }
        this.f23129d = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23128c) {
            case 0:
                kf1.e(this.f23129d);
                break;
            case 1:
                kf1.c(this.f23129d);
                break;
            case 2:
                kf1.d(this.f23129d);
                break;
            case 3:
                kf1.a(this.f23129d);
                break;
            default:
                kf1.b(this.f23129d);
                break;
        }
    }
}
