package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f12240a;

    public a(ByteBuffer byteBuffer) {
        this.f12240a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.internal.b
    public final long a() {
        return this.f12240a.capacity();
    }

    @Override // com.google.android.play.core.internal.b
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f12240a) {
            int i11 = (int) j10;
            this.f12240a.position(i11);
            this.f12240a.limit(i11 + i10);
            byteBufferSlice = this.f12240a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
