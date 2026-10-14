package okhttp3.internal.cache;

import java.io.IOException;
import qd.y;

/* JADX INFO: loaded from: classes3.dex */
public interface CacheRequest {
    void abort();

    y body() throws IOException;
}
