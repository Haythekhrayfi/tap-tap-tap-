package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.r0;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aw;
import com.applovin.exoplayer2.k.p;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.f;
import com.applovin.exoplayer2.ui.g;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.k;
import com.applovin.impl.c.l;
import com.applovin.impl.c.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.utils.x;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final k countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.sdk.utils.a lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private final aw mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final com.applovin.impl.c.a vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<com.applovin.impl.c.k> videoProgressTrackers;
    private final g videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    public class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriB;
            com.applovin.impl.c.g gVarAW = AppLovinVastMediaView.this.vastAd.aW();
            if (gVarAW == null || (uriB = gVarAW.b()) == null) {
                return;
            }
            y yVar = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriB);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(com.applovin.impl.c.a.c.INDUSTRY_ICON_CLICK);
            u.a(uriB, view.getContext(), AppLovinVastMediaView.this.sdk);
        }
    }

    public class b implements AppLovinTouchToClickListener.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinNativeAdImpl f10781b;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f10781b = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            Uri uriK;
            AppLovinVastMediaView.this.maybeFireTrackers(com.applovin.impl.c.a.c.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.o().o();
            if (AppLovinVastMediaView.this.vastAd.E() && (uriK = AppLovinVastMediaView.this.vastAd.k()) != null) {
                y yVar = AppLovinVastMediaView.this.logger;
                if (y.a()) {
                    AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.v().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.a(pointF, false));
                this.f10781b.handleNativeAdClick(uriK, null, AppLovinVastMediaView.this.getContext());
            }
        }
    }

    public class c implements an.b, f.d {
        private c() {
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i10) {
            if (i10 == 0) {
                AppLovinVastMediaView.this.videoView.b();
            }
        }

        @Override // com.applovin.exoplayer2.an.b
        public void a(ak akVar) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + akVar + ")");
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i10) {
            y yVar = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                y yVar2 = AppLovinVastMediaView.this.logger;
                StringBuilder sbA = r0.a("Player state changed to state ", i10, " and will play when ready: ");
                sbA.append(AppLovinVastMediaView.this.mediaPlayer.x());
                yVar2.b(AppLovinVastMediaView.TAG, sbA.toString());
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    y yVar3 = AppLovinVastMediaView.this.logger;
                    if (y.a()) {
                        AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Video completed");
                    }
                    AppLovinVastMediaView.this.videoWasCompleted = true;
                    AppLovinVastMediaView.this.finishVideo();
                    if (AppLovinVastMediaView.this.replayIconContainer != null) {
                        x.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.c.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AppLovinVastMediaView.this.mediaPlayer.a(0L);
                            }
                        });
                        return;
                    } else {
                        AppLovinVastMediaView.this.showMediaImageView();
                        return;
                    }
                }
                return;
            }
            AppLovinVastMediaView.this.mediaPlayer.a(!AppLovinVastMediaView.this.isVideoMuted ? 1 : 0);
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.H();
            AppLovinVastMediaView.this.vastAd.o().a(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), w.c(AppLovinVastMediaView.this.sdk));
            y yVar4 = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                y yVar5 = AppLovinVastMediaView.this.logger;
                StringBuilder sbA2 = defpackage.a.a("MediaPlayer prepared: ");
                sbA2.append(AppLovinVastMediaView.this.mediaPlayer);
                yVar5.b(AppLovinVastMediaView.TAG, sbA2.toString());
            }
            AppLovinVastMediaView.this.countdownManager.a();
        }
    }

    public class d implements View.OnClickListener {
        private d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer.a()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == AppLovinVastMediaView.this.replayIconContainer) {
                    x.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AppLovinVastMediaView.this.videoWasCompleted = false;
                            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
                            AppLovinVastMediaView.this.sdk.E().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
                            AppLovinVastMediaView.this.maybeHandleResume();
                        }
                    });
                }
            } else {
                boolean z10 = !AppLovinVastMediaView.this.isVideoMuted;
                AppLovinVastMediaView.this.isVideoMuted = z10;
                AppLovinVastMediaView.this.mediaPlayer.a(!z10 ? 1 : 0);
                AppLovinVastMediaView.this.populateMuteImage(z10);
            }
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, o oVar, Context context) {
        int iDpToPx;
        super(appLovinNativeAdImpl, oVar, context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new k(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1L;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                    AppLovinVastMediaView.this.maybeHandlePause();
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                    return;
                }
                AppLovinVastMediaView.this.maybeHandleResume();
            }
        };
        com.applovin.impl.c.a vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zF = vastAd.f();
        this.isVideoStream = zF;
        if (zF) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.aX()) {
            this.industryIconImageView = com.applovin.impl.c.g.a(vastAd.aW().a(), context, oVar);
            int iDpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fn)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fp)).intValue()));
            this.industryIconImageView.setOnClickListener(new a());
            addView(this.industryIconImageView);
        }
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.fu)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) oVar.a(com.applovin.impl.sdk.c.b.ft)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            d dVar = new d();
            this.playPauseButtonImageView.setOnClickListener(dVar);
            int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fr)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fq)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(dVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                iDpToPx = 0;
            }
            int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fs)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i10 = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3 + iDpToPx + i10, Math.max(iDpToPx3, iDpToPx) + i10, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.fv)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new d());
            ImageView imageView2 = new ImageView(getContext());
            int iDpToPx5 = AppLovinSdkUtils.dpToPx(context, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fw)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        aw awVarA = new aw.a(getContext()).a();
        this.mediaPlayer = awVarA;
        c cVar = new c();
        awVarA.a((an.b) cVar);
        awVarA.c(0);
        g gVar = new g(getContext());
        this.videoView = gVar;
        gVar.b();
        gVar.setControllerVisibilityListener(cVar);
        gVar.setPlayer(awVarA);
        gVar.setOnTouchListener(new AppLovinTouchToClickListener(oVar, com.applovin.impl.sdk.c.b.f10349bc, getContext(), new b(appLovinNativeAdImpl)));
        addView(gVar);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(gVar);
        hashSet.addAll(vastAd.a(com.applovin.impl.c.a.c.VIDEO, l.f8928a));
    }

    private void checkCachedAdResources(boolean z10) {
        List<Uri> listA = w.a(z10, this.vastAd, this.sdk, getContext());
        if (listA.isEmpty()) {
            return;
        }
        if (y.a()) {
            this.logger.e(TAG, "Video failed due to missing resources: " + listA);
        }
        finishVideo();
        showMediaImageView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(com.applovin.impl.c.a.c.VIDEO, "close");
        maybeHandlePause();
        this.sdk.E().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.o().i();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.v().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long jI = this.mediaPlayer.I();
        if (this.videoWasCompleted) {
            return 100;
        }
        return jI > 0 ? (int) ((jI / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (y.a()) {
            this.logger.e(TAG, str);
        }
        maybeFireTrackers(com.applovin.impl.c.a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.vastAd.o().a(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            finishVideo();
            showMediaImageView();
        }
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.T() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (y.a()) {
            y yVar = this.logger;
            StringBuilder sbA = defpackage.a.a("Firing ");
            sbA.append(this.videoProgressTrackers.size());
            sbA.append(" un-fired video progress trackers when video was completed.");
            yVar.d(TAG, sbA.toString());
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(com.applovin.impl.c.a.c cVar) {
        maybeFireTrackers(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void maybeFireTrackers(com.applovin.impl.c.a.c cVar, com.applovin.impl.c.f fVar) {
        maybeFireTrackers(cVar, "", fVar);
    }

    private void maybeFireTrackers(com.applovin.impl.c.a.c cVar, String str) {
        maybeFireTrackers(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void maybeFireTrackers(com.applovin.impl.c.a.c cVar, String str, com.applovin.impl.c.f fVar) {
        maybeFireTrackers(this.vastAd.a(cVar, str), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<com.applovin.impl.c.k> set) {
        maybeFireTrackers(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void maybeFireTrackers(Set<com.applovin.impl.c.k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.I());
        com.applovin.impl.c.o oVarAU = this.vastAd.aU();
        Uri uriA = oVarAU != null ? oVarAU.a() : null;
        if (y.a()) {
            y yVar = this.logger;
            StringBuilder sbA = defpackage.a.a("Firing ");
            sbA.append(set.size());
            sbA.append(" tracker(s): ");
            sbA.append(set);
            yVar.b(TAG, sbA.toString());
        }
        m.a(set, seconds, uriA, fVar, this.sdk);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.aX()) {
                maybeFireTrackers(com.applovin.impl.c.a.c.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(com.applovin.impl.c.a.c.IMPRESSION);
            maybeFireTrackers(com.applovin.impl.c.a.c.VIDEO, "creativeView");
            this.vastAd.o().d();
            this.vastAd.setHasShown(true);
            this.sdk.v().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.sdk.utils.b.a(w.a((View) this));
            this.sdk.E().a(this.lifecycleCallbacksAdapter);
            this.mediaPlayer.a(true);
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new k.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.2
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.mediaPlayer.H() - AppLovinVastMediaView.this.mediaPlayer.I()));
                    int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
                    HashSet hashSet = new HashSet();
                    for (com.applovin.impl.c.k kVar : new HashSet(AppLovinVastMediaView.this.videoProgressTrackers)) {
                        if (kVar.a(seconds, videoPercentViewed)) {
                            hashSet.add(kVar);
                            AppLovinVastMediaView.this.videoProgressTrackers.remove(kVar);
                        }
                    }
                    AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
                    if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                        AppLovinVastMediaView.this.vastAd.o().f();
                        return;
                    }
                    if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                        AppLovinVastMediaView.this.vastAd.o().g();
                    } else if (videoPercentViewed >= 75) {
                        AppLovinVastMediaView.this.vastAd.o().h();
                    }
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return !AppLovinVastMediaView.this.videoWasCompleted;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(com.applovin.impl.c.a.c.VIDEO, "pause");
            this.vastAd.o().j();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(com.applovin.impl.c.a.c.VIDEO, "resume");
            this.vastAd.o().k();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (y.a()) {
                    y yVar = this.logger;
                    StringBuilder sbA = defpackage.a.a("Resuming video at position ");
                    sbA.append(this.lastVideoPositionFromPauseMillis);
                    yVar.b(TAG, sbA.toString());
                }
                this.mediaPlayer.a(true);
                this.countdownManager.a();
                this.lastVideoPositionFromPauseMillis = -1L;
            } else if (y.a()) {
                y yVar2 = this.logger;
                StringBuilder sbA2 = defpackage.a.a("Invalid last video position, isVideoPlaying=");
                sbA2.append(this.mediaPlayer.a());
                yVar2.b(TAG, sbA2.toString());
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    private void pauseVideo() {
        if (y.a()) {
            this.logger.b(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.I();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        if (y.a()) {
            this.logger.b(TAG, android.support.v4.media.session.e.a(defpackage.a.a("Paused video at position "), this.lastVideoPositionFromPauseMillis, " ms"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z10) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        com.applovin.impl.c.a aVar = this.vastAd;
        Uri uriAJ = z10 ? aVar.aJ() : aVar.aK();
        if (uriAJ != null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.muteButtonImageView.setImageURI(uriAJ);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return true;
        }
        if (!h.d()) {
            return false;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            return false;
        }
        this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        return true;
    }

    private void populatePlayPauseImage(boolean z10) {
        if (this.playPauseButtonImageView == null) {
            return;
        }
        com.applovin.impl.c.a aVar = this.vastAd;
        Uri uriAH = z10 ? aVar.aH() : aVar.aI();
        if (uriAH == null) {
            this.playPauseButtonImageView.setImageResource(z10 ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.playPauseButtonImageView.setImageURI(uriAH);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    private void prepareMediaPlayer() {
        checkCachedAdResources(!this.isVideoStream);
        com.applovin.exoplayer2.h.u uVarA = new com.applovin.exoplayer2.h.u.a(new p(getContext(), ai.a(getContext(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(ab.a(this.vastAd.h()));
        this.mediaPlayer.a(!this.isVideoMuted ? 1 : 0);
        this.mediaPlayer.a((com.applovin.exoplayer2.h.p) uVarA);
        this.mediaPlayer.w();
        this.mediaPlayer.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        this.mediaPlayer.E();
        this.vastAd.o().e();
        this.countdownManager.b();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.go)).booleanValue() && j10 == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.videoWasCompleted || this.mediaPlayer.a()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }
}
