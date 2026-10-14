package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d91 extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f19787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f19788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f19789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f19790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f19791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f19792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19794m;

    public static final class a extends mm {
        public a(Exception exc, int i10) {
            super(exc, i10);
        }
    }

    public d91(int i10) {
        super(true);
        this.f19786e = 8000;
        byte[] bArr = new byte[2000];
        this.f19787f = bArr;
        this.f19788g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws a {
        Uri uri = pmVar.f24101a;
        this.f19789h = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f19789h.getPort();
        b(pmVar);
        try {
            this.f19792k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f19792k, port);
            if (this.f19792k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f19791j = multicastSocket;
                multicastSocket.joinGroup(this.f19792k);
                this.f19790i = this.f19791j;
            } else {
                this.f19790i = new DatagramSocket(inetSocketAddress);
            }
            this.f19790i.setSoTimeout(this.f19786e);
            this.f19793l = true;
            c(pmVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() {
        this.f19789h = null;
        MulticastSocket multicastSocket = this.f19791j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f19792k;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f19791j = null;
        }
        DatagramSocket datagramSocket = this.f19790i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f19790i = null;
        }
        this.f19792k = null;
        this.f19794m = 0;
        if (this.f19793l) {
            this.f19793l = false;
            f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f19789h;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f19794m == 0) {
            try {
                DatagramSocket datagramSocket = this.f19790i;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f19788g);
                int length = this.f19788g.getLength();
                this.f19794m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f19788g.getLength();
        int i12 = this.f19794m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f19787f, length2 - i12, bArr, i10, iMin);
        this.f19794m -= iMin;
        return iMin;
    }
}
