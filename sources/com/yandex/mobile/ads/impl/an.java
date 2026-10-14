package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public class an extends tf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl f19003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f19004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f19007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19009h;

    public static final class a extends IllegalStateException {
        public a(int i10, int i11) {
            super(j1.e.a("Buffer too small (", i10, " < ", i11, ")"));
        }
    }

    static {
        us.a("goog.exo.decoder");
    }

    public an(int i10) {
        this(i10, 0);
    }

    public an(int i10, int i11) {
        this.f19003b = new zl();
        this.f19008g = i10;
        this.f19009h = 0;
    }

    public static an j() {
        return new an(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.tf
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f19004c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f19007f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f19005d = false;
    }

    @EnsuresNonNull({"data"})
    public final void e(int i10) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2;
        int i11 = i10 + this.f19009h;
        ByteBuffer byteBuffer = this.f19004c;
        if (byteBuffer == null) {
            int i12 = this.f19008g;
            if (i12 == 1) {
                byteBufferAllocateDirect2 = ByteBuffer.allocate(i11);
            } else {
                if (i12 != 2) {
                    throw new a(byteBuffer != null ? byteBuffer.capacity() : 0, i11);
                }
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i11);
            }
            this.f19004c = byteBufferAllocateDirect2;
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i11 + iPosition;
        if (iCapacity >= i13) {
            this.f19004c = byteBuffer;
            return;
        }
        int i14 = this.f19008g;
        if (i14 == 1) {
            byteBufferAllocateDirect = ByteBuffer.allocate(i13);
        } else {
            if (i14 != 2) {
                ByteBuffer byteBuffer2 = this.f19004c;
                throw new a(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i13);
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(i13);
        }
        byteBufferAllocateDirect.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferAllocateDirect.put(byteBuffer);
        }
        this.f19004c = byteBufferAllocateDirect;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f19004c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f19007f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean i() {
        return c(1073741824);
    }
}
