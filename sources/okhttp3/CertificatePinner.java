package okhttp3;

import android.support.v4.media.c;
import ch.qos.logback.core.CoreConstants;
import ed.q;
import ed.u;
import fd.j0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kc.j;
import kc.m;
import kc.t;
import kc.w;
import l1.e;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.slf4j.Marker;
import uc.a;
import vc.f0;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            j0.i(str, "pattern");
            j0.i(strArr, "pins");
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                getPins().add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(t.L(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            j0.i(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return j0.p("sha256/", sha256Hash((X509Certificate) certificate).a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final qd.g sha1Hash(X509Certificate x509Certificate) {
            j0.i(x509Certificate, "<this>");
            qd.g.a aVar = qd.g.f34892f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            j0.h(encoded, "publicKey.encoded");
            return qd.g.a.e(aVar, encoded, 0, 0, 3).i();
        }

        public final qd.g sha256Hash(X509Certificate x509Certificate) {
            j0.i(x509Certificate, "<this>");
            qd.g.a aVar = qd.g.f34892f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            j0.h(encoded, "publicKey.encoded");
            return qd.g.a.e(aVar, encoded, 0, 0, 3).b("SHA-256");
        }
    }

    public static final class Pin {
        private final qd.g hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            qd.g gVarA;
            j0.i(str, "pattern");
            j0.i(str2, "pin");
            boolean z10 = true;
            if ((!q.u(str, "*.", false, 2) || u.E(str, Marker.ANY_MARKER, 1, false, 4) != -1) && ((!q.u(str, "**.", false, 2) || u.E(str, Marker.ANY_MARKER, 2, false, 4) != -1) && u.E(str, Marker.ANY_MARKER, 0, false, 6) != -1)) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(j0.p("Unexpected pattern: ", str).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(j0.p("Invalid pattern: ", str));
            }
            this.pattern = canonicalHost;
            if (q.u(str2, "sha1/", false, 2)) {
                this.hashAlgorithm = "sha1";
                qd.g.a aVar = qd.g.f34892f;
                String strSubstring = str2.substring(5);
                j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                gVarA = aVar.a(strSubstring);
                if (gVarA == null) {
                    throw new IllegalArgumentException(j0.p("Invalid pin hash: ", str2));
                }
            } else {
                if (!q.u(str2, "sha256/", false, 2)) {
                    throw new IllegalArgumentException(j0.p("pins must start with 'sha256/' or 'sha1/': ", str2));
                }
                this.hashAlgorithm = "sha256";
                qd.g.a aVar2 = qd.g.f34892f;
                String strSubstring2 = str2.substring(7);
                j0.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                gVarA = aVar2.a(strSubstring2);
                if (gVarA == null) {
                    throw new IllegalArgumentException(j0.p("Invalid pin hash: ", str2));
                }
            }
            this.hash = gVarA;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return j0.d(this.pattern, pin.pattern) && j0.d(this.hashAlgorithm, pin.hashAlgorithm) && j0.d(this.hash, pin.hash);
        }

        public final qd.g getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + e.a(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            qd.g gVar;
            qd.g gVarSha1Hash;
            j0.i(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (j0.d(str, "sha256")) {
                gVar = this.hash;
                gVarSha1Hash = CertificatePinner.Companion.sha256Hash(x509Certificate);
            } else {
                if (!j0.d(str, "sha1")) {
                    return false;
                }
                gVar = this.hash;
                gVarSha1Hash = CertificatePinner.Companion.sha1Hash(x509Certificate);
            }
            return j0.d(gVar, gVarSha1Hash);
        }

        public final boolean matchesHostname(String str) {
            j0.i(str, "hostname");
            if (q.u(this.pattern, "**.", false, 2)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!q.m(str, str.length() - length, this.pattern, 3, length, false, 16)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!q.u(this.pattern, "*.", false, 2)) {
                    return j0.d(str, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!q.m(str, str.length() - length3, this.pattern, 1, length3, false, 16) || u.G(str, CoreConstants.DOT, length4 - 1, false, 4) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements a<List<? extends X509Certificate>> {
        public final /* synthetic */ String $hostname;
        public final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // uc.a
        public final List<? extends X509Certificate> invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            List<Certificate> listClean = certificateChainCleaner$okhttp == null ? null : certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname);
            if (listClean == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(m.j(listClean, 10));
            Iterator<T> it = listClean.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        j0.i(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, g gVar) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final qd.g sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final qd.g sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        j0.i(str, "hostname");
        j0.i(list, "peerCertificates");
        check$okhttp(str, new AnonymousClass1(list, str));
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        j0.i(str, "hostname");
        j0.i(certificateArr, "peerCertificates");
        check(str, j.B(certificateArr));
    }

    public final void check$okhttp(String str, a<? extends List<? extends X509Certificate>> aVar) throws SSLPeerUnverifiedException {
        j0.i(str, "hostname");
        j0.i(aVar, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = aVar.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            qd.g gVarSha256Hash = null;
            qd.g gVarSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (j0.d(hashAlgorithm, "sha256")) {
                    if (gVarSha256Hash == null) {
                        gVarSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (j0.d(pin.getHash(), gVarSha256Hash)) {
                        return;
                    }
                } else {
                    if (!j0.d(hashAlgorithm, "sha1")) {
                        throw new AssertionError(j0.p("unsupported hashAlgorithm: ", pin.getHashAlgorithm()));
                    }
                    if (gVarSha1Hash == null) {
                        gVarSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (j0.d(pin.getHash(), gVarSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sbA = c.a("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sbA.append("\n    ");
            sbA.append(Companion.pin(x509Certificate2));
            sbA.append(": ");
            sbA.append(x509Certificate2.getSubjectDN().getName());
        }
        sbA.append("\n  Pinned certificates for ");
        sbA.append(str);
        sbA.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sbA.append("\n    ");
            sbA.append(pin2);
        }
        String string = sbA.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (j0.d(certificatePinner.pins, this.pins) && j0.d(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        j0.i(str, "hostname");
        Set<Pin> set = this.pins;
        List arrayList = w.f32009c;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                f0.b(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        j0.i(certificateChainCleaner, "certificateChainCleaner");
        return j0.d(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
}
