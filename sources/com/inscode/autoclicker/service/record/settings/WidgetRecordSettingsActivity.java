package com.inscode.autoclicker.service.record.settings;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import d7.g;
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
public final class WidgetRecordSettingsActivity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13283g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f13285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nb.a f13286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<Integer, View> f13287f = new LinkedHashMap();

    public static final class a extends l implements uc.l<w, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(w wVar) {
            u1.a.s(WidgetRecordSettingsActivity.this, R.string.settings_saved, 0, 2);
            WidgetRecordSettingsActivity widgetRecordSettingsActivity = WidgetRecordSettingsActivity.this;
            int i10 = WidgetRecordSettingsActivity.f13283g;
            widgetRecordSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class b extends l implements uc.a<g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13292f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13289c = componentCallbacks;
            this.f13290d = str;
            this.f13291e = aVar;
            this.f13292f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
        @Override // uc.a
        public final g invoke() {
            return fd.f.d(this.f13289c).f37311a.c(new h(this.f13290d, b0.a(g.class), this.f13291e, this.f13292f));
        }
    }

    public static final class c extends l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13296f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13293c = componentCallbacks;
            this.f13294d = str;
            this.f13295e = aVar;
            this.f13296f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return fd.f.d(this.f13293c).f37311a.c(new h(this.f13294d, b0.a(r6.e.class), this.f13295e, this.f13296f));
        }
    }

    public static final class d extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v6.a f13297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetRecordSettingsActivity f13298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v6.a aVar, WidgetRecordSettingsActivity widgetRecordSettingsActivity) {
            super(1);
            this.f13297c = aVar;
            this.f13298d = widgetRecordSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            this.f13297c.m(l10.longValue());
            WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f13298d;
            int i10 = WidgetRecordSettingsActivity.f13283g;
            widgetRecordSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class e extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v6.a f13299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetRecordSettingsActivity f13300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v6.a aVar, WidgetRecordSettingsActivity widgetRecordSettingsActivity) {
            super(1);
            this.f13299c = aVar;
            this.f13300d = widgetRecordSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            this.f13299c.n(l10.longValue());
            WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f13300d;
            int i10 = WidgetRecordSettingsActivity.f13283g;
            widgetRecordSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public static final class f extends l implements uc.l<Double, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v6.a f13301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WidgetRecordSettingsActivity f13302d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v6.a aVar, WidgetRecordSettingsActivity widgetRecordSettingsActivity) {
            super(1);
            this.f13301c = aVar;
            this.f13302d = widgetRecordSettingsActivity;
        }

        @Override // uc.l
        public w invoke(Double d10) {
            this.f13301c.l(d10.doubleValue());
            WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f13302d;
            int i10 = WidgetRecordSettingsActivity.f13283g;
            widgetRecordSettingsActivity.updateUi();
            return w.f31842a;
        }
    }

    public WidgetRecordSettingsActivity() {
        ae.b bVar = ae.b.f348c;
        this.f13284c = jc.f.b(new b(this, "", null, bVar));
        this.f13285d = jc.f.b(new c(this, "", null, bVar));
        this.f13286e = new nb.a();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13287f.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13287f;
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

    public final g g() {
        return (g) this.f13284c.getValue();
    }

    public final void h(v6.a aVar) {
        aVar.o(System.currentTimeMillis());
        aVar.k(Resources.getSystem().getConfiguration().orientation);
        g gVarG = g();
        Objects.requireNonNull(gVarG);
        nb.b bVarF = ec.a.f(gVarG.f28801b.d(aVar).n(fc.a.f29534b).i(mb.a.a()), null, new a(), 1);
        nb.a aVar2 = this.f13286e;
        j0.j(aVar2, "compositeDisposable");
        aVar2.a(bVarF);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_record_settings;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13286e.d();
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onResume() {
        super.onResume();
        updateUi();
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateUi() {
        v6.a aVar = g().f28802c;
        int i10 = 0;
        ((FrameLayout) _$_findCachedViewById(R.id.recordModePlaybackAppSettings)).setOnClickListener(new e7.a(this, i10));
        int i11 = 1;
        if (j0.d(aVar.getName(), "Unsaved")) {
            ((Button) _$_findCachedViewById(R.id.recordSettingsSaveCurrentButton)).setEnabled(false);
            ((Button) _$_findCachedViewById(R.id.recordSettingsSaveCurrentButton)).setAlpha(0.5f);
            ((Button) _$_findCachedViewById(R.id.recordSettingsExportButton)).setEnabled(false);
            ((Button) _$_findCachedViewById(R.id.recordSettingsExportButton)).setAlpha(0.5f);
        } else {
            ((Button) _$_findCachedViewById(R.id.recordSettingsSaveCurrentButton)).setEnabled(true);
            ((Button) _$_findCachedViewById(R.id.recordSettingsSaveCurrentButton)).setAlpha(1.0f);
            ((Button) _$_findCachedViewById(R.id.recordSettingsExportButton)).setEnabled(true);
            ((Button) _$_findCachedViewById(R.id.recordSettingsExportButton)).setAlpha(1.0f);
            ((TextView) _$_findCachedViewById(R.id.recordSettingsName)).setText(aVar.getName());
            ((TextView) _$_findCachedViewById(R.id.recordSettingsDate)).setText(u1.a.f(new DateTime(aVar.h())));
            ((Button) _$_findCachedViewById(R.id.recordSettingsSaveCurrentButton)).setOnClickListener(new e7.b(this, aVar, i10));
        }
        ((Button) _$_findCachedViewById(R.id.recordSettingsSaveAsButton)).setOnClickListener(new e7.a(this, i11));
        int i12 = 2;
        ((Button) _$_findCachedViewById(R.id.recordSettingsLoadButton)).setOnClickListener(new e7.a(this, i12));
        ((TextView) _$_findCachedViewById(R.id.recordSettingsRepeatCountValue)).setText(aVar.f() == 0 ? getString(R.string.infinity) : String.valueOf(aVar.f()));
        ((LinearLayout) _$_findCachedViewById(R.id.recordSettingsRepeatCountContainer)).setOnClickListener(new e7.b(aVar, this, i11));
        ((TextView) _$_findCachedViewById(R.id.recordSettingsPauseTimeValue)).setText(aVar.g() + " [ms]");
        ((LinearLayout) _$_findCachedViewById(R.id.recordSettingsPauseTimeContainer)).setOnClickListener(new e7.b(aVar, this, i12));
        TextView textView = (TextView) _$_findCachedViewById(R.id.recordSettingsPlaybackSpeedValue);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.e());
        sb2.append('x');
        textView.setText(sb2.toString());
        int i13 = 3;
        ((LinearLayout) _$_findCachedViewById(R.id.recordSettingsPlaybackSpeedContainer)).setOnClickListener(new e7.b(this, aVar, i13));
        ((ImageView) _$_findCachedViewById(R.id.recordSettingsMore)).setOnClickListener(new e7.a(this, i13));
    }
}
