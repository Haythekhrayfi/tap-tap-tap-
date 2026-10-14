package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e60 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20079c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile e60 f20080d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<VideoPlayer, InstreamAdBinder> f20082b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final e60 a() {
            e60 e60Var = e60.f20080d;
            if (e60Var == null) {
                synchronized (this) {
                    e60Var = e60.f20080d;
                    if (e60Var == null) {
                        e60Var = new e60(0);
                        e60.f20080d = e60Var;
                    }
                }
            }
            return e60Var;
        }
    }

    private e60() {
        this.f20081a = new Object();
        this.f20082b = new WeakHashMap<>();
    }

    public /* synthetic */ e60(int i10) {
        this();
    }

    public final InstreamAdBinder a(VideoPlayer videoPlayer) {
        InstreamAdBinder instreamAdBinder;
        fd.j0.i(videoPlayer, "videoPlayer");
        synchronized (this.f20081a) {
            instreamAdBinder = this.f20082b.get(videoPlayer);
        }
        return instreamAdBinder;
    }

    public final void a(VideoPlayer videoPlayer, InstreamAdBinder instreamAdBinder) {
        fd.j0.i(videoPlayer, "videoPlayer");
        fd.j0.i(instreamAdBinder, "adBinder");
        synchronized (this.f20081a) {
            this.f20082b.put(videoPlayer, instreamAdBinder);
        }
    }

    public final void b(VideoPlayer videoPlayer) {
        fd.j0.i(videoPlayer, "videoPlayer");
        synchronized (this.f20081a) {
            this.f20082b.remove(videoPlayer);
        }
    }
}
