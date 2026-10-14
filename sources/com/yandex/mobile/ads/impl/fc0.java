package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class fc0 implements x8, br0 {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jo f20595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PlaybackSession f20596c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f20602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f20603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20604k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private wq0 f20607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f20608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f20609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f20610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private yv f20611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private yv f20612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private yv f20613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f20616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f20617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20618y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20619z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v61.d f20598e = new v61.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v61.b f20599f = new v61.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f20601h = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f20600g = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20597d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20605l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20606m = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20621b;

        public a(int i10, int i11) {
            this.f20620a = i10;
            this.f20621b = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yv f20622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20624c;

        public b(yv yvVar, int i10, String str) {
            this.f20622a = yvVar;
            this.f20623b = i10;
            this.f20624c = str;
        }
    }

    private fc0(Context context, PlaybackSession playbackSession) {
        this.f20594a = context.getApplicationContext();
        this.f20596c = playbackSession;
        jo joVar = new jo();
        this.f20595b = joVar;
        joVar.a(this);
    }

    public static fc0 a(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new fc0(context, mediaMetricsManager.createPlaybackSession());
    }

    private void a() {
        PlaybackMetrics.Builder builder = this.f20603j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f20619z);
            this.f20603j.setVideoFramesDropped(this.f20617x);
            this.f20603j.setVideoFramesPlayed(this.f20618y);
            Long l10 = this.f20600g.get(this.f20602i);
            this.f20603j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f20601h.get(this.f20602i);
            this.f20603j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f20603j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f20596c.reportPlaybackMetrics(this.f20603j.build());
        }
        this.f20603j = null;
        this.f20602i = null;
        this.f20619z = 0;
        this.f20617x = 0;
        this.f20618y = 0;
        this.f20611r = null;
        this.f20612s = null;
        this.f20613t = null;
        this.A = false;
    }

    private void a(int i10, long j10, yv yvVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f20597d);
        if (yvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            int i12 = 3;
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = i11 != 3 ? 1 : 4;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = yvVar.f27114k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = yvVar.f27115l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = yvVar.f27112i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = yvVar.f27111h;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = yvVar.f27120q;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = yvVar.f27121r;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = yvVar.f27128y;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = yvVar.f27129z;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = yvVar.f27106c;
            if (str4 != null) {
                int i18 = da1.f19803a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = yvVar.f27122s;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f20596c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @RequiresNonNull({"metricsBuilder"})
    private void a(v61 v61Var, nc0.b bVar) {
        int iA;
        PlaybackMetrics.Builder builder = this.f20603j;
        if (bVar == null || (iA = v61Var.a(bVar.f22012a)) == -1) {
            return;
        }
        int i10 = 0;
        v61Var.a(iA, this.f20599f, false);
        v61Var.a(this.f20599f.f25848c, this.f20598e, 0L);
        bc0.g gVar = this.f20598e.f25863c.f19172b;
        if (gVar != null) {
            int iA2 = da1.a(gVar.f19220a, gVar.f19221b);
            if (iA2 == 0) {
                i10 = 3;
            } else if (iA2 != 1) {
                i10 = iA2 != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        v61.d dVar = this.f20598e;
        if (dVar.f25874n != -9223372036854775807L && !dVar.f25872l && !dVar.f25869i && !dVar.a()) {
            builder.setMediaDurationMillis(da1.b(this.f20598e.f25874n));
        }
        builder.setPlaybackType(this.f20598e.a() ? 2 : 1);
        this.A = true;
    }

    public final void a(int i10) {
        if (i10 == 1) {
            this.f20614u = true;
        }
        this.f20604k = i10;
    }

    public final void a(dc0 dc0Var) {
        this.f20615v = dc0Var.f19830a;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x018d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0190  */
    /* JADX WARN: Code duplicated, block: B:226:0x0362  */
    /* JADX WARN: Code duplicated, block: B:273:0x0446  */
    /* JADX WARN: Code duplicated, block: B:380:0x05b1 A[PHI: r0
  0x05b1: PHI (r0v25 int) = (r0v23 int), (r0v22 int) binds: [B:378:0x05ac, B:368:0x0596] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r1v92, types: [android.media.metrics.NetworkEvent$Builder] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.yandex.mobile.ads.impl.fc0] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [int] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [int] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [int] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59, types: [int] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    public final void a(dr0 dr0Var, x8.b bVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        char c10;
        int i13;
        a aVar;
        int i14;
        a aVar2;
        int i15;
        int i16;
        int i17;
        a aVar3;
        int i18;
        ?? r15;
        int i19;
        ?? r10;
        int i20;
        DrmInitData drmInitData;
        int i21;
        if (bVar.a() == 0) {
            return;
        }
        for (int i22 = 0; i22 < bVar.a(); i22++) {
            int iB = bVar.b(i22);
            x8.a aVarC = bVar.c(iB);
            if (iB == 0) {
                this.f20595b.d(aVarC);
            } else if (iB == 11) {
                this.f20595b.a(aVarC, this.f20604k);
            } else {
                this.f20595b.c(aVarC);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.a(0)) {
            x8.a aVarC2 = bVar.c(0);
            if (this.f20603j != null) {
                a(aVarC2.f26434b, aVarC2.f26436d);
            }
        }
        if (bVar.a(2) && this.f20603j != null) {
            com.yandex.mobile.ads.embedded.guava.collect.q0<e81.a> q0VarListIterator = dr0Var.getCurrentTracks().a().listIterator(0);
            loop1: while (true) {
                if (!q0VarListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                e81.a next = q0VarListIterator.next();
                for (int i23 = 0; i23 < next.f20122a; i23++) {
                    if (next.b(i23) && (drmInitData = next.a(i23).f27118o) != null) {
                        break loop1;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.f20603j;
                int i24 = da1.f19803a;
                int i25 = 0;
                while (true) {
                    if (i25 >= drmInitData.f18412d) {
                        i21 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.a(i25).f18414b;
                    if (uuid.equals(cg.f19501d)) {
                        i21 = 3;
                        break;
                    } else if (uuid.equals(cg.f19502e)) {
                        i21 = 2;
                        break;
                    } else {
                        if (uuid.equals(cg.f19500c)) {
                            i21 = 6;
                            break;
                        }
                        i25++;
                    }
                }
                builder.setDrmType(i21);
            }
        }
        if (bVar.a(1011)) {
            this.f20619z++;
        }
        wq0 wq0Var = this.f20607n;
        int i26 = 4;
        if (wq0Var == null) {
            i18 = 1;
            c10 = '\b';
            i13 = 7;
            i11 = 9;
            i12 = 6;
        } else {
            Context context = this.f20594a;
            boolean z11 = this.f20615v == 4;
            if (wq0Var.f26344a == 1001) {
                aVar = new a(20, 0);
            } else {
                if (wq0Var instanceof ns) {
                    ns nsVar = (ns) wq0Var;
                    boolean z12 = nsVar.f23533c == 1;
                    i10 = nsVar.f23537g;
                    z10 = z12;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = wq0Var.getCause();
                Objects.requireNonNull(cause);
                char c11 = 6005;
                if (cause instanceof IOException) {
                    if (cause instanceof r00) {
                        aVar3 = new a(5, ((r00) cause).f24580d);
                    } else {
                        if ((cause instanceof q00) || (cause instanceof qp0)) {
                            i15 = 9;
                            i16 = 6;
                            aVar = new a(z11 ? 10 : 11, 0);
                        } else {
                            boolean z13 = cause instanceof p00;
                            if (z13 || (cause instanceof d91.a)) {
                                i15 = 9;
                                if (dn0.b(context).a() == 1) {
                                    aVar = new a(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i16 = 6;
                                        aVar = new a(6, 0);
                                    } else {
                                        i16 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            i13 = 7;
                                            aVar = new a(7, 0);
                                            i11 = 9;
                                            i12 = 6;
                                            c10 = '\b';
                                        } else {
                                            if (z13 && ((p00) cause).f23939c == 1) {
                                                aVar = new a(4, 0);
                                            } else {
                                                aVar = new a(8, 0);
                                                i11 = 9;
                                                c10 = '\b';
                                                i12 = 6;
                                            }
                                            i13 = 7;
                                        }
                                        this.f20596c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).setErrorCode(aVar.f20620a).setSubErrorCode(aVar.f20621b).setException(wq0Var).build());
                                        i18 = 1;
                                        this.A = true;
                                        this.f20607n = null;
                                    }
                                }
                            } else if (wq0Var.f26344a == 1002) {
                                aVar = new a(21, 0);
                            } else if (cause instanceof com.yandex.mobile.ads.exo.drm.e.a) {
                                Throwable cause3 = cause.getCause();
                                Objects.requireNonNull(cause3);
                                int i27 = da1.f19803a;
                                if (i27 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                    int iA = da1.a(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    if (iA != 2 && iA != 4) {
                                        if (iA == 10) {
                                            c11 = 6004;
                                        } else if (iA != 7) {
                                            if (iA != 8) {
                                                switch (iA) {
                                                    case 15:
                                                        c11 = 6003;
                                                        break;
                                                    case 16:
                                                    case 18:
                                                        break;
                                                    case 17:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                        c11 = 6004;
                                                        break;
                                                    default:
                                                        switch (iA) {
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                            case 27:
                                                            case 28:
                                                                c11 = 6002;
                                                                break;
                                                            default:
                                                                c11 = 6006;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c11 = 6003;
                                            }
                                        }
                                    }
                                    switch (c11) {
                                        case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                            i17 = 24;
                                            break;
                                        case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                            i17 = 28;
                                            break;
                                        case 6004:
                                            i17 = 25;
                                            break;
                                        case 6005:
                                            i17 = 26;
                                            break;
                                        default:
                                            i17 = 27;
                                            break;
                                    }
                                    aVar3 = new a(i17, iA);
                                } else if (i27 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                    aVar = new a(27, 0);
                                } else if (i27 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                    aVar = new a(24, 0);
                                } else if (i27 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                    aVar = new a(29, 0);
                                } else if (cause3 instanceof l91) {
                                    aVar = new a(23, 0);
                                } else {
                                    aVar = cause3 instanceof com.yandex.mobile.ads.exo.drm.c.d ? new a(28, 0) : new a(30, 0);
                                }
                            } else if ((cause instanceof zu.c) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                Objects.requireNonNull(cause4);
                                Throwable cause5 = cause4.getCause();
                                aVar = (da1.f19803a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                            } else {
                                i15 = 9;
                                aVar = new a(9, 0);
                            }
                            i11 = i15;
                            c10 = '\b';
                            i13 = 7;
                            i12 = 6;
                            this.f20596c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).setErrorCode(aVar.f20620a).setSubErrorCode(aVar.f20621b).setException(wq0Var).build());
                            i18 = 1;
                            this.A = true;
                            this.f20607n = null;
                        }
                        i11 = i15;
                        i12 = i16;
                    }
                    aVar = aVar3;
                } else {
                    i11 = 9;
                    i12 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        aVar = new a(35, 0);
                    } else if (z10 && i10 == 3) {
                        aVar = new a(15, 0);
                    } else {
                        if (z10 && i10 == 2) {
                            aVar = new a(23, 0);
                        } else {
                            if (cause instanceof kb0.b) {
                                aVar2 = new a(13, da1.a(((kb0.b) cause).f22367d));
                            } else {
                                if (cause instanceof hb0) {
                                    aVar = new a(14, da1.a(((hb0) cause).f21355a));
                                } else if (cause instanceof OutOfMemoryError) {
                                    aVar = new a(14, 0);
                                } else if (cause instanceof bc.b) {
                                    aVar2 = new a(17, ((bc.b) cause).f19164a);
                                } else if (cause instanceof bc.e) {
                                    aVar2 = new a(18, ((bc.e) cause).f19167a);
                                } else if (da1.f19803a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                    c10 = '\b';
                                    i13 = 7;
                                    aVar = new a(22, 0);
                                } else {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    if (errorCode == 2 || errorCode == 4) {
                                        c10 = '\b';
                                        i13 = 7;
                                    } else {
                                        if (errorCode != 10) {
                                            i13 = 7;
                                            c10 = '\b';
                                            if (errorCode != 7) {
                                                if (errorCode != 8) {
                                                    switch (errorCode) {
                                                        case 15:
                                                            c11 = 6003;
                                                            break;
                                                        case 16:
                                                        case 18:
                                                            break;
                                                        case 17:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                            break;
                                                        default:
                                                            switch (errorCode) {
                                                                case 24:
                                                                case 25:
                                                                case 26:
                                                                case 27:
                                                                case 28:
                                                                    c11 = 6002;
                                                                    break;
                                                                default:
                                                                    c11 = 6006;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    c11 = 6003;
                                                }
                                            }
                                        } else {
                                            c10 = '\b';
                                            i13 = 7;
                                        }
                                        c11 = 6004;
                                    }
                                    switch (c11) {
                                        case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                            i14 = 24;
                                            break;
                                        case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                            i14 = 28;
                                            break;
                                        case 6004:
                                            i14 = 25;
                                            break;
                                        case 6005:
                                            i14 = 26;
                                            break;
                                        default:
                                            i14 = 27;
                                            break;
                                    }
                                    aVar = new a(i14, errorCode);
                                }
                                c10 = '\b';
                                i13 = 7;
                            }
                            aVar = aVar2;
                            c10 = '\b';
                            i13 = 7;
                        }
                        this.f20596c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).setErrorCode(aVar.f20620a).setSubErrorCode(aVar.f20621b).setException(wq0Var).build());
                        i18 = 1;
                        this.A = true;
                        this.f20607n = null;
                    }
                }
                c10 = '\b';
                i13 = 7;
                this.f20596c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).setErrorCode(aVar.f20620a).setSubErrorCode(aVar.f20621b).setException(wq0Var).build());
                i18 = 1;
                this.A = true;
                this.f20607n = null;
            }
            c10 = '\b';
            i13 = 7;
            i11 = 9;
            i12 = 6;
            this.f20596c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).setErrorCode(aVar.f20620a).setSubErrorCode(aVar.f20621b).setException(wq0Var).build());
            i18 = 1;
            this.A = true;
            this.f20607n = null;
        }
        if (bVar.a(2)) {
            e81 currentTracks = dr0Var.getCurrentTracks();
            boolean zA = currentTracks.a(2);
            boolean zA2 = currentTracks.a(i18);
            boolean zA3 = currentTracks.a(3);
            if (zA || zA2 || zA3) {
                if (zA || da1.a(this.f20611r, (Object) null)) {
                    r15 = i18;
                    i19 = 5;
                } else {
                    int i28 = this.f20611r == null ? i18 : 0;
                    this.f20611r = null;
                    i19 = 5;
                    r15 = 1;
                    a(1, jElapsedRealtime, null, i28);
                }
                if (!zA2 && !da1.a(this.f20612s, (Object) null)) {
                    int i29 = this.f20612s == null ? r15 == true ? 1 : 0 : 0;
                    this.f20612s = null;
                    a(0, jElapsedRealtime, null, i29);
                }
                if (!zA3 && !da1.a(this.f20613t, (Object) null)) {
                    int i30 = this.f20613t == null ? r15 == true ? 1 : 0 : 0;
                    this.f20613t = null;
                    a(2, jElapsedRealtime, null, i30);
                }
            } else {
                c10 = c10;
                i13 = i13;
                r15 = i18;
                i19 = 5;
                i26 = 4;
            }
        } else {
            c10 = c10;
            i13 = i13;
            r15 = i18;
            i19 = 5;
            i26 = 4;
        }
        b bVar2 = this.f20608o;
        if (((bVar2 == null || !bVar2.f20624c.equals(this.f20595b.b())) ? 0 : r15) != 0) {
            b bVar3 = this.f20608o;
            yv yvVar = bVar3.f20622a;
            if (yvVar.f27121r != -1) {
                int i31 = bVar3.f20623b;
                if (!da1.a(this.f20611r, yvVar)) {
                    ?? r11 = (this.f20611r == null && i31 == 0) ? r15 : i31;
                    this.f20611r = yvVar;
                    a(1, jElapsedRealtime, yvVar, r11);
                }
                this.f20608o = null;
            }
        }
        b bVar4 = this.f20609p;
        if (((bVar4 == null || !bVar4.f20624c.equals(this.f20595b.b())) ? 0 : r15) != 0) {
            b bVar5 = this.f20609p;
            yv yvVar2 = bVar5.f20622a;
            int i32 = bVar5.f20623b;
            if (!da1.a(this.f20612s, yvVar2)) {
                ?? r12 = (this.f20612s == null && i32 == 0) ? r15 : i32;
                this.f20612s = yvVar2;
                a(0, jElapsedRealtime, yvVar2, r12);
            }
            this.f20609p = null;
        }
        b bVar6 = this.f20610q;
        if (((bVar6 == null || !bVar6.f20624c.equals(this.f20595b.b())) ? 0 : r15) != 0) {
            b bVar7 = this.f20610q;
            yv yvVar3 = bVar7.f20622a;
            int i33 = bVar7.f20623b;
            if (!da1.a(this.f20613t, yvVar3)) {
                ?? r13 = (this.f20613t == null && i33 == 0) ? r15 : i33;
                this.f20613t = yvVar3;
                a(2, jElapsedRealtime, yvVar3, r13);
            }
            this.f20610q = null;
        }
        switch (dn0.b(this.f20594a).a()) {
            case 0:
                r10 = 0;
                break;
            case 1:
                r10 = i11;
                break;
            case 2:
                r10 = 2;
                break;
            case 3:
                r10 = i26;
                break;
            case 4:
                r10 = i19;
                break;
            case 5:
                r10 = i12;
                break;
            case 6:
            case 8:
            default:
                r10 = r15;
                break;
            case 7:
                r10 = 3;
                break;
            case 9:
                r10 = c10;
                break;
            case 10:
                r10 = i13;
                break;
        }
        if (r10 != this.f20606m) {
            this.f20606m = r10;
            this.f20596c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(r10).setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).build());
        }
        if (dr0Var.getPlaybackState() != 2) {
            this.f20614u = false;
        }
        if (dr0Var.a() == null) {
            this.f20616w = false;
            i20 = 10;
        } else {
            i20 = 10;
            if (bVar.a(10)) {
                this.f20616w = r15;
            }
        }
        int playbackState = dr0Var.getPlaybackState();
        if (this.f20614u) {
            i26 = i19;
        } else if (this.f20616w) {
            i26 = 13;
        } else if (playbackState == i26) {
            i26 = 11;
        } else if (playbackState == 2) {
            int i34 = this.f20605l;
            if (i34 == 0 || i34 == 2) {
                i26 = 2;
            } else if (!dr0Var.getPlayWhenReady()) {
                i26 = i13;
            } else if (dr0Var.getPlaybackSuppressionReason() != 0) {
                i26 = i20;
            } else {
                i26 = i12;
            }
        } else {
            i20 = 3;
            if (playbackState != 3) {
                i26 = (playbackState != r15 || this.f20605l == 0) ? this.f20605l : 12;
            } else if (dr0Var.getPlayWhenReady()) {
                if (dr0Var.getPlaybackSuppressionReason() != 0) {
                    i26 = i11;
                } else {
                    i26 = i20;
                }
            }
        }
        if (this.f20605l != i26) {
            this.f20605l = i26;
            this.A = r15;
            this.f20596c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f20605l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f20597d).build());
        }
        if (bVar.a(1028)) {
            this.f20595b.a(bVar.c(1028));
        }
    }

    public final void a(wf1 wf1Var) {
        b bVar = this.f20608o;
        if (bVar != null) {
            yv yvVar = bVar.f20622a;
            if (yvVar.f27121r == -1) {
                this.f20608o = new b(yvVar.a().q(wf1Var.f26269a).g(wf1Var.f26270b).a(), bVar.f20623b, bVar.f20624c);
            }
        }
    }

    public final void a(wq0 wq0Var) {
        this.f20607n = wq0Var;
    }

    public final void a(x8.a aVar, int i10, long j10) {
        nc0.b bVar = aVar.f26436d;
        if (bVar != null) {
            String strA = this.f20595b.a(aVar.f26434b, bVar);
            Long l10 = this.f20601h.get(strA);
            Long l11 = this.f20600g.get(strA);
            this.f20601h.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f20600g.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public final void a(x8.a aVar, dc0 dc0Var) {
        if (aVar.f26436d == null) {
            return;
        }
        yv yvVar = dc0Var.f19832c;
        Objects.requireNonNull(yvVar);
        int i10 = dc0Var.f19833d;
        jo joVar = this.f20595b;
        v61 v61Var = aVar.f26434b;
        nc0.b bVar = aVar.f26436d;
        Objects.requireNonNull(bVar);
        b bVar2 = new b(yvVar, i10, joVar.a(v61Var, bVar));
        int i11 = dc0Var.f19831b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f20609p = bVar2;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f20610q = bVar2;
                return;
            }
        }
        this.f20608o = bVar2;
    }

    public final void a(x8.a aVar, String str) {
        nc0.b bVar = aVar.f26436d;
        if (bVar == null || !bVar.a()) {
            a();
            this.f20602i = str;
            this.f20603j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            a(aVar.f26434b, aVar.f26436d);
        }
    }

    public final void a(ym ymVar) {
        this.f20617x += ymVar.f26884g;
        this.f20618y += ymVar.f26882e;
    }

    public final LogSessionId b() {
        return this.f20596c.getSessionId();
    }

    public final void b(x8.a aVar, String str) {
        nc0.b bVar = aVar.f26436d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f20602i)) {
            a();
        }
        this.f20600g.remove(str);
        this.f20601h.remove(str);
    }
}
