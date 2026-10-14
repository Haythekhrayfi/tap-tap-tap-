package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aw0 f24903a = new aw0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vq0 f24904b = new vq0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bz0<PlaybackControlsContainer> f24905c = new bz0<>();

    public final dl0 a(Context context, bf1 bf1Var, int i10) {
        Objects.requireNonNull(this.f24905c);
        PlaybackControlsContainer playbackControlsContainer = (PlaybackControlsContainer) bz0.a(context, PlaybackControlsContainer.class, i10, null);
        yv0 yv0VarA = this.f24903a.a(context);
        dl0 dl0Var = new dl0(context, yv0VarA, playbackControlsContainer);
        if (playbackControlsContainer != null) {
            Objects.requireNonNull(this.f24904b);
            CheckBox checkBox = (CheckBox) playbackControlsContainer.findViewById(R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setChecked(bf1Var.a());
            }
            playbackControlsContainer.setVisibility(8);
            dl0Var.addView(playbackControlsContainer);
        }
        yv0VarA.setVisibility(8);
        dl0Var.addView(yv0VarA);
        return dl0Var;
    }
}
