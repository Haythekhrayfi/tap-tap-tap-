package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 {
    /* JADX WARN: Code duplicated, block: B:51:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x007b  */
    private static InstreamAdPlayerError.Reason a(Throwable th) {
        InstreamAdPlayerError.Reason reason;
        if (!(th instanceof ExoPlaybackException)) {
            if (th instanceof ExoTimeoutException) {
                reason = InstreamAdPlayerError.Reason.TIMEOUT;
            } else if (th instanceof IllegalSeekPositionException) {
                reason = InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION;
            } else if (th instanceof MediaCodecUtil.DecoderQueryException) {
                reason = InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR;
            } else if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                reason = InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR;
            } else if (th instanceof MediaCodecVideoDecoderException) {
                InstreamAdPlayerError.Reason reasonB = b(th);
                if (reasonB != null) {
                    return reasonB;
                }
                reason = InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR;
            } else if (th instanceof BehindLiveWindowException) {
                reason = InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR;
            } else if (th instanceof MediaCodec.CryptoException) {
                reason = InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED;
            } else if (th instanceof DrmSession.DrmSessionException) {
                Throwable cause = ((DrmSession.DrmSessionException) th).getCause();
                if (cause == null) {
                    reason = InstreamAdPlayerError.Reason.DRM_SESSION_ERROR;
                } else if ((cause instanceof MediaDrmResetException) || (cause instanceof ResourceBusyException)) {
                    reason = InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY;
                } else if ((cause instanceof MediaCodec.CryptoException) || (cause instanceof KeysExpiredException)) {
                    reason = InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED;
                } else {
                    reason = InstreamAdPlayerError.Reason.DRM_SESSION_ERROR;
                }
            } else if (th instanceof HttpDataSource.CleartextNotPermittedException) {
                reason = InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED;
            } else if (th instanceof HttpDataSource.InvalidResponseCodeException) {
                int i10 = ((HttpDataSource.InvalidResponseCodeException) th).responseCode;
                if (i10 == 401) {
                    reason = InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED;
                } else if (i10 != 403) {
                    reason = i10 != 404 ? InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN : InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND;
                } else {
                    reason = InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN;
                }
            } else if (th instanceof HttpDataSource.HttpDataSourceException) {
                reason = ((HttpDataSource.HttpDataSourceException) th).getCause() instanceof SSLHandshakeException ? InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR : InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE;
            } else if (th instanceof ParserException) {
                reason = InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR;
            } else if (th instanceof Loader.UnexpectedLoaderException) {
                reason = InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR;
            } else {
                if (th instanceof AudioSink.ConfigurationException ? true : th instanceof AudioSink.InitializationException ? true : th instanceof DefaultAudioSink.InvalidAudioTrackTimestampException) {
                    reason = InstreamAdPlayerError.Reason.AUDIO_ERROR;
                } else if (th instanceof SubtitleDecoderException) {
                    reason = InstreamAdPlayerError.Reason.SUBTITLE_ERROR;
                } else {
                    if (th instanceof Cache.CacheException ? true : th instanceof CacheDataSink.CacheDataSinkException) {
                        reason = InstreamAdPlayerError.Reason.CACHE_ERROR;
                    }
                }
            }
            return reason;
        }
        InstreamAdPlayerError.Reason reasonB2 = b(th);
        if (reasonB2 != null) {
            return reasonB2;
        }
        Throwable cause2 = th.getCause();
        InstreamAdPlayerError.Reason reasonA = cause2 != null ? a(cause2) : null;
        if (reasonA != null) {
            return reasonA;
        }
        reason = InstreamAdPlayerError.Reason.UNKNOWN;
        return reason;
    }

    private static InstreamAdPlayerError.Reason b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null) {
            return null;
        }
        if (!(cause instanceof MediaCodec.CodecException) && !(cause instanceof IllegalStateException) && !(cause instanceof IllegalArgumentException)) {
            return null;
        }
        StackTraceElement[] stackTrace = cause.getStackTrace();
        fd.j0.h(stackTrace, "stackTrace");
        if (!(!(stackTrace.length == 0)) || !stackTrace[0].isNativeMethod() || !fd.j0.d(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
            return null;
        }
        String methodName = stackTrace[0].getMethodName();
        if (methodName == null) {
            methodName = "";
        }
        if (fd.j0.d(methodName, "native_dequeueOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
        }
        if (fd.j0.d(methodName, "native_dequeueInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
        }
        if (fd.j0.d(methodName, "native_stop")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP;
        }
        if (fd.j0.d(methodName, "native_setSurface")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE;
        }
        if (fd.j0.d(methodName, "releaseOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
        }
        if (fd.j0.d(methodName, "native_queueSecureInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
        }
        if (cause instanceof MediaCodec.CodecException) {
            return InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN;
        }
        return null;
    }

    public static InstreamAdPlayerError c(Throwable th) {
        fd.j0.i(th, "throwable");
        return new InstreamAdPlayerError(a(th), th);
    }
}
