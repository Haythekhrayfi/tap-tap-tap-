package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class f71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j71.a f20574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f20576e;

    public f71(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        pa.a((bArr2 == null) ^ (i10 == 0));
        this.f20572a = z10;
        this.f20573b = str;
        this.f20575d = i10;
        this.f20576e = bArr2;
        this.f20574c = new j71.a(a(str), i11, i12, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                p90.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
