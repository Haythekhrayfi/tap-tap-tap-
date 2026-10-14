package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfue extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr);
        zzfph.zzg(i10, i11 + i10, bArr.length);
    }
}
