package com.google.android.gms.internal.ads;

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

/* JADX INFO: loaded from: classes2.dex */
public final class zzhi extends zzfy {
    private final byte[] zza;
    private final DatagramPacket zzb;
    private Uri zzc;
    private DatagramSocket zzd;
    private MulticastSocket zze;
    private InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzhi() {
        this(2000);
    }

    public zzhi(int i10) {
        super(true);
        byte[] bArr = new byte[2000];
        this.zza = bArr;
        this.zzb = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzhh {
        if (i11 == 0) {
            return 0;
        }
        if (this.zzh == 0) {
            try {
                DatagramSocket datagramSocket = this.zzd;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.zzb);
                int length = this.zzb.getLength();
                this.zzh = length;
                zzg(length);
            } catch (SocketTimeoutException e10) {
                throw new zzhh(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new zzhh(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.zzb.getLength();
        int i12 = this.zzh;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.zza, length2 - i12, bArr, i10, iMin);
        this.zzh -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzhh {
        Uri uri = zzgjVar.zza;
        this.zzc = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.zzc.getPort();
        zzi(zzgjVar);
        try {
            this.zzf = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new DatagramSocket(inetSocketAddress);
            }
            this.zzd.setSoTimeout(8000);
            this.zzg = true;
            zzj(zzgjVar);
            return -1L;
        } catch (IOException e10) {
            throw new zzhh(e10, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e11) {
            throw new zzhh(e11, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() {
        this.zzc = null;
        MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.zzf;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.zze = null;
        }
        DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if (this.zzg) {
            this.zzg = false;
            zzh();
        }
    }
}
