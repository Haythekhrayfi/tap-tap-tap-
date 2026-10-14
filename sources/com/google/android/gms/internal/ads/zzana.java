package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzana extends zzgvl {
    public ByteBuffer zza;

    public zzana(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgvl
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
