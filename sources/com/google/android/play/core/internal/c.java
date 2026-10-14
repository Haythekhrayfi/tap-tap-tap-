package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12282c;

    public c(FileChannel fileChannel, long j10, long j11) {
        this.f12280a = fileChannel;
        this.f12281b = j10;
        this.f12282c = j11;
    }

    @Override // com.google.android.play.core.internal.b
    public final long a() {
        return this.f12282c;
    }

    @Override // com.google.android.play.core.internal.b
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f12280a.map(FileChannel.MapMode.READ_ONLY, this.f12281b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
