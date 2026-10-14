package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public final class re implements m81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f24677a;

    public re(X509Certificate... x509CertificateArr) {
        fd.j0.i(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            fd.j0.h(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f24677a = linkedHashMap;
    }

    @Override // com.yandex.mobile.ads.impl.m81
    public final X509Certificate a(X509Certificate x509Certificate) {
        boolean z10;
        fd.j0.i(x509Certificate, "cert");
        Set set = (Set) this.f24677a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                obj = obj2;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof re) && fd.j0.d(((re) obj).f24677a, this.f24677a));
    }

    public final int hashCode() {
        return this.f24677a.hashCode();
    }
}
