package com.inscode.autoclicker.service.manual.settings;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import jc.w;
import org.joda.time.DateTime;
import vc.b0;
import vc.l;
import yd.h;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetManualSettingsActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13265f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<Integer, View> f13268e = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13266c = jc.f.b(new b(this, "", null, ae.b.f348c));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nb.a f13267d = new nb.a();

    public static final class a extends l implements uc.l<w, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(w wVar) {
            u1.a.s(WidgetManualSettingsActivity.this, R.string.settings_saved, 0, 2);
            WidgetManualSettingsActivity widgetManualSettingsActivity = WidgetManualSettingsActivity.this;
            int i10 = WidgetManualSettingsActivity.f13265f;
            widgetManualSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class b extends l implements uc.a<a7.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13270c = componentCallbacks;
            this.f13271d = str;
            this.f13272e = aVar;
            this.f13273f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [a7.a, java.lang.Object] */
        @Override // uc.a
        public final a7.a invoke() {
            return fd.f.d(this.f13270c).f37311a.c(new h(this.f13271d, b0.a(a7.a.class), this.f13272e, this.f13273f));
        }
    }

    public static final class c extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u6.a f13274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetManualSettingsActivity f13275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u6.a aVar, WidgetManualSettingsActivity widgetManualSettingsActivity) {
            super(1);
            this.f13274c = aVar;
            this.f13275d = widgetManualSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            this.f13274c.p(l10.longValue());
            WidgetManualSettingsActivity widgetManualSettingsActivity = this.f13275d;
            int i10 = WidgetManualSettingsActivity.f13265f;
            widgetManualSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class d extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u6.a f13276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetManualSettingsActivity f13277d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u6.a aVar, WidgetManualSettingsActivity widgetManualSettingsActivity) {
            super(1);
            this.f13276c = aVar;
            this.f13277d = widgetManualSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            this.f13276c.r(l10.longValue());
            WidgetManualSettingsActivity widgetManualSettingsActivity = this.f13277d;
            int i10 = WidgetManualSettingsActivity.f13265f;
            widgetManualSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class e extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u6.a f13278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetManualSettingsActivity f13279d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u6.a aVar, WidgetManualSettingsActivity widgetManualSettingsActivity) {
            super(1);
            this.f13278c = aVar;
            this.f13279d = widgetManualSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            this.f13278c.q(l10.longValue());
            WidgetManualSettingsActivity widgetManualSettingsActivity = this.f13279d;
            int i10 = WidgetManualSettingsActivity.f13265f;
            widgetManualSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class f extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u6.a f13280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetManualSettingsActivity f13281d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(u6.a aVar, WidgetManualSettingsActivity widgetManualSettingsActivity) {
            super(1);
            this.f13280c = aVar;
            this.f13281d = widgetManualSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            this.f13280c.o(l10.longValue());
            WidgetManualSettingsActivity widgetManualSettingsActivity = this.f13281d;
            int i10 = WidgetManualSettingsActivity.f13265f;
            widgetManualSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13268e.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13268e;
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

    public final a7.a g() {
        return (a7.a) this.f13266c.getValue();
    }

    public final void h(u6.a aVar) {
        aVar.s(System.currentTimeMillis());
        aVar.m(Resources.getSystem().getConfiguration().orientation);
        a7.a aVarG = g();
        Objects.requireNonNull(aVarG);
        nb.b bVarF = ec.a.f(aVarG.f160b.d(aVar).n(fc.a.f29534b).i(mb.a.a()), null, new a(), 1);
        nb.a aVar2 = this.f13267d;
        j0.j(aVar2, "compositeDisposable");
        aVar2.a(bVarF);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_manual_settings;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13267d.d();
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onResume() {
        super.onResume();
        updateUi();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0244  */
    /* JADX WARN: Code duplicated, block: B:21:0x024e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0256  */
    /* JADX WARN: Code duplicated, block: B:25:0x0270  */
    @SuppressLint({"SetTextI18n"})
    public final void updateUi() {
        TextView textView;
        int i10;
        TextView textView2;
        int i11;
        final u6.a aVar = g().f161c;
        final int i12 = 1;
        final int i13 = 0;
        if (j0.d(aVar.getName(), "Unsaved")) {
            ((Button) _$_findCachedViewById(R.id.manualSettingsSaveCurrentButton)).setEnabled(false);
            ((Button) _$_findCachedViewById(R.id.manualSettingsSaveCurrentButton)).setAlpha(0.5f);
            ((Button) _$_findCachedViewById(R.id.manualSettingsExportButton)).setEnabled(true);
            ((Button) _$_findCachedViewById(R.id.manualSettingsExportButton)).setAlpha(0.5f);
        } else {
            ((Button) _$_findCachedViewById(R.id.manualSettingsSaveCurrentButton)).setEnabled(true);
            ((Button) _$_findCachedViewById(R.id.manualSettingsSaveCurrentButton)).setAlpha(1.0f);
            ((Button) _$_findCachedViewById(R.id.manualSettingsExportButton)).setEnabled(true);
            ((Button) _$_findCachedViewById(R.id.manualSettingsExportButton)).setAlpha(1.0f);
            ((TextView) _$_findCachedViewById(R.id.manualSettingsName)).setText(aVar.getName());
            ((TextView) _$_findCachedViewById(R.id.manualSettingsDate)).setText(u1.a.f(new DateTime(aVar.i())));
            ((Button) _$_findCachedViewById(R.id.manualSettingsSaveCurrentButton)).setOnClickListener(new c7.b(this, aVar));
        }
        ((Button) _$_findCachedViewById(R.id.manualSettingsSaveAsButton)).setOnClickListener(new c7.a(this, i12));
        ((Button) _$_findCachedViewById(R.id.manualSettingsLoadButton)).setOnClickListener(new c7.a(this, 2));
        ((TextView) _$_findCachedViewById(R.id.manualSettingsTimeBetweenSetsValue)).setText(aVar.f() + " [ms]");
        ((LinearLayout) _$_findCachedViewById(R.id.manualSettingsTimeBetweenContainer)).setOnClickListener(new c7.b(aVar, this, 1));
        ((TextView) _$_findCachedViewById(R.id.manualSettingsClickDurationValue)).setText(aVar.h() + " [ms]");
        ((LinearLayout) _$_findCachedViewById(R.id.manualSettingsClickDurationContainer)).setOnClickListener(new c7.b(aVar, this, 2));
        ((TextView) _$_findCachedViewById(R.id.manualSettingsSwipeDurationValue)).setText(aVar.g() + " [ms]");
        int i14 = 3;
        ((LinearLayout) _$_findCachedViewById(R.id.manualSettingsSwipeDurationContainer)).setOnClickListener(new c7.b(aVar, this, 3));
        ((TextView) _$_findCachedViewById(R.id.manualSettingsRepeatCountValue)).setText(aVar.e() == 0 ? "Infinity" : String.valueOf(aVar.e()));
        ((LinearLayout) _$_findCachedViewById(R.id.manualSettingsRepeatCountContainer)).setOnClickListener(new c7.b(aVar, this, 4));
        ((Switch) _$_findCachedViewById(R.id.manualSettingsRandomizeSwitch)).setOnCheckedChangeListener(null);
        ((Switch) _$_findCachedViewById(R.id.manualSettingsRandomizeSwitch)).setChecked(aVar.d());
        ((Switch) _$_findCachedViewById(R.id.manualSettingsRandomizeSwitch)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c7.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i13) {
                    case 0:
                        u6.a aVar2 = aVar;
                        int i15 = WidgetManualSettingsActivity.f13265f;
                        j0.i(aVar2, "$settings");
                        aVar2.n(z10);
                        break;
                    default:
                        u6.a aVar3 = aVar;
                        int i16 = WidgetManualSettingsActivity.f13265f;
                        j0.i(aVar3, "$settings");
                        xe.a.f37601c.a("[MANUAL] One finger mode: " + z10, new Object[0]);
                        aVar3.l(z10);
                        break;
                }
            }
        });
        ((Switch) _$_findCachedViewById(R.id.manualSettingsOneFingerSwitch)).setOnCheckedChangeListener(null);
        ((Switch) _$_findCachedViewById(R.id.manualSettingsOneFingerSwitch)).setChecked(aVar.b());
        ((Switch) _$_findCachedViewById(R.id.manualSettingsOneFingerSwitch)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c7.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i12) {
                    case 0:
                        u6.a aVar2 = aVar;
                        int i15 = WidgetManualSettingsActivity.f13265f;
                        j0.i(aVar2, "$settings");
                        aVar2.n(z10);
                        break;
                    default:
                        u6.a aVar3 = aVar;
                        int i16 = WidgetManualSettingsActivity.f13265f;
                        j0.i(aVar3, "$settings");
                        xe.a.f37601c.a("[MANUAL] One finger mode: " + z10, new Object[0]);
                        aVar3.l(z10);
                        break;
                }
            }
        });
        ((TextView) _$_findCachedViewById(R.id.manualSettingsOneFingerValue)).setOnClickListener(new c7.a(this, i14));
        if (aVar.f() >= aVar.g()) {
            if (aVar.f() < aVar.h()) {
                textView = (TextView) _$_findCachedViewById(R.id.manualSettingsWarningText);
                i10 = R.string.repeat_check_2;
            } else {
                ((FrameLayout) _$_findCachedViewById(R.id.manualSettingsWarningContainer)).setVisibility(8);
            }
            if (aVar.h() < 40) {
                if (aVar.g() < 40) {
                    textView2 = (TextView) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveText);
                    i11 = R.string.repeat_check_4;
                } else {
                    ((FrameLayout) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveContainer)).setVisibility(8);
                }
                ((ImageView) _$_findCachedViewById(R.id.manualSettingsMore)).setOnClickListener(new c7.a(this, i13));
            }
            textView2 = (TextView) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveText);
            i11 = R.string.repeat_check_3;
            textView2.setText(getString(i11));
            ((FrameLayout) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveContainer)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.manualSettingsMore)).setOnClickListener(new c7.a(this, i13));
        }
        textView = (TextView) _$_findCachedViewById(R.id.manualSettingsWarningText);
        i10 = R.string.repeat_check_1;
        textView.setText(getString(i10));
        ((FrameLayout) _$_findCachedViewById(R.id.manualSettingsWarningContainer)).setVisibility(0);
        if (aVar.h() < 40) {
            if (aVar.g() < 40) {
                textView2 = (TextView) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveText);
                i11 = R.string.repeat_check_4;
            } else {
                ((FrameLayout) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveContainer)).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.manualSettingsMore)).setOnClickListener(new c7.a(this, i13));
        }
        textView2 = (TextView) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveText);
        i11 = R.string.repeat_check_3;
        textView2.setText(getString(i11));
        ((FrameLayout) _$_findCachedViewById(R.id.manualSettingsWarningUnresponsiveContainer)).setVisibility(0);
        ((ImageView) _$_findCachedViewById(R.id.manualSettingsMore)).setOnClickListener(new c7.a(this, i13));
    }
}
