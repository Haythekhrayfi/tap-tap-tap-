package qd;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends y, WritableByteChannel {
    e A() throws IOException;

    e E(String str) throws IOException;

    e H(long j10) throws IOException;

    e Q(byte[] bArr) throws IOException;

    e X(long j10) throws IOException;

    @Override // qd.y, java.io.Flushable
    void flush() throws IOException;

    c r();

    e s() throws IOException;

    e t(int i10) throws IOException;

    e u(int i10) throws IOException;

    long v(a0 a0Var) throws IOException;

    e w(g gVar) throws IOException;

    e write(byte[] bArr, int i10, int i11) throws IOException;

    e z(int i10) throws IOException;
}
