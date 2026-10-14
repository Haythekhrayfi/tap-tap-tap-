package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.yl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f18502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18503b;

        public a(String str, byte[] bArr) {
            this.f18502a = bArr;
            this.f18503b = str;
        }

        public final byte[] a() {
            return this.f18502a;
        }

        public final String b() {
            return this.f18503b;
        }
    }

    public interface b {
    }

    public interface c {
        m a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f18504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18505b;

        public d(String str, byte[] bArr) {
            this.f18504a = bArr;
            this.f18505b = str;
        }

        public final byte[] a() {
            return this.f18504a;
        }

        public final String b() {
            return this.f18505b;
        }
    }

    a a(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    d a();

    Map<String, String> a(byte[] bArr);

    void a(b bVar);

    default void a(byte[] bArr, gr0 gr0Var) {
    }

    void a(byte[] bArr, byte[] bArr2);

    boolean a(String str, byte[] bArr);

    int b();

    void b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void c(byte[] bArr) throws DeniedByServerException;

    byte[] c() throws MediaDrmException;

    yl d(byte[] bArr) throws MediaCryptoException;

    void release();
}
