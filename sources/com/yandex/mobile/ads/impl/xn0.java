package com.yandex.mobile.ads.impl;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class xn0 implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xn0 f26567a = new xn0();

    private xn0() {
    }

    public static List a(X509Certificate x509Certificate) {
        fd.j0.i(x509Certificate, "certificate");
        return kc.t.z(a(x509Certificate, 7), a(x509Certificate, 2));
    }

    private static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return kc.w.f32009c;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && fd.j0.d(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return kc.w.f32009c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    public static boolean a(String str, X509Certificate x509Certificate) {
        boolean zD;
        int length;
        fd.j0.i(str, "host");
        fd.j0.i(x509Certificate, "certificate");
        if (ea1.a(str)) {
            String strA = hz.a(str);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (fd.j0.d(strA, hz.a((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (str.length() == ((int) qd.o.g(str, 0, 0, 3))) {
                Locale locale = Locale.US;
                fd.j0.h(locale, "US");
                str = str.toLowerCase(locale);
                fd.j0.h(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                for (String lowerCase : listA2) {
                    if ((str.length() == 0) || ed.q.u(str, ".", false, 2) || ed.q.h(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2)) {
                        zD = false;
                    } else if ((lowerCase == null || lowerCase.length() == 0) || ed.q.u(lowerCase, ".", false, 2) || ed.q.h(lowerCase, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2)) {
                        zD = false;
                    } else {
                        String str2 = ed.q.h(str, ".", false, 2) ? str : str + CoreConstants.DOT;
                        if (!ed.q.h(lowerCase, ".", false, 2)) {
                            lowerCase = lowerCase + CoreConstants.DOT;
                        }
                        if (lowerCase.length() == ((int) qd.o.g(lowerCase, 0, 0, 3))) {
                            Locale locale2 = Locale.US;
                            fd.j0.h(locale2, "US");
                            lowerCase = lowerCase.toLowerCase(locale2);
                            fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!ed.u.x(lowerCase, Marker.ANY_MARKER, false, 2)) {
                            zD = fd.j0.d(str2, lowerCase);
                        } else if (!ed.q.u(lowerCase, "*.", false, 2) || ed.u.D(lowerCase, '*', 1, false, 4) != -1 || str2.length() < lowerCase.length() || fd.j0.d("*.", lowerCase)) {
                            zD = false;
                        } else {
                            String strSubstring = lowerCase.substring(1);
                            fd.j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (ed.q.h(str2, strSubstring, false, 2) && ((length = str2.length() - strSubstring.length()) <= 0 || ed.u.G(str2, CoreConstants.DOT, length - 1, false, 4) == -1)) {
                                zD = true;
                            } else {
                                zD = false;
                            }
                        }
                    }
                    if (zD) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        fd.j0.i(str, "host");
        fd.j0.i(sSLSession, "session");
        if (!(str.length() == ((int) qd.o.g(str, 0, 0, 3)))) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            fd.j0.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return a(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
