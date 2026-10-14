package qd;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends a0, ReadableByteChannel {
    long B() throws IOException;

    String D(long j10) throws IOException;

    String F(Charset charset) throws IOException;

    boolean G(long j10, g gVar) throws IOException;

    g I() throws IOException;

    void L(c cVar, long j10) throws IOException;

    String M() throws IOException;

    void U(long j10) throws IOException;

    int W(q qVar) throws IOException;

    long Z() throws IOException;

    InputStream a0();

    g d(long j10) throws IOException;

    long f(y yVar) throws IOException;

    f peek();

    c r();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j10) throws IOException;

    void skip(long j10) throws IOException;

    byte[] x() throws IOException;

    boolean y() throws IOException;
}
