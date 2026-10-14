package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<nk> f23839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23842d;

    public ok(List<nk> list) {
        fd.j0.i(list, "connectionSpecs");
        this.f23839a = list;
    }

    public final nk a(SSLSocket sSLSocket) throws IOException, CloneNotSupportedException {
        boolean z10;
        nk nkVar;
        fd.j0.i(sSLSocket, "sslSocket");
        int i10 = this.f23840b;
        int size = this.f23839a.size();
        while (true) {
            z10 = true;
            if (i10 >= size) {
                nkVar = null;
                break;
            }
            nkVar = this.f23839a.get(i10);
            if (nkVar.a(sSLSocket)) {
                this.f23840b = i10 + 1;
                break;
            }
            i10++;
        }
        if (nkVar == null) {
            StringBuilder sbA = v60.a("Unable to find acceptable protocols. isFallback=");
            sbA.append(this.f23842d);
            sbA.append(", modes=");
            sbA.append(this.f23839a);
            sbA.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            fd.j0.f(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            fd.j0.h(string, "toString(this)");
            sbA.append(string);
            throw new UnknownServiceException(sbA.toString());
        }
        int size2 = this.f23839a.size();
        for (int i11 = this.f23840b; i11 < size2; i11++) {
            if (this.f23839a.get(i11).a(sSLSocket)) {
                this.f23841c = z10;
                nkVar.a(sSLSocket, this.f23842d);
                return nkVar;
            }
        }
        z10 = false;
        this.f23841c = z10;
        nkVar.a(sSLSocket, this.f23842d);
        return nkVar;
    }

    public final boolean a(IOException iOException) {
        fd.j0.i(iOException, "e");
        this.f23842d = true;
        return (!this.f23841c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
