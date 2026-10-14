package com.facebook.crypto;

/* JADX INFO: loaded from: classes.dex */
public enum CryptoConfig {
    KEY_128((byte) 1, 16, 12, 16),
    KEY_256((byte) 2, 32, 12, 16);

    public final byte cipherId;
    public final int ivLength;
    public final int keyLength;
    public final int tagLength;

    CryptoConfig(byte b10, int i10, int i11, int i12) {
        this.cipherId = b10;
        this.keyLength = i10;
        this.ivLength = i11;
        this.tagLength = i12;
    }
}
