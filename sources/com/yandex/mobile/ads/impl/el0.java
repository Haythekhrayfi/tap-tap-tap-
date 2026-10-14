package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes3.dex */
public final class el0 {
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
    private static int a(Throwable th) {
        int iA = 16;
        int i10 = 1;
        if (th instanceof wq0) {
            Throwable cause = th.getCause();
            if (cause == null) {
                i10 = 0;
            } else {
                if ((cause instanceof MediaCodec.CodecException) == true || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException)) {
                    StackTraceElement[] stackTrace = cause.getStackTrace();
                    fd.j0.h(stackTrace, "stackTrace");
                    if (((stackTrace.length == 0) ^ true) && stackTrace[0].isNativeMethod() && fd.j0.d(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                        String methodName = stackTrace[0].getMethodName();
                        if (methodName == null) {
                            methodName = "";
                        }
                        if (!fd.j0.d(methodName, "native_dequeueOutputBuffer")) {
                            if (fd.j0.d(methodName, "native_dequeueInputBuffer")) {
                                i10 = 2;
                            } else if (fd.j0.d(methodName, "native_stop")) {
                                i10 = 3;
                            } else if (fd.j0.d(methodName, "native_setSurface")) {
                                i10 = 4;
                            } else if (fd.j0.d(methodName, "releaseOutputBuffer")) {
                                i10 = 5;
                            } else if (fd.j0.d(methodName, "native_queueSecureInputBuffer")) {
                                i10 = 6;
                            } else {
                                if ((cause instanceof MediaCodec.CodecException ? (char) 1 : (char) 0) != 0) {
                                    i10 = 7;
                                } else {
                                    i10 = 0;
                                }
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                }
            }
            if (i10 != 0) {
                return i10;
            }
            Throwable cause2 = th.getCause();
            iA = cause2 != null ? a(cause2) : 0;
            if (iA == 0) {
                iA = 30;
            }
        } else if (th instanceof w10) {
            iA = 9;
        } else if (th instanceof nb0.b) {
            iA = 10;
        } else if (th instanceof kb0.b) {
            iA = 11;
        } else if (th instanceof MediaCodec.CryptoException) {
            iA = 14;
        } else if (th instanceof com.yandex.mobile.ads.exo.drm.e.a) {
            Throwable cause3 = ((com.yandex.mobile.ads.exo.drm.e.a) th).getCause();
            if (cause3 != null) {
                if ((cause3 instanceof MediaDrmResetException) || (cause3 instanceof ResourceBusyException)) {
                    iA = 15;
                } else if ((cause3 instanceof MediaCodec.CryptoException) || (cause3 instanceof u70)) {
                    iA = 14;
                }
            }
        } else if (th instanceof r00) {
            int i11 = ((r00) th).f24580d;
            if (i11 == 401) {
                iA = 18;
            } else if (i11 != 403) {
                iA = i11 != 404 ? 21 : 20;
            } else {
                iA = 19;
            }
        } else if (th instanceof p00) {
            iA = ((p00) th).getCause() instanceof SSLHandshakeException ? 22 : 23;
        } else if (th instanceof qp0) {
            iA = 24;
        } else if (th instanceof x80.g) {
            iA = 25;
        } else {
            if (th instanceof bc.a ? true : th instanceof bc.b ? true : th instanceof nn.h) {
                iA = 26;
            } else if (th instanceof j51) {
                iA = 27;
            } else {
                iA = th instanceof dg.a ? true : th instanceof gg.a ? 28 : 31;
            }
        }
        return iA;
    }

    public static pd1 a(ns nsVar) {
        fd.j0.i(nsVar, "throwable");
        return new pd1(a((Throwable) nsVar), nsVar);
    }
}
