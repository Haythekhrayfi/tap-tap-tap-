package com.applovin.exoplayer2.b;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class m extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f4505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f4506e;

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(this.f4506e);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f4498b.f4441e) * this.f4499c.f4441e);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f4498b.f4441e;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    public void a(int[] iArr) {
        this.f4505d = iArr;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        int[] iArr = this.f4505d;
        if (iArr == null) {
            return f.a.f4437a;
        }
        if (aVar.f4440d != 2) {
            throw new f.b(aVar);
        }
        boolean z10 = aVar.f4439c != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f4439c) {
                throw new f.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new f.a(aVar.f4438b, iArr.length, 2) : f.a.f4437a;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void i() {
        this.f4506e = this.f4505d;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void j() {
        this.f4506e = null;
        this.f4505d = null;
    }
}
