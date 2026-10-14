package com.applovin.exoplayer2.c;

import android.media.MediaCodec;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f4728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f4729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f4731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f4732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f4736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f4737j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f4738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f4739b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f4738a = cryptoInfo;
            this.f4739b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, int i11) {
            this.f4739b.set(i10, i11);
            this.f4738a.setPattern(this.f4739b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f4736i = cryptoInfo;
        this.f4737j = ai.f7595a >= 24 ? new a(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f4736i;
    }

    public void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f4731d == null) {
            int[] iArr = new int[1];
            this.f4731d = iArr;
            this.f4736i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f4731d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f4733f = i10;
        this.f4731d = iArr;
        this.f4732e = iArr2;
        this.f4729b = bArr;
        this.f4728a = bArr2;
        this.f4730c = i11;
        this.f4734g = i12;
        this.f4735h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f4736i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (ai.f7595a >= 24) {
            ((a) com.applovin.exoplayer2.l.a.b(this.f4737j)).a(i12, i13);
        }
    }
}
