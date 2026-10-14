package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e61 implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lm f20083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final km f20084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20086d;

    public e61(lm lmVar, gg ggVar) {
        this.f20083a = (lm) pa.a(lmVar);
        this.f20084b = (km) pa.a(ggVar);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws IOException {
        long jA = this.f20083a.a(pmVar);
        this.f20086d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (pmVar.f24107g == -1 && jA != -1) {
            pmVar = pmVar.a(jA);
        }
        this.f20085c = true;
        this.f20084b.a(pmVar);
        return this.f20086d;
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
        Objects.requireNonNull(g81Var);
        this.f20083a.a(g81Var);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        return this.f20083a.b();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() throws IOException {
        try {
            this.f20083a.close();
        } finally {
            if (this.f20085c) {
                this.f20085c = false;
                this.f20084b.close();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f20083a.d();
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f20086d == 0) {
            return -1;
        }
        int i12 = this.f20083a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f20084b.write(bArr, i10, i12);
            long j10 = this.f20086d;
            if (j10 != -1) {
                this.f20086d = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
