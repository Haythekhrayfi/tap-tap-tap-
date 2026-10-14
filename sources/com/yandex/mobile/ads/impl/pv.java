package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f24262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Metadata f24263l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f24264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f24265b;

        public a(long[] jArr, long[] jArr2) {
            this.f24264a = jArr;
            this.f24265b = jArr2;
        }
    }

    private pv(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, Metadata metadata) {
        this.f24252a = i10;
        this.f24253b = i11;
        this.f24254c = i12;
        this.f24255d = i13;
        this.f24256e = i14;
        this.f24257f = b(i14);
        this.f24258g = i15;
        this.f24259h = i16;
        this.f24260i = a(i16);
        this.f24261j = j10;
        this.f24262k = aVar;
        this.f24263l = metadata;
    }

    public pv(int i10, byte[] bArr) {
        lp0 lp0Var = new lp0(bArr);
        lp0Var.c(i10 * 8);
        this.f24252a = lp0Var.b(16);
        this.f24253b = lp0Var.b(16);
        this.f24254c = lp0Var.b(24);
        this.f24255d = lp0Var.b(24);
        int iB = lp0Var.b(20);
        this.f24256e = iB;
        this.f24257f = b(iB);
        this.f24258g = lp0Var.b(3) + 1;
        int iB2 = lp0Var.b(5) + 1;
        this.f24259h = iB2;
        this.f24260i = a(iB2);
        this.f24261j = lp0Var.g();
        this.f24262k = null;
        this.f24263l = null;
    }

    private static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10;
        long j11;
        int i10 = this.f24255d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f24254c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f24252a;
            j10 = ((((i11 != this.f24253b || i11 <= 0) ? 4096L : i11) * ((long) this.f24258g)) * ((long) this.f24259h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f24256e)) / 1000000;
        long j12 = this.f24261j - 1;
        int i10 = da1.f19803a;
        return Math.max(0L, Math.min(j11, j12));
    }

    public final pv a(a aVar) {
        return new pv(this.f24252a, this.f24253b, this.f24254c, this.f24255d, this.f24256e, this.f24258g, this.f24259h, this.f24261j, aVar, this.f24263l);
    }

    public final pv a(List<PictureFrame> list) {
        Metadata metadata = new Metadata(list);
        Metadata metadata2 = this.f24263l;
        if (metadata2 != null) {
            metadata = metadata2.a(metadata);
        }
        return new pv(this.f24252a, this.f24253b, this.f24254c, this.f24255d, this.f24256e, this.f24258g, this.f24259h, this.f24261j, this.f24262k, metadata);
    }

    public final yv a(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f24255d;
        if (i10 <= 0) {
            i10 = -1;
        }
        Metadata metadata2 = this.f24263l;
        if (metadata2 != null) {
            metadata = metadata2.a(metadata);
        }
        return new yv.a().f("audio/flac").i(i10).c(this.f24258g).n(this.f24256e).a(Collections.singletonList(bArr)).a(metadata).a();
    }

    public final long b() {
        long j10 = this.f24261j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f24256e);
    }

    public final pv b(List<String> list) {
        Metadata metadataA = mi1.a(list);
        Metadata metadata = this.f24263l;
        if (metadata != null) {
            metadataA = metadata.a(metadataA);
        }
        return new pv(this.f24252a, this.f24253b, this.f24254c, this.f24255d, this.f24256e, this.f24258g, this.f24259h, this.f24261j, this.f24262k, metadataA);
    }
}
