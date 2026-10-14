package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f19265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19267c;

    public final long a(yv yvVar) {
        return Math.max(0L, ((this.f19266b - 529) * 1000000) / yvVar.f27129z) + this.f19265a;
    }

    public final long a(yv yvVar, an anVar) {
        if (this.f19266b == 0) {
            this.f19265a = anVar.f19006e;
        }
        if (this.f19267c) {
            return anVar.f19006e;
        }
        ByteBuffer byteBuffer = anVar.f19004c;
        Objects.requireNonNull(byteBuffer);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iC = rf0.c(i10);
        if (iC == -1) {
            this.f19267c = true;
            this.f19266b = 0L;
            this.f19265a = anVar.f19006e;
            p90.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return anVar.f19006e;
        }
        long jMax = Math.max(0L, ((this.f19266b - 529) * 1000000) / yvVar.f27129z) + this.f19265a;
        this.f19266b += (long) iC;
        return jMax;
    }

    public final void a() {
        this.f19265a = 0L;
        this.f19266b = 0L;
        this.f19267c = false;
    }
}
