package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;

/* JADX INFO: loaded from: classes3.dex */
public final class q50 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24320a;

        static {
            int[] iArr = new int[InstreamAdPlayerError.Reason.values().length];
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER.ordinal()] = 1;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER.ordinal()] = 2;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP.ordinal()] = 3;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE.ordinal()] = 4;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER.ordinal()] = 5;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER.ordinal()] = 6;
            iArr[InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN.ordinal()] = 7;
            iArr[InstreamAdPlayerError.Reason.TIMEOUT.ordinal()] = 8;
            iArr[InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION.ordinal()] = 9;
            iArr[InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR.ordinal()] = 10;
            iArr[InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR.ordinal()] = 11;
            iArr[InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR.ordinal()] = 12;
            iArr[InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR.ordinal()] = 13;
            iArr[InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED.ordinal()] = 14;
            iArr[InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY.ordinal()] = 15;
            iArr[InstreamAdPlayerError.Reason.DRM_SESSION_ERROR.ordinal()] = 16;
            iArr[InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED.ordinal()] = 17;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED.ordinal()] = 18;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN.ordinal()] = 19;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND.ordinal()] = 20;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN.ordinal()] = 21;
            iArr[InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR.ordinal()] = 22;
            iArr[InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE.ordinal()] = 23;
            iArr[InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR.ordinal()] = 24;
            iArr[InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR.ordinal()] = 25;
            iArr[InstreamAdPlayerError.Reason.AUDIO_ERROR.ordinal()] = 26;
            iArr[InstreamAdPlayerError.Reason.SUBTITLE_ERROR.ordinal()] = 27;
            iArr[InstreamAdPlayerError.Reason.CACHE_ERROR.ordinal()] = 28;
            iArr[InstreamAdPlayerError.Reason.UNKNOWN.ordinal()] = 29;
            f24320a = iArr;
        }
    }

    public static pd1 a(InstreamAdPlayerError instreamAdPlayerError) {
        int i10;
        fd.j0.i(instreamAdPlayerError, "instreamAdPlayerError");
        switch (a.f24320a[instreamAdPlayerError.getReason().ordinal()]) {
            case 1:
                i10 = 1;
                break;
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 3;
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 5;
                break;
            case 6:
                i10 = 6;
                break;
            case 7:
                i10 = 7;
                break;
            case 8:
                i10 = 8;
                break;
            case 9:
                i10 = 9;
                break;
            case 10:
                i10 = 10;
                break;
            case 11:
                i10 = 11;
                break;
            case 12:
                i10 = 12;
                break;
            case 13:
                i10 = 13;
                break;
            case 14:
                i10 = 14;
                break;
            case 15:
                i10 = 15;
                break;
            case 16:
                i10 = 16;
                break;
            case 17:
                i10 = 17;
                break;
            case 18:
                i10 = 18;
                break;
            case 19:
                i10 = 19;
                break;
            case 20:
                i10 = 20;
                break;
            case 21:
                i10 = 21;
                break;
            case 22:
                i10 = 22;
                break;
            case 23:
                i10 = 23;
                break;
            case 24:
                i10 = 24;
                break;
            case 25:
                i10 = 25;
                break;
            case 26:
                i10 = 26;
                break;
            case 27:
                i10 = 27;
                break;
            case 28:
                i10 = 28;
                break;
            case 29:
                i10 = 29;
                break;
            default:
                throw new jc.g();
        }
        return new pd1(i10, instreamAdPlayerError.getUnderlyingError());
    }
}
