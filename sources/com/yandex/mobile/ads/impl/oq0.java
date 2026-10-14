package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class oq0 implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oq0 f23873a = new oq0();

    static {
        yn1 yn1Var = yn1.f26964x;
    }

    private oq0() {
    }

    public static /* synthetic */ oq0 f() {
        return new oq0();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() {
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
