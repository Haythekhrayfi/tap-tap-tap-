package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class u extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final short f4594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f4597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f4598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4603o;

    public u() {
        this(150000L, 20000L, (short) 1024);
    }

    public u(long j10, long j11, short s10) {
        com.applovin.exoplayer2.l.a.a(j11 <= j10);
        this.f4592d = j10;
        this.f4593e = j11;
        this.f4594f = s10;
        byte[] bArr = ai.f7600f;
        this.f4597i = bArr;
        this.f4598j = bArr;
    }

    private int a(long j10) {
        return (int) ((j10 * ((long) this.f4498b.f4438b)) / 1000000);
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f4601m);
        int i11 = this.f4601m - iMin;
        System.arraycopy(bArr, i10 - i11, this.f4598j, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f4598j, i11, iMin);
    }

    private void a(byte[] bArr, int i10) {
        a(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f4602n = true;
        }
    }

    private void b(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f4597i.length));
        int iG = g(byteBuffer);
        if (iG == byteBuffer.position()) {
            this.f4599k = 1;
        } else {
            byteBuffer.limit(iG);
            e(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void c(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iF = f(byteBuffer);
        int iPosition = iF - byteBuffer.position();
        byte[] bArr = this.f4597i;
        int length = bArr.length;
        int i10 = this.f4600l;
        int i11 = length - i10;
        if (iF < iLimit && iPosition < i11) {
            a(bArr, i10);
            this.f4600l = 0;
            this.f4599k = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f4597i, this.f4600l, iMin);
        int i12 = this.f4600l + iMin;
        this.f4600l = i12;
        byte[] bArr2 = this.f4597i;
        if (i12 == bArr2.length) {
            if (this.f4602n) {
                a(bArr2, this.f4601m);
                this.f4603o += (long) ((this.f4600l - (this.f4601m * 2)) / this.f4595g);
            } else {
                this.f4603o += (long) ((i12 - this.f4601m) / this.f4595g);
            }
            a(byteBuffer, this.f4597i, this.f4600l);
            this.f4600l = 0;
            this.f4599k = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void d(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iF = f(byteBuffer);
        byteBuffer.limit(iF);
        this.f4603o += (long) (byteBuffer.remaining() / this.f4595g);
        a(byteBuffer, this.f4598j, this.f4601m);
        if (iF < iLimit) {
            a(this.f4598j, this.f4601m);
            this.f4599k = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        a(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f4602n = true;
        }
    }

    private int f(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f4594f) {
                int i10 = this.f4595g;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    private int g(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f4594f);
        int i10 = this.f4595g;
        return ((iLimit / i10) * i10) + i10;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f4599k;
            if (i10 == 0) {
                b(byteBuffer);
            } else if (i10 == 1) {
                c(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                d(byteBuffer);
            }
        }
    }

    public void a(boolean z10) {
        this.f4596h = z10;
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f4596h;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        if (aVar.f4440d == 2) {
            return this.f4596h ? aVar : f.a.f4437a;
        }
        throw new f.b(aVar);
    }

    @Override // com.applovin.exoplayer2.b.l
    public void h() {
        int i10 = this.f4600l;
        if (i10 > 0) {
            a(this.f4597i, i10);
        }
        if (this.f4602n) {
            return;
        }
        this.f4603o += (long) (this.f4601m / this.f4595g);
    }

    @Override // com.applovin.exoplayer2.b.l
    public void i() {
        if (this.f4596h) {
            this.f4595g = this.f4498b.f4441e;
            int iA = a(this.f4592d) * this.f4595g;
            if (this.f4597i.length != iA) {
                this.f4597i = new byte[iA];
            }
            int iA2 = a(this.f4593e) * this.f4595g;
            this.f4601m = iA2;
            if (this.f4598j.length != iA2) {
                this.f4598j = new byte[iA2];
            }
        }
        this.f4599k = 0;
        this.f4603o = 0L;
        this.f4600l = 0;
        this.f4602n = false;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void j() {
        this.f4596h = false;
        this.f4601m = 0;
        byte[] bArr = ai.f7600f;
        this.f4597i = bArr;
        this.f4598j = bArr;
    }

    public long k() {
        return this.f4603o;
    }
}
