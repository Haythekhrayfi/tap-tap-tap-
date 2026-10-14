package sc;

import ed.c;
import fd.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a {
    public static String a(File file, Charset charset, int i10) {
        Charset charset2 = (i10 & 1) != 0 ? c.f29139b : null;
        j0.i(charset2, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset2);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            while (true) {
                int i11 = inputStreamReader.read(cArr);
                if (i11 < 0) {
                    String string = stringWriter.toString();
                    j0.h(string, "buffer.toString()");
                    c0.g(inputStreamReader, null);
                    return string;
                }
                stringWriter.write(cArr, 0, i11);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static final void b(File file, byte[] bArr) {
        j0.i(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            c0.g(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
