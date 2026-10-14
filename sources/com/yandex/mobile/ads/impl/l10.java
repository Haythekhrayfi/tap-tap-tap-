package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class l10 implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lm f22595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f22597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f22598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22599e;

    public interface a {
    }

    public l10(o41 o41Var, int i10, a aVar) {
        pa.a(i10 > 0);
        this.f22595a = o41Var;
        this.f22596b = i10;
        this.f22597c = aVar;
        this.f22598d = new byte[1];
        this.f22599e = i10;
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
        Objects.requireNonNull(g81Var);
        this.f22595a.a(g81Var);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        return this.f22595a.b();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f22595a.d();
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f22599e == 0) {
            boolean z10 = false;
            if (this.f22595a.read(this.f22598d, 0, 1) != -1) {
                int i12 = (this.f22598d[0] & 255) << 4;
                if (i12 == 0) {
                    z10 = true;
                    break;
                }
                byte[] bArr2 = new byte[i12];
                int i13 = i12;
                int i14 = 0;
                while (true) {
                    if (i13 <= 0) {
                        while (i12 > 0 && bArr2[i12 - 1] == 0) {
                            i12--;
                        }
                        if (i12 > 0) {
                            ((gt0.a) this.f22597c).a(new mp0(i12, bArr2));
                        }
                        z10 = true;
                        break;
                    }
                    int i15 = this.f22595a.read(bArr2, i14, i13);
                    if (i15 == -1) {
                        break;
                    }
                    i14 += i15;
                    i13 -= i15;
                }
            }
            if (!z10) {
                return -1;
            }
            this.f22599e = this.f22596b;
        }
        int i16 = this.f22595a.read(bArr, i10, Math.min(this.f22599e, i11));
        if (i16 != -1) {
            this.f22599e -= i16;
        }
        return i16;
    }
}
