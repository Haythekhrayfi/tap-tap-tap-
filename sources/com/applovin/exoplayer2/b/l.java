package com.applovin.exoplayer2.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.a f4498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f.a f4499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.a f4500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.a f4501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f4502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f4503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4504h;

    public l() {
        ByteBuffer byteBuffer = f.f4436a;
        this.f4502f = byteBuffer;
        this.f4503g = byteBuffer;
        f.a aVar = f.a.f4437a;
        this.f4500d = aVar;
        this.f4501e = aVar;
        this.f4498b = aVar;
        this.f4499c = aVar;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final f.a a(f.a aVar) throws f.b {
        this.f4500d = aVar;
        this.f4501e = b(aVar);
        return a() ? this.f4501e : f.a.f4437a;
    }

    public final ByteBuffer a(int i10) {
        if (this.f4502f.capacity() < i10) {
            this.f4502f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4502f.clear();
        }
        ByteBuffer byteBuffer = this.f4502f;
        this.f4503g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f4501e != f.a.f4437a;
    }

    public f.a b(f.a aVar) throws f.b {
        return f.a.f4437a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void b() {
        this.f4504h = true;
        h();
    }

    @Override // com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f4503g;
        this.f4503g = f.f4436a;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean d() {
        return this.f4504h && this.f4503g == f.f4436a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void e() {
        this.f4503g = f.f4436a;
        this.f4504h = false;
        this.f4498b = this.f4500d;
        this.f4499c = this.f4501e;
        i();
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void f() {
        e();
        this.f4502f = f.f4436a;
        f.a aVar = f.a.f4437a;
        this.f4500d = aVar;
        this.f4501e = aVar;
        this.f4498b = aVar;
        this.f4499c = aVar;
        j();
    }

    public final boolean g() {
        return this.f4503g.hasRemaining();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
