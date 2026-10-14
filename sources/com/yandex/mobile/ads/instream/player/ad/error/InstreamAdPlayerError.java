package com.yandex.mobile.ads.instream.player.ad.error;

/* JADX INFO: loaded from: classes3.dex */
public class InstreamAdPlayerError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reason f27503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f27504b;

    public enum Reason {
        RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER,
        RENDERER_FAILED_DEQUEUE_INPUT_BUFFER,
        RENDERER_FAILED_STOP,
        RENDERER_FAILED_SET_SURFACE,
        RENDERER_FAILED_RELEASE_OUTPUT_BUFFER,
        RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER,
        RENDERER_MEDIA_CODEC_UNKNOWN,
        TIMEOUT,
        ILLEGAL_SEEK_POSITION,
        DECODER_QUERY_ERROR,
        DECODER_INITIALIZATION_ERROR,
        DECODER_UNKNOWN_ERROR,
        BEHIND_LIVE_WINDOW_ERROR,
        DRM_KEYS_EXPIRED,
        DRM_MEDIA_RESOURCE_BUSY,
        DRM_SESSION_ERROR,
        HTTP_CLEARTEXT_NOT_PERMITTED,
        HTTP_CODE_UNAUTHORIZED,
        HTTP_CODE_FORBIDDEN,
        HTTP_CODE_NOT_FOUND,
        HTTP_CODE_UNKNOWN,
        SSL_HANDSHAKE_ERROR,
        NETWORK_UNAVAILABLE,
        CONTENT_PARSER_ERROR,
        LOADER_UNEXPECTED_ERROR,
        AUDIO_ERROR,
        SUBTITLE_ERROR,
        CACHE_ERROR,
        UNKNOWN;

        Reason() {
        }
    }

    public InstreamAdPlayerError(Reason reason, Throwable th) {
        this.f27503a = reason;
        this.f27504b = th;
    }

    public Reason getReason() {
        return this.f27503a;
    }

    public Throwable getUnderlyingError() {
        return this.f27504b;
    }
}
