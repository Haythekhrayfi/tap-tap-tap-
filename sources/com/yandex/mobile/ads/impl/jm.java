package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class jm extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private pm f22083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f22084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22086h;

    public jm() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws IOException {
        b(pmVar);
        this.f22083e = pmVar;
        Uri uri = pmVar.f24101a;
        String scheme = uri.getScheme();
        pa.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = da1.f19803a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw qp0.a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f22084f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw qp0.a("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f22084f = da1.b(URLDecoder.decode(str, qh.f24494a.name()));
        }
        long j10 = pmVar.f24106f;
        byte[] bArr = this.f22084f;
        if (j10 > bArr.length) {
            this.f22084f = null;
            throw new mm(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i11 = (int) j10;
        this.f22085g = i11;
        int length = bArr.length - i11;
        this.f22086h = length;
        long j11 = pmVar.f24107g;
        if (j11 != -1) {
            this.f22086h = (int) Math.min(length, j11);
        }
        c(pmVar);
        long j12 = pmVar.f24107g;
        return j12 != -1 ? j12 : this.f22086h;
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() {
        if (this.f22084f != null) {
            this.f22084f = null;
            f();
        }
        this.f22083e = null;
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        pm pmVar = this.f22083e;
        if (pmVar != null) {
            return pmVar.f24101a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f22086h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f22084f;
        int i13 = da1.f19803a;
        System.arraycopy(bArr2, this.f22085g, bArr, i10, iMin);
        this.f22085g += iMin;
        this.f22086h -= iMin;
        c(iMin);
        return iMin;
    }
}
