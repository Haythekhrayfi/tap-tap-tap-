package d3;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends IOException {
    public b(int i10) {
        this(android.support.v4.media.a.a("Http request failed with status code: ", i10), i10);
    }

    public b(String str) {
        this(str, -1);
    }

    public b(String str, int i10) {
        this(str, i10, null);
    }

    public b(String str, int i10, Throwable th) {
        super(str, th);
    }
}
