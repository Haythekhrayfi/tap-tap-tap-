package jc;

import fd.j0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static final void a(Throwable th, Throwable th2) {
        j0.i(th, "<this>");
        j0.i(th2, "exception");
        if (th != th2) {
            pc.b.f34635a.a(th, th2);
        }
    }

    public static final String b(Throwable th) {
        j0.i(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        j0.h(string, "sw.toString()");
        return string;
    }
}
