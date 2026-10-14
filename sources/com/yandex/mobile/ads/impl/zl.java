package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f27356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f27357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f27359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f27360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f27364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f27365j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f27366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f27367b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f27366a = cryptoInfo;
            this.f27367b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, int i10) {
            this(cryptoInfo);
        }

        public static void a(a aVar, int i10, int i11) {
            aVar.f27367b.set(i10, i11);
            aVar.f27366a.setPattern(aVar.f27367b);
        }
    }

    public zl() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f27364i = cryptoInfo;
        this.f27365j = da1.f19803a >= 24 ? new a(cryptoInfo, 0) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f27364i;
    }

    public final void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f27359d == null) {
            int[] iArr = new int[1];
            this.f27359d = iArr;
            this.f27364i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f27359d;
        iArr2[0] = iArr2[0] + i10;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f27361f = i10;
        this.f27359d = iArr;
        this.f27360e = iArr2;
        this.f27357b = bArr;
        this.f27356a = bArr2;
        this.f27358c = i11;
        this.f27362g = i12;
        this.f27363h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f27364i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (da1.f19803a >= 24) {
            a aVar = this.f27365j;
            Objects.requireNonNull(aVar);
            a.a(aVar, i12, i13);
        }
    }
}
