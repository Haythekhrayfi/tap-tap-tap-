package com.inscode.autoclicker.ui.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.base.BaseAdapter;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;
import com.inscode.autoclicker.ui.tutorial.TutorialActivity;
import com.inscode.autoclicker.utils.DuoDrawerLayout2;
import com.jakewharton.processphoenix.ProcessPhoenix;
import d7.g;
import d7.z;
import fd.g0;
import fd.j0;
import id.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.f;
import jc.w;
import kc.j;
import lb.m;
import ma.s;
import oc.h;
import r6.k;
import uc.p;
import vc.l;
import y6.d0;
import y6.o1;
import y6.u2;
import y8.c0;
import z6.r;
import z6.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity extends BaseActivity implements ab.b {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final jc.e appSettings$delegate;
    private final nb.a disposables;
    private DuoDrawerLayout2 drawerLayout;
    private final jc.e manager$delegate;
    private final BaseAdapter<k> modeAdapter;
    private final jc.e permissionValidator$delegate;
    private final jc.e rxEvents$delegate;
    private final jc.e serviceHolder$delegate;
    private final jc.e tutorialPreference$delegate;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.COMBINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$checkIntent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements uc.l<u6.a, w> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(u6.a aVar) {
            invoke2(aVar);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(u6.a aVar) {
            MainActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$checkIntent$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements uc.l<Throwable, w> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            MainActivity mainActivity = MainActivity.this;
            Toast.makeText(mainActivity, mainActivity.getString(R.string.error_load_settings_from_shortcut), 1).show();
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$checkIntent$3, reason: invalid class name */
    public static final class AnonymousClass3 extends l implements uc.l<v6.a, w> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(v6.a aVar) {
            invoke2(aVar);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(v6.a aVar) {
            MainActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$checkIntent$4, reason: invalid class name */
    public static final class AnonymousClass4 extends l implements uc.l<Throwable, w> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            MainActivity mainActivity = MainActivity.this;
            Toast.makeText(mainActivity, mainActivity.getString(R.string.error_load_settings_from_shortcut), 1).show();
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$checkIntent$5, reason: invalid class name */
    public static final class AnonymousClass5 extends l implements uc.l<t6.a, w> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(t6.a aVar) {
            invoke2(aVar);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t6.a aVar) {
            MainActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$checkIntent$6, reason: invalid class name */
    public static final class AnonymousClass6 extends l implements uc.l<Throwable, w> {
        public AnonymousClass6() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            MainActivity mainActivity = MainActivity.this;
            Toast.makeText(mainActivity, mainActivity.getString(R.string.error_load_settings_from_shortcut), 1).show();
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$initBuyButton$2, reason: invalid class name and case insensitive filesystem */
    @oc.e(c = "com.inscode.autoclicker.ui.main.MainActivity$initBuyButton$2", f = "MainActivity.kt", l = {280}, m = "invokeSuspend")
    public static final class C14902 extends h implements p<g0, mc.d<? super w>, Object> {
        public int label;

        public C14902(mc.d<? super C14902> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return MainActivity.this.new C14902(dVar);
        }

        @Override // uc.p
        public final Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return ((C14902) create(g0Var, dVar)).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                h9.d.t(obj);
                u<Boolean> uVar = ma.h.f33410y.a().f33427p.f30214h;
                final MainActivity mainActivity = MainActivity.this;
                id.e<? super Boolean> eVar = new id.e() { // from class: com.inscode.autoclicker.ui.main.MainActivity.initBuyButton.2.1
                    @Override // id.e
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, mc.d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (mc.d<? super w>) dVar);
                    }

                    public final Object emit(boolean z10, mc.d<? super w> dVar) {
                        if (z10) {
                            ((FrameLayout) mainActivity._$_findCachedViewById(R.id.buyContent)).setVisibility(8);
                            ((FrameLayout) mainActivity._$_findCachedViewById(R.id.proContent)).setVisibility(0);
                        } else {
                            ((FrameLayout) mainActivity._$_findCachedViewById(R.id.buyContent)).setVisibility(0);
                            ((FrameLayout) mainActivity._$_findCachedViewById(R.id.proContent)).setVisibility(8);
                        }
                        ((FrameLayout) mainActivity._$_findCachedViewById(R.id.pendingContent)).setVisibility(8);
                        return w.f31842a;
                    }
                };
                this.label = 1;
                if (uVar.a(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$observeEvents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14911 extends l implements uc.l<q6.a, Boolean> {
        public static final C14911 INSTANCE = new C14911();

        public C14911() {
            super(1);
        }

        @Override // uc.l
        public final Boolean invoke(q6.a aVar) {
            j0.i(aVar, "it");
            return Boolean.valueOf((aVar instanceof OnServiceTurnedOffEvent) || (aVar instanceof TurnOffService));
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$observeEvents$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14922 extends l implements uc.l<Throwable, w> {
        public static final C14922 INSTANCE = new C14922();

        public C14922() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            j0.i(th, "it");
            xe.a.f37601c.d(th, "listenToGlobalEvents", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.MainActivity$observeEvents$3, reason: invalid class name and case insensitive filesystem */
    public static final class C14933 extends l implements uc.l<q6.a, w> {
        public C14933() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(q6.a aVar) {
            invoke2(aVar);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(q6.a aVar) {
            xe.a.f37601c.a("[MAIN] Stopping widget service (global).", new Object[0]);
            MainActivity.this.stopWidgetService();
            ((Switch) MainActivity.this._$_findCachedViewById(R.id.stateSwitch)).setChecked(MainActivity.this.getServiceHolder().f38398b != k.NONE);
        }
    }

    public MainActivity() {
        ae.b bVar = ae.b.f348c;
        this.tutorialPreference$delegate = f.b(new MainActivity$special$$inlined$inject$default$1(this, "", null, bVar));
        this.permissionValidator$delegate = f.b(new MainActivity$special$$inlined$inject$default$2(this, "", null, bVar));
        this.serviceHolder$delegate = f.b(new MainActivity$special$$inlined$inject$default$3(this, "", null, bVar));
        this.appSettings$delegate = f.b(new MainActivity$special$$inlined$inject$default$4(this, "", null, bVar));
        this.rxEvents$delegate = f.b(new MainActivity$special$$inlined$inject$default$5(this, "", null, bVar));
        this.disposables = new nb.a();
        this.manager$delegate = f.b(new MainActivity$manager$2(this));
        this.modeAdapter = new BaseAdapter.Builder().layoutId(R.layout.item_mode).onBind(new MainActivity$modeAdapter$1(this)).onItemClick(new MainActivity$modeAdapter$2(this)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindModeItem(View view, k kVar) {
        int i10;
        int i11;
        TextView textView = (TextView) view.findViewById(R.id.itemModeName);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i12 = iArr[kVar.ordinal()];
        if (i12 != 1) {
            i10 = i12 != 3 ? R.string.record_mode : R.string.combine_recordings;
        } else {
            i10 = R.string.manual_target;
        }
        textView.setText(getString(i10));
        TextView textView2 = (TextView) view.findViewById(R.id.itemModeDescription);
        int i13 = iArr[kVar.ordinal()];
        if (i13 != 1) {
            i11 = i13 != 3 ? R.string.record_mode_desc : R.string.combine_recordings_desc;
        } else {
            i11 = R.string.manual_target_desc;
        }
        textView2.setText(getString(i11));
        int paddingBottom = view.getPaddingBottom();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingLeft = view.getPaddingLeft();
        if (getServiceHolder().f38398b == kVar) {
            ((LinearLayout) view.findViewById(R.id.itemModeContainer)).setBackgroundResource(R.drawable.selected_background);
            ((ImageView) view.findViewById(R.id.itemModeDot)).setVisibility(0);
        } else {
            ((LinearLayout) view.findViewById(R.id.itemModeContainer)).setBackgroundResource(0);
            ((ImageView) view.findViewById(R.id.itemModeDot)).setVisibility(4);
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    private final void checkIntent(Intent intent) {
        k kVar;
        String stringExtra;
        m<u6.a> mVarI;
        z zVar;
        z zVar2;
        if (intent == null) {
            intent = getIntent();
        }
        int intExtra = intent.getIntExtra("mode", -1);
        if (intExtra != -1) {
            if (intExtra != 1) {
                kVar = intExtra != 2 ? k.COMBINE : k.RECORD;
            } else {
                kVar = k.MANUAL;
            }
            if (!getPermissionValidator().a(this) || (stringExtra = intent.getStringExtra(FacebookMediationAdapter.KEY_ID)) == null) {
                return;
            }
            onModeItemClick(kVar, false);
            int i10 = WhenMappings.$EnumSwitchMapping$0[kVar.ordinal()];
            if (i10 == 1) {
                mVarI = checkIntent$lambda$0(f.b(new MainActivity$checkIntent$$inlined$inject$default$1(this, "", null, ae.b.f348c))).b(stringExtra).n(fc.a.f29534b).i(mb.a.a());
                zVar = new z(new AnonymousClass1(), 8);
                zVar2 = new z(new AnonymousClass2(), 9);
            } else if (i10 != 2) {
                mVarI = checkIntent$lambda$6(f.b(new MainActivity$checkIntent$$inlined$inject$default$3(this, "", null, ae.b.f348c))).b(stringExtra).n(fc.a.f29534b).i(mb.a.a());
                zVar = new z(new AnonymousClass5(), 12);
                zVar2 = new z(new AnonymousClass6(), 13);
            } else {
                mVarI = checkIntent$lambda$3(f.b(new MainActivity$checkIntent$$inlined$inject$default$2(this, "", null, ae.b.f348c))).b(stringExtra).n(fc.a.f29534b).i(mb.a.a());
                zVar = new z(new AnonymousClass3(), 10);
                zVar2 = new z(new AnonymousClass4(), 11);
            }
            mVarI.l(zVar, zVar2);
        }
    }

    public static /* synthetic */ void checkIntent$default(MainActivity mainActivity, Intent intent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intent = null;
        }
        mainActivity.checkIntent(intent);
    }

    private static final a7.a checkIntent$lambda$0(jc.e<a7.a> eVar) {
        return eVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIntent$lambda$1(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIntent$lambda$2(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private static final g checkIntent$lambda$3(jc.e<g> eVar) {
        return eVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIntent$lambda$4(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIntent$lambda$5(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private static final r checkIntent$lambda$6(jc.e<r> eVar) {
        return eVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIntent$lambda$7(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIntent$lambda$8(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void checkTutorial() {
        if (((Boolean) k7.g.a(getTutorialPreference().f31300a, Boolean.FALSE)).booleanValue()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) TutorialActivity.class));
    }

    private final r6.e getAppSettings() {
        return (r6.e) this.appSettings$delegate.getValue();
    }

    private final ReviewManager getManager() {
        return (ReviewManager) this.manager$delegate.getValue();
    }

    private final i7.d getPermissionValidator() {
        return (i7.d) this.permissionValidator$delegate.getValue();
    }

    private final q6.b getRxEvents() {
        return (q6.b) this.rxEvents$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u2 getServiceHolder() {
        return (u2) this.serviceHolder$delegate.getValue();
    }

    private final i7.f getTutorialPreference() {
        return (i7.f) this.tutorialPreference$delegate.getValue();
    }

    private final void initBuyButton() {
        ((FrameLayout) _$_findCachedViewById(R.id.buyContent)).setOnClickListener(new a(this, 0));
        c0.z(i.l(this), null, null, new C14902(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBuyButton$lambda$16(MainActivity mainActivity, View view) {
        j0.i(mainActivity, "this$0");
        String str = (2 & 2) != 0 ? "" : null;
        j0.i(mainActivity, "activity");
        j0.i(str, "source");
        j0.i(mainActivity, "activity");
        j0.i(str, "source");
        ma.h.f33410y.a();
        j0.i(mainActivity, "activity");
        j0.i(str, "source");
        ab.c.f275h.a(mainActivity, str, -1);
    }

    private final void initDrawer() {
        View viewFindViewById = findViewById(R.id.drawer);
        j0.g(viewFindViewById, "null cannot be cast to non-null type com.inscode.autoclicker.utils.DuoDrawerLayout2");
        DuoDrawerLayout2 duoDrawerLayout2 = (DuoDrawerLayout2) viewFindViewById;
        this.drawerLayout = duoDrawerLayout2;
        View menuView = duoDrawerLayout2.getMenuView();
        if (menuView != null) {
            menuView.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        ((ImageView) _$_findCachedViewById(R.id.navButton)).setOnClickListener(new a(this, 2));
        ((ImageView) _$_findCachedViewById(R.id.menuBackButton)).setOnClickListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public static final void initDrawer$lambda$10(MainActivity mainActivity, View view) {
        boolean z10;
        j0.i(mainActivity, "this$0");
        DuoDrawerLayout2 duoDrawerLayout2 = mainActivity.drawerLayout;
        if (duoDrawerLayout2 != null) {
            z10 = (duoDrawerLayout2.f13400k > 1.0f ? 1 : (duoDrawerLayout2.f13400k == 1.0f ? 0 : -1)) == 0;
        }
        if (!z10 || duoDrawerLayout2 == null) {
            return;
        }
        duoDrawerLayout2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDrawer$lambda$9(MainActivity mainActivity, View view) {
        j0.i(mainActivity, "this$0");
        DuoDrawerLayout2 duoDrawerLayout2 = mainActivity.drawerLayout;
        if (duoDrawerLayout2 != null) {
            duoDrawerLayout2.d();
        }
    }

    private final void initModes() {
        ((RecyclerView) _$_findCachedViewById(R.id.mainModeList)).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) _$_findCachedViewById(R.id.mainModeList)).setAdapter(this.modeAdapter);
        ((RecyclerView) _$_findCachedViewById(R.id.mainModeList)).setNestedScrollingEnabled(false);
        Objects.requireNonNull(getServiceHolder());
        k[] kVarArrValues = k.values();
        BaseAdapter<k> baseAdapter = this.modeAdapter;
        List listB = j.B(kVarArrValues);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (!(((k) obj) == k.NONE)) {
                arrayList.add(obj);
            }
        }
        baseAdapter.setAll(arrayList);
    }

    private final void initPushNotifications() {
        FirebaseMessaging.c().f12601k.onSuccessTask(new d0.a("other"));
    }

    private final void initRateApp() {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this) == 0) {
                try {
                    jb.a aVarE = jb.a.e(this);
                    aVarE.f31796c = 0;
                    aVarE.f31797d = 4;
                    aVarE.f31798e = 2;
                    aVarE.f31795b.f31803a = true;
                    aVarE.c();
                    jb.a.a(new b(this, 0));
                } catch (Exception unused) {
                    jb.a.e(this).d(this);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRateApp$lambda$15(MainActivity mainActivity) {
        j0.i(mainActivity, "this$0");
        try {
            xe.a.f37601c.a("[Rate] Conditions meet, launching flow.", new Object[0]);
            Task<ReviewInfo> taskRequestReviewFlow = mainActivity.getManager().requestReviewFlow();
            j0.h(taskRequestReviewFlow, "manager.requestReviewFlow()");
            taskRequestReviewFlow.addOnCompleteListener(new b(mainActivity, 1));
        } catch (Exception unused) {
            jb.a.e(mainActivity).d(mainActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRateApp$lambda$15$lambda$14(MainActivity mainActivity, Task task) {
        j0.i(mainActivity, "this$0");
        j0.i(task, "request");
        try {
            if (task.isSuccessful()) {
                Object result = task.getResult();
                j0.h(result, "request.result");
                xe.a.f37601c.a("[Rate] Launching review flow.", new Object[0]);
                j0.h(mainActivity.getManager().launchReviewFlow(mainActivity, (ReviewInfo) result), "manager.launchReviewFlow(this, reviewInfo)");
                jb.g.a(jb.a.e(mainActivity).f31794a, false);
            }
        } catch (Exception unused) {
        }
    }

    private final void initRestartApp() {
        ((TextView) _$_findCachedViewById(R.id.buttonRestartApp)).setOnClickListener(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRestartApp$lambda$13(MainActivity mainActivity, View view) {
        j0.i(mainActivity, "this$0");
        new AlertDialog.Builder(mainActivity).setMessage(mainActivity.getString(R.string.restart_app_confirmation)).setPositiveButton(mainActivity.getString(android.R.string.ok), new z6.a(mainActivity)).setNegativeButton(mainActivity.getString(android.R.string.cancel), e.f13387e).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRestartApp$lambda$13$lambda$11(MainActivity mainActivity, DialogInterface dialogInterface, int i10) {
        j0.i(mainActivity, "this$0");
        xe.a.f37601c.a("[APP] Restarting app.", new Object[0]);
        ProcessPhoenix.a(mainActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRestartApp$lambda$13$lambda$12(DialogInterface dialogInterface, int i10) {
    }

    private final void initSettings() {
        ((TextView) _$_findCachedViewById(R.id.buttonSettings)).setOnClickListener(new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSettings$lambda$19(MainActivity mainActivity, View view) {
        j0.i(mainActivity, "this$0");
        DuoDrawerLayout2 duoDrawerLayout2 = mainActivity.drawerLayout;
        if (duoDrawerLayout2 != null) {
            duoDrawerLayout2.b();
        }
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SettingsActivity.class));
    }

    private final void initStateButton() {
        int i10 = 1;
        ((Switch) _$_findCachedViewById(R.id.stateSwitch)).setChecked(getServiceHolder().f38398b != k.NONE);
        ((Switch) _$_findCachedViewById(R.id.stateSwitch)).setOnClickListener(new a(this, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStateButton$lambda$20(MainActivity mainActivity, View view) {
        j0.i(mainActivity, "this$0");
        try {
            boolean z10 = mainActivity.getServiceHolder().f38398b == k.NONE;
            if (z10) {
                startWidgetService$default(mainActivity, null, 1, null);
            } else {
                mainActivity.stopWidgetService();
            }
            ((Switch) mainActivity._$_findCachedViewById(R.id.stateSwitch)).setChecked(z10);
        } catch (Exception e10) {
            xe.a.f37601c.d(e10, "[MAIN]: State error", new Object[0]);
        }
    }

    private final void initTutorial() {
        ((TextView) _$_findCachedViewById(R.id.buttonTutorial)).setOnClickListener(new a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTutorial$lambda$17(MainActivity mainActivity, View view) {
        j0.i(mainActivity, "this$0");
        DuoDrawerLayout2 duoDrawerLayout2 = mainActivity.drawerLayout;
        if (duoDrawerLayout2 != null) {
            duoDrawerLayout2.b();
        }
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) TutorialActivity.class));
    }

    private final void observeEvents() {
        nb.b bVarE = ec.a.e(getRxEvents().f34787g.u(fc.a.f29534b).p(mb.a.a()).j(new y0(C14911.INSTANCE, 28)), C14922.INSTANCE, null, new C14933(), 2);
        p6.b.a(bVarE, "$receiver", this.disposables, "compositeDisposable", bVarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeEvents$lambda$18(uc.l lVar, Object obj) {
        j0.i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    private final void onModeItemClick(k kVar, boolean z10) {
        Class<CombinedRecordingsActivity> cls = CombinedRecordingsActivity.class;
        if (kVar == getServiceHolder().f38398b) {
            if (getAppSettings().f()) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[getServiceHolder().f38398b.ordinal()];
                if (i10 == 1) {
                    cls = WidgetManualSettingsActivity.class;
                } else if (i10 == 2) {
                    cls = WidgetRecordSettingsActivity.class;
                } else if (i10 != 3) {
                    cls = null;
                }
                if (cls != null) {
                    startActivity(new Intent(this, cls));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbA = defpackage.a.a("Widget service states: ");
        o1.a aVar = o1.f38296s;
        Objects.requireNonNull(aVar);
        sbA.append(o1.f38297t);
        sbA.append(' ');
        d0.a aVar2 = d0.f38116t;
        Objects.requireNonNull(aVar2);
        sbA.append(d0.f38117u);
        sbA.append(' ');
        y6.j.a aVar3 = y6.j.f38212r;
        Objects.requireNonNull(aVar3);
        sbA.append(y6.j.f38213s);
        xe.a.c cVar = xe.a.f37601c;
        cVar.a(sbA.toString(), new Object[0]);
        Objects.requireNonNull(aVar);
        if (o1.f38297t != 1) {
            Objects.requireNonNull(aVar);
            if (o1.f38297t != 2) {
                Objects.requireNonNull(aVar2);
                if (d0.f38117u != 2) {
                    Objects.requireNonNull(aVar3);
                    if (y6.j.f38213s == 2) {
                        return;
                    }
                    stopWidgetService();
                    this.modeAdapter.notifyDataSetChanged();
                    startWidgetService(kVar);
                    if (getServiceHolder().f38398b != k.NONE) {
                        ((Switch) _$_findCachedViewById(R.id.stateSwitch)).setChecked(true);
                        j0.i(this, "appCompatActivity");
                        cVar.a("onHappyMoment: Activity=%s", getClass().getSimpleName());
                        j0.i(this, "activity");
                        ma.h hVarA = ma.h.f33410y.a();
                        j0.i(this, "activity");
                        hVarA.f33423l.f269h = true;
                        c0.z(i.l(this), null, null, new s(500, hVarA, this, -1, null, null), 3, null);
                        if (getAppSettings().f() && z10) {
                            int i11 = WhenMappings.$EnumSwitchMapping$0[getServiceHolder().f38398b.ordinal()];
                            if (i11 == 2) {
                                cls = WidgetRecordSettingsActivity.class;
                            } else if (i11 != 3) {
                                cls = WidgetManualSettingsActivity.class;
                            }
                            startActivity(new Intent(this, cls));
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void onModeItemClick$default(MainActivity mainActivity, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        mainActivity.onModeItemClick(kVar, z10);
    }

    private final void startWidgetService(k kVar) {
        try {
            getServiceHolder().c(kVar);
            this.modeAdapter.notifyDataSetChanged();
        } catch (Exception e10) {
            StringBuilder sbA = defpackage.a.a("[SERVICE_ERROR]: Starting service: ");
            sbA.append(getServiceHolder().f38398b);
            sbA.append("...");
            xe.a.f37601c.d(e10, sbA.toString(), new Object[0]);
        }
    }

    public static /* synthetic */ void startWidgetService$default(MainActivity mainActivity, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = k.RECORD;
        }
        mainActivity.startWidgetService(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopWidgetService() {
        try {
            getServiceHolder().d();
            this.modeAdapter.notifyDataSetChanged();
        } catch (Exception e10) {
            xe.a.f37601c.a(d0.b.a(e10, d0.c.a("[ERROR] Stopping widget service error: ", e10, ' ')), new Object[0]);
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_main;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initStateButton();
        initSettings();
        initTutorial();
        initModes();
        initRateApp();
        initRestartApp();
        initPushNotifications();
        initDrawer();
        observeEvents();
        checkTutorial();
        checkIntent$default(this, null, 1, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.disposables.d();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        checkIntent(intent);
    }

    @Override // ab.b
    public void onRelaunchComplete(ab.w wVar) {
        j0.i(wVar, "result");
        if (getPermissionValidator().a(this)) {
            return;
        }
        finish();
        startActivity(new Intent(this, (Class<?>) PrepareActivity.class));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onStart() {
        super.onStart();
        initBuyButton();
    }
}
