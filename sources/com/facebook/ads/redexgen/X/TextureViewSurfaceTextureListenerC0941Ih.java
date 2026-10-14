package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TextureViewSurfaceTextureListenerC0941Ih extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, QM {
    public static byte[] A0N;
    public static String[] A0O = {"w6W1Pn4pGSy1veXw7fNic4Q20vJelJ2", "acNB2lhq8cVPZLtYghlcj8euurSBcqdx", "I2BPPFoGG3lXsTKKPy2FKKasdsM", "uMMu8699SI696vicAGdUyhB1Kjcnsg5D", "S7aPtd9QGtmzyQ9VrNW20IwmaDF5p1Ml", "zS648UlhjTBJXulz7NmFsyAIwaw2iCpI", "ZyXsHo9oibpczWLkt42IpHWLTZevRgPI", "euMEykkwaXnS"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    public MediaController A0A;
    public PZ A0B;
    public QO A0C;
    public QO A0D;
    public QP A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final MediaController.MediaPlayerControl A0L;
    public final C1337Xw A0M;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{89, 87, 91, 89, Ascii.RS, 3, 15, 9, Ascii.SUB, 89, 91, 65, 91, 89, 57, 102, 105, 75, 68, 68, 69, 94, 10, 90, 88, 79, 90, 75, 88, 79, 10, 71, 79, 78, 67, 75, 10, 90, 70, 75, 83, 79, 88, 10, 93, 67, 94, 66, 10, 121, 95, 88, 76, 75, 73, 79, 126, 79, 82, 94, 95, 88, 79, 16, 10, 45, 1, Ascii.ESC, 2, 10, 0, 73, Ascii.SUB, 78, Ascii.FS, 11, Ascii.SUB, Ascii.FS, 7, 11, Ascii.CAN, 11, 78, Ascii.CAN, 7, 10, 11, 1, 78, 7, 0, 8, 1, Ascii.FS, 3, 15, Ascii.SUB, 7, 1, 0, 93, 122, 114, 119, 126, Ascii.DEL, 59, 111, 116, 59, 116, 107, 126, 117, 59, 122, 104, 104, 126, 111, 104, 59, 15, 39, 39, 47, 36, 45, 104, 41, 36, 63, 41, 49, 59, 104, 60, 32, 58, 39, 63, 104, 41, 38, 104, 45, 48, 43, 45, 56, 60, 33, 39, 38, 104, 63, 33, 60, 32, 104, 59, 45, 60, 10, 41, 43, 35, 47, 58, 39, 61, 38, 44, 12, 58, 41, 63, 41, 42, 36, 45, 104, 39, 38, 104, 6, 39, 61, 47, 41, 60, 104, 41, 42, 39, 62, 45, 102, 104, 59, 39, 104, 63, 45, 104, 59, 33, 36, 45, 38, 60, 36, 49, 104, 33, 47, 38, 39, 58, 45, 104, 33, 60, 102, 50, Ascii.SUB, Ascii.SUB, 18, Ascii.EM, 16, 85, 20, Ascii.EM, 2, 20, 12, 6, 85, 1, Ascii.GS, 7, Ascii.SUB, 2, 85, 20, Ascii.ESC, 85, 16, 13, 22, 16, 5, 1, Ascii.FS, Ascii.SUB, Ascii.ESC, 85, 2, Ascii.FS, 1, Ascii.GS, 85, 6, 16, 1, 51, Ascii.SUB, 7, 16, 18, 7, Ascii.SUB, 0, Ascii.ESC, 17, 85, Ascii.SUB, Ascii.ESC, 85, 59, Ascii.SUB, 0, 18, 20, 1, 85, 20, 23, Ascii.SUB, 3, 16, 91, 85, 6, Ascii.SUB, 85, 2, 16, 85, 6, Ascii.FS, Ascii.EM, 16, Ascii.ESC, 1, Ascii.EM, 12, 85, Ascii.FS, 18, Ascii.ESC, Ascii.SUB, 7, 16, 85, Ascii.FS, 1, 91, 2, 57, 54, 53, 59, 50, 119, 35, 56, 119, 52, 59, 56, 36, 50, 21, 42, 39, 38, 44, 99, 48, 55, 34, 55, 38, 99, 32, 43, 34, 45, 36, 38, 39, 99, 55, 44, 99, 2, 16, 16, 6, 23, 112, 108, 97, 121, 101, 114, 88, 1, 84, 75, 66, 87, 1, 3, Ascii.EM, 3, 1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (IN.A1X(this.A0M) && this.A06 != null) {
            boolean zA06 = A06();
            if (A0O[1].charAt(7) != 'q') {
                throw new RuntimeException();
            }
            A0O[5] = "zsAx7U2aKSd2GPuux6v5Um4uWviEPJCj";
            if (zA06) {
                long currentPosition = getCurrentPosition();
                long currentPosition2 = getCurrentPosition();
                long jCurrentTimeMillis = System.currentTimeMillis();
                float volume = getVolume();
                QP qp = this.A0E;
                if (qp != null) {
                    qp.ABF(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
                }
            }
        }
    }

    static {
        A04();
        A0P = TextureViewSurfaceTextureListenerC0941Ih.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC0941Ih(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A0C = QO.A04;
        this.A0D = QO.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = PZ.A03;
        this.A0L = new QJ(this);
        this.A0M = c1337Xw;
    }

    public TextureViewSurfaceTextureListenerC0941Ih(C1337Xw c1337Xw, AttributeSet attributeSet) {
        super(c1337Xw, attributeSet);
        this.A0C = QO.A04;
        this.A0D = QO.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = PZ.A03;
        this.A0L = new QJ(this);
        this.A0M = c1337Xw;
    }

    public TextureViewSurfaceTextureListenerC0941Ih(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        this.A0C = QO.A04;
        this.A0D = QO.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = PZ.A03;
        this.A0L = new QJ(this);
        this.A0M = c1337Xw;
    }

    private boolean A05() {
        return (this.A0C == QO.A08 || this.A0C == QO.A07) ? false : true;
    }

    private boolean A06() {
        return this.A0C == QO.A07 || this.A0C == QO.A0A || this.A0C == QO.A05 || this.A0C == QO.A06;
    }

    private boolean A07() {
        return (this.A0C == QO.A08 || this.A0C == QO.A07) ? false : true;
    }

    private boolean A08() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e10) {
            this.A0M.A07().A9K(A03(361, 6, 114), C06937v.A2G, new C06947w(e10));
            return false;
        }
    }

    private boolean A09(Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            return true;
        } catch (IllegalStateException e10) {
            this.A0M.A07().A9K(A03(361, 6, 114), C06937v.A2H, new C06947w(e10));
            return false;
        }
    }

    public final /* synthetic */ void A0B() {
        Activity activity = this.A0M.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8F();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void A8F() {
        if (!this.A0F) {
            ADZ(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A8Q() {
        if (this.A06 == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                int trackType = trackInfo.getTrackType();
                String[] strArr = A0O;
                if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                    throw new RuntimeException();
                }
                A0O[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                if (trackType == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e10) {
            Log.e(A0P, A03(65, 35, 28), e10);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A8R() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A8y() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void ADZ(boolean z10, int i10) {
        this.A0M.A0E().A2y(i10);
        this.A0D = QO.A05;
        if (this.A06 != null) {
            if (!A05()) {
                return;
            }
            this.A0I = z10;
            this.A06.pause();
            if (this.A0C != QO.A06) {
                setVideoState(QO.A05);
                return;
            }
            return;
        }
        setVideoState(QO.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void AFR(int i10) {
        this.A0M.A0E().A9x(i10);
        setVideoState(QO.A09);
        AFd(5);
        this.A03 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    @Override // com.facebook.ads.redexgen.X.QM
    public final void AFW(PZ pz, int i10) {
        MediaPlayer mediaPlayer;
        int i11;
        this.A0M.A0E().A39(i10);
        this.A0I = false;
        this.A0D = QO.A0A;
        this.A0B = pz;
        if (this.A0C == QO.A0A || this.A0C == QO.A07) {
            mediaPlayer = this.A06;
            if (mediaPlayer == null) {
                setup(this.A07);
            } else {
                i11 = this.A03;
                if (i11 > 0) {
                    mediaPlayer.seekTo(i11);
                }
                this.A06.start();
                if (this.A0C == QO.A07 || this.A0J) {
                    setVideoState(QO.A0A);
                }
            }
        } else {
            QO qo = this.A0C;
            if (A0O[7].length() == 4) {
                throw new RuntimeException();
            }
            A0O[4] = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw";
            if (qo == QO.A04 || this.A0C == QO.A05 || this.A0C == QO.A06) {
                mediaPlayer = this.A06;
                if (mediaPlayer == null) {
                    setup(this.A07);
                } else {
                    i11 = this.A03;
                    if (i11 > 0) {
                        mediaPlayer.seekTo(i11);
                    }
                    this.A06.start();
                    if (this.A0C == QO.A07) {
                        setVideoState(QO.A0A);
                    } else {
                        setVideoState(QO.A0A);
                    }
                }
            }
        }
        if (isAvailable()) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (A0O[1].charAt(7) != 'q') {
                A0O[4] = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd";
                onSurfaceTextureAvailable(surfaceTexture, 0, 0);
            } else {
                A0O[7] = "pXleF17jKjib";
                onSurfaceTextureAvailable(surfaceTexture, 0, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void AFd(int i10) {
        this.A0M.A0E().A3B(i10);
        this.A0D = QO.A04;
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer != null) {
            int currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            if (A0O[4].charAt(14) == '3') {
                throw new RuntimeException();
            }
            A0O[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            A08();
            this.A06.release();
            this.A06 = null;
            MediaController mediaController = this.A0A;
            if (mediaController != null) {
                mediaController.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(QO.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void destroy() {
        if (this.A06 != null) {
            A09(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A08();
            this.A06 = null;
            setVideoState(QO.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getCurrentPosition() {
        if (this.A06 == null || !A06()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getDuration() {
        if (this.A06 == null) {
            return 0;
        }
        boolean zA06 = A06();
        String[] strArr = A0O;
        if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        A0O[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
        if (!zA06) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public long getInitialBufferTime() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public PZ getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public QO getState() {
        return this.A0C;
    }

    public QO getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(QO.A03);
            this.A0M.A0E().A32(5);
            AFd(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(QO.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        this.A0M.A0E().A9w(A03(367, 11, 81) + i10 + A03(0, 14, 9) + i11 + A03(14, 2, 105));
        if (this.A01 > 0 && getState() == QO.A0A) {
            this.A01--;
            AFd(6);
            AFW(this.A0B, 10);
        } else {
            setVideoState(QO.A03);
            this.A0M.A0E().A32(1);
            AFd(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        switch (i10) {
            case 3:
                this.A0J = true;
                if (this.A0D == QO.A0A) {
                    QO qo = QO.A0A;
                    if (A0O[4].charAt(14) != '3') {
                        String[] strArr = A0O;
                        strArr[3] = "iL0L5EQxu2M5tvy2sZDjl5tOkB9wsg4Q";
                        strArr[6] = "qEr4cYtmjtQdjlZthk5xBRgssZbq5gW6";
                        setVideoState(qo);
                    } else {
                        setVideoState(qo);
                    }
                }
                return true;
            case 701:
                setVideoState(QO.A02);
                return false;
            case 702:
                if (!A07()) {
                    return false;
                }
                QO qo2 = QO.A0A;
                String[] strArr2 = A0O;
                if (strArr2[3].charAt(29) != strArr2[6].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0O;
                strArr3[3] = "BctcOQJYgBcKf8RdBMRoW9O8jkER1gO3";
                strArr3[6] = "NFF5b4NOHp1wMQpQtAU8ibXMpYWuxgZg";
                setVideoState(qo2);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(QO.A07);
        if (this.A0H && !this.A0G) {
            Activity activityContext = this.A0M.A0D();
            if (activityContext != null) {
                MediaController mediaController = new MediaController(activityContext);
                this.A0A = mediaController;
                View view = this.A09;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                MediaController mediaController2 = this.A0A;
                MediaController.MediaPlayerControl mediaPlayerControl = this.A0L;
                if (A0O[1].charAt(7) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0O;
                strArr[3] = "fPjFRSSzuUrY85KdwEQXHAUI7gq3zgJX";
                strArr[6] = "QlnNj2Zi0n3XZkktRetea07zoE6PUgNL";
                mediaController2.setMediaPlayer(mediaPlayerControl);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        int i10 = this.A03;
        if (i10 > 0) {
            if (i10 >= this.A06.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        QO qo = this.A0D;
        QO qo2 = QO.A0A;
        String[] strArr2 = A0O;
        if (strArr2[2].length() == strArr2[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "i4HMjCzdRtS7Zf5jyUfqsJgJBFC3Hgk3";
        strArr3[6] = "nPyigXhxANl12gOwrMulZJ84NGYQcgH1";
        if (qo == qo2) {
            AFW(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        QP qp = this.A0E;
        if (qp == null) {
            return;
        }
        qp.ACh(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A09(this.A08)) {
            setVideoState(QO.A03);
            this.A0M.A0E().A32(4);
            destroy();
        } else if (this.A0C == QO.A05 && !this.A0I) {
            AFW(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A09(null);
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        if (this.A0C != QO.A05) {
            ADZ(false, 5);
        }
        if (A0O[1].charAt(7) != 'q') {
            throw new RuntimeException();
        }
        A0O[5] = "wJEag4Up5dB02EoPbWjrYUJlPYnnpJPt";
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.A05 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.A04 = videoHeight;
        if (this.A05 != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A06 == null) {
            return;
        }
        MediaController mediaController = this.A0A;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0C != QO.A05) {
                if (IN.A1F(this.A0M) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.QI
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0B();
                        }
                    }, 1000L);
                    return;
                } else {
                    A8F();
                    return;
                }
            }
            return;
        }
        if (this.A0C != QO.A05 || this.A0I) {
            return;
        }
        AFW(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void seekTo(int i10) {
        if (this.A06 != null && A06()) {
            if (i10 < getDuration() && i10 > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i10;
                this.A06.seekTo(i10);
                return;
            }
            return;
        }
        this.A03 = i10;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(122, 102, 58));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0F = z10;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new QL(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(224, 94, 7));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setFullScreen(boolean z10) {
        this.A0H = z10;
        if (z10 && !this.A0G) {
            setOnTouchListener(new QK(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A06 != null && this.A0C != QO.A08 && this.A0C != QO.A04) {
            this.A06.setVolume(f10, f10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setVideoMPD(String str) {
    }

    private void setVideoState(QO qo) {
        if (qo != this.A0C) {
            if (this.A0M.A04().A8n()) {
                String str = A03(333, 23, 49) + qo;
            }
            this.A0C = qo;
            QP qp = this.A0E;
            if (qp != null) {
                qp.ADM(qo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setVideoStateChangeListener(QP qp) {
        this.A0E = qp;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.QM
    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        IOException e10;
        String str;
        String str2;
        String strA03 = A03(318, 15, 37);
        this.A0M.A0E().A31();
        this.A0J = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A08();
            A09(null);
            mediaPlayer = this.A06;
            setVideoState(QO.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals(A03(356, 5, 17))) {
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    try {
                        assetFileDescriptorOpenFd = getContext().getAssets().openFd(uri.getPath().substring(1));
                        try {
                            mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                } catch (IOException e11) {
                                    str = A0P;
                                    str2 = strA03 + e11;
                                    Log.w(str, str2);
                                }
                            }
                        } catch (IOException e12) {
                            e = e12;
                            Log.w(A0P, A03(100, 22, 105) + e);
                            setVideoState(QO.A03);
                            this.A0M.A0E().A32(2);
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                } catch (IOException e13) {
                                    str = A0P;
                                    str2 = strA03 + e13;
                                    Log.w(str, str2);
                                }
                            }
                        } catch (SecurityException e14) {
                            e = e14;
                            Log.w(A0P, A03(100, 22, 105) + e);
                            setVideoState(QO.A03);
                            this.A0M.A0E().A32(2);
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                        }
                    } catch (Throwable th) {
                        e10 = th;
                        if (assetFileDescriptorOpenFd != null) {
                            try {
                                assetFileDescriptorOpenFd.close();
                            } catch (IOException e15) {
                                Log.w(A0P, strA03 + e15);
                            }
                        }
                        throw e10;
                    }
                } catch (IOException e16) {
                    e = e16;
                } catch (SecurityException e17) {
                    e = e17;
                } catch (Throwable th2) {
                    e10 = th2;
                    if (assetFileDescriptorOpenFd != null) {
                        assetFileDescriptorOpenFd.close();
                    }
                    throw e10;
                }
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(QO.A08);
        } catch (Exception e18) {
            setVideoState(QO.A03);
            this.A0M.A0E().A32(3);
            mediaPlayer.release();
            Log.e(A0P, A03(16, 49, 88) + e18);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
