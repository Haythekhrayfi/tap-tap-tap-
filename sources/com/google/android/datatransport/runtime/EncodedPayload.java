package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final Encoding encoding;

    public EncodedPayload(Encoding encoding, byte[] bArr) {
        Objects.requireNonNull(encoding, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.encoding = encoding;
        this.bytes = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.encoding.equals(encodedPayload.encoding)) {
            return Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return ((this.encoding.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bytes);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("EncodedPayload{encoding=");
        sbA.append(this.encoding);
        sbA.append(", bytes=[...]}");
        return sbA.toString();
    }
}
