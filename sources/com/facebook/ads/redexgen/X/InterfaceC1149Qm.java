package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1149Qm {
    boolean AB9(C1147Qk c1147Qk);

    HttpURLConnection ADT(String str, Proxy proxy) throws IOException;

    InputStream ADU(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ADV(HttpURLConnection httpURLConnection) throws IOException;

    void ADl(HttpURLConnection httpURLConnection, EnumC1145Qi enumC1145Qi, String str) throws IOException;

    byte[] AE5(InputStream inputStream) throws IOException;

    void AGK(OutputStream outputStream, byte[] bArr) throws IOException;
}
