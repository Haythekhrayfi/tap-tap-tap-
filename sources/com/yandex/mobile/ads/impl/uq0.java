package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class uq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg1 f25728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bd1 f25729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nf1 f25730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gm0 f25731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f25732e = new a(this, 0);

    public class a implements hd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private hd1 f25733a;

        private a() {
        }

        public /* synthetic */ a(uq0 uq0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hd1
        public final void a() {
            hd1 hd1Var = this.f25733a;
            if (hd1Var != null) {
                hd1Var.a();
            }
        }

        public final void a(hd1 hd1Var) {
            this.f25733a = hd1Var;
        }

        @Override // com.yandex.mobile.ads.impl.hd1
        public final void b() {
            em0 em0VarB = uq0.this.f25728a.b();
            if (em0VarB != null) {
                dl0 dl0VarA = em0VarB.a();
                gm0 gm0Var = uq0.this.f25731d;
                PlaybackControlsContainer playbackControlsContainerA = dl0VarA.a();
                Objects.requireNonNull(gm0Var);
                if (playbackControlsContainerA != null) {
                    CheckBox checkBox = (CheckBox) playbackControlsContainerA.findViewById(R.id.video_mute_control);
                    if (checkBox != null) {
                        checkBox.setOnClickListener(null);
                        checkBox.setVisibility(8);
                    }
                    ProgressBar progressBar = (ProgressBar) playbackControlsContainerA.findViewById(R.id.video_progress_control);
                    if (progressBar != null) {
                        progressBar.setProgress(0);
                        progressBar.setVisibility(8);
                    }
                    TextView textView = (TextView) playbackControlsContainerA.findViewById(R.id.video_count_down_control);
                    if (textView != null) {
                        textView.setText("");
                        textView.setVisibility(8);
                    }
                    playbackControlsContainerA.setVisibility(8);
                }
            }
            hd1 hd1Var = this.f25733a;
            if (hd1Var != null) {
                hd1Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.hd1
        public final void c() {
            em0 em0VarB = uq0.this.f25728a.b();
            if (em0VarB != null) {
                uq0.this.f25730c.a(em0VarB);
            }
            hd1 hd1Var = this.f25733a;
            if (hd1Var != null) {
                hd1Var.c();
            }
        }
    }

    public uq0(kg1 kg1Var, bd1 bd1Var, gm0 gm0Var, ts0 ts0Var) {
        this.f25728a = kg1Var;
        this.f25729b = bd1Var;
        this.f25731d = gm0Var;
        this.f25730c = new nf1(gm0Var, ts0Var);
    }

    public final void a() {
        this.f25729b.a(this.f25732e);
        this.f25729b.play();
    }

    public final void a(em0 em0Var) {
        this.f25729b.stop();
        dl0 dl0VarA = em0Var.a();
        gm0 gm0Var = this.f25731d;
        PlaybackControlsContainer playbackControlsContainerA = dl0VarA.a();
        Objects.requireNonNull(gm0Var);
        if (playbackControlsContainerA != null) {
            CheckBox checkBox = (CheckBox) playbackControlsContainerA.findViewById(R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setOnClickListener(null);
                checkBox.setVisibility(8);
            }
            ProgressBar progressBar = (ProgressBar) playbackControlsContainerA.findViewById(R.id.video_progress_control);
            if (progressBar != null) {
                progressBar.setProgress(0);
                progressBar.setVisibility(8);
            }
            TextView textView = (TextView) playbackControlsContainerA.findViewById(R.id.video_count_down_control);
            if (textView != null) {
                textView.setText("");
                textView.setVisibility(8);
            }
            playbackControlsContainerA.setVisibility(8);
        }
    }

    public final void a(hd1 hd1Var) {
        this.f25732e.a(hd1Var);
    }
}
