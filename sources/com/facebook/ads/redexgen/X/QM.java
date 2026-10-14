package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface QM {
    void A8F();

    boolean A8Q();

    boolean A8R();

    boolean A8y();

    void ADZ(boolean z10, int i10);

    void AFR(int i10);

    void AFW(PZ pz, int i10);

    void AFd(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    PZ getStartReason();

    QO getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(QP qp);

    void setup(Uri uri);
}
