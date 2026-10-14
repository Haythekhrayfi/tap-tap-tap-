package com.applovin.exoplayer2.e;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f6106a = com.applovin.exoplayer2.a.p.f4006v;

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ h[] a() {
        return new h[0];
    }

    default h[] a(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }

    h[] createExtractors();
}
