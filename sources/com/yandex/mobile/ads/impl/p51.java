package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class p51 implements eb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f23984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f23985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f23986c;

    public static class a implements eb0.b {
        public static MediaCodec b(eb0.a aVar) throws IOException {
            Objects.requireNonNull(aVar.f20138a);
            String str = aVar.f20138a.f21667a;
            d71.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            d71.a();
            return mediaCodecCreateByCodecName;
        }

        @Override // com.yandex.mobile.ads.impl.eb0.b
        public final eb0 a(eb0.a aVar) throws IOException {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(aVar);
                d71.a("configureCodec");
                mediaCodecB.configure(aVar.f20139b, aVar.f20141d, aVar.f20142e, 0);
                d71.a();
                d71.a("startCodec");
                mediaCodecB.start();
                d71.a();
                return new p51(mediaCodecB, 0);
            } catch (IOException | RuntimeException e10) {
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e10;
            }
        }
    }

    private p51(MediaCodec mediaCodec) {
        this.f23984a = mediaCodec;
        if (da1.f19803a < 21) {
            this.f23985b = mediaCodec.getInputBuffers();
            this.f23986c = mediaCodec.getOutputBuffers();
        }
    }

    public /* synthetic */ p51(MediaCodec mediaCodec, int i10) {
        this(mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(eb0.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(j10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f23984a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && da1.f19803a < 21) {
                this.f23986c = this.f23984a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10) {
        this.f23984a.setVideoScalingMode(i10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10, int i11, long j10, int i12) {
        this.f23984a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10, long j10) {
        this.f23984a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(int i10, zl zlVar, long j10) {
        this.f23984a.queueSecureInputBuffer(i10, 0, zlVar.a(), j10, 0);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(Bundle bundle) {
        this.f23984a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(Surface surface) {
        this.f23984a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(eb0.c cVar, Handler handler) {
        this.f23984a.setOnFrameRenderedListener(new fp1(this, cVar), handler);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void a(boolean z10, int i10) {
        this.f23984a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final MediaFormat b() {
        return this.f23984a.getOutputFormat();
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final ByteBuffer b(int i10) {
        return da1.f19803a >= 21 ? this.f23984a.getInputBuffer(i10) : this.f23985b[i10];
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final int c() {
        return this.f23984a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final ByteBuffer c(int i10) {
        return da1.f19803a >= 21 ? this.f23984a.getOutputBuffer(i10) : this.f23986c[i10];
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void flush() {
        this.f23984a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.eb0
    public final void release() {
        this.f23985b = null;
        this.f23986c = null;
        this.f23984a.release();
    }
}
