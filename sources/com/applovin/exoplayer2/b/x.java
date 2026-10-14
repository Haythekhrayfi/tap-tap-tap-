package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class x extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f4645h = ai.f7600f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f4647j;

    public void a(int i10, int i11) {
        this.f4641d = i10;
        this.f4642e = i11;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f4644g);
        this.f4647j += (long) (iMin / this.f4498b.f4441e);
        this.f4644g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f4644g > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f4646i + i11) - this.f4645h.length;
        ByteBuffer byteBufferA = a(length);
        int iA = ai.a(length, 0, this.f4646i);
        byteBufferA.put(this.f4645h, 0, iA);
        int iA2 = ai.a(length - iA, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iA2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iA2;
        int i13 = this.f4646i - iA;
        this.f4646i = i13;
        byte[] bArr = this.f4645h;
        System.arraycopy(bArr, iA, bArr, 0, i13);
        byteBuffer.get(this.f4645h, this.f4646i, i12);
        this.f4646i += i12;
        byteBufferA.flip();
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        if (aVar.f4440d != 2) {
            throw new f.b(aVar);
        }
        this.f4643f = true;
        return (this.f4641d == 0 && this.f4642e == 0) ? f.a.f4437a : aVar;
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        int i10;
        if (super.d() && (i10 = this.f4646i) > 0) {
            a(i10).put(this.f4645h, 0, this.f4646i).flip();
            this.f4646i = 0;
        }
        return super.c();
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public boolean d() {
        return super.d() && this.f4646i == 0;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void h() {
        if (this.f4643f) {
            int i10 = this.f4646i;
            if (i10 > 0) {
                this.f4647j += (long) (i10 / this.f4498b.f4441e);
            }
            this.f4646i = 0;
        }
    }

    @Override // com.applovin.exoplayer2.b.l
    public void i() {
        if (this.f4643f) {
            this.f4643f = false;
            int i10 = this.f4642e;
            int i11 = this.f4498b.f4441e;
            this.f4645h = new byte[i10 * i11];
            this.f4644g = this.f4641d * i11;
        }
        this.f4646i = 0;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void j() {
        this.f4645h = ai.f7600f;
    }

    public void k() {
        this.f4647j = 0L;
    }

    public long l() {
        return this.f4647j;
    }
}
