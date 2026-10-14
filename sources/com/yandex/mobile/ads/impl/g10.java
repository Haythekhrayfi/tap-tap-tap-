package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class g10 extends ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f20927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f20928b;

    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f20929a;

        public a(HttpURLConnection httpURLConnection) {
            super(g10.a(httpURLConnection));
            this.f20929a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f20929a.disconnect();
        }
    }

    public interface b extends q91 {
    }

    public g10(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f20927a = bVar;
        this.f20928b = sSLSocketFactory;
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public static void a(mw0 mw0Var, HttpURLConnection httpURLConnection) throws fc, IOException {
        String str;
        switch (mw0Var.g()) {
            case -1:
                return;
            case 0:
                str = "GET";
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrB = mw0Var.b();
                if (bArrB != null) {
                    a(httpURLConnection, bArrB);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] bArrB2 = mw0Var.b();
                if (bArrB2 != null) {
                    a(httpURLConnection, bArrB2);
                    return;
                }
                return;
            case 3:
                str = "DELETE";
                break;
            case 4:
                str = "HEAD";
                break;
            case 5:
                str = "OPTIONS";
                break;
            case 6:
                str = "TRACE";
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] bArrB3 = mw0Var.b();
                if (bArrB3 != null) {
                    a(httpURLConnection, bArrB3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        httpURLConnection.setRequestMethod(str);
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", mw0.c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    @Override // com.yandex.mobile.ads.impl.ie
    public final z00 a(mw0<?> mw0Var, Map<String, String> map) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        String strM = mw0Var.m();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(mw0Var.f());
        b bVar = this.f20927a;
        if (bVar != null) {
            String strA = bVar.a(strM);
            if (strA == null) {
                throw new IOException(fn1.a("URL blocked by rewriter: ", strM));
            }
            strM = strA;
        }
        URL url = new URL(strM);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iK = mw0Var.k();
        httpURLConnection.setConnectTimeout(iK);
        httpURLConnection.setReadTimeout(iK);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f20928b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            a(mw0Var, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (!((mw0Var.g() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                ArrayList arrayList = new ArrayList(headerFields.size());
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    if (entry.getKey() != null) {
                        Iterator<String> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            arrayList.add(new oy(entry.getKey(), it.next()));
                        }
                    }
                }
                z00 z00Var = new z00(responseCode, arrayList);
                httpURLConnection.disconnect();
                return z00Var;
            }
            try {
                Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                ArrayList arrayList2 = new ArrayList(headerFields2.size());
                for (Map.Entry<String, List<String>> entry2 : headerFields2.entrySet()) {
                    if (entry2.getKey() != null) {
                        Iterator<String> it2 = entry2.getValue().iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new oy(entry2.getKey(), it2.next()));
                        }
                    }
                }
                return new z00(responseCode, arrayList2, httpURLConnection.getContentLength(), new a(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
