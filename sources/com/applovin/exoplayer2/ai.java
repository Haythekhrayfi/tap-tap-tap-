package com.applovin.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ai extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4225b;

    public ai(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f4224a = z10;
        this.f4225b = i10;
    }

    public static ai a(String str) {
        return new ai(str, null, false, 1);
    }

    public static ai a(String str, Throwable th) {
        return new ai(str, th, true, 0);
    }

    public static ai b(String str, Throwable th) {
        return new ai(str, th, true, 1);
    }
}
