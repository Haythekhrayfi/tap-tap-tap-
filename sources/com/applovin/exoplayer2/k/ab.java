package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f7349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DatagramPacket f7350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f7351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DatagramSocket f7352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MulticastSocket f7353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InetAddress f7354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InetSocketAddress f7355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7357j;

    public static final class a extends j {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public ab() {
        this(2000);
    }

    public ab(int i10) {
        this(i10, 8000);
    }

    public ab(int i10, int i11) {
        super(true);
        this.f7348a = i11;
        byte[] bArr = new byte[i10];
        this.f7349b = bArr;
        this.f7350c = new DatagramPacket(bArr, 0, i10);
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f7357j == 0) {
            try {
                this.f7352e.receive(this.f7350c);
                int length = this.f7350c.getLength();
                this.f7357j = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f7350c.getLength();
        int i12 = this.f7357j;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f7349b, length2 - i12, bArr, i10, iMin);
        this.f7357j -= iMin;
        return iMin;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        DatagramSocket datagramSocket;
        Uri uri = lVar.f7392a;
        this.f7351d = uri;
        String host = uri.getHost();
        int port = this.f7351d.getPort();
        b(lVar);
        try {
            this.f7354g = InetAddress.getByName(host);
            this.f7355h = new InetSocketAddress(this.f7354g, port);
            if (this.f7354g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f7355h);
                this.f7353f = multicastSocket;
                multicastSocket.joinGroup(this.f7354g);
                datagramSocket = this.f7353f;
            } else {
                datagramSocket = new DatagramSocket(this.f7355h);
            }
            this.f7352e = datagramSocket;
            this.f7352e.setSoTimeout(this.f7348a);
            this.f7356i = true;
            c(lVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f7351d;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        this.f7351d = null;
        MulticastSocket multicastSocket = this.f7353f;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f7354g);
            } catch (IOException unused) {
            }
            this.f7353f = null;
        }
        DatagramSocket datagramSocket = this.f7352e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7352e = null;
        }
        this.f7354g = null;
        this.f7355h = null;
        this.f7357j = 0;
        if (this.f7356i) {
            this.f7356i = false;
            d();
        }
    }
}
