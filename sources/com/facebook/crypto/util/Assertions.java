package com.facebook.crypto.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Assertions {
    public static void checkArgumentForIO(boolean z10, String str) throws IOException {
        if (!z10) {
            throw new IOException(str);
        }
    }

    public static void checkState(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
