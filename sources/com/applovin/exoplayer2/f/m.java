package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f6293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f6294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f6295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer[] f6296d;

    public static final class a {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    public static class b implements g.b {
        public MediaCodec a(g.a aVar) throws IOException {
            com.applovin.exoplayer2.l.a.b(aVar.f6227a);
            String str = aVar.f6227a.f6237a;
            ah.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            ah.a();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.exoplayer2.f.m$1] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.exoplayer2.f.g.b
        public g b(g.a aVar) throws Throwable {
            MediaCodec mediaCodecA;
            Surface surfaceA;
            ?? r10 = 0;
            r10 = 0;
            r10 = 0;
            try {
                mediaCodecA = a(aVar);
                try {
                    ah.a("configureCodec");
                    mediaCodecA.configure(aVar.f6228b, aVar.f6230d, aVar.f6231e, aVar.f6232f);
                    ah.a();
                    if (!aVar.f6233g) {
                        surfaceA = null;
                    } else {
                        if (ai.f7595a < 18) {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                        surfaceA = a.a(mediaCodecA);
                    }
                    try {
                        ah.a("startCodec");
                        mediaCodecA.start();
                        ah.a();
                        return new m(mediaCodecA, surfaceA);
                    } catch (IOException | RuntimeException e10) {
                        r10 = surfaceA;
                        e = e10;
                        if (r10 != 0) {
                            r10.release();
                        }
                        if (mediaCodecA != null) {
                            mediaCodecA.release();
                        }
                        throw e;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (RuntimeException e12) {
                    e = e12;
                }
            } catch (IOException | RuntimeException e13) {
                e = e13;
                mediaCodecA = null;
            }
        }
    }

    private m(MediaCodec mediaCodec, Surface surface) {
        this.f6293a = mediaCodec;
        this.f6294b = surface;
        if (ai.f7595a < 21) {
            this.f6295c = mediaCodec.getInputBuffers();
            this.f6296d = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // com.applovin.exoplayer2.f.g
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f6293a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && ai.f7595a < 21) {
                this.f6296d = this.f6293a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer a(int i10) {
        return ai.f7595a >= 21 ? this.f6293a.getInputBuffer(i10) : ((ByteBuffer[]) ai.a(this.f6295c))[i10];
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f6293a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12) {
        this.f6293a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, long j10) {
        this.f6293a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, boolean z10) {
        this.f6293a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Bundle bundle) {
        this.f6293a.setParameters(bundle);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Surface surface) {
        this.f6293a.setOutputSurface(surface);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(g.c cVar, Handler handler) {
        this.f6293a.setOnFrameRenderedListener(new n(this, cVar), handler);
    }

    @Override // com.applovin.exoplayer2.f.g
    public boolean a() {
        return false;
    }

    @Override // com.applovin.exoplayer2.f.g
    public int b() {
        return this.f6293a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer b(int i10) {
        return ai.f7595a >= 21 ? this.f6293a.getOutputBuffer(i10) : ((ByteBuffer[]) ai.a(this.f6296d))[i10];
    }

    @Override // com.applovin.exoplayer2.f.g
    public MediaFormat c() {
        return this.f6293a.getOutputFormat();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void c(int i10) {
        this.f6293a.setVideoScalingMode(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void d() {
        this.f6293a.flush();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void e() {
        this.f6295c = null;
        this.f6296d = null;
        Surface surface = this.f6294b;
        if (surface != null) {
            surface.release();
        }
        this.f6293a.release();
    }
}
