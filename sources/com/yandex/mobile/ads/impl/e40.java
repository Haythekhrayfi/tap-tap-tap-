package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e40 implements InstreamAdPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20060a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r90 f20061b = new r90();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f20062c = new HashMap();

    private HashSet a(VideoAd videoAd) {
        HashSet hashSet;
        synchronized (this.f20060a) {
            Set set = (Set) this.f20062c.get(videoAd);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingFinished(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set, VideoAd videoAd, float f10) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onVolumeChanged(videoAd, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set, VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onError(videoAd, instreamAdPlayerError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingStarted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdCompleted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPaused(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPrepared(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdResumed(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdSkipped(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStarted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStopped(videoAd);
        }
    }

    public final void a() {
        this.f20061b.a();
    }

    public final void a(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f20060a) {
            Set hashSet = (Set) this.f20062c.get(videoAd);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f20062c.put(videoAd, hashSet);
            }
            hashSet.add(instreamAdPlayerListener);
        }
    }

    public final void b(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f20060a) {
            Set set = (Set) this.f20062c.get(videoAd);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (instreamAdPlayerListener.equals((InstreamAdPlayerListener) it.next())) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 7));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 0));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdCompleted(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 2));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPaused(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 5));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPrepared(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdResumed(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 4));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdSkipped(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 3));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStarted(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 6));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStopped(VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new vn1(hashSetA, videoAd, 8));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new ap1(hashSetA, videoAd, instreamAdPlayerError));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onVolumeChanged(final VideoAd videoAd, final float f10) {
        final HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f20061b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.wn1
                @Override // java.lang.Runnable
                public final void run() {
                    e40.a(hashSetA, videoAd, f10);
                }
            });
        }
    }
}
