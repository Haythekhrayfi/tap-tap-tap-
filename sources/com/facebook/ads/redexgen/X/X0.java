package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X0 extends AbstractC0761An {
    public static byte[] A04;
    public static String[] A05 = {"WgYXI97W146UztDd2a1JJEY", "PsmwC9oqdyflgYHEgRnESYlgTeL5m", "sr0zZC", "IkxlPpvfN8PqekaVjdRKnPQ5qAHRvCRG", "ReX0ZTUtTZFjxgVLIFehD5WGT1dwWLSU", "UaiZSduPNT4pUzkcj0jxvMNPl1Qynet7", "ONHsqZM0nT", "E3MBww8xLldGzmr6Q6FQJNMbPzNXN"};
    public long A00;
    public ByteBuffer A01;
    public final C0764Aq A02 = new C0764Aq();
    public final int A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{113, 109, 113, 118, 77, 122, 105, 105, 106, 125, 47, 123, 96, 96, 47, 124, 98, 110, 99, 99, 47, 39};
    }

    static {
        A05();
    }

    public X0(int i10) {
        this.A03 = i10;
    }

    public static X0 A02() {
        return new X0(0);
    }

    private ByteBuffer A04(int i10) {
        int i11 = this.A03;
        if (i11 == 1) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            if (A05[6].length() == 5) {
                throw new RuntimeException();
            }
            A05[4] = "fER9zQpCkdGo4Mwu26bVu9SaUs9Fh1Su";
            return byteBufferAllocate;
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.A01;
        throw new IllegalStateException(A03(4, 18, 20) + (byteBuffer == null ? 0 : byteBuffer.capacity()) + A03(0, 3, 74) + i10 + A03(3, 1, 68));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0761An
    public final void A07() {
        super.A07();
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int i10) throws IllegalStateException {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A04(i10);
            return;
        }
        int position = byteBuffer.capacity();
        int iPosition = this.A01.position();
        int capacity = iPosition + i10;
        if (position >= capacity) {
            return;
        }
        ByteBuffer byteBufferA04 = A04(capacity);
        if (iPosition > 0) {
            this.A01.position(0);
            this.A01.limit(iPosition);
            byteBufferA04.put(this.A01);
        }
        this.A01 = byteBufferA04;
        int position2 = A05[6].length();
        if (position2 == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[2] = "FWU9S4";
        strArr[0] = "hmujVtIh5DBUtGb3epSbNIE";
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        if (this.A01 == null) {
            int i10 = this.A03;
            if (A05[4].charAt(30) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "8PuFrx";
            strArr[0] = "MogEwKvIx3RF4VQZDhNq5vz";
            if (i10 == 0) {
                return true;
            }
        }
        return false;
    }
}
