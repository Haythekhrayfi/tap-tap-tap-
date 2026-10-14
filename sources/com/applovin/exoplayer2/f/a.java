package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.l.ah;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f6176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f6177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f6178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Surface f6182g;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.f.a$a, reason: collision with other inner class name */
    public static final class C0091a implements g.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Supplier<HandlerThread> f6183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Supplier<HandlerThread> f6184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f6185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f6186e;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0091a(final int i10, boolean z10, boolean z11) {
            final int i11 = 0;
            final int i12 = 1;
            this(new Supplier() { // from class: com.applovin.exoplayer2.f.o
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return a.C0091a.b(i10);
                        default:
                            return a.C0091a.a(i10);
                    }
                }
            }, new Supplier() { // from class: com.applovin.exoplayer2.f.o
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return a.C0091a.b(i10);
                        default:
                            return a.C0091a.a(i10);
                    }
                }
            }, z10, z11);
        }

        public C0091a(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z10, boolean z11) {
            this.f6183b = supplier;
            this.f6184c = supplier2;
            this.f6185d = z10;
            this.f6186e = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(a.g(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(a.f(i10));
        }

        @Override // com.applovin.exoplayer2.f.g.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(g.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f6227a.f6237a;
            a aVar2 = null;
            try {
                ah.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    a aVar3 = new a(mediaCodecCreateByCodecName, this.f6183b.get(), this.f6184c.get(), this.f6185d, this.f6186e);
                    try {
                        ah.a();
                        aVar3.a(aVar.f6228b, aVar.f6230d, aVar.f6231e, aVar.f6232f, aVar.f6233g);
                        return aVar3;
                    } catch (Exception e10) {
                        e = e10;
                        aVar2 = aVar3;
                        if (aVar2 != null) {
                            aVar2.e();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    private a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f6176a = mediaCodec;
        this.f6177b = new c(handlerThread);
        this.f6178c = new b(mediaCodec, handlerThread2, z10);
        this.f6179d = z11;
        this.f6181f = 0;
    }

    private static String a(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f6177b.a(this.f6176a);
        ah.a("configureCodec");
        this.f6176a.configure(mediaFormat, surface, mediaCrypto, i10);
        ah.a();
        if (z10) {
            this.f6182g = this.f6176a.createInputSurface();
        }
        this.f6178c.a();
        ah.a("startCodec");
        this.f6176a.start();
        ah.a();
        this.f6181f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(int i10) {
        return a(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    private void f() {
        if (this.f6179d) {
            try {
                this.f6178c.d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(int i10) {
        return a(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.applovin.exoplayer2.f.g
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f6177b.a(bufferInfo);
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer a(int i10) {
        return this.f6176a.getInputBuffer(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f6178c.a(i10, i11, i12, j10, i13);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12) {
        this.f6178c.a(i10, i11, cVar, j10, i12);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, long j10) {
        this.f6176a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, boolean z10) {
        this.f6176a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Bundle bundle) {
        f();
        this.f6176a.setParameters(bundle);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Surface surface) {
        f();
        this.f6176a.setOutputSurface(surface);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(g.c cVar, Handler handler) {
        f();
        this.f6176a.setOnFrameRenderedListener(new n(this, cVar), handler);
    }

    @Override // com.applovin.exoplayer2.f.g
    public boolean a() {
        return false;
    }

    @Override // com.applovin.exoplayer2.f.g
    public int b() {
        return this.f6177b.b();
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer b(int i10) {
        return this.f6176a.getOutputBuffer(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public MediaFormat c() {
        return this.f6177b.c();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void c(int i10) {
        f();
        this.f6176a.setVideoScalingMode(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void d() {
        this.f6178c.b();
        this.f6176a.flush();
        c cVar = this.f6177b;
        MediaCodec mediaCodec = this.f6176a;
        Objects.requireNonNull(mediaCodec);
        cVar.a(new androidx.activity.c(mediaCodec));
    }

    @Override // com.applovin.exoplayer2.f.g
    public void e() {
        try {
            if (this.f6181f == 1) {
                this.f6178c.c();
                this.f6177b.a();
            }
            this.f6181f = 2;
        } finally {
            Surface surface = this.f6182g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f6180e) {
                this.f6176a.release();
                this.f6180e = true;
            }
        }
    }
}
