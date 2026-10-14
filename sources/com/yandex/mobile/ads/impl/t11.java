package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t11 extends o11<l51, m51, j51> implements i51 {
    public t11() {
        super(new l51[2], new m51[2]);
        f();
    }

    public abstract h51 a(byte[] bArr, int i10, boolean z10) throws j51;

    @Override // com.yandex.mobile.ads.impl.o11
    public final j51 a(an anVar, bn bnVar, boolean z10) {
        l51 l51Var = (l51) anVar;
        m51 m51Var = (m51) bnVar;
        try {
            ByteBuffer byteBuffer = l51Var.f19004c;
            Objects.requireNonNull(byteBuffer);
            m51Var.a(l51Var.f19006e, a(byteBuffer.array(), byteBuffer.limit(), z10), l51Var.f22626i);
            m51Var.c();
            return null;
        } catch (j51 e10) {
            return e10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.i51
    public final void a(long j10) {
    }

    @Override // com.yandex.mobile.ads.impl.o11
    public final l51 c() {
        return new l51();
    }

    @Override // com.yandex.mobile.ads.impl.o11
    public final bn d() {
        return new s11(this);
    }
}
