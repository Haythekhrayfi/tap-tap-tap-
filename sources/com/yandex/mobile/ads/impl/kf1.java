package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class kf1 implements VideoPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22398a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r90 f22399b = new r90();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f22400c = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoResumed();
        }
    }

    public final void a() {
        this.f22400c.clear();
        this.f22399b.a();
    }

    public final void a(com.yandex.mobile.ads.instream.d dVar) {
        synchronized (this.f22398a) {
            this.f22400c.add(dVar);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        HashSet hashSet;
        synchronized (this.f22398a) {
            hashSet = new HashSet(this.f22400c);
        }
        this.f22399b.a(new mo1(hashSet, 3));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        HashSet hashSet;
        synchronized (this.f22398a) {
            hashSet = new HashSet(this.f22400c);
        }
        this.f22399b.a(new mo1(hashSet, 4));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        HashSet hashSet;
        synchronized (this.f22398a) {
            hashSet = new HashSet(this.f22400c);
        }
        this.f22399b.a(new mo1(hashSet, 1));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        HashSet hashSet;
        synchronized (this.f22398a) {
            hashSet = new HashSet(this.f22400c);
        }
        this.f22399b.a(new mo1(hashSet, 2));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        HashSet hashSet;
        synchronized (this.f22398a) {
            hashSet = new HashSet(this.f22400c);
        }
        this.f22399b.a(new mo1(hashSet, 0));
    }
}
