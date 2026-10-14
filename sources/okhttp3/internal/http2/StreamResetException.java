package okhttp3.internal.http2;

import fd.j0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super(j0.p("stream was reset: ", errorCode));
        j0.i(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
