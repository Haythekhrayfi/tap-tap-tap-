package com.facebook.android.crypto.keychain;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.crypto.CryptoConfig;
import com.facebook.crypto.exception.KeyChainException;
import com.facebook.crypto.keychain.KeyChain;
import defpackage.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SharedPrefsBackedKeyChain implements KeyChain {
    public static final String CIPHER_KEY_PREF = "cipher_key";
    public static final String MAC_KEY_PREF = "mac_key";
    public static final String SHARED_PREF_NAME = "crypto";
    public byte[] mCipherKey;
    private final CryptoConfig mCryptoConfig;
    public byte[] mMacKey;
    private final FixedSecureRandom mSecureRandom;
    public boolean mSetCipherKey;
    public boolean mSetMacKey;
    private final SharedPreferences mSharedPreferences;

    @Deprecated
    public SharedPrefsBackedKeyChain(Context context) {
        this(context, CryptoConfig.KEY_128);
    }

    public SharedPrefsBackedKeyChain(Context context, CryptoConfig cryptoConfig) {
        this.mSharedPreferences = context.getSharedPreferences(prefNameForConfig(cryptoConfig), 0);
        this.mSecureRandom = new FixedSecureRandom();
        this.mCryptoConfig = cryptoConfig;
    }

    private byte[] generateAndSaveKey(String str, int i10) throws KeyChainException {
        byte[] bArr = new byte[i10];
        this.mSecureRandom.nextBytes(bArr);
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putString(str, encodeForPrefs(bArr));
        editorEdit.commit();
        return bArr;
    }

    private byte[] maybeGenerateKey(String str, int i10) throws KeyChainException {
        String string = this.mSharedPreferences.getString(str, null);
        return string == null ? generateAndSaveKey(str, i10) : decodeFromPrefs(string);
    }

    private static String prefNameForConfig(CryptoConfig cryptoConfig) {
        if (cryptoConfig == CryptoConfig.KEY_128) {
            return SHARED_PREF_NAME;
        }
        StringBuilder sbA = a.a("crypto.");
        sbA.append(String.valueOf(cryptoConfig));
        return sbA.toString();
    }

    public byte[] decodeFromPrefs(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public synchronized void destroyKeys() {
        this.mSetCipherKey = false;
        this.mSetMacKey = false;
        byte[] bArr = this.mCipherKey;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        byte[] bArr2 = this.mMacKey;
        if (bArr2 != null) {
            Arrays.fill(bArr2, (byte) 0);
        }
        this.mCipherKey = null;
        this.mMacKey = null;
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.remove(CIPHER_KEY_PREF);
        editorEdit.remove(MAC_KEY_PREF);
        editorEdit.commit();
    }

    public String encodeForPrefs(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public synchronized byte[] getCipherKey() throws KeyChainException {
        if (!this.mSetCipherKey) {
            this.mCipherKey = maybeGenerateKey(CIPHER_KEY_PREF, this.mCryptoConfig.keyLength);
        }
        this.mSetCipherKey = true;
        return this.mCipherKey;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getMacKey() throws KeyChainException {
        if (!this.mSetMacKey) {
            this.mMacKey = maybeGenerateKey(MAC_KEY_PREF, 64);
        }
        this.mSetMacKey = true;
        return this.mMacKey;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getNewIV() throws KeyChainException {
        byte[] bArr = new byte[this.mCryptoConfig.ivLength];
        this.mSecureRandom.nextBytes(bArr);
        return bArr;
    }
}
