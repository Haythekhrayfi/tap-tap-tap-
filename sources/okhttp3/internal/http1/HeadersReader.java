package okhttp3.internal.http1;

import fd.j0;
import java.io.IOException;
import okhttp3.Headers;
import qd.f;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final f source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public HeadersReader(f fVar) {
        j0.i(fVar, "source");
        this.source = fVar;
        this.headerLimit = 262144L;
    }

    public final f getSource() {
        return this.source;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() throws IOException {
        String strD = this.source.D(this.headerLimit);
        this.headerLimit -= (long) strD.length();
        return strD;
    }
}
