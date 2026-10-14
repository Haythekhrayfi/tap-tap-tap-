package ch.qos.logback.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public class SyslogOutputStream extends OutputStream {
    private static final int MAX_LEN = 1024;
    private InetAddress address;
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private DatagramSocket ds = new DatagramSocket();
    private final int port;

    public SyslogOutputStream(String str, int i10) throws SocketException, UnknownHostException {
        this.address = InetAddress.getByName(str);
        this.port = i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DatagramSocket datagramSocket = this.ds;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.address = null;
        this.ds = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        DatagramSocket datagramSocket;
        byte[] byteArray = this.baos.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, this.address, this.port);
        if (this.baos.size() > 1024) {
            this.baos = new ByteArrayOutputStream();
        } else {
            this.baos.reset();
        }
        if (byteArray.length == 0 || (datagramSocket = this.ds) == null) {
            return;
        }
        datagramSocket.send(datagramPacket);
    }

    public int getPort() {
        return this.port;
    }

    public int getSendBufferSize() throws SocketException {
        return this.ds.getSendBufferSize();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.baos.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.baos.write(bArr, i10, i11);
    }
}
