package com.google.android.play.core.internal;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cc f12290a;

    static {
        cc cgVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e10) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e10.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                cgVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new cf() : new cg();
            } else {
                cgVar = new ch();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = cg.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th.printStackTrace(System.err);
            cgVar = new cg();
        }
        f12290a = cgVar;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    public static void a(Throwable th, Throwable th2) {
        f12290a.a(th, th2);
    }
}
