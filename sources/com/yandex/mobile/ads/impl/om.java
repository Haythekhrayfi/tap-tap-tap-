package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class om {
    public static void a(lm lmVar) {
        if (lmVar != null) {
            try {
                lmVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
