package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.q;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.a f5603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5605e;

    public l(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        com.applovin.exoplayer2.l.a.a((bArr2 == null) ^ (i10 == 0));
        this.f5601a = z10;
        this.f5602b = str;
        this.f5604d = i10;
        this.f5605e = bArr2;
        this.f5603c = new x.a(a(str), bArr, i11, i12);
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
                q.c("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
