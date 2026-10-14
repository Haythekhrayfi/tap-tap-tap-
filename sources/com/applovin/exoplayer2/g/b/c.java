package com.applovin.exoplayer2.g.b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f6323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f6324b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f6323a = byteArrayOutputStream;
        this.f6324b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f6323a.reset();
        try {
            a(this.f6324b, aVar.f6317a);
            String str = aVar.f6318b;
            if (str == null) {
                str = "";
            }
            a(this.f6324b, str);
            this.f6324b.writeLong(aVar.f6319c);
            this.f6324b.writeLong(aVar.f6320d);
            this.f6324b.write(aVar.f6321e);
            this.f6324b.flush();
            return this.f6323a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
