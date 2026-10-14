package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class p41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt0 f23980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23982c;

    public static final class a {
        public static p41 a(String str) throws IOException {
            nt0 nt0Var;
            String strSubstring;
            fd.j0.i(str, "statusLine");
            int i10 = 9;
            if (ed.q.u(str, "HTTP/1.", false, 2)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(fn1.a("Unexpected status line: ", str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    nt0Var = nt0.f23544b;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(fn1.a("Unexpected status line: ", str));
                    }
                    nt0Var = nt0.f23545c;
                }
            } else {
                if (!ed.q.u(str, "ICY ", false, 2)) {
                    throw new ProtocolException(fn1.a("Unexpected status line: ", str));
                }
                nt0Var = nt0.f23544b;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (str.length() < i11) {
                throw new ProtocolException(fn1.a("Unexpected status line: ", str));
            }
            try {
                String strSubstring2 = str.substring(i10, i11);
                fd.j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (str.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i11) != ' ') {
                        throw new ProtocolException(fn1.a("Unexpected status line: ", str));
                    }
                    strSubstring = str.substring(i10 + 4);
                    fd.j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new p41(nt0Var, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(fn1.a("Unexpected status line: ", str));
            }
        }
    }

    public p41(nt0 nt0Var, int i10, String str) {
        fd.j0.i(nt0Var, "protocol");
        fd.j0.i(str, "message");
        this.f23980a = nt0Var;
        this.f23981b = i10;
        this.f23982c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23980a == nt0.f23544b ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f23981b);
        sb2.append(' ');
        sb2.append(this.f23982c);
        String string = sb2.toString();
        fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
