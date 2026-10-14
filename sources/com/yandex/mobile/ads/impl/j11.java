package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class j11 extends de {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f21909i = 150000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f21910j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final short f21911k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f21914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f21915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f21919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f21920t;

    public j11(int i10) {
        byte[] bArr = da1.f19808f;
        this.f21914n = bArr;
        this.f21915o = bArr;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        int iLimit2;
        int iLimit3;
        while (byteBuffer.hasRemaining() && !e()) {
            int i10 = this.f21916p;
            if (i10 == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f21914n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f21911k) {
                            int i11 = this.f21912l;
                            iPosition = ((iLimit4 / i11) * i11) + i11;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f21916p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f21919s = true;
                    }
                }
            } else if (i10 == 1) {
                iLimit = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit3 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f21911k) {
                            int i12 = this.f21912l;
                            iLimit3 = (iPosition2 / i12) * i12;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit3 - byteBuffer.position();
                byte[] bArr = this.f21914n;
                int length = bArr.length;
                int i13 = this.f21917q;
                int i14 = length - i13;
                if (iLimit3 >= iLimit || iPosition3 >= i14) {
                    int iMin = Math.min(iPosition3, i14);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f21914n, this.f21917q, iMin);
                    int i15 = this.f21917q + iMin;
                    this.f21917q = i15;
                    byte[] bArr2 = this.f21914n;
                    if (i15 == bArr2.length) {
                        if (this.f21919s) {
                            int i16 = this.f21918r;
                            a(i16).put(bArr2, 0, i16).flip();
                            if (i16 > 0) {
                                this.f21919s = true;
                            }
                            this.f21920t += (long) ((this.f21917q - (this.f21918r * 2)) / this.f21912l);
                        } else {
                            this.f21920t += (long) ((i15 - this.f21918r) / this.f21912l);
                        }
                        byte[] bArr3 = this.f21914n;
                        int i17 = this.f21917q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f21918r);
                        int i18 = this.f21918r - iMin2;
                        System.arraycopy(bArr3, i17 - i18, this.f21915o, 0, i18);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f21915o, i18, iMin2);
                        this.f21917q = 0;
                        this.f21916p = 2;
                    }
                } else {
                    a(i13).put(bArr, 0, i13).flip();
                    if (i13 > 0) {
                        this.f21919s = true;
                    }
                    this.f21917q = 0;
                    this.f21916p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                iLimit = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f21911k) {
                            int i19 = this.f21912l;
                            iLimit2 = (iPosition4 / i19) * i19;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit2);
                this.f21920t += (long) (byteBuffer.remaining() / this.f21912l);
                byte[] bArr4 = this.f21915o;
                int i20 = this.f21918r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f21918r);
                int i21 = this.f21918r - iMin3;
                System.arraycopy(bArr4, i20 - i21, this.f21915o, 0, i21);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f21915o, i21, iMin3);
                if (iLimit2 < iLimit) {
                    byte[] bArr5 = this.f21915o;
                    int i22 = this.f21918r;
                    a(i22).put(bArr5, 0, i22).flip();
                    if (i22 > 0) {
                        this.f21919s = true;
                    }
                    this.f21916p = 0;
                }
            }
            byteBuffer.limit(iLimit);
        }
    }

    public final void a(boolean z10) {
        this.f21913m = z10;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final zb.a b(zb.a aVar) throws zb.b {
        if (aVar.f27273c == 2) {
            return this.f21913m ? aVar : zb.a.f27270e;
        }
        throw new zb.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.de, com.yandex.mobile.ads.impl.zb
    public final boolean d() {
        return this.f21913m;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void f() {
        if (this.f21913m) {
            zb.a aVar = this.f19839b;
            int i10 = aVar.f27274d;
            this.f21912l = i10;
            long j10 = this.f21909i;
            long j11 = aVar.f27271a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.f21914n.length != i11) {
                this.f21914n = new byte[i11];
            }
            int i12 = ((int) ((this.f21910j * j11) / 1000000)) * i10;
            this.f21918r = i12;
            if (this.f21915o.length != i12) {
                this.f21915o = new byte[i12];
            }
        }
        this.f21916p = 0;
        this.f21920t = 0L;
        this.f21917q = 0;
        this.f21919s = false;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void g() {
        int i10 = this.f21917q;
        if (i10 > 0) {
            a(i10).put(this.f21914n, 0, i10).flip();
            if (i10 > 0) {
                this.f21919s = true;
            }
        }
        if (this.f21919s) {
            return;
        }
        this.f21920t += (long) (this.f21918r / this.f21912l);
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void h() {
        this.f21913m = false;
        this.f21918r = 0;
        byte[] bArr = da1.f19808f;
        this.f21914n = bArr;
        this.f21915o = bArr;
    }

    public final long i() {
        return this.f21920t;
    }
}
