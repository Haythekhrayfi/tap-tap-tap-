package com.facebook.ads.redexgen.X;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1450ax implements AnonymousClass03<File> {
    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    public final AnonymousClass02<File> A3H(File file, C0L c0l) {
        if (file.exists()) {
            return new AnonymousClass02<>(true, file);
        }
        return new AnonymousClass02<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    public final void A4Q(File file, C0L c0l) {
    }
}
