package com.inscode.autoclicker.service;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.base.BaseAdapter;
import ed.u;
import fd.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import kc.t;
import org.joda.time.DateTime;
import vc.b0;
import y6.a1;
import y6.l0;
import y6.m0;
import y6.n0;
import y6.o0;
import y6.p0;
import y6.q0;
import y6.r0;
import y6.s;
import y6.u0;
import y6.v0;
import y6.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class ManualSettingsLoadActivity extends BaseActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f13135o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u6.a f13137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BaseAdapter<u6.a> f13139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f13140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jc.e f13141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nb.a f13142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jc.e f13143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jc.e f13144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<u6.a> f13145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map<Integer, View> f13146m = new LinkedHashMap();

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.l<List<? extends u6.a>, w> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // uc.l
        public w invoke(List<? extends u6.a> list) {
            List<? extends u6.a> list2 = list;
            ManualSettingsLoadActivity manualSettingsLoadActivity = ManualSettingsLoadActivity.this;
            j0.h(list2, "it");
            manualSettingsLoadActivity.f13145l = list2;
            return w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<List<? extends u6.a>, List<? extends u6.a>> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public List<? extends u6.a> invoke(List<? extends u6.a> list) {
            List<? extends u6.a> list2 = list;
            j0.i(list2, "it");
            ManualSettingsLoadActivity manualSettingsLoadActivity = ManualSettingsLoadActivity.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (u.x(((u6.a) obj).getName(), manualSettingsLoadActivity.f13138e, false, 2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public static final class d extends vc.l implements uc.l<List<? extends u6.a>, List<? extends u6.a>> {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13150a;

            static {
                int[] iArr = new int[r6.o.values().length];
                try {
                    iArr[r6.o.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r6.o.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13150a = iArr;
            }
        }

        public d() {
            super(1);
        }

        @Override // uc.l
        public List<? extends u6.a> invoke(List<? extends u6.a> list) {
            Comparator m0Var;
            List<? extends u6.a> list2 = list;
            j0.i(list2, "it");
            ManualSettingsLoadActivity manualSettingsLoadActivity = ManualSettingsLoadActivity.this;
            int i10 = ManualSettingsLoadActivity.f13134n;
            int i11 = a.f13150a[manualSettingsLoadActivity.getAppSettings().k().ordinal()];
            if (i11 == 1) {
                m0Var = ManualSettingsLoadActivity.this.getAppSettings().j() == r6.n.UPDATE_DATE ? new m0() : new n0();
            } else {
                if (i11 != 2) {
                    throw new jc.g();
                }
                m0Var = ManualSettingsLoadActivity.this.getAppSettings().j() == r6.n.UPDATE_DATE ? new o0() : new p0();
            }
            return t.C(list2, m0Var);
        }
    }

    public static final class e extends vc.l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f13151c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "it", "[MANUAL_SETTINGS] [ERROR] (load) ", th2, ' ')), new Object[0]);
            return w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.l<List<? extends u6.a>, w> {
        public f() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<? extends u6.a> list) {
            List<? extends u6.a> list2 = list;
            ManualSettingsLoadActivity manualSettingsLoadActivity = ManualSettingsLoadActivity.this;
            j0.h(list2, "it");
            int i10 = ManualSettingsLoadActivity.f13134n;
            ((RecyclerView) manualSettingsLoadActivity._$_findCachedViewById(R.id.loadSettingsList)).setLayoutManager(new LinearLayoutManager(manualSettingsLoadActivity));
            ((RecyclerView) manualSettingsLoadActivity._$_findCachedViewById(R.id.loadSettingsList)).setAdapter(manualSettingsLoadActivity.f13139f);
            manualSettingsLoadActivity.f13139f.setAll(list2);
            return w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.a<l7.a> {
        public g() {
            super(0);
        }

        @Override // uc.a
        public l7.a invoke() {
            return new l7.a(ManualSettingsLoadActivity.this);
        }
    }

    public static final class h extends vc.l implements uc.p<View, u6.a, w> {
        public h() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, u6.a aVar) {
            View view2 = view;
            u6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "item");
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            ((TextView) view2.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar2.i())));
            ((ImageView) view2.findViewById(R.id.itemSettingsDelete)).setOnClickListener(new a1(ManualSettingsLoadActivity.this, view2, aVar2));
            return w.f31842a;
        }
    }

    public static final class i extends vc.l implements uc.l<u6.a, w> {
        public i() {
            super(1);
        }

        @Override // uc.l
        public w invoke(u6.a aVar) {
            u6.a aVar2 = aVar;
            j0.i(aVar2, "it");
            ManualSettingsLoadActivity manualSettingsLoadActivity = ManualSettingsLoadActivity.this;
            int i10 = ManualSettingsLoadActivity.f13134n;
            manualSettingsLoadActivity.i().c(aVar2);
            ManualSettingsLoadActivity.this.finish();
            return w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f13156c = new j();

        public j() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            j0.i(th, "it");
            return w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.l<Boolean, w> {
        public k() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Boolean bool) {
            Boolean bool2 = bool;
            j0.h(bool2, "granted");
            if (bool2.booleanValue()) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                ma.h.f33410y.a().j();
                ManualSettingsLoadActivity.this.startActivityForResult(intent, ManualSettingsLoadActivity.f13134n);
            }
            return w.f31842a;
        }
    }

    public static final class l extends vc.l implements uc.a<s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13161f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13158c = componentCallbacks;
            this.f13159d = str;
            this.f13160e = aVar;
            this.f13161f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.s] */
        @Override // uc.a
        public final s invoke() {
            return fd.f.d(this.f13158c).f37311a.c(new yd.h(this.f13159d, b0.a(s.class), this.f13160e, this.f13161f));
        }
    }

    public static final class m extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13162c = componentCallbacks;
            this.f13163d = str;
            this.f13164e = aVar;
            this.f13165f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return fd.f.d(this.f13162c).f37311a.c(new yd.h(this.f13163d, b0.a(r6.e.class), this.f13164e, this.f13165f));
        }
    }

    public static final class n extends vc.l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13166c = componentCallbacks;
            this.f13167d = str;
            this.f13168e = aVar;
            this.f13169f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return fd.f.d(this.f13166c).f37311a.c(new yd.h(this.f13167d, b0.a(q6.b.class), this.f13168e, this.f13169f));
        }
    }

    public static final class o extends vc.l implements uc.a<a7.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13170c = componentCallbacks;
            this.f13171d = str;
            this.f13172e = aVar;
            this.f13173f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [a7.a, java.lang.Object] */
        @Override // uc.a
        public final a7.a invoke() {
            return fd.f.d(this.f13170c).f37311a.c(new yd.h(this.f13171d, b0.a(a7.a.class), this.f13172e, this.f13173f));
        }
    }

    public static final class p implements TextWatcher {
        public p() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            if (j0.d(strValueOf, ManualSettingsLoadActivity.this.f13138e)) {
                return;
            }
            ManualSettingsLoadActivity manualSettingsLoadActivity = ManualSettingsLoadActivity.this;
            manualSettingsLoadActivity.f13138e = strValueOf;
            manualSettingsLoadActivity.j(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static {
        new a(null);
        f13134n = 1;
        f13135o = 2;
    }

    public ManualSettingsLoadActivity() {
        ae.b bVar = ae.b.f348c;
        this.f13136c = jc.f.b(new l(this, "", null, bVar));
        this.f13138e = "";
        this.f13139f = new BaseAdapter.Builder().layoutId(R.layout.item_settings).onBind(new h()).onItemClick(new i()).build();
        this.f13140g = jc.f.b(new m(this, "", null, bVar));
        this.f13141h = jc.f.b(new n(this, "", null, bVar));
        this.f13142i = new nb.a();
        this.f13143j = jc.f.b(new g());
        this.f13144k = jc.f.b(new o(this, "", null, bVar));
        this.f13145l = kc.w.f32009c;
    }

    public static void g(ManualSettingsLoadActivity manualSettingsLoadActivity, View view) {
        j0.i(manualSettingsLoadActivity, "this$0");
        super.onBackPressed();
    }

    public static final void h(ManualSettingsLoadActivity manualSettingsLoadActivity, String str) {
        Objects.requireNonNull(manualSettingsLoadActivity);
        u1.a.t(manualSettingsLoadActivity, str, 0, 2);
    }

    public static /* synthetic */ void k(ManualSettingsLoadActivity manualSettingsLoadActivity, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        manualSettingsLoadActivity.j(z10);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13146m.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13146m;
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

    public final r6.e getAppSettings() {
        return (r6.e) this.f13140g.getValue();
    }

    public final a7.a i() {
        return (a7.a) this.f13144k.getValue();
    }

    public final void j(boolean z10) {
        nb.b bVarC = ec.a.c(new wb.a(new l0(z10, this)).j(i5.a.f31252h).h(new p6.a(new c(), 14)).h(new p6.a(new d(), 15)).n(fc.a.f29534b).i(mb.a.a()), e.f13151c, new f());
        p6.b.a(bVarC, "$receiver", this.f13142i, "compositeDisposable", bVarC);
    }

    public final void l() {
        nb.b bVarE = ec.a.e(lb.i.n(Boolean.TRUE).p(mb.a.a()), j.f13156c, null, new k(), 2);
        nb.a aVar = this.f13142i;
        j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_manual_load_settings;
    }

    public final boolean m() {
        if (ma.h.f33410y.a().i()) {
            return true;
        }
        u1.a.o(this, R.string.import_export_pro, -2).setAction(getString(R.string.buy_pro), new y6.j0(this, 5)).show();
        return false;
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1) {
            if (i10 == f13134n) {
                List<File> listC = defpackage.b.c(intent, this);
                if (listC != null) {
                    nb.b bVarC = ec.a.c(lb.i.l(listC).k(new p6.a(new u0(this), 13)).y().n(fc.a.f29534b).i(mb.a.a()), v0.f38403c, new w0(this));
                    p6.b.a(bVarC, "$receiver", this.f13142i, "compositeDisposable", bVarC);
                    return;
                }
                return;
            }
            if (i10 == f13135o) {
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || this.f13137d == null) {
                    return;
                }
                s sVar = (s) this.f13136c.getValue();
                u6.a aVar = this.f13137d;
                j0.f(aVar);
                u6.a aVar2 = this.f13137d;
                j0.f(aVar2);
                nb.b bVarC2 = ec.a.c(sVar.b(this, data, aVar, aVar2.getName(), "manual").n(fc.a.f29534b).i(mb.a.a()), new q0(this), new r0(this));
                p6.b.a(bVarC2, "$receiver", this.f13142i, "compositeDisposable", bVarC2);
            }
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j(false);
        ((Button) _$_findCachedViewById(R.id.loadSettingsImport)).setOnClickListener(new y6.j0(this, 4));
        updateUi();
        nb.b bVarE = ec.a.e(((q6.b) this.f13141h.getValue()).f34787g.u(fc.a.f29534b).p(mb.a.a()), null, null, null, 7);
        p6.b.a(bVarE, "$receiver", this.f13142i, "compositeDisposable", bVarE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13142i.d();
    }

    public final void updateUi() {
        ((ImageView) _$_findCachedViewById(R.id.backButton)).setOnClickListener(new y6.j0(this, 0));
        ((ImageView) _$_findCachedViewById(R.id.resetSearchQueryButton)).setOnClickListener(new y6.j0(this, 1));
        ((ImageView) _$_findCachedViewById(R.id.sortingByButton)).setOnClickListener(new y6.j0(this, 2));
        ((ImageView) _$_findCachedViewById(R.id.sortingOrderButton)).setOnClickListener(new y6.j0(this, 3));
        EditText editText = (EditText) _$_findCachedViewById(R.id.searchField);
        j0.h(editText, "searchField");
        editText.addTextChangedListener(new p());
    }
}
