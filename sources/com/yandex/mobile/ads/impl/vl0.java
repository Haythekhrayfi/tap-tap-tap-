package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vl0 implements fd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26013c;

    public vl0(int i10, int i11, String str) {
        this.f26011a = str;
        this.f26012b = i10;
        this.f26013c = i11;
    }

    public final int getAdHeight() {
        return this.f26013c;
    }

    public final int getAdWidth() {
        return this.f26012b;
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    public final String getUrl() {
        return this.f26011a;
    }
}
