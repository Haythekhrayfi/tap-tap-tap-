package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class mh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mh f23073c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<c> f23074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lh f23075b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f23076a = new ArrayList();

        public final mh a() {
            return new mh(kc.t.L(this.f23076a));
        }
    }

    public static final class b {
        public static String a(X509Certificate x509Certificate) {
            fd.j0.i(x509Certificate, "certificate");
            StringBuilder sbA = v60.a("sha256/");
            sbA.append(c(x509Certificate).a());
            return sbA.toString();
        }

        public static qd.g b(X509Certificate x509Certificate) {
            fd.j0.i(x509Certificate, "<this>");
            qd.g.a aVar = qd.g.f34892f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            fd.j0.h(encoded, "publicKey.encoded");
            return qd.g.a.e(aVar, encoded, 0, 0, 3).i();
        }

        public static qd.g c(X509Certificate x509Certificate) {
            fd.j0.i(x509Certificate, "<this>");
            qd.g.a aVar = qd.g.f34892f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            fd.j0.h(encoded, "publicKey.encoded");
            return qd.g.a.e(aVar, encoded, 0, 0, 3).b("SHA-256");
        }
    }

    public static final class c {
        public static boolean a(String str) {
            fd.j0.i(str, "hostname");
            if (ed.q.u(null, "**.", false, 2) || ed.q.u(null, "*.", false, 2)) {
                throw null;
            }
            return fd.j0.d(str, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            Objects.requireNonNull((c) obj);
            return fd.j0.d(null, null) && fd.j0.d(null, null) && fd.j0.d(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class d extends vc.l implements uc.a<List<? extends X509Certificate>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<Certificate> f23078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Certificate> list, String str) {
            super(0);
            this.f23078b = list;
            this.f23079c = str;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0012  */
        @Override // uc.a
        public final List<? extends X509Certificate> invoke() throws SSLPeerUnverifiedException {
            List<Certificate> listA;
            lh lhVarA = mh.this.a();
            if (lhVarA != null) {
                listA = lhVarA.a(this.f23079c, this.f23078b);
                if (listA == null) {
                    listA = this.f23078b;
                }
            } else {
                listA = this.f23078b;
            }
            ArrayList arrayList = new ArrayList(kc.m.j(listA, 10));
            for (Certificate certificate : listA) {
                fd.j0.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public /* synthetic */ mh(Set set) {
        this(set, null);
    }

    public mh(Set<c> set, lh lhVar) {
        fd.j0.i(set, "pins");
        this.f23074a = set;
        this.f23075b = lhVar;
    }

    public final lh a() {
        return this.f23075b;
    }

    public final mh a(lh lhVar) {
        fd.j0.i(lhVar, "certificateChainCleaner");
        return fd.j0.d(this.f23075b, lhVar) ? this : new mh(this.f23074a, lhVar);
    }

    public final void a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        fd.j0.i(str, "hostname");
        fd.j0.i(list, "peerCertificates");
        a(str, new d(list, str));
    }

    public final void a(String str, uc.a<? extends List<? extends X509Certificate>> aVar) throws SSLPeerUnverifiedException {
        fd.j0.i(str, "hostname");
        fd.j0.i(aVar, "cleanedPeerCertificatesFn");
        Set<c> set = this.f23074a;
        List<c> arrayList = kc.w.f32009c;
        for (Object obj : set) {
            Objects.requireNonNull((c) obj);
            if (c.a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                vc.f0.b(arrayList).add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = aVar.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            Iterator it = arrayList.iterator();
            qd.g gVarC = null;
            qd.g gVarB = null;
            while (it.hasNext()) {
                Objects.requireNonNull((c) it.next());
                if (fd.j0.d(null, "sha256")) {
                    if (gVarC == null) {
                        gVarC = b.c(x509Certificate);
                    }
                    if (fd.j0.d(null, gVarC)) {
                        return;
                    }
                } else {
                    if (!fd.j0.d(null, "sha1")) {
                        throw new AssertionError(fn1.a("unsupported hashAlgorithm: ", null));
                    }
                    if (gVarB == null) {
                        gVarB = b.b(x509Certificate);
                    }
                    if (fd.j0.d(null, gVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sbA = android.support.v4.media.c.a("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sbA.append("\n    ");
            sbA.append(b.a(x509Certificate2));
            sbA.append(": ");
            sbA.append(x509Certificate2.getSubjectDN().getName());
        }
        sbA.append("\n  Pinned certificates for ");
        sbA.append(str);
        sbA.append(":");
        for (c cVar : arrayList) {
            sbA.append("\n    ");
            sbA.append(cVar);
        }
        String string = sbA.toString();
        fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mh) {
            mh mhVar = (mh) obj;
            if (fd.j0.d(mhVar.f23074a, this.f23074a) && fd.j0.d(mhVar.f23075b, this.f23075b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23074a.hashCode() + 1517) * 41;
        lh lhVar = this.f23075b;
        return iHashCode + (lhVar != null ? lhVar.hashCode() : 0);
    }
}
