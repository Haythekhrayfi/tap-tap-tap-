package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o41 implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lm f23692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f23694c = Uri.EMPTY;

    public o41(lm lmVar) {
        this.f23692a = (lm) pa.a(lmVar);
        Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws IOException {
        this.f23694c = pmVar.f24101a;
        Collections.emptyMap();
        long jA = this.f23692a.a(pmVar);
        Uri uriD = this.f23692a.d();
        Objects.requireNonNull(uriD);
        this.f23694c = uriD;
        this.f23692a.b();
        return jA;
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
        Objects.requireNonNull(g81Var);
        this.f23692a.a(g81Var);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        return this.f23692a.b();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() throws IOException {
        this.f23692a.close();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f23692a.d();
    }

    public final long f() {
        return this.f23693b;
    }

    public final Uri g() {
        return this.f23694c;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f23692a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f23693b += (long) i12;
        }
        return i12;
    }
}
