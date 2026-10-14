package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r11 implements ie0 {
    @Override // com.yandex.mobile.ads.impl.ie0
    public final Metadata a(ke0 ke0Var) {
        ByteBuffer byteBuffer = ke0Var.f19004c;
        Objects.requireNonNull(byteBuffer);
        pa.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (ke0Var.e()) {
            return null;
        }
        return a(ke0Var, byteBuffer);
    }

    public abstract Metadata a(ke0 ke0Var, ByteBuffer byteBuffer);
}
