package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f5151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f5152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5153c;

        public a(byte[] bArr, String str, int i10) {
            this.f5151a = bArr;
            this.f5152b = str;
            this.f5153c = i10;
        }

        public byte[] a() {
            return this.f5151a;
        }

        public String b() {
            return this.f5152b;
        }
    }

    public interface b {
        void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface c {
        m acquireExoMediaDrm(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f5154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f5155b;

        public d(byte[] bArr, String str) {
            this.f5154a = bArr;
            this.f5155b = str;
        }

        public byte[] a() {
            return this.f5154a;
        }

        public String b() {
            return this.f5155b;
        }
    }

    a a(byte[] bArr, List<e.a> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    void a(b bVar);

    void a(byte[] bArr);

    boolean a(byte[] bArr, String str);

    byte[] a() throws MediaDrmException;

    byte[] a(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    d b();

    void b(byte[] bArr) throws DeniedByServerException;

    void b(byte[] bArr, byte[] bArr2);

    Map<String, String> c(byte[] bArr);

    void c();

    int d();

    com.applovin.exoplayer2.c.b d(byte[] bArr) throws MediaCryptoException;
}
