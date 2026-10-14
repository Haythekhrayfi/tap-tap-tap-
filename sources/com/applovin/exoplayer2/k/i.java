package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface i extends g {

    public interface a {
        i a();
    }

    long a(l lVar) throws IOException;

    Uri a();

    void a(aa aaVar);

    default Map<String, List<String>> b() {
        return Collections.emptyMap();
    }

    void c() throws IOException;
}
