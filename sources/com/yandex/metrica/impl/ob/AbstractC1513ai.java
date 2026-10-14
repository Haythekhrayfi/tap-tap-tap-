package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1513ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Socket f15761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1663gi f15762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ei f15763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f15764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1688hi f15765e;

    public AbstractC1513ai(Socket socket, Uri uri, InterfaceC1663gi interfaceC1663gi, Ei ei, C1688hi c1688hi) {
        this.f15761a = socket;
        this.f15764d = uri;
        this.f15762b = interfaceC1663gi;
        this.f15763c = ei;
        this.f15765e = c1688hi;
    }

    private void a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }

    private void a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        a(outputStream);
    }

    public abstract void a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public void a(String str, Map<String, String> map, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        this.f15765e.b();
        ?? r10 = 0;
        String str2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(this.f15761a.getOutputStream());
                try {
                    bufferedOutputStream3.write(str.getBytes());
                    a(bufferedOutputStream3);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        a(bufferedOutputStream3, key, entry.getValue());
                        str2 = key;
                    }
                    a(bufferedOutputStream3);
                    bufferedOutputStream3.write(bArr);
                    bufferedOutputStream3.flush();
                    this.f15765e.c();
                    ((RunnableC1737ji) this.f15762b).b(this.f15761a.getLocalPort(), this.f15765e);
                    r10 = str2;
                    bufferedOutputStream = bufferedOutputStream3;
                } catch (IOException e10) {
                    e = e10;
                    bufferedOutputStream2 = bufferedOutputStream3;
                    ((RunnableC1737ji) this.f15762b).a("io_exception_during_sync", e);
                    bufferedOutputStream = bufferedOutputStream2;
                    r10 = bufferedOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    r10 = bufferedOutputStream3;
                    U2.a((Closeable) r10);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        U2.a((Closeable) bufferedOutputStream);
    }
}
