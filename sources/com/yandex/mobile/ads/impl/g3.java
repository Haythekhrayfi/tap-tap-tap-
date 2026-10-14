package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3 f20935a;

    public g3(Context context, w50 w50Var, d40 d40Var, g20 g20Var, s40 s40Var, dd1<VideoAd> dd1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(d40Var, "adPlayerController");
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(s40Var, "adViewsHolderManager");
        fd.j0.i(dd1Var, "playbackEventsListener");
        v1 v1VarA = r1.a(w50Var.a().c());
        fd.j0.h(v1VarA, "adBreakPositionConverter.convert(adBreakId)");
        this.f20935a = new f3(context, w50Var, v1VarA, g20Var, d40Var, s40Var, dd1Var);
    }

    public final ArrayList a(List list) {
        fd.j0.i(list, "videoAdInfoList");
        ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20935a.a((sc1) it.next()));
        }
        return arrayList;
    }
}
