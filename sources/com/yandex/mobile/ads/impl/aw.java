package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class aw implements vt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vt f19068a;

    public aw(xn xnVar) {
        this.f19068a = xnVar;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public long a() {
        return this.f19068a.a();
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void a(int i10) throws IOException {
        this.f19068a.a(i10);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        this.f19068a.a(bArr, i10, i11);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f19068a.a(bArr, 0, i11, z10);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void b(int i10) throws IOException {
        this.f19068a.b(i10);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f19068a.b(bArr, 0, i11, z10);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void c() {
        this.f19068a.c();
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public long e() {
        return this.f19068a.e();
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public long getPosition() {
        return this.f19068a.getPosition();
    }

    @Override // com.yandex.mobile.ads.impl.vt, com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f19068a.read(bArr, i10, i11);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f19068a.readFully(bArr, i10, i11);
    }
}
