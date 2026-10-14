package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ob implements eb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f23758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb f23759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pb f23760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f23761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23763f;

    public static final class a implements eb0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n51<HandlerThread> f23764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n51<HandlerThread> f23765b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(final int i10) {
            final int i11 = 0;
            final int i12 = 1;
            this(new n51() { // from class: com.yandex.mobile.ads.impl.gp1
                @Override // com.yandex.mobile.ads.impl.n51
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return ob.a.a(i10);
                        default:
                            return ob.a.b(i10);
                    }
                }
            }, new n51() { // from class: com.yandex.mobile.ads.impl.gp1
                @Override // com.yandex.mobile.ads.impl.n51
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return ob.a.a(i10);
                        default:
                            return ob.a.b(i10);
                    }
                }
            });
        }

        public a(n51 n51Var, n51 n51Var2) {
            this.f23764a = n51Var;
            this.f23765b = n51Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(ob.e(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(ob.d(i10));
        }

        @Override // com.yandex.mobile.ads.impl.eb0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ob a(eb0.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f20138a.f21667a;
            ob obVar = null;
            try {
                d71.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    ob obVar2 = new ob(mediaCodecCreateByCodecName, this.f23764a.get(), this.f23765b.get(), false, 0);
                    try {
                        d71.a();
                        ob.a(obVar2, aVar.f20139b, aVar.f20141d, aVar.f20142e);
                        return obVar2;
                    } catch (Exception e10) {
                        e = e10;
                        obVar = obVar2;
                        if (obVar != null) {
                            obVar.release();
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

    private ob(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f23758a = mediaCodec;
        this.f23759b = new qb(handlerThread);
        this.f23760c = new pb(mediaCodec, handlerThread2);
        this.f23761d = z10;
        this.f23763f = 0;
    }

    public /* synthetic */ ob(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, int i10) {
        this(mediaCodec, handlerThread, handlerThread2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(eb0.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(j10);
    }

    public static void a(ob obVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        obVar.f23759b.a(obVar.f23758a);
        d71.a("configureCodec");
        obVar.f23758a.configure(mediaFormat, surface, mediaCrypto, 0);
        d71.a();
        obVar.f23760c.c();
        d71.a("startCodec");
        obVar.f23758a.start();
        d71.a();
        obVar.f23763f = 1;
    }

    public static String d(int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i10 == 1) {
            str = "Audio";
        } else if (i10 == 2) {
            str = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str = ")";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String e(int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i10 == 1) {
            str = "Audio";
        } else if (i10 == 2) {
            str = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str = ")";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f23759b.a(bufferInfo);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10) {
        if (this.f23761d) {
            try {
                this.f23760c.d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
        this.f23758a.setVideoScalingMode(i10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10, int i11, long j10, int i12) {
        this.f23760c.a(i10, i11, j10, i12);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10, long j10) {
        this.f23758a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10, zl zlVar, long j10) {
        this.f23760c.a(i10, zlVar, j10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(Bundle bundle) {
        if (this.f23761d) {
            try {
                this.f23760c.d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
        this.f23758a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(Surface surface) {
        if (this.f23761d) {
            try {
                this.f23760c.d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
        this.f23758a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(eb0.c cVar, Handler handler) {
        if (this.f23761d) {
            try {
                this.f23760c.d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
        this.f23758a.setOnFrameRenderedListener(new fp1(this, cVar), handler);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(boolean z10, int i10) {
        this.f23758a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final MediaFormat b() {
        return this.f23759b.c();
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final ByteBuffer b(int i10) {
        return this.f23758a.getInputBuffer(i10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final int c() {
        return this.f23759b.a();
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final ByteBuffer c(int i10) {
        return this.f23758a.getOutputBuffer(i10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void flush() {
        this.f23760c.a();
        this.f23758a.flush();
        this.f23759b.b();
        this.f23758a.start();
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void release() {
        try {
            if (this.f23763f == 1) {
                this.f23760c.b();
                this.f23759b.e();
            }
            this.f23763f = 2;
        } finally {
            if (!this.f23762e) {
                this.f23758a.release();
                this.f23762e = true;
            }
        }
    }
}
