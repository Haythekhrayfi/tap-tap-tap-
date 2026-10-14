package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class rv extends de {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f24875i = Float.floatToIntBits(Float.NaN);

    @Override // com.yandex.mobile.ads.impl.zb
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f19839b.f27273c;
        if (i11 == 536870912) {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == f24875i) {
                    iFloatToIntBits = Float.floatToIntBits(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                byteBufferA.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i10);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == f24875i) {
                    iFloatToIntBits2 = Float.floatToIntBits(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                byteBufferA.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.de
    public final zb.a b(zb.a aVar) throws zb.b {
        int i10 = aVar.f27273c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new zb.a(aVar.f27271a, aVar.f27272b, 4) : zb.a.f27270e;
        }
        throw new zb.b(aVar);
    }
}
