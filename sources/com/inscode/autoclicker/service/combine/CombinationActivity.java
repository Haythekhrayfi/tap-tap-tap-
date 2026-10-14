package com.inscode.autoclicker.service.combine;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.base.DragAndDropItemAdapter;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import com.inscode.autoclicker.ui.main.SettingsActivity;
import fd.f;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import org.joda.time.DateTime;
import uc.p;
import vc.b0;
import vc.g;
import vc.l;
import y6.a1;
import y6.v1;
import yd.h;
import z6.r;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinationActivity extends BaseActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f13209j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static t6.a f13210k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13211c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.e f13213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nb.a f13214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f13215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jc.e f13216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<Integer, View> f13217i = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DragAndDropItemAdapter<v6.a> f13212d = new DragAndDropItemAdapter.Builder().layoutId(R.layout.item_recording).onBind(new b()).build();

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public static final class b extends l implements p<View, v6.a, w> {
        public b() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, v6.a aVar) {
            View view2 = view;
            v6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "item");
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            TextView textView = (TextView) view2.findViewById(R.id.itemProperties);
            CombinationActivity combinationActivity = CombinationActivity.this;
            Object[] objArr = new Object[3];
            objArr[0] = aVar2.f() == 0 ? "Infinity" : String.valueOf(aVar2.f());
            objArr[1] = String.valueOf(aVar2.e());
            objArr[2] = String.valueOf(aVar2.g());
            textView.setText(combinationActivity.getString(R.string.item_properties_text, objArr));
            ((ImageView) view2.findViewById(R.id.itemSettingsDelete)).setOnClickListener(new a1(CombinationActivity.this, view2, aVar2));
            return w.f31842a;
        }
    }

    public static final class c extends l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13222f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13219c = componentCallbacks;
            this.f13220d = str;
            this.f13221e = aVar;
            this.f13222f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return f.d(this.f13219c).f37311a.c(new h(this.f13220d, b0.a(r6.e.class), this.f13221e, this.f13222f));
        }
    }

    public static final class d extends l implements uc.a<r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13226f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13223c = componentCallbacks;
            this.f13224d = str;
            this.f13225e = aVar;
            this.f13226f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, z6.r] */
        @Override // uc.a
        public final r invoke() {
            return f.d(this.f13223c).f37311a.c(new h(this.f13224d, b0.a(r.class), this.f13225e, this.f13226f));
        }
    }

    public static final class e extends l implements uc.a<d7.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13227c = componentCallbacks;
            this.f13228d = str;
            this.f13229e = aVar;
            this.f13230f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
        @Override // uc.a
        public final d7.g invoke() {
            return f.d(this.f13227c).f37311a.c(new h(this.f13228d, b0.a(d7.g.class), this.f13229e, this.f13230f));
        }
    }

    public CombinationActivity() {
        ae.b bVar = ae.b.f348c;
        this.f13213e = jc.f.b(new c(this, "", null, bVar));
        this.f13214f = new nb.a();
        this.f13215g = jc.f.b(new d(this, "", null, bVar));
        this.f13216h = jc.f.b(new e(this, "", null, bVar));
    }

    public static void g(CombinationActivity combinationActivity, DialogInterface dialogInterface, int i10) {
        j0.i(combinationActivity, "this$0");
        dialogInterface.dismiss();
        super.onBackPressed();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13217i.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13217i;
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

    public final void i() {
        t6.a aVar = f13210k;
        if (aVar != null) {
            ((TextView) _$_findCachedViewById(R.id.combinationEditName)).setText(aVar.getName());
            ((TextView) _$_findCachedViewById(R.id.combinationEditDate)).setText(u1.a.f(new DateTime(aVar.g())));
            List<v6.a> listD = aVar.d();
            this.f13212d.setAll(listD);
            if (listD.isEmpty()) {
                ((RecyclerView) _$_findCachedViewById(R.id.recordingsList)).setVisibility(8);
                ((TextView) _$_findCachedViewById(R.id.noRecordings)).setVisibility(0);
            } else {
                ((RecyclerView) _$_findCachedViewById(R.id.recordingsList)).setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.noRecordings)).setVisibility(8);
            }
            ((TextView) _$_findCachedViewById(R.id.combineSettingsRepeatCountValue)).setText(String.valueOf(aVar.e()));
            ((TextView) _$_findCachedViewById(R.id.combineSettingsPauseTimeValue)).setText(aVar.f() + " [ms]");
        }
    }

    public final void j() {
        if (this.f13211c) {
            new AlertDialog.Builder(this).setMessage(getString(R.string.exit_confirm)).setPositiveButton(getString(android.R.string.ok), new z6.a(this)).setNegativeButton("CANCEL", v1.f38405e).create().show();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_combination;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        j();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i();
        final int i10 = 0;
        ((RecyclerView) _$_findCachedViewById(R.id.recordingsList)).setNestedScrollingEnabled(false);
        ((RecyclerView) _$_findCachedViewById(R.id.recordingsList)).setLayoutManager(new LinearLayoutManager(this));
        androidx.recyclerview.widget.p pVar = new androidx.recyclerview.widget.p(new te.a(this.f13212d.getOnViewMoved()));
        ((RecyclerView) _$_findCachedViewById(R.id.recordingsList)).setAdapter(this.f13212d);
        this.f13212d.setItemTouchHelper(pVar);
        this.f13212d.setOnDataChanged(z6.g.f45052c);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.recordingsList);
        RecyclerView recyclerView2 = pVar.f2748r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(pVar);
                pVar.f2748r.removeOnItemTouchListener(pVar.A);
                pVar.f2748r.removeOnChildAttachStateChangeListener(pVar);
                for (int size = pVar.f2746p.size() - 1; size >= 0; size--) {
                    pVar.f2743m.a(pVar.f2748r, pVar.f2746p.get(0).f2771e);
                }
                pVar.f2746p.clear();
                pVar.f2753w = null;
                pVar.f2754x = -1;
                VelocityTracker velocityTracker = pVar.f2750t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    pVar.f2750t = null;
                }
                androidx.recyclerview.widget.p.e eVar = pVar.f2756z;
                if (eVar != null) {
                    eVar.f2765c = false;
                    pVar.f2756z = null;
                }
                if (pVar.f2755y != null) {
                    pVar.f2755y = null;
                }
            }
            pVar.f2748r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                pVar.f2736f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                pVar.f2737g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                pVar.f2747q = ViewConfiguration.get(pVar.f2748r.getContext()).getScaledTouchSlop();
                pVar.f2748r.addItemDecoration(pVar);
                pVar.f2748r.addOnItemTouchListener(pVar.A);
                pVar.f2748r.addOnChildAttachStateChangeListener(pVar);
                pVar.f2756z = pVar.new e();
                pVar.f2755y = new p0.e(pVar.f2748r.getContext(), pVar.f2756z);
            }
        }
        ((ImageView) _$_findCachedViewById(R.id.buttonBack)).setOnClickListener(new View.OnClickListener(this, i10) { // from class: z6.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f45034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CombinationActivity f45035d;

            {
                this.f45034c = i10;
                if (i10 == 1 || i10 == 2 || i10 != 3) {
                }
                this.f45035d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f45034c) {
                    case 0:
                        CombinationActivity combinationActivity = this.f45035d;
                        CombinationActivity.a aVar = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity, "this$0");
                        combinationActivity.j();
                        break;
                    case 1:
                        CombinationActivity combinationActivity2 = this.f45035d;
                        CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity2, "this$0");
                        t6.a aVar3 = CombinationActivity.f13210k;
                        if (aVar3 != null) {
                            aVar3.m(System.currentTimeMillis());
                            r rVar = (r) combinationActivity2.f13215g.getValue();
                            Objects.requireNonNull(rVar);
                            ec.a.c(rVar.f45129b.d(aVar3).n(fc.a.f29534b).i(mb.a.a()), new c(combinationActivity2), new d(combinationActivity2, aVar3));
                        }
                        break;
                    case 2:
                        CombinationActivity combinationActivity3 = this.f45035d;
                        CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity3, "this$0");
                        nb.b bVarC = ec.a.c(new wb.h(((d7.g) combinationActivity3.f13216h.getValue()).a().j(com.applovin.exoplayer2.b.z.E), new p6.a(i.f45058c, 23)).n(fc.a.f29534b).i(mb.a.a()), j.f45086c, new l(true, combinationActivity3));
                        nb.a aVar5 = combinationActivity3.f13214f;
                        fd.j0.j(aVar5, "compositeDisposable");
                        aVar5.a(bVarC);
                        break;
                    case 3:
                        CombinationActivity combinationActivity4 = this.f45035d;
                        CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity4, "this$0");
                        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                        Context context = view.getContext();
                        fd.j0.h(context, "it.context");
                        t6.a aVar7 = CombinationActivity.f13210k;
                        companion.showRepeatCountDialog(context, aVar7 != null ? aVar7.e() : 0L, new e(combinationActivity4));
                        break;
                    case 4:
                        CombinationActivity combinationActivity5 = this.f45035d;
                        CombinationActivity.a aVar8 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity5, "this$0");
                        ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                        Context context2 = view.getContext();
                        fd.j0.h(context2, "it.context");
                        t6.a aVar9 = CombinationActivity.f13210k;
                        companion2.showPauseBeforeRepeatDialog(context2, aVar9 != null ? aVar9.f() : 0L, new f(combinationActivity5));
                        break;
                    default:
                        CombinationActivity combinationActivity6 = this.f45035d;
                        CombinationActivity.a aVar10 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity6, "this$0");
                        combinationActivity6.startActivity(new Intent(combinationActivity6, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i11 = 1;
        ((ImageView) _$_findCachedViewById(R.id.buttonConfirm)).setOnClickListener(new View.OnClickListener(this, i11) { // from class: z6.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f45034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CombinationActivity f45035d;

            {
                this.f45034c = i11;
                if (i11 == 1 || i11 == 2 || i11 != 3) {
                }
                this.f45035d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f45034c) {
                    case 0:
                        CombinationActivity combinationActivity = this.f45035d;
                        CombinationActivity.a aVar = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity, "this$0");
                        combinationActivity.j();
                        break;
                    case 1:
                        CombinationActivity combinationActivity2 = this.f45035d;
                        CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity2, "this$0");
                        t6.a aVar3 = CombinationActivity.f13210k;
                        if (aVar3 != null) {
                            aVar3.m(System.currentTimeMillis());
                            r rVar = (r) combinationActivity2.f13215g.getValue();
                            Objects.requireNonNull(rVar);
                            ec.a.c(rVar.f45129b.d(aVar3).n(fc.a.f29534b).i(mb.a.a()), new c(combinationActivity2), new d(combinationActivity2, aVar3));
                        }
                        break;
                    case 2:
                        CombinationActivity combinationActivity3 = this.f45035d;
                        CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity3, "this$0");
                        nb.b bVarC = ec.a.c(new wb.h(((d7.g) combinationActivity3.f13216h.getValue()).a().j(com.applovin.exoplayer2.b.z.E), new p6.a(i.f45058c, 23)).n(fc.a.f29534b).i(mb.a.a()), j.f45086c, new l(true, combinationActivity3));
                        nb.a aVar5 = combinationActivity3.f13214f;
                        fd.j0.j(aVar5, "compositeDisposable");
                        aVar5.a(bVarC);
                        break;
                    case 3:
                        CombinationActivity combinationActivity4 = this.f45035d;
                        CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity4, "this$0");
                        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                        Context context = view.getContext();
                        fd.j0.h(context, "it.context");
                        t6.a aVar7 = CombinationActivity.f13210k;
                        companion.showRepeatCountDialog(context, aVar7 != null ? aVar7.e() : 0L, new e(combinationActivity4));
                        break;
                    case 4:
                        CombinationActivity combinationActivity5 = this.f45035d;
                        CombinationActivity.a aVar8 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity5, "this$0");
                        ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                        Context context2 = view.getContext();
                        fd.j0.h(context2, "it.context");
                        t6.a aVar9 = CombinationActivity.f13210k;
                        companion2.showPauseBeforeRepeatDialog(context2, aVar9 != null ? aVar9.f() : 0L, new f(combinationActivity5));
                        break;
                    default:
                        CombinationActivity combinationActivity6 = this.f45035d;
                        CombinationActivity.a aVar10 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity6, "this$0");
                        combinationActivity6.startActivity(new Intent(combinationActivity6, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i12 = 3;
        ((LinearLayout) _$_findCachedViewById(R.id.combineSettingsRepeatCountContainer)).setOnClickListener(new View.OnClickListener(this, i12) { // from class: z6.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f45034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CombinationActivity f45035d;

            {
                this.f45034c = i12;
                if (i12 == 1 || i12 == 2 || i12 != 3) {
                }
                this.f45035d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f45034c) {
                    case 0:
                        CombinationActivity combinationActivity = this.f45035d;
                        CombinationActivity.a aVar = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity, "this$0");
                        combinationActivity.j();
                        break;
                    case 1:
                        CombinationActivity combinationActivity2 = this.f45035d;
                        CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity2, "this$0");
                        t6.a aVar3 = CombinationActivity.f13210k;
                        if (aVar3 != null) {
                            aVar3.m(System.currentTimeMillis());
                            r rVar = (r) combinationActivity2.f13215g.getValue();
                            Objects.requireNonNull(rVar);
                            ec.a.c(rVar.f45129b.d(aVar3).n(fc.a.f29534b).i(mb.a.a()), new c(combinationActivity2), new d(combinationActivity2, aVar3));
                        }
                        break;
                    case 2:
                        CombinationActivity combinationActivity3 = this.f45035d;
                        CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity3, "this$0");
                        nb.b bVarC = ec.a.c(new wb.h(((d7.g) combinationActivity3.f13216h.getValue()).a().j(com.applovin.exoplayer2.b.z.E), new p6.a(i.f45058c, 23)).n(fc.a.f29534b).i(mb.a.a()), j.f45086c, new l(true, combinationActivity3));
                        nb.a aVar5 = combinationActivity3.f13214f;
                        fd.j0.j(aVar5, "compositeDisposable");
                        aVar5.a(bVarC);
                        break;
                    case 3:
                        CombinationActivity combinationActivity4 = this.f45035d;
                        CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity4, "this$0");
                        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                        Context context = view.getContext();
                        fd.j0.h(context, "it.context");
                        t6.a aVar7 = CombinationActivity.f13210k;
                        companion.showRepeatCountDialog(context, aVar7 != null ? aVar7.e() : 0L, new e(combinationActivity4));
                        break;
                    case 4:
                        CombinationActivity combinationActivity5 = this.f45035d;
                        CombinationActivity.a aVar8 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity5, "this$0");
                        ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                        Context context2 = view.getContext();
                        fd.j0.h(context2, "it.context");
                        t6.a aVar9 = CombinationActivity.f13210k;
                        companion2.showPauseBeforeRepeatDialog(context2, aVar9 != null ? aVar9.f() : 0L, new f(combinationActivity5));
                        break;
                    default:
                        CombinationActivity combinationActivity6 = this.f45035d;
                        CombinationActivity.a aVar10 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity6, "this$0");
                        combinationActivity6.startActivity(new Intent(combinationActivity6, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i13 = 4;
        ((LinearLayout) _$_findCachedViewById(R.id.combineSettingsPauseTimeContainer)).setOnClickListener(new View.OnClickListener(this, i13) { // from class: z6.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f45034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CombinationActivity f45035d;

            {
                this.f45034c = i13;
                if (i13 == 1 || i13 == 2 || i13 != 3) {
                }
                this.f45035d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f45034c) {
                    case 0:
                        CombinationActivity combinationActivity = this.f45035d;
                        CombinationActivity.a aVar = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity, "this$0");
                        combinationActivity.j();
                        break;
                    case 1:
                        CombinationActivity combinationActivity2 = this.f45035d;
                        CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity2, "this$0");
                        t6.a aVar3 = CombinationActivity.f13210k;
                        if (aVar3 != null) {
                            aVar3.m(System.currentTimeMillis());
                            r rVar = (r) combinationActivity2.f13215g.getValue();
                            Objects.requireNonNull(rVar);
                            ec.a.c(rVar.f45129b.d(aVar3).n(fc.a.f29534b).i(mb.a.a()), new c(combinationActivity2), new d(combinationActivity2, aVar3));
                        }
                        break;
                    case 2:
                        CombinationActivity combinationActivity3 = this.f45035d;
                        CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity3, "this$0");
                        nb.b bVarC = ec.a.c(new wb.h(((d7.g) combinationActivity3.f13216h.getValue()).a().j(com.applovin.exoplayer2.b.z.E), new p6.a(i.f45058c, 23)).n(fc.a.f29534b).i(mb.a.a()), j.f45086c, new l(true, combinationActivity3));
                        nb.a aVar5 = combinationActivity3.f13214f;
                        fd.j0.j(aVar5, "compositeDisposable");
                        aVar5.a(bVarC);
                        break;
                    case 3:
                        CombinationActivity combinationActivity4 = this.f45035d;
                        CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity4, "this$0");
                        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                        Context context = view.getContext();
                        fd.j0.h(context, "it.context");
                        t6.a aVar7 = CombinationActivity.f13210k;
                        companion.showRepeatCountDialog(context, aVar7 != null ? aVar7.e() : 0L, new e(combinationActivity4));
                        break;
                    case 4:
                        CombinationActivity combinationActivity5 = this.f45035d;
                        CombinationActivity.a aVar8 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity5, "this$0");
                        ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                        Context context2 = view.getContext();
                        fd.j0.h(context2, "it.context");
                        t6.a aVar9 = CombinationActivity.f13210k;
                        companion2.showPauseBeforeRepeatDialog(context2, aVar9 != null ? aVar9.f() : 0L, new f(combinationActivity5));
                        break;
                    default:
                        CombinationActivity combinationActivity6 = this.f45035d;
                        CombinationActivity.a aVar10 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity6, "this$0");
                        combinationActivity6.startActivity(new Intent(combinationActivity6, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i14 = 5;
        ((FrameLayout) _$_findCachedViewById(R.id.combinePlaybackAppSettings)).setOnClickListener(new View.OnClickListener(this, i14) { // from class: z6.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f45034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CombinationActivity f45035d;

            {
                this.f45034c = i14;
                if (i14 == 1 || i14 == 2 || i14 != 3) {
                }
                this.f45035d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f45034c) {
                    case 0:
                        CombinationActivity combinationActivity = this.f45035d;
                        CombinationActivity.a aVar = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity, "this$0");
                        combinationActivity.j();
                        break;
                    case 1:
                        CombinationActivity combinationActivity2 = this.f45035d;
                        CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity2, "this$0");
                        t6.a aVar3 = CombinationActivity.f13210k;
                        if (aVar3 != null) {
                            aVar3.m(System.currentTimeMillis());
                            r rVar = (r) combinationActivity2.f13215g.getValue();
                            Objects.requireNonNull(rVar);
                            ec.a.c(rVar.f45129b.d(aVar3).n(fc.a.f29534b).i(mb.a.a()), new c(combinationActivity2), new d(combinationActivity2, aVar3));
                        }
                        break;
                    case 2:
                        CombinationActivity combinationActivity3 = this.f45035d;
                        CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity3, "this$0");
                        nb.b bVarC = ec.a.c(new wb.h(((d7.g) combinationActivity3.f13216h.getValue()).a().j(com.applovin.exoplayer2.b.z.E), new p6.a(i.f45058c, 23)).n(fc.a.f29534b).i(mb.a.a()), j.f45086c, new l(true, combinationActivity3));
                        nb.a aVar5 = combinationActivity3.f13214f;
                        fd.j0.j(aVar5, "compositeDisposable");
                        aVar5.a(bVarC);
                        break;
                    case 3:
                        CombinationActivity combinationActivity4 = this.f45035d;
                        CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity4, "this$0");
                        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                        Context context = view.getContext();
                        fd.j0.h(context, "it.context");
                        t6.a aVar7 = CombinationActivity.f13210k;
                        companion.showRepeatCountDialog(context, aVar7 != null ? aVar7.e() : 0L, new e(combinationActivity4));
                        break;
                    case 4:
                        CombinationActivity combinationActivity5 = this.f45035d;
                        CombinationActivity.a aVar8 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity5, "this$0");
                        ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                        Context context2 = view.getContext();
                        fd.j0.h(context2, "it.context");
                        t6.a aVar9 = CombinationActivity.f13210k;
                        companion2.showPauseBeforeRepeatDialog(context2, aVar9 != null ? aVar9.f() : 0L, new f(combinationActivity5));
                        break;
                    default:
                        CombinationActivity combinationActivity6 = this.f45035d;
                        CombinationActivity.a aVar10 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity6, "this$0");
                        combinationActivity6.startActivity(new Intent(combinationActivity6, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i15 = 2;
        ((FloatingActionButton) _$_findCachedViewById(R.id.addFabButton)).setOnClickListener(new View.OnClickListener(this, i15) { // from class: z6.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f45034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CombinationActivity f45035d;

            {
                this.f45034c = i15;
                if (i15 == 1 || i15 == 2 || i15 != 3) {
                }
                this.f45035d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f45034c) {
                    case 0:
                        CombinationActivity combinationActivity = this.f45035d;
                        CombinationActivity.a aVar = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity, "this$0");
                        combinationActivity.j();
                        break;
                    case 1:
                        CombinationActivity combinationActivity2 = this.f45035d;
                        CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity2, "this$0");
                        t6.a aVar3 = CombinationActivity.f13210k;
                        if (aVar3 != null) {
                            aVar3.m(System.currentTimeMillis());
                            r rVar = (r) combinationActivity2.f13215g.getValue();
                            Objects.requireNonNull(rVar);
                            ec.a.c(rVar.f45129b.d(aVar3).n(fc.a.f29534b).i(mb.a.a()), new c(combinationActivity2), new d(combinationActivity2, aVar3));
                        }
                        break;
                    case 2:
                        CombinationActivity combinationActivity3 = this.f45035d;
                        CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity3, "this$0");
                        nb.b bVarC = ec.a.c(new wb.h(((d7.g) combinationActivity3.f13216h.getValue()).a().j(com.applovin.exoplayer2.b.z.E), new p6.a(i.f45058c, 23)).n(fc.a.f29534b).i(mb.a.a()), j.f45086c, new l(true, combinationActivity3));
                        nb.a aVar5 = combinationActivity3.f13214f;
                        fd.j0.j(aVar5, "compositeDisposable");
                        aVar5.a(bVarC);
                        break;
                    case 3:
                        CombinationActivity combinationActivity4 = this.f45035d;
                        CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity4, "this$0");
                        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                        Context context = view.getContext();
                        fd.j0.h(context, "it.context");
                        t6.a aVar7 = CombinationActivity.f13210k;
                        companion.showRepeatCountDialog(context, aVar7 != null ? aVar7.e() : 0L, new e(combinationActivity4));
                        break;
                    case 4:
                        CombinationActivity combinationActivity5 = this.f45035d;
                        CombinationActivity.a aVar8 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity5, "this$0");
                        ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                        Context context2 = view.getContext();
                        fd.j0.h(context2, "it.context");
                        t6.a aVar9 = CombinationActivity.f13210k;
                        companion2.showPauseBeforeRepeatDialog(context2, aVar9 != null ? aVar9.f() : 0L, new f(combinationActivity5));
                        break;
                    default:
                        CombinationActivity combinationActivity6 = this.f45035d;
                        CombinationActivity.a aVar10 = CombinationActivity.f13209j;
                        fd.j0.i(combinationActivity6, "this$0");
                        combinationActivity6.startActivity(new Intent(combinationActivity6, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        i();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13214f.d();
    }
}
