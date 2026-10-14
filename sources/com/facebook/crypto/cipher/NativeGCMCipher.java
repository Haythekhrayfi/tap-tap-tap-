package com.facebook.crypto.cipher;

import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.proguard.annotations.DoNotStrip;
import com.facebook.crypto.util.Assertions;
import com.facebook.crypto.util.NativeCryptoLibrary;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class NativeGCMCipher {
    private static final String CIPHER_ALREADY_INIT = "Cipher has already been initialized";
    private static final String CIPHER_NOT_FINALIZED = "Cipher has not been finalized";
    private static final String CIPHER_NOT_INIT = "Cipher has not been initialized";
    public static final String FAILURE = "Failure";

    @DoNotStrip
    private long mCtxPtr;
    private STATE mCurrentState = STATE.UNINITIALIZED;
    private final NativeCryptoLibrary mNativeCryptoLibrary;

    public enum STATE {
        UNINITIALIZED,
        ENCRYPT_INITIALIZED,
        DECRYPT_INITIALIZED,
        ENCRYPT_FINALIZED,
        DECRYPT_FINALIZED
    }

    public NativeGCMCipher(NativeCryptoLibrary nativeCryptoLibrary) {
        this.mNativeCryptoLibrary = nativeCryptoLibrary;
    }

    private void ensureInFinalizedState() {
        STATE state = this.mCurrentState;
        Assertions.checkState(state == STATE.DECRYPT_FINALIZED || state == STATE.ENCRYPT_FINALIZED, CIPHER_NOT_FINALIZED);
    }

    private void ensureInInitalizedState() {
        STATE state = this.mCurrentState;
        Assertions.checkState(state == STATE.DECRYPT_INITIALIZED || state == STATE.ENCRYPT_INITIALIZED, CIPHER_NOT_INIT);
    }

    private String formatStrLocaleSafe(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private native int nativeDecryptFinal(byte[] bArr, int i10);

    private native int nativeDecryptInit(byte[] bArr, byte[] bArr2);

    private native int nativeDestroy();

    private native int nativeEncryptFinal(byte[] bArr, int i10);

    private native int nativeEncryptInit(byte[] bArr, byte[] bArr2);

    private static native int nativeFailure();

    private native int nativeGetCipherBlockSize();

    private native int nativeUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    private native int nativeUpdateAad(byte[] bArr, int i10);

    public void decryptFinal(byte[] bArr, int i10) throws NativeGCMCipherException {
        Assertions.checkState(this.mCurrentState == STATE.DECRYPT_INITIALIZED, CIPHER_NOT_INIT);
        this.mCurrentState = STATE.DECRYPT_FINALIZED;
        if (nativeDecryptFinal(bArr, i10) == nativeFailure()) {
            throw new NativeGCMCipherException("The message could not be decrypted successfully.It has either been tampered with or the wrong resource is being decrypted.");
        }
    }

    public void decryptInit(byte[] bArr, byte[] bArr2) throws CryptoInitializationException, NativeGCMCipherException {
        Assertions.checkState(this.mCurrentState == STATE.UNINITIALIZED, CIPHER_ALREADY_INIT);
        this.mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeDecryptInit(bArr, bArr2) == nativeFailure()) {
            throw new NativeGCMCipherException("decryptInit");
        }
        this.mCurrentState = STATE.DECRYPT_INITIALIZED;
    }

    public void destroy() throws NativeGCMCipherException {
        ensureInFinalizedState();
        if (nativeDestroy() == nativeFailure()) {
            throw new NativeGCMCipherException("destroy");
        }
        this.mCurrentState = STATE.UNINITIALIZED;
    }

    public void encryptFinal(byte[] bArr, int i10) throws NativeGCMCipherException {
        Assertions.checkState(this.mCurrentState == STATE.ENCRYPT_INITIALIZED, CIPHER_NOT_INIT);
        this.mCurrentState = STATE.ENCRYPT_FINALIZED;
        if (nativeEncryptFinal(bArr, i10) == nativeFailure()) {
            throw new NativeGCMCipherException(formatStrLocaleSafe("encryptFinal: %d", Integer.valueOf(i10)));
        }
    }

    public void encryptInit(byte[] bArr, byte[] bArr2) throws CryptoInitializationException, NativeGCMCipherException {
        Assertions.checkState(this.mCurrentState == STATE.UNINITIALIZED, CIPHER_ALREADY_INIT);
        this.mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeEncryptInit(bArr, bArr2) == nativeFailure()) {
            throw new NativeGCMCipherException("encryptInit");
        }
        this.mCurrentState = STATE.ENCRYPT_INITIALIZED;
    }

    public int getCipherBlockSize() {
        ensureInInitalizedState();
        return nativeGetCipherBlockSize();
    }

    public int update(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws NativeGCMCipherException {
        ensureInInitalizedState();
        int iNativeUpdate = nativeUpdate(bArr, i10, i11, bArr2, i12);
        if (iNativeUpdate >= 0) {
            return iNativeUpdate;
        }
        throw new NativeGCMCipherException(formatStrLocaleSafe("update: Offset = %d; DataLen = %d; Result = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(iNativeUpdate)));
    }

    public void updateAad(byte[] bArr, int i10) throws NativeGCMCipherException {
        ensureInInitalizedState();
        if (nativeUpdateAad(bArr, i10) < 0) {
            throw new NativeGCMCipherException(formatStrLocaleSafe("updateAAd: DataLen = %d", Integer.valueOf(i10)));
        }
    }
}
