package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.instream.view.InstreamMuteView;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e50 f24808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bz0<VideoAdControlsContainer> f24809b;

    public ro(e50 e50Var) {
        fd.j0.i(e50Var, "instreamDesign");
        this.f24808a = e50Var;
        this.f24809b = new bz0<>();
    }

    public final fc1 a(Context context, ViewGroup viewGroup) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(viewGroup, "rootView");
        int iA = j50.a(this.f24808a);
        Objects.requireNonNull(this.f24809b);
        VideoAdControlsContainer videoAdControlsContainer = (VideoAdControlsContainer) bz0.a(context, VideoAdControlsContainer.class, iA, viewGroup);
        if (videoAdControlsContainer == null) {
            return null;
        }
        ImageView imageView = (ImageView) videoAdControlsContainer.findViewById(R.id.sponsored_image);
        ImageView imageView2 = (ImageView) videoAdControlsContainer.findViewById(R.id.favicon);
        TextView textView = (TextView) videoAdControlsContainer.findViewById(R.id.call_to_action);
        ImageView imageView3 = (ImageView) videoAdControlsContainer.findViewById(R.id.instream_call_to_action);
        InstreamMuteView instreamMuteView = (InstreamMuteView) videoAdControlsContainer.findViewById(R.id.instream_mute);
        ProgressBar progressBar = (ProgressBar) videoAdControlsContainer.findViewById(R.id.instream_progress_display_view);
        View viewFindViewById = videoAdControlsContainer.findViewById(R.id.instream_skip);
        TextView textView2 = (TextView) videoAdControlsContainer.findViewById(R.id.domain);
        TextView textView3 = (TextView) videoAdControlsContainer.findViewById(R.id.sponsored);
        TextView textView4 = (TextView) videoAdControlsContainer.findViewById(R.id.ad_position);
        ImageView imageView4 = (ImageView) videoAdControlsContainer.findViewById(R.id.trademark_icon);
        TextView textView5 = (TextView) videoAdControlsContainer.findViewById(R.id.trademark_delimiter);
        View viewFindViewById2 = videoAdControlsContainer.findViewById(R.id.instream_cta_container);
        ImageView imageView5 = (ImageView) videoAdControlsContainer.findViewById(R.id.feedback);
        TextView textView6 = (TextView) videoAdControlsContainer.findViewById(R.id.timer_value);
        fc1 fc1VarA = new fc1.a(videoAdControlsContainer).d(imageView).b(imageView2).b(textView).a(imageView3).a((jh0) instreamMuteView).a(progressBar).b(viewFindViewById).e(textView3).c(textView2).a(textView4).e(imageView4).f(textView5).d(textView6).a(viewFindViewById2).c(imageView5).g((TextView) videoAdControlsContainer.findViewById(R.id.warning)).a();
        fd.j0.h(fc1VarA, "Builder(controlsContaine…iew)\n            .build()");
        return fc1VarA;
    }
}
