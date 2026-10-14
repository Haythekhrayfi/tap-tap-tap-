package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class p extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f4564d = Float.floatToIntBits(Float.NaN);

    private static void a(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f4564d) {
            iFloatToIntBits = Float.floatToIntBits(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f4498b.f4440d;
        if (i11 == 536870912) {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferA);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i10);
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferA);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        int i10 = aVar.f4440d;
        if (ai.e(i10)) {
            return i10 != 4 ? new f.a(aVar.f4438b, aVar.f4439c, 4) : f.a.f4437a;
        }
        throw new f.b(aVar);
    }
}
