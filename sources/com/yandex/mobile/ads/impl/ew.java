package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ew implements yl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20343d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f20344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f20345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20346c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(da1.f19805c)) {
            String str = da1.f19806d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f20343d = z10;
    }

    public ew(UUID uuid, byte[] bArr, boolean z10) {
        this.f20344a = uuid;
        this.f20345b = bArr;
        this.f20346c = z10;
    }
}
