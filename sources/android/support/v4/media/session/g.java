package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.f;

/* JADX INFO: loaded from: classes.dex */
public class g<T extends f> extends MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f451a;

    public g(T t10) {
        this.f451a = t10;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        MediaSessionCompat.a(bundle);
        this.f451a.c(str, bundle, resultReceiver);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCustomAction(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        this.f451a.p(str, bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onFastForward() {
        this.f451a.n();
    }

    @Override // android.media.session.MediaSession.Callback
    public boolean onMediaButtonEvent(Intent intent) {
        return this.f451a.i(intent) || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPause() {
        this.f451a.onPause();
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlay() {
        this.f451a.f();
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        this.f451a.m(str, bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromSearch(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        this.f451a.l(str, bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onRewind() {
        this.f451a.b();
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSeekTo(long j10) {
        this.f451a.o(j10);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetRating(Rating rating) {
        this.f451a.e(rating);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToNext() {
        this.f451a.a();
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToPrevious() {
        this.f451a.h();
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long j10) {
        this.f451a.d(j10);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onStop() {
        this.f451a.onStop();
    }
}
