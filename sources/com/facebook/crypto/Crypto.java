package com.facebook.crypto;

import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.exception.KeyChainException;
import com.facebook.crypto.keychain.KeyChain;
import com.facebook.crypto.mac.NativeMac;
import com.facebook.crypto.streams.FixedSizeByteArrayOutputStream;
import com.facebook.crypto.streams.NativeMacLayeredInputStream;
import com.facebook.crypto.streams.NativeMacLayeredOutputStream;
import com.facebook.crypto.util.Assertions;
import com.facebook.crypto.util.NativeCryptoLibrary;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class Crypto {
    private final CryptoAlgo mCryptoAlgo;
    private final KeyChain mKeyChain;
    private final NativeCryptoLibrary mNativeCryptoLibrary;

    @Deprecated
    public Crypto(KeyChain keyChain, NativeCryptoLibrary nativeCryptoLibrary) {
        this(keyChain, nativeCryptoLibrary, CryptoConfig.KEY_128);
    }

    public Crypto(KeyChain keyChain, NativeCryptoLibrary nativeCryptoLibrary, CryptoConfig cryptoConfig) {
        CheckedKeyChain checkedKeyChain = new CheckedKeyChain(keyChain, cryptoConfig);
        this.mKeyChain = checkedKeyChain;
        this.mNativeCryptoLibrary = nativeCryptoLibrary;
        this.mCryptoAlgo = new CryptoAlgoGcm(nativeCryptoLibrary, checkedKeyChain, cryptoConfig);
    }

    private static void computeMacAad(NativeMac nativeMac, byte b10, byte b11, byte[] bArr) throws IOException {
        nativeMac.update(new byte[]{b10}, 0, 1);
        nativeMac.update(new byte[]{b11}, 0, 1);
        nativeMac.update(bArr, 0, bArr.length);
    }

    public byte[] decrypt(byte[] bArr, Entity entity) throws CryptoInitializationException, IOException, KeyChainException {
        int length = bArr.length;
        InputStream cipherInputStream = getCipherInputStream(new ByteArrayInputStream(bArr), entity);
        FixedSizeByteArrayOutputStream fixedSizeByteArrayOutputStream = new FixedSizeByteArrayOutputStream(length - getCipherMetaDataLength());
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = cipherInputStream.read(bArr2);
            if (i10 == -1) {
                cipherInputStream.close();
                return fixedSizeByteArrayOutputStream.getBytes();
            }
            fixedSizeByteArrayOutputStream.write(bArr2, 0, i10);
        }
    }

    public byte[] encrypt(byte[] bArr, Entity entity) throws CryptoInitializationException, IOException, KeyChainException {
        FixedSizeByteArrayOutputStream fixedSizeByteArrayOutputStream = new FixedSizeByteArrayOutputStream(getCipherMetaDataLength() + bArr.length);
        OutputStream cipherOutputStream = getCipherOutputStream(fixedSizeByteArrayOutputStream, entity, null);
        cipherOutputStream.write(bArr);
        cipherOutputStream.close();
        return fixedSizeByteArrayOutputStream.getBytes();
    }

    public InputStream getCipherInputStream(InputStream inputStream, Entity entity) throws CryptoInitializationException, IOException, KeyChainException {
        return this.mCryptoAlgo.wrap(inputStream, entity);
    }

    public int getCipherMetaDataLength() {
        return this.mCryptoAlgo.getCipherMetaDataLength();
    }

    public OutputStream getCipherOutputStream(OutputStream outputStream, Entity entity) throws CryptoInitializationException, IOException, KeyChainException {
        return getCipherOutputStream(outputStream, entity, null);
    }

    public OutputStream getCipherOutputStream(OutputStream outputStream, Entity entity, byte[] bArr) throws CryptoInitializationException, IOException, KeyChainException {
        return this.mCryptoAlgo.wrap(outputStream, entity, bArr);
    }

    public InputStream getMacInputStream(InputStream inputStream, Entity entity) throws CryptoInitializationException, IOException, KeyChainException {
        byte b10 = (byte) inputStream.read();
        Assertions.checkArgumentForIO(b10 == 1, "Unexpected mac version " + ((int) b10));
        byte b11 = (byte) inputStream.read();
        Assertions.checkArgumentForIO(b11 == 1, "Unexpected mac ID " + ((int) b11));
        NativeMac nativeMac = new NativeMac(this.mNativeCryptoLibrary);
        byte[] macKey = this.mKeyChain.getMacKey();
        nativeMac.init(macKey, macKey.length);
        computeMacAad(nativeMac, b10, (byte) 1, entity.getBytes());
        return new NativeMacLayeredInputStream(nativeMac, inputStream);
    }

    public OutputStream getMacOutputStream(OutputStream outputStream, Entity entity) throws CryptoInitializationException, IOException, KeyChainException {
        outputStream.write(1);
        outputStream.write(1);
        NativeMac nativeMac = new NativeMac(this.mNativeCryptoLibrary);
        byte[] macKey = this.mKeyChain.getMacKey();
        nativeMac.init(macKey, macKey.length);
        computeMacAad(nativeMac, (byte) 1, (byte) 1, entity.getBytes());
        return new NativeMacLayeredOutputStream(nativeMac, outputStream);
    }

    public boolean isAvailable() {
        try {
            this.mNativeCryptoLibrary.ensureCryptoLoaded();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
