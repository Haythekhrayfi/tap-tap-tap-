package com.facebook.crypto.mac;

import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.proguard.annotations.DoNotStrip;
import com.facebook.crypto.util.Assertions;
import com.facebook.crypto.util.NativeCryptoLibrary;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class NativeMac {
    public static final String FAILURE = "Failure";
    public static final int KEY_LENGTH = 64;
    private static final String MAC_ALREADY_INIT = "Mac has already been initialized";
    private static final String MAC_NOT_FINALIZED = "Mac has not been finalized";
    private static final String MAC_NOT_INIT = "Mac has not been initialized";

    @DoNotStrip
    private long mCtxPtr;
    private STATE mCurrentState = STATE.UNINITIALIZED;
    private final NativeCryptoLibrary mNativeCryptoLibrary;

    public enum STATE {
        UNINITIALIZED,
        INITIALIZED,
        FINALIZED
    }

    public NativeMac(NativeCryptoLibrary nativeCryptoLibrary) {
        this.mNativeCryptoLibrary = nativeCryptoLibrary;
    }

    private native int nativeDestroy();

    private native byte[] nativeDoFinal();

    private static native int nativeFailure();

    private native int nativeGetMacLength();

    private native int nativeInit(byte[] bArr, int i10);

    private native int nativeUpdate(byte b10);

    private native int nativeUpdate(byte[] bArr, int i10, int i11);

    public void destroy() throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.FINALIZED, MAC_NOT_FINALIZED);
        if (nativeDestroy() == nativeFailure()) {
            throw new IOException("Failure");
        }
        this.mCurrentState = STATE.UNINITIALIZED;
    }

    public byte[] doFinal() throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.INITIALIZED, MAC_NOT_INIT);
        this.mCurrentState = STATE.FINALIZED;
        byte[] bArrNativeDoFinal = nativeDoFinal();
        if (bArrNativeDoFinal != null) {
            return bArrNativeDoFinal;
        }
        throw new IOException("Failure");
    }

    public int getMacLength() {
        return nativeGetMacLength();
    }

    public void init(byte[] bArr, int i10) throws CryptoInitializationException, IOException {
        Assertions.checkState(this.mCurrentState == STATE.UNINITIALIZED, MAC_ALREADY_INIT);
        this.mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeInit(bArr, i10) == nativeFailure()) {
            throw new IOException("Failure");
        }
        this.mCurrentState = STATE.INITIALIZED;
    }

    public void update(byte b10) throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.INITIALIZED, MAC_NOT_INIT);
        if (nativeUpdate(b10) == nativeFailure()) {
            throw new IOException("Failure");
        }
    }

    public void update(byte[] bArr, int i10, int i11) throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.INITIALIZED, MAC_NOT_INIT);
        if (nativeUpdate(bArr, i10, i11) == nativeFailure()) {
            throw new IOException("Failure");
        }
    }
}
