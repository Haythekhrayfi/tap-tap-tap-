package okhttp3.internal.http;

import fd.j0;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import qd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final f source;

    public RealResponseBody(String str, long j10, f fVar) {
        j0.i(fVar, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = fVar;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }

    @Override // okhttp3.ResponseBody
    public f source() {
        return this.source;
    }
}
