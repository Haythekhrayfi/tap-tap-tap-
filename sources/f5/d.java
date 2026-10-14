package f5;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f29252a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f29253b;

    public d(i0 i0Var) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrA = a(time % 1000);
        byte[] bArrA2 = a(f29252a.incrementAndGet());
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3], bArrA[0], bArrA[1], bArrA2[0], bArrA2[1], bArrA3[0], bArrA3[1]};
        String strL = e.l(i0Var.c());
        String strI = e.i(bArr);
        Locale locale = Locale.US;
        f29253b = String.format(locale, "%s%s%s%s", strI.substring(0, 12), strI.substring(12, 16), strI.subSequence(16, 20), strL.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public String toString() {
        return f29253b;
    }
}
