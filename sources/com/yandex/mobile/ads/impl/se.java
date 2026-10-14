package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class se extends an {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f25053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25055k;

    public se() {
        super(2);
        this.f25055k = 32;
    }

    public final boolean a(an anVar) {
        boolean z10;
        ByteBuffer byteBuffer;
        pa.a(!anVar.i());
        pa.a(!anVar.d());
        pa.a(!anVar.f());
        if (m()) {
            if (this.f25054j < this.f25055k && anVar.e() == e()) {
                ByteBuffer byteBuffer2 = anVar.f19004c;
                if (byteBuffer2 != null && (byteBuffer = this.f19004c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    }
                }
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        int i10 = this.f25054j;
        this.f25054j = i10 + 1;
        if (i10 == 0) {
            this.f19006e = anVar.f19006e;
            if (anVar.g()) {
                d(1);
            }
        }
        if (anVar.e()) {
            d(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = anVar.f19004c;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f19004c.put(byteBuffer3);
        }
        this.f25053i = anVar.f19006e;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.an, com.yandex.mobile.ads.impl.tf
    public final void b() {
        super.b();
        this.f25054j = 0;
    }

    public final void f(int i10) {
        pa.a(i10 > 0);
        this.f25055k = i10;
    }

    public final long k() {
        return this.f25053i;
    }

    public final int l() {
        return this.f25054j;
    }

    public final boolean m() {
        return this.f25054j > 0;
    }
}
