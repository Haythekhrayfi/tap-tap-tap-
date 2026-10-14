package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class j81 extends de {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f21995m = da1.f19808f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f21997o;

    public final void a(int i10, int i11) {
        this.f21991i = i10;
        this.f21992j = i11;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f21994l);
        this.f21997o += (long) (iMin / this.f19839b.f27274d);
        this.f21994l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f21994l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f21996n + i11) - this.f21995m.length;
        ByteBuffer byteBufferA = a(length);
        int i12 = this.f21996n;
        int i13 = da1.f19803a;
        int iMax = Math.max(0, Math.min(length, i12));
        byteBufferA.put(this.f21995m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i11));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - iMax2;
        int i15 = this.f21996n - iMax;
        this.f21996n = i15;
        byte[] bArr = this.f21995m;
        System.arraycopy(bArr, iMax, bArr, 0, i15);
        byteBuffer.get(this.f21995m, this.f21996n, i14);
        this.f21996n += i14;
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.de, com.yandex.mobile.ads.impl.zb
    public final boolean a() {
        return super.a() && this.f21996n == 0;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final zb.a b(zb.a aVar) throws zb.b {
        if (aVar.f27273c != 2) {
            throw new zb.b(aVar);
        }
        this.f21993k = true;
        return (this.f21991i == 0 && this.f21992j == 0) ? zb.a.f27270e : aVar;
    }

    @Override // com.yandex.mobile.ads.impl.de, com.yandex.mobile.ads.impl.zb
    public final ByteBuffer b() {
        int i10;
        if (super.a() && (i10 = this.f21996n) > 0) {
            a(i10).put(this.f21995m, 0, this.f21996n).flip();
            this.f21996n = 0;
        }
        return super.b();
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void f() {
        if (this.f21993k) {
            this.f21993k = false;
            int i10 = this.f21992j;
            int i11 = this.f19839b.f27274d;
            this.f21995m = new byte[i10 * i11];
            this.f21994l = this.f21991i * i11;
        }
        this.f21996n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void g() {
        if (this.f21993k) {
            int i10 = this.f21996n;
            if (i10 > 0) {
                this.f21997o += (long) (i10 / this.f19839b.f27274d);
            }
            this.f21996n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void h() {
        this.f21995m = da1.f19808f;
    }

    public final long i() {
        return this.f21997o;
    }

    public final void j() {
        this.f21997o = 0L;
    }
}
