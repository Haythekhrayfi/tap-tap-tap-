package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
class Qh extends AbstractC1513ai {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14787f;

    public class a extends HashMap<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f14788a;

        public a(Qh qh, byte[] bArr) {
            this.f14788a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    public Qh(Socket socket, Uri uri, InterfaceC1663gi interfaceC1663gi, Ei ei, String str, C1688hi c1688hi) {
        super(socket, uri, interfaceC1663gi, ei, c1688hi);
        this.f14787f = str;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1513ai
    public void a() {
        try {
            byte[] bArrEncode = Base64.encode(new C1668gn().a(this.f14787f.getBytes()), 0);
            a("HTTP/1.1 200 OK", new a(this, bArrEncode), bArrEncode);
        } catch (Throwable unused) {
        }
    }
}
