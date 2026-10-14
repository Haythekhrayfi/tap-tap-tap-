package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f20851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f20852b;

    public fs() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f20851a = byteArrayOutputStream;
        this.f20852b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(EventMessage eventMessage) {
        this.f20851a.reset();
        try {
            DataOutputStream dataOutputStream = this.f20852b;
            dataOutputStream.writeBytes(eventMessage.f18535a);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f18536b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f20852b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f20852b.writeLong(eventMessage.f18537c);
            this.f20852b.writeLong(eventMessage.f18538d);
            this.f20852b.write(eventMessage.f18539e);
            this.f20852b.flush();
            return this.f20851a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
