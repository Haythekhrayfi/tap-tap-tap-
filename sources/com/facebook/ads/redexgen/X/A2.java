package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface A2 {
    void onAudioSessionId(A1 a10, int i10);

    void onAudioUnderrun(A1 a10, int i10, long j10, long j11);

    void onDecoderDisabled(A1 a10, int i10, C0766As c0766As);

    void onDecoderEnabled(A1 a10, int i10, C0766As c0766As);

    void onDecoderInitialized(A1 a10, int i10, String str, long j10);

    void onDecoderInputFormatChanged(A1 a10, int i10, Format format);

    void onDownstreamFormatChanged(A1 a10, C0842Ej c0842Ej);

    void onDrmKeysLoaded(A1 a10);

    void onDrmKeysRemoved(A1 a10);

    void onDrmKeysRestored(A1 a10);

    void onDrmSessionManagerError(A1 a10, Exception exc);

    void onDroppedVideoFrames(A1 a10, int i10, long j10);

    void onLoadError(A1 a10, C0841Ei c0841Ei, C0842Ej c0842Ej, IOException iOException, boolean z10);

    void onLoadingChanged(A1 a10, boolean z10);

    void onMediaPeriodCreated(A1 a10);

    void onMediaPeriodReleased(A1 a10);

    void onMetadata(A1 a10, Metadata metadata);

    void onPlaybackParametersChanged(A1 a10, C07269d c07269d);

    void onPlayerError(A1 a10, C9I c9i);

    void onPlayerStateChanged(A1 a10, boolean z10, int i10);

    void onPositionDiscontinuity(A1 a10, int i10);

    void onReadingStarted(A1 a10);

    void onRenderedFirstFrame(A1 a10, Surface surface);

    void onSeekProcessed(A1 a10);

    void onSeekStarted(A1 a10);

    void onTimelineChanged(A1 a10, int i10);

    void onTracksChanged(A1 a10, TrackGroupArray trackGroupArray, GN gn);

    void onVideoSizeChanged(A1 a10, int i10, int i11, int i12, float f10);
}
