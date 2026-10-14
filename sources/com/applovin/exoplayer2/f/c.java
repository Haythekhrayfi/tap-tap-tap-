package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class c extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f6204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f6205c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f6210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f6211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f6212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f6213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f6214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IllegalStateException f6215m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6203a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f6206d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f6207e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f6208f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f6209g = new ArrayDeque<>();

    public c(HandlerThread handlerThread) {
        this.f6204b = handlerThread;
    }

    private void a(MediaFormat mediaFormat) {
        this.f6207e.a(-2);
        this.f6209g.add(mediaFormat);
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f6203a) {
            this.f6215m = illegalStateException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(Runnable runnable) {
        synchronized (this.f6203a) {
            c(runnable);
        }
    }

    private void c(Runnable runnable) {
        if (this.f6214l) {
            return;
        }
        long j10 = this.f6213k - 1;
        this.f6213k = j10;
        if (j10 > 0) {
            return;
        }
        if (j10 < 0) {
            a(new IllegalStateException());
            return;
        }
        d();
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            a(e10);
        } catch (Exception e11) {
            a(new IllegalStateException(e11));
        }
    }

    private void d() {
        if (!this.f6209g.isEmpty()) {
            this.f6211i = this.f6209g.getLast();
        }
        this.f6206d.c();
        this.f6207e.c();
        this.f6208f.clear();
        this.f6209g.clear();
        this.f6212j = null;
    }

    private boolean e() {
        return this.f6213k > 0 || this.f6214l;
    }

    private void f() {
        g();
        h();
    }

    private void g() {
        IllegalStateException illegalStateException = this.f6215m;
        if (illegalStateException == null) {
            return;
        }
        this.f6215m = null;
        throw illegalStateException;
    }

    private void h() {
        MediaCodec.CodecException codecException = this.f6212j;
        if (codecException == null) {
            return;
        }
        this.f6212j = null;
        throw codecException;
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6203a) {
            if (e()) {
                return -1;
            }
            f();
            if (this.f6207e.b()) {
                return -1;
            }
            int iA = this.f6207e.a();
            if (iA >= 0) {
                com.applovin.exoplayer2.l.a.a(this.f6210h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f6208f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iA == -2) {
                this.f6210h = this.f6209g.remove();
            }
            return iA;
        }
    }

    public void a() {
        synchronized (this.f6203a) {
            this.f6214l = true;
            this.f6204b.quit();
            d();
        }
    }

    public void a(MediaCodec mediaCodec) {
        com.applovin.exoplayer2.l.a.b(this.f6205c == null);
        this.f6204b.start();
        Handler handler = new Handler(this.f6204b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f6205c = handler;
    }

    public void a(final Runnable runnable) {
        synchronized (this.f6203a) {
            this.f6213k++;
            ((Handler) ai.a(this.f6205c)).post(new Runnable() { // from class: com.applovin.exoplayer2.f.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6302c.d(runnable);
                }
            });
        }
    }

    public int b() {
        synchronized (this.f6203a) {
            int iA = -1;
            if (e()) {
                return -1;
            }
            f();
            if (!this.f6206d.b()) {
                iA = this.f6206d.a();
            }
            return iA;
        }
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f6203a) {
            mediaFormat = this.f6210h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6203a) {
            this.f6212j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f6203a) {
            this.f6206d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6203a) {
            MediaFormat mediaFormat = this.f6211i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.f6211i = null;
            }
            this.f6207e.a(i10);
            this.f6208f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6203a) {
            a(mediaFormat);
            this.f6211i = null;
        }
    }
}
