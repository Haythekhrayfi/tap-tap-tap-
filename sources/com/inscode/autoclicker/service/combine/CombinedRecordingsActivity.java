package com.inscode.autoclicker.service.combine;

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
import com.applovin.exoplayer2.b.z;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import r6.o;
import uc.p;
import vc.b0;
import y6.a1;
import y6.l0;
import y6.s;
import z6.a0;
import z6.d0;
import z6.e0;
import z6.f0;
import z6.r;
import z6.v;
import z6.x;
import z6.y;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinedRecordingsActivity extends BaseActivity {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f13231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13232m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t6.a f13234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BaseAdapter<t6.a> f13236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f13237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nb.a f13238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f13239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<t6.a> f13240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<Integer, View> f13241k = new LinkedHashMap();

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements p<View, t6.a, w> {
        public b() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, t6.a aVar) {
            View view2 = view;
            t6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "item");
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            ((TextView) view2.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar2.g())));
            ((ImageView) view2.findViewById(R.id.itemSettingsDelete)).setOnClickListener(new a1(CombinedRecordingsActivity.this, view2, aVar2));
            return w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<t6.a, w> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public w invoke(t6.a aVar) {
            t6.a aVar2 = aVar;
            j0.i(aVar2, "it");
            if (aVar2.d().isEmpty()) {
                u1.a.s(CombinedRecordingsActivity.this, R.string.combination_error, 0, 2);
            } else {
                CombinedRecordingsActivity combinedRecordingsActivity = CombinedRecordingsActivity.this;
                int i10 = CombinedRecordingsActivity.f13231l;
                combinedRecordingsActivity.h().c(aVar2);
                CombinedRecordingsActivity.this.finish();
            }
            return w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<List<? extends t6.a>, w> {
        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // uc.l
        public w invoke(List<? extends t6.a> list) {
            List<? extends t6.a> list2 = list;
            CombinedRecordingsActivity combinedRecordingsActivity = CombinedRecordingsActivity.this;
            j0.h(list2, "it");
            combinedRecordingsActivity.f13240j = list2;
            return w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<List<? extends t6.a>, List<? extends t6.a>> {
        public e() {
            super(1);
        }

        @Override // uc.l
        public List<? extends t6.a> invoke(List<? extends t6.a> list) {
            List<? extends t6.a> list2 = list;
            j0.i(list2, "it");
            CombinedRecordingsActivity combinedRecordingsActivity = CombinedRecordingsActivity.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (u.x(((t6.a) obj).getName(), combinedRecordingsActivity.f13235e, false, 2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public static final class f extends vc.l implements uc.l<List<? extends t6.a>, List<? extends t6.a>> {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13247a;

            static {
                int[] iArr = new int[o.values().length];
                try {
                    iArr[o.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13247a = iArr;
            }
        }

        public f() {
            super(1);
        }

        @Override // uc.l
        public List<? extends t6.a> invoke(List<? extends t6.a> list) {
            Comparator vVar;
            List<? extends t6.a> list2 = list;
            j0.i(list2, "it");
            CombinedRecordingsActivity combinedRecordingsActivity = CombinedRecordingsActivity.this;
            int i10 = CombinedRecordingsActivity.f13231l;
            int i11 = a.f13247a[combinedRecordingsActivity.getAppSettings().k().ordinal()];
            if (i11 == 1) {
                vVar = CombinedRecordingsActivity.this.getAppSettings().j() == r6.n.UPDATE_DATE ? new v() : new z6.w();
            } else {
                if (i11 != 2) {
                    throw new jc.g();
                }
                vVar = CombinedRecordingsActivity.this.getAppSettings().j() == r6.n.UPDATE_DATE ? new x() : new y();
            }
            return t.C(list2, vVar);
        }
    }

    public static final class g extends vc.l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f13248c = new g();

        public g() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            j0.i(th, "it");
            return w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.l<List<? extends t6.a>, w> {
        public h() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<? extends t6.a> list) {
            List<? extends t6.a> list2 = list;
            CombinedRecordingsActivity combinedRecordingsActivity = CombinedRecordingsActivity.this;
            j0.h(list2, "it");
            int i10 = CombinedRecordingsActivity.f13231l;
            ((RecyclerView) combinedRecordingsActivity._$_findCachedViewById(R.id.loadCombinationsList)).setNestedScrollingEnabled(false);
            ((RecyclerView) combinedRecordingsActivity._$_findCachedViewById(R.id.loadCombinationsList)).setLayoutManager(new LinearLayoutManager(combinedRecordingsActivity));
            ((RecyclerView) combinedRecordingsActivity._$_findCachedViewById(R.id.loadCombinationsList)).setAdapter(combinedRecordingsActivity.f13236f);
            combinedRecordingsActivity.f13236f.setAll(list2);
            return w.f31842a;
        }
    }

    public static final class i extends vc.l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f13250c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            j0.i(th, "it");
            return w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.l<Boolean, w> {
        public j() {
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
                CombinedRecordingsActivity.this.startActivityForResult(intent, CombinedRecordingsActivity.f13231l);
            }
            return w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.a<s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13255f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13252c = componentCallbacks;
            this.f13253d = str;
            this.f13254e = aVar;
            this.f13255f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.s] */
        @Override // uc.a
        public final s invoke() {
            return fd.f.d(this.f13252c).f37311a.c(new yd.h(this.f13253d, b0.a(s.class), this.f13254e, this.f13255f));
        }
    }

    public static final class l extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13259f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13256c = componentCallbacks;
            this.f13257d = str;
            this.f13258e = aVar;
            this.f13259f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return fd.f.d(this.f13256c).f37311a.c(new yd.h(this.f13257d, b0.a(r6.e.class), this.f13258e, this.f13259f));
        }
    }

    public static final class m extends vc.l implements uc.a<r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13263f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13260c = componentCallbacks;
            this.f13261d = str;
            this.f13262e = aVar;
            this.f13263f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, z6.r] */
        @Override // uc.a
        public final r invoke() {
            return fd.f.d(this.f13260c).f37311a.c(new yd.h(this.f13261d, b0.a(r.class), this.f13262e, this.f13263f));
        }
    }

    public static final class n implements TextWatcher {
        public n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            if (j0.d(strValueOf, CombinedRecordingsActivity.this.f13235e)) {
                return;
            }
            CombinedRecordingsActivity combinedRecordingsActivity = CombinedRecordingsActivity.this;
            combinedRecordingsActivity.f13235e = strValueOf;
            combinedRecordingsActivity.i(false);
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
        f13231l = 1;
        f13232m = 2;
    }

    public CombinedRecordingsActivity() {
        ae.b bVar = ae.b.f348c;
        this.f13233c = jc.f.b(new k(this, "", null, bVar));
        this.f13235e = "";
        this.f13236f = new BaseAdapter.Builder().layoutId(R.layout.item_settings).onBind(new b()).onItemClick(new c()).build();
        this.f13237g = jc.f.b(new l(this, "", null, bVar));
        this.f13238h = new nb.a();
        this.f13239i = jc.f.b(new m(this, "", null, bVar));
        this.f13240j = kc.w.f32009c;
    }

    public static final void g(CombinedRecordingsActivity combinedRecordingsActivity, String str) {
        Objects.requireNonNull(combinedRecordingsActivity);
        u1.a.t(combinedRecordingsActivity, str, 0, 2);
    }

    public static /* synthetic */ void j(CombinedRecordingsActivity combinedRecordingsActivity, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        combinedRecordingsActivity.i(z10);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13241k.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13241k;
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
        return (r6.e) this.f13237g.getValue();
    }

    public final r h() {
        return (r) this.f13239i.getValue();
    }

    public final void i(boolean z10) {
        nb.b bVarC = ec.a.c(new wb.a(new l0(z10, this)).j(z.F).h(new p6.a(new e(), 24)).h(new p6.a(new f(), 25)).n(fc.a.f29534b).i(mb.a.a()), g.f13248c, new h());
        p6.b.a(bVarC, "$receiver", this.f13238h, "compositeDisposable", bVarC);
    }

    public final void k() {
        nb.b bVarE = ec.a.e(lb.i.n(Boolean.TRUE).p(mb.a.a()), i.f13250c, null, new j(), 2);
        nb.a aVar = this.f13238h;
        j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
    }

    public final boolean l() {
        if (ma.h.f33410y.a().i()) {
            return true;
        }
        u1.a.o(this, R.string.import_export_pro, -2).setAction(getString(R.string.buy_pro), new z6.s(this, 5)).show();
        return false;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_combined_recordings;
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1) {
            if (i10 == f13231l) {
                List<File> listC = defpackage.b.c(intent, this);
                if (listC != null) {
                    nb.b bVarC = ec.a.c(lb.i.l(listC).k(new p6.a(new d0(this), 26)).y().n(fc.a.f29534b).i(mb.a.a()), e0.f45047c, new f0(this));
                    p6.b.a(bVarC, "$receiver", this.f13238h, "compositeDisposable", bVarC);
                    return;
                }
                return;
            }
            if (i10 == f13232m) {
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || this.f13234d == null) {
                    return;
                }
                s sVar = (s) this.f13233c.getValue();
                t6.a aVar = this.f13234d;
                j0.f(aVar);
                t6.a aVar2 = this.f13234d;
                j0.f(aVar2);
                nb.b bVarC2 = ec.a.c(sVar.b(this, data, aVar, aVar2.getName(), "combination").n(fc.a.f29534b).i(mb.a.a()), new z6.z(this), new a0(this));
                p6.b.a(bVarC2, "$receiver", this.f13238h, "compositeDisposable", bVarC2);
            }
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i(false);
        ((Button) _$_findCachedViewById(R.id.loadSettingsImport)).setOnClickListener(new z6.s(this, 0));
        ((FloatingActionButton) _$_findCachedViewById(R.id.addFabButton)).setOnClickListener(new z6.s(this, 4));
        updateUi();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13238h.d();
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onResume() {
        super.onResume();
        i(false);
    }

    public final void updateUi() {
        i(false);
        ((ImageView) _$_findCachedViewById(R.id.resetSearchQueryButton)).setOnClickListener(new z6.s(this, 1));
        ((ImageView) _$_findCachedViewById(R.id.sortingByButton)).setOnClickListener(new z6.s(this, 2));
        ((ImageView) _$_findCachedViewById(R.id.sortingOrderButton)).setOnClickListener(new z6.s(this, 3));
        EditText editText = (EditText) _$_findCachedViewById(R.id.searchField);
        j0.h(editText, "searchField");
        editText.addTextChangedListener(new n());
    }
}
