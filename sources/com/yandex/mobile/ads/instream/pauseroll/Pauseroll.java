package com.yandex.mobile.ads.instream.pauseroll;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* JADX INFO: loaded from: classes3.dex */
public interface Pauseroll {
    InstreamAdBreak getInstreamAdBreak();

    void invalidate();

    void pause();

    void play(InstreamAdView instreamAdView);

    void prepare(InstreamAdPlayer instreamAdPlayer);

    void resume();

    void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener);

    void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener);
}
