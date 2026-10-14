package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class t extends l {
    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f4498b.f4440d;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else if (i11 != 268435456) {
            if (i11 != 536870912) {
                if (i11 != 805306368) {
                    throw new IllegalStateException();
                }
                i10 /= 2;
            } else {
                i10 /= 3;
                i10 *= 2;
            }
        }
        ByteBuffer byteBufferA = a(i10);
        int i12 = this.f4498b.f4440d;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sA = (short) (ai.a(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferA.put((byte) (sA & 255));
                byteBufferA.put((byte) ((sA >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                byteBufferA.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        int i10 = aVar.f4440d;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new f.a(aVar.f4438b, aVar.f4439c, 2) : f.a.f4437a;
        }
        throw new f.b(aVar);
    }
}
