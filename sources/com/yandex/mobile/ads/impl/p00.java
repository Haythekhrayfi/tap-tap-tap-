package com.yandex.mobile.ads.impl;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class p00 extends mm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23939c;

    public p00(int i10) {
        super(a(i10, 1));
        this.f23939c = 1;
    }

    public p00(IOException iOException, int i10, int i11) {
        super(iOException, a(i10, i11));
        this.f23939c = i11;
    }

    public p00(String str, int i10) {
        super(a(i10, 1), str);
        this.f23939c = 1;
    }

    public p00(String str, IOException iOException, int i10) {
        super(a(i10, 1), str, iOException);
        this.f23939c = 1;
    }

    private static int a(int i10, int i11) {
        return (i10 == 2000 && i11 == 1) ? AdError.INTERNAL_ERROR_CODE : i10;
    }

    public static p00 a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !na.b(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        }
        return i11 == 2007 ? new o00(iOException) : new p00(iOException, i11, i10);
    }
}
