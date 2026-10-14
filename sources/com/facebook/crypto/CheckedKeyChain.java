package com.facebook.crypto;

import com.facebook.crypto.exception.KeyChainException;
import com.facebook.crypto.keychain.KeyChain;

/* JADX INFO: loaded from: classes.dex */
class CheckedKeyChain implements KeyChain {
    private final CryptoConfig mConfig;
    private final KeyChain mDelegate;

    public CheckedKeyChain(KeyChain keyChain, CryptoConfig cryptoConfig) {
        this.mDelegate = keyChain;
        this.mConfig = cryptoConfig;
    }

    private void checkLength(byte[] bArr, int i10, String str) {
        if (bArr.length == i10) {
            return;
        }
        throw new IllegalStateException(str + " should be " + i10 + " bytes long but is " + bArr.length);
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public void destroyKeys() {
        this.mDelegate.destroyKeys();
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getCipherKey() throws KeyChainException {
        byte[] cipherKey = this.mDelegate.getCipherKey();
        checkLength(cipherKey, this.mConfig.keyLength, "Key");
        return cipherKey;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getMacKey() throws KeyChainException {
        byte[] macKey = this.mDelegate.getMacKey();
        checkLength(macKey, 64, "Mac");
        return macKey;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getNewIV() throws KeyChainException {
        byte[] newIV = this.mDelegate.getNewIV();
        checkLength(newIV, this.mConfig.ivLength, "IV");
        return newIV;
    }
}
