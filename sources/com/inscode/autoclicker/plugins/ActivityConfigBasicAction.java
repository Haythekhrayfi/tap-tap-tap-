package com.inscode.autoclicker.plugins;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseAdapter;
import com.inscode.autoclicker.plugins.ActivityConfigBasicAction;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import org.joda.time.DateTime;
import uc.p;
import vc.b0;
import z6.r;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityConfigBasicAction extends AppCompatActivity {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f13047l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f13049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.e f13050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BaseAdapter<v6.a> f13052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BaseAdapter<t6.a> f13053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BaseAdapter<u6.a> f13054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<Integer, View> f13056k = new LinkedHashMap();

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13057a;

        static {
            int[] iArr = new int[r6.k.values().length];
            try {
                iArr[r6.k.COMBINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r6.k.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13057a = iArr;
        }
    }

    public static final class c extends vc.l implements uc.a<d7.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13061f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13058c = componentCallbacks;
            this.f13059d = str;
            this.f13060e = aVar;
            this.f13061f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
        @Override // uc.a
        public final d7.g invoke() {
            return fd.f.d(this.f13058c).f37311a.c(new yd.h(this.f13059d, b0.a(d7.g.class), this.f13060e, this.f13061f));
        }
    }

    public static final class d extends vc.l implements uc.a<r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13065f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13062c = componentCallbacks;
            this.f13063d = str;
            this.f13064e = aVar;
            this.f13065f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, z6.r] */
        @Override // uc.a
        public final r invoke() {
            return fd.f.d(this.f13062c).f37311a.c(new yd.h(this.f13063d, b0.a(r.class), this.f13064e, this.f13065f));
        }
    }

    public static final class e extends vc.l implements uc.a<a7.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13069f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13066c = componentCallbacks;
            this.f13067d = str;
            this.f13068e = aVar;
            this.f13069f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [a7.a, java.lang.Object] */
        @Override // uc.a
        public final a7.a invoke() {
            return fd.f.d(this.f13066c).f37311a.c(new yd.h(this.f13067d, b0.a(a7.a.class), this.f13068e, this.f13069f));
        }
    }

    public static final class f extends vc.l implements p<View, v6.a, w> {
        public f() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, v6.a aVar) {
            View view2 = view;
            v6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "item");
            ActivityConfigBasicAction activityConfigBasicAction = ActivityConfigBasicAction.this;
            int i10 = ActivityConfigBasicAction.f13047l;
            Objects.requireNonNull(activityConfigBasicAction);
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            ((TextView) view2.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar2.h())) + " Duration: " + u1.a.q(aVar2.c()));
            return w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.l<v6.a, w> {
        public g() {
            super(1);
        }

        @Override // uc.l
        public w invoke(v6.a aVar) {
            v6.a aVar2 = aVar;
            j0.i(aVar2, "it");
            ActivityConfigBasicAction activityConfigBasicAction = ActivityConfigBasicAction.this;
            int i10 = ActivityConfigBasicAction.f13047l;
            Objects.requireNonNull(activityConfigBasicAction);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            boolean zIsChecked = ((CheckBox) activityConfigBasicAction._$_findCachedViewById(R.id.activityTaskerStartHiddenCheckBox)).isChecked();
            r6.k kVar = r6.k.RECORD;
            bundle.putInt("type", kVar.getValue());
            bundle.putString(FacebookMediationAdapter.KEY_ID, aVar2.getName());
            bundle.putBoolean("autostart", true);
            bundle.putBoolean("startHidden", zIsChecked);
            bundle.putString(activityConfigBasicAction.f13055j, activityConfigBasicAction.g(kVar, aVar2.getName(), zIsChecked));
            intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
            if (nd.a.C0371a.a(activityConfigBasicAction.getIntent().getExtras())) {
                xe.a.f37601c.a("[TaskerConfig] Host supports sync execution.", new Object[0]);
                nd.a.C0371a.b(intent, (int) aVar2.c());
            }
            activityConfigBasicAction.setResult(-1, intent);
            activityConfigBasicAction.finish();
            return w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.l<List<? extends v6.a>, w> {
        public h() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<? extends v6.a> list) {
            List<? extends v6.a> list2 = list;
            StringBuilder sbA = defpackage.a.a("Found: ");
            sbA.append(list2.size());
            sbA.append(" recordings");
            xe.a.f37601c.a(sbA.toString(), new Object[0]);
            BaseAdapter<v6.a> baseAdapter = ActivityConfigBasicAction.this.f13052g;
            if (baseAdapter != null) {
                baseAdapter.setAll(list2);
            }
            return w.f31842a;
        }
    }

    public static final class i extends vc.l implements p<View, t6.a, w> {
        public i() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, t6.a aVar) {
            View view2 = view;
            t6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "view");
            ActivityConfigBasicAction activityConfigBasicAction = ActivityConfigBasicAction.this;
            int i10 = ActivityConfigBasicAction.f13047l;
            Objects.requireNonNull(activityConfigBasicAction);
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            ((TextView) view2.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar2.g())) + " Duration: " + u1.a.q(aVar2.b()));
            return w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.l<t6.a, w> {
        public j() {
            super(1);
        }

        @Override // uc.l
        public w invoke(t6.a aVar) {
            t6.a aVar2 = aVar;
            j0.i(aVar2, "it");
            ActivityConfigBasicAction activityConfigBasicAction = ActivityConfigBasicAction.this;
            int i10 = ActivityConfigBasicAction.f13047l;
            Objects.requireNonNull(activityConfigBasicAction);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            boolean zIsChecked = ((CheckBox) activityConfigBasicAction._$_findCachedViewById(R.id.activityTaskerStartHiddenCheckBox)).isChecked();
            r6.k kVar = r6.k.COMBINE;
            bundle.putInt("type", kVar.getValue());
            bundle.putString(FacebookMediationAdapter.KEY_ID, aVar2.getName());
            bundle.putBoolean("autostart", true);
            bundle.putBoolean("startHidden", zIsChecked);
            bundle.putString(activityConfigBasicAction.f13055j, activityConfigBasicAction.g(kVar, aVar2.getName(), zIsChecked));
            intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
            if (nd.a.C0371a.a(activityConfigBasicAction.getIntent().getExtras())) {
                xe.a.f37601c.a("[TaskerConfig] Host supports sync execution.", new Object[0]);
                nd.a.C0371a.b(intent, (int) aVar2.b());
            }
            activityConfigBasicAction.setResult(-1, intent);
            activityConfigBasicAction.finish();
            return w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.l<List<? extends t6.a>, w> {
        public k() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<? extends t6.a> list) {
            List<? extends t6.a> list2 = list;
            BaseAdapter<t6.a> baseAdapter = ActivityConfigBasicAction.this.f13053h;
            if (baseAdapter != null) {
                j0.h(list2, "it");
                baseAdapter.setAll(list2);
            }
            return w.f31842a;
        }
    }

    public static final class l extends vc.l implements p<View, u6.a, w> {
        public l() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, u6.a aVar) {
            View view2 = view;
            u6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "view");
            ActivityConfigBasicAction activityConfigBasicAction = ActivityConfigBasicAction.this;
            int i10 = ActivityConfigBasicAction.f13047l;
            Objects.requireNonNull(activityConfigBasicAction);
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            ((TextView) view2.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar2.i())));
            return w.f31842a;
        }
    }

    public static final class m extends vc.l implements uc.l<u6.a, w> {
        public m() {
            super(1);
        }

        @Override // uc.l
        public w invoke(u6.a aVar) {
            u6.a aVar2 = aVar;
            j0.i(aVar2, "it");
            ActivityConfigBasicAction activityConfigBasicAction = ActivityConfigBasicAction.this;
            int i10 = ActivityConfigBasicAction.f13047l;
            Objects.requireNonNull(activityConfigBasicAction);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            boolean zIsChecked = ((CheckBox) activityConfigBasicAction._$_findCachedViewById(R.id.activityTaskerStartHiddenCheckBox)).isChecked();
            bundle.putInt("type", r6.k.MANUAL.getValue());
            bundle.putString(FacebookMediationAdapter.KEY_ID, aVar2.getName());
            bundle.putBoolean("autostart", true);
            bundle.putBoolean("startHidden", zIsChecked);
            bundle.putString(activityConfigBasicAction.f13055j, activityConfigBasicAction.g(r6.k.COMBINE, aVar2.getName(), zIsChecked));
            intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
            activityConfigBasicAction.setResult(-1, intent);
            activityConfigBasicAction.finish();
            return w.f31842a;
        }
    }

    public static final class n extends vc.l implements uc.l<List<? extends u6.a>, w> {
        public n() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<? extends u6.a> list) {
            List<? extends u6.a> list2 = list;
            BaseAdapter<u6.a> baseAdapter = ActivityConfigBasicAction.this.f13054i;
            if (baseAdapter != null) {
                j0.h(list2, "it");
                baseAdapter.setAll(list2);
            }
            return w.f31842a;
        }
    }

    static {
        new a(null);
    }

    public ActivityConfigBasicAction() {
        ae.b bVar = ae.b.f348c;
        this.f13048c = jc.f.b(new c(this, "", null, bVar));
        this.f13049d = jc.f.b(new d(this, "", null, bVar));
        this.f13050e = jc.f.b(new e(this, "", null, bVar));
        this.f13055j = "com.twofortyfouram.locale.intent.extra.BLURB";
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13056k;
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

    public final String g(r6.k kVar, String str, boolean z10) {
        int i10;
        int i11 = b.f13057a[kVar.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.string.mode_manual : R.string.mode_recording;
        } else {
            i10 = R.string.mode_combination;
        }
        String string = getString(i10);
        j0.h(string, "when (type) {\n          …ode_manual)\n            }");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Starts ");
        sb2.append(string);
        sb2.append(" named ");
        sb2.append(str);
        sb2.append(". \nStart hidden: ");
        sb2.append(z10);
        sb2.append(CoreConstants.DOT);
        sb2.append(z10 ? "\nUse volume up button to show/hide floating widget." : "\nSet timeout to 'Never' if you want to continue flow when Clickmate ends its work.");
        return sb2.toString();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i10 = 1;
        if (!ma.h.f33410y.a().i()) {
            Toast.makeText(this, getString(R.string.feature_for_pro), 1).show();
            finish();
            return;
        }
        setContentView(R.layout.activity_tasker_configuration);
        final int i11 = 0;
        ((LinearLayout) _$_findCachedViewById(R.id.activityTaskerCombinations)).setOnClickListener(new View.OnClickListener(this) { // from class: x6.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ActivityConfigBasicAction f37475d;

            {
                this.f37475d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ActivityConfigBasicAction activityConfigBasicAction = this.f37475d;
                        int i12 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction, "this$0");
                        activityConfigBasicAction.f13051f = 2;
                        activityConfigBasicAction.updateUi();
                        break;
                    case 1:
                        ActivityConfigBasicAction activityConfigBasicAction2 = this.f37475d;
                        int i13 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction2, "this$0");
                        activityConfigBasicAction2.f13051f = 1;
                        activityConfigBasicAction2.updateUi();
                        break;
                    default:
                        ActivityConfigBasicAction activityConfigBasicAction3 = this.f37475d;
                        int i14 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction3, "this$0");
                        activityConfigBasicAction3.f13051f = 3;
                        activityConfigBasicAction3.updateUi();
                        break;
                }
            }
        });
        ((LinearLayout) _$_findCachedViewById(R.id.activityTaskerRecordings)).setOnClickListener(new View.OnClickListener(this) { // from class: x6.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ActivityConfigBasicAction f37475d;

            {
                this.f37475d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ActivityConfigBasicAction activityConfigBasicAction = this.f37475d;
                        int i12 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction, "this$0");
                        activityConfigBasicAction.f13051f = 2;
                        activityConfigBasicAction.updateUi();
                        break;
                    case 1:
                        ActivityConfigBasicAction activityConfigBasicAction2 = this.f37475d;
                        int i13 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction2, "this$0");
                        activityConfigBasicAction2.f13051f = 1;
                        activityConfigBasicAction2.updateUi();
                        break;
                    default:
                        ActivityConfigBasicAction activityConfigBasicAction3 = this.f37475d;
                        int i14 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction3, "this$0");
                        activityConfigBasicAction3.f13051f = 3;
                        activityConfigBasicAction3.updateUi();
                        break;
                }
            }
        });
        final int i12 = 2;
        ((LinearLayout) _$_findCachedViewById(R.id.activityTaskerManual)).setOnClickListener(new View.OnClickListener(this) { // from class: x6.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ActivityConfigBasicAction f37475d;

            {
                this.f37475d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ActivityConfigBasicAction activityConfigBasicAction = this.f37475d;
                        int i13 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction, "this$0");
                        activityConfigBasicAction.f13051f = 2;
                        activityConfigBasicAction.updateUi();
                        break;
                    case 1:
                        ActivityConfigBasicAction activityConfigBasicAction2 = this.f37475d;
                        int i14 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction2, "this$0");
                        activityConfigBasicAction2.f13051f = 1;
                        activityConfigBasicAction2.updateUi();
                        break;
                    default:
                        ActivityConfigBasicAction activityConfigBasicAction3 = this.f37475d;
                        int i15 = ActivityConfigBasicAction.f13047l;
                        j0.i(activityConfigBasicAction3, "this$0");
                        activityConfigBasicAction3.f13051f = 3;
                        activityConfigBasicAction3.updateUi();
                        break;
                }
            }
        });
    }

    public final void updateUi() {
        int i10;
        lb.m<List<u6.a>> mVarI;
        uc.l nVar;
        ((LinearLayout) _$_findCachedViewById(R.id.activityTaskerSelectModeContainer)).setVisibility(8);
        int i11 = this.f13051f;
        if (i11 != 1) {
            i10 = i11 != 2 ? R.string.mode_manual : R.string.mode_combination;
        } else {
            i10 = R.string.mode_recording;
        }
        String string = getString(i10);
        j0.h(string, "getString(\n            w…l\n            }\n        )");
        ((TextView) _$_findCachedViewById(R.id.activityTaskerToolbarTitle)).setText(getString(R.string.title_select_mode, new Object[]{string}));
        ((LinearLayout) _$_findCachedViewById(R.id.activityTaskerStartHiddenContainer)).setVisibility(0);
        ((LinearLayout) _$_findCachedViewById(R.id.activityTaskerSelectItemContainer)).setVisibility(0);
        ((RecyclerView) _$_findCachedViewById(R.id.activityTaskerRecyclerView)).setLayoutManager(new LinearLayoutManager(this));
        int i12 = this.f13051f;
        if (i12 == 1) {
            this.f13052g = new BaseAdapter.Builder().layoutId(R.layout.item_tasker_item).onBind(new f()).onItemClick(new g()).build();
            ((RecyclerView) _$_findCachedViewById(R.id.activityTaskerRecyclerView)).setAdapter(this.f13052g);
            mVarI = ((d7.g) this.f13048c.getValue()).a().n(fc.a.f29534b).i(mb.a.a());
            nVar = new h();
        } else if (i12 == 2) {
            this.f13053h = new BaseAdapter.Builder().layoutId(R.layout.item_tasker_item).onBind(new i()).onItemClick(new j()).build();
            ((RecyclerView) _$_findCachedViewById(R.id.activityTaskerRecyclerView)).setAdapter(this.f13053h);
            mVarI = ((r) this.f13049d.getValue()).a().n(fc.a.f29534b).i(mb.a.a());
            nVar = new k();
        } else {
            this.f13054i = new BaseAdapter.Builder().layoutId(R.layout.item_tasker_item).onBind(new l()).onItemClick(new m()).build();
            ((RecyclerView) _$_findCachedViewById(R.id.activityTaskerRecyclerView)).setAdapter(this.f13054i);
            mVarI = ((a7.a) this.f13050e.getValue()).a().n(fc.a.f29534b).i(mb.a.a());
            nVar = new n();
        }
        ec.a.f(mVarI, null, nVar, 1);
    }
}
