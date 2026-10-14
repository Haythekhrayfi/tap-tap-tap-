package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class es extends r11 {
    @Override // com.yandex.mobile.ads.impl.r11
    public final Metadata a(ke0 ke0Var, ByteBuffer byteBuffer) {
        mp0 mp0Var = new mp0(byteBuffer.limit(), byteBuffer.array());
        String strQ = mp0Var.q();
        Objects.requireNonNull(strQ);
        String strQ2 = mp0Var.q();
        Objects.requireNonNull(strQ2);
        return new Metadata(new EventMessage(strQ, strQ2, mp0Var.p(), mp0Var.p(), Arrays.copyOfRange(mp0Var.c(), mp0Var.d(), mp0Var.e())));
    }
}
