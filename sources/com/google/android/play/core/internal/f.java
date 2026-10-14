package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes2.dex */
final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f12300a;

    public f(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f12300a = bArr;
    }

    @Override // com.google.android.play.core.internal.g, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f12300a;
    }
}
