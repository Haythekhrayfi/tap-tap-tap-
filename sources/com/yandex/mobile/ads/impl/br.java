package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class br implements j71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19315a = new byte[4096];

    @Override // com.yandex.mobile.ads.impl.j71
    public final int a(im imVar, int i10, boolean z10) throws IOException {
        int i11 = imVar.read(this.f19315a, 0, Math.min(this.f19315a.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final void a(long j10, int i10, int i11, int i12, j71.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final void a(yv yvVar) {
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final void b(int i10, mp0 mp0Var) {
        mp0Var.f(i10);
    }
}
