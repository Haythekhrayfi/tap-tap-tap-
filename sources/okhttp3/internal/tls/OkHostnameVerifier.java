package okhttp3.internal.tls;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ed.q;
import ed.u;
import fd.j0;
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
import kc.t;
import kc.w;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.slf4j.Marker;
import qd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        j0.h(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return w.f32009c;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && j0.d(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return w.f32009c;
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) o.g(str, 0, 0, 3));
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !q.u(str, ".", false, 2) && !q.h(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2)) {
            if (!(str2 == null || str2.length() == 0) && !q.u(str2, ".", false, 2) && !q.h(str2, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2)) {
                if (!q.h(str, ".", false, 2)) {
                    str = j0.p(str, ".");
                }
                if (!q.h(str2, ".", false, 2)) {
                    str2 = j0.p(str2, ".");
                }
                String strAsciiToLowercase = asciiToLowercase(str2);
                if (!u.x(strAsciiToLowercase, Marker.ANY_MARKER, false, 2)) {
                    return j0.d(str, strAsciiToLowercase);
                }
                if (!q.u(strAsciiToLowercase, "*.", false, 2) || u.D(strAsciiToLowercase, '*', 1, false, 4) != -1 || str.length() < strAsciiToLowercase.length() || j0.d("*.", strAsciiToLowercase)) {
                    return false;
                }
                String strSubstring = strAsciiToLowercase.substring(1);
                j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (!q.h(str, strSubstring, false, 2)) {
                    return false;
                }
                int length = str.length() - strSubstring.length();
                return length <= 0 || u.G(str, CoreConstants.DOT, length - 1, false, 4) == -1;
            }
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (j0.d(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        j0.i(x509Certificate, "certificate");
        return t.z(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        j0.i(str, "host");
        j0.i(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        j0.i(str, "host");
        j0.i(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
