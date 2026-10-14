package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class de implements zb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zb.a f19839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zb.a f19840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zb.a f19841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zb.a f19842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f19843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f19844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19845h;

    public de() {
        ByteBuffer byteBuffer = zb.f27269a;
        this.f19843f = byteBuffer;
        this.f19844g = byteBuffer;
        zb.a aVar = zb.a.f27270e;
        this.f19841d = aVar;
        this.f19842e = aVar;
        this.f19839b = aVar;
        this.f19840c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final zb.a a(zb.a aVar) throws zb.b {
        this.f19841d = aVar;
        this.f19842e = b(aVar);
        return d() ? this.f19842e : zb.a.f27270e;
    }

    public final ByteBuffer a(int i10) {
        if (this.f19843f.capacity() < i10) {
            this.f19843f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f19843f.clear();
        }
        ByteBuffer byteBuffer = this.f19843f;
        this.f19844g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public boolean a() {
        return this.f19845h && this.f19844g == zb.f27269a;
    }

    public abstract zb.a b(zb.a aVar) throws zb.b;

    @Override // com.yandex.mobile.ads.impl.zb
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f19844g;
        this.f19844g = zb.f27269a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void c() {
        this.f19845h = true;
        g();
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public boolean d() {
        return this.f19842e != zb.a.f27270e;
    }

    public final boolean e() {
        return this.f19844g.hasRemaining();
    }

    public void f() {
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void flush() {
        this.f19844g = zb.f27269a;
        this.f19845h = false;
        this.f19839b = this.f19841d;
        this.f19840c = this.f19842e;
        f();
    }

    public void g() {
    }

    public void h() {
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void reset() {
        flush();
        this.f19843f = zb.f27269a;
        zb.a aVar = zb.a.f27270e;
        this.f19841d = aVar;
        this.f19842e = aVar;
        this.f19839b = aVar;
        this.f19840c = aVar;
        h();
    }
}
