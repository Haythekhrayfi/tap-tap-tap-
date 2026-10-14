package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1563ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Socket f15887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1663gi f15888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, InterfaceC1538bi> f15889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1688hi f15890d;

    public C1563ci(Socket socket, InterfaceC1663gi interfaceC1663gi, Map<String, InterfaceC1538bi> map, C1688hi c1688hi) {
        this.f15887a = socket;
        this.f15888b = interfaceC1663gi;
        this.f15889c = map;
        this.f15890d = c1688hi;
    }

    public void a() {
        int iIndexOf;
        int iIndexOf2;
        BufferedReader bufferedReader = null;
        String strSubstring = null;
        try {
            try {
                this.f15887a.setSoTimeout(1000);
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f15887a.getInputStream()));
                try {
                    this.f15890d.a();
                    String line = bufferedReader2.readLine();
                    if (TextUtils.isEmpty(line) || (!(line.startsWith("GET /") || line.startsWith("POST /")) || (iIndexOf2 = line.indexOf(32, (iIndexOf = line.indexOf(47) + 1))) <= 0)) {
                        ((RunnableC1737ji) this.f15888b).a("invalid_route", line);
                    } else {
                        strSubstring = line.substring(iIndexOf, iIndexOf2);
                    }
                    if (strSubstring != null) {
                        Uri uri = Uri.parse(strSubstring);
                        InterfaceC1538bi interfaceC1538bi = this.f15889c.get(uri.getPath());
                        if (interfaceC1538bi != null) {
                            AbstractC1513ai abstractC1513aiA = interfaceC1538bi.a(this.f15887a, uri, this.f15890d);
                            if (abstractC1513aiA.f15763c.f13914b.equals(abstractC1513aiA.f15764d.getQueryParameter("t"))) {
                                abstractC1513aiA.a();
                            } else {
                                ((RunnableC1737ji) abstractC1513aiA.f15762b).a("request_with_wrong_token");
                            }
                        } else {
                            ((RunnableC1737ji) this.f15888b).a("request_to_unknown_path", strSubstring);
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        ((RunnableC1737ji) this.f15888b).a("LocalHttpServer exception", th);
                        if (bufferedReader == null) {
                        } else {
                            bufferedReader.close();
                        }
                    } catch (Throwable th2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
