package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.TextureView;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface dr0 {

    public static final class a implements wf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f19974b = new C0205a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qv f19975a;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.dr0$a$a, reason: collision with other inner class name */
        public static final class C0205a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final qv.a f19976a = new qv.a();

            public final C0205a a(int i10) {
                this.f19976a.a(i10);
                return this;
            }

            public final C0205a a(a aVar) {
                qv.a aVar2 = this.f19976a;
                qv qvVar = aVar.f19975a;
                Objects.requireNonNull(aVar2);
                for (int i10 = 0; i10 < qvVar.a(); i10++) {
                    aVar2.a(qvVar.b(i10));
                }
                return this;
            }

            public final C0205a a(boolean z10, int i10) {
                qv.a aVar = this.f19976a;
                if (z10) {
                    aVar.a(i10);
                } else {
                    Objects.requireNonNull(aVar);
                }
                return this;
            }

            public final C0205a a(int... iArr) {
                qv.a aVar = this.f19976a;
                Objects.requireNonNull(aVar);
                for (int i10 : iArr) {
                    aVar.a(i10);
                }
                return this;
            }

            public final a a() {
                return new a(this.f19976a.a(), 0);
            }
        }

        static {
            dp1 dp1Var = dp1.f19952k;
        }

        private a(qv qvVar) {
            this.f19975a = qvVar;
        }

        public /* synthetic */ a(qv qvVar, int i10) {
            this(qvVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
            if (integerArrayList == null) {
                return f19974b;
            }
            C0205a c0205a = new C0205a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                c0205a.a(integerArrayList.get(i10).intValue());
            }
            return c0205a.a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f19975a.equals(((a) obj).f19975a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f19975a.hashCode();
        }
    }

    public interface b {
        default void a() {
        }

        default void a(int i10) {
        }

        default void a(Metadata metadata) {
        }

        default void a(bc0 bc0Var, int i10) {
        }

        default void a(cm cmVar) {
        }

        default void a(dp dpVar) {
        }

        default void a(a aVar) {
        }

        default void a(c cVar, c cVar2, int i10) {
        }

        default void a(e81 e81Var) {
        }

        default void a(ec0 ec0Var) {
        }

        default void a(ns nsVar) {
        }

        default void a(wf1 wf1Var) {
        }

        default void a(zq0 zq0Var) {
        }

        default void a(boolean z10, int i10) {
        }

        @Deprecated
        default void b() {
        }

        default void b(ns nsVar) {
        }

        @Deprecated
        default void c() {
        }

        @Deprecated
        default void onCues(List<am> list) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void onVolumeChanged(float f10) {
        }
    }

    public static final class c implements wf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f19977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bc0 f19979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f19980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f19982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f19983g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19984h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f19985i;

        static {
            yn1 yn1Var = yn1.f26952l;
        }

        public c(Object obj, int i10, bc0 bc0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f19977a = obj;
            this.f19978b = i10;
            this.f19979c = bc0Var;
            this.f19980d = obj2;
            this.f19981e = i11;
            this.f19982f = j10;
            this.f19983g = j11;
            this.f19984h = i12;
            this.f19985i = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            int i10 = bundle.getInt(Integer.toString(0, 36), -1);
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            return new c(null, i10, bundle2 == null ? null : (bc0) bc0.f19170g.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f19978b == cVar.f19978b && this.f19981e == cVar.f19981e && this.f19982f == cVar.f19982f && this.f19983g == cVar.f19983g && this.f19984h == cVar.f19984h && this.f19985i == cVar.f19985i && sn0.a(this.f19977a, cVar.f19977a) && sn0.a(this.f19980d, cVar.f19980d) && sn0.a(this.f19979c, cVar.f19979c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f19977a, Integer.valueOf(this.f19978b), this.f19979c, this.f19980d, Integer.valueOf(this.f19981e), Long.valueOf(this.f19982f), Long.valueOf(this.f19983g), Integer.valueOf(this.f19984h), Integer.valueOf(this.f19985i)});
        }
    }

    ns a();

    void a(b bVar);

    void b(b bVar);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    v61 getCurrentTimeline();

    e81 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z10);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();
}
