package com.inscode.autoclicker.ui.prepare;

import a3.i;
import a3.j;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.developer.filepicker.model.DialogProperties;
import com.developer.filepicker.view.FilePickerDialog;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.base.BaseAdapter;
import com.inscode.autoclicker.service.ClickService;
import com.inscode.autoclicker.ui.main.MainActivity;
import d0.b;
import d0.c;
import fd.j0;
import g3.k;
import i7.d;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import jc.e;
import jc.f;
import jc.w;
import ma.h;
import uc.a;
import vc.g;
import vc.l;
import y6.h0;
import y6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class PrepareActivity extends BaseActivity {
    public static final Companion Companion = new Companion(null);
    private static boolean STARTED_BY_USER;
    private final String EXTRA_FRAGMENT_ARG_KEY;
    private final String EXTRA_SHOW_FRAGMENT_ARGUMENTS;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private boolean accessibilitySettingsOpened;
    private final BaseAdapter<PrepareScreen> adapter;
    private final e appSettings$delegate;
    private final e importerExporter$delegate;
    private final e permissionValidator$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final boolean getSTARTED_BY_USER() {
            return PrepareActivity.STARTED_BY_USER;
        }

        public final void setSTARTED_BY_USER(boolean z10) {
            PrepareActivity.STARTED_BY_USER = z10;
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.ui.prepare.PrepareActivity$askForAccessibilityService$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements a<w> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                Bundle bundle = new Bundle();
                String str = PrepareActivity.this.getPackageName() + '/' + ClickService.class.getName();
                bundle.putString(PrepareActivity.this.getEXTRA_FRAGMENT_ARG_KEY(), str);
                intent.putExtra(PrepareActivity.this.getEXTRA_FRAGMENT_ARG_KEY(), str);
                intent.putExtra(PrepareActivity.this.getEXTRA_SHOW_FRAGMENT_ARGUMENTS(), bundle);
                h.f33410y.a().j();
                PrepareActivity.this.startActivity(intent);
                PrepareActivity.this.accessibilitySettingsOpened = true;
            } catch (Exception e10) {
                xe.a.f37601c.b(b.a(e10, c.a("[Prepare] Can't open accessibility services settings: ", e10, ' ')), new Object[0]);
                u1.a.s(PrepareActivity.this, R.string.error_open_battery_optimisation, 0, 2);
            }
        }
    }

    public PrepareActivity() {
        ae.b bVar = ae.b.f348c;
        this.permissionValidator$delegate = f.b(new PrepareActivity$special$$inlined$inject$default$1(this, "", null, bVar));
        this.importerExporter$delegate = f.b(new PrepareActivity$special$$inlined$inject$default$2(this, "", null, bVar));
        this.appSettings$delegate = f.b(new PrepareActivity$special$$inlined$inject$default$3(this, "", null, bVar));
        this.adapter = new BaseAdapter.Builder().layoutId(R.layout.item_prepare_screen).onBind(new PrepareActivity$adapter$1(this)).build();
        this.EXTRA_FRAGMENT_ARG_KEY = ":settings:fragment_args_key";
        this.EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":settings:show_fragment_args";
    }

    private final void askForAccessibilityService() {
        showAccessibilityConsent(new AnonymousClass1());
    }

    private final void askForNotifications() {
        int iA = e0.a.a(this, "android.permission.POST_NOTIFICATIONS");
        getPermissionValidator().f31302b.edit().putBoolean("notifications_asked_settin", true).apply();
        if (iA == -1) {
            androidx.core.app.a.b(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
        prepareState();
    }

    @TargetApi(23)
    private final void batteryOptimizationIntent() {
        getPermissionValidator().b(true);
        try {
            try {
                Intent intent = new Intent();
                intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                h.f33410y.a().j();
                startActivity(intent);
            } catch (Exception e10) {
                xe.a.f37601c.b("[Prepare] Can't open battery optimization settings: " + e10 + ' ' + e10.getMessage(), new Object[0]);
            }
        } finally {
            getPermissionValidator().b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindScreen(View view, PrepareScreen prepareScreen) {
        PackageInfo packageInfo;
        YoYo.with(Techniques.Pulse).repeat(-1).pivot(((TextView) view.findViewById(R.id.itemPrepareNumber)).getLayoutParams().width / 2.0f, ((TextView) view.findViewById(R.id.itemPrepareNumber)).getLayoutParams().height / 2.0f).playOn((TextView) view.findViewById(R.id.itemPrepareNumber));
        ((ConstraintLayout) view.findViewById(R.id.itemPrepareContainer)).setBackgroundColor(prepareScreen.getBackground());
        if (prepareScreen.getImage() != null) {
            ((ImageView) view.findViewById(R.id.itemPrepareImage)).setVisibility(0);
            j jVarD = a3.c.d(this);
            Integer image = prepareScreen.getImage();
            Objects.requireNonNull(jVarD);
            i iVar = new i(jVarD.f59a, jVarD, Drawable.class, jVarD.f60b);
            iVar.H = image;
            iVar.J = true;
            Context context = iVar.C;
            ConcurrentMap<String, d3.c> concurrentMap = a4.a.f74a;
            String packageName = context.getPackageName();
            d3.c cVar = (d3.c) ((ConcurrentHashMap) a4.a.f74a).get(packageName);
            if (cVar == null) {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e10) {
                    StringBuilder sbA = defpackage.a.a("Cannot resolve info for");
                    sbA.append(context.getPackageName());
                    Log.e("AppVersionSignature", sbA.toString(), e10);
                    packageInfo = null;
                }
                cVar = new a4.c(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                d3.c cVar2 = (d3.c) ((ConcurrentHashMap) a4.a.f74a).putIfAbsent(packageName, cVar);
                if (cVar2 != null) {
                    cVar = cVar2;
                }
            }
            iVar.b(new x3.e().m(cVar)).e(k.f29859a).u((ImageView) view.findViewById(R.id.itemPrepareImage));
        } else {
            ((ImageView) view.findViewById(R.id.itemPrepareImage)).setVisibility(4);
        }
        ((TextView) view.findViewById(R.id.itemPrepareNumber)).setText(prepareScreen.getNumber().toString());
        ((TextView) view.findViewById(R.id.itemPrepareText)).setText(prepareScreen.getTitle());
        ((TextView) view.findViewById(R.id.itemDescriptionText)).setText(prepareScreen.getDescription());
        ((TextView) view.findViewById(R.id.itemPrepareNumber)).setOnClickListener(new com.inscode.autoclicker.base.a(this, prepareScreen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindScreen$lambda$0(PrepareActivity prepareActivity, PrepareScreen prepareScreen, View view) {
        j0.i(prepareActivity, "this$0");
        j0.i(prepareScreen, "$item");
        prepareActivity.handleItemClick(prepareScreen);
    }

    private final r6.e getAppSettings() {
        return (r6.e) this.appSettings$delegate.getValue();
    }

    private final s getImporterExporter() {
        return (s) this.importerExporter$delegate.getValue();
    }

    private final d getPermissionValidator() {
        return (d) this.permissionValidator$delegate.getValue();
    }

    private final void handleItemClick(PrepareScreen prepareScreen) {
        int id2 = prepareScreen.getId();
        if (id2 == 1) {
            askForAccessibilityService();
        } else if (id2 == 2) {
            batteryOptimizationIntent();
        } else {
            if (id2 != 3) {
                return;
            }
            askForNotifications();
        }
    }

    private final void prepareBackup() {
        ((TextView) _$_findCachedViewById(R.id.rebootDeviceBackupButton)).setOnClickListener(new y6.d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareBackup$lambda$3(PrepareActivity prepareActivity, View view) {
        j0.i(prepareActivity, "this$0");
        s importerExporter = prepareActivity.getImporterExporter();
        Objects.requireNonNull(importerExporter);
        j0.i(prepareActivity, "activity");
        new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        DialogProperties dialogProperties = new DialogProperties();
        dialogProperties.selection_mode = 0;
        dialogProperties.selection_type = 1;
        dialogProperties.root = new File(absolutePath);
        dialogProperties.offset = new File(absolutePath);
        dialogProperties.extensions = null;
        FilePickerDialog filePickerDialog = new FilePickerDialog(prepareActivity, dialogProperties);
        filePickerDialog.setTitle(prepareActivity.getString(R.string.select_folder));
        filePickerDialog.setDialogSelectionListener(new com.applovin.exoplayer2.a.e(importerExporter, prepareActivity));
        filePickerDialog.show();
    }

    private final void prepareState() {
        PrepareScreen prepareScreen;
        boolean zA = getPermissionValidator().a(this);
        boolean z10 = getPermissionValidator().f31302b.getBoolean("battery_optimization_settin", false);
        ArrayList arrayList = new ArrayList();
        boolean z11 = getPermissionValidator().f31302b.getBoolean("notifications_asked_settin", false);
        boolean z12 = true;
        if (Build.VERSION.SDK_INT >= 33 && !z11 && e0.a.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            z12 = false;
        }
        if (this.accessibilitySettingsOpened && !zA) {
            ((LinearLayout) _$_findCachedViewById(R.id.rebootDeviceInfo)).setVisibility(0);
            prepareBackup();
        }
        if (zA && z10) {
            finish();
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            return;
        }
        if (!zA) {
            String string = getString(R.string.enable_service);
            j0.h(string, "getString(R.string.enable_service)");
            String string2 = getString(R.string.enable_accessibility_service);
            j0.h(string2, "getString(R.string.enable_accessibility_service)");
            String string3 = getString(R.string.tap_accessibility);
            j0.h(string3, "getString(R.string.tap_accessibility)");
            prepareScreen = new PrepareScreen(1, string, string2, string3, Integer.valueOf(R.raw.accessibility), Color.parseColor("#260595"));
        } else {
            if (z12) {
                if (!z10) {
                    String string4 = getString(R.string.disable_optimization);
                    j0.h(string4, "getString(R.string.disable_optimization)");
                    String string5 = getString(R.string.turn_off_optimization);
                    j0.h(string5, "getString(R.string.turn_off_optimization)");
                    String string6 = getString(R.string.tap_battery);
                    j0.h(string6, "getString(R.string.tap_battery)");
                    prepareScreen = new PrepareScreen(2, string4, string5, string6, Integer.valueOf(R.raw.battery), Color.parseColor("#260595"));
                }
                this.adapter.setAll(arrayList);
            }
            String string7 = getString(R.string.enable_notif);
            j0.h(string7, "getString(R.string.enable_notif)");
            String string8 = getString(R.string.enable_system_notif);
            j0.h(string8, "getString(R.string.enable_system_notif)");
            String string9 = getString(R.string.tap_notif);
            j0.h(string9, "getString(R.string.tap_notif)");
            prepareScreen = new PrepareScreen(3, string7, string8, string9, null, Color.parseColor("#260595"));
        }
        arrayList.add(prepareScreen);
        this.adapter.setAll(arrayList);
    }

    private final void prepareViewPager() {
        ((ViewPager2) _$_findCachedViewById(R.id.prepareViewPager)).setAdapter(this.adapter);
    }

    private final void showAccessibilityConsent(a<w> aVar) {
        AlertDialog.Builder title = new AlertDialog.Builder(this).setTitle(getString(R.string.accessibility_service));
        String string = getString(R.string.service_description);
        j0.h(string, "getString(R.string.service_description)");
        title.setMessage(ed.j.c(string)).setPositiveButton(getString(R.string.consent), new h0(this, aVar)).setNegativeButton(getString(R.string.dont_consent), new z6.a(this)).setCancelable(false).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAccessibilityConsent$lambda$1(PrepareActivity prepareActivity, a aVar, DialogInterface dialogInterface, int i10) {
        j0.i(prepareActivity, "this$0");
        j0.i(aVar, "$consentGranted");
        prepareActivity.getAppSettings().p(true);
        dialogInterface.dismiss();
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAccessibilityConsent$lambda$2(PrepareActivity prepareActivity, DialogInterface dialogInterface, int i10) {
        j0.i(prepareActivity, "this$0");
        prepareActivity.getAppSettings().p(false);
        dialogInterface.dismiss();
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

    public final String getEXTRA_FRAGMENT_ARG_KEY() {
        return this.EXTRA_FRAGMENT_ARG_KEY;
    }

    public final String getEXTRA_SHOW_FRAGMENT_ARGUMENTS() {
        return this.EXTRA_SHOW_FRAGMENT_ARGUMENTS;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_prepare;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        STARTED_BY_USER = true;
        prepareViewPager();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onStart() {
        super.onStart();
        prepareState();
    }
}
