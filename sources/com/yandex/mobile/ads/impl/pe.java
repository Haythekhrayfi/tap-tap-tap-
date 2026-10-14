package com.yandex.mobile.ads.impl;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class pe extends lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m81 f24045a;

    public pe(m81 m81Var) {
        fd.j0.i(m81Var, "trustRootIndex");
        this.f24045a = m81Var;
    }

    @Override // com.yandex.mobile.ads.impl.lh
    public final List a(String str, List list) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        boolean z10;
        boolean z11;
        fd.j0.i(list, "chain");
        fd.j0.i(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        fd.j0.h(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z12 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            fd.j0.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f24045a.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !fd.j0.d(x509Certificate2, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (fd.j0.d(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        z11 = true;
                    } catch (GeneralSecurityException unused) {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                    return arrayList;
                }
                z12 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                fd.j0.h(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z12) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                    }
                    Object next = it.next();
                    fd.j0.g(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                    if (fd.j0.d(x509Certificate2.getIssuerDN(), x509Certificate.getSubjectDN())) {
                        try {
                            x509Certificate2.verify(x509Certificate.getPublicKey());
                            z10 = true;
                        } catch (GeneralSecurityException unused2) {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } while (!z10);
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof pe) && fd.j0.d(((pe) obj).f24045a, this.f24045a));
    }

    public final int hashCode() {
        return this.f24045a.hashCode();
    }
}
