package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b71 f23582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uh f23583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f23584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jc.e f23585d;

    public static final class a {

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ny$a$a, reason: collision with other inner class name */
        public static final class C0209a extends vc.l implements uc.a<List<? extends Certificate>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f23586a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0209a(List<? extends Certificate> list) {
                super(0);
                this.f23586a = list;
            }

            @Override // uc.a
            public final List<? extends Certificate> invoke() {
                return this.f23586a;
            }
        }

        public static ny a(SSLSession sSLSession) throws IOException {
            List listA;
            fd.j0.i(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (fd.j0.d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : fd.j0.d(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(fn1.a("cipherSuite == ", cipherSuite));
            }
            uh uhVarA = uh.f25634b.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (fd.j0.d("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            b71 b71VarA = b71.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listA = peerCertificates != null ? ea1.a(Arrays.copyOf(peerCertificates, peerCertificates.length)) : kc.w.f32009c;
            } catch (SSLPeerUnverifiedException unused) {
                listA = kc.w.f32009c;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new ny(b71VarA, uhVarA, localCertificates != null ? ea1.a(Arrays.copyOf(localCertificates, localCertificates.length)) : kc.w.f32009c, new C0209a(listA));
        }
    }

    public static final class b extends vc.l implements uc.a<List<? extends Certificate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uc.a<List<Certificate>> f23587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(uc.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f23587a = aVar;
        }

        @Override // uc.a
        public final List<? extends Certificate> invoke() {
            try {
                return this.f23587a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return kc.w.f32009c;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ny(b71 b71Var, uh uhVar, List<? extends Certificate> list, uc.a<? extends List<? extends Certificate>> aVar) {
        fd.j0.i(b71Var, "tlsVersion");
        fd.j0.i(uhVar, "cipherSuite");
        fd.j0.i(list, "localCertificates");
        fd.j0.i(aVar, "peerCertificatesFn");
        this.f23582a = b71Var;
        this.f23583b = uhVar;
        this.f23584c = list;
        this.f23585d = jc.f.b(new b(aVar));
    }

    public final uh a() {
        return this.f23583b;
    }

    public final List<Certificate> b() {
        return this.f23584c;
    }

    public final List<Certificate> c() {
        return (List) this.f23585d.getValue();
    }

    public final b71 d() {
        return this.f23582a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ny) {
            ny nyVar = (ny) obj;
            if (nyVar.f23582a == this.f23582a && fd.j0.d(nyVar.f23583b, this.f23583b) && fd.j0.d(nyVar.c(), c()) && fd.j0.d(nyVar.f23584c, this.f23584c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23584c.hashCode() + ((c().hashCode() + ((this.f23583b.hashCode() + ((this.f23582a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listC = c();
        ArrayList arrayList = new ArrayList(kc.m.j(listC, 10));
        for (Certificate certificate : listC) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                fd.j0.h(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sbA = v60.a("Handshake{tlsVersion=");
        sbA.append(this.f23582a);
        sbA.append(" cipherSuite=");
        sbA.append(this.f23583b);
        sbA.append(" peerCertificates=");
        sbA.append(string);
        sbA.append(" localCertificates=");
        List<Certificate> list = this.f23584c;
        ArrayList arrayList2 = new ArrayList(kc.m.j(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                fd.j0.h(type, "type");
            }
            arrayList2.add(type);
        }
        sbA.append(arrayList2);
        sbA.append('}');
        return sbA.toString();
    }
}
