package okhttp3;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import fd.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kc.t;
import lc.b;
import okhttp3.internal.Util;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion = new Companion(null);
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public Builder(ConnectionSpec connectionSpec) {
            j0.i(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public Builder(boolean z10) {
            this.tls = z10;
        }

        public final Builder allEnabledCipherSuites() {
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            setCipherSuites$okhttp(null);
            return this;
        }

        public final Builder allEnabledTlsVersions() {
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            setTlsVersions$okhttp(null);
            return this;
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final Builder cipherSuites(String... strArr) {
            j0.i(strArr, "cipherSuites");
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            setCipherSuites$okhttp((String[]) strArr.clone());
            return this;
        }

        public final Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            j0.i(cipherSuiteArr, "cipherSuites");
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z10) {
            this.supportsTlsExtensions = z10;
        }

        public final void setTls$okhttp(boolean z10) {
            this.tls = z10;
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
            this.tlsVersions = strArr;
        }

        public final Builder supportsTlsExtensions(boolean z10) {
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            setSupportsTlsExtensions$okhttp(z10);
            return this;
        }

        public final Builder tlsVersions(String... strArr) {
            j0.i(strArr, "tlsVersions");
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            setTlsVersions$okhttp((String[]) strArr.clone());
            return this;
        }

        public final Builder tlsVersions(TlsVersion... tlsVersionArr) {
            j0.i(tlsVersionArr, "tlsVersions");
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        Builder builderCipherSuites = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = builderCipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.isTls = z10;
        this.supportsTlsExtensions = z11;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            j0.h(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = Util.intersect(enabledCipherSuites2, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            j0.h(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = Util.intersect(enabledProtocols2, this.tlsVersionsAsString, b.f33069c);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        j0.h(supportedCipherSuites, "supportedCipherSuites");
        int iIndexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z10 && iIndexOf != -1) {
            j0.h(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iIndexOf];
            j0.h(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = Util.concat(enabledCipherSuites, str);
        }
        Builder builder = new Builder(this);
        j0.h(enabledCipherSuites, "cipherSuitesIntersection");
        Builder builderCipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        j0.h(enabledProtocols, "tlsVersionsIntersection");
        return builderCipherSuites.tlsVersions((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
    }

    /* JADX INFO: renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final List<CipherSuite> m31deprecated_cipherSuites() {
        return cipherSuites();
    }

    /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m32deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    /* JADX INFO: renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final List<TlsVersion> m33deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean z10) {
        j0.i(sSLSocket, "sslSocket");
        ConnectionSpec connectionSpecSupportedSpec = supportedSpec(sSLSocket, z10);
        if (connectionSpecSupportedSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecSupportedSpec.tlsVersionsAsString);
        }
        if (connectionSpecSupportedSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecSupportedSpec.cipherSuitesAsString);
        }
    }

    public final List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.Companion.forJavaName(str));
        }
        return t.H(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.isTls;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z10 != connectionSpec.isTls) {
            return false;
        }
        return !z10 || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
        j0.i(sSLSocket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !Util.hasIntersection(strArr, sSLSocket.getEnabledProtocols(), b.f33069c)) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || Util.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.Companion.forJavaName(str));
        }
        return t.H(arrayList);
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        StringBuilder sbA = a.a("ConnectionSpec(cipherSuites=");
        sbA.append((Object) Objects.toString(cipherSuites(), "[all enabled]"));
        sbA.append(", tlsVersions=");
        sbA.append((Object) Objects.toString(tlsVersions(), "[all enabled]"));
        sbA.append(", supportsTlsExtensions=");
        return s.a(sbA, this.supportsTlsExtensions, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
