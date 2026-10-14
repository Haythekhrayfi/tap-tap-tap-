package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class of1 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg1 f23783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j9 f23784b = new j9();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ml f23785c = new ml();

    public of1(kg1 kg1Var) {
        this.f23783a = kg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        em0 em0VarB = this.f23783a.b();
        if (em0VarB != null) {
            PlaybackControlsContainer playbackControlsContainerA = em0VarB.a().a();
            ProgressBar progressBar = playbackControlsContainerA != null ? (ProgressBar) playbackControlsContainerA.findViewById(R.id.video_progress_control) : null;
            if (progressBar != null) {
                Objects.requireNonNull(this.f23784b);
                j9.a(progressBar, j10, j11);
            }
            PlaybackControlsContainer playbackControlsContainerA2 = em0VarB.a().a();
            TextView textView = playbackControlsContainerA2 != null ? (TextView) playbackControlsContainerA2.findViewById(R.id.video_count_down_control) : null;
            if (textView != null) {
                this.f23785c.a(textView, j10, j11);
            }
        }
    }
}
