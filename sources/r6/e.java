package r6;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f35179a;

    public e(q6.b bVar) {
        j0.i(bVar, "rxEvents");
        this.f35179a = bVar;
        Object objA = k7.g.a("layout_size", Double.valueOf(1.0d));
        j0.h(objA, "get(LAYOUT_SIZE, LayoutSize.NORMAL)");
        ((Number) objA).doubleValue();
        Object objA2 = k7.g.a("layout_orientation", 1);
        j0.h(objA2, "get(LAYOUT_ORIENTATION, …utOrientation.HORIZONTAL)");
        ((Number) objA2).intValue();
        Boolean bool = Boolean.TRUE;
        Object objA3 = k7.g.a("background_service", bool);
        j0.h(objA3, "get(LAUNCH_BACKGROUND_SERVICE, true)");
        ((Boolean) objA3).booleanValue();
        Object objA4 = k7.g.a("analytics", bool);
        j0.h(objA4, "get(ANALYTICS, true)");
        ((Boolean) objA4).booleanValue();
        Boolean bool2 = Boolean.FALSE;
        Object objA5 = k7.g.a("experimental_mode", bool2);
        j0.h(objA5, "get(EXPERIMENTAL_MODE, false)");
        ((Boolean) objA5).booleanValue();
        Object objA6 = k7.g.a("recording_label_in_combine", bool);
        j0.h(objA6, "get(RECORDING_LABEL_IN_COMBINE, true)");
        ((Boolean) objA6).booleanValue();
        Object objA7 = k7.g.a("open_mode_settings_on_select", bool2);
        j0.h(objA7, "get(OPEN_MODE_SETTINGS_ON_SELECT, false)");
        ((Boolean) objA7).booleanValue();
        Object objA8 = k7.g.a("shake_to_hide_widget", bool);
        j0.h(objA8, "get(SHAKE_TO_HIDE_WIDGET, true)");
        ((Boolean) objA8).booleanValue();
        Object objA9 = k7.g.a("volume_up_to_hide", bool);
        j0.h(objA9, "get(VOLUME_UP_TO_HIDE, true)");
        ((Boolean) objA9).booleanValue();
        Object objA10 = k7.g.a("recording_popup", bool2);
        j0.h(objA10, "get(RECORDING_POPUP, false)");
        ((Boolean) objA10).booleanValue();
        Object objA11 = k7.g.a("use_main_thread", bool2);
        j0.h(objA11, "get(USE_MAIN_THREAD, false)");
        ((Boolean) objA11).booleanValue();
        Object objA12 = k7.g.a("turn_off_on_screen_off", bool);
        j0.h(objA12, "get(TURN_OFF_ON_SCREEN_OFF, true)");
        ((Boolean) objA12).booleanValue();
        Object objA13 = k7.g.a("notify_when_finished", bool2);
        j0.h(objA13, "get(NOTIFY_WHEN_FINISHED, false)");
        ((Boolean) objA13).booleanValue();
        Object objA14 = k7.g.a("sorting_order", o.ASC);
        j0.h(objA14, "get(SORTING_ORDER, SortingOrder.ASC)");
        Object objA15 = k7.g.a("sorting_by", n.UPDATE_DATE);
        j0.h(objA15, "get(SORTING_BY, SortingBy.UPDATE_DATE)");
        Object objA16 = k7.g.a("time_left", bool2);
        j0.h(objA16, "get(TIME_LEFT, false)");
        ((Boolean) objA16).booleanValue();
        Object objA17 = k7.g.a("beta_launches", 0);
        j0.h(objA17, "get(BETA_LAUNCHES, 0)");
        ((Number) objA17).intValue();
        Object objA18 = k7.g.a("install_date", -1L);
        j0.h(objA18, "get(INSTALL_DATE, -1L)");
        ((Number) objA18).longValue();
        Object objA19 = k7.g.a("playback_engine", l.ONE_TO_ONE);
        j0.h(objA19, "get(PLAYBACK_ENGINE, PlaybackEngine.ONE_TO_ONE)");
        Object objA20 = k7.g.a("accessibility_consent", bool2);
        j0.h(objA20, "get(ACCESSIBILITY_CONSENT, false)");
        ((Boolean) objA20).booleanValue();
    }

    public final boolean a() {
        Object objA = k7.g.a("background_service", Boolean.TRUE);
        j0.h(objA, "get(LAUNCH_BACKGROUND_SERVICE, true)");
        return ((Boolean) objA).booleanValue();
    }

    public final boolean b() {
        Object objA = k7.g.a("experimental_mode", Boolean.FALSE);
        j0.h(objA, "get(EXPERIMENTAL_MODE, false)");
        return ((Boolean) objA).booleanValue();
    }

    public final int c() {
        Object objA = k7.g.a("layout_orientation", 1);
        j0.h(objA, "get(LAYOUT_ORIENTATION, …utOrientation.HORIZONTAL)");
        return ((Number) objA).intValue();
    }

    public final double d() {
        Object objA = k7.g.a("layout_size", Double.valueOf(1.0d));
        j0.h(objA, "get(LAYOUT_SIZE, LayoutSize.NORMAL)");
        return ((Number) objA).doubleValue();
    }

    public final boolean e() {
        Object objA = k7.g.a("notify_when_finished", Boolean.FALSE);
        j0.h(objA, "get(NOTIFY_WHEN_FINISHED, false)");
        return ((Boolean) objA).booleanValue();
    }

    public final boolean f() {
        Object objA = k7.g.a("open_mode_settings_on_select", Boolean.FALSE);
        j0.h(objA, "get(OPEN_MODE_SETTINGS_ON_SELECT, false)");
        return ((Boolean) objA).booleanValue();
    }

    public final l g() {
        Object objA = k7.g.a("playback_engine", l.ONE_TO_ONE);
        j0.h(objA, "get(PLAYBACK_ENGINE, PlaybackEngine.ONE_TO_ONE)");
        return (l) objA;
    }

    public final boolean h() {
        Object objA = k7.g.a("recording_label_in_combine", Boolean.TRUE);
        j0.h(objA, "get(RECORDING_LABEL_IN_COMBINE, true)");
        return ((Boolean) objA).booleanValue();
    }

    public final boolean i() {
        Object objA = k7.g.a("recording_popup", Boolean.FALSE);
        j0.h(objA, "get(RECORDING_POPUP, false)");
        return ((Boolean) objA).booleanValue();
    }

    public final n j() {
        Object objA = k7.g.a("sorting_by", n.UPDATE_DATE);
        j0.h(objA, "get(SORTING_BY, SortingBy.UPDATE_DATE)");
        return (n) objA;
    }

    public final o k() {
        Object objA = k7.g.a("sorting_order", o.ASC);
        j0.h(objA, "get(SORTING_ORDER, SortingOrder.ASC)");
        return (o) objA;
    }

    public final boolean l() {
        Object objA = k7.g.a("time_left", Boolean.FALSE);
        j0.h(objA, "get(TIME_LEFT, false)");
        return ((Boolean) objA).booleanValue();
    }

    public final boolean m() {
        Object objA = k7.g.a("turn_off_on_screen_off", Boolean.TRUE);
        j0.h(objA, "get(TURN_OFF_ON_SCREEN_OFF, true)");
        return ((Boolean) objA).booleanValue();
    }

    public final boolean n() {
        Object objA = k7.g.a("use_main_thread", Boolean.FALSE);
        j0.h(objA, "get(USE_MAIN_THREAD, false)");
        return ((Boolean) objA).booleanValue();
    }

    public final boolean o() {
        Object objA = k7.g.a("volume_up_to_hide", Boolean.TRUE);
        j0.h(objA, "get(VOLUME_UP_TO_HIDE, true)");
        return ((Boolean) objA).booleanValue();
    }

    public final void p(boolean z10) {
        k7.g.b("accessibility_consent", Boolean.valueOf(z10));
    }

    public final void q(n nVar) {
        j0.i(nVar, "value");
        k7.g.b("sorting_by", nVar);
    }

    public final void r(o oVar) {
        j0.i(oVar, "value");
        k7.g.b("sorting_order", oVar);
    }
}
