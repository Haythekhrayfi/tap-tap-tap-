package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum nt0 {
    f23544b("http/1.0"),
    f23545c("http/1.1"),
    f23546d("spdy/3.1"),
    f23547e("h2"),
    f23548f("h2_prior_knowledge"),
    f23549g("quic");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23551a;

    public static final class a {
        public static nt0 a(String str) throws IOException {
            fd.j0.i(str, "protocol");
            nt0 nt0Var = nt0.f23544b;
            if (!fd.j0.d(str, nt0Var.f23551a)) {
                nt0Var = nt0.f23545c;
                if (!fd.j0.d(str, nt0Var.f23551a)) {
                    nt0Var = nt0.f23548f;
                    if (!fd.j0.d(str, nt0Var.f23551a)) {
                        nt0Var = nt0.f23547e;
                        if (!fd.j0.d(str, nt0Var.f23551a)) {
                            nt0Var = nt0.f23546d;
                            if (!fd.j0.d(str, nt0Var.f23551a)) {
                                nt0Var = nt0.f23549g;
                                if (!fd.j0.d(str, nt0Var.f23551a)) {
                                    throw new IOException(fn1.a("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return nt0Var;
        }
    }

    nt0(String str) {
        this.f23551a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23551a;
    }
}
