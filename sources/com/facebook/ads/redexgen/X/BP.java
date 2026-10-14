package com.facebook.ads.redexgen.X;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.facebook.ads.redexgen.X.BJ;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface BP<T extends BJ> {
    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    BK getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> map) throws NotProvisionedException;

    C1308Wt getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
