package com.yandex.metrica.impl.ob;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class P7 implements Tm<File, K7, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2080x7 f14696a;

    public P7(C2080x7 c2080x7) {
        this.f14696a = c2080x7;
    }

    @Override // com.yandex.metrica.impl.ob.Tm
    public String a(File file, K7 k10) {
        byte[] bArrA;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bArrA = V0.a(fileInputStream, Integer.MAX_VALUE);
                        U2.a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        U2.a((Closeable) fileInputStream);
                        bArrA = null;
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bArrA = null;
            }
            if (!U2.a(bArrA)) {
                return V0.a(AbstractC1594e.a(this.f14696a.b(new L7(bArrA, k10))));
            }
        } catch (Throwable unused3) {
        }
        return null;
    }
}
