package okhttp3;

import fd.j0;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import jc.e;
import jc.f;
import kc.m;
import kc.t;
import kc.w;
import okhttp3.internal.Util;
import uc.a;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final e peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : w.f32009c;
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m51deprecated_get(SSLSession sSLSession) throws IOException {
            j0.i(sSLSession, "sslSession");
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> immutableList;
            j0.i(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (j0.d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : j0.d(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(j0.p("cipherSuite == ", cipherSuite));
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (j0.d("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                immutableList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                immutableList = w.f32009c;
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(immutableList));
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            j0.i(tlsVersion, "tlsVersion");
            j0.i(cipherSuite, "cipherSuite");
            j0.i(list, "peerCertificates");
            j0.i(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements a<List<? extends Certificate>> {
        public final /* synthetic */ a<List<Certificate>> $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.$peerCertificatesFn = aVar;
        }

        @Override // uc.a
        public final List<? extends Certificate> invoke() {
            try {
                return this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return w.f32009c;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, a<? extends List<? extends Certificate>> aVar) {
        j0.i(tlsVersion, "tlsVersion");
        j0.i(cipherSuite, "cipherSuite");
        j0.i(list, "localCertificates");
        j0.i(aVar, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = f.b(new AnonymousClass2(aVar));
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        j0.h(type, "type");
        return type;
    }

    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m45deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m46deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m47deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m48deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m49deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m50deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && j0.d(handshake.cipherSuite, this.cipherSuite) && j0.d(handshake.peerCertificates(), peerCertificates()) && j0.d(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object objS = t.s(this.localCertificates);
        X509Certificate x509Certificate = objS instanceof X509Certificate ? (X509Certificate) objS : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object objS = t.s(peerCertificates());
        X509Certificate x509Certificate = objS instanceof X509Certificate ? (X509Certificate) objS : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(m.j(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sbA = defpackage.a.a("Handshake{tlsVersion=");
        sbA.append(this.tlsVersion);
        sbA.append(" cipherSuite=");
        sbA.append(this.cipherSuite);
        sbA.append(" peerCertificates=");
        sbA.append(string);
        sbA.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(m.j(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sbA.append(arrayList2);
        sbA.append('}');
        return sbA.toString();
    }
}
