package okhttp3.internal.ws;

import android.support.v4.media.j;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import qd.c;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return g.f34892f.d(j0.p(str, ACCEPT_MAGIC)).i().a();
    }

    public final String closeCodeExceptionMessage(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return j0.p("Code must be in range [1000,5000): ", Integer.valueOf(i10));
        }
        if (!(1004 <= i10 && i10 < 1007)) {
            if (!(1015 <= i10 && i10 < 3000)) {
                return null;
            }
        }
        return j.a("Code ", i10, " is reserved and may not be used.");
    }

    public final void toggleMask(c.a aVar, byte[] bArr) {
        long j10;
        j0.i(aVar, "cursor");
        j0.i(bArr, Action.KEY_ATTRIBUTE);
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f34884g;
            int i11 = aVar.f34885h;
            int i12 = aVar.f34886i;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
            long j11 = aVar.f34883f;
            c cVar = aVar.f34880c;
            j0.f(cVar);
            if (!(j11 != cVar.f34879d)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j10 = aVar.f34883f;
        } while (aVar.b(j10 == -1 ? 0L : j10 + ((long) (aVar.f34886i - aVar.f34885h))) != -1);
    }

    public final void validateCloseCode(int i10) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i10);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        j0.f(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}
