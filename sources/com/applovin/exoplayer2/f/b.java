package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayDeque<a> f6187a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f6188b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodec f6189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f6190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f6191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f6192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.g f6193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6195i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f6200d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f6201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6202f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f6197a = i10;
            this.f6198b = i11;
            this.f6199c = i12;
            this.f6201e = j10;
            this.f6202f = i13;
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        this(mediaCodec, handlerThread, z10, new com.applovin.exoplayer2.l.g());
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10, com.applovin.exoplayer2.l.g gVar) {
        this.f6189c = mediaCodec;
        this.f6190d = handlerThread;
        this.f6193g = gVar;
        this.f6192f = new AtomicReference<>();
        this.f6194h = z10 || i();
    }

    private void a(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            if (!this.f6194h) {
                this.f6189c.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                return;
            }
            synchronized (f6188b) {
                this.f6189c.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        a aVar;
        int i10 = message.what;
        if (i10 == 0) {
            aVar = (a) message.obj;
            b(aVar.f6197a, aVar.f6198b, aVar.f6199c, aVar.f6201e, aVar.f6202f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f6193g.a();
            }
            aVar = null;
        } else {
            aVar = (a) message.obj;
            a(aVar.f6197a, aVar.f6198b, aVar.f6200d, aVar.f6201e, aVar.f6202f);
        }
        if (aVar != null) {
            a(aVar);
        }
    }

    private static void a(com.applovin.exoplayer2.c.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f4733f;
        cryptoInfo.numBytesOfClearData = a(cVar.f4731d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(cVar.f4732e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f4729b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f4728a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f4730c;
        if (ai.f7595a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f4734g, cVar.f4735h));
        }
    }

    private static void a(a aVar) {
        ArrayDeque<a> arrayDeque = f6187a;
        synchronized (arrayDeque) {
            arrayDeque.add(aVar);
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private void b(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f6189c.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            a(e10);
        }
    }

    private void e() {
        RuntimeException andSet = this.f6192f.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void f() throws InterruptedException {
        ((Handler) ai.a(this.f6191e)).removeCallbacksAndMessages(null);
        g();
        e();
    }

    private void g() throws InterruptedException {
        this.f6193g.b();
        ((Handler) ai.a(this.f6191e)).obtainMessage(2).sendToTarget();
        this.f6193g.c();
    }

    private static a h() {
        ArrayDeque<a> arrayDeque = f6187a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new a();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static boolean i() {
        String lowerCase = Ascii.toLowerCase(ai.f7597c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    public void a() {
        if (this.f6195i) {
            return;
        }
        this.f6190d.start();
        this.f6191e = new Handler(this.f6190d.getLooper()) { // from class: com.applovin.exoplayer2.f.b.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b.this.a(message);
            }
        };
        this.f6195i = true;
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        e();
        a aVarH = h();
        aVarH.a(i10, i11, i12, j10, i13);
        ((Handler) ai.a(this.f6191e)).obtainMessage(0, aVarH).sendToTarget();
    }

    public void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12) {
        e();
        a aVarH = h();
        aVarH.a(i10, i11, 0, j10, i12);
        a(cVar, aVarH.f6200d);
        ((Handler) ai.a(this.f6191e)).obtainMessage(1, aVarH).sendToTarget();
    }

    public void a(RuntimeException runtimeException) {
        this.f6192f.set(runtimeException);
    }

    public void b() {
        if (this.f6195i) {
            try {
                f();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void c() {
        if (this.f6195i) {
            b();
            this.f6190d.quit();
        }
        this.f6195i = false;
    }

    public void d() throws InterruptedException {
        g();
    }
}
