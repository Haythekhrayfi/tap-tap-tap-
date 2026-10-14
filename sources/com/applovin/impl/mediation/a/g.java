package com.applovin.impl.mediation.a;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f9056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9060e;

    public interface a {
        void a(g gVar);
    }

    private g(h hVar, com.applovin.impl.mediation.g gVar, String str, String str2) {
        String strI;
        this.f9056a = hVar;
        this.f9059d = str;
        this.f9060e = str2;
        if (gVar != null) {
            this.f9057b = gVar.h();
            strI = gVar.i();
        } else {
            strI = null;
            this.f9057b = null;
        }
        this.f9058c = strI;
    }

    public static g a(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new g(hVar, gVar, str, null);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public static g a(h hVar, String str) {
        return b(hVar, null, str);
    }

    public static g b(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            return new g(hVar, gVar, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public h a() {
        return this.f9056a;
    }

    public String b() {
        return this.f9057b;
    }

    public String c() {
        return this.f9058c;
    }

    public String d() {
        return this.f9059d;
    }

    public String e() {
        return this.f9060e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SignalCollectionResult{mSignalProviderSpec=");
        sbA.append(this.f9056a);
        sbA.append(", mSdkVersion='");
        l1.c.a(sbA, this.f9057b, CoreConstants.SINGLE_QUOTE_CHAR, ", mAdapterVersion='");
        l1.c.a(sbA, this.f9058c, CoreConstants.SINGLE_QUOTE_CHAR, ", mSignalDataLength='");
        String str = this.f9059d;
        sbA.append(str != null ? str.length() : 0);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append(", mErrorMessage=");
        return s.a.a(sbA, this.f9060e, '}');
    }
}
