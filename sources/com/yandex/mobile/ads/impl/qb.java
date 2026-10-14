package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class qb extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f24385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24386c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f24391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f24392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f24393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IllegalStateException f24396m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24384a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m60 f24387d = new m60();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m60 f24388e = new m60();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f24389f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f24390g = new ArrayDeque<>();

    public qb(HandlerThread handlerThread) {
        this.f24385b = handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f24384a) {
            if (this.f24395l) {
                return;
            }
            long j10 = this.f24394k - 1;
            this.f24394k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (this.f24384a) {
                    this.f24396m = illegalStateException;
                }
                return;
            }
            if (!this.f24390g.isEmpty()) {
                this.f24392i = this.f24390g.getLast();
            }
            this.f24387d.a();
            this.f24388e.a();
            this.f24389f.clear();
            this.f24390g.clear();
            this.f24393j = null;
        }
    }

    public final int a() {
        synchronized (this.f24384a) {
            int iC = -1;
            if (this.f24394k > 0 || this.f24395l) {
                return -1;
            }
            IllegalStateException illegalStateException = this.f24396m;
            if (illegalStateException != null) {
                this.f24396m = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f24393j;
            if (codecException != null) {
                this.f24393j = null;
                throw codecException;
            }
            if (!this.f24387d.b()) {
                iC = this.f24387d.c();
            }
            return iC;
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24384a) {
            if (this.f24394k > 0 || this.f24395l) {
                return -1;
            }
            IllegalStateException illegalStateException = this.f24396m;
            if (illegalStateException != null) {
                this.f24396m = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f24393j;
            if (codecException != null) {
                this.f24393j = null;
                throw codecException;
            }
            if (this.f24388e.b()) {
                return -1;
            }
            int iC = this.f24388e.c();
            if (iC >= 0) {
                pa.b(this.f24391h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f24389f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iC == -2) {
                this.f24391h = this.f24390g.remove();
            }
            return iC;
        }
    }

    public final void a(MediaCodec mediaCodec) {
        pa.b(this.f24386c == null);
        this.f24385b.start();
        Handler handler = new Handler(this.f24385b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f24386c = handler;
    }

    public final void b() {
        synchronized (this.f24384a) {
            this.f24394k++;
            Handler handler = this.f24386c;
            int i10 = da1.f19803a;
            handler.post(new pp1(this));
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f24384a) {
            mediaFormat = this.f24391h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f24384a) {
            this.f24395l = true;
            this.f24385b.quit();
            if (!this.f24390g.isEmpty()) {
                this.f24392i = this.f24390g.getLast();
            }
            this.f24387d.a();
            this.f24388e.a();
            this.f24389f.clear();
            this.f24390g.clear();
            this.f24393j = null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f24384a) {
            this.f24393j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f24384a) {
            this.f24387d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24384a) {
            MediaFormat mediaFormat = this.f24392i;
            if (mediaFormat != null) {
                this.f24388e.a(-2);
                this.f24390g.add(mediaFormat);
                this.f24392i = null;
            }
            this.f24388e.a(i10);
            this.f24389f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f24384a) {
            this.f24388e.a(-2);
            this.f24390g.add(mediaFormat);
            this.f24392i = null;
        }
    }
}
