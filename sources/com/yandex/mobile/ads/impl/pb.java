package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class pb {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f24022g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f24023h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f24024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f24025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f24027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gk f24028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24029f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            pb.a(pb.this, message);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f24034d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f24035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24036f;
    }

    public pb(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new gk());
    }

    public pb(MediaCodec mediaCodec, HandlerThread handlerThread, gk gkVar) {
        this.f24024a = mediaCodec;
        this.f24025b = handlerThread;
        this.f24028e = gkVar;
        this.f24027d = new AtomicReference<>();
    }

    public static void a(pb pbVar, Message message) {
        b bVar;
        Objects.requireNonNull(pbVar);
        int i10 = message.what;
        b bVar2 = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            try {
                pbVar.f24024a.queueInputBuffer(bVar.f24031a, bVar.f24032b, bVar.f24033c, bVar.f24035e, bVar.f24036f);
            } catch (RuntimeException e10) {
                e = e10;
                pbVar.f24027d.compareAndSet(null, e);
            }
            bVar2 = bVar;
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            int i11 = bVar.f24031a;
            int i12 = bVar.f24032b;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f24034d;
            long j10 = bVar.f24035e;
            int i13 = bVar.f24036f;
            try {
                synchronized (f24023h) {
                    pbVar.f24024a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                e = e11;
                pbVar.f24027d.compareAndSet(null, e);
            }
            bVar2 = bVar;
        } else if (i10 != 2) {
            pbVar.f24027d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            pbVar.f24028e.e();
        }
        if (bVar2 != null) {
            ArrayDeque<b> arrayDeque = f24022g;
            synchronized (arrayDeque) {
                arrayDeque.add(bVar2);
            }
        }
    }

    public final void a() {
        if (this.f24029f) {
            try {
                Handler handler = this.f24026c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.f24028e.c();
                Handler handler2 = this.f24026c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f24028e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void a(int i10, int i11, long j10, int i12) {
        b bVar;
        RuntimeException andSet = this.f24027d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        ArrayDeque<b> arrayDeque = f24022g;
        synchronized (arrayDeque) {
            bVar = arrayDeque.isEmpty() ? new b() : arrayDeque.removeFirst();
        }
        bVar.f24031a = i10;
        bVar.f24032b = 0;
        bVar.f24033c = i11;
        bVar.f24035e = j10;
        bVar.f24036f = i12;
        Handler handler = this.f24026c;
        int i13 = da1.f19803a;
        handler.obtainMessage(0, bVar).sendToTarget();
    }

    public final void a(int i10, zl zlVar, long j10) {
        b bVar;
        RuntimeException andSet = this.f24027d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        ArrayDeque<b> arrayDeque = f24022g;
        synchronized (arrayDeque) {
            bVar = arrayDeque.isEmpty() ? new b() : arrayDeque.removeFirst();
        }
        bVar.f24031a = i10;
        bVar.f24032b = 0;
        bVar.f24033c = 0;
        bVar.f24035e = j10;
        bVar.f24036f = 0;
        MediaCodec.CryptoInfo cryptoInfo = bVar.f24034d;
        cryptoInfo.numSubSamples = zlVar.f27361f;
        int[] iArr = zlVar.f27359d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = zlVar.f27360e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = zlVar.f27357b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        Objects.requireNonNull(bArrCopyOf);
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = zlVar.f27356a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        Objects.requireNonNull(bArrCopyOf2);
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = zlVar.f27358c;
        if (da1.f19803a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zlVar.f27362g, zlVar.f27363h));
        }
        this.f24026c.obtainMessage(1, bVar).sendToTarget();
    }

    public final void b() {
        if (this.f24029f) {
            a();
            this.f24025b.quit();
        }
        this.f24029f = false;
    }

    public final void c() {
        if (this.f24029f) {
            return;
        }
        this.f24025b.start();
        this.f24026c = new a(this.f24025b.getLooper());
        this.f24029f = true;
    }

    public final void d() throws InterruptedException {
        this.f24028e.c();
        Handler handler = this.f24026c;
        Objects.requireNonNull(handler);
        handler.obtainMessage(2).sendToTarget();
        this.f24028e.a();
    }
}
