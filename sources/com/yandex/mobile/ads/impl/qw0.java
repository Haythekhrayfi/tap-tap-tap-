package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qw0 {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static pw0 a(byte[] bArr) {
            fd.j0.i(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            int length = bArr.length;
            ea1.a(bArr.length, 0, length);
            return new pw0(null, bArr, length, 0);
        }

        public static pw0 b(byte[] bArr) {
            int length = bArr.length;
            ea1.a(bArr.length, 0, length);
            return new pw0(null, bArr, length, 0);
        }
    }

    static {
        new a(0);
    }

    public static final pw0 a(byte[] bArr) {
        return a.a(bArr);
    }

    public abstract long a() throws IOException;

    public abstract void a(qd.e eVar) throws IOException;

    public abstract tc0 b();
}
