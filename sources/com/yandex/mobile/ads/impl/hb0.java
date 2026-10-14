package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public class hb0 extends zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21355a;

    /* JADX WARN: Illegal instructions before constructor call */
    public hb0(IllegalStateException illegalStateException, ib0 ib0Var) {
        StringBuilder sbA = v60.a("Decoder failed: ");
        sbA.append(ib0Var == null ? null : ib0Var.f21667a);
        super(sbA.toString(), illegalStateException);
        this.f21355a = da1.f19803a >= 21 ? a(illegalStateException) : null;
    }

    private static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
