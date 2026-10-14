package com.facebook.crypto;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class Entity {
    private static final Charset UTF_16 = Charset.forName("UTF-16");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] mBytes;

    @Deprecated
    public Entity(String str) {
        this.mBytes = str.getBytes(UTF_16);
    }

    private Entity(byte[] bArr) {
        this.mBytes = bArr;
    }

    public static Entity create(String str) {
        return new Entity(str.getBytes(UTF_8));
    }

    @Deprecated
    public static Entity utf16(String str) {
        return new Entity(str);
    }

    public byte[] getBytes() {
        return this.mBytes;
    }
}
