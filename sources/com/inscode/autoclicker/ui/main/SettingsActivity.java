package com.inscode.autoclicker.ui.main;

import android.accessibilityservice.AccessibilityService;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.service.AdbActivity;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import jc.f;
import jc.w;
import k7.g;
import r6.h;
import r6.i;
import r6.l;
import r6.m;
import y6.v1;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsActivity extends BaseActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final jc.e appSettings$delegate;
    private final nb.a disposables;
    private final jc.e rxEvents$delegate;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.ONE_TO_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.main.SettingsActivity$observeEvents$1, reason: invalid class name */
    public static final class AnonymousClass1 extends vc.l implements uc.l<q6.a, w> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(q6.a aVar) {
            invoke2(aVar);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(q6.a aVar) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            j0.h(aVar, "it");
            settingsActivity.handleGlobalEvent(aVar);
        }
    }

    public SettingsActivity() {
        ae.b bVar = ae.b.f348c;
        this.appSettings$delegate = f.b(new SettingsActivity$special$$inlined$inject$default$1(this, "", null, bVar));
        this.rxEvents$delegate = f.b(new SettingsActivity$special$$inlined$inject$default$2(this, "", null, bVar));
        this.disposables = new nb.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r6.e getAppSettings() {
        return (r6.e) this.appSettings$delegate.getValue();
    }

    private final q6.b getRxEvents() {
        return (q6.b) this.rxEvents$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGlobalEvent(q6.a aVar) {
        if ((aVar instanceof h) || (aVar instanceof i)) {
            updateUi();
        }
    }

    private final void initBackgroundServiceSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsBackgroundServiceSwitch)).setOnClickListener(new c(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBackgroundServiceSwitch$lambda$4(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().a();
        Objects.requireNonNull(appSettings);
        g.b("background_service", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsBackgroundServiceSwitch)).setChecked(settingsActivity.getAppSettings().a());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    private final void initExperimentalState() {
        boolean z10;
        boolean z11;
        Switch r10 = (Switch) _$_findCachedViewById(R.id.experimentalSwitch);
        if (getAppSettings().b()) {
            y6.a aVar = y6.a.f38093c;
            try {
                AccessibilityService.class.getDeclaredField("mConnectionId");
                z11 = true;
            } catch (Exception unused) {
                z11 = false;
            }
            z10 = z11;
        }
        r10.setChecked(z10);
        ((Switch) _$_findCachedViewById(R.id.experimentalSwitch)).setOnClickListener(new c(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExperimentalState$lambda$7(SettingsActivity settingsActivity, View view) {
        boolean z10;
        j0.i(settingsActivity, "this$0");
        y6.a aVar = y6.a.f38093c;
        try {
            AccessibilityService.class.getDeclaredField("mConnectionId");
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        }
        if (!z10) {
            new AlertDialog.Builder(settingsActivity).setMessage(settingsActivity.getString(R.string.adb_config_message)).setPositiveButton(settingsActivity.getString(R.string.adb_config), new z6.a(settingsActivity)).setNegativeButton(settingsActivity.getString(android.R.string.cancel), v1.f38408h).create().show();
            ((Switch) settingsActivity._$_findCachedViewById(R.id.experimentalSwitch)).setChecked(false);
            return;
        }
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean zB = true ^ settingsActivity.getAppSettings().b();
        Objects.requireNonNull(appSettings);
        g.b("experimental_mode", Boolean.valueOf(zB));
        appSettings.f35179a.d(new r6.g(zB));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.experimentalSwitch)).setChecked(settingsActivity.getAppSettings().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExperimentalState$lambda$7$lambda$5(SettingsActivity settingsActivity, DialogInterface dialogInterface, int i10) {
        j0.i(settingsActivity, "this$0");
        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) AdbActivity.class));
    }

    private final void initMainThreadSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsMainThreadSwitch)).setOnClickListener(new c(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainThreadSwitch$lambda$12(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().n();
        Objects.requireNonNull(appSettings);
        g.b("use_main_thread", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsMainThreadSwitch)).setChecked(settingsActivity.getAppSettings().n());
    }

    private final void initModeSettingsOpen() {
        ((Switch) _$_findCachedViewById(R.id.settingsOpenModeSettingsSwitch)).setOnClickListener(new c(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModeSettingsOpen$lambda$9(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().f();
        Objects.requireNonNull(appSettings);
        g.b("open_mode_settings_on_select", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsOpenModeSettingsSwitch)).setChecked(settingsActivity.getAppSettings().f());
    }

    private final void initNotifyWhenFinishedSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsNotifyWhenFinishedSwitch)).setOnClickListener(new c(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyWhenFinishedSwitch$lambda$3(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().e();
        Objects.requireNonNull(appSettings);
        g.b("notify_when_finished", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsNotifyWhenFinishedSwitch)).setChecked(settingsActivity.getAppSettings().e());
    }

    private final void initPlaybackEngine() {
    }

    private final void initRecordingLabel() {
        ((Switch) _$_findCachedViewById(R.id.settingsLayoutCombineLabelSwitch)).setOnClickListener(new c(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecordingLabel$lambda$8(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().h();
        Objects.requireNonNull(appSettings);
        g.b("recording_label_in_combine", Boolean.valueOf(z10));
        appSettings.f35179a.d(new m(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsLayoutCombineLabelSwitch)).setChecked(settingsActivity.getAppSettings().h());
    }

    private final void initRecordingPopupSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsRecordingPopupSwitch)).setOnClickListener(new c(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecordingPopupSwitch$lambda$11(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().i();
        Objects.requireNonNull(appSettings);
        g.b("recording_popup", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsRecordingPopupSwitch)).setChecked(settingsActivity.getAppSettings().i());
    }

    private final void initTimeLeftSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsLayoutTimeLeftSwitch)).setOnClickListener(new c(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTimeLeftSwitch$lambda$1(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().l();
        Objects.requireNonNull(appSettings);
        g.b("time_left", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsLayoutTimeLeftSwitch)).setChecked(settingsActivity.getAppSettings().l());
    }

    private final void initTurnOffWhenScreenOffSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsTurnOffWhenScreenOffSwitch)).setOnClickListener(new c(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTurnOffWhenScreenOffSwitch$lambda$2(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().m();
        Objects.requireNonNull(appSettings);
        g.b("turn_off_on_screen_off", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsTurnOffWhenScreenOffSwitch)).setChecked(settingsActivity.getAppSettings().m());
    }

    private final void initVolumeUpSwitch() {
        ((Switch) _$_findCachedViewById(R.id.settingsVolumeUpSwitch)).setOnClickListener(new c(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVolumeUpSwitch$lambda$10(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        r6.e appSettings = settingsActivity.getAppSettings();
        boolean z10 = !settingsActivity.getAppSettings().o();
        Objects.requireNonNull(appSettings);
        g.b("volume_up_to_hide", Boolean.valueOf(z10));
        ((Switch) settingsActivity._$_findCachedViewById(R.id.settingsVolumeUpSwitch)).setChecked(settingsActivity.getAppSettings().o());
    }

    private final void observeEvents() {
        nb.b bVarE = ec.a.e(getRxEvents().f34787g.u(fc.a.f29534b).p(mb.a.a()), null, null, new AnonymousClass1(), 3);
        p6.b.a(bVarE, "$receiver", this.disposables, "compositeDisposable", bVarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        String string = settingsActivity.getString(R.string.ph_support_email);
        j0.h(string, "getString(R.string.ph_support_email)");
        String string2 = settingsActivity.getString(R.string.ph_support_email_vip);
        j0.h(string2, "getString(R.string.ph_support_email_vip)");
        bb.b bVarA = new bb.b.a(string, string2).a();
        ma.g.b();
        PHSettingsActivity.Companion.a(settingsActivity, bVarA, MoreSettingsActivity.class);
    }

    private final void updateUi() {
        int i10;
        ((ImageView) _$_findCachedViewById(R.id.backButton)).setOnClickListener(new c(this, 1));
        ((TextView) _$_findCachedViewById(R.id.settingsLayoutOrientationValue)).setText(getString(getAppSettings().c() == 1 ? R.string.horizontal : R.string.vertical));
        ((LinearLayout) _$_findCachedViewById(R.id.settingsLayoutOrientationContainer)).setOnClickListener(new c(this, 2));
        TextView textView = (TextView) _$_findCachedViewById(R.id.settingsLayoutSizeValue);
        double d10 = getAppSettings().d();
        if (d10 == 1.0d) {
            i10 = R.string.normal;
        } else {
            if (d10 == 0.75d) {
                i10 = R.string.small;
            } else {
                i10 = d10 == 1.25d ? R.string.medium : R.string.large;
            }
        }
        textView.setText(getString(i10));
        ((TextView) _$_findCachedViewById(R.id.settingsPlaybackEngineValue)).setText(getString(WhenMappings.$EnumSwitchMapping$0[getAppSettings().g().ordinal()] == 1 ? R.string.one_to_one : R.string.natural));
        ((LinearLayout) _$_findCachedViewById(R.id.settingsPlaybackEngineContainer)).setOnClickListener(new c(this, 3));
        ((LinearLayout) _$_findCachedViewById(R.id.settingsLayoutSizeContainer)).setOnClickListener(new c(this, 4));
        ((Switch) _$_findCachedViewById(R.id.settingsBackgroundServiceSwitch)).setChecked(getAppSettings().a());
        ((Switch) _$_findCachedViewById(R.id.settingsTurnOffWhenScreenOffSwitch)).setChecked(getAppSettings().m());
        ((Switch) _$_findCachedViewById(R.id.settingsLayoutCombineLabelSwitch)).setChecked(getAppSettings().h());
        ((Switch) _$_findCachedViewById(R.id.settingsOpenModeSettingsSwitch)).setChecked(getAppSettings().f());
        ((Switch) _$_findCachedViewById(R.id.settingsVolumeUpSwitch)).setChecked(getAppSettings().o());
        ((Switch) _$_findCachedViewById(R.id.settingsRecordingPopupSwitch)).setChecked(getAppSettings().i());
        ((Switch) _$_findCachedViewById(R.id.settingsMainThreadSwitch)).setChecked(getAppSettings().n());
        ((Switch) _$_findCachedViewById(R.id.settingsNotifyWhenFinishedSwitch)).setChecked(getAppSettings().e());
        ((Switch) _$_findCachedViewById(R.id.settingsLayoutTimeLeftSwitch)).setChecked(getAppSettings().l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$13(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        settingsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$14(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        SettingsDialogs.Companion.showOrientationDialog(settingsActivity, settingsActivity.getAppSettings().c(), new SettingsActivity$updateUi$2$1(settingsActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$15(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        SettingsDialogs.Companion.showPlaybackEngineDialog(settingsActivity, settingsActivity.getAppSettings().g(), new SettingsActivity$updateUi$3$1(settingsActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$16(SettingsActivity settingsActivity, View view) {
        j0.i(settingsActivity, "this$0");
        SettingsDialogs.Companion.showLayoutSizeDialog(settingsActivity, settingsActivity.getAppSettings().d(), new SettingsActivity$updateUi$4$1(settingsActivity));
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
        return R.layout.activity_main_settings;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        updateUi();
        initRecordingLabel();
        initExperimentalState();
        initModeSettingsOpen();
        initVolumeUpSwitch();
        initRecordingPopupSwitch();
        initMainThreadSwitch();
        initBackgroundServiceSwitch();
        initTurnOffWhenScreenOffSwitch();
        initNotifyWhenFinishedSwitch();
        initTimeLeftSwitch();
        initPlaybackEngine();
        observeEvents();
        ((LinearLayout) _$_findCachedViewById(R.id.moreSettingsContainer)).setOnClickListener(new c(this, 9));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.disposables.d();
    }
}
