package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class oh extends de {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f23793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f23794j;

    @Override // com.yandex.mobile.ads.impl.zb
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f23794j;
        Objects.requireNonNull(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f19839b.f27274d) * this.f19840c.f27274d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f19839b.f27274d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    public final void a(int[] iArr) {
        this.f23793i = iArr;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final zb.a b(zb.a aVar) throws zb.b {
        int[] iArr = this.f23793i;
        if (iArr == null) {
            return zb.a.f27270e;
        }
        if (aVar.f27273c != 2) {
            throw new zb.b(aVar);
        }
        boolean z10 = aVar.f27272b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f27272b) {
                throw new zb.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new zb.a(aVar.f27271a, iArr.length, 2) : zb.a.f27270e;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void f() {
        this.f23794j = this.f23793i;
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final void h() {
        this.f23794j = null;
        this.f23793i = null;
    }
}
