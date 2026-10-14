package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class un implements uq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends com.yandex.mobile.ads.exo.offline.d>> f25705c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.b f25706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f25707b;

    static {
        SparseArray<Constructor<? extends com.yandex.mobile.ads.exo.offline.d>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, a(Class.forName("com.yandex.mobile.ads.exo.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.yandex.mobile.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.yandex.mobile.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f25705c = sparseArray;
    }

    public un(hg.b bVar, ExecutorService executorService) {
        this.f25706a = (hg.b) pa.a(bVar);
        this.f25707b = (Executor) pa.a(executorService);
    }

    private static Constructor<? extends com.yandex.mobile.ads.exo.offline.d> a(Class<?> cls) {
        try {
            return cls.asSubclass(com.yandex.mobile.ads.exo.offline.d.class).getConstructor(bc0.class, hg.b.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    public final com.yandex.mobile.ads.exo.offline.d a(DownloadRequest downloadRequest) {
        int iA = da1.a(downloadRequest.f18652b, downloadRequest.f18653c);
        if (iA != 0 && iA != 1 && iA != 2) {
            if (iA == 4) {
                return new com.yandex.mobile.ads.exo.offline.e(new bc0.a().a(downloadRequest.f18652b).a(downloadRequest.f18656f).a(), this.f25706a, this.f25707b);
            }
            throw new IllegalArgumentException(u60.a("Unsupported type: ", iA));
        }
        Constructor<? extends com.yandex.mobile.ads.exo.offline.d> constructor = f25705c.get(iA);
        if (constructor == null) {
            throw new IllegalStateException(u60.a("Module missing for content type ", iA));
        }
        try {
            return constructor.newInstance(new bc0.a().a(downloadRequest.f18652b).a(downloadRequest.f18654d).a(downloadRequest.f18656f).a(), this.f25706a, this.f25707b);
        } catch (Exception unused) {
            throw new IllegalStateException(u60.a("Failed to instantiate downloader for content type ", iA));
        }
    }
}
