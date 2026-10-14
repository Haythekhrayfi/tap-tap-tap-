package com.zipoapps.premiumhelper.util;

import android.content.Context;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import fd.j0;
import java.util.List;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class ApplicationStartListener implements p1.b<w> {
    @Override // p1.b
    public /* bridge */ /* synthetic */ w create(Context context) {
        create2(context);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.f28309b.a();
        StartupPerformanceTracker.StartupData startupData = new StartupPerformanceTracker.StartupData(0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, null, null, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, 8388607, null);
        startupData.setApplicationStartTimestamp(System.currentTimeMillis());
        startupPerformanceTrackerA.f28311a = startupData;
    }

    @Override // p1.b
    public List<Class<? extends p1.b<?>>> dependencies() {
        return kc.w.f32009c;
    }
}
