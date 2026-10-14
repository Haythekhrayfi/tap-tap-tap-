package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1446at implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1446at(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ADR(int i10) throws C1445as {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1445as {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C1445as {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1445as {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
