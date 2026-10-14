package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Objects;
import t5.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProtoEncoderDoNotUse {
    private static final g ENCODER;

    static {
        g.a aVar = new g.a();
        AutoProtoEncoderDoNotUseEncoder.CONFIG.configure(aVar);
        ENCODER = new g(new HashMap(aVar.f35699a), new HashMap(aVar.f35700b), aVar.f35701c);
    }

    private ProtoEncoderDoNotUse() {
    }

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        ENCODER.a(obj, outputStream);
    }

    public static byte[] encode(Object obj) {
        g gVar = ENCODER;
        Objects.requireNonNull(gVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gVar.a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract ClientMetrics getClientMetrics();
}
