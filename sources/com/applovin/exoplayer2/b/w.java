package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class w implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f4627c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4628d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.a f4629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.a f4630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f.a f4631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f.a f4632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v f4634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f4635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f4636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f4637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f4638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4640p;

    public w() {
        f.a aVar = f.a.f4437a;
        this.f4629e = aVar;
        this.f4630f = aVar;
        this.f4631g = aVar;
        this.f4632h = aVar;
        ByteBuffer byteBuffer = f.f4436a;
        this.f4635k = byteBuffer;
        this.f4636l = byteBuffer.asShortBuffer();
        this.f4637m = byteBuffer;
        this.f4626b = -1;
    }

    public long a(long j10) {
        if (this.f4639o < 1024) {
            return (long) (((double) this.f4627c) * j10);
        }
        long jA = this.f4638n - ((long) ((v) com.applovin.exoplayer2.l.a.b(this.f4634j)).a());
        int i10 = this.f4632h.f4438b;
        int i11 = this.f4631g.f4438b;
        return i10 == i11 ? ai.d(j10, jA, this.f4639o) : ai.d(j10, jA * ((long) i10), this.f4639o * ((long) i11));
    }

    @Override // com.applovin.exoplayer2.b.f
    public f.a a(f.a aVar) throws f.b {
        if (aVar.f4440d != 2) {
            throw new f.b(aVar);
        }
        int i10 = this.f4626b;
        if (i10 == -1) {
            i10 = aVar.f4438b;
        }
        this.f4629e = aVar;
        f.a aVar2 = new f.a(i10, aVar.f4439c, 2);
        this.f4630f = aVar2;
        this.f4633i = true;
        return aVar2;
    }

    public void a(float f10) {
        if (this.f4627c != f10) {
            this.f4627c = f10;
            this.f4633i = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            v vVar = (v) com.applovin.exoplayer2.l.a.b(this.f4634j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f4638n += (long) iRemaining;
            vVar.a(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f4630f.f4438b != -1 && (Math.abs(this.f4627c - 1.0f) >= 1.0E-4f || Math.abs(this.f4628d - 1.0f) >= 1.0E-4f || this.f4630f.f4438b != this.f4629e.f4438b);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void b() {
        v vVar = this.f4634j;
        if (vVar != null) {
            vVar.b();
        }
        this.f4640p = true;
    }

    public void b(float f10) {
        if (this.f4628d != f10) {
            this.f4628d = f10;
            this.f4633i = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        int iD;
        v vVar = this.f4634j;
        if (vVar != null && (iD = vVar.d()) > 0) {
            if (this.f4635k.capacity() < iD) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iD).order(ByteOrder.nativeOrder());
                this.f4635k = byteBufferOrder;
                this.f4636l = byteBufferOrder.asShortBuffer();
            } else {
                this.f4635k.clear();
                this.f4636l.clear();
            }
            vVar.b(this.f4636l);
            this.f4639o += (long) iD;
            this.f4635k.limit(iD);
            this.f4637m = this.f4635k;
        }
        ByteBuffer byteBuffer = this.f4637m;
        this.f4637m = f.f4436a;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean d() {
        v vVar;
        return this.f4640p && ((vVar = this.f4634j) == null || vVar.d() == 0);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void e() {
        if (a()) {
            f.a aVar = this.f4629e;
            this.f4631g = aVar;
            f.a aVar2 = this.f4630f;
            this.f4632h = aVar2;
            if (this.f4633i) {
                this.f4634j = new v(aVar.f4438b, aVar.f4439c, this.f4627c, this.f4628d, aVar2.f4438b);
            } else {
                v vVar = this.f4634j;
                if (vVar != null) {
                    vVar.c();
                }
            }
        }
        this.f4637m = f.f4436a;
        this.f4638n = 0L;
        this.f4639o = 0L;
        this.f4640p = false;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void f() {
        this.f4627c = 1.0f;
        this.f4628d = 1.0f;
        f.a aVar = f.a.f4437a;
        this.f4629e = aVar;
        this.f4630f = aVar;
        this.f4631g = aVar;
        this.f4632h = aVar;
        ByteBuffer byteBuffer = f.f4436a;
        this.f4635k = byteBuffer;
        this.f4636l = byteBuffer.asShortBuffer();
        this.f4637m = byteBuffer;
        this.f4626b = -1;
        this.f4633i = false;
        this.f4634j = null;
        this.f4638n = 0L;
        this.f4639o = 0L;
        this.f4640p = false;
    }
}
