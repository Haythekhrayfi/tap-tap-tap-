package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class gm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl0 f21103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf1 f21104b;

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final jl0 f21105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CheckBox f21106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21107c;

        public a(fl0 fl0Var, CheckBox checkBox, bf1 bf1Var) {
            this.f21106b = checkBox;
            this.f21107c = bf1Var.a();
            this.f21105a = new jl0(fl0Var);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = !this.f21107c;
            this.f21107c = z10;
            this.f21106b.setChecked(z10);
            this.f21105a.a(this.f21107c);
        }
    }

    public gm0(ft ftVar, bf1 bf1Var) {
        this.f21103a = ftVar;
        this.f21104b = bf1Var;
    }

    public final void a(PlaybackControlsContainer playbackControlsContainer) {
        if (playbackControlsContainer != null) {
            CheckBox checkBox = (CheckBox) playbackControlsContainer.findViewById(R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setOnClickListener(new a(this.f21103a, checkBox, this.f21104b));
                checkBox.setVisibility(0);
            }
            ProgressBar progressBar = (ProgressBar) playbackControlsContainer.findViewById(R.id.video_progress_control);
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            TextView textView = (TextView) playbackControlsContainer.findViewById(R.id.video_count_down_control);
            if (textView != null) {
                textView.setText("");
                textView.setVisibility(0);
            }
            playbackControlsContainer.setVisibility(0);
        }
    }
}
