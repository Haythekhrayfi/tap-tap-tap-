package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface AH {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A4M(int i10, int i11, int i12) throws AG;

    ByteBuffer A7N();

    int A7O();

    int A7P();

    int A7Q();

    boolean A8k();

    boolean A8p();

    void ADv();

    void ADw(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
