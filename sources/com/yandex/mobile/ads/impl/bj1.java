package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public final class bj1 implements aj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jc.e f19275a = jc.f.b(a.f19276a);

    public static final class a extends vc.l implements uc.a<CertificateFactory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19276a = new a();

        public a() {
            super(0);
        }

        @Override // uc.a
        public final CertificateFactory invoke() {
            return CertificateFactory.getInstance("X.509");
        }
    }

    @Override // com.yandex.mobile.ads.impl.aj1
    public final boolean a(Context context, SslError sslError) {
        X509Certificate x509CertificateA;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sslError, "sslError");
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA == null || !nz0VarA.M()) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        SslCertificate certificate = sslError.getCertificate();
        if (i10 >= 29) {
            x509CertificateA = certificate.getX509Certificate();
        } else {
            fd.j0.h(certificate, "sslError.certificate");
            Object value = this.f19275a.getValue();
            fd.j0.h(value, "<get-certificateFactory>(...)");
            x509CertificateA = uy0.a(certificate, (CertificateFactory) value);
        }
        if (x509CertificateA == null) {
            return false;
        }
        try {
            i80.b(fm.a(context)).checkServerTrusted(new X509Certificate[]{x509CertificateA}, "RSA");
            return true;
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
            return false;
        }
    }
}
