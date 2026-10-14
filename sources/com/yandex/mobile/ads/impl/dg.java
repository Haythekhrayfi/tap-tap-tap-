package com.yandex.mobile.ads.impl;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface dg {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public interface b {
        void a(dg dgVar, qg qgVar);

        void a(dg dgVar, qg qgVar, qg qgVar2);

        void a(qg qgVar);
    }

    long a();

    File a(String str, long j10, long j11) throws a;

    void a(qg qgVar);

    void a(File file, long j10) throws a;

    void a(String str);

    void a(String str, yk ykVar) throws a;

    long b(String str, long j10, long j11);

    sn b(String str);

    void b(qg qgVar);

    qg c(String str, long j10, long j11) throws a;

    long d(String str, long j10, long j11);

    qg e(String str, long j10, long j11) throws InterruptedException, a;
}
