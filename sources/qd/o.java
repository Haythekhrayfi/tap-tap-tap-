package qd;

import androidx.appcompat.widget.r0;
import fd.j0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final y a(File file) throws FileNotFoundException {
        Logger logger = p.f34912a;
        return new r(new FileOutputStream(file, true), new b0());
    }

    public static final e b(y yVar) {
        j0.i(yVar, "<this>");
        return new t(yVar);
    }

    public static final f c(a0 a0Var) {
        j0.i(a0Var, "<this>");
        return new u(a0Var);
    }

    public static final boolean d(AssertionError assertionError) {
        Logger logger = p.f34912a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? ed.u.x(message, "getsockname failed", false, 2) : false;
    }

    public static final y e(Socket socket) throws IOException {
        Logger logger = p.f34912a;
        j0.i(socket, "<this>");
        z zVar = new z(socket);
        OutputStream outputStream = socket.getOutputStream();
        j0.h(outputStream, "getOutputStream()");
        return zVar.sink(new r(outputStream, zVar));
    }

    public static y f(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        Logger logger = p.f34912a;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return new r(new FileOutputStream(file, z10), new b0());
    }

    public static long g(String str, int i10, int i11, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("beginIndex < 0: ", i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(n1.c.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (!(i11 <= str.length())) {
            StringBuilder sbA = r0.a("endIndex > string.length: ", i11, " > ");
            sbA.append(str.length());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i13 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i13 = 3;
                } else {
                    int i14 = i10 + 1;
                    char cCharAt2 = i14 < i11 ? str.charAt(i14) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i14;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i13;
            }
            i10++;
        }
        return j10;
    }

    public static final a0 h(Socket socket) throws IOException {
        Logger logger = p.f34912a;
        j0.i(socket, "<this>");
        z zVar = new z(socket);
        InputStream inputStream = socket.getInputStream();
        j0.h(inputStream, "getInputStream()");
        return zVar.source(new n(inputStream, zVar));
    }
}
