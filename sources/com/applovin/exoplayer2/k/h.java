package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f7381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f7382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7384d;

    public h() {
        super(false);
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f7384d;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(ai.a(this.f7382b), this.f7383c, bArr, i10, iMin);
        this.f7383c += iMin;
        this.f7384d -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        b(lVar);
        this.f7381a = lVar;
        Uri uri = lVar.f7392a;
        String scheme = uri.getScheme();
        com.applovin.exoplayer2.l.a.a("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrA = ai.a(uri.getSchemeSpecificPart(), ",");
        if (strArrA.length != 2) {
            throw com.applovin.exoplayer2.ai.a("Unexpected URI format: " + uri, null);
        }
        String str = strArrA[1];
        if (strArrA[0].contains(";base64")) {
            try {
                this.f7382b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw com.applovin.exoplayer2.ai.a("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f7382b = ai.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
        }
        long j10 = lVar.f7398g;
        byte[] bArr = this.f7382b;
        if (j10 > bArr.length) {
            this.f7382b = null;
            throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.f7383c = i10;
        int length = bArr.length - i10;
        this.f7384d = length;
        long j11 = lVar.f7399h;
        if (j11 != -1) {
            this.f7384d = (int) Math.min(length, j11);
        }
        c(lVar);
        long j12 = lVar.f7399h;
        return j12 != -1 ? j12 : this.f7384d;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        l lVar = this.f7381a;
        if (lVar != null) {
            return lVar.f7392a;
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        if (this.f7382b != null) {
            this.f7382b = null;
            d();
        }
        this.f7381a = null;
    }
}
