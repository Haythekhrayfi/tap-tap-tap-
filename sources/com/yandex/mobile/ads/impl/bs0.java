package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* JADX INFO: loaded from: classes3.dex */
public enum bs0 {
    f19317b(InstreamAdBreakType.PREROLL),
    f19318c(InstreamAdBreakType.MIDROLL),
    f19319d(InstreamAdBreakType.POSTROLL),
    f19320e("standalone");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19322a;

    bs0(String str) {
        this.f19322a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f19322a;
    }
}
